/*
 * generated by Xtext 2.24.0
 */
package fr.diverse.moda.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.diverse.moda.ModaRuntimeModule;
import fr.diverse.moda.ModaStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class ModaIdeSetup extends ModaStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new ModaRuntimeModule(), new ModaIdeModule()));
	}
	
}
