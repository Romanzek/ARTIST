/*
* generated by Xtext
*/
package eu.artist.postmigration.nfrvt.lang.tsl.ui.labeling

import com.google.inject.Inject
import eu.artist.postmigration.nfrvt.lang.common.ui.labeling.ARTISTCommonLabelProvider
import eu.artist.postmigration.nfrvt.lang.tsl.validation.TSLTextRenderer
import eu.artist.postmigration.nfrvt.lang.tsl.ui.internal.TSLActivator

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class TSLLabelProvider extends ARTISTCommonLabelProvider {

	@Inject
	new(org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider delegate) {
		super(delegate, new TSLTextRenderer, TSLActivator.getInstance);
	}
}
