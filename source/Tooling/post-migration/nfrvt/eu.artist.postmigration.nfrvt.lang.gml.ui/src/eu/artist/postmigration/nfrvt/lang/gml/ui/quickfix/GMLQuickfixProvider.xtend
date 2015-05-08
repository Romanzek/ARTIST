/*
* generated by Xtext
*/
package eu.artist.postmigration.nfrvt.lang.gml.ui.quickfix

import eu.artist.postmigration.nfrvt.lang.common.ui.quickfix.ARTISTCommonQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.validation.Issue
import eu.artist.postmigration.nfrvt.lang.gml.validation.GMLValidator
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.jface.text.FindReplaceDocumentAdapter

//import org.eclipse.xtext.ui.editor.quickfix.Fix
//import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
//import org.eclipse.xtext.validation.Issue

/**
 * Custom quickfixes.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#quickfixes
 */
class GMLQuickfixProvider extends ARTISTCommonQuickfixProvider {

	@Fix(GMLValidator::DETERMINISTIC_VALUE)
	def replaceWithConstant(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Replace with constant value \'' + issue.data.get(0) + '\'', 'Replace condition with resulting value.', 'upcase.png') [
			context |
			val xtextDocument = context.xtextDocument
			xtextDocument.replace(issue.offset, issue.length, issue.data.get(0))
		]
	}
	
	@Fix(GMLValidator::UNNECESSARY_GOAL)
	def removeGoal(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Remove goal', 'Remove goal.', 'upcase.png') [
			context |
			val xtextDocument = context.xtextDocument
			val replacer = new FindReplaceDocumentAdapter(xtextDocument)
			val toRemoveStart = replacer.find(issue.offset, issue.data.get(0), false, false, true, false)
			var toRemoveEnd = replacer.find(issue.offset, "},", true, false, false, false)
			if(toRemoveEnd == null) // in case of last item in list
				toRemoveEnd = replacer.find(issue.offset, "}", true, false, false, false)
			xtextDocument.replace(toRemoveStart.offset, toRemoveEnd.offset - toRemoveStart.offset + toRemoveEnd.length, "")
		]
	}
	

//	@Fix(MyDslValidator::INVALID_NAME)
//	def capitalizeName(Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue, 'Capitalize name', 'Capitalize the name.', 'upcase.png') [
//			context |
//			val xtextDocument = context.xtextDocument
//			val firstLetter = xtextDocument.get(issue.offset, 1)
//			xtextDocument.replace(issue.offset, 1, firstLetter.toUpperCase)
//		]
//	}
}
