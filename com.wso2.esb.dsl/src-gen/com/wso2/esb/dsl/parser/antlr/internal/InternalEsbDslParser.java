package com.wso2.esb.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'participant'", "':'", "'message_processor'", "'('", "')'", "','"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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
    // InternalEsbDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalEsbDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalEsbDsl.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalEsbDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_participants_1_0= ruleParticipant ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_commands_2_0= ruleCommand ) ) )+ ) ) )* ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_participants_1_0 = null;

        EObject lv_commands_2_0 = null;



        	enterRule();

        try {
            // InternalEsbDsl.g:77:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_participants_1_0= ruleParticipant ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_commands_2_0= ruleCommand ) ) )+ ) ) )* ) ) ) )
            // InternalEsbDsl.g:78:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_participants_1_0= ruleParticipant ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_commands_2_0= ruleCommand ) ) )+ ) ) )* ) ) )
            {
            // InternalEsbDsl.g:78:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_participants_1_0= ruleParticipant ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_commands_2_0= ruleCommand ) ) )+ ) ) )* ) ) )
            // InternalEsbDsl.g:79:3: ( ( ( ({...}? => ( ({...}? => ( (lv_participants_1_0= ruleParticipant ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_commands_2_0= ruleCommand ) ) )+ ) ) )* ) )
            {
            // InternalEsbDsl.g:79:3: ( ( ( ({...}? => ( ({...}? => ( (lv_participants_1_0= ruleParticipant ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_commands_2_0= ruleCommand ) ) )+ ) ) )* ) )
            // InternalEsbDsl.g:80:4: ( ( ({...}? => ( ({...}? => ( (lv_participants_1_0= ruleParticipant ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_commands_2_0= ruleCommand ) ) )+ ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup());
            			
            // InternalEsbDsl.g:83:4: ( ( ({...}? => ( ({...}? => ( (lv_participants_1_0= ruleParticipant ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_commands_2_0= ruleCommand ) ) )+ ) ) )* )
            // InternalEsbDsl.g:84:5: ( ({...}? => ( ({...}? => ( (lv_participants_1_0= ruleParticipant ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_commands_2_0= ruleCommand ) ) )+ ) ) )*
            {
            // InternalEsbDsl.g:84:5: ( ({...}? => ( ({...}? => ( (lv_participants_1_0= ruleParticipant ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_commands_2_0= ruleCommand ) ) )+ ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEsbDsl.g:85:3: ({...}? => ( ({...}? => ( (lv_participants_1_0= ruleParticipant ) ) )+ ) )
            	    {
            	    // InternalEsbDsl.g:85:3: ({...}? => ( ({...}? => ( (lv_participants_1_0= ruleParticipant ) ) )+ ) )
            	    // InternalEsbDsl.g:86:4: {...}? => ( ({...}? => ( (lv_participants_1_0= ruleParticipant ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalEsbDsl.g:86:99: ( ({...}? => ( (lv_participants_1_0= ruleParticipant ) ) )+ )
            	    // InternalEsbDsl.g:87:5: ({...}? => ( (lv_participants_1_0= ruleParticipant ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalEsbDsl.g:90:8: ({...}? => ( (lv_participants_1_0= ruleParticipant ) ) )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==11) ) {
            	            int LA1_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt1=1;
            	            }


            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalEsbDsl.g:90:9: {...}? => ( (lv_participants_1_0= ruleParticipant ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    	    }
            	    	    // InternalEsbDsl.g:90:18: ( (lv_participants_1_0= ruleParticipant ) )
            	    	    // InternalEsbDsl.g:90:19: (lv_participants_1_0= ruleParticipant )
            	    	    {
            	    	    // InternalEsbDsl.g:90:19: (lv_participants_1_0= ruleParticipant )
            	    	    // InternalEsbDsl.g:91:9: lv_participants_1_0= ruleParticipant
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getModelAccess().getParticipantsParticipantParserRuleCall_0_0());
            	    	    								
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_participants_1_0=ruleParticipant();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"participants",
            	    	    										lv_participants_1_0,
            	    	    										"com.wso2.esb.dsl.EsbDsl.Participant");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt1 >= 1 ) break loop1;
            	                EarlyExitException eee =
            	                    new EarlyExitException(1, input);
            	                throw eee;
            	        }
            	        cnt1++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEsbDsl.g:113:3: ({...}? => ( ({...}? => ( (lv_commands_2_0= ruleCommand ) ) )+ ) )
            	    {
            	    // InternalEsbDsl.g:113:3: ({...}? => ( ({...}? => ( (lv_commands_2_0= ruleCommand ) ) )+ ) )
            	    // InternalEsbDsl.g:114:4: {...}? => ( ({...}? => ( (lv_commands_2_0= ruleCommand ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalEsbDsl.g:114:99: ( ({...}? => ( (lv_commands_2_0= ruleCommand ) ) )+ )
            	    // InternalEsbDsl.g:115:5: ({...}? => ( (lv_commands_2_0= ruleCommand ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalEsbDsl.g:118:8: ({...}? => ( (lv_commands_2_0= ruleCommand ) ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==13) ) {
            	            int LA2_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalEsbDsl.g:118:9: {...}? => ( (lv_commands_2_0= ruleCommand ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    	    }
            	    	    // InternalEsbDsl.g:118:18: ( (lv_commands_2_0= ruleCommand ) )
            	    	    // InternalEsbDsl.g:118:19: (lv_commands_2_0= ruleCommand )
            	    	    {
            	    	    // InternalEsbDsl.g:118:19: (lv_commands_2_0= ruleCommand )
            	    	    // InternalEsbDsl.g:119:9: lv_commands_2_0= ruleCommand
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_1_0());
            	    	    								
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_commands_2_0=ruleCommand();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"commands",
            	    	    										lv_commands_2_0,
            	    	    										"com.wso2.esb.dsl.EsbDsl.Command");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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


    // $ANTLR start "entryRuleParticipant"
    // InternalEsbDsl.g:151:1: entryRuleParticipant returns [EObject current=null] : iv_ruleParticipant= ruleParticipant EOF ;
    public final EObject entryRuleParticipant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipant = null;


        try {
            // InternalEsbDsl.g:151:52: (iv_ruleParticipant= ruleParticipant EOF )
            // InternalEsbDsl.g:152:2: iv_ruleParticipant= ruleParticipant EOF
            {
             newCompositeNode(grammarAccess.getParticipantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParticipant=ruleParticipant();

            state._fsp--;

             current =iv_ruleParticipant; 
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
    // $ANTLR end "entryRuleParticipant"


    // $ANTLR start "ruleParticipant"
    // InternalEsbDsl.g:158:1: ruleParticipant returns [EObject current=null] : (otherlv_0= 'participant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleParticipant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;


        	enterRule();

        try {
            // InternalEsbDsl.g:164:2: ( (otherlv_0= 'participant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= RULE_STRING ) ) ) )
            // InternalEsbDsl.g:165:2: (otherlv_0= 'participant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= RULE_STRING ) ) )
            {
            // InternalEsbDsl.g:165:2: (otherlv_0= 'participant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= RULE_STRING ) ) )
            // InternalEsbDsl.g:166:3: otherlv_0= 'participant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParticipantAccess().getParticipantKeyword_0());
            		
            // InternalEsbDsl.g:170:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEsbDsl.g:171:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEsbDsl.g:171:4: (lv_name_1_0= RULE_ID )
            // InternalEsbDsl.g:172:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParticipantAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParticipantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getParticipantAccess().getColonKeyword_2());
            		
            // InternalEsbDsl.g:192:3: ( (lv_description_3_0= RULE_STRING ) )
            // InternalEsbDsl.g:193:4: (lv_description_3_0= RULE_STRING )
            {
            // InternalEsbDsl.g:193:4: (lv_description_3_0= RULE_STRING )
            // InternalEsbDsl.g:194:5: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_description_3_0, grammarAccess.getParticipantAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParticipantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_3_0,
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
    // $ANTLR end "ruleParticipant"


    // $ANTLR start "entryRuleCommand"
    // InternalEsbDsl.g:214:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalEsbDsl.g:214:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalEsbDsl.g:215:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalEsbDsl.g:221:1: ruleCommand returns [EObject current=null] : (otherlv_0= 'message_processor' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ')' | (otherlv_4= ',' ( (lv_configs_5_0= RULE_STRING ) ) otherlv_6= ')' ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
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
            // InternalEsbDsl.g:227:2: ( (otherlv_0= 'message_processor' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ')' | (otherlv_4= ',' ( (lv_configs_5_0= RULE_STRING ) ) otherlv_6= ')' ) ) ) )
            // InternalEsbDsl.g:228:2: (otherlv_0= 'message_processor' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ')' | (otherlv_4= ',' ( (lv_configs_5_0= RULE_STRING ) ) otherlv_6= ')' ) ) )
            {
            // InternalEsbDsl.g:228:2: (otherlv_0= 'message_processor' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ')' | (otherlv_4= ',' ( (lv_configs_5_0= RULE_STRING ) ) otherlv_6= ')' ) ) )
            // InternalEsbDsl.g:229:3: otherlv_0= 'message_processor' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ')' | (otherlv_4= ',' ( (lv_configs_5_0= RULE_STRING ) ) otherlv_6= ')' ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandAccess().getMessage_processorKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEsbDsl.g:237:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalEsbDsl.g:238:4: (lv_name_2_0= RULE_ID )
            {
            // InternalEsbDsl.g:238:4: (lv_name_2_0= RULE_ID )
            // InternalEsbDsl.g:239:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEsbDsl.g:255:3: (otherlv_3= ')' | (otherlv_4= ',' ( (lv_configs_5_0= RULE_STRING ) ) otherlv_6= ')' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalEsbDsl.g:256:4: otherlv_3= ')'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getCommandAccess().getRightParenthesisKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalEsbDsl.g:261:4: (otherlv_4= ',' ( (lv_configs_5_0= RULE_STRING ) ) otherlv_6= ')' )
                    {
                    // InternalEsbDsl.g:261:4: (otherlv_4= ',' ( (lv_configs_5_0= RULE_STRING ) ) otherlv_6= ')' )
                    // InternalEsbDsl.g:262:5: otherlv_4= ',' ( (lv_configs_5_0= RULE_STRING ) ) otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_6); 

                    					newLeafNode(otherlv_4, grammarAccess.getCommandAccess().getCommaKeyword_3_1_0());
                    				
                    // InternalEsbDsl.g:266:5: ( (lv_configs_5_0= RULE_STRING ) )
                    // InternalEsbDsl.g:267:6: (lv_configs_5_0= RULE_STRING )
                    {
                    // InternalEsbDsl.g:267:6: (lv_configs_5_0= RULE_STRING )
                    // InternalEsbDsl.g:268:7: lv_configs_5_0= RULE_STRING
                    {
                    lv_configs_5_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    							newLeafNode(lv_configs_5_0, grammarAccess.getCommandAccess().getConfigsSTRINGTerminalRuleCall_3_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCommandRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"configs",
                    								lv_configs_5_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getCommandAccess().getRightParenthesisKeyword_3_1_2());
                    				

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
    // $ANTLR end "ruleCommand"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});

}
