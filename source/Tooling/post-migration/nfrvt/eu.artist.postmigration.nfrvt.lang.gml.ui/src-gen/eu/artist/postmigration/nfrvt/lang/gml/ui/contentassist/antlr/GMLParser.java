/*
* generated by Xtext
*/
package eu.artist.postmigration.nfrvt.lang.gml.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import eu.artist.postmigration.nfrvt.lang.gml.services.GMLGrammarAccess;

public class GMLParser extends AbstractContentAssistParser {
	
	@Inject
	private GMLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected eu.artist.postmigration.nfrvt.lang.gml.ui.contentassist.antlr.internal.InternalGMLParser createParser() {
		eu.artist.postmigration.nfrvt.lang.gml.ui.contentassist.antlr.internal.InternalGMLParser result = new eu.artist.postmigration.nfrvt.lang.gml.ui.contentassist.antlr.internal.InternalGMLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAppliedPropertyAccess().getAlternatives(), "rule__AppliedProperty__Alternatives");
					put(grammarAccess.getAppliedQuantitativePropertyAccess().getFunctionAlternatives_5_2_0(), "rule__AppliedQuantitativeProperty__FunctionAlternatives_5_2_0");
					put(grammarAccess.getGoalAccess().getAlternatives(), "rule__Goal__Alternatives");
					put(grammarAccess.getGoalDisjunctionAccess().getOperatorAlternatives_1_1_0(), "rule__GoalDisjunction__OperatorAlternatives_1_1_0");
					put(grammarAccess.getGoalComparisonAccess().getOperatorAlternatives_1_1_0(), "rule__GoalComparison__OperatorAlternatives_1_1_0");
					put(grammarAccess.getGoalBooleanUnitAccess().getAlternatives(), "rule__GoalBooleanUnit__Alternatives");
					put(grammarAccess.getNumberExpressionAccess().getAlternatives(), "rule__NumberExpression__Alternatives");
					put(grammarAccess.getDisjunctionAccess().getOperatorAlternatives_1_1_0(), "rule__Disjunction__OperatorAlternatives_1_1_0");
					put(grammarAccess.getComparisonAccess().getOperatorAlternatives_1_1_0(), "rule__Comparison__OperatorAlternatives_1_1_0");
					put(grammarAccess.getBooleanUnitAccess().getAlternatives(), "rule__BooleanUnit__Alternatives");
					put(grammarAccess.getRelationalExpressionAccess().getAlternatives_1_0(), "rule__RelationalExpression__Alternatives_1_0");
					put(grammarAccess.getComparableExpressionAccess().getAlternatives(), "rule__ComparableExpression__Alternatives");
					put(grammarAccess.getAdditiveExpressionAccess().getOperatorAlternatives_1_1_0(), "rule__AdditiveExpression__OperatorAlternatives_1_1_0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAlternatives_1_1_0(), "rule__MultiplicativeExpression__OperatorAlternatives_1_1_0");
					put(grammarAccess.getNumberFunctionAccess().getAlternatives(), "rule__NumberFunction__Alternatives");
					put(grammarAccess.getValueSpecificationAccess().getAlternatives(), "rule__ValueSpecification__Alternatives");
					put(grammarAccess.getObjectSpecificationExpressionAccess().getAlternatives_1(), "rule__ObjectSpecificationExpression__Alternatives_1");
					put(grammarAccess.getLiteralValueExpressionAccess().getAlternatives(), "rule__LiteralValueExpression__Alternatives");
					put(grammarAccess.getOrOperatorAccess().getAlternatives_1(), "rule__OrOperator__Alternatives_1");
					put(grammarAccess.getXOrOperatorAccess().getAlternatives_1(), "rule__XOrOperator__Alternatives_1");
					put(grammarAccess.getAndOperatorAccess().getAlternatives_1(), "rule__AndOperator__Alternatives_1");
					put(grammarAccess.getImplicationOperatorAccess().getAlternatives_1(), "rule__ImplicationOperator__Alternatives_1");
					put(grammarAccess.getNotEqualsOperatorAccess().getAlternatives_1(), "rule__NotEqualsOperator__Alternatives_1");
					put(grammarAccess.getNotOperatorAccess().getAlternatives_1(), "rule__NotOperator__Alternatives_1");
					put(grammarAccess.getImportURIorNamespaceAccess().getAlternatives_1(), "rule__ImportURIorNamespace__Alternatives_1");
					put(grammarAccess.getNumberAccess().getAlternatives(), "rule__Number__Alternatives");
					put(grammarAccess.getImpactAccess().getAlternatives(), "rule__Impact__Alternatives");
					put(grammarAccess.getEBooleanObjectAccess().getAlternatives(), "rule__EBooleanObject__Alternatives");
					put(grammarAccess.getGoalKindAccess().getAlternatives(), "rule__GoalKind__Alternatives");
					put(grammarAccess.getGoalModelAccess().getGroup(), "rule__GoalModel__Group__0");
					put(grammarAccess.getGoalModelAccess().getGroup_6(), "rule__GoalModel__Group_6__0");
					put(grammarAccess.getGoalModelAccess().getGroup_6_1(), "rule__GoalModel__Group_6_1__0");
					put(grammarAccess.getGoalModelAccess().getGroup_10(), "rule__GoalModel__Group_10__0");
					put(grammarAccess.getGoalModelAccess().getGroup_10_1(), "rule__GoalModel__Group_10_1__0");
					put(grammarAccess.getGoalModelAccess().getGroup_14(), "rule__GoalModel__Group_14__0");
					put(grammarAccess.getGoalModelAccess().getGroup_14_1(), "rule__GoalModel__Group_14_1__0");
					put(grammarAccess.getWorkloadAccess().getGroup(), "rule__Workload__Group__0");
					put(grammarAccess.getAppliedQualitativePropertyAccess().getGroup(), "rule__AppliedQualitativeProperty__Group__0");
					put(grammarAccess.getAppliedQualitativePropertyAccess().getGroup_5(), "rule__AppliedQualitativeProperty__Group_5__0");
					put(grammarAccess.getAppliedQualitativePropertyAccess().getGroup_5_3(), "rule__AppliedQualitativeProperty__Group_5_3__0");
					put(grammarAccess.getAppliedQualitativePropertyAccess().getGroup_5_3_1(), "rule__AppliedQualitativeProperty__Group_5_3_1__0");
					put(grammarAccess.getAppliedQuantitativePropertyAccess().getGroup(), "rule__AppliedQuantitativeProperty__Group__0");
					put(grammarAccess.getAppliedQuantitativePropertyAccess().getGroup_5(), "rule__AppliedQuantitativeProperty__Group_5__0");
					put(grammarAccess.getAppliedQuantitativePropertyAccess().getGroup_6(), "rule__AppliedQuantitativeProperty__Group_6__0");
					put(grammarAccess.getAppliedQuantitativePropertyAccess().getGroup_6_3(), "rule__AppliedQuantitativeProperty__Group_6_3__0");
					put(grammarAccess.getAppliedQuantitativePropertyAccess().getGroup_6_3_1(), "rule__AppliedQuantitativeProperty__Group_6_3_1__0");
					put(grammarAccess.getAppliedQuantitativePropertyAccess().getGroup_7(), "rule__AppliedQuantitativeProperty__Group_7__0");
					put(grammarAccess.getSoftGoalAccess().getGroup(), "rule__SoftGoal__Group__0");
					put(grammarAccess.getSoftGoalAccess().getGroup_15(), "rule__SoftGoal__Group_15__0");
					put(grammarAccess.getSoftGoalAccess().getGroup_15_4(), "rule__SoftGoal__Group_15_4__0");
					put(grammarAccess.getSoftGoalImpactAccess().getGroup(), "rule__SoftGoalImpact__Group__0");
					put(grammarAccess.getHardGoalAccess().getGroup(), "rule__HardGoal__Group__0");
					put(grammarAccess.getHardGoalAccess().getGroup_11(), "rule__HardGoal__Group_11__0");
					put(grammarAccess.getCompositeGoalAccess().getGroup(), "rule__CompositeGoal__Group__0");
					put(grammarAccess.getGoalImplicationAccess().getGroup(), "rule__GoalImplication__Group__0");
					put(grammarAccess.getGoalImplicationAccess().getGroup_1(), "rule__GoalImplication__Group_1__0");
					put(grammarAccess.getGoalDisjunctionAccess().getGroup(), "rule__GoalDisjunction__Group__0");
					put(grammarAccess.getGoalDisjunctionAccess().getGroup_1(), "rule__GoalDisjunction__Group_1__0");
					put(grammarAccess.getGoalConjunctionAccess().getGroup(), "rule__GoalConjunction__Group__0");
					put(grammarAccess.getGoalConjunctionAccess().getGroup_1(), "rule__GoalConjunction__Group_1__0");
					put(grammarAccess.getGoalComparisonAccess().getGroup(), "rule__GoalComparison__Group__0");
					put(grammarAccess.getGoalComparisonAccess().getGroup_1(), "rule__GoalComparison__Group_1__0");
					put(grammarAccess.getGoalNegationAccess().getGroup(), "rule__GoalNegation__Group__0");
					put(grammarAccess.getGoalReferenceAccess().getGroup(), "rule__GoalReference__Group__0");
					put(grammarAccess.getParenthesizedGoalExpressionAccess().getGroup(), "rule__ParenthesizedGoalExpression__Group__0");
					put(grammarAccess.getAppliedQuantitativePropertyExpressionAccess().getGroup(), "rule__AppliedQuantitativePropertyExpression__Group__0");
					put(grammarAccess.getImplicationAccess().getGroup(), "rule__Implication__Group__0");
					put(grammarAccess.getImplicationAccess().getGroup_1(), "rule__Implication__Group_1__0");
					put(grammarAccess.getDisjunctionAccess().getGroup(), "rule__Disjunction__Group__0");
					put(grammarAccess.getDisjunctionAccess().getGroup_1(), "rule__Disjunction__Group_1__0");
					put(grammarAccess.getConjunctionAccess().getGroup(), "rule__Conjunction__Group__0");
					put(grammarAccess.getConjunctionAccess().getGroup_1(), "rule__Conjunction__Group_1__0");
					put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
					put(grammarAccess.getComparisonAccess().getGroup_1(), "rule__Comparison__Group_1__0");
					put(grammarAccess.getNegationAccess().getGroup(), "rule__Negation__Group__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup(), "rule__RelationalExpression__Group__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup_1(), "rule__RelationalExpression__Group_1__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup_1_0_0(), "rule__RelationalExpression__Group_1_0_0__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup_1_0_1(), "rule__RelationalExpression__Group_1_0_1__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup_1_0_2(), "rule__RelationalExpression__Group_1_0_2__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup_1_0_3(), "rule__RelationalExpression__Group_1_0_3__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup(), "rule__AdditiveExpression__Group__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup_1(), "rule__AdditiveExpression__Group_1__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup(), "rule__MultiplicativeExpression__Group__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1(), "rule__MultiplicativeExpression__Group_1__0");
					put(grammarAccess.getMaximumFunctionAccess().getGroup(), "rule__MaximumFunction__Group__0");
					put(grammarAccess.getMaximumFunctionAccess().getGroup_3(), "rule__MaximumFunction__Group_3__0");
					put(grammarAccess.getMinimumFunctionAccess().getGroup(), "rule__MinimumFunction__Group__0");
					put(grammarAccess.getMinimumFunctionAccess().getGroup_3(), "rule__MinimumFunction__Group_3__0");
					put(grammarAccess.getAverageFunctionAccess().getGroup(), "rule__AverageFunction__Group__0");
					put(grammarAccess.getAverageFunctionAccess().getGroup_3(), "rule__AverageFunction__Group_3__0");
					put(grammarAccess.getSumFunctionAccess().getGroup(), "rule__SumFunction__Group__0");
					put(grammarAccess.getSumFunctionAccess().getGroup_3(), "rule__SumFunction__Group_3__0");
					put(grammarAccess.getExponentialFunctionAccess().getGroup(), "rule__ExponentialFunction__Group__0");
					put(grammarAccess.getAbsoluteFunctionAccess().getGroup(), "rule__AbsoluteFunction__Group__0");
					put(grammarAccess.getNaturalLogarithmFunctionAccess().getGroup(), "rule__NaturalLogarithmFunction__Group__0");
					put(grammarAccess.getCommonLogarithmFunctionAccess().getGroup(), "rule__CommonLogarithmFunction__Group__0");
					put(grammarAccess.getParenthesizedExpressionAccess().getGroup(), "rule__ParenthesizedExpression__Group__0");
					put(grammarAccess.getObjectSpecificationExpressionAccess().getGroup(), "rule__ObjectSpecificationExpression__Group__0");
					put(grammarAccess.getCollectionAccess().getGroup(), "rule__Collection__Group__0");
					put(grammarAccess.getCollectionAccess().getGroup_2(), "rule__Collection__Group_2__0");
					put(grammarAccess.getCollectionAccess().getGroup_2_1(), "rule__Collection__Group_2_1__0");
					put(grammarAccess.getTupleAccess().getGroup(), "rule__Tuple__Group__0");
					put(grammarAccess.getTupleAccess().getGroup_2(), "rule__Tuple__Group_2__0");
					put(grammarAccess.getTupleAccess().getGroup_2_1(), "rule__Tuple__Group_2_1__0");
					put(grammarAccess.getPropertyValuePairAccess().getGroup(), "rule__PropertyValuePair__Group__0");
					put(grammarAccess.getOrOperatorAccess().getGroup(), "rule__OrOperator__Group__0");
					put(grammarAccess.getXOrOperatorAccess().getGroup(), "rule__XOrOperator__Group__0");
					put(grammarAccess.getAndOperatorAccess().getGroup(), "rule__AndOperator__Group__0");
					put(grammarAccess.getImplicationOperatorAccess().getGroup(), "rule__ImplicationOperator__Group__0");
					put(grammarAccess.getEqualsOperatorAccess().getGroup(), "rule__EqualsOperator__Group__0");
					put(grammarAccess.getNotEqualsOperatorAccess().getGroup(), "rule__NotEqualsOperator__Group__0");
					put(grammarAccess.getNotOperatorAccess().getGroup(), "rule__NotOperator__Group__0");
					put(grammarAccess.getGreaterThanOperatorAccess().getGroup(), "rule__GreaterThanOperator__Group__0");
					put(grammarAccess.getGreaterOrEqualThanOperatorAccess().getGroup(), "rule__GreaterOrEqualThanOperator__Group__0");
					put(grammarAccess.getLessThanOperatorAccess().getGroup(), "rule__LessThanOperator__Group__0");
					put(grammarAccess.getLessOrEqualThanOperatorAccess().getGroup(), "rule__LessOrEqualThanOperator__Group__0");
					put(grammarAccess.getAdditionOperatorAccess().getGroup(), "rule__AdditionOperator__Group__0");
					put(grammarAccess.getSubstractionOperatorAccess().getGroup(), "rule__SubstractionOperator__Group__0");
					put(grammarAccess.getMultiplicationOperatorAccess().getGroup(), "rule__MultiplicationOperator__Group__0");
					put(grammarAccess.getDivisionOperatorAccess().getGroup(), "rule__DivisionOperator__Group__0");
					put(grammarAccess.getModulusOperatorAccess().getGroup(), "rule__ModulusOperator__Group__0");
					put(grammarAccess.getMaxOperatorAccess().getGroup(), "rule__MaxOperator__Group__0");
					put(grammarAccess.getMinOperatorAccess().getGroup(), "rule__MinOperator__Group__0");
					put(grammarAccess.getAvgOperatorAccess().getGroup(), "rule__AvgOperator__Group__0");
					put(grammarAccess.getSumOperatorAccess().getGroup(), "rule__SumOperator__Group__0");
					put(grammarAccess.getExponentialOperatorAccess().getGroup(), "rule__ExponentialOperator__Group__0");
					put(grammarAccess.getAbsoluteOperatorAccess().getGroup(), "rule__AbsoluteOperator__Group__0");
					put(grammarAccess.getNaturalLogarithmOperatorAccess().getGroup(), "rule__NaturalLogarithmOperator__Group__0");
					put(grammarAccess.getCommonLogarithmOperatorAccess().getGroup(), "rule__CommonLogarithmOperator__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getImportURIorNamespaceAccess().getGroup(), "rule__ImportURIorNamespace__Group__0");
					put(grammarAccess.getImportURIAccess().getGroup(), "rule__ImportURI__Group__0");
					put(grammarAccess.getImportNamespaceAccess().getGroup(), "rule__ImportNamespace__Group__0");
					put(grammarAccess.getGoalModelAccess().getImportsAssignment_0(), "rule__GoalModel__ImportsAssignment_0");
					put(grammarAccess.getGoalModelAccess().getNameAssignment_2(), "rule__GoalModel__NameAssignment_2");
					put(grammarAccess.getGoalModelAccess().getWorkloadsAssignment_6_0(), "rule__GoalModel__WorkloadsAssignment_6_0");
					put(grammarAccess.getGoalModelAccess().getWorkloadsAssignment_6_1_1(), "rule__GoalModel__WorkloadsAssignment_6_1_1");
					put(grammarAccess.getGoalModelAccess().getAppliedPropertiesAssignment_10_0(), "rule__GoalModel__AppliedPropertiesAssignment_10_0");
					put(grammarAccess.getGoalModelAccess().getAppliedPropertiesAssignment_10_1_1(), "rule__GoalModel__AppliedPropertiesAssignment_10_1_1");
					put(grammarAccess.getGoalModelAccess().getGoalsAssignment_14_0(), "rule__GoalModel__GoalsAssignment_14_0");
					put(grammarAccess.getGoalModelAccess().getGoalsAssignment_14_1_1(), "rule__GoalModel__GoalsAssignment_14_1_1");
					put(grammarAccess.getWorkloadAccess().getNameAssignment_0(), "rule__Workload__NameAssignment_0");
					put(grammarAccess.getWorkloadAccess().getActivityAssignment_3(), "rule__Workload__ActivityAssignment_3");
					put(grammarAccess.getWorkloadAccess().getPatternAssignment_6(), "rule__Workload__PatternAssignment_6");
					put(grammarAccess.getAppliedQualitativePropertyAccess().getNameAssignment_1(), "rule__AppliedQualitativeProperty__NameAssignment_1");
					put(grammarAccess.getAppliedQualitativePropertyAccess().getPropertyAssignment_4(), "rule__AppliedQualitativeProperty__PropertyAssignment_4");
					put(grammarAccess.getAppliedQualitativePropertyAccess().getContextAssignment_5_3_0(), "rule__AppliedQualitativeProperty__ContextAssignment_5_3_0");
					put(grammarAccess.getAppliedQualitativePropertyAccess().getContextAssignment_5_3_1_1(), "rule__AppliedQualitativeProperty__ContextAssignment_5_3_1_1");
					put(grammarAccess.getAppliedQuantitativePropertyAccess().getNameAssignment_1(), "rule__AppliedQuantitativeProperty__NameAssignment_1");
					put(grammarAccess.getAppliedQuantitativePropertyAccess().getPropertyAssignment_4(), "rule__AppliedQuantitativeProperty__PropertyAssignment_4");
					put(grammarAccess.getAppliedQuantitativePropertyAccess().getFunctionAssignment_5_2(), "rule__AppliedQuantitativeProperty__FunctionAssignment_5_2");
					put(grammarAccess.getAppliedQuantitativePropertyAccess().getContextAssignment_6_3_0(), "rule__AppliedQuantitativeProperty__ContextAssignment_6_3_0");
					put(grammarAccess.getAppliedQuantitativePropertyAccess().getContextAssignment_6_3_1_1(), "rule__AppliedQuantitativeProperty__ContextAssignment_6_3_1_1");
					put(grammarAccess.getAppliedQuantitativePropertyAccess().getWorkloadAssignment_7_2(), "rule__AppliedQuantitativeProperty__WorkloadAssignment_7_2");
					put(grammarAccess.getSoftGoalAccess().getNameAssignment_1(), "rule__SoftGoal__NameAssignment_1");
					put(grammarAccess.getSoftGoalAccess().getKindAssignment_4(), "rule__SoftGoal__KindAssignment_4");
					put(grammarAccess.getSoftGoalAccess().getPriorityAssignment_7(), "rule__SoftGoal__PriorityAssignment_7");
					put(grammarAccess.getSoftGoalAccess().getPropertyAssignment_11(), "rule__SoftGoal__PropertyAssignment_11");
					put(grammarAccess.getSoftGoalAccess().getThresholdAssignment_14(), "rule__SoftGoal__ThresholdAssignment_14");
					put(grammarAccess.getSoftGoalAccess().getImpactsAssignment_15_3(), "rule__SoftGoal__ImpactsAssignment_15_3");
					put(grammarAccess.getSoftGoalAccess().getImpactsAssignment_15_4_1(), "rule__SoftGoal__ImpactsAssignment_15_4_1");
					put(grammarAccess.getSoftGoalImpactAccess().getTargetAssignment_0(), "rule__SoftGoalImpact__TargetAssignment_0");
					put(grammarAccess.getSoftGoalImpactAccess().getImpactAssignment_1(), "rule__SoftGoalImpact__ImpactAssignment_1");
					put(grammarAccess.getHardGoalAccess().getNameAssignment_1(), "rule__HardGoal__NameAssignment_1");
					put(grammarAccess.getHardGoalAccess().getKindAssignment_4(), "rule__HardGoal__KindAssignment_4");
					put(grammarAccess.getHardGoalAccess().getPriorityAssignment_7(), "rule__HardGoal__PriorityAssignment_7");
					put(grammarAccess.getHardGoalAccess().getConditionAssignment_10(), "rule__HardGoal__ConditionAssignment_10");
					put(grammarAccess.getHardGoalAccess().getSuccessRateAssignment_11_2(), "rule__HardGoal__SuccessRateAssignment_11_2");
					put(grammarAccess.getCompositeGoalAccess().getNameAssignment_1(), "rule__CompositeGoal__NameAssignment_1");
					put(grammarAccess.getCompositeGoalAccess().getKindAssignment_4(), "rule__CompositeGoal__KindAssignment_4");
					put(grammarAccess.getCompositeGoalAccess().getPriorityAssignment_7(), "rule__CompositeGoal__PriorityAssignment_7");
					put(grammarAccess.getCompositeGoalAccess().getConditionAssignment_10(), "rule__CompositeGoal__ConditionAssignment_10");
					put(grammarAccess.getGoalImplicationAccess().getOperatorAssignment_1_1(), "rule__GoalImplication__OperatorAssignment_1_1");
					put(grammarAccess.getGoalImplicationAccess().getRightAssignment_1_2(), "rule__GoalImplication__RightAssignment_1_2");
					put(grammarAccess.getGoalDisjunctionAccess().getOperatorAssignment_1_1(), "rule__GoalDisjunction__OperatorAssignment_1_1");
					put(grammarAccess.getGoalDisjunctionAccess().getRightAssignment_1_2(), "rule__GoalDisjunction__RightAssignment_1_2");
					put(grammarAccess.getGoalConjunctionAccess().getOperatorAssignment_1_1(), "rule__GoalConjunction__OperatorAssignment_1_1");
					put(grammarAccess.getGoalConjunctionAccess().getRightAssignment_1_2(), "rule__GoalConjunction__RightAssignment_1_2");
					put(grammarAccess.getGoalComparisonAccess().getOperatorAssignment_1_1(), "rule__GoalComparison__OperatorAssignment_1_1");
					put(grammarAccess.getGoalComparisonAccess().getRightAssignment_1_2(), "rule__GoalComparison__RightAssignment_1_2");
					put(grammarAccess.getGoalNegationAccess().getOperatorAssignment_0(), "rule__GoalNegation__OperatorAssignment_0");
					put(grammarAccess.getGoalNegationAccess().getValueAssignment_1(), "rule__GoalNegation__ValueAssignment_1");
					put(grammarAccess.getGoalBooleanLiteralAccess().getValueAssignment(), "rule__GoalBooleanLiteral__ValueAssignment");
					put(grammarAccess.getGoalReferenceAccess().getValueAssignment_2(), "rule__GoalReference__ValueAssignment_2");
					put(grammarAccess.getParenthesizedGoalExpressionAccess().getValueAssignment_2(), "rule__ParenthesizedGoalExpression__ValueAssignment_2");
					put(grammarAccess.getAppliedQuantitativePropertyExpressionAccess().getValueAssignment_2(), "rule__AppliedQuantitativePropertyExpression__ValueAssignment_2");
					put(grammarAccess.getImplicationAccess().getOperatorAssignment_1_1(), "rule__Implication__OperatorAssignment_1_1");
					put(grammarAccess.getImplicationAccess().getRightAssignment_1_2(), "rule__Implication__RightAssignment_1_2");
					put(grammarAccess.getDisjunctionAccess().getOperatorAssignment_1_1(), "rule__Disjunction__OperatorAssignment_1_1");
					put(grammarAccess.getDisjunctionAccess().getRightAssignment_1_2(), "rule__Disjunction__RightAssignment_1_2");
					put(grammarAccess.getConjunctionAccess().getOperatorAssignment_1_1(), "rule__Conjunction__OperatorAssignment_1_1");
					put(grammarAccess.getConjunctionAccess().getRightAssignment_1_2(), "rule__Conjunction__RightAssignment_1_2");
					put(grammarAccess.getComparisonAccess().getOperatorAssignment_1_1(), "rule__Comparison__OperatorAssignment_1_1");
					put(grammarAccess.getComparisonAccess().getRightAssignment_1_2(), "rule__Comparison__RightAssignment_1_2");
					put(grammarAccess.getNegationAccess().getOperatorAssignment_0(), "rule__Negation__OperatorAssignment_0");
					put(grammarAccess.getNegationAccess().getValueAssignment_1(), "rule__Negation__ValueAssignment_1");
					put(grammarAccess.getRelationalExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__RelationalExpression__OperatorAssignment_1_0_0_1");
					put(grammarAccess.getRelationalExpressionAccess().getOperatorAssignment_1_0_1_1(), "rule__RelationalExpression__OperatorAssignment_1_0_1_1");
					put(grammarAccess.getRelationalExpressionAccess().getOperatorAssignment_1_0_2_1(), "rule__RelationalExpression__OperatorAssignment_1_0_2_1");
					put(grammarAccess.getRelationalExpressionAccess().getOperatorAssignment_1_0_3_1(), "rule__RelationalExpression__OperatorAssignment_1_0_3_1");
					put(grammarAccess.getRelationalExpressionAccess().getRightAssignment_1_1(), "rule__RelationalExpression__RightAssignment_1_1");
					put(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_1(), "rule__AdditiveExpression__OperatorAssignment_1_1");
					put(grammarAccess.getAdditiveExpressionAccess().getRightAssignment_1_2(), "rule__AdditiveExpression__RightAssignment_1_2");
					put(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_1(), "rule__MultiplicativeExpression__OperatorAssignment_1_1");
					put(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_2(), "rule__MultiplicativeExpression__RightAssignment_1_2");
					put(grammarAccess.getMaximumFunctionAccess().getOperatorAssignment_0(), "rule__MaximumFunction__OperatorAssignment_0");
					put(grammarAccess.getMaximumFunctionAccess().getValuesAssignment_2(), "rule__MaximumFunction__ValuesAssignment_2");
					put(grammarAccess.getMaximumFunctionAccess().getValuesAssignment_3_1(), "rule__MaximumFunction__ValuesAssignment_3_1");
					put(grammarAccess.getMinimumFunctionAccess().getOperatorAssignment_0(), "rule__MinimumFunction__OperatorAssignment_0");
					put(grammarAccess.getMinimumFunctionAccess().getValuesAssignment_2(), "rule__MinimumFunction__ValuesAssignment_2");
					put(grammarAccess.getMinimumFunctionAccess().getValuesAssignment_3_1(), "rule__MinimumFunction__ValuesAssignment_3_1");
					put(grammarAccess.getAverageFunctionAccess().getOperatorAssignment_0(), "rule__AverageFunction__OperatorAssignment_0");
					put(grammarAccess.getAverageFunctionAccess().getValuesAssignment_2(), "rule__AverageFunction__ValuesAssignment_2");
					put(grammarAccess.getAverageFunctionAccess().getValuesAssignment_3_1(), "rule__AverageFunction__ValuesAssignment_3_1");
					put(grammarAccess.getSumFunctionAccess().getOperatorAssignment_0(), "rule__SumFunction__OperatorAssignment_0");
					put(grammarAccess.getSumFunctionAccess().getValuesAssignment_2(), "rule__SumFunction__ValuesAssignment_2");
					put(grammarAccess.getSumFunctionAccess().getValuesAssignment_3_1(), "rule__SumFunction__ValuesAssignment_3_1");
					put(grammarAccess.getExponentialFunctionAccess().getOperatorAssignment_0(), "rule__ExponentialFunction__OperatorAssignment_0");
					put(grammarAccess.getExponentialFunctionAccess().getBaseAssignment_2(), "rule__ExponentialFunction__BaseAssignment_2");
					put(grammarAccess.getExponentialFunctionAccess().getExponentAssignment_4(), "rule__ExponentialFunction__ExponentAssignment_4");
					put(grammarAccess.getAbsoluteFunctionAccess().getOperatorAssignment_0(), "rule__AbsoluteFunction__OperatorAssignment_0");
					put(grammarAccess.getAbsoluteFunctionAccess().getValueAssignment_2(), "rule__AbsoluteFunction__ValueAssignment_2");
					put(grammarAccess.getNaturalLogarithmFunctionAccess().getOperatorAssignment_0(), "rule__NaturalLogarithmFunction__OperatorAssignment_0");
					put(grammarAccess.getNaturalLogarithmFunctionAccess().getValueAssignment_2(), "rule__NaturalLogarithmFunction__ValueAssignment_2");
					put(grammarAccess.getCommonLogarithmFunctionAccess().getOperatorAssignment_0(), "rule__CommonLogarithmFunction__OperatorAssignment_0");
					put(grammarAccess.getCommonLogarithmFunctionAccess().getValueAssignment_2(), "rule__CommonLogarithmFunction__ValueAssignment_2");
					put(grammarAccess.getParenthesizedExpressionAccess().getValueAssignment_1(), "rule__ParenthesizedExpression__ValueAssignment_1");
					put(grammarAccess.getObjectSpecificationExpressionAccess().getTypeAssignment_0(), "rule__ObjectSpecificationExpression__TypeAssignment_0");
					put(grammarAccess.getObjectSpecificationExpressionAccess().getValueAssignment_1_0(), "rule__ObjectSpecificationExpression__ValueAssignment_1_0");
					put(grammarAccess.getObjectSpecificationExpressionAccess().getValueAssignment_1_1(), "rule__ObjectSpecificationExpression__ValueAssignment_1_1");
					put(grammarAccess.getCollectionAccess().getValuesAssignment_2_0(), "rule__Collection__ValuesAssignment_2_0");
					put(grammarAccess.getCollectionAccess().getValuesAssignment_2_1_1(), "rule__Collection__ValuesAssignment_2_1_1");
					put(grammarAccess.getTupleAccess().getTuplesAssignment_2_0(), "rule__Tuple__TuplesAssignment_2_0");
					put(grammarAccess.getTupleAccess().getTuplesAssignment_2_1_1(), "rule__Tuple__TuplesAssignment_2_1_1");
					put(grammarAccess.getPropertyValuePairAccess().getPropertyAssignment_0(), "rule__PropertyValuePair__PropertyAssignment_0");
					put(grammarAccess.getPropertyValuePairAccess().getValueAssignment_2(), "rule__PropertyValuePair__ValueAssignment_2");
					put(grammarAccess.getInstanceSpecificationExpressionAccess().getValueAssignment(), "rule__InstanceSpecificationExpression__ValueAssignment");
					put(grammarAccess.getBooleanLiteralAccess().getValueAssignment(), "rule__BooleanLiteral__ValueAssignment");
					put(grammarAccess.getNumberLiteralAccess().getValueAssignment(), "rule__NumberLiteral__ValueAssignment");
					put(grammarAccess.getNullLiteralAccess().getValueAssignment(), "rule__NullLiteral__ValueAssignment");
					put(grammarAccess.getStringLiteralAccess().getValueAssignment(), "rule__StringLiteral__ValueAssignment");
					put(grammarAccess.getUnlimitedLiteralAccess().getValueAssignment(), "rule__UnlimitedLiteral__ValueAssignment");
					put(grammarAccess.getImportURIorNamespaceAccess().getImportURIAssignment_1_0(), "rule__ImportURIorNamespace__ImportURIAssignment_1_0");
					put(grammarAccess.getImportURIorNamespaceAccess().getImportedNamespaceAssignment_1_1(), "rule__ImportURIorNamespace__ImportedNamespaceAssignment_1_1");
					put(grammarAccess.getImportURIAccess().getImportURIAssignment_1(), "rule__ImportURI__ImportURIAssignment_1");
					put(grammarAccess.getImportNamespaceAccess().getImportedNamespaceAssignment_1(), "rule__ImportNamespace__ImportedNamespaceAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			eu.artist.postmigration.nfrvt.lang.gml.ui.contentassist.antlr.internal.InternalGMLParser typedParser = (eu.artist.postmigration.nfrvt.lang.gml.ui.contentassist.antlr.internal.InternalGMLParser) parser;
			typedParser.entryRuleARTISTModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public GMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(GMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
