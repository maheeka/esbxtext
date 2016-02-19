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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@startuml'", "'@enduml'", "'message_processor'", "'('", "')'", "','", "'->'", "':'", "'par'", "'else'", "'end'", "'alt'", "'loop'", "'group'", "'ref'", "'participant'", "'IntegrationFlow'", "'InboundEndpoint'", "'OutboundEndpoint'", "'Pipeline'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    // InternalEsbDsl.g:72:1: ruleModel returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= '@startuml' ( (lv_participants_2_0= ruleParticipantStatement ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '@enduml' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_participants_2_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalEsbDsl.g:78:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= '@startuml' ( (lv_participants_2_0= ruleParticipantStatement ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '@enduml' ) ) ) ) )+ {...}?) ) ) )
            // InternalEsbDsl.g:79:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= '@startuml' ( (lv_participants_2_0= ruleParticipantStatement ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '@enduml' ) ) ) ) )+ {...}?) ) )
            {
            // InternalEsbDsl.g:79:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= '@startuml' ( (lv_participants_2_0= ruleParticipantStatement ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '@enduml' ) ) ) ) )+ {...}?) ) )
            // InternalEsbDsl.g:80:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= '@startuml' ( (lv_participants_2_0= ruleParticipantStatement ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '@enduml' ) ) ) ) )+ {...}?) )
            {
            // InternalEsbDsl.g:80:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= '@startuml' ( (lv_participants_2_0= ruleParticipantStatement ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '@enduml' ) ) ) ) )+ {...}?) )
            // InternalEsbDsl.g:81:4: ( ( ({...}? => ( ({...}? => (otherlv_1= '@startuml' ( (lv_participants_2_0= ruleParticipantStatement ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '@enduml' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup());
            			
            // InternalEsbDsl.g:84:4: ( ( ({...}? => ( ({...}? => (otherlv_1= '@startuml' ( (lv_participants_2_0= ruleParticipantStatement ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '@enduml' ) ) ) ) )+ {...}?)
            // InternalEsbDsl.g:85:5: ( ({...}? => ( ({...}? => (otherlv_1= '@startuml' ( (lv_participants_2_0= ruleParticipantStatement ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '@enduml' ) ) ) ) )+ {...}?
            {
            // InternalEsbDsl.g:85:5: ( ({...}? => ( ({...}? => (otherlv_1= '@startuml' ( (lv_participants_2_0= ruleParticipantStatement ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '@enduml' ) ) ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                    alt3=1;
                }
                else if ( ( LA3_0 == RULE_ID || LA3_0 >= 12 && LA3_0 <= 13 || LA3_0 == 19 || LA3_0 >= 22 && LA3_0 <= 25 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEsbDsl.g:86:3: ({...}? => ( ({...}? => (otherlv_1= '@startuml' ( (lv_participants_2_0= ruleParticipantStatement ) )* ) ) ) )
            	    {
            	    // InternalEsbDsl.g:86:3: ({...}? => ( ({...}? => (otherlv_1= '@startuml' ( (lv_participants_2_0= ruleParticipantStatement ) )* ) ) ) )
            	    // InternalEsbDsl.g:87:4: {...}? => ( ({...}? => (otherlv_1= '@startuml' ( (lv_participants_2_0= ruleParticipantStatement ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalEsbDsl.g:87:99: ( ({...}? => (otherlv_1= '@startuml' ( (lv_participants_2_0= ruleParticipantStatement ) )* ) ) )
            	    // InternalEsbDsl.g:88:5: ({...}? => (otherlv_1= '@startuml' ( (lv_participants_2_0= ruleParticipantStatement ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalEsbDsl.g:91:8: ({...}? => (otherlv_1= '@startuml' ( (lv_participants_2_0= ruleParticipantStatement ) )* ) )
            	    // InternalEsbDsl.g:91:9: {...}? => (otherlv_1= '@startuml' ( (lv_participants_2_0= ruleParticipantStatement ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalEsbDsl.g:91:18: (otherlv_1= '@startuml' ( (lv_participants_2_0= ruleParticipantStatement ) )* )
            	    // InternalEsbDsl.g:91:19: otherlv_1= '@startuml' ( (lv_participants_2_0= ruleParticipantStatement ) )*
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getModelAccess().getStartumlKeyword_0_0());
            	    							
            	    // InternalEsbDsl.g:95:8: ( (lv_participants_2_0= ruleParticipantStatement ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==26) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalEsbDsl.g:96:9: (lv_participants_2_0= ruleParticipantStatement )
            	    	    {
            	    	    // InternalEsbDsl.g:96:9: (lv_participants_2_0= ruleParticipantStatement )
            	    	    // InternalEsbDsl.g:97:10: lv_participants_2_0= ruleParticipantStatement
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getModelAccess().getParticipantsParticipantStatementParserRuleCall_0_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_participants_2_0=ruleParticipantStatement();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"participants",
            	    	    											lv_participants_2_0,
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
            	    // InternalEsbDsl.g:120:3: ({...}? => ( ({...}? => ( ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '@enduml' ) ) ) )
            	    {
            	    // InternalEsbDsl.g:120:3: ({...}? => ( ({...}? => ( ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '@enduml' ) ) ) )
            	    // InternalEsbDsl.g:121:4: {...}? => ( ({...}? => ( ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '@enduml' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalEsbDsl.g:121:99: ( ({...}? => ( ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '@enduml' ) ) )
            	    // InternalEsbDsl.g:122:5: ({...}? => ( ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '@enduml' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalEsbDsl.g:125:8: ({...}? => ( ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '@enduml' ) )
            	    // InternalEsbDsl.g:125:9: {...}? => ( ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '@enduml' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalEsbDsl.g:125:18: ( ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '@enduml' )
            	    // InternalEsbDsl.g:125:19: ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '@enduml'
            	    {
            	    // InternalEsbDsl.g:125:19: ( (lv_statements_3_0= ruleStatement ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==RULE_ID||LA2_0==13||LA2_0==19||(LA2_0>=22 && LA2_0<=25)) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalEsbDsl.g:126:9: (lv_statements_3_0= ruleStatement )
            	    	    {
            	    	    // InternalEsbDsl.g:126:9: (lv_statements_3_0= ruleStatement )
            	    	    // InternalEsbDsl.g:127:10: lv_statements_3_0= ruleStatement
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_1_0_0());
            	    	    									
            	    	    pushFollow(FOLLOW_4);
            	    	    lv_statements_3_0=ruleStatement();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"statements",
            	    	    											lv_statements_3_0,
            	    	    											"com.wso2.esb.dsl.EsbDsl.Statement");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);

            	    otherlv_4=(Token)match(input,12,FOLLOW_5); 

            	    								newLeafNode(otherlv_4, grammarAccess.getModelAccess().getEndumlKeyword_1_1());
            	    							

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
    // InternalEsbDsl.g:165:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalEsbDsl.g:165:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalEsbDsl.g:166:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalEsbDsl.g:172:1: ruleStatement returns [EObject current=null] : (this_ProcessingStatement_0= ruleProcessingStatement | this_RoutingStatement_1= ruleRoutingStatement | this_ParallelStatement_2= ruleParallelStatement | this_IfStatement_3= ruleIfStatement | this_LoopStatement_4= ruleLoopStatement | this_GroupStatement_5= ruleGroupStatement | this_RefStatement_6= ruleRefStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_ProcessingStatement_0 = null;

        EObject this_RoutingStatement_1 = null;

        EObject this_ParallelStatement_2 = null;

        EObject this_IfStatement_3 = null;

        EObject this_LoopStatement_4 = null;

        EObject this_GroupStatement_5 = null;

        EObject this_RefStatement_6 = null;



        	enterRule();

        try {
            // InternalEsbDsl.g:178:2: ( (this_ProcessingStatement_0= ruleProcessingStatement | this_RoutingStatement_1= ruleRoutingStatement | this_ParallelStatement_2= ruleParallelStatement | this_IfStatement_3= ruleIfStatement | this_LoopStatement_4= ruleLoopStatement | this_GroupStatement_5= ruleGroupStatement | this_RefStatement_6= ruleRefStatement ) )
            // InternalEsbDsl.g:179:2: (this_ProcessingStatement_0= ruleProcessingStatement | this_RoutingStatement_1= ruleRoutingStatement | this_ParallelStatement_2= ruleParallelStatement | this_IfStatement_3= ruleIfStatement | this_LoopStatement_4= ruleLoopStatement | this_GroupStatement_5= ruleGroupStatement | this_RefStatement_6= ruleRefStatement )
            {
            // InternalEsbDsl.g:179:2: (this_ProcessingStatement_0= ruleProcessingStatement | this_RoutingStatement_1= ruleRoutingStatement | this_ParallelStatement_2= ruleParallelStatement | this_IfStatement_3= ruleIfStatement | this_LoopStatement_4= ruleLoopStatement | this_GroupStatement_5= ruleGroupStatement | this_RefStatement_6= ruleRefStatement )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            case 22:
                {
                alt4=4;
                }
                break;
            case 23:
                {
                alt4=5;
                }
                break;
            case 24:
                {
                alt4=6;
                }
                break;
            case 25:
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
                    // InternalEsbDsl.g:180:3: this_ProcessingStatement_0= ruleProcessingStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getProcessingStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProcessingStatement_0=ruleProcessingStatement();

                    state._fsp--;


                    			current = this_ProcessingStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEsbDsl.g:189:3: this_RoutingStatement_1= ruleRoutingStatement
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
                    // InternalEsbDsl.g:198:3: this_ParallelStatement_2= ruleParallelStatement
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
                    // InternalEsbDsl.g:207:3: this_IfStatement_3= ruleIfStatement
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
                    // InternalEsbDsl.g:216:3: this_LoopStatement_4= ruleLoopStatement
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
                    // InternalEsbDsl.g:225:3: this_GroupStatement_5= ruleGroupStatement
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
                    // InternalEsbDsl.g:234:3: this_RefStatement_6= ruleRefStatement
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


    // $ANTLR start "entryRuleProcessingStatement"
    // InternalEsbDsl.g:246:1: entryRuleProcessingStatement returns [EObject current=null] : iv_ruleProcessingStatement= ruleProcessingStatement EOF ;
    public final EObject entryRuleProcessingStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessingStatement = null;


        try {
            // InternalEsbDsl.g:246:60: (iv_ruleProcessingStatement= ruleProcessingStatement EOF )
            // InternalEsbDsl.g:247:2: iv_ruleProcessingStatement= ruleProcessingStatement EOF
            {
             newCompositeNode(grammarAccess.getProcessingStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessingStatement=ruleProcessingStatement();

            state._fsp--;

             current =iv_ruleProcessingStatement; 
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
    // $ANTLR end "entryRuleProcessingStatement"


    // $ANTLR start "ruleProcessingStatement"
    // InternalEsbDsl.g:253:1: ruleProcessingStatement returns [EObject current=null] : (otherlv_0= 'message_processor' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ')' | (otherlv_4= ',' ( (lv_configs_5_0= RULE_STRING ) ) otherlv_6= ')' ) ) ) ;
    public final EObject ruleProcessingStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_configs_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalEsbDsl.g:259:2: ( (otherlv_0= 'message_processor' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ')' | (otherlv_4= ',' ( (lv_configs_5_0= RULE_STRING ) ) otherlv_6= ')' ) ) ) )
            // InternalEsbDsl.g:260:2: (otherlv_0= 'message_processor' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ')' | (otherlv_4= ',' ( (lv_configs_5_0= RULE_STRING ) ) otherlv_6= ')' ) ) )
            {
            // InternalEsbDsl.g:260:2: (otherlv_0= 'message_processor' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ')' | (otherlv_4= ',' ( (lv_configs_5_0= RULE_STRING ) ) otherlv_6= ')' ) ) )
            // InternalEsbDsl.g:261:3: otherlv_0= 'message_processor' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ')' | (otherlv_4= ',' ( (lv_configs_5_0= RULE_STRING ) ) otherlv_6= ')' ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessingStatementAccess().getMessage_processorKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessingStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEsbDsl.g:269:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalEsbDsl.g:270:4: (lv_name_2_0= RULE_ID )
            {
            // InternalEsbDsl.g:270:4: (lv_name_2_0= RULE_ID )
            // InternalEsbDsl.g:271:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getProcessingStatementAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessingStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEsbDsl.g:287:3: (otherlv_3= ')' | (otherlv_4= ',' ( (lv_configs_5_0= RULE_STRING ) ) otherlv_6= ')' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalEsbDsl.g:288:4: otherlv_3= ')'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getProcessingStatementAccess().getRightParenthesisKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalEsbDsl.g:293:4: (otherlv_4= ',' ( (lv_configs_5_0= RULE_STRING ) ) otherlv_6= ')' )
                    {
                    // InternalEsbDsl.g:293:4: (otherlv_4= ',' ( (lv_configs_5_0= RULE_STRING ) ) otherlv_6= ')' )
                    // InternalEsbDsl.g:294:5: otherlv_4= ',' ( (lv_configs_5_0= RULE_STRING ) ) otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_9); 

                    					newLeafNode(otherlv_4, grammarAccess.getProcessingStatementAccess().getCommaKeyword_3_1_0());
                    				
                    // InternalEsbDsl.g:298:5: ( (lv_configs_5_0= RULE_STRING ) )
                    // InternalEsbDsl.g:299:6: (lv_configs_5_0= RULE_STRING )
                    {
                    // InternalEsbDsl.g:299:6: (lv_configs_5_0= RULE_STRING )
                    // InternalEsbDsl.g:300:7: lv_configs_5_0= RULE_STRING
                    {
                    lv_configs_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    							newLeafNode(lv_configs_5_0, grammarAccess.getProcessingStatementAccess().getConfigsSTRINGTerminalRuleCall_3_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getProcessingStatementRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"configs",
                    								lv_configs_5_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getProcessingStatementAccess().getRightParenthesisKeyword_3_1_2());
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleProcessingStatement"


    // $ANTLR start "entryRuleRoutingStatement"
    // InternalEsbDsl.g:326:1: entryRuleRoutingStatement returns [EObject current=null] : iv_ruleRoutingStatement= ruleRoutingStatement EOF ;
    public final EObject entryRuleRoutingStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoutingStatement = null;


        try {
            // InternalEsbDsl.g:326:57: (iv_ruleRoutingStatement= ruleRoutingStatement EOF )
            // InternalEsbDsl.g:327:2: iv_ruleRoutingStatement= ruleRoutingStatement EOF
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
    // InternalEsbDsl.g:333:1: ruleRoutingStatement returns [EObject current=null] : ( ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_action_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleRoutingStatement() throws RecognitionException {
        EObject current = null;

        Token lv_source_0_0=null;
        Token otherlv_1=null;
        Token lv_target_2_0=null;
        Token otherlv_3=null;
        Token lv_action_4_0=null;


        	enterRule();

        try {
            // InternalEsbDsl.g:339:2: ( ( ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_action_4_0= RULE_STRING ) ) ) )
            // InternalEsbDsl.g:340:2: ( ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_action_4_0= RULE_STRING ) ) )
            {
            // InternalEsbDsl.g:340:2: ( ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_action_4_0= RULE_STRING ) ) )
            // InternalEsbDsl.g:341:3: ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_action_4_0= RULE_STRING ) )
            {
            // InternalEsbDsl.g:341:3: ( (lv_source_0_0= RULE_ID ) )
            // InternalEsbDsl.g:342:4: (lv_source_0_0= RULE_ID )
            {
            // InternalEsbDsl.g:342:4: (lv_source_0_0= RULE_ID )
            // InternalEsbDsl.g:343:5: lv_source_0_0= RULE_ID
            {
            lv_source_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            otherlv_1=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRoutingStatementAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalEsbDsl.g:363:3: ( (lv_target_2_0= RULE_ID ) )
            // InternalEsbDsl.g:364:4: (lv_target_2_0= RULE_ID )
            {
            // InternalEsbDsl.g:364:4: (lv_target_2_0= RULE_ID )
            // InternalEsbDsl.g:365:5: lv_target_2_0= RULE_ID
            {
            lv_target_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_3=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getRoutingStatementAccess().getColonKeyword_3());
            		
            // InternalEsbDsl.g:385:3: ( (lv_action_4_0= RULE_STRING ) )
            // InternalEsbDsl.g:386:4: (lv_action_4_0= RULE_STRING )
            {
            // InternalEsbDsl.g:386:4: (lv_action_4_0= RULE_STRING )
            // InternalEsbDsl.g:387:5: lv_action_4_0= RULE_STRING
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
    // InternalEsbDsl.g:407:1: entryRuleParallelStatement returns [EObject current=null] : iv_ruleParallelStatement= ruleParallelStatement EOF ;
    public final EObject entryRuleParallelStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallelStatement = null;


        try {
            // InternalEsbDsl.g:407:58: (iv_ruleParallelStatement= ruleParallelStatement EOF )
            // InternalEsbDsl.g:408:2: iv_ruleParallelStatement= ruleParallelStatement EOF
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
    // InternalEsbDsl.g:414:1: ruleParallelStatement returns [EObject current=null] : (otherlv_0= 'par' ( (lv_statements_1_0= ruleStatement ) )* (otherlv_2= 'else' ( (lv_statements_3_0= ruleStatement ) )* )* otherlv_4= 'end' ) ;
    public final EObject ruleParallelStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statements_1_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalEsbDsl.g:420:2: ( (otherlv_0= 'par' ( (lv_statements_1_0= ruleStatement ) )* (otherlv_2= 'else' ( (lv_statements_3_0= ruleStatement ) )* )* otherlv_4= 'end' ) )
            // InternalEsbDsl.g:421:2: (otherlv_0= 'par' ( (lv_statements_1_0= ruleStatement ) )* (otherlv_2= 'else' ( (lv_statements_3_0= ruleStatement ) )* )* otherlv_4= 'end' )
            {
            // InternalEsbDsl.g:421:2: (otherlv_0= 'par' ( (lv_statements_1_0= ruleStatement ) )* (otherlv_2= 'else' ( (lv_statements_3_0= ruleStatement ) )* )* otherlv_4= 'end' )
            // InternalEsbDsl.g:422:3: otherlv_0= 'par' ( (lv_statements_1_0= ruleStatement ) )* (otherlv_2= 'else' ( (lv_statements_3_0= ruleStatement ) )* )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getParallelStatementAccess().getParKeyword_0());
            		
            // InternalEsbDsl.g:426:3: ( (lv_statements_1_0= ruleStatement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==13||LA6_0==19||(LA6_0>=22 && LA6_0<=25)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEsbDsl.g:427:4: (lv_statements_1_0= ruleStatement )
            	    {
            	    // InternalEsbDsl.g:427:4: (lv_statements_1_0= ruleStatement )
            	    // InternalEsbDsl.g:428:5: lv_statements_1_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getParallelStatementAccess().getStatementsStatementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_statements_1_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParallelStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_1_0,
            	    						"com.wso2.esb.dsl.EsbDsl.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalEsbDsl.g:445:3: (otherlv_2= 'else' ( (lv_statements_3_0= ruleStatement ) )* )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEsbDsl.g:446:4: otherlv_2= 'else' ( (lv_statements_3_0= ruleStatement ) )*
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_13); 

            	    				newLeafNode(otherlv_2, grammarAccess.getParallelStatementAccess().getElseKeyword_2_0());
            	    			
            	    // InternalEsbDsl.g:450:4: ( (lv_statements_3_0= ruleStatement ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==RULE_ID||LA7_0==13||LA7_0==19||(LA7_0>=22 && LA7_0<=25)) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalEsbDsl.g:451:5: (lv_statements_3_0= ruleStatement )
            	    	    {
            	    	    // InternalEsbDsl.g:451:5: (lv_statements_3_0= ruleStatement )
            	    	    // InternalEsbDsl.g:452:6: lv_statements_3_0= ruleStatement
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getParallelStatementAccess().getStatementsStatementParserRuleCall_2_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_13);
            	    	    lv_statements_3_0=ruleStatement();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getParallelStatementRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"statements",
            	    	    							lv_statements_3_0,
            	    	    							"com.wso2.esb.dsl.EsbDsl.Statement");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

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
    // InternalEsbDsl.g:478:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalEsbDsl.g:478:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalEsbDsl.g:479:2: iv_ruleIfStatement= ruleIfStatement EOF
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
    // InternalEsbDsl.g:485:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'alt' ( (lv_expression_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_expression_1_0=null;


        	enterRule();

        try {
            // InternalEsbDsl.g:491:2: ( (otherlv_0= 'alt' ( (lv_expression_1_0= RULE_STRING ) ) ) )
            // InternalEsbDsl.g:492:2: (otherlv_0= 'alt' ( (lv_expression_1_0= RULE_STRING ) ) )
            {
            // InternalEsbDsl.g:492:2: (otherlv_0= 'alt' ( (lv_expression_1_0= RULE_STRING ) ) )
            // InternalEsbDsl.g:493:3: otherlv_0= 'alt' ( (lv_expression_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getAltKeyword_0());
            		
            // InternalEsbDsl.g:497:3: ( (lv_expression_1_0= RULE_STRING ) )
            // InternalEsbDsl.g:498:4: (lv_expression_1_0= RULE_STRING )
            {
            // InternalEsbDsl.g:498:4: (lv_expression_1_0= RULE_STRING )
            // InternalEsbDsl.g:499:5: lv_expression_1_0= RULE_STRING
            {
            lv_expression_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_expression_1_0, grammarAccess.getIfStatementAccess().getExpressionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIfStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"expression",
            						lv_expression_1_0,
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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleLoopStatement"
    // InternalEsbDsl.g:519:1: entryRuleLoopStatement returns [EObject current=null] : iv_ruleLoopStatement= ruleLoopStatement EOF ;
    public final EObject entryRuleLoopStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopStatement = null;


        try {
            // InternalEsbDsl.g:519:54: (iv_ruleLoopStatement= ruleLoopStatement EOF )
            // InternalEsbDsl.g:520:2: iv_ruleLoopStatement= ruleLoopStatement EOF
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
    // InternalEsbDsl.g:526:1: ruleLoopStatement returns [EObject current=null] : (otherlv_0= 'loop' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLoopStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalEsbDsl.g:532:2: ( (otherlv_0= 'loop' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalEsbDsl.g:533:2: (otherlv_0= 'loop' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalEsbDsl.g:533:2: (otherlv_0= 'loop' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalEsbDsl.g:534:3: otherlv_0= 'loop' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopStatementAccess().getLoopKeyword_0());
            		
            // InternalEsbDsl.g:538:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEsbDsl.g:539:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEsbDsl.g:539:4: (lv_name_1_0= RULE_ID )
            // InternalEsbDsl.g:540:5: lv_name_1_0= RULE_ID
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
    // InternalEsbDsl.g:560:1: entryRuleGroupStatement returns [EObject current=null] : iv_ruleGroupStatement= ruleGroupStatement EOF ;
    public final EObject entryRuleGroupStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupStatement = null;


        try {
            // InternalEsbDsl.g:560:55: (iv_ruleGroupStatement= ruleGroupStatement EOF )
            // InternalEsbDsl.g:561:2: iv_ruleGroupStatement= ruleGroupStatement EOF
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
    // InternalEsbDsl.g:567:1: ruleGroupStatement returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleGroupStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalEsbDsl.g:573:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalEsbDsl.g:574:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalEsbDsl.g:574:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalEsbDsl.g:575:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupStatementAccess().getGroupKeyword_0());
            		
            // InternalEsbDsl.g:579:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEsbDsl.g:580:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEsbDsl.g:580:4: (lv_name_1_0= RULE_ID )
            // InternalEsbDsl.g:581:5: lv_name_1_0= RULE_ID
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
    // InternalEsbDsl.g:601:1: entryRuleRefStatement returns [EObject current=null] : iv_ruleRefStatement= ruleRefStatement EOF ;
    public final EObject entryRuleRefStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefStatement = null;


        try {
            // InternalEsbDsl.g:601:53: (iv_ruleRefStatement= ruleRefStatement EOF )
            // InternalEsbDsl.g:602:2: iv_ruleRefStatement= ruleRefStatement EOF
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
    // InternalEsbDsl.g:608:1: ruleRefStatement returns [EObject current=null] : (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleRefStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalEsbDsl.g:614:2: ( (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalEsbDsl.g:615:2: (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalEsbDsl.g:615:2: (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalEsbDsl.g:616:3: otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRefStatementAccess().getRefKeyword_0());
            		
            // InternalEsbDsl.g:620:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEsbDsl.g:621:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEsbDsl.g:621:4: (lv_name_1_0= RULE_ID )
            // InternalEsbDsl.g:622:5: lv_name_1_0= RULE_ID
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
    // InternalEsbDsl.g:642:1: entryRuleParticipantStatement returns [EObject current=null] : iv_ruleParticipantStatement= ruleParticipantStatement EOF ;
    public final EObject entryRuleParticipantStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipantStatement = null;


        try {
            // InternalEsbDsl.g:642:61: (iv_ruleParticipantStatement= ruleParticipantStatement EOF )
            // InternalEsbDsl.g:643:2: iv_ruleParticipantStatement= ruleParticipantStatement EOF
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
    // InternalEsbDsl.g:649:1: ruleParticipantStatement returns [EObject current=null] : (otherlv_0= 'participant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_participantType_3_0= ruleParticipantType ) ) otherlv_4= '(' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ')' ) ;
    public final EObject ruleParticipantStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Enumerator lv_participantType_3_0 = null;



        	enterRule();

        try {
            // InternalEsbDsl.g:655:2: ( (otherlv_0= 'participant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_participantType_3_0= ruleParticipantType ) ) otherlv_4= '(' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ')' ) )
            // InternalEsbDsl.g:656:2: (otherlv_0= 'participant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_participantType_3_0= ruleParticipantType ) ) otherlv_4= '(' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ')' )
            {
            // InternalEsbDsl.g:656:2: (otherlv_0= 'participant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_participantType_3_0= ruleParticipantType ) ) otherlv_4= '(' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ')' )
            // InternalEsbDsl.g:657:3: otherlv_0= 'participant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_participantType_3_0= ruleParticipantType ) ) otherlv_4= '(' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getParticipantStatementAccess().getParticipantKeyword_0());
            		
            // InternalEsbDsl.g:661:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEsbDsl.g:662:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEsbDsl.g:662:4: (lv_name_1_0= RULE_ID )
            // InternalEsbDsl.g:663:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParticipantStatementAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getParticipantStatementAccess().getColonKeyword_2());
            		
            // InternalEsbDsl.g:683:3: ( (lv_participantType_3_0= ruleParticipantType ) )
            // InternalEsbDsl.g:684:4: (lv_participantType_3_0= ruleParticipantType )
            {
            // InternalEsbDsl.g:684:4: (lv_participantType_3_0= ruleParticipantType )
            // InternalEsbDsl.g:685:5: lv_participantType_3_0= ruleParticipantType
            {

            					newCompositeNode(grammarAccess.getParticipantStatementAccess().getParticipantTypeParticipantTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_4=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getParticipantStatementAccess().getLeftParenthesisKeyword_4());
            		
            // InternalEsbDsl.g:706:3: ( (lv_description_5_0= RULE_STRING ) )
            // InternalEsbDsl.g:707:4: (lv_description_5_0= RULE_STRING )
            {
            // InternalEsbDsl.g:707:4: (lv_description_5_0= RULE_STRING )
            // InternalEsbDsl.g:708:5: lv_description_5_0= RULE_STRING
            {
            lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_description_5_0, grammarAccess.getParticipantStatementAccess().getDescriptionSTRINGTerminalRuleCall_5_0());
            				

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

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getParticipantStatementAccess().getRightParenthesisKeyword_6());
            		

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


    // $ANTLR start "ruleParticipantType"
    // InternalEsbDsl.g:732:1: ruleParticipantType returns [Enumerator current=null] : ( (enumLiteral_0= 'IntegrationFlow' ) | (enumLiteral_1= 'InboundEndpoint' ) | (enumLiteral_2= 'OutboundEndpoint' ) | (enumLiteral_3= 'Pipeline' ) ) ;
    public final Enumerator ruleParticipantType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalEsbDsl.g:738:2: ( ( (enumLiteral_0= 'IntegrationFlow' ) | (enumLiteral_1= 'InboundEndpoint' ) | (enumLiteral_2= 'OutboundEndpoint' ) | (enumLiteral_3= 'Pipeline' ) ) )
            // InternalEsbDsl.g:739:2: ( (enumLiteral_0= 'IntegrationFlow' ) | (enumLiteral_1= 'InboundEndpoint' ) | (enumLiteral_2= 'OutboundEndpoint' ) | (enumLiteral_3= 'Pipeline' ) )
            {
            // InternalEsbDsl.g:739:2: ( (enumLiteral_0= 'IntegrationFlow' ) | (enumLiteral_1= 'InboundEndpoint' ) | (enumLiteral_2= 'OutboundEndpoint' ) | (enumLiteral_3= 'Pipeline' ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt9=1;
                }
                break;
            case 28:
                {
                alt9=2;
                }
                break;
            case 29:
                {
                alt9=3;
                }
                break;
            case 30:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalEsbDsl.g:740:3: (enumLiteral_0= 'IntegrationFlow' )
                    {
                    // InternalEsbDsl.g:740:3: (enumLiteral_0= 'IntegrationFlow' )
                    // InternalEsbDsl.g:741:4: enumLiteral_0= 'IntegrationFlow'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getParticipantTypeAccess().getINTEGRATIONFLOWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getParticipantTypeAccess().getINTEGRATIONFLOWEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEsbDsl.g:748:3: (enumLiteral_1= 'InboundEndpoint' )
                    {
                    // InternalEsbDsl.g:748:3: (enumLiteral_1= 'InboundEndpoint' )
                    // InternalEsbDsl.g:749:4: enumLiteral_1= 'InboundEndpoint'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getParticipantTypeAccess().getINBOUNDENDPOINTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getParticipantTypeAccess().getINBOUNDENDPOINTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEsbDsl.g:756:3: (enumLiteral_2= 'OutboundEndpoint' )
                    {
                    // InternalEsbDsl.g:756:3: (enumLiteral_2= 'OutboundEndpoint' )
                    // InternalEsbDsl.g:757:4: enumLiteral_2= 'OutboundEndpoint'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getParticipantTypeAccess().getOUTBOUNDENDPOINTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getParticipantTypeAccess().getOUTBOUNDENDPOINTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEsbDsl.g:764:3: (enumLiteral_3= 'Pipeline' )
                    {
                    // InternalEsbDsl.g:764:3: (enumLiteral_3= 'Pipeline' )
                    // InternalEsbDsl.g:765:4: enumLiteral_3= 'Pipeline'
                    {
                    enumLiteral_3=(Token)match(input,30,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000007C83812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000003C83010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000003C83812L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003F82010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000078000000L});

}
