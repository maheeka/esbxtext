/*
 * generated by Xtext 2.9.0
 */
package com.wso2.esb.dsl.ui.tests;

import com.google.inject.Injector;
import com.wso2.esb.dsl.ui.internal.DslActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class EsbDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DslActivator.getInstance().getInjector("com.wso2.esb.dsl.EsbDsl");
	}

}
