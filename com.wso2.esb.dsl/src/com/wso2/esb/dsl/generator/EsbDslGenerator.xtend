/*
 * generated by Xtext 2.9.0
 */
package com.wso2.esb.dsl.generator

import com.wso2.esb.dsl.esbDsl.ParticipantStatement
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class EsbDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile('Model.java', 'People to greet: ' + 
			resource.allContents
				.filter(typeof(ParticipantStatement))
				.map[name]
				.join(', '))
	}
}

     
//    class EsbDslGenerator extends AbstractModelInferrer {
//     
//      /**
//       * a builder API to programmatically create Jvm elements 
//       * in readable way.
//       */
//      @Inject extension JvmTypesBuilder
//      
//      @Inject extension IQualifiedNameProvider
//      
//      def dispatch void infer(Entity element, 
//                    IJvmDeclaredTypeAcceptor acceptor, 
//                    boolean isPrelinkingPhase) {
//        acceptor.accept(element.toClass( element.fullyQualifiedName )) [
//          documentation = element.documentation
//          if (element.superType != null)
//            superTypes += element.superType.cloneWithProxies
//          for (feature : element.features) {
//            switch feature {
//              
//              Property : {
//                members += feature.toField(feature.name, feature.type)
//                members += feature.toGetter(feature.name, feature.type)
//                members += feature.toSetter(feature.name, feature.type)
//              }
//              
//              Operation : {
//                members += feature.toMethod(feature.name, feature.type) [
//                  documentation = feature.documentation
//                  for (p : feature.params) {
//                    parameters += p.toParameter(p.name, p.parameterType)
//                  }
//                  body = feature.body
//                ]
//              }
//            }
//          }
//        ]
//      }
//    }
