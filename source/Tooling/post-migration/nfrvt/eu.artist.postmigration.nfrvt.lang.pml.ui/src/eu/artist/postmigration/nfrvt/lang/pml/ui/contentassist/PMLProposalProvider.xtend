/*
 * generated by Xtext
 */
package eu.artist.postmigration.nfrvt.lang.pml.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import java.math.BigDecimal
import org.eclipse.xtext.RuleCall

/**
 * see http://www.eclipse.org/Xtext/documentation.html#contentAssist on how to customize content assistant
 */
class PMLProposalProvider extends AbstractPMLProposalProvider {
	
	override completeObservation_Level(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeObservation_Level(model, assignment, context, acceptor)
		createStringProposal(context, acceptor, assignment, "Original Code")
		createStringProposal(context, acceptor, assignment, "Original PSM")
		createStringProposal(context, acceptor, assignment, "PIM")
		createStringProposal(context, acceptor, assignment, "Cloudified PSM")
		createStringProposal(context, acceptor, assignment, "Cloudified Code")
		createStringProposal(context, acceptor, assignment, "Model")
		createStringProposal(context, acceptor, assignment, "Code")
	}
	
	override completeObservation_MeasurementType(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeObservation_MeasurementType(model, assignment, context, acceptor)
		createStringProposal(context, acceptor, assignment, "measured")
		createStringProposal(context, acceptor, assignment, "calculated")
		createStringProposal(context, acceptor, assignment, "estimated")
		createStringProposal(context, acceptor, assignment, "random")
	}
	
	override completeWorkload_Pattern(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeWorkload_Pattern(model, assignment, context, acceptor)
		createStringProposal(context, acceptor, assignment, "open")
		createStringProposal(context, acceptor, assignment, "closed")
	}
	
	override completeDataPointMeasurement_Confidence(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeDataPointMeasurement_Confidence(model, assignment, context, acceptor)
		createProposal(context, acceptor, assignment.terminal as RuleCall, new BigDecimal("0.99"), NUMBER_DUMMY.image)
	}
	
	override completeTimeSeriesMeasurement_Confidence(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeTimeSeriesMeasurement_Confidence(model, assignment, context, acceptor)
		createProposal(context, acceptor, assignment.terminal as RuleCall, new BigDecimal("0.99"), NUMBER_DUMMY.image)
	}	
}
