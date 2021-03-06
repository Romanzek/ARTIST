/*
* generated by Xtext
*/
package eu.artist.postmigration.nfrvt.lang.pml.ui.outline

import eu.artist.postmigration.nfrvt.lang.common.ui.outline.ARTISTCommonOutlineTreeProvider
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import eu.artist.postmigration.nfrvt.lang.pml.pml.MeasurementModel
import eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage
import eu.artist.postmigration.nfrvt.lang.pml.pml.PmlFactory

/**
 * Customization of the default outline structure.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#outline
 */
class PMLOutlineTreeProvider extends ARTISTCommonOutlineTreeProvider {
	def protected _createChildren(IOutlineNode parentNode, MeasurementModel modelElement) {
		createEStructuralFeatureNode(
			parentNode,
			modelElement,
			PmlPackage.Literals.MEASUREMENT_MODEL__OBSERVATIONS,
			PmlFactory.eINSTANCE.createObservation._image,
			"Observations",
			false
		)
	}	
}
