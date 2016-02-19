/*
 * generated by Xtext 2.9.0
 */
package com.wso2.esb.dsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class EsbDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.wso2.esb.dsl.EsbDsl.Model");
		private final UnorderedGroup cUnorderedGroup = (UnorderedGroup)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cUnorderedGroup.eContents().get(0);
		private final Keyword cStartumlKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cParticipantsAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cParticipantsParticipantStatementParserRuleCall_0_1_0 = (RuleCall)cParticipantsAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cUnorderedGroup.eContents().get(1);
		private final Assignment cStatementsAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cStatementsStatementParserRuleCall_1_0_0 = (RuleCall)cStatementsAssignment_1_0.eContents().get(0);
		private final Keyword cEndumlKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		
		//Model:
		//	'@startuml'
		//	participants+=ParticipantStatement* & statements+=Statement* '@enduml';
		@Override public ParserRule getRule() { return rule; }
		
		//'@startuml' participants+=ParticipantStatement* & statements+=Statement* '@enduml'
		public UnorderedGroup getUnorderedGroup() { return cUnorderedGroup; }
		
		//'@startuml' participants+=ParticipantStatement*
		public Group getGroup_0() { return cGroup_0; }
		
		//'@startuml'
		public Keyword getStartumlKeyword_0_0() { return cStartumlKeyword_0_0; }
		
		//participants+=ParticipantStatement*
		public Assignment getParticipantsAssignment_0_1() { return cParticipantsAssignment_0_1; }
		
		//ParticipantStatement
		public RuleCall getParticipantsParticipantStatementParserRuleCall_0_1_0() { return cParticipantsParticipantStatementParserRuleCall_0_1_0; }
		
		//statements+=Statement* '@enduml'
		public Group getGroup_1() { return cGroup_1; }
		
		//statements+=Statement*
		public Assignment getStatementsAssignment_1_0() { return cStatementsAssignment_1_0; }
		
		//Statement
		public RuleCall getStatementsStatementParserRuleCall_1_0_0() { return cStatementsStatementParserRuleCall_1_0_0; }
		
		//'@enduml'
		public Keyword getEndumlKeyword_1_1() { return cEndumlKeyword_1_1; }
	}
	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.wso2.esb.dsl.EsbDsl.Statement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cProcessingStatementParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRoutingStatementParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cParallelStatementParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cIfStatementParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cLoopStatementParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cGroupStatementParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cRefStatementParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		
		//Statement:
		//	ProcessingStatement
		//	| RoutingStatement
		//	| ParallelStatement
		//	| IfStatement
		//	| LoopStatement
		//	| GroupStatement
		//	| RefStatement;
		@Override public ParserRule getRule() { return rule; }
		
		//ProcessingStatement | RoutingStatement | ParallelStatement | IfStatement | LoopStatement | GroupStatement | RefStatement
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ProcessingStatement
		public RuleCall getProcessingStatementParserRuleCall_0() { return cProcessingStatementParserRuleCall_0; }
		
		//RoutingStatement
		public RuleCall getRoutingStatementParserRuleCall_1() { return cRoutingStatementParserRuleCall_1; }
		
		//ParallelStatement
		public RuleCall getParallelStatementParserRuleCall_2() { return cParallelStatementParserRuleCall_2; }
		
		//IfStatement
		public RuleCall getIfStatementParserRuleCall_3() { return cIfStatementParserRuleCall_3; }
		
		//LoopStatement
		public RuleCall getLoopStatementParserRuleCall_4() { return cLoopStatementParserRuleCall_4; }
		
		//GroupStatement
		public RuleCall getGroupStatementParserRuleCall_5() { return cGroupStatementParserRuleCall_5; }
		
		//RefStatement
		public RuleCall getRefStatementParserRuleCall_6() { return cRefStatementParserRuleCall_6; }
	}
	public class ProcessingStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.wso2.esb.dsl.EsbDsl.ProcessingStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMessage_processorKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Keyword cRightParenthesisKeyword_3_0 = (Keyword)cAlternatives_3.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cAlternatives_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cConfigsAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cConfigsSTRINGTerminalRuleCall_3_1_1_0 = (RuleCall)cConfigsAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3_1_2 = (Keyword)cGroup_3_1.eContents().get(2);
		
		//ProcessingStatement:
		//	'message_processor' '(' name=ID (')' | ',' configs=STRING ')');
		@Override public ParserRule getRule() { return rule; }
		
		//'message_processor' '(' name=ID (')' | ',' configs=STRING ')')
		public Group getGroup() { return cGroup; }
		
		//'message_processor'
		public Keyword getMessage_processorKeyword_0() { return cMessage_processorKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//(')' | ',' configs=STRING ')')
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3_0() { return cRightParenthesisKeyword_3_0; }
		
		//',' configs=STRING ')'
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//','
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }
		
		//configs=STRING
		public Assignment getConfigsAssignment_3_1_1() { return cConfigsAssignment_3_1_1; }
		
		//STRING
		public RuleCall getConfigsSTRINGTerminalRuleCall_3_1_1_0() { return cConfigsSTRINGTerminalRuleCall_3_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3_1_2() { return cRightParenthesisKeyword_3_1_2; }
	}
	public class RoutingStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.wso2.esb.dsl.EsbDsl.RoutingStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSourceAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSourceIDTerminalRuleCall_0_0 = (RuleCall)cSourceAssignment_0.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTargetAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTargetIDTerminalRuleCall_2_0 = (RuleCall)cTargetAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cActionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cActionSTRINGTerminalRuleCall_4_0 = (RuleCall)cActionAssignment_4.eContents().get(0);
		
		//RoutingStatement:
		//	source=ID '->' target=ID ':' action=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//source=ID '->' target=ID ':' action=STRING
		public Group getGroup() { return cGroup; }
		
		//source=ID
		public Assignment getSourceAssignment_0() { return cSourceAssignment_0; }
		
		//ID
		public RuleCall getSourceIDTerminalRuleCall_0_0() { return cSourceIDTerminalRuleCall_0_0; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_1() { return cHyphenMinusGreaterThanSignKeyword_1; }
		
		//target=ID
		public Assignment getTargetAssignment_2() { return cTargetAssignment_2; }
		
		//ID
		public RuleCall getTargetIDTerminalRuleCall_2_0() { return cTargetIDTerminalRuleCall_2_0; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//action=STRING
		public Assignment getActionAssignment_4() { return cActionAssignment_4; }
		
		//STRING
		public RuleCall getActionSTRINGTerminalRuleCall_4_0() { return cActionSTRINGTerminalRuleCall_4_0; }
	}
	public class ParallelStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.wso2.esb.dsl.EsbDsl.ParallelStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cParKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cStatementsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cStatementsStatementParserRuleCall_1_0 = (RuleCall)cStatementsAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cElseKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cStatementsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cStatementsStatementParserRuleCall_2_1_0 = (RuleCall)cStatementsAssignment_2_1.eContents().get(0);
		private final Keyword cEndKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ParallelStatement:
		//	'par'
		//	statements+=Statement* ('else' statements+=Statement*)*
		//	'end';
		@Override public ParserRule getRule() { return rule; }
		
		//'par' statements+=Statement* ('else' statements+=Statement*)* 'end'
		public Group getGroup() { return cGroup; }
		
		//'par'
		public Keyword getParKeyword_0() { return cParKeyword_0; }
		
		//statements+=Statement*
		public Assignment getStatementsAssignment_1() { return cStatementsAssignment_1; }
		
		//Statement
		public RuleCall getStatementsStatementParserRuleCall_1_0() { return cStatementsStatementParserRuleCall_1_0; }
		
		//('else' statements+=Statement*)*
		public Group getGroup_2() { return cGroup_2; }
		
		//'else'
		public Keyword getElseKeyword_2_0() { return cElseKeyword_2_0; }
		
		//statements+=Statement*
		public Assignment getStatementsAssignment_2_1() { return cStatementsAssignment_2_1; }
		
		//Statement
		public RuleCall getStatementsStatementParserRuleCall_2_1_0() { return cStatementsStatementParserRuleCall_2_1_0; }
		
		//'end'
		public Keyword getEndKeyword_3() { return cEndKeyword_3; }
	}
	public class IfStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.wso2.esb.dsl.EsbDsl.IfStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAltKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExpressionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpressionSTRINGTerminalRuleCall_1_0 = (RuleCall)cExpressionAssignment_1.eContents().get(0);
		
		//IfStatement:
		//	'alt' expression=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'alt' expression=STRING
		public Group getGroup() { return cGroup; }
		
		//'alt'
		public Keyword getAltKeyword_0() { return cAltKeyword_0; }
		
		//expression=STRING
		public Assignment getExpressionAssignment_1() { return cExpressionAssignment_1; }
		
		//STRING
		public RuleCall getExpressionSTRINGTerminalRuleCall_1_0() { return cExpressionSTRINGTerminalRuleCall_1_0; }
	}
	public class LoopStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.wso2.esb.dsl.EsbDsl.LoopStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLoopKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//LoopStatement:
		//	'loop' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'loop' name=ID
		public Group getGroup() { return cGroup; }
		
		//'loop'
		public Keyword getLoopKeyword_0() { return cLoopKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class GroupStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.wso2.esb.dsl.EsbDsl.GroupStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGroupKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//GroupStatement:
		//	'group' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'group' name=ID
		public Group getGroup() { return cGroup; }
		
		//'group'
		public Keyword getGroupKeyword_0() { return cGroupKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class RefStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.wso2.esb.dsl.EsbDsl.RefStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//RefStatement:
		//	'ref' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'ref' name=ID
		public Group getGroup() { return cGroup; }
		
		//'ref'
		public Keyword getRefKeyword_0() { return cRefKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class ParticipantStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.wso2.esb.dsl.EsbDsl.ParticipantStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cParticipantKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cParticipantTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cParticipantTypeParticipantTypeEnumRuleCall_3_0 = (RuleCall)cParticipantTypeAssignment_3.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cDescriptionAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_5_0 = (RuleCall)cDescriptionAssignment_5.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//ParticipantStatement:
		//	'participant' name=ID ':' participantType=ParticipantType '(' description=STRING ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'participant' name=ID ':' participantType=ParticipantType '(' description=STRING ')'
		public Group getGroup() { return cGroup; }
		
		//'participant'
		public Keyword getParticipantKeyword_0() { return cParticipantKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//participantType=ParticipantType
		public Assignment getParticipantTypeAssignment_3() { return cParticipantTypeAssignment_3; }
		
		//ParticipantType
		public RuleCall getParticipantTypeParticipantTypeEnumRuleCall_3_0() { return cParticipantTypeParticipantTypeEnumRuleCall_3_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_4() { return cLeftParenthesisKeyword_4; }
		
		//description=STRING
		public Assignment getDescriptionAssignment_5() { return cDescriptionAssignment_5; }
		
		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_5_0() { return cDescriptionSTRINGTerminalRuleCall_5_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_6() { return cRightParenthesisKeyword_6; }
	}
	
	public class ParticipantTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "com.wso2.esb.dsl.EsbDsl.ParticipantType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cINTEGRATIONFLOWEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cINTEGRATIONFLOWIntegrationFlowKeyword_0_0 = (Keyword)cINTEGRATIONFLOWEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cINBOUNDENDPOINTEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cINBOUNDENDPOINTInboundEndpointKeyword_1_0 = (Keyword)cINBOUNDENDPOINTEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cOUTBOUNDENDPOINTEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cOUTBOUNDENDPOINTOutboundEndpointKeyword_2_0 = (Keyword)cOUTBOUNDENDPOINTEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cPIPELINEEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cPIPELINEPipelineKeyword_3_0 = (Keyword)cPIPELINEEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum ParticipantType:
		//	INTEGRATIONFLOW='IntegrationFlow'
		//	| INBOUNDENDPOINT='InboundEndpoint'
		//	| OUTBOUNDENDPOINT='OutboundEndpoint'
		//	| PIPELINE='Pipeline';
		public EnumRule getRule() { return rule; }
		
		//INTEGRATIONFLOW='IntegrationFlow' | INBOUNDENDPOINT='InboundEndpoint' | OUTBOUNDENDPOINT='OutboundEndpoint' |
		//PIPELINE='Pipeline'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//INTEGRATIONFLOW='IntegrationFlow'
		public EnumLiteralDeclaration getINTEGRATIONFLOWEnumLiteralDeclaration_0() { return cINTEGRATIONFLOWEnumLiteralDeclaration_0; }
		
		//'IntegrationFlow'
		public Keyword getINTEGRATIONFLOWIntegrationFlowKeyword_0_0() { return cINTEGRATIONFLOWIntegrationFlowKeyword_0_0; }
		
		//INBOUNDENDPOINT='InboundEndpoint'
		public EnumLiteralDeclaration getINBOUNDENDPOINTEnumLiteralDeclaration_1() { return cINBOUNDENDPOINTEnumLiteralDeclaration_1; }
		
		//'InboundEndpoint'
		public Keyword getINBOUNDENDPOINTInboundEndpointKeyword_1_0() { return cINBOUNDENDPOINTInboundEndpointKeyword_1_0; }
		
		//OUTBOUNDENDPOINT='OutboundEndpoint'
		public EnumLiteralDeclaration getOUTBOUNDENDPOINTEnumLiteralDeclaration_2() { return cOUTBOUNDENDPOINTEnumLiteralDeclaration_2; }
		
		//'OutboundEndpoint'
		public Keyword getOUTBOUNDENDPOINTOutboundEndpointKeyword_2_0() { return cOUTBOUNDENDPOINTOutboundEndpointKeyword_2_0; }
		
		//PIPELINE='Pipeline'
		public EnumLiteralDeclaration getPIPELINEEnumLiteralDeclaration_3() { return cPIPELINEEnumLiteralDeclaration_3; }
		
		//'Pipeline'
		public Keyword getPIPELINEPipelineKeyword_3_0() { return cPIPELINEPipelineKeyword_3_0; }
	}
	
	private final ModelElements pModel;
	private final StatementElements pStatement;
	private final ProcessingStatementElements pProcessingStatement;
	private final RoutingStatementElements pRoutingStatement;
	private final ParallelStatementElements pParallelStatement;
	private final IfStatementElements pIfStatement;
	private final LoopStatementElements pLoopStatement;
	private final GroupStatementElements pGroupStatement;
	private final RefStatementElements pRefStatement;
	private final ParticipantStatementElements pParticipantStatement;
	private final ParticipantTypeElements eParticipantType;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public EsbDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pStatement = new StatementElements();
		this.pProcessingStatement = new ProcessingStatementElements();
		this.pRoutingStatement = new RoutingStatementElements();
		this.pParallelStatement = new ParallelStatementElements();
		this.pIfStatement = new IfStatementElements();
		this.pLoopStatement = new LoopStatementElements();
		this.pGroupStatement = new GroupStatementElements();
		this.pRefStatement = new RefStatementElements();
		this.pParticipantStatement = new ParticipantStatementElements();
		this.eParticipantType = new ParticipantTypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.wso2.esb.dsl.EsbDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	'@startuml'
	//	participants+=ParticipantStatement* & statements+=Statement* '@enduml';
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Statement:
	//	ProcessingStatement
	//	| RoutingStatement
	//	| ParallelStatement
	//	| IfStatement
	//	| LoopStatement
	//	| GroupStatement
	//	| RefStatement;
	public StatementElements getStatementAccess() {
		return pStatement;
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}
	
	//ProcessingStatement:
	//	'message_processor' '(' name=ID (')' | ',' configs=STRING ')');
	public ProcessingStatementElements getProcessingStatementAccess() {
		return pProcessingStatement;
	}
	
	public ParserRule getProcessingStatementRule() {
		return getProcessingStatementAccess().getRule();
	}
	
	//RoutingStatement:
	//	source=ID '->' target=ID ':' action=STRING;
	public RoutingStatementElements getRoutingStatementAccess() {
		return pRoutingStatement;
	}
	
	public ParserRule getRoutingStatementRule() {
		return getRoutingStatementAccess().getRule();
	}
	
	//ParallelStatement:
	//	'par'
	//	statements+=Statement* ('else' statements+=Statement*)*
	//	'end';
	public ParallelStatementElements getParallelStatementAccess() {
		return pParallelStatement;
	}
	
	public ParserRule getParallelStatementRule() {
		return getParallelStatementAccess().getRule();
	}
	
	//IfStatement:
	//	'alt' expression=STRING;
	public IfStatementElements getIfStatementAccess() {
		return pIfStatement;
	}
	
	public ParserRule getIfStatementRule() {
		return getIfStatementAccess().getRule();
	}
	
	//LoopStatement:
	//	'loop' name=ID;
	public LoopStatementElements getLoopStatementAccess() {
		return pLoopStatement;
	}
	
	public ParserRule getLoopStatementRule() {
		return getLoopStatementAccess().getRule();
	}
	
	//GroupStatement:
	//	'group' name=ID;
	public GroupStatementElements getGroupStatementAccess() {
		return pGroupStatement;
	}
	
	public ParserRule getGroupStatementRule() {
		return getGroupStatementAccess().getRule();
	}
	
	//RefStatement:
	//	'ref' name=ID;
	public RefStatementElements getRefStatementAccess() {
		return pRefStatement;
	}
	
	public ParserRule getRefStatementRule() {
		return getRefStatementAccess().getRule();
	}
	
	//ParticipantStatement:
	//	'participant' name=ID ':' participantType=ParticipantType '(' description=STRING ')';
	public ParticipantStatementElements getParticipantStatementAccess() {
		return pParticipantStatement;
	}
	
	public ParserRule getParticipantStatementRule() {
		return getParticipantStatementAccess().getRule();
	}
	
	//enum ParticipantType:
	//	INTEGRATIONFLOW='IntegrationFlow'
	//	| INBOUNDENDPOINT='InboundEndpoint'
	//	| OUTBOUNDENDPOINT='OutboundEndpoint'
	//	| PIPELINE='Pipeline';
	public ParticipantTypeElements getParticipantTypeAccess() {
		return eParticipantType;
	}
	
	public EnumRule getParticipantTypeRule() {
		return getParticipantTypeAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
