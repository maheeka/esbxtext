/*
 * generated by Xtext 2.9.0
 */
package com.wso2.esb.dsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class EsbDslStandaloneSetup extends EsbDslStandaloneSetupGenerated {

	def static void doSetup() {
		new EsbDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
