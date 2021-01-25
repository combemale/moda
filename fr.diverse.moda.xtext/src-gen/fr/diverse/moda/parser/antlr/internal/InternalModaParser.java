package fr.diverse.moda.parser.antlr.internal;

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
import fr.diverse.moda.services.ModaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalModaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MODAModel'", "'{'", "','", "'}'", "'model'", "'data'", "'software'", "'sts'", "'relation'", "'->'", "'prescriptive'", "'predictive'", "'descriptive'", "'input'", "'output'", "'external'", "'measured'", "'generation'", "'enactment'", "'deployment'", "'measurement'", "'otherInterplay'", "'generalization'", "'preparation'", "'analysis'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
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


        public InternalModaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalModaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalModaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalModa.g"; }



     	private ModaGrammarAccess grammarAccess;

        public InternalModaParser(TokenStream input, ModaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MODAModel";
       	}

       	@Override
       	protected ModaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMODAModel"
    // InternalModa.g:65:1: entryRuleMODAModel returns [EObject current=null] : iv_ruleMODAModel= ruleMODAModel EOF ;
    public final EObject entryRuleMODAModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMODAModel = null;


        try {
            // InternalModa.g:65:50: (iv_ruleMODAModel= ruleMODAModel EOF )
            // InternalModa.g:66:2: iv_ruleMODAModel= ruleMODAModel EOF
            {
             newCompositeNode(grammarAccess.getMODAModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMODAModel=ruleMODAModel();

            state._fsp--;

             current =iv_ruleMODAModel; 
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
    // $ANTLR end "entryRuleMODAModel"


    // $ANTLR start "ruleMODAModel"
    // InternalModa.g:72:1: ruleMODAModel returns [EObject current=null] : ( () otherlv_1= 'MODAModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_model_4_0= ruleModel ) ) (otherlv_5= ',' ( ( (lv_model_6_0= ruleModel ) ) | ( (lv_data_7_0= ruleData ) ) | ( (lv_software_8_0= ruleRunningSoftware ) ) | ( (lv_sts_9_0= ruleSTS ) ) | ( (lv_modarelation_10_0= ruleMODARelation ) ) ) )* )? otherlv_11= '}' ) ;
    public final EObject ruleMODAModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_model_4_0 = null;

        EObject lv_model_6_0 = null;

        EObject lv_data_7_0 = null;

        EObject lv_software_8_0 = null;

        EObject lv_sts_9_0 = null;

        EObject lv_modarelation_10_0 = null;



        	enterRule();

        try {
            // InternalModa.g:78:2: ( ( () otherlv_1= 'MODAModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_model_4_0= ruleModel ) ) (otherlv_5= ',' ( ( (lv_model_6_0= ruleModel ) ) | ( (lv_data_7_0= ruleData ) ) | ( (lv_software_8_0= ruleRunningSoftware ) ) | ( (lv_sts_9_0= ruleSTS ) ) | ( (lv_modarelation_10_0= ruleMODARelation ) ) ) )* )? otherlv_11= '}' ) )
            // InternalModa.g:79:2: ( () otherlv_1= 'MODAModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_model_4_0= ruleModel ) ) (otherlv_5= ',' ( ( (lv_model_6_0= ruleModel ) ) | ( (lv_data_7_0= ruleData ) ) | ( (lv_software_8_0= ruleRunningSoftware ) ) | ( (lv_sts_9_0= ruleSTS ) ) | ( (lv_modarelation_10_0= ruleMODARelation ) ) ) )* )? otherlv_11= '}' )
            {
            // InternalModa.g:79:2: ( () otherlv_1= 'MODAModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_model_4_0= ruleModel ) ) (otherlv_5= ',' ( ( (lv_model_6_0= ruleModel ) ) | ( (lv_data_7_0= ruleData ) ) | ( (lv_software_8_0= ruleRunningSoftware ) ) | ( (lv_sts_9_0= ruleSTS ) ) | ( (lv_modarelation_10_0= ruleMODARelation ) ) ) )* )? otherlv_11= '}' )
            // InternalModa.g:80:3: () otherlv_1= 'MODAModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_model_4_0= ruleModel ) ) (otherlv_5= ',' ( ( (lv_model_6_0= ruleModel ) ) | ( (lv_data_7_0= ruleData ) ) | ( (lv_software_8_0= ruleRunningSoftware ) ) | ( (lv_sts_9_0= ruleSTS ) ) | ( (lv_modarelation_10_0= ruleMODARelation ) ) ) )* )? otherlv_11= '}'
            {
            // InternalModa.g:80:3: ()
            // InternalModa.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMODAModelAccess().getMODAModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMODAModelAccess().getMODAModelKeyword_1());
            		
            // InternalModa.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModa.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalModa.g:92:4: (lv_name_2_0= ruleEString )
            // InternalModa.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMODAModelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMODAModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.diverse.moda.Moda.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getMODAModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalModa.g:114:3: ( ( (lv_model_4_0= ruleModel ) ) (otherlv_5= ',' ( ( (lv_model_6_0= ruleModel ) ) | ( (lv_data_7_0= ruleData ) ) | ( (lv_software_8_0= ruleRunningSoftware ) ) | ( (lv_sts_9_0= ruleSTS ) ) | ( (lv_modarelation_10_0= ruleMODARelation ) ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalModa.g:115:4: ( (lv_model_4_0= ruleModel ) ) (otherlv_5= ',' ( ( (lv_model_6_0= ruleModel ) ) | ( (lv_data_7_0= ruleData ) ) | ( (lv_software_8_0= ruleRunningSoftware ) ) | ( (lv_sts_9_0= ruleSTS ) ) | ( (lv_modarelation_10_0= ruleMODARelation ) ) ) )*
                    {
                    // InternalModa.g:115:4: ( (lv_model_4_0= ruleModel ) )
                    // InternalModa.g:116:5: (lv_model_4_0= ruleModel )
                    {
                    // InternalModa.g:116:5: (lv_model_4_0= ruleModel )
                    // InternalModa.g:117:6: lv_model_4_0= ruleModel
                    {

                    						newCompositeNode(grammarAccess.getMODAModelAccess().getModelModelParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_model_4_0=ruleModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMODAModelRule());
                    						}
                    						add(
                    							current,
                    							"model",
                    							lv_model_4_0,
                    							"fr.diverse.moda.Moda.Model");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModa.g:134:4: (otherlv_5= ',' ( ( (lv_model_6_0= ruleModel ) ) | ( (lv_data_7_0= ruleData ) ) | ( (lv_software_8_0= ruleRunningSoftware ) ) | ( (lv_sts_9_0= ruleSTS ) ) | ( (lv_modarelation_10_0= ruleMODARelation ) ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==13) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalModa.g:135:5: otherlv_5= ',' ( ( (lv_model_6_0= ruleModel ) ) | ( (lv_data_7_0= ruleData ) ) | ( (lv_software_8_0= ruleRunningSoftware ) ) | ( (lv_sts_9_0= ruleSTS ) ) | ( (lv_modarelation_10_0= ruleMODARelation ) ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_7); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getMODAModelAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalModa.g:139:5: ( ( (lv_model_6_0= ruleModel ) ) | ( (lv_data_7_0= ruleData ) ) | ( (lv_software_8_0= ruleRunningSoftware ) ) | ( (lv_sts_9_0= ruleSTS ) ) | ( (lv_modarelation_10_0= ruleMODARelation ) ) )
                    	    int alt1=5;
                    	    switch ( input.LA(1) ) {
                    	    case 15:
                    	        {
                    	        alt1=1;
                    	        }
                    	        break;
                    	    case 16:
                    	        {
                    	        alt1=2;
                    	        }
                    	        break;
                    	    case 17:
                    	        {
                    	        alt1=3;
                    	        }
                    	        break;
                    	    case 18:
                    	        {
                    	        alt1=4;
                    	        }
                    	        break;
                    	    case 19:
                    	        {
                    	        alt1=5;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 1, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt1) {
                    	        case 1 :
                    	            // InternalModa.g:140:6: ( (lv_model_6_0= ruleModel ) )
                    	            {
                    	            // InternalModa.g:140:6: ( (lv_model_6_0= ruleModel ) )
                    	            // InternalModa.g:141:7: (lv_model_6_0= ruleModel )
                    	            {
                    	            // InternalModa.g:141:7: (lv_model_6_0= ruleModel )
                    	            // InternalModa.g:142:8: lv_model_6_0= ruleModel
                    	            {

                    	            								newCompositeNode(grammarAccess.getMODAModelAccess().getModelModelParserRuleCall_4_1_1_0_0());
                    	            							
                    	            pushFollow(FOLLOW_6);
                    	            lv_model_6_0=ruleModel();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getMODAModelRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"model",
                    	            									lv_model_6_0,
                    	            									"fr.diverse.moda.Moda.Model");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalModa.g:160:6: ( (lv_data_7_0= ruleData ) )
                    	            {
                    	            // InternalModa.g:160:6: ( (lv_data_7_0= ruleData ) )
                    	            // InternalModa.g:161:7: (lv_data_7_0= ruleData )
                    	            {
                    	            // InternalModa.g:161:7: (lv_data_7_0= ruleData )
                    	            // InternalModa.g:162:8: lv_data_7_0= ruleData
                    	            {

                    	            								newCompositeNode(grammarAccess.getMODAModelAccess().getDataDataParserRuleCall_4_1_1_1_0());
                    	            							
                    	            pushFollow(FOLLOW_6);
                    	            lv_data_7_0=ruleData();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getMODAModelRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"data",
                    	            									lv_data_7_0,
                    	            									"fr.diverse.moda.Moda.Data");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalModa.g:180:6: ( (lv_software_8_0= ruleRunningSoftware ) )
                    	            {
                    	            // InternalModa.g:180:6: ( (lv_software_8_0= ruleRunningSoftware ) )
                    	            // InternalModa.g:181:7: (lv_software_8_0= ruleRunningSoftware )
                    	            {
                    	            // InternalModa.g:181:7: (lv_software_8_0= ruleRunningSoftware )
                    	            // InternalModa.g:182:8: lv_software_8_0= ruleRunningSoftware
                    	            {

                    	            								newCompositeNode(grammarAccess.getMODAModelAccess().getSoftwareRunningSoftwareParserRuleCall_4_1_1_2_0());
                    	            							
                    	            pushFollow(FOLLOW_6);
                    	            lv_software_8_0=ruleRunningSoftware();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getMODAModelRule());
                    	            								}
                    	            								set(
                    	            									current,
                    	            									"software",
                    	            									lv_software_8_0,
                    	            									"fr.diverse.moda.Moda.RunningSoftware");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 4 :
                    	            // InternalModa.g:200:6: ( (lv_sts_9_0= ruleSTS ) )
                    	            {
                    	            // InternalModa.g:200:6: ( (lv_sts_9_0= ruleSTS ) )
                    	            // InternalModa.g:201:7: (lv_sts_9_0= ruleSTS )
                    	            {
                    	            // InternalModa.g:201:7: (lv_sts_9_0= ruleSTS )
                    	            // InternalModa.g:202:8: lv_sts_9_0= ruleSTS
                    	            {

                    	            								newCompositeNode(grammarAccess.getMODAModelAccess().getStsSTSParserRuleCall_4_1_1_3_0());
                    	            							
                    	            pushFollow(FOLLOW_6);
                    	            lv_sts_9_0=ruleSTS();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getMODAModelRule());
                    	            								}
                    	            								set(
                    	            									current,
                    	            									"sts",
                    	            									lv_sts_9_0,
                    	            									"fr.diverse.moda.Moda.STS");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 5 :
                    	            // InternalModa.g:220:6: ( (lv_modarelation_10_0= ruleMODARelation ) )
                    	            {
                    	            // InternalModa.g:220:6: ( (lv_modarelation_10_0= ruleMODARelation ) )
                    	            // InternalModa.g:221:7: (lv_modarelation_10_0= ruleMODARelation )
                    	            {
                    	            // InternalModa.g:221:7: (lv_modarelation_10_0= ruleMODARelation )
                    	            // InternalModa.g:222:8: lv_modarelation_10_0= ruleMODARelation
                    	            {

                    	            								newCompositeNode(grammarAccess.getMODAModelAccess().getModarelationMODARelationParserRuleCall_4_1_1_4_0());
                    	            							
                    	            pushFollow(FOLLOW_6);
                    	            lv_modarelation_10_0=ruleMODARelation();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getMODAModelRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"modarelation",
                    	            									lv_modarelation_10_0,
                    	            									"fr.diverse.moda.Moda.MODARelation");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getMODAModelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMODAModel"


    // $ANTLR start "entryRuleModel"
    // InternalModa.g:250:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalModa.g:250:46: (iv_ruleModel= ruleModel EOF )
            // InternalModa.g:251:2: iv_ruleModel= ruleModel EOF
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
    // InternalModa.g:257:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'model' ( (lv_name_2_0= ruleEString ) ) ( (lv_kind_3_0= ruleModelKind ) ) ( (lv_description_4_0= ruleEString ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_kind_3_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalModa.g:263:2: ( ( () otherlv_1= 'model' ( (lv_name_2_0= ruleEString ) ) ( (lv_kind_3_0= ruleModelKind ) ) ( (lv_description_4_0= ruleEString ) )? ) )
            // InternalModa.g:264:2: ( () otherlv_1= 'model' ( (lv_name_2_0= ruleEString ) ) ( (lv_kind_3_0= ruleModelKind ) ) ( (lv_description_4_0= ruleEString ) )? )
            {
            // InternalModa.g:264:2: ( () otherlv_1= 'model' ( (lv_name_2_0= ruleEString ) ) ( (lv_kind_3_0= ruleModelKind ) ) ( (lv_description_4_0= ruleEString ) )? )
            // InternalModa.g:265:3: () otherlv_1= 'model' ( (lv_name_2_0= ruleEString ) ) ( (lv_kind_3_0= ruleModelKind ) ) ( (lv_description_4_0= ruleEString ) )?
            {
            // InternalModa.g:265:3: ()
            // InternalModa.g:266:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
            		
            // InternalModa.g:276:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModa.g:277:4: (lv_name_2_0= ruleEString )
            {
            // InternalModa.g:277:4: (lv_name_2_0= ruleEString )
            // InternalModa.g:278:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.diverse.moda.Moda.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModa.g:295:3: ( (lv_kind_3_0= ruleModelKind ) )
            // InternalModa.g:296:4: (lv_kind_3_0= ruleModelKind )
            {
            // InternalModa.g:296:4: (lv_kind_3_0= ruleModelKind )
            // InternalModa.g:297:5: lv_kind_3_0= ruleModelKind
            {

            					newCompositeNode(grammarAccess.getModelAccess().getKindModelKindEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_kind_3_0=ruleModelKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_3_0,
            						"fr.diverse.moda.Moda.ModelKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModa.g:314:3: ( (lv_description_4_0= ruleEString ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalModa.g:315:4: (lv_description_4_0= ruleEString )
                    {
                    // InternalModa.g:315:4: (lv_description_4_0= ruleEString )
                    // InternalModa.g:316:5: lv_description_4_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getDescriptionEStringParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_4_0,
                    						"fr.diverse.moda.Moda.EString");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleData"
    // InternalModa.g:337:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalModa.g:337:45: (iv_ruleData= ruleData EOF )
            // InternalModa.g:338:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
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
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalModa.g:344:1: ruleData returns [EObject current=null] : ( () otherlv_1= 'data' ( (lv_name_2_0= ruleEString ) ) ( (lv_kind_3_0= ruleDataKind ) ) ( (lv_description_4_0= ruleEString ) )? ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_kind_3_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalModa.g:350:2: ( ( () otherlv_1= 'data' ( (lv_name_2_0= ruleEString ) ) ( (lv_kind_3_0= ruleDataKind ) ) ( (lv_description_4_0= ruleEString ) )? ) )
            // InternalModa.g:351:2: ( () otherlv_1= 'data' ( (lv_name_2_0= ruleEString ) ) ( (lv_kind_3_0= ruleDataKind ) ) ( (lv_description_4_0= ruleEString ) )? )
            {
            // InternalModa.g:351:2: ( () otherlv_1= 'data' ( (lv_name_2_0= ruleEString ) ) ( (lv_kind_3_0= ruleDataKind ) ) ( (lv_description_4_0= ruleEString ) )? )
            // InternalModa.g:352:3: () otherlv_1= 'data' ( (lv_name_2_0= ruleEString ) ) ( (lv_kind_3_0= ruleDataKind ) ) ( (lv_description_4_0= ruleEString ) )?
            {
            // InternalModa.g:352:3: ()
            // InternalModa.g:353:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataAccess().getDataAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDataAccess().getDataKeyword_1());
            		
            // InternalModa.g:363:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModa.g:364:4: (lv_name_2_0= ruleEString )
            {
            // InternalModa.g:364:4: (lv_name_2_0= ruleEString )
            // InternalModa.g:365:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.diverse.moda.Moda.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModa.g:382:3: ( (lv_kind_3_0= ruleDataKind ) )
            // InternalModa.g:383:4: (lv_kind_3_0= ruleDataKind )
            {
            // InternalModa.g:383:4: (lv_kind_3_0= ruleDataKind )
            // InternalModa.g:384:5: lv_kind_3_0= ruleDataKind
            {

            					newCompositeNode(grammarAccess.getDataAccess().getKindDataKindEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_kind_3_0=ruleDataKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_3_0,
            						"fr.diverse.moda.Moda.DataKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModa.g:401:3: ( (lv_description_4_0= ruleEString ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalModa.g:402:4: (lv_description_4_0= ruleEString )
                    {
                    // InternalModa.g:402:4: (lv_description_4_0= ruleEString )
                    // InternalModa.g:403:5: lv_description_4_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getDataAccess().getDescriptionEStringParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDataRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_4_0,
                    						"fr.diverse.moda.Moda.EString");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleRunningSoftware"
    // InternalModa.g:424:1: entryRuleRunningSoftware returns [EObject current=null] : iv_ruleRunningSoftware= ruleRunningSoftware EOF ;
    public final EObject entryRuleRunningSoftware() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunningSoftware = null;


        try {
            // InternalModa.g:424:56: (iv_ruleRunningSoftware= ruleRunningSoftware EOF )
            // InternalModa.g:425:2: iv_ruleRunningSoftware= ruleRunningSoftware EOF
            {
             newCompositeNode(grammarAccess.getRunningSoftwareRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRunningSoftware=ruleRunningSoftware();

            state._fsp--;

             current =iv_ruleRunningSoftware; 
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
    // $ANTLR end "entryRuleRunningSoftware"


    // $ANTLR start "ruleRunningSoftware"
    // InternalModa.g:431:1: ruleRunningSoftware returns [EObject current=null] : ( () otherlv_1= 'software' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleRunningSoftware() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalModa.g:437:2: ( ( () otherlv_1= 'software' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalModa.g:438:2: ( () otherlv_1= 'software' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalModa.g:438:2: ( () otherlv_1= 'software' ( (lv_name_2_0= ruleEString ) ) )
            // InternalModa.g:439:3: () otherlv_1= 'software' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalModa.g:439:3: ()
            // InternalModa.g:440:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRunningSoftwareAccess().getRunningSoftwareAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRunningSoftwareAccess().getSoftwareKeyword_1());
            		
            // InternalModa.g:450:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModa.g:451:4: (lv_name_2_0= ruleEString )
            {
            // InternalModa.g:451:4: (lv_name_2_0= ruleEString )
            // InternalModa.g:452:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRunningSoftwareAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRunningSoftwareRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.diverse.moda.Moda.EString");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleRunningSoftware"


    // $ANTLR start "entryRuleSTS"
    // InternalModa.g:473:1: entryRuleSTS returns [EObject current=null] : iv_ruleSTS= ruleSTS EOF ;
    public final EObject entryRuleSTS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSTS = null;


        try {
            // InternalModa.g:473:44: (iv_ruleSTS= ruleSTS EOF )
            // InternalModa.g:474:2: iv_ruleSTS= ruleSTS EOF
            {
             newCompositeNode(grammarAccess.getSTSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSTS=ruleSTS();

            state._fsp--;

             current =iv_ruleSTS; 
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
    // $ANTLR end "entryRuleSTS"


    // $ANTLR start "ruleSTS"
    // InternalModa.g:480:1: ruleSTS returns [EObject current=null] : ( () otherlv_1= 'sts' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleSTS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalModa.g:486:2: ( ( () otherlv_1= 'sts' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalModa.g:487:2: ( () otherlv_1= 'sts' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalModa.g:487:2: ( () otherlv_1= 'sts' ( (lv_name_2_0= ruleEString ) ) )
            // InternalModa.g:488:3: () otherlv_1= 'sts' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalModa.g:488:3: ()
            // InternalModa.g:489:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSTSAccess().getSTSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSTSAccess().getStsKeyword_1());
            		
            // InternalModa.g:499:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModa.g:500:4: (lv_name_2_0= ruleEString )
            {
            // InternalModa.g:500:4: (lv_name_2_0= ruleEString )
            // InternalModa.g:501:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSTSAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSTSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.diverse.moda.Moda.EString");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleSTS"


    // $ANTLR start "entryRuleMODARelation"
    // InternalModa.g:522:1: entryRuleMODARelation returns [EObject current=null] : iv_ruleMODARelation= ruleMODARelation EOF ;
    public final EObject entryRuleMODARelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMODARelation = null;


        try {
            // InternalModa.g:522:53: (iv_ruleMODARelation= ruleMODARelation EOF )
            // InternalModa.g:523:2: iv_ruleMODARelation= ruleMODARelation EOF
            {
             newCompositeNode(grammarAccess.getMODARelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMODARelation=ruleMODARelation();

            state._fsp--;

             current =iv_ruleMODARelation; 
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
    // $ANTLR end "entryRuleMODARelation"


    // $ANTLR start "ruleMODARelation"
    // InternalModa.g:529:1: ruleMODARelation returns [EObject current=null] : ( () otherlv_1= 'relation' ( (lv_name_2_0= ruleEString ) ) ( (lv_kind_3_0= ruleRelationKind ) ) ( ( ruleEString ) ) otherlv_5= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleMODARelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_kind_3_0 = null;



        	enterRule();

        try {
            // InternalModa.g:535:2: ( ( () otherlv_1= 'relation' ( (lv_name_2_0= ruleEString ) ) ( (lv_kind_3_0= ruleRelationKind ) ) ( ( ruleEString ) ) otherlv_5= '->' ( ( ruleEString ) ) ) )
            // InternalModa.g:536:2: ( () otherlv_1= 'relation' ( (lv_name_2_0= ruleEString ) ) ( (lv_kind_3_0= ruleRelationKind ) ) ( ( ruleEString ) ) otherlv_5= '->' ( ( ruleEString ) ) )
            {
            // InternalModa.g:536:2: ( () otherlv_1= 'relation' ( (lv_name_2_0= ruleEString ) ) ( (lv_kind_3_0= ruleRelationKind ) ) ( ( ruleEString ) ) otherlv_5= '->' ( ( ruleEString ) ) )
            // InternalModa.g:537:3: () otherlv_1= 'relation' ( (lv_name_2_0= ruleEString ) ) ( (lv_kind_3_0= ruleRelationKind ) ) ( ( ruleEString ) ) otherlv_5= '->' ( ( ruleEString ) )
            {
            // InternalModa.g:537:3: ()
            // InternalModa.g:538:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMODARelationAccess().getMODARelationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMODARelationAccess().getRelationKeyword_1());
            		
            // InternalModa.g:548:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModa.g:549:4: (lv_name_2_0= ruleEString )
            {
            // InternalModa.g:549:4: (lv_name_2_0= ruleEString )
            // InternalModa.g:550:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMODARelationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMODARelationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.diverse.moda.Moda.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModa.g:567:3: ( (lv_kind_3_0= ruleRelationKind ) )
            // InternalModa.g:568:4: (lv_kind_3_0= ruleRelationKind )
            {
            // InternalModa.g:568:4: (lv_kind_3_0= ruleRelationKind )
            // InternalModa.g:569:5: lv_kind_3_0= ruleRelationKind
            {

            					newCompositeNode(grammarAccess.getMODARelationAccess().getKindRelationKindEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_3);
            lv_kind_3_0=ruleRelationKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMODARelationRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_3_0,
            						"fr.diverse.moda.Moda.RelationKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModa.g:586:3: ( ( ruleEString ) )
            // InternalModa.g:587:4: ( ruleEString )
            {
            // InternalModa.g:587:4: ( ruleEString )
            // InternalModa.g:588:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMODARelationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMODARelationAccess().getSrcMODAElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getMODARelationAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            // InternalModa.g:606:3: ( ( ruleEString ) )
            // InternalModa.g:607:4: ( ruleEString )
            {
            // InternalModa.g:607:4: ( ruleEString )
            // InternalModa.g:608:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMODARelationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMODARelationAccess().getTgtMODAElementCrossReference_6_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleMODARelation"


    // $ANTLR start "entryRuleEString"
    // InternalModa.g:626:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalModa.g:626:47: (iv_ruleEString= ruleEString EOF )
            // InternalModa.g:627:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalModa.g:633:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalModa.g:639:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalModa.g:640:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalModa.g:640:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalModa.g:641:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalModa.g:649:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleModelKind"
    // InternalModa.g:660:1: ruleModelKind returns [Enumerator current=null] : ( (enumLiteral_0= 'prescriptive' ) | (enumLiteral_1= 'predictive' ) | (enumLiteral_2= 'descriptive' ) ) ;
    public final Enumerator ruleModelKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalModa.g:666:2: ( ( (enumLiteral_0= 'prescriptive' ) | (enumLiteral_1= 'predictive' ) | (enumLiteral_2= 'descriptive' ) ) )
            // InternalModa.g:667:2: ( (enumLiteral_0= 'prescriptive' ) | (enumLiteral_1= 'predictive' ) | (enumLiteral_2= 'descriptive' ) )
            {
            // InternalModa.g:667:2: ( (enumLiteral_0= 'prescriptive' ) | (enumLiteral_1= 'predictive' ) | (enumLiteral_2= 'descriptive' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt7=1;
                }
                break;
            case 22:
                {
                alt7=2;
                }
                break;
            case 23:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalModa.g:668:3: (enumLiteral_0= 'prescriptive' )
                    {
                    // InternalModa.g:668:3: (enumLiteral_0= 'prescriptive' )
                    // InternalModa.g:669:4: enumLiteral_0= 'prescriptive'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getModelKindAccess().getPrescriptiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getModelKindAccess().getPrescriptiveEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModa.g:676:3: (enumLiteral_1= 'predictive' )
                    {
                    // InternalModa.g:676:3: (enumLiteral_1= 'predictive' )
                    // InternalModa.g:677:4: enumLiteral_1= 'predictive'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getModelKindAccess().getPredictiveEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getModelKindAccess().getPredictiveEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalModa.g:684:3: (enumLiteral_2= 'descriptive' )
                    {
                    // InternalModa.g:684:3: (enumLiteral_2= 'descriptive' )
                    // InternalModa.g:685:4: enumLiteral_2= 'descriptive'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getModelKindAccess().getDescriptiveEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getModelKindAccess().getDescriptiveEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleModelKind"


    // $ANTLR start "ruleDataKind"
    // InternalModa.g:695:1: ruleDataKind returns [Enumerator current=null] : ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'external' ) | (enumLiteral_3= 'measured' ) ) ;
    public final Enumerator ruleDataKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalModa.g:701:2: ( ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'external' ) | (enumLiteral_3= 'measured' ) ) )
            // InternalModa.g:702:2: ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'external' ) | (enumLiteral_3= 'measured' ) )
            {
            // InternalModa.g:702:2: ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'external' ) | (enumLiteral_3= 'measured' ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt8=1;
                }
                break;
            case 25:
                {
                alt8=2;
                }
                break;
            case 26:
                {
                alt8=3;
                }
                break;
            case 27:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalModa.g:703:3: (enumLiteral_0= 'input' )
                    {
                    // InternalModa.g:703:3: (enumLiteral_0= 'input' )
                    // InternalModa.g:704:4: enumLiteral_0= 'input'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getDataKindAccess().getInputEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataKindAccess().getInputEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModa.g:711:3: (enumLiteral_1= 'output' )
                    {
                    // InternalModa.g:711:3: (enumLiteral_1= 'output' )
                    // InternalModa.g:712:4: enumLiteral_1= 'output'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getDataKindAccess().getOutputEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataKindAccess().getOutputEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalModa.g:719:3: (enumLiteral_2= 'external' )
                    {
                    // InternalModa.g:719:3: (enumLiteral_2= 'external' )
                    // InternalModa.g:720:4: enumLiteral_2= 'external'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getDataKindAccess().getExternalEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataKindAccess().getExternalEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalModa.g:727:3: (enumLiteral_3= 'measured' )
                    {
                    // InternalModa.g:727:3: (enumLiteral_3= 'measured' )
                    // InternalModa.g:728:4: enumLiteral_3= 'measured'
                    {
                    enumLiteral_3=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getDataKindAccess().getMeasuredEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataKindAccess().getMeasuredEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleDataKind"


    // $ANTLR start "ruleRelationKind"
    // InternalModa.g:738:1: ruleRelationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'generation' ) | (enumLiteral_1= 'enactment' ) | (enumLiteral_2= 'deployment' ) | (enumLiteral_3= 'input' ) | (enumLiteral_4= 'output' ) | (enumLiteral_5= 'measurement' ) | (enumLiteral_6= 'otherInterplay' ) | (enumLiteral_7= 'generalization' ) | (enumLiteral_8= 'preparation' ) | (enumLiteral_9= 'analysis' ) ) ;
    public final Enumerator ruleRelationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;


        	enterRule();

        try {
            // InternalModa.g:744:2: ( ( (enumLiteral_0= 'generation' ) | (enumLiteral_1= 'enactment' ) | (enumLiteral_2= 'deployment' ) | (enumLiteral_3= 'input' ) | (enumLiteral_4= 'output' ) | (enumLiteral_5= 'measurement' ) | (enumLiteral_6= 'otherInterplay' ) | (enumLiteral_7= 'generalization' ) | (enumLiteral_8= 'preparation' ) | (enumLiteral_9= 'analysis' ) ) )
            // InternalModa.g:745:2: ( (enumLiteral_0= 'generation' ) | (enumLiteral_1= 'enactment' ) | (enumLiteral_2= 'deployment' ) | (enumLiteral_3= 'input' ) | (enumLiteral_4= 'output' ) | (enumLiteral_5= 'measurement' ) | (enumLiteral_6= 'otherInterplay' ) | (enumLiteral_7= 'generalization' ) | (enumLiteral_8= 'preparation' ) | (enumLiteral_9= 'analysis' ) )
            {
            // InternalModa.g:745:2: ( (enumLiteral_0= 'generation' ) | (enumLiteral_1= 'enactment' ) | (enumLiteral_2= 'deployment' ) | (enumLiteral_3= 'input' ) | (enumLiteral_4= 'output' ) | (enumLiteral_5= 'measurement' ) | (enumLiteral_6= 'otherInterplay' ) | (enumLiteral_7= 'generalization' ) | (enumLiteral_8= 'preparation' ) | (enumLiteral_9= 'analysis' ) )
            int alt9=10;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt9=1;
                }
                break;
            case 29:
                {
                alt9=2;
                }
                break;
            case 30:
                {
                alt9=3;
                }
                break;
            case 24:
                {
                alt9=4;
                }
                break;
            case 25:
                {
                alt9=5;
                }
                break;
            case 31:
                {
                alt9=6;
                }
                break;
            case 32:
                {
                alt9=7;
                }
                break;
            case 33:
                {
                alt9=8;
                }
                break;
            case 34:
                {
                alt9=9;
                }
                break;
            case 35:
                {
                alt9=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalModa.g:746:3: (enumLiteral_0= 'generation' )
                    {
                    // InternalModa.g:746:3: (enumLiteral_0= 'generation' )
                    // InternalModa.g:747:4: enumLiteral_0= 'generation'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getRelationKindAccess().getGenerationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRelationKindAccess().getGenerationEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModa.g:754:3: (enumLiteral_1= 'enactment' )
                    {
                    // InternalModa.g:754:3: (enumLiteral_1= 'enactment' )
                    // InternalModa.g:755:4: enumLiteral_1= 'enactment'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getRelationKindAccess().getEnactmentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRelationKindAccess().getEnactmentEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalModa.g:762:3: (enumLiteral_2= 'deployment' )
                    {
                    // InternalModa.g:762:3: (enumLiteral_2= 'deployment' )
                    // InternalModa.g:763:4: enumLiteral_2= 'deployment'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getRelationKindAccess().getDeploymentEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRelationKindAccess().getDeploymentEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalModa.g:770:3: (enumLiteral_3= 'input' )
                    {
                    // InternalModa.g:770:3: (enumLiteral_3= 'input' )
                    // InternalModa.g:771:4: enumLiteral_3= 'input'
                    {
                    enumLiteral_3=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getRelationKindAccess().getInputEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRelationKindAccess().getInputEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalModa.g:778:3: (enumLiteral_4= 'output' )
                    {
                    // InternalModa.g:778:3: (enumLiteral_4= 'output' )
                    // InternalModa.g:779:4: enumLiteral_4= 'output'
                    {
                    enumLiteral_4=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getRelationKindAccess().getOutputEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRelationKindAccess().getOutputEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalModa.g:786:3: (enumLiteral_5= 'measurement' )
                    {
                    // InternalModa.g:786:3: (enumLiteral_5= 'measurement' )
                    // InternalModa.g:787:4: enumLiteral_5= 'measurement'
                    {
                    enumLiteral_5=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getRelationKindAccess().getMeasurementEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getRelationKindAccess().getMeasurementEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalModa.g:794:3: (enumLiteral_6= 'otherInterplay' )
                    {
                    // InternalModa.g:794:3: (enumLiteral_6= 'otherInterplay' )
                    // InternalModa.g:795:4: enumLiteral_6= 'otherInterplay'
                    {
                    enumLiteral_6=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getRelationKindAccess().getOtherInterplayEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getRelationKindAccess().getOtherInterplayEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalModa.g:802:3: (enumLiteral_7= 'generalization' )
                    {
                    // InternalModa.g:802:3: (enumLiteral_7= 'generalization' )
                    // InternalModa.g:803:4: enumLiteral_7= 'generalization'
                    {
                    enumLiteral_7=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getRelationKindAccess().getGeneralizationEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getRelationKindAccess().getGeneralizationEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalModa.g:810:3: (enumLiteral_8= 'preparation' )
                    {
                    // InternalModa.g:810:3: (enumLiteral_8= 'preparation' )
                    // InternalModa.g:811:4: enumLiteral_8= 'preparation'
                    {
                    enumLiteral_8=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getRelationKindAccess().getPreparationEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getRelationKindAccess().getPreparationEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalModa.g:818:3: (enumLiteral_9= 'analysis' )
                    {
                    // InternalModa.g:818:3: (enumLiteral_9= 'analysis' )
                    // InternalModa.g:819:4: enumLiteral_9= 'analysis'
                    {
                    enumLiteral_9=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getRelationKindAccess().getAnalysisEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getRelationKindAccess().getAnalysisEnumLiteralDeclaration_9());
                    			

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
    // $ANTLR end "ruleRelationKind"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000F8000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000FF3000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});

}