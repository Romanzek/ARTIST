/*
 * generated by Xtext
 */
package eu.artist.postmigration.nfrvt.lang.gml.scoping

import eu.artist.postmigration.nfrvt.lang.common.scoping.ARTISTCommonScopeProvider
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQualitativeProperty
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativePropertyExpression
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalReference
import eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 *
 */
class GMLScopeProvider extends ARTISTCommonScopeProvider {

	def IScope scope_AppliedQuantitativeProperty_workload(AppliedQuantitativeProperty p, EReference ref) {
		if(ref.name.equals("workload")) {
			val container = p.eContainer
			if(!(container instanceof GoalModel))
				return IScope::NULLSCOPE;
			val gm = container as GoalModel;
			return Scopes::scopeFor(gm.workloads);
		}
	}
	
	def IScope scope_SoftGoal_property(SoftGoal g, EReference ref) {
		if(ref.name.equals("property")) {
			val container = g.eContainer
			if(!(container instanceof GoalModel))
				return IScope::NULLSCOPE;
			val gm = container as GoalModel;
			return Scopes::scopeFor(gm.appliedProperties.filter(typeof(AppliedQualitativeProperty)));
		}
	}
	
	def IScope scope_GoalReference_value(GoalReference g, EReference ref) {
		if(ref.name.equals("value")) {
			
			val container = g.eResource.contents.get(0)
			if(!(container instanceof GoalModel))
				return IScope::NULLSCOPE;
			val gm = container as GoalModel;
			return Scopes::scopeFor(gm.goals);
		}
	}
	
	def IScope scope_AppliedQuantitativePropertyExpression_value(AppliedQuantitativePropertyExpression g, EReference ref) {
		if(ref.name.equals("value")) {
			
			val container = g.eResource.contents.get(0)
			if(!(container instanceof GoalModel))
				return IScope::NULLSCOPE;
			val gm = container as GoalModel;
			return Scopes::scopeFor(gm.appliedProperties.filter(typeof(AppliedQuantitativeProperty)));
		}
	}
}
