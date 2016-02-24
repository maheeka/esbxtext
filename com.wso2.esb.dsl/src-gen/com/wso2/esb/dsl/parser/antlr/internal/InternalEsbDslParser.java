package com.wso2.esb.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.wso2.esb.dsl.services.EsbDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEsbDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@startuml'", "'IntegrationFlow'", "':'", "'@enduml'", "'('", "')'", "'->'", "'par'", "'else'", "'end'", "'alt'", "'condition'", "'source'", "','", "'pattern'", "'loop'", "'group'", "'ref'", "'participant'", "'OutboundEndpoint'", "'protocol'", "'host'", "'InboundEndpoint'", "'port'", "'context'", "'Pipeline'", "'log'", "'call'", "'respond'", "'filter'", "'transform'", "'enrich'", "'external'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalEsbDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEsbDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEsbDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEsbDsl.g"; }



     	private EsbDslGrammarAccess grammarAccess;

        public InternalEsbDslParser(TokenStream input, EsbDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected EsbDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalEsbDsl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalEsbDsl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalEsbDsl.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalEsbDsl.g:72:1: ruleModel returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= '@startuml' otherlv_2= 'IntegrationFlow' otherlv_3= ':' ( (lv_integrationFlowName_4_0= RULE_ID ) ) ( (lv_participants_5_0= ruleParticipantStatement ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '@enduml' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_integrationFlowName_4_0=null;
        Token otherlv_7=null;
        EObject lv_participants_5_0 = null;

        EObject lv_statements_6_0 = null;



        	enterRule();

        try {
            // InternalEsbDsl.g:78:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= '@startuml' otherlv_2= 'IntegrationFlow' otherlv_3= ':' ( (lv_integrationFlowName_4_0= RULE_ID ) ) ( (lv_participants_5_0= ruleParticipantStatement ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '@enduml' ) ) ) ) )+ {...}?) ) ) )
            // InternalEsbDsl.g:79:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= '@startuml' otherlv_2= 'IntegrationFlow' otherlv_3= ':' ( (lv_integrationFlowName_4_0= RULE_ID ) ) ( (lv_participants_5_0= ruleParticipantStatement ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '@enduml' ) ) ) ) )+ {...}?) ) )
            {
            // InternalEsbDsl.g:79:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= '@startuml' otherlv_2= 'IntegrationFlow' otherlv_3= ':' ( (lv_integrationFlowName_4_0= RULE_ID ) ) ( (lv_participants_5_0= ruleParticipantStatement ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '@enduml' ) ) ) ) )+ {...}?) ) )
            // InternalEsbDsl.g:80:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= '@startuml' otherlv_2= 'IntegrationFlow' otherlv_3= ':' ( (lv_integrationFlowName_4_0= RULE_ID ) ) ( (lv_participants_5_0= ruleParticipantStatement ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '@enduml' ) ) ) ) )+ {...}?) )
            {
            // InternalEsbDsl.g:80:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= '@startuml' otherlv_2= 'IntegrationFlow' otherlv_3= ':' ( (lv_integrationFlowName_4_0= RULE_ID ) ) ( (lv_participants_5_0= ruleParticipantStatement ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '@enduml' ) ) ) ) )+ {...}?) )
            // InternalEsbDsl.g:81:4: ( ( ({...}? => ( ({...}? => (otherlv_1= '@startuml' otherlv_2= 'IntegrationFlow' otherlv_3= ':' ( (lv_integrationFlowName_4_0= RULE_ID ) ) ( (lv_participants_5_0= ruleParticipantStatement ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '@enduml' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup());
            			
            // InternalEsbDsl.g:84:4: ( ( ({...}? => ( ({...}? => (otherlv_1= '@startuml' otherlv_2= 'IntegrationFlow' otherlv_3= ':' ( (lv_integrationFlowName_4_0= RULE_ID ) ) ( (lv_participants_5_0= ruleParticipantStatement ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '@enduml' ) ) ) ) )+ {...}?)
            // InternalEsbDsl.g:85:5: ( ({...}? => ( ({...}? => (otherlv_1= '@startuml' otherlv_2= 'IntegrationFlow' otherlv_3= ':' ( (lv_integrationFlowName_4_0= RULE_ID ) ) ( (lv_participants_5_0= ruleParticipantStatement ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '@enduml' ) ) ) ) )+ {...}?
            {
            // InternalEsbDsl.g:85:5: ( ({...}? => ( ({...}? => (otherlv_1= '@startuml' otherlv_2= 'IntegrationFlow' otherlv_3= ':' ( (lv_integrationFlowName_4_0= RULE_ID ) ) ( (lv_participants_5_0= ruleParticipantStatement ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '@enduml' ) ) ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                    alt3=1;
                }
                else if ( ( LA3_0 == RULE_ID || LA3_0 == 14 || LA3_0 == 18 || LA3_0 == 21 || LA3_0 >= 26 && LA3_0 <= 28 || LA3_0 >= 37 && LA3_0 <= 43 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEsbDsl.g:86:3: ({...}? => ( ({...}? => (otherlv_1= '@startuml' otherlv_2= 'IntegrationFlow' otherlv_3= ':' ( (lv_integrationFlowName_4_0= RULE_ID ) ) ( (lv_participants_5_0= ruleParticipantStatement ) )* ) ) ) )
            	    {
            	    // InternalEsbDsl.g:86:3: ({...}? => ( ({...}? => (otherlv_1= '@startuml' otherlv_2= 'IntegrationFlow' otherlv_3= ':' ( (lv_integrationFlowName_4_0= RULE_ID ) ) ( (lv_participants_5_0= ruleParticipantStatement ) )* ) ) ) )
            	    // InternalEsbDsl.g:87:4: {...}? => ( ({...}? => (otherlv_1= '@startuml' otherlv_2= 'IntegrationFlow' otherlv_3= ':' ( (lv_integrationFlowName_4_0= RULE_ID ) ) ( (lv_participants_5_0= ruleParticipantStatement ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalEsbDsl.g:87:99: ( ({...}? => (otherlv_1= '@startuml' otherlv_2= 'IntegrationFlow' otherlv_3= ':' ( (lv_integrationFlowName_4_0= RULE_ID ) ) ( (lv_participants_5_0= ruleParticipantStatement ) )* ) ) )
            	    // InternalEsbDsl.g:88:5: ({...}? => (otherlv_1= '@startuml' otherlv_2= 'IntegrationFlow' otherlv_3= ':' ( (lv_integrationFlowName_4_0= RULE_ID ) ) ( (lv_participants_5_0= ruleParticipantStatement ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalEsbDsl.g:91:8: ({...}? => (otherlv_1= '@startuml' otherlv_2= 'IntegrationFlow' otherlv_3= ':' ( (lv_integrationFlowName_4_0= RULE_ID ) ) ( (lv_participants_5_0= ruleParticipantStatement ) )* ) )
            	    // InternalEsbDsl.g:91:9: {...}? => (otherlv_1= '@startuml' otherlv_2= 'IntegrationFlow' otherlv_3= ':' ( (lv_integrationFlowName_4_0= RULE_ID ) ) ( (lv_participants_5_0= ruleParticipantStatement ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalEsbDsl.g:91:18: (otherlv_1= '@startuml' otherlv_2= 'IntegrationFlow' otherlv_3= ':' ( (lv_integrationFlowName_4_0= RULE_ID ) ) ( (lv_participants_5_0= ruleParticipantStatement ) )* )
            	    // InternalEsbDsl.g:91:19: otherlv_1= '@startuml' otherlv_2= 'IntegrationFlow' otherlv_3= ':' ( (lv_integrationFlowName_4_0= RULE_ID ) ) ( (lv_participants_5_0= ruleParticipantStatement ) )*
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getModelAccess().getStartumlKeyword_0_0());
            	    							
            	    otherlv_2=(Token)match(input,12,FOLLOW_4); 

            	    								newLeafNode(otherlv_2, grammarAccess.getModelAccess().getIntegrationFlowKeyword_0_1());
            	    							
            	    otherlv_3=(Token)match(input,13,FOLLOW_5); 

            	    								newLeafNode(otherlv_3, grammarAccess.getModelAccess().getColonKeyword_0_2());
            	    							
            	    // InternalEsbDsl.g:103:8: ( (lv_integrationFlowName_4_0= RULE_ID ) )
            	    // InternalEsbDsl.g:104:9: (lv_integrationFlowName_4_0= RULE_ID )
            	    {
            	    // InternalEsbDsl.g:104:9: (lv_integrationFlowName_4_0= RULE_ID )
            	    // InternalEsbDsl.g:105:10: lv_integrationFlowName_4_0= RULE_ID
            	    {
            	    lv_integrationFlowName_4_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    										newLeafNode(lv_integrationFlowName_4_0, grammarAccess.getModelAccess().getIntegrationFlowNameIDTerminalRuleCall_0_3_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getModelRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"integrationFlowName",
            	    											lv_integrationFlowName_4_0,
            	    											"org.eclipse.xtext.common.Terminals.ID");
            	    									

            	    }


            	    }

            	    // InternalEsbDsl.g:121:8: ( (lv_participants_5_0= ruleParticipantStatement ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==29) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalEsbDsl.g:122:9: (lv_participants_5_0= ruleParticipantStatement )
            	    	    {
            	    	    // InternalEsbDsl.g:122:9: (lv_participants_5_0= ruleParticipantStatement )
            	    	    // InternalEsbDsl.g:123:10: lv_participants_5_0= ruleParticipantStatement
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getModelAccess().getParticipantsParticipantStatementParserRuleCall_0_4_0());
            	    	    									
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_participants_5_0=ruleParticipantStatement();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"participants",
            	    	    											lv_participants_5_0,
            	    	    											"com.wso2.esb.dsl.EsbDsl.ParticipantStatement");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEsbDsl.g:146:3: ({...}? => ( ({...}? => ( ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '@enduml' ) ) ) )
            	    {
            	    // InternalEsbDsl.g:146:3: ({...}? => ( ({...}? => ( ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '@enduml' ) ) ) )
            	    // InternalEsbDsl.g:147:4: {...}? => ( ({...}? => ( ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '@enduml' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalEsbDsl.g:147:99: ( ({...}? => ( ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '@enduml' ) ) )
            	    // InternalEsbDsl.g:148:5: ({...}? => ( ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '@enduml' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalEsbDsl.g:151:8: ({...}? => ( ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '@enduml' ) )
            	    // InternalEsbDsl.g:151:9: {...}? => ( ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '@enduml' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalEsbDsl.g:151:18: ( ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '@enduml' )
            	    // InternalEsbDsl.g:151:19: ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '@enduml'
            	    {
            	    // InternalEsbDsl.g:151:19: ( (lv_statements_6_0= ruleStatement ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==RULE_ID||LA2_0==18||LA2_0==21||(LA2_0>=26 && LA2_0<=28)||(LA2_0>=37 && LA2_0<=43)) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalEsbDsl.g:152:9: (lv_statements_6_0= ruleStatement )
            	    	    {
            	    	    // InternalEsbDsl.g:152:9: (lv_statements_6_0= ruleStatement )
            	    	    // InternalEsbDsl.g:153:10: lv_statements_6_0= ruleStatement
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_1_0_0());
            	    	    									
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_statements_6_0=ruleStatement();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"statements",
            	    	    											lv_statements_6_0,
            	    	    											"com.wso2.esb.dsl.EsbDsl.Statement");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);

            	    otherlv_7=(Token)match(input,14,FOLLOW_8); 

            	    								newLeafNode(otherlv_7, grammarAccess.getModelAccess().getEndumlKeyword_1_1());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatement"
    // InternalEsbDsl.g:191:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalEsbDsl.g:191:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalEsbDsl.g:192:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalEsbDsl.g:198:1: ruleStatement returns [EObject current=null] : (this_MediatorStatement_0= ruleMediatorStatement | this_RoutingStatement_1= ruleRoutingStatement | this_ParallelStatement_2= ruleParallelStatement | this_IfStatement_3= ruleIfStatement | this_LoopStatement_4= ruleLoopStatement | this_GroupStatement_5= ruleGroupStatement | this_RefStatement_6= ruleRefStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_MediatorStatement_0 = null;

        EObject this_RoutingStatement_1 = null;

        EObject this_ParallelStatement_2 = null;

        EObject this_IfStatement_3 = null;

        EObject this_LoopStatement_4 = null;

        EObject this_GroupStatement_5 = null;

        EObject this_RefStatement_6 = null;



        	enterRule();

        try {
            // InternalEsbDsl.g:204:2: ( (this_MediatorStatement_0= ruleMediatorStatement | this_RoutingStatement_1= ruleRoutingStatement | this_ParallelStatement_2= ruleParallelStatement | this_IfStatement_3= ruleIfStatement | this_LoopStatement_4= ruleLoopStatement | this_GroupStatement_5= ruleGroupStatement | this_RefStatement_6= ruleRefStatement ) )
            // InternalEsbDsl.g:205:2: (this_MediatorStatement_0= ruleMediatorStatement | this_RoutingStatement_1= ruleRoutingStatement | this_ParallelStatement_2= ruleParallelStatement | this_IfStatement_3= ruleIfStatement | this_LoopStatement_4= ruleLoopStatement | this_GroupStatement_5= ruleGroupStatement | this_RefStatement_6= ruleRefStatement )
            {
            // InternalEsbDsl.g:205:2: (this_MediatorStatement_0= ruleMediatorStatement | this_RoutingStatement_1= ruleRoutingStatement | this_ParallelStatement_2= ruleParallelStatement | this_IfStatement_3= ruleIfStatement | this_LoopStatement_4= ruleLoopStatement | this_GroupStatement_5= ruleGroupStatement | this_RefStatement_6= ruleRefStatement )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            case 21:
                {
                alt4=4;
                }
                break;
            case 26:
                {
                alt4=5;
                }
                break;
            case 27:
                {
                alt4=6;
                }
                break;
            case 28:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalEsbDsl.g:206:3: this_MediatorStatement_0= ruleMediatorStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getMediatorStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MediatorStatement_0=ruleMediatorStatement();

                    state._fsp--;


                    			current = this_MediatorStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEsbDsl.g:215:3: this_RoutingStatement_1= ruleRoutingStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getRoutingStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RoutingStatement_1=ruleRoutingStatement();

                    state._fsp--;


                    			current = this_RoutingStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEsbDsl.g:224:3: this_ParallelStatement_2= ruleParallelStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getParallelStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParallelStatement_2=ruleParallelStatement();

                    state._fsp--;


                    			current = this_ParallelStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalEsbDsl.g:233:3: this_IfStatement_3= ruleIfStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfStatement_3=ruleIfStatement();

                    state._fsp--;


                    			current = this_IfStatement_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalEsbDsl.g:242:3: this_LoopStatement_4= ruleLoopStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getLoopStatementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_LoopStatement_4=ruleLoopStatement();

                    state._fsp--;


                    			current = this_LoopStatement_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalEsbDsl.g:251:3: this_GroupStatement_5= ruleGroupStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getGroupStatementParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_GroupStatement_5=ruleGroupStatement();

                    state._fsp--;


                    			current = this_GroupStatement_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalEsbDsl.g:260:3: this_RefStatement_6= ruleRefStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getRefStatementParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_RefStatement_6=ruleRefStatement();

                    state._fsp--;


                    			current = this_RefStatement_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleMediatorStatement"
    // InternalEsbDsl.g:272:1: entryRuleMediatorStatement returns [EObject current=null] : iv_ruleMediatorStatement= ruleMediatorStatement EOF ;
    public final EObject entryRuleMediatorStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMediatorStatement = null;


        try {
            // InternalEsbDsl.g:272:58: (iv_ruleMediatorStatement= ruleMediatorStatement EOF )
            // InternalEsbDsl.g:273:2: iv_ruleMediatorStatement= ruleMediatorStatement EOF
            {
             newCompositeNode(grammarAccess.getMediatorStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMediatorStatement=ruleMediatorStatement();

            state._fsp--;

             current =iv_ruleMediatorStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMediatorStatement"


    // $ANTLR start "ruleMediatorStatement"
    // InternalEsbDsl.g:279:1: ruleMediatorStatement returns [EObject current=null] : ( ( (lv_mediatorStatement_0_0= ruleMediatorType ) ) otherlv_1= '(' ( (lv_config_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleMediatorStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_config_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_mediatorStatement_0_0 = null;



        	enterRule();

        try {
            // InternalEsbDsl.g:285:2: ( ( ( (lv_mediatorStatement_0_0= ruleMediatorType ) ) otherlv_1= '(' ( (lv_config_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalEsbDsl.g:286:2: ( ( (lv_mediatorStatement_0_0= ruleMediatorType ) ) otherlv_1= '(' ( (lv_config_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalEsbDsl.g:286:2: ( ( (lv_mediatorStatement_0_0= ruleMediatorType ) ) otherlv_1= '(' ( (lv_config_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalEsbDsl.g:287:3: ( (lv_mediatorStatement_0_0= ruleMediatorType ) ) otherlv_1= '(' ( (lv_config_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            // InternalEsbDsl.g:287:3: ( (lv_mediatorStatement_0_0= ruleMediatorType ) )
            // InternalEsbDsl.g:288:4: (lv_mediatorStatement_0_0= ruleMediatorType )
            {
            // InternalEsbDsl.g:288:4: (lv_mediatorStatement_0_0= ruleMediatorType )
            // InternalEsbDsl.g:289:5: lv_mediatorStatement_0_0= ruleMediatorType
            {

            					newCompositeNode(grammarAccess.getMediatorStatementAccess().getMediatorStatementMediatorTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_mediatorStatement_0_0=ruleMediatorType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMediatorStatementRule());
            					}
            					set(
            						current,
            						"mediatorStatement",
            						lv_mediatorStatement_0_0,
            						"com.wso2.esb.dsl.EsbDsl.MediatorType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getMediatorStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEsbDsl.g:310:3: ( (lv_config_2_0= RULE_STRING ) )
            // InternalEsbDsl.g:311:4: (lv_config_2_0= RULE_STRING )
            {
            // InternalEsbDsl.g:311:4: (lv_config_2_0= RULE_STRING )
            // InternalEsbDsl.g:312:5: lv_config_2_0= RULE_STRING
            {
            lv_config_2_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_config_2_0, grammarAccess.getMediatorStatementAccess().getConfigSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMediatorStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"config",
            						lv_config_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getMediatorStatementAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMediatorStatement"


    // $ANTLR start "entryRuleRoutingStatement"
    // InternalEsbDsl.g:336:1: entryRuleRoutingStatement returns [EObject current=null] : iv_ruleRoutingStatement= ruleRoutingStatement EOF ;
    public final EObject entryRuleRoutingStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoutingStatement = null;


        try {
            // InternalEsbDsl.g:336:57: (iv_ruleRoutingStatement= ruleRoutingStatement EOF )
            // InternalEsbDsl.g:337:2: iv_ruleRoutingStatement= ruleRoutingStatement EOF
            {
             newCompositeNode(grammarAccess.getRoutingStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoutingStatement=ruleRoutingStatement();

            state._fsp--;

             current =iv_ruleRoutingStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoutingStatement"


    // $ANTLR start "ruleRoutingStatement"
    // InternalEsbDsl.g:343:1: ruleRoutingStatement returns [EObject current=null] : ( ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_action_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleRoutingStatement() throws RecognitionException {
        EObject current = null;

        Token lv_source_0_0=null;
        Token otherlv_1=null;
        Token lv_target_2_0=null;
        Token otherlv_3=null;
        Token lv_action_4_0=null;


        	enterRule();

        try {
            // InternalEsbDsl.g:349:2: ( ( ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_action_4_0= RULE_STRING ) ) ) )
            // InternalEsbDsl.g:350:2: ( ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_action_4_0= RULE_STRING ) ) )
            {
            // InternalEsbDsl.g:350:2: ( ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_action_4_0= RULE_STRING ) ) )
            // InternalEsbDsl.g:351:3: ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_action_4_0= RULE_STRING ) )
            {
            // InternalEsbDsl.g:351:3: ( (lv_source_0_0= RULE_ID ) )
            // InternalEsbDsl.g:352:4: (lv_source_0_0= RULE_ID )
            {
            // InternalEsbDsl.g:352:4: (lv_source_0_0= RULE_ID )
            // InternalEsbDsl.g:353:5: lv_source_0_0= RULE_ID
            {
            lv_source_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_source_0_0, grammarAccess.getRoutingStatementAccess().getSourceIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoutingStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"source",
            						lv_source_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRoutingStatementAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalEsbDsl.g:373:3: ( (lv_target_2_0= RULE_ID ) )
            // InternalEsbDsl.g:374:4: (lv_target_2_0= RULE_ID )
            {
            // InternalEsbDsl.g:374:4: (lv_target_2_0= RULE_ID )
            // InternalEsbDsl.g:375:5: lv_target_2_0= RULE_ID
            {
            lv_target_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_target_2_0, grammarAccess.getRoutingStatementAccess().getTargetIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoutingStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getRoutingStatementAccess().getColonKeyword_3());
            		
            // InternalEsbDsl.g:395:3: ( (lv_action_4_0= RULE_STRING ) )
            // InternalEsbDsl.g:396:4: (lv_action_4_0= RULE_STRING )
            {
            // InternalEsbDsl.g:396:4: (lv_action_4_0= RULE_STRING )
            // InternalEsbDsl.g:397:5: lv_action_4_0= RULE_STRING
            {
            lv_action_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_action_4_0, grammarAccess.getRoutingStatementAccess().getActionSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoutingStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"action",
            						lv_action_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoutingStatement"


    // $ANTLR start "entryRuleParallelStatement"
    // InternalEsbDsl.g:417:1: entryRuleParallelStatement returns [EObject current=null] : iv_ruleParallelStatement= ruleParallelStatement EOF ;
    public final EObject entryRuleParallelStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallelStatement = null;


        try {
            // InternalEsbDsl.g:417:58: (iv_ruleParallelStatement= ruleParallelStatement EOF )
            // InternalEsbDsl.g:418:2: iv_ruleParallelStatement= ruleParallelStatement EOF
            {
             newCompositeNode(grammarAccess.getParallelStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParallelStatement=ruleParallelStatement();

            state._fsp--;

             current =iv_ruleParallelStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParallelStatement"


    // $ANTLR start "ruleParallelStatement"
    // InternalEsbDsl.g:424:1: ruleParallelStatement returns [EObject current=null] : (otherlv_0= 'par' ( (lv_parstatements_1_0= ruleStatement ) )* (otherlv_2= 'else' ( (lv_elsestatements_3_0= ruleStatement ) )* )* otherlv_4= 'end' ) ;
    public final EObject ruleParallelStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parstatements_1_0 = null;

        EObject lv_elsestatements_3_0 = null;



        	enterRule();

        try {
            // InternalEsbDsl.g:430:2: ( (otherlv_0= 'par' ( (lv_parstatements_1_0= ruleStatement ) )* (otherlv_2= 'else' ( (lv_elsestatements_3_0= ruleStatement ) )* )* otherlv_4= 'end' ) )
            // InternalEsbDsl.g:431:2: (otherlv_0= 'par' ( (lv_parstatements_1_0= ruleStatement ) )* (otherlv_2= 'else' ( (lv_elsestatements_3_0= ruleStatement ) )* )* otherlv_4= 'end' )
            {
            // InternalEsbDsl.g:431:2: (otherlv_0= 'par' ( (lv_parstatements_1_0= ruleStatement ) )* (otherlv_2= 'else' ( (lv_elsestatements_3_0= ruleStatement ) )* )* otherlv_4= 'end' )
            // InternalEsbDsl.g:432:3: otherlv_0= 'par' ( (lv_parstatements_1_0= ruleStatement ) )* (otherlv_2= 'else' ( (lv_elsestatements_3_0= ruleStatement ) )* )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getParallelStatementAccess().getParKeyword_0());
            		
            // InternalEsbDsl.g:436:3: ( (lv_parstatements_1_0= ruleStatement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==18||LA5_0==21||(LA5_0>=26 && LA5_0<=28)||(LA5_0>=37 && LA5_0<=43)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEsbDsl.g:437:4: (lv_parstatements_1_0= ruleStatement )
            	    {
            	    // InternalEsbDsl.g:437:4: (lv_parstatements_1_0= ruleStatement )
            	    // InternalEsbDsl.g:438:5: lv_parstatements_1_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getParallelStatementAccess().getParstatementsStatementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_parstatements_1_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParallelStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parstatements",
            	    						lv_parstatements_1_0,
            	    						"com.wso2.esb.dsl.EsbDsl.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalEsbDsl.g:455:3: (otherlv_2= 'else' ( (lv_elsestatements_3_0= ruleStatement ) )* )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEsbDsl.g:456:4: otherlv_2= 'else' ( (lv_elsestatements_3_0= ruleStatement ) )*
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_13); 

            	    				newLeafNode(otherlv_2, grammarAccess.getParallelStatementAccess().getElseKeyword_2_0());
            	    			
            	    // InternalEsbDsl.g:460:4: ( (lv_elsestatements_3_0= ruleStatement ) )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==RULE_ID||LA6_0==18||LA6_0==21||(LA6_0>=26 && LA6_0<=28)||(LA6_0>=37 && LA6_0<=43)) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalEsbDsl.g:461:5: (lv_elsestatements_3_0= ruleStatement )
            	    	    {
            	    	    // InternalEsbDsl.g:461:5: (lv_elsestatements_3_0= ruleStatement )
            	    	    // InternalEsbDsl.g:462:6: lv_elsestatements_3_0= ruleStatement
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getParallelStatementAccess().getElsestatementsStatementParserRuleCall_2_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_13);
            	    	    lv_elsestatements_3_0=ruleStatement();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getParallelStatementRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"elsestatements",
            	    	    							lv_elsestatements_3_0,
            	    	    							"com.wso2.esb.dsl.EsbDsl.Statement");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParallelStatementAccess().getEndKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParallelStatement"


    // $ANTLR start "entryRuleIfStatement"
    // InternalEsbDsl.g:488:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalEsbDsl.g:488:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalEsbDsl.g:489:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             newCompositeNode(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;

             current =iv_ruleIfStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalEsbDsl.g:495:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'alt' otherlv_1= 'condition' otherlv_2= '(' otherlv_3= 'source' otherlv_4= '(' ( (lv_routeId_5_0= RULE_STRING ) ) otherlv_6= ',' ( (lv_transport_7_0= RULE_STRING ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'pattern' otherlv_11= '(' ( (lv_pattern_12_0= RULE_STRING ) ) otherlv_13= ')' otherlv_14= ')' ( (lv_altstatements_15_0= ruleStatement ) )* (otherlv_16= 'else' ( (lv_elsestatements_17_0= ruleStatement ) )* )* otherlv_18= 'end' ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_routeId_5_0=null;
        Token otherlv_6=null;
        Token lv_transport_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_pattern_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_altstatements_15_0 = null;

        EObject lv_elsestatements_17_0 = null;



        	enterRule();

        try {
            // InternalEsbDsl.g:501:2: ( (otherlv_0= 'alt' otherlv_1= 'condition' otherlv_2= '(' otherlv_3= 'source' otherlv_4= '(' ( (lv_routeId_5_0= RULE_STRING ) ) otherlv_6= ',' ( (lv_transport_7_0= RULE_STRING ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'pattern' otherlv_11= '(' ( (lv_pattern_12_0= RULE_STRING ) ) otherlv_13= ')' otherlv_14= ')' ( (lv_altstatements_15_0= ruleStatement ) )* (otherlv_16= 'else' ( (lv_elsestatements_17_0= ruleStatement ) )* )* otherlv_18= 'end' ) )
            // InternalEsbDsl.g:502:2: (otherlv_0= 'alt' otherlv_1= 'condition' otherlv_2= '(' otherlv_3= 'source' otherlv_4= '(' ( (lv_routeId_5_0= RULE_STRING ) ) otherlv_6= ',' ( (lv_transport_7_0= RULE_STRING ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'pattern' otherlv_11= '(' ( (lv_pattern_12_0= RULE_STRING ) ) otherlv_13= ')' otherlv_14= ')' ( (lv_altstatements_15_0= ruleStatement ) )* (otherlv_16= 'else' ( (lv_elsestatements_17_0= ruleStatement ) )* )* otherlv_18= 'end' )
            {
            // InternalEsbDsl.g:502:2: (otherlv_0= 'alt' otherlv_1= 'condition' otherlv_2= '(' otherlv_3= 'source' otherlv_4= '(' ( (lv_routeId_5_0= RULE_STRING ) ) otherlv_6= ',' ( (lv_transport_7_0= RULE_STRING ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'pattern' otherlv_11= '(' ( (lv_pattern_12_0= RULE_STRING ) ) otherlv_13= ')' otherlv_14= ')' ( (lv_altstatements_15_0= ruleStatement ) )* (otherlv_16= 'else' ( (lv_elsestatements_17_0= ruleStatement ) )* )* otherlv_18= 'end' )
            // InternalEsbDsl.g:503:3: otherlv_0= 'alt' otherlv_1= 'condition' otherlv_2= '(' otherlv_3= 'source' otherlv_4= '(' ( (lv_routeId_5_0= RULE_STRING ) ) otherlv_6= ',' ( (lv_transport_7_0= RULE_STRING ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'pattern' otherlv_11= '(' ( (lv_pattern_12_0= RULE_STRING ) ) otherlv_13= ')' otherlv_14= ')' ( (lv_altstatements_15_0= ruleStatement ) )* (otherlv_16= 'else' ( (lv_elsestatements_17_0= ruleStatement ) )* )* otherlv_18= 'end'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getAltKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getConditionKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getSourceKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_4());
            		
            // InternalEsbDsl.g:523:3: ( (lv_routeId_5_0= RULE_STRING ) )
            // InternalEsbDsl.g:524:4: (lv_routeId_5_0= RULE_STRING )
            {
            // InternalEsbDsl.g:524:4: (lv_routeId_5_0= RULE_STRING )
            // InternalEsbDsl.g:525:5: lv_routeId_5_0= RULE_STRING
            {
            lv_routeId_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_routeId_5_0, grammarAccess.getIfStatementAccess().getRouteIdSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIfStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"routeId",
            						lv_routeId_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getIfStatementAccess().getCommaKeyword_6());
            		
            // InternalEsbDsl.g:545:3: ( (lv_transport_7_0= RULE_STRING ) )
            // InternalEsbDsl.g:546:4: (lv_transport_7_0= RULE_STRING )
            {
            // InternalEsbDsl.g:546:4: (lv_transport_7_0= RULE_STRING )
            // InternalEsbDsl.g:547:5: lv_transport_7_0= RULE_STRING
            {
            lv_transport_7_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_transport_7_0, grammarAccess.getIfStatementAccess().getTransportSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIfStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"transport",
            						lv_transport_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_8, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_8());
            		
            otherlv_9=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_9, grammarAccess.getIfStatementAccess().getCommaKeyword_9());
            		
            otherlv_10=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getIfStatementAccess().getPatternKeyword_10());
            		
            otherlv_11=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_11());
            		
            // InternalEsbDsl.g:579:3: ( (lv_pattern_12_0= RULE_STRING ) )
            // InternalEsbDsl.g:580:4: (lv_pattern_12_0= RULE_STRING )
            {
            // InternalEsbDsl.g:580:4: (lv_pattern_12_0= RULE_STRING )
            // InternalEsbDsl.g:581:5: lv_pattern_12_0= RULE_STRING
            {
            lv_pattern_12_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_pattern_12_0, grammarAccess.getIfStatementAccess().getPatternSTRINGTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIfStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pattern",
            						lv_pattern_12_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_13=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_13, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_13());
            		
            otherlv_14=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_14, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_14());
            		
            // InternalEsbDsl.g:605:3: ( (lv_altstatements_15_0= ruleStatement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==18||LA8_0==21||(LA8_0>=26 && LA8_0<=28)||(LA8_0>=37 && LA8_0<=43)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEsbDsl.g:606:4: (lv_altstatements_15_0= ruleStatement )
            	    {
            	    // InternalEsbDsl.g:606:4: (lv_altstatements_15_0= ruleStatement )
            	    // InternalEsbDsl.g:607:5: lv_altstatements_15_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getIfStatementAccess().getAltstatementsStatementParserRuleCall_15_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_altstatements_15_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"altstatements",
            	    						lv_altstatements_15_0,
            	    						"com.wso2.esb.dsl.EsbDsl.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalEsbDsl.g:624:3: (otherlv_16= 'else' ( (lv_elsestatements_17_0= ruleStatement ) )* )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEsbDsl.g:625:4: otherlv_16= 'else' ( (lv_elsestatements_17_0= ruleStatement ) )*
            	    {
            	    otherlv_16=(Token)match(input,19,FOLLOW_13); 

            	    				newLeafNode(otherlv_16, grammarAccess.getIfStatementAccess().getElseKeyword_16_0());
            	    			
            	    // InternalEsbDsl.g:629:4: ( (lv_elsestatements_17_0= ruleStatement ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==RULE_ID||LA9_0==18||LA9_0==21||(LA9_0>=26 && LA9_0<=28)||(LA9_0>=37 && LA9_0<=43)) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalEsbDsl.g:630:5: (lv_elsestatements_17_0= ruleStatement )
            	    	    {
            	    	    // InternalEsbDsl.g:630:5: (lv_elsestatements_17_0= ruleStatement )
            	    	    // InternalEsbDsl.g:631:6: lv_elsestatements_17_0= ruleStatement
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getIfStatementAccess().getElsestatementsStatementParserRuleCall_16_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_13);
            	    	    lv_elsestatements_17_0=ruleStatement();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"elsestatements",
            	    	    							lv_elsestatements_17_0,
            	    	    							"com.wso2.esb.dsl.EsbDsl.Statement");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_18=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getIfStatementAccess().getEndKeyword_17());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleLoopStatement"
    // InternalEsbDsl.g:657:1: entryRuleLoopStatement returns [EObject current=null] : iv_ruleLoopStatement= ruleLoopStatement EOF ;
    public final EObject entryRuleLoopStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopStatement = null;


        try {
            // InternalEsbDsl.g:657:54: (iv_ruleLoopStatement= ruleLoopStatement EOF )
            // InternalEsbDsl.g:658:2: iv_ruleLoopStatement= ruleLoopStatement EOF
            {
             newCompositeNode(grammarAccess.getLoopStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoopStatement=ruleLoopStatement();

            state._fsp--;

             current =iv_ruleLoopStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoopStatement"


    // $ANTLR start "ruleLoopStatement"
    // InternalEsbDsl.g:664:1: ruleLoopStatement returns [EObject current=null] : (otherlv_0= 'loop' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLoopStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalEsbDsl.g:670:2: ( (otherlv_0= 'loop' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalEsbDsl.g:671:2: (otherlv_0= 'loop' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalEsbDsl.g:671:2: (otherlv_0= 'loop' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalEsbDsl.g:672:3: otherlv_0= 'loop' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopStatementAccess().getLoopKeyword_0());
            		
            // InternalEsbDsl.g:676:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEsbDsl.g:677:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEsbDsl.g:677:4: (lv_name_1_0= RULE_ID )
            // InternalEsbDsl.g:678:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLoopStatementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoopStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoopStatement"


    // $ANTLR start "entryRuleGroupStatement"
    // InternalEsbDsl.g:698:1: entryRuleGroupStatement returns [EObject current=null] : iv_ruleGroupStatement= ruleGroupStatement EOF ;
    public final EObject entryRuleGroupStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupStatement = null;


        try {
            // InternalEsbDsl.g:698:55: (iv_ruleGroupStatement= ruleGroupStatement EOF )
            // InternalEsbDsl.g:699:2: iv_ruleGroupStatement= ruleGroupStatement EOF
            {
             newCompositeNode(grammarAccess.getGroupStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroupStatement=ruleGroupStatement();

            state._fsp--;

             current =iv_ruleGroupStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupStatement"


    // $ANTLR start "ruleGroupStatement"
    // InternalEsbDsl.g:705:1: ruleGroupStatement returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleGroupStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalEsbDsl.g:711:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalEsbDsl.g:712:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalEsbDsl.g:712:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalEsbDsl.g:713:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupStatementAccess().getGroupKeyword_0());
            		
            // InternalEsbDsl.g:717:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEsbDsl.g:718:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEsbDsl.g:718:4: (lv_name_1_0= RULE_ID )
            // InternalEsbDsl.g:719:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGroupStatementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupStatement"


    // $ANTLR start "entryRuleRefStatement"
    // InternalEsbDsl.g:739:1: entryRuleRefStatement returns [EObject current=null] : iv_ruleRefStatement= ruleRefStatement EOF ;
    public final EObject entryRuleRefStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefStatement = null;


        try {
            // InternalEsbDsl.g:739:53: (iv_ruleRefStatement= ruleRefStatement EOF )
            // InternalEsbDsl.g:740:2: iv_ruleRefStatement= ruleRefStatement EOF
            {
             newCompositeNode(grammarAccess.getRefStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefStatement=ruleRefStatement();

            state._fsp--;

             current =iv_ruleRefStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefStatement"


    // $ANTLR start "ruleRefStatement"
    // InternalEsbDsl.g:746:1: ruleRefStatement returns [EObject current=null] : (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleRefStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalEsbDsl.g:752:2: ( (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalEsbDsl.g:753:2: (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalEsbDsl.g:753:2: (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalEsbDsl.g:754:3: otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRefStatementAccess().getRefKeyword_0());
            		
            // InternalEsbDsl.g:758:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEsbDsl.g:759:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEsbDsl.g:759:4: (lv_name_1_0= RULE_ID )
            // InternalEsbDsl.g:760:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRefStatementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRefStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefStatement"


    // $ANTLR start "entryRuleParticipantStatement"
    // InternalEsbDsl.g:780:1: entryRuleParticipantStatement returns [EObject current=null] : iv_ruleParticipantStatement= ruleParticipantStatement EOF ;
    public final EObject entryRuleParticipantStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipantStatement = null;


        try {
            // InternalEsbDsl.g:780:61: (iv_ruleParticipantStatement= ruleParticipantStatement EOF )
            // InternalEsbDsl.g:781:2: iv_ruleParticipantStatement= ruleParticipantStatement EOF
            {
             newCompositeNode(grammarAccess.getParticipantStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParticipantStatement=ruleParticipantStatement();

            state._fsp--;

             current =iv_ruleParticipantStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParticipantStatement"


    // $ANTLR start "ruleParticipantStatement"
    // InternalEsbDsl.g:787:1: ruleParticipantStatement returns [EObject current=null] : ( (otherlv_0= 'participant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_participantType_3_0= ruleParticipantType ) ) otherlv_4= '(' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ')' ) | (otherlv_7= 'participant' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_outbounds_10_0= ruleOutboundEndpointDef ) ) ) | (otherlv_11= 'participant' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ':' ( (lv_inbounds_14_0= ruleInboundEndpointDef ) ) ) ) ;
    public final EObject ruleParticipantStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_name_12_0=null;
        Token otherlv_13=null;
        Enumerator lv_participantType_3_0 = null;

        EObject lv_outbounds_10_0 = null;

        EObject lv_inbounds_14_0 = null;



        	enterRule();

        try {
            // InternalEsbDsl.g:793:2: ( ( (otherlv_0= 'participant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_participantType_3_0= ruleParticipantType ) ) otherlv_4= '(' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ')' ) | (otherlv_7= 'participant' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_outbounds_10_0= ruleOutboundEndpointDef ) ) ) | (otherlv_11= 'participant' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ':' ( (lv_inbounds_14_0= ruleInboundEndpointDef ) ) ) ) )
            // InternalEsbDsl.g:794:2: ( (otherlv_0= 'participant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_participantType_3_0= ruleParticipantType ) ) otherlv_4= '(' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ')' ) | (otherlv_7= 'participant' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_outbounds_10_0= ruleOutboundEndpointDef ) ) ) | (otherlv_11= 'participant' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ':' ( (lv_inbounds_14_0= ruleInboundEndpointDef ) ) ) )
            {
            // InternalEsbDsl.g:794:2: ( (otherlv_0= 'participant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_participantType_3_0= ruleParticipantType ) ) otherlv_4= '(' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ')' ) | (otherlv_7= 'participant' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_outbounds_10_0= ruleOutboundEndpointDef ) ) ) | (otherlv_11= 'participant' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ':' ( (lv_inbounds_14_0= ruleInboundEndpointDef ) ) ) )
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalEsbDsl.g:795:3: (otherlv_0= 'participant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_participantType_3_0= ruleParticipantType ) ) otherlv_4= '(' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ')' )
                    {
                    // InternalEsbDsl.g:795:3: (otherlv_0= 'participant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_participantType_3_0= ruleParticipantType ) ) otherlv_4= '(' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ')' )
                    // InternalEsbDsl.g:796:4: otherlv_0= 'participant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_participantType_3_0= ruleParticipantType ) ) otherlv_4= '(' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ')'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getParticipantStatementAccess().getParticipantKeyword_0_0());
                    			
                    // InternalEsbDsl.g:800:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalEsbDsl.g:801:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalEsbDsl.g:801:5: (lv_name_1_0= RULE_ID )
                    // InternalEsbDsl.g:802:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getParticipantStatementAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParticipantStatementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getParticipantStatementAccess().getColonKeyword_0_2());
                    			
                    // InternalEsbDsl.g:822:4: ( (lv_participantType_3_0= ruleParticipantType ) )
                    // InternalEsbDsl.g:823:5: (lv_participantType_3_0= ruleParticipantType )
                    {
                    // InternalEsbDsl.g:823:5: (lv_participantType_3_0= ruleParticipantType )
                    // InternalEsbDsl.g:824:6: lv_participantType_3_0= ruleParticipantType
                    {

                    						newCompositeNode(grammarAccess.getParticipantStatementAccess().getParticipantTypeParticipantTypeEnumRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_participantType_3_0=ruleParticipantType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParticipantStatementRule());
                    						}
                    						set(
                    							current,
                    							"participantType",
                    							lv_participantType_3_0,
                    							"com.wso2.esb.dsl.EsbDsl.ParticipantType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getParticipantStatementAccess().getLeftParenthesisKeyword_0_4());
                    			
                    // InternalEsbDsl.g:845:4: ( (lv_description_5_0= RULE_STRING ) )
                    // InternalEsbDsl.g:846:5: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalEsbDsl.g:846:5: (lv_description_5_0= RULE_STRING )
                    // InternalEsbDsl.g:847:6: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    						newLeafNode(lv_description_5_0, grammarAccess.getParticipantStatementAccess().getDescriptionSTRINGTerminalRuleCall_0_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParticipantStatementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getParticipantStatementAccess().getRightParenthesisKeyword_0_6());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEsbDsl.g:869:3: (otherlv_7= 'participant' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_outbounds_10_0= ruleOutboundEndpointDef ) ) )
                    {
                    // InternalEsbDsl.g:869:3: (otherlv_7= 'participant' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_outbounds_10_0= ruleOutboundEndpointDef ) ) )
                    // InternalEsbDsl.g:870:4: otherlv_7= 'participant' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_outbounds_10_0= ruleOutboundEndpointDef ) )
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getParticipantStatementAccess().getParticipantKeyword_1_0());
                    			
                    // InternalEsbDsl.g:874:4: ( (lv_name_8_0= RULE_ID ) )
                    // InternalEsbDsl.g:875:5: (lv_name_8_0= RULE_ID )
                    {
                    // InternalEsbDsl.g:875:5: (lv_name_8_0= RULE_ID )
                    // InternalEsbDsl.g:876:6: lv_name_8_0= RULE_ID
                    {
                    lv_name_8_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(lv_name_8_0, grammarAccess.getParticipantStatementAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParticipantStatementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,13,FOLLOW_19); 

                    				newLeafNode(otherlv_9, grammarAccess.getParticipantStatementAccess().getColonKeyword_1_2());
                    			
                    // InternalEsbDsl.g:896:4: ( (lv_outbounds_10_0= ruleOutboundEndpointDef ) )
                    // InternalEsbDsl.g:897:5: (lv_outbounds_10_0= ruleOutboundEndpointDef )
                    {
                    // InternalEsbDsl.g:897:5: (lv_outbounds_10_0= ruleOutboundEndpointDef )
                    // InternalEsbDsl.g:898:6: lv_outbounds_10_0= ruleOutboundEndpointDef
                    {

                    						newCompositeNode(grammarAccess.getParticipantStatementAccess().getOutboundsOutboundEndpointDefParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_outbounds_10_0=ruleOutboundEndpointDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParticipantStatementRule());
                    						}
                    						set(
                    							current,
                    							"outbounds",
                    							lv_outbounds_10_0,
                    							"com.wso2.esb.dsl.EsbDsl.OutboundEndpointDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEsbDsl.g:917:3: (otherlv_11= 'participant' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ':' ( (lv_inbounds_14_0= ruleInboundEndpointDef ) ) )
                    {
                    // InternalEsbDsl.g:917:3: (otherlv_11= 'participant' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ':' ( (lv_inbounds_14_0= ruleInboundEndpointDef ) ) )
                    // InternalEsbDsl.g:918:4: otherlv_11= 'participant' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ':' ( (lv_inbounds_14_0= ruleInboundEndpointDef ) )
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_5); 

                    				newLeafNode(otherlv_11, grammarAccess.getParticipantStatementAccess().getParticipantKeyword_2_0());
                    			
                    // InternalEsbDsl.g:922:4: ( (lv_name_12_0= RULE_ID ) )
                    // InternalEsbDsl.g:923:5: (lv_name_12_0= RULE_ID )
                    {
                    // InternalEsbDsl.g:923:5: (lv_name_12_0= RULE_ID )
                    // InternalEsbDsl.g:924:6: lv_name_12_0= RULE_ID
                    {
                    lv_name_12_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(lv_name_12_0, grammarAccess.getParticipantStatementAccess().getNameIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParticipantStatementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_12_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,13,FOLLOW_20); 

                    				newLeafNode(otherlv_13, grammarAccess.getParticipantStatementAccess().getColonKeyword_2_2());
                    			
                    // InternalEsbDsl.g:944:4: ( (lv_inbounds_14_0= ruleInboundEndpointDef ) )
                    // InternalEsbDsl.g:945:5: (lv_inbounds_14_0= ruleInboundEndpointDef )
                    {
                    // InternalEsbDsl.g:945:5: (lv_inbounds_14_0= ruleInboundEndpointDef )
                    // InternalEsbDsl.g:946:6: lv_inbounds_14_0= ruleInboundEndpointDef
                    {

                    						newCompositeNode(grammarAccess.getParticipantStatementAccess().getInboundsInboundEndpointDefParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_inbounds_14_0=ruleInboundEndpointDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParticipantStatementRule());
                    						}
                    						set(
                    							current,
                    							"inbounds",
                    							lv_inbounds_14_0,
                    							"com.wso2.esb.dsl.EsbDsl.InboundEndpointDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParticipantStatement"


    // $ANTLR start "entryRuleOutboundEndpointDef"
    // InternalEsbDsl.g:968:1: entryRuleOutboundEndpointDef returns [EObject current=null] : iv_ruleOutboundEndpointDef= ruleOutboundEndpointDef EOF ;
    public final EObject entryRuleOutboundEndpointDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutboundEndpointDef = null;


        try {
            // InternalEsbDsl.g:968:60: (iv_ruleOutboundEndpointDef= ruleOutboundEndpointDef EOF )
            // InternalEsbDsl.g:969:2: iv_ruleOutboundEndpointDef= ruleOutboundEndpointDef EOF
            {
             newCompositeNode(grammarAccess.getOutboundEndpointDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutboundEndpointDef=ruleOutboundEndpointDef();

            state._fsp--;

             current =iv_ruleOutboundEndpointDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutboundEndpointDef"


    // $ANTLR start "ruleOutboundEndpointDef"
    // InternalEsbDsl.g:975:1: ruleOutboundEndpointDef returns [EObject current=null] : (otherlv_0= 'OutboundEndpoint' (otherlv_1= '(' )+ otherlv_2= 'protocol' otherlv_3= '(' ( (lv_protocol_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ',' otherlv_7= 'host' otherlv_8= '(' ( (lv_host_9_0= RULE_STRING ) ) otherlv_10= ')' otherlv_11= ')' ) ;
    public final EObject ruleOutboundEndpointDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_protocol_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_host_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalEsbDsl.g:981:2: ( (otherlv_0= 'OutboundEndpoint' (otherlv_1= '(' )+ otherlv_2= 'protocol' otherlv_3= '(' ( (lv_protocol_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ',' otherlv_7= 'host' otherlv_8= '(' ( (lv_host_9_0= RULE_STRING ) ) otherlv_10= ')' otherlv_11= ')' ) )
            // InternalEsbDsl.g:982:2: (otherlv_0= 'OutboundEndpoint' (otherlv_1= '(' )+ otherlv_2= 'protocol' otherlv_3= '(' ( (lv_protocol_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ',' otherlv_7= 'host' otherlv_8= '(' ( (lv_host_9_0= RULE_STRING ) ) otherlv_10= ')' otherlv_11= ')' )
            {
            // InternalEsbDsl.g:982:2: (otherlv_0= 'OutboundEndpoint' (otherlv_1= '(' )+ otherlv_2= 'protocol' otherlv_3= '(' ( (lv_protocol_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ',' otherlv_7= 'host' otherlv_8= '(' ( (lv_host_9_0= RULE_STRING ) ) otherlv_10= ')' otherlv_11= ')' )
            // InternalEsbDsl.g:983:3: otherlv_0= 'OutboundEndpoint' (otherlv_1= '(' )+ otherlv_2= 'protocol' otherlv_3= '(' ( (lv_protocol_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ',' otherlv_7= 'host' otherlv_8= '(' ( (lv_host_9_0= RULE_STRING ) ) otherlv_10= ')' otherlv_11= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getOutboundEndpointDefAccess().getOutboundEndpointKeyword_0());
            		
            // InternalEsbDsl.g:987:3: (otherlv_1= '(' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEsbDsl.g:988:4: otherlv_1= '('
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_21); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOutboundEndpointDefAccess().getLeftParenthesisKeyword_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_2=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getOutboundEndpointDefAccess().getProtocolKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getOutboundEndpointDefAccess().getLeftParenthesisKeyword_3());
            		
            // InternalEsbDsl.g:1001:3: ( (lv_protocol_4_0= RULE_STRING ) )
            // InternalEsbDsl.g:1002:4: (lv_protocol_4_0= RULE_STRING )
            {
            // InternalEsbDsl.g:1002:4: (lv_protocol_4_0= RULE_STRING )
            // InternalEsbDsl.g:1003:5: lv_protocol_4_0= RULE_STRING
            {
            lv_protocol_4_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_protocol_4_0, grammarAccess.getOutboundEndpointDefAccess().getProtocolSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutboundEndpointDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"protocol",
            						lv_protocol_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getOutboundEndpointDefAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getOutboundEndpointDefAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getOutboundEndpointDefAccess().getHostKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getOutboundEndpointDefAccess().getLeftParenthesisKeyword_8());
            		
            // InternalEsbDsl.g:1035:3: ( (lv_host_9_0= RULE_STRING ) )
            // InternalEsbDsl.g:1036:4: (lv_host_9_0= RULE_STRING )
            {
            // InternalEsbDsl.g:1036:4: (lv_host_9_0= RULE_STRING )
            // InternalEsbDsl.g:1037:5: lv_host_9_0= RULE_STRING
            {
            lv_host_9_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_host_9_0, grammarAccess.getOutboundEndpointDefAccess().getHostSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutboundEndpointDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"host",
            						lv_host_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getOutboundEndpointDefAccess().getRightParenthesisKeyword_10());
            		
            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getOutboundEndpointDefAccess().getRightParenthesisKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutboundEndpointDef"


    // $ANTLR start "entryRuleInboundEndpointDef"
    // InternalEsbDsl.g:1065:1: entryRuleInboundEndpointDef returns [EObject current=null] : iv_ruleInboundEndpointDef= ruleInboundEndpointDef EOF ;
    public final EObject entryRuleInboundEndpointDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInboundEndpointDef = null;


        try {
            // InternalEsbDsl.g:1065:59: (iv_ruleInboundEndpointDef= ruleInboundEndpointDef EOF )
            // InternalEsbDsl.g:1066:2: iv_ruleInboundEndpointDef= ruleInboundEndpointDef EOF
            {
             newCompositeNode(grammarAccess.getInboundEndpointDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInboundEndpointDef=ruleInboundEndpointDef();

            state._fsp--;

             current =iv_ruleInboundEndpointDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInboundEndpointDef"


    // $ANTLR start "ruleInboundEndpointDef"
    // InternalEsbDsl.g:1072:1: ruleInboundEndpointDef returns [EObject current=null] : (otherlv_0= 'InboundEndpoint' (otherlv_1= '(' )+ otherlv_2= 'protocol' otherlv_3= '(' ( (lv_protocol_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ',' otherlv_7= 'port' otherlv_8= '(' ( (lv_port_9_0= RULE_INT ) ) otherlv_10= ')' otherlv_11= ',' otherlv_12= 'context' otherlv_13= '(' ( (lv_context_14_0= RULE_STRING ) ) otherlv_15= ')' otherlv_16= ')' ) ;
    public final EObject ruleInboundEndpointDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_protocol_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_port_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_context_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;


        	enterRule();

        try {
            // InternalEsbDsl.g:1078:2: ( (otherlv_0= 'InboundEndpoint' (otherlv_1= '(' )+ otherlv_2= 'protocol' otherlv_3= '(' ( (lv_protocol_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ',' otherlv_7= 'port' otherlv_8= '(' ( (lv_port_9_0= RULE_INT ) ) otherlv_10= ')' otherlv_11= ',' otherlv_12= 'context' otherlv_13= '(' ( (lv_context_14_0= RULE_STRING ) ) otherlv_15= ')' otherlv_16= ')' ) )
            // InternalEsbDsl.g:1079:2: (otherlv_0= 'InboundEndpoint' (otherlv_1= '(' )+ otherlv_2= 'protocol' otherlv_3= '(' ( (lv_protocol_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ',' otherlv_7= 'port' otherlv_8= '(' ( (lv_port_9_0= RULE_INT ) ) otherlv_10= ')' otherlv_11= ',' otherlv_12= 'context' otherlv_13= '(' ( (lv_context_14_0= RULE_STRING ) ) otherlv_15= ')' otherlv_16= ')' )
            {
            // InternalEsbDsl.g:1079:2: (otherlv_0= 'InboundEndpoint' (otherlv_1= '(' )+ otherlv_2= 'protocol' otherlv_3= '(' ( (lv_protocol_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ',' otherlv_7= 'port' otherlv_8= '(' ( (lv_port_9_0= RULE_INT ) ) otherlv_10= ')' otherlv_11= ',' otherlv_12= 'context' otherlv_13= '(' ( (lv_context_14_0= RULE_STRING ) ) otherlv_15= ')' otherlv_16= ')' )
            // InternalEsbDsl.g:1080:3: otherlv_0= 'InboundEndpoint' (otherlv_1= '(' )+ otherlv_2= 'protocol' otherlv_3= '(' ( (lv_protocol_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ',' otherlv_7= 'port' otherlv_8= '(' ( (lv_port_9_0= RULE_INT ) ) otherlv_10= ')' otherlv_11= ',' otherlv_12= 'context' otherlv_13= '(' ( (lv_context_14_0= RULE_STRING ) ) otherlv_15= ')' otherlv_16= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getInboundEndpointDefAccess().getInboundEndpointKeyword_0());
            		
            // InternalEsbDsl.g:1084:3: (otherlv_1= '(' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalEsbDsl.g:1085:4: otherlv_1= '('
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_21); 

            	    				newLeafNode(otherlv_1, grammarAccess.getInboundEndpointDefAccess().getLeftParenthesisKeyword_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_2=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getInboundEndpointDefAccess().getProtocolKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getInboundEndpointDefAccess().getLeftParenthesisKeyword_3());
            		
            // InternalEsbDsl.g:1098:3: ( (lv_protocol_4_0= RULE_STRING ) )
            // InternalEsbDsl.g:1099:4: (lv_protocol_4_0= RULE_STRING )
            {
            // InternalEsbDsl.g:1099:4: (lv_protocol_4_0= RULE_STRING )
            // InternalEsbDsl.g:1100:5: lv_protocol_4_0= RULE_STRING
            {
            lv_protocol_4_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_protocol_4_0, grammarAccess.getInboundEndpointDefAccess().getProtocolSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInboundEndpointDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"protocol",
            						lv_protocol_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getInboundEndpointDefAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getInboundEndpointDefAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,34,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getInboundEndpointDefAccess().getPortKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_8, grammarAccess.getInboundEndpointDefAccess().getLeftParenthesisKeyword_8());
            		
            // InternalEsbDsl.g:1132:3: ( (lv_port_9_0= RULE_INT ) )
            // InternalEsbDsl.g:1133:4: (lv_port_9_0= RULE_INT )
            {
            // InternalEsbDsl.g:1133:4: (lv_port_9_0= RULE_INT )
            // InternalEsbDsl.g:1134:5: lv_port_9_0= RULE_INT
            {
            lv_port_9_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_port_9_0, grammarAccess.getInboundEndpointDefAccess().getPortINTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInboundEndpointDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"port",
            						lv_port_9_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getInboundEndpointDefAccess().getRightParenthesisKeyword_10());
            		
            otherlv_11=(Token)match(input,24,FOLLOW_25); 

            			newLeafNode(otherlv_11, grammarAccess.getInboundEndpointDefAccess().getCommaKeyword_11());
            		
            otherlv_12=(Token)match(input,35,FOLLOW_9); 

            			newLeafNode(otherlv_12, grammarAccess.getInboundEndpointDefAccess().getContextKeyword_12());
            		
            otherlv_13=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_13, grammarAccess.getInboundEndpointDefAccess().getLeftParenthesisKeyword_13());
            		
            // InternalEsbDsl.g:1166:3: ( (lv_context_14_0= RULE_STRING ) )
            // InternalEsbDsl.g:1167:4: (lv_context_14_0= RULE_STRING )
            {
            // InternalEsbDsl.g:1167:4: (lv_context_14_0= RULE_STRING )
            // InternalEsbDsl.g:1168:5: lv_context_14_0= RULE_STRING
            {
            lv_context_14_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_context_14_0, grammarAccess.getInboundEndpointDefAccess().getContextSTRINGTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInboundEndpointDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"context",
            						lv_context_14_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_15=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getInboundEndpointDefAccess().getRightParenthesisKeyword_15());
            		
            otherlv_16=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getInboundEndpointDefAccess().getRightParenthesisKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInboundEndpointDef"


    // $ANTLR start "ruleParticipantType"
    // InternalEsbDsl.g:1196:1: ruleParticipantType returns [Enumerator current=null] : ( (enumLiteral_0= 'IntegrationFlow' ) | (enumLiteral_1= 'InboundEndpoint' ) | (enumLiteral_2= 'OutboundEndpoint' ) | (enumLiteral_3= 'Pipeline' ) ) ;
    public final Enumerator ruleParticipantType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalEsbDsl.g:1202:2: ( ( (enumLiteral_0= 'IntegrationFlow' ) | (enumLiteral_1= 'InboundEndpoint' ) | (enumLiteral_2= 'OutboundEndpoint' ) | (enumLiteral_3= 'Pipeline' ) ) )
            // InternalEsbDsl.g:1203:2: ( (enumLiteral_0= 'IntegrationFlow' ) | (enumLiteral_1= 'InboundEndpoint' ) | (enumLiteral_2= 'OutboundEndpoint' ) | (enumLiteral_3= 'Pipeline' ) )
            {
            // InternalEsbDsl.g:1203:2: ( (enumLiteral_0= 'IntegrationFlow' ) | (enumLiteral_1= 'InboundEndpoint' ) | (enumLiteral_2= 'OutboundEndpoint' ) | (enumLiteral_3= 'Pipeline' ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt14=1;
                }
                break;
            case 33:
                {
                alt14=2;
                }
                break;
            case 30:
                {
                alt14=3;
                }
                break;
            case 36:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalEsbDsl.g:1204:3: (enumLiteral_0= 'IntegrationFlow' )
                    {
                    // InternalEsbDsl.g:1204:3: (enumLiteral_0= 'IntegrationFlow' )
                    // InternalEsbDsl.g:1205:4: enumLiteral_0= 'IntegrationFlow'
                    {
                    enumLiteral_0=(Token)match(input,12,FOLLOW_2); 

                    				current = grammarAccess.getParticipantTypeAccess().getINTEGRATIONFLOWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getParticipantTypeAccess().getINTEGRATIONFLOWEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEsbDsl.g:1212:3: (enumLiteral_1= 'InboundEndpoint' )
                    {
                    // InternalEsbDsl.g:1212:3: (enumLiteral_1= 'InboundEndpoint' )
                    // InternalEsbDsl.g:1213:4: enumLiteral_1= 'InboundEndpoint'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getParticipantTypeAccess().getINBOUNDENDPOINTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getParticipantTypeAccess().getINBOUNDENDPOINTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEsbDsl.g:1220:3: (enumLiteral_2= 'OutboundEndpoint' )
                    {
                    // InternalEsbDsl.g:1220:3: (enumLiteral_2= 'OutboundEndpoint' )
                    // InternalEsbDsl.g:1221:4: enumLiteral_2= 'OutboundEndpoint'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getParticipantTypeAccess().getOUTBOUNDENDPOINTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getParticipantTypeAccess().getOUTBOUNDENDPOINTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEsbDsl.g:1228:3: (enumLiteral_3= 'Pipeline' )
                    {
                    // InternalEsbDsl.g:1228:3: (enumLiteral_3= 'Pipeline' )
                    // InternalEsbDsl.g:1229:4: enumLiteral_3= 'Pipeline'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getParticipantTypeAccess().getPIPELINEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getParticipantTypeAccess().getPIPELINEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParticipantType"


    // $ANTLR start "ruleMediatorType"
    // InternalEsbDsl.g:1239:1: ruleMediatorType returns [Enumerator current=null] : ( (enumLiteral_0= 'log' ) | (enumLiteral_1= 'call' ) | (enumLiteral_2= 'respond' ) | (enumLiteral_3= 'filter' ) | (enumLiteral_4= 'transform' ) | (enumLiteral_5= 'enrich' ) | (enumLiteral_6= 'external' ) ) ;
    public final Enumerator ruleMediatorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalEsbDsl.g:1245:2: ( ( (enumLiteral_0= 'log' ) | (enumLiteral_1= 'call' ) | (enumLiteral_2= 'respond' ) | (enumLiteral_3= 'filter' ) | (enumLiteral_4= 'transform' ) | (enumLiteral_5= 'enrich' ) | (enumLiteral_6= 'external' ) ) )
            // InternalEsbDsl.g:1246:2: ( (enumLiteral_0= 'log' ) | (enumLiteral_1= 'call' ) | (enumLiteral_2= 'respond' ) | (enumLiteral_3= 'filter' ) | (enumLiteral_4= 'transform' ) | (enumLiteral_5= 'enrich' ) | (enumLiteral_6= 'external' ) )
            {
            // InternalEsbDsl.g:1246:2: ( (enumLiteral_0= 'log' ) | (enumLiteral_1= 'call' ) | (enumLiteral_2= 'respond' ) | (enumLiteral_3= 'filter' ) | (enumLiteral_4= 'transform' ) | (enumLiteral_5= 'enrich' ) | (enumLiteral_6= 'external' ) )
            int alt15=7;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt15=1;
                }
                break;
            case 38:
                {
                alt15=2;
                }
                break;
            case 39:
                {
                alt15=3;
                }
                break;
            case 40:
                {
                alt15=4;
                }
                break;
            case 41:
                {
                alt15=5;
                }
                break;
            case 42:
                {
                alt15=6;
                }
                break;
            case 43:
                {
                alt15=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalEsbDsl.g:1247:3: (enumLiteral_0= 'log' )
                    {
                    // InternalEsbDsl.g:1247:3: (enumLiteral_0= 'log' )
                    // InternalEsbDsl.g:1248:4: enumLiteral_0= 'log'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getMediatorTypeAccess().getLOGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMediatorTypeAccess().getLOGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEsbDsl.g:1255:3: (enumLiteral_1= 'call' )
                    {
                    // InternalEsbDsl.g:1255:3: (enumLiteral_1= 'call' )
                    // InternalEsbDsl.g:1256:4: enumLiteral_1= 'call'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getMediatorTypeAccess().getCALLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMediatorTypeAccess().getCALLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEsbDsl.g:1263:3: (enumLiteral_2= 'respond' )
                    {
                    // InternalEsbDsl.g:1263:3: (enumLiteral_2= 'respond' )
                    // InternalEsbDsl.g:1264:4: enumLiteral_2= 'respond'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getMediatorTypeAccess().getRESPONDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMediatorTypeAccess().getRESPONDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEsbDsl.g:1271:3: (enumLiteral_3= 'filter' )
                    {
                    // InternalEsbDsl.g:1271:3: (enumLiteral_3= 'filter' )
                    // InternalEsbDsl.g:1272:4: enumLiteral_3= 'filter'
                    {
                    enumLiteral_3=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getMediatorTypeAccess().getFILTEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMediatorTypeAccess().getFILTEREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEsbDsl.g:1279:3: (enumLiteral_4= 'transform' )
                    {
                    // InternalEsbDsl.g:1279:3: (enumLiteral_4= 'transform' )
                    // InternalEsbDsl.g:1280:4: enumLiteral_4= 'transform'
                    {
                    enumLiteral_4=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getMediatorTypeAccess().getTRANSFORMEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMediatorTypeAccess().getTRANSFORMEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalEsbDsl.g:1287:3: (enumLiteral_5= 'enrich' )
                    {
                    // InternalEsbDsl.g:1287:3: (enumLiteral_5= 'enrich' )
                    // InternalEsbDsl.g:1288:4: enumLiteral_5= 'enrich'
                    {
                    enumLiteral_5=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getMediatorTypeAccess().getENRICHEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getMediatorTypeAccess().getENRICHEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalEsbDsl.g:1295:3: (enumLiteral_6= 'external' )
                    {
                    // InternalEsbDsl.g:1295:3: (enumLiteral_6= 'external' )
                    // InternalEsbDsl.g:1296:4: enumLiteral_6= 'external'
                    {
                    enumLiteral_6=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getMediatorTypeAccess().getEXTERNALEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getMediatorTypeAccess().getEXTERNALEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMediatorType"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\35\1\4\1\15\1\14\2\17\1\uffff\2\5\2\uffff";
    static final String dfa_3s = "\1\35\1\4\1\15\1\44\2\17\1\uffff\2\37\2\uffff";
    static final String dfa_4s = "\6\uffff\1\1\2\uffff\1\3\1\2";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\6\21\uffff\1\5\2\uffff\1\4\2\uffff\1\6",
            "\1\7",
            "\1\10",
            "",
            "\1\6\11\uffff\1\11\17\uffff\1\11",
            "\1\6\11\uffff\1\12\17\uffff\1\12",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "794:2: ( (otherlv_0= 'participant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_participantType_3_0= ruleParticipantType ) ) otherlv_4= '(' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ')' ) | (otherlv_7= 'participant' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_outbounds_10_0= ruleOutboundEndpointDef ) ) ) | (otherlv_11= 'participant' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ':' ( (lv_inbounds_14_0= ruleInboundEndpointDef ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000FE03C244812L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000FE01C244010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000FE01C244812L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000FE01C3C0010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001240001000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});

}
