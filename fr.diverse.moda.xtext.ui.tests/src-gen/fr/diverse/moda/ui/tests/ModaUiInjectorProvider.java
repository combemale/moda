/*
 * generated by Xtext 2.24.0
 */
package fr.diverse.moda.ui.tests;

import com.google.inject.Injector;
import fr.diverse.moda.xtext.ui.internal.XtextActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class ModaUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return XtextActivator.getInstance().getInjector("fr.diverse.moda.Moda");
	}

}
