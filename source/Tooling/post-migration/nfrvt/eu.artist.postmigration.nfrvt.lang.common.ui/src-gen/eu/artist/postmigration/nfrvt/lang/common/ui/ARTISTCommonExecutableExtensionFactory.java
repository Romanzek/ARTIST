/*
 * generated by Xtext
 */
package eu.artist.postmigration.nfrvt.lang.common.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import eu.artist.postmigration.nfrvt.lang.common.ui.internal.ARTISTCommonActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ARTISTCommonExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ARTISTCommonActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ARTISTCommonActivator.getInstance().getInjector(ARTISTCommonActivator.EU_ARTIST_POSTMIGRATION_NFRVT_LANG_COMMON_ARTISTCOMMON);
	}
	
}
