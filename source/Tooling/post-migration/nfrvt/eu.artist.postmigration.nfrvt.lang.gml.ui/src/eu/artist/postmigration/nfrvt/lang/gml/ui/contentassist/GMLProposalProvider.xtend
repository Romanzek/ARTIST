/*
 * generated by Xtext
 */
package eu.artist.postmigration.nfrvt.lang.gml.ui.contentassist

import eu.artist.postmigration.nfrvt.lang.gml.ui.contentassist.AbstractGMLProposalProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import eu.artist.postmigration.nfrvt.lang.gml.gml.GmlFactory

/**
 * see http://www.eclipse.org/Xtext/documentation.html#contentAssist on how to customize content assistant
 */
class GMLProposalProvider extends AbstractGMLProposalProvider {
	
	val factory = GmlFactory.eINSTANCE;
	
	new() {
		filterKeyword("$"); // taken care of by proposal providers
	}
	
	override complete_AppliedQuantitativePropertyExpression(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createProposal(context, acceptor, ruleCall, "$AppliedQuantitativeProperty", factory.createAppliedQuantitativePropertyExpression.image, 1, -1);
	}
	
	override complete_GoalReference(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createProposal(context, acceptor, ruleCall, "$GoalReference", factory.createGoalReference.image, 1, -1);
	}
	
}
