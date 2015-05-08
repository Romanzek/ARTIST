/*
 * generated by Xtext
 */
package eu.artist.postmigration.nfrvt.lang.gml.validation

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Expression
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.LiteralValueExpression
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification
import eu.artist.postmigration.nfrvt.lang.common.eval.ExpressionValidator
import eu.artist.postmigration.nfrvt.lang.common.eval.util.ValueUtil
import eu.artist.postmigration.nfrvt.lang.gml.gml.CompositeGoal
import eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalExpression
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalReference
import eu.artist.postmigration.nfrvt.lang.gml.gml.HardGoal
import eu.artist.postmigration.nfrvt.lang.gml.renderer.GMLTextRenderer
import java.util.HashSet
import java.util.Set
import org.eclipse.xtext.validation.Check

//import org.eclipse.xtext.validation.Check

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class GMLValidator extends AbstractGMLValidator {

	public static final String DETERMINISTIC_VALUE = "DETERMINISTIC_VALUE";
	public static final String UNNECESSARY_GOAL = "UNNECESSARY_GOAL";
	public static final String NON_MATCHING_TYPES = "NON_MATCHING_TYPES";
	
	protected GMLTextRenderer renderer = new GMLTextRenderer();

	CompositeGoalValidator compositeGoalValidator = new CompositeGoalValidator();
	HardGoalValidator hardGoalConditionValidator = new HardGoalValidator();

	override protected getEPackages() {
		val result = super.getEPackages()
		result.add(ArtistCommonPackage.eINSTANCE)
		return result
	}

	def showAll(ExpressionValidator validator) {
		validator.errors.forEach[msg, feature| error(msg, feature)]
		validator.warnings.forEach[msg, feature| warning(msg, feature)]
		validator.infos.forEach[msg, feature| info(msg, feature)]
		validator.reset
	}

	@Check
	def validCompositeGoalExpression(CompositeGoal goal) {
		val result = compositeGoalValidator.doEvaluate(goal.condition);
		compositeGoalValidator.showAll
		if(!ValueUtil.isBooleanOrNull(result))
			error("Condition does not return a boolean value.", GmlPackage.Literals.COMPOSITE_GOAL__CONDITION)
		if(goal.condition instanceof LiteralValueExpression)
			warning(
				"Goal '" + goal.name + "' always returns " + ValueUtil.getBooleanOrNull(result), 
				GmlPackage.Literals.COMPOSITE_GOAL__CONDITION,
				UNNECESSARY_GOAL,
				"composite")
//		val variableExpressions = goal.condition.eAllContents.filter(typeof(GoalReference)).toList
//		if(ValueUtil.isBooleanOrNull(result) && variableExpressions.empty)
//			warning(
//				"No references to any goals found, always returns " + ValueUtil.getBooleanOrNull(result) + ".", 
//				GmlPackage.Literals.COMPOSITE_GOAL__CONDITION,
//				DETERMINISTIC_VALUE,
//				ValueUtil.getBooleanOrNull(result).toString);
	}
	
	@Check
	def comparableExpression(Expression e) {
		if(e instanceof ValueSpecification)
			return;
			
		try {
			val comparableValidator = new ComparableValidator();
			comparableValidator.doEvaluate(e)
			comparableValidator.errors.forEach[msg, feature| error(msg, e.eContainer, e.eContainingFeature)]
			comparableValidator.warnings.forEach[msg, feature| warning(msg, e.eContainer, e.eContainingFeature)]
			comparableValidator.infos.forEach[msg, feature| info(msg, e.eContainer, e.eContainingFeature)]
			comparableValidator.reset
			comparableValidator.showAll
		} catch(Exception ex) {
			System.out.println(ex)
		}
	}
	
	@Check
	def usefulExpression(Expression e) {
		if(e instanceof ValueSpecification)
			return;
		
		var ValueSpecification result = null
		if(e instanceof GoalExpression)
			result = compositeGoalValidator.doEvaluate(e)
		else
			result = hardGoalConditionValidator.doEvaluate(e)
			
		hardGoalConditionValidator.showAll
		if(result != null) {
			warning(
				"Expression '" + renderer.doRender(e) + "' always returns " + renderer.doRender(result) + ".",
				e.eContainer,
				e.eContainingFeature,
				DETERMINISTIC_VALUE,
				renderer.doRender(result))
		}
	}
	
	@Check
	def validHardGoalCondition(HardGoal goal) {
		val result = hardGoalConditionValidator.doEvaluate(goal.condition);
		hardGoalConditionValidator.showAll
		if(!ValueUtil.isBooleanOrNull(result))
			error("Condition does not return a boolean value.", GmlPackage.Literals.HARD_GOAL__CONDITION)
		if(goal.condition instanceof LiteralValueExpression)
			warning(
				"Goal '" + goal.name + "' always returns " + ValueUtil.getBooleanOrNull(result), 
				GmlPackage.Literals.HARD_GOAL__CONDITION,
				UNNECESSARY_GOAL,
				"hardgoal")
//		val variableExpressions = goal.condition.eAllContents.filter(typeof(AppliedQuantitativePropertyExpression)).toList
//		if(ValueUtil.isBooleanOrNull(result) && variableExpressions.empty)
//			warning(
//				"No $variables used in this condition, always returns " + ValueUtil.getBooleanOrNull(result) + ".", 
//				GmlPackage.Literals.HARD_GOAL__CONDITION,
//				DETERMINISTIC_VALUE,
//				ValueUtil.getBooleanOrNull(result).toString)
	}
/*	
	@Check
	def infoAppliedProperty(AppliedQuantitativePropertyExpression exp) {
		info("Please make sure that " + exp.value.property.name + " has a compatible data type for the expression.", GmlPackage.Literals.APPLIED_QUANTITATIVE_PROPERTY_EXPRESSION__VALUE);
	}
 */	
	@Check
	def circularReferenceCompositeGoalExpression(CompositeGoal goal) {
		if(goal.checkCircle(new HashSet<CompositeGoal>()))
			error("Found circular reference in condition.", GmlPackage.Literals.COMPOSITE_GOAL__CONDITION)		
	}
	
	def boolean checkCircle(CompositeGoal goal, Set<CompositeGoal> foundGoals) {
		foundGoals.add(goal)
		val cgs = goal.goalReferences
		if(goal.condition instanceof GoalReference && (goal.condition as GoalReference).value instanceof CompositeGoal)
			cgs.add((goal.condition as GoalReference).value as CompositeGoal)
		val circle = cgs.filter[cg | foundGoals.contains(cg)]
		if(circle.empty) {
			foundGoals.addAll(cgs)
			var foundCircle = false
			for(cg : cgs) {
				foundCircle = cg.checkCircle(foundGoals)
				if(foundCircle) {
					return true
				}
			}
			return false
		}
		return true
	}
	
	def goalReferences(CompositeGoal goal) {
		return goal.condition.eAllContents.filter(typeof(GoalReference)).map[e | e.value].filter(typeof(CompositeGoal)).toSet
	}
}
