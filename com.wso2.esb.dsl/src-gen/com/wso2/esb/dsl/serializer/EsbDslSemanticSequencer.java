/*
 * generated by Xtext 2.9.0
 */
package com.wso2.esb.dsl.serializer;

import com.google.inject.Inject;
import com.wso2.esb.dsl.esbDsl.Command;
import com.wso2.esb.dsl.esbDsl.EsbDslPackage;
import com.wso2.esb.dsl.esbDsl.Model;
import com.wso2.esb.dsl.esbDsl.Participant;
import com.wso2.esb.dsl.services.EsbDslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class EsbDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EsbDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EsbDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EsbDslPackage.COMMAND:
				sequence_Command(context, (Command) semanticObject); 
				return; 
			case EsbDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case EsbDslPackage.PARTICIPANT:
				sequence_Participant(context, (Participant) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Command returns Command
	 *
	 * Constraint:
	 *     (name=ID configs=STRING?)
	 */
	protected void sequence_Command(ISerializationContext context, Command semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (participants+=Participant | commands+=Command)+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Participant returns Participant
	 *
	 * Constraint:
	 *     (name=ID description=STRING)
	 */
	protected void sequence_Participant(ISerializationContext context, Participant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EsbDslPackage.Literals.PARTICIPANT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsbDslPackage.Literals.PARTICIPANT__NAME));
			if (transientValues.isValueTransient(semanticObject, EsbDslPackage.Literals.PARTICIPANT__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsbDslPackage.Literals.PARTICIPANT__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParticipantAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParticipantAccess().getDescriptionSTRINGTerminalRuleCall_3_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
}