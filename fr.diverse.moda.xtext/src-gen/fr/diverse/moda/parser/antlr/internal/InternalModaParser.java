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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MODAModel'", "'{'", "'model'", "','", "'}'", "'data'", "'software'", "'sts'", "'relation'", "'\"'", "'->'", "'tgt'", "'prescriptive'", "'predictive'", "'descriptive'", "'input'", "'output'", "'external'", "'measured'", "'generation'", "'enactment'", "'deployment'", "'measurement'", "'otherInterplay'", "'generalization'", "'preparation'", "'analysis'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
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
    public static final int T__36=36;
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
    // InternalModa.g:72:1: ruleMODAModel returns [EObject current=null] : ( () otherlv_1= 'MODAModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'model' otherlv_5= '{' ( (lv_model_6_0= ruleModel ) ) (otherlv_7= ',' ( (lv_model_8_0= ruleModel ) ) )* otherlv_9= '}' )? (otherlv_10= 'data' otherlv_11= '{' ( (lv_data_12_0= ruleData ) ) (otherlv_13= ',' ( (lv_data_14_0= ruleData ) ) )* otherlv_15= '}' )? (otherlv_16= 'software' ( (lv_software_17_0= ruleRunningSoftware ) ) )? (otherlv_18= 'sts' ( (lv_sts_19_0= ruleSTS ) ) )? (otherlv_20= 'relation' otherlv_21= '{' ( (lv_modarelation_22_0= ruleMODARelation ) ) (otherlv_23= ',' ( (lv_modarelation_24_0= ruleMODARelation ) ) )* otherlv_25= '}' )? otherlv_26= '}' ) ;
    public final EObject ruleMODAModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_model_6_0 = null;

        EObject lv_model_8_0 = null;

        EObject lv_data_12_0 = null;

        EObject lv_data_14_0 = null;

        EObject lv_software_17_0 = null;

        EObject lv_sts_19_0 = null;

        EObject lv_modarelation_22_0 = null;

        EObject lv_modarelation_24_0 = null;



        	enterRule();

        try {
            // InternalModa.g:78:2: ( ( () otherlv_1= 'MODAModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'model' otherlv_5= '{' ( (lv_model_6_0= ruleModel ) ) (otherlv_7= ',' ( (lv_model_8_0= ruleModel ) ) )* otherlv_9= '}' )? (otherlv_10= 'data' otherlv_11= '{' ( (lv_data_12_0= ruleData ) ) (otherlv_13= ',' ( (lv_data_14_0= ruleData ) ) )* otherlv_15= '}' )? (otherlv_16= 'software' ( (lv_software_17_0= ruleRunningSoftware ) ) )? (otherlv_18= 'sts' ( (lv_sts_19_0= ruleSTS ) ) )? (otherlv_20= 'relation' otherlv_21= '{' ( (lv_modarelation_22_0= ruleMODARelation ) ) (otherlv_23= ',' ( (lv_modarelation_24_0= ruleMODARelation ) ) )* otherlv_25= '}' )? otherlv_26= '}' ) )
            // InternalModa.g:79:2: ( () otherlv_1= 'MODAModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'model' otherlv_5= '{' ( (lv_model_6_0= ruleModel ) ) (otherlv_7= ',' ( (lv_model_8_0= ruleModel ) ) )* otherlv_9= '}' )? (otherlv_10= 'data' otherlv_11= '{' ( (lv_data_12_0= ruleData ) ) (otherlv_13= ',' ( (lv_data_14_0= ruleData ) ) )* otherlv_15= '}' )? (otherlv_16= 'software' ( (lv_software_17_0= ruleRunningSoftware ) ) )? (otherlv_18= 'sts' ( (lv_sts_19_0= ruleSTS ) ) )? (otherlv_20= 'relation' otherlv_21= '{' ( (lv_modarelation_22_0= ruleMODARelation ) ) (otherlv_23= ',' ( (lv_modarelation_24_0= ruleMODARelation ) ) )* otherlv_25= '}' )? otherlv_26= '}' )
            {
            // InternalModa.g:79:2: ( () otherlv_1= 'MODAModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'model' otherlv_5= '{' ( (lv_model_6_0= ruleModel ) ) (otherlv_7= ',' ( (lv_model_8_0= ruleModel ) ) )* otherlv_9= '}' )? (otherlv_10= 'data' otherlv_11= '{' ( (lv_data_12_0= ruleData ) ) (otherlv_13= ',' ( (lv_data_14_0= ruleData ) ) )* otherlv_15= '}' )? (otherlv_16= 'software' ( (lv_software_17_0= ruleRunningSoftware ) ) )? (otherlv_18= 'sts' ( (lv_sts_19_0= ruleSTS ) ) )? (otherlv_20= 'relation' otherlv_21= '{' ( (lv_modarelation_22_0= ruleMODARelation ) ) (otherlv_23= ',' ( (lv_modarelation_24_0= ruleMODARelation ) ) )* otherlv_25= '}' )? otherlv_26= '}' )
            // InternalModa.g:80:3: () otherlv_1= 'MODAModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'model' otherlv_5= '{' ( (lv_model_6_0= ruleModel ) ) (otherlv_7= ',' ( (lv_model_8_0= ruleModel ) ) )* otherlv_9= '}' )? (otherlv_10= 'data' otherlv_11= '{' ( (lv_data_12_0= ruleData ) ) (otherlv_13= ',' ( (lv_data_14_0= ruleData ) ) )* otherlv_15= '}' )? (otherlv_16= 'software' ( (lv_software_17_0= ruleRunningSoftware ) ) )? (otherlv_18= 'sts' ( (lv_sts_19_0= ruleSTS ) ) )? (otherlv_20= 'relation' otherlv_21= '{' ( (lv_modarelation_22_0= ruleMODARelation ) ) (otherlv_23= ',' ( (lv_modarelation_24_0= ruleMODARelation ) ) )* otherlv_25= '}' )? otherlv_26= '}'
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
            		
            // InternalModa.g:114:3: (otherlv_4= 'model' otherlv_5= '{' ( (lv_model_6_0= ruleModel ) ) (otherlv_7= ',' ( (lv_model_8_0= ruleModel ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalModa.g:115:4: otherlv_4= 'model' otherlv_5= '{' ( (lv_model_6_0= ruleModel ) ) (otherlv_7= ',' ( (lv_model_8_0= ruleModel ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getMODAModelAccess().getModelKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getMODAModelAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalModa.g:123:4: ( (lv_model_6_0= ruleModel ) )
                    // InternalModa.g:124:5: (lv_model_6_0= ruleModel )
                    {
                    // InternalModa.g:124:5: (lv_model_6_0= ruleModel )
                    // InternalModa.g:125:6: lv_model_6_0= ruleModel
                    {

                    						newCompositeNode(grammarAccess.getMODAModelAccess().getModelModelParserRuleCall_4_2_0());
                    					
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

                    // InternalModa.g:142:4: (otherlv_7= ',' ( (lv_model_8_0= ruleModel ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalModa.g:143:5: otherlv_7= ',' ( (lv_model_8_0= ruleModel ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getMODAModelAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalModa.g:147:5: ( (lv_model_8_0= ruleModel ) )
                    	    // InternalModa.g:148:6: (lv_model_8_0= ruleModel )
                    	    {
                    	    // InternalModa.g:148:6: (lv_model_8_0= ruleModel )
                    	    // InternalModa.g:149:7: lv_model_8_0= ruleModel
                    	    {

                    	    							newCompositeNode(grammarAccess.getMODAModelAccess().getModelModelParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_model_8_0=ruleModel();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMODAModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"model",
                    	    								lv_model_8_0,
                    	    								"fr.diverse.moda.Moda.Model");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getMODAModelAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalModa.g:172:3: (otherlv_10= 'data' otherlv_11= '{' ( (lv_data_12_0= ruleData ) ) (otherlv_13= ',' ( (lv_data_14_0= ruleData ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalModa.g:173:4: otherlv_10= 'data' otherlv_11= '{' ( (lv_data_12_0= ruleData ) ) (otherlv_13= ',' ( (lv_data_14_0= ruleData ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getMODAModelAccess().getDataKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getMODAModelAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalModa.g:181:4: ( (lv_data_12_0= ruleData ) )
                    // InternalModa.g:182:5: (lv_data_12_0= ruleData )
                    {
                    // InternalModa.g:182:5: (lv_data_12_0= ruleData )
                    // InternalModa.g:183:6: lv_data_12_0= ruleData
                    {

                    						newCompositeNode(grammarAccess.getMODAModelAccess().getDataDataParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_data_12_0=ruleData();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMODAModelRule());
                    						}
                    						add(
                    							current,
                    							"data",
                    							lv_data_12_0,
                    							"fr.diverse.moda.Moda.Data");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModa.g:200:4: (otherlv_13= ',' ( (lv_data_14_0= ruleData ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalModa.g:201:5: otherlv_13= ',' ( (lv_data_14_0= ruleData ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getMODAModelAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalModa.g:205:5: ( (lv_data_14_0= ruleData ) )
                    	    // InternalModa.g:206:6: (lv_data_14_0= ruleData )
                    	    {
                    	    // InternalModa.g:206:6: (lv_data_14_0= ruleData )
                    	    // InternalModa.g:207:7: lv_data_14_0= ruleData
                    	    {

                    	    							newCompositeNode(grammarAccess.getMODAModelAccess().getDataDataParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_data_14_0=ruleData();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMODAModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"data",
                    	    								lv_data_14_0,
                    	    								"fr.diverse.moda.Moda.Data");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getMODAModelAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalModa.g:230:3: (otherlv_16= 'software' ( (lv_software_17_0= ruleRunningSoftware ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalModa.g:231:4: otherlv_16= 'software' ( (lv_software_17_0= ruleRunningSoftware ) )
                    {
                    otherlv_16=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getMODAModelAccess().getSoftwareKeyword_6_0());
                    			
                    // InternalModa.g:235:4: ( (lv_software_17_0= ruleRunningSoftware ) )
                    // InternalModa.g:236:5: (lv_software_17_0= ruleRunningSoftware )
                    {
                    // InternalModa.g:236:5: (lv_software_17_0= ruleRunningSoftware )
                    // InternalModa.g:237:6: lv_software_17_0= ruleRunningSoftware
                    {

                    						newCompositeNode(grammarAccess.getMODAModelAccess().getSoftwareRunningSoftwareParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_software_17_0=ruleRunningSoftware();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMODAModelRule());
                    						}
                    						set(
                    							current,
                    							"software",
                    							lv_software_17_0,
                    							"fr.diverse.moda.Moda.RunningSoftware");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalModa.g:255:3: (otherlv_18= 'sts' ( (lv_sts_19_0= ruleSTS ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalModa.g:256:4: otherlv_18= 'sts' ( (lv_sts_19_0= ruleSTS ) )
                    {
                    otherlv_18=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getMODAModelAccess().getStsKeyword_7_0());
                    			
                    // InternalModa.g:260:4: ( (lv_sts_19_0= ruleSTS ) )
                    // InternalModa.g:261:5: (lv_sts_19_0= ruleSTS )
                    {
                    // InternalModa.g:261:5: (lv_sts_19_0= ruleSTS )
                    // InternalModa.g:262:6: lv_sts_19_0= ruleSTS
                    {

                    						newCompositeNode(grammarAccess.getMODAModelAccess().getStsSTSParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_sts_19_0=ruleSTS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMODAModelRule());
                    						}
                    						set(
                    							current,
                    							"sts",
                    							lv_sts_19_0,
                    							"fr.diverse.moda.Moda.STS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalModa.g:280:3: (otherlv_20= 'relation' otherlv_21= '{' ( (lv_modarelation_22_0= ruleMODARelation ) ) (otherlv_23= ',' ( (lv_modarelation_24_0= ruleMODARelation ) ) )* otherlv_25= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalModa.g:281:4: otherlv_20= 'relation' otherlv_21= '{' ( (lv_modarelation_22_0= ruleMODARelation ) ) (otherlv_23= ',' ( (lv_modarelation_24_0= ruleMODARelation ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getMODAModelAccess().getRelationKeyword_8_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getMODAModelAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalModa.g:289:4: ( (lv_modarelation_22_0= ruleMODARelation ) )
                    // InternalModa.g:290:5: (lv_modarelation_22_0= ruleMODARelation )
                    {
                    // InternalModa.g:290:5: (lv_modarelation_22_0= ruleMODARelation )
                    // InternalModa.g:291:6: lv_modarelation_22_0= ruleMODARelation
                    {

                    						newCompositeNode(grammarAccess.getMODAModelAccess().getModarelationMODARelationParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_modarelation_22_0=ruleMODARelation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMODAModelRule());
                    						}
                    						add(
                    							current,
                    							"modarelation",
                    							lv_modarelation_22_0,
                    							"fr.diverse.moda.Moda.MODARelation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModa.g:308:4: (otherlv_23= ',' ( (lv_modarelation_24_0= ruleMODARelation ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalModa.g:309:5: otherlv_23= ',' ( (lv_modarelation_24_0= ruleMODARelation ) )
                    	    {
                    	    otherlv_23=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getMODAModelAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalModa.g:313:5: ( (lv_modarelation_24_0= ruleMODARelation ) )
                    	    // InternalModa.g:314:6: (lv_modarelation_24_0= ruleMODARelation )
                    	    {
                    	    // InternalModa.g:314:6: (lv_modarelation_24_0= ruleMODARelation )
                    	    // InternalModa.g:315:7: lv_modarelation_24_0= ruleMODARelation
                    	    {

                    	    							newCompositeNode(grammarAccess.getMODAModelAccess().getModarelationMODARelationParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_modarelation_24_0=ruleMODARelation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMODAModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"modarelation",
                    	    								lv_modarelation_24_0,
                    	    								"fr.diverse.moda.Moda.MODARelation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_25, grammarAccess.getMODAModelAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_26=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getMODAModelAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalModa.g:346:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalModa.g:346:46: (iv_ruleModel= ruleModel EOF )
            // InternalModa.g:347:2: iv_ruleModel= ruleModel EOF
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
    // InternalModa.g:353:1: ruleModel returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ( (lv_kind_2_0= ruleModelKind ) ) (otherlv_3= '\"' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '\"' )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_kind_2_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalModa.g:359:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ( (lv_kind_2_0= ruleModelKind ) ) (otherlv_3= '\"' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '\"' )? ) )
            // InternalModa.g:360:2: ( () ( (lv_name_1_0= ruleEString ) ) ( (lv_kind_2_0= ruleModelKind ) ) (otherlv_3= '\"' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '\"' )? )
            {
            // InternalModa.g:360:2: ( () ( (lv_name_1_0= ruleEString ) ) ( (lv_kind_2_0= ruleModelKind ) ) (otherlv_3= '\"' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '\"' )? )
            // InternalModa.g:361:3: () ( (lv_name_1_0= ruleEString ) ) ( (lv_kind_2_0= ruleModelKind ) ) (otherlv_3= '\"' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '\"' )?
            {
            // InternalModa.g:361:3: ()
            // InternalModa.g:362:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            // InternalModa.g:368:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModa.g:369:4: (lv_name_1_0= ruleEString )
            {
            // InternalModa.g:369:4: (lv_name_1_0= ruleEString )
            // InternalModa.g:370:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getModelAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.diverse.moda.Moda.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModa.g:387:3: ( (lv_kind_2_0= ruleModelKind ) )
            // InternalModa.g:388:4: (lv_kind_2_0= ruleModelKind )
            {
            // InternalModa.g:388:4: (lv_kind_2_0= ruleModelKind )
            // InternalModa.g:389:5: lv_kind_2_0= ruleModelKind
            {

            					newCompositeNode(grammarAccess.getModelAccess().getKindModelKindEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_kind_2_0=ruleModelKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_2_0,
            						"fr.diverse.moda.Moda.ModelKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModa.g:406:3: (otherlv_3= '\"' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '\"' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalModa.g:407:4: otherlv_3= '\"' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '\"'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getModelAccess().getQuotationMarkKeyword_3_0());
                    			
                    // InternalModa.g:411:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalModa.g:412:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalModa.g:412:5: (lv_description_4_0= ruleEString )
                    // InternalModa.g:413:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    otherlv_5=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getModelAccess().getQuotationMarkKeyword_3_2());
                    			

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
    // InternalModa.g:439:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalModa.g:439:45: (iv_ruleData= ruleData EOF )
            // InternalModa.g:440:2: iv_ruleData= ruleData EOF
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
    // InternalModa.g:446:1: ruleData returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ( (lv_kind_2_0= ruleDataKind ) ) (otherlv_3= '\"' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '\"' )? ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_kind_2_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalModa.g:452:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ( (lv_kind_2_0= ruleDataKind ) ) (otherlv_3= '\"' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '\"' )? ) )
            // InternalModa.g:453:2: ( () ( (lv_name_1_0= ruleEString ) ) ( (lv_kind_2_0= ruleDataKind ) ) (otherlv_3= '\"' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '\"' )? )
            {
            // InternalModa.g:453:2: ( () ( (lv_name_1_0= ruleEString ) ) ( (lv_kind_2_0= ruleDataKind ) ) (otherlv_3= '\"' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '\"' )? )
            // InternalModa.g:454:3: () ( (lv_name_1_0= ruleEString ) ) ( (lv_kind_2_0= ruleDataKind ) ) (otherlv_3= '\"' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '\"' )?
            {
            // InternalModa.g:454:3: ()
            // InternalModa.g:455:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataAccess().getDataAction_0(),
            					current);
            			

            }

            // InternalModa.g:461:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModa.g:462:4: (lv_name_1_0= ruleEString )
            {
            // InternalModa.g:462:4: (lv_name_1_0= ruleEString )
            // InternalModa.g:463:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.diverse.moda.Moda.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModa.g:480:3: ( (lv_kind_2_0= ruleDataKind ) )
            // InternalModa.g:481:4: (lv_kind_2_0= ruleDataKind )
            {
            // InternalModa.g:481:4: (lv_kind_2_0= ruleDataKind )
            // InternalModa.g:482:5: lv_kind_2_0= ruleDataKind
            {

            					newCompositeNode(grammarAccess.getDataAccess().getKindDataKindEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_kind_2_0=ruleDataKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_2_0,
            						"fr.diverse.moda.Moda.DataKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModa.g:499:3: (otherlv_3= '\"' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '\"' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalModa.g:500:4: otherlv_3= '\"' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '\"'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getDataAccess().getQuotationMarkKeyword_3_0());
                    			
                    // InternalModa.g:504:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalModa.g:505:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalModa.g:505:5: (lv_description_4_0= ruleEString )
                    // InternalModa.g:506:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDataAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    otherlv_5=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getDataAccess().getQuotationMarkKeyword_3_2());
                    			

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
    // InternalModa.g:532:1: entryRuleRunningSoftware returns [EObject current=null] : iv_ruleRunningSoftware= ruleRunningSoftware EOF ;
    public final EObject entryRuleRunningSoftware() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunningSoftware = null;


        try {
            // InternalModa.g:532:56: (iv_ruleRunningSoftware= ruleRunningSoftware EOF )
            // InternalModa.g:533:2: iv_ruleRunningSoftware= ruleRunningSoftware EOF
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
    // InternalModa.g:539:1: ruleRunningSoftware returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleRunningSoftware() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalModa.g:545:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalModa.g:546:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalModa.g:546:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalModa.g:547:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalModa.g:547:3: ()
            // InternalModa.g:548:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRunningSoftwareAccess().getRunningSoftwareAction_0(),
            					current);
            			

            }

            // InternalModa.g:554:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModa.g:555:4: (lv_name_1_0= ruleEString )
            {
            // InternalModa.g:555:4: (lv_name_1_0= ruleEString )
            // InternalModa.g:556:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRunningSoftwareAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRunningSoftwareRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
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
    // InternalModa.g:577:1: entryRuleSTS returns [EObject current=null] : iv_ruleSTS= ruleSTS EOF ;
    public final EObject entryRuleSTS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSTS = null;


        try {
            // InternalModa.g:577:44: (iv_ruleSTS= ruleSTS EOF )
            // InternalModa.g:578:2: iv_ruleSTS= ruleSTS EOF
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
    // InternalModa.g:584:1: ruleSTS returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleSTS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalModa.g:590:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalModa.g:591:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalModa.g:591:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalModa.g:592:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalModa.g:592:3: ()
            // InternalModa.g:593:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSTSAccess().getSTSAction_0(),
            					current);
            			

            }

            // InternalModa.g:599:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModa.g:600:4: (lv_name_1_0= ruleEString )
            {
            // InternalModa.g:600:4: (lv_name_1_0= ruleEString )
            // InternalModa.g:601:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSTSAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSTSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
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
    // InternalModa.g:622:1: entryRuleMODARelation returns [EObject current=null] : iv_ruleMODARelation= ruleMODARelation EOF ;
    public final EObject entryRuleMODARelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMODARelation = null;


        try {
            // InternalModa.g:622:53: (iv_ruleMODARelation= ruleMODARelation EOF )
            // InternalModa.g:623:2: iv_ruleMODARelation= ruleMODARelation EOF
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
    // InternalModa.g:629:1: ruleMODARelation returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ( (lv_kind_2_0= ruleRelationKind ) ) ( ( ruleEString ) ) otherlv_4= '->' (otherlv_5= 'tgt' ( ( ruleEString ) ) ) ) ;
    public final EObject ruleMODARelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_kind_2_0 = null;



        	enterRule();

        try {
            // InternalModa.g:635:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ( (lv_kind_2_0= ruleRelationKind ) ) ( ( ruleEString ) ) otherlv_4= '->' (otherlv_5= 'tgt' ( ( ruleEString ) ) ) ) )
            // InternalModa.g:636:2: ( () ( (lv_name_1_0= ruleEString ) ) ( (lv_kind_2_0= ruleRelationKind ) ) ( ( ruleEString ) ) otherlv_4= '->' (otherlv_5= 'tgt' ( ( ruleEString ) ) ) )
            {
            // InternalModa.g:636:2: ( () ( (lv_name_1_0= ruleEString ) ) ( (lv_kind_2_0= ruleRelationKind ) ) ( ( ruleEString ) ) otherlv_4= '->' (otherlv_5= 'tgt' ( ( ruleEString ) ) ) )
            // InternalModa.g:637:3: () ( (lv_name_1_0= ruleEString ) ) ( (lv_kind_2_0= ruleRelationKind ) ) ( ( ruleEString ) ) otherlv_4= '->' (otherlv_5= 'tgt' ( ( ruleEString ) ) )
            {
            // InternalModa.g:637:3: ()
            // InternalModa.g:638:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMODARelationAccess().getMODARelationAction_0(),
            					current);
            			

            }

            // InternalModa.g:644:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModa.g:645:4: (lv_name_1_0= ruleEString )
            {
            // InternalModa.g:645:4: (lv_name_1_0= ruleEString )
            // InternalModa.g:646:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMODARelationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMODARelationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.diverse.moda.Moda.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModa.g:663:3: ( (lv_kind_2_0= ruleRelationKind ) )
            // InternalModa.g:664:4: (lv_kind_2_0= ruleRelationKind )
            {
            // InternalModa.g:664:4: (lv_kind_2_0= ruleRelationKind )
            // InternalModa.g:665:5: lv_kind_2_0= ruleRelationKind
            {

            					newCompositeNode(grammarAccess.getMODARelationAccess().getKindRelationKindEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_kind_2_0=ruleRelationKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMODARelationRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_2_0,
            						"fr.diverse.moda.Moda.RelationKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModa.g:682:3: ( ( ruleEString ) )
            // InternalModa.g:683:4: ( ruleEString )
            {
            // InternalModa.g:683:4: ( ruleEString )
            // InternalModa.g:684:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMODARelationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMODARelationAccess().getSrcMODAElementCrossReference_3_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getMODARelationAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalModa.g:702:3: (otherlv_5= 'tgt' ( ( ruleEString ) ) )
            // InternalModa.g:703:4: otherlv_5= 'tgt' ( ( ruleEString ) )
            {
            otherlv_5=(Token)match(input,22,FOLLOW_3); 

            				newLeafNode(otherlv_5, grammarAccess.getMODARelationAccess().getTgtKeyword_5_0());
            			
            // InternalModa.g:707:4: ( ( ruleEString ) )
            // InternalModa.g:708:5: ( ruleEString )
            {
            // InternalModa.g:708:5: ( ruleEString )
            // InternalModa.g:709:6: ruleEString
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getMODARelationRule());
            						}
            					

            						newCompositeNode(grammarAccess.getMODARelationAccess().getTgtMODAElementCrossReference_5_1_0());
            					
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


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
    // InternalModa.g:728:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalModa.g:728:47: (iv_ruleEString= ruleEString EOF )
            // InternalModa.g:729:2: iv_ruleEString= ruleEString EOF
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
    // InternalModa.g:735:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalModa.g:741:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalModa.g:742:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalModa.g:742:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalModa.g:743:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalModa.g:751:3: this_ID_1= RULE_ID
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
    // InternalModa.g:762:1: ruleModelKind returns [Enumerator current=null] : ( (enumLiteral_0= 'prescriptive' ) | (enumLiteral_1= 'predictive' ) | (enumLiteral_2= 'descriptive' ) ) ;
    public final Enumerator ruleModelKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalModa.g:768:2: ( ( (enumLiteral_0= 'prescriptive' ) | (enumLiteral_1= 'predictive' ) | (enumLiteral_2= 'descriptive' ) ) )
            // InternalModa.g:769:2: ( (enumLiteral_0= 'prescriptive' ) | (enumLiteral_1= 'predictive' ) | (enumLiteral_2= 'descriptive' ) )
            {
            // InternalModa.g:769:2: ( (enumLiteral_0= 'prescriptive' ) | (enumLiteral_1= 'predictive' ) | (enumLiteral_2= 'descriptive' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt12=1;
                }
                break;
            case 24:
                {
                alt12=2;
                }
                break;
            case 25:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalModa.g:770:3: (enumLiteral_0= 'prescriptive' )
                    {
                    // InternalModa.g:770:3: (enumLiteral_0= 'prescriptive' )
                    // InternalModa.g:771:4: enumLiteral_0= 'prescriptive'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getModelKindAccess().getPrescriptiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getModelKindAccess().getPrescriptiveEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModa.g:778:3: (enumLiteral_1= 'predictive' )
                    {
                    // InternalModa.g:778:3: (enumLiteral_1= 'predictive' )
                    // InternalModa.g:779:4: enumLiteral_1= 'predictive'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getModelKindAccess().getPredictiveEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getModelKindAccess().getPredictiveEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalModa.g:786:3: (enumLiteral_2= 'descriptive' )
                    {
                    // InternalModa.g:786:3: (enumLiteral_2= 'descriptive' )
                    // InternalModa.g:787:4: enumLiteral_2= 'descriptive'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_2); 

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
    // InternalModa.g:797:1: ruleDataKind returns [Enumerator current=null] : ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'external' ) | (enumLiteral_3= 'measured' ) ) ;
    public final Enumerator ruleDataKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalModa.g:803:2: ( ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'external' ) | (enumLiteral_3= 'measured' ) ) )
            // InternalModa.g:804:2: ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'external' ) | (enumLiteral_3= 'measured' ) )
            {
            // InternalModa.g:804:2: ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'external' ) | (enumLiteral_3= 'measured' ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt13=1;
                }
                break;
            case 27:
                {
                alt13=2;
                }
                break;
            case 28:
                {
                alt13=3;
                }
                break;
            case 29:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalModa.g:805:3: (enumLiteral_0= 'input' )
                    {
                    // InternalModa.g:805:3: (enumLiteral_0= 'input' )
                    // InternalModa.g:806:4: enumLiteral_0= 'input'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getDataKindAccess().getInputEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataKindAccess().getInputEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModa.g:813:3: (enumLiteral_1= 'output' )
                    {
                    // InternalModa.g:813:3: (enumLiteral_1= 'output' )
                    // InternalModa.g:814:4: enumLiteral_1= 'output'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getDataKindAccess().getOutputEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataKindAccess().getOutputEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalModa.g:821:3: (enumLiteral_2= 'external' )
                    {
                    // InternalModa.g:821:3: (enumLiteral_2= 'external' )
                    // InternalModa.g:822:4: enumLiteral_2= 'external'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getDataKindAccess().getExternalEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataKindAccess().getExternalEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalModa.g:829:3: (enumLiteral_3= 'measured' )
                    {
                    // InternalModa.g:829:3: (enumLiteral_3= 'measured' )
                    // InternalModa.g:830:4: enumLiteral_3= 'measured'
                    {
                    enumLiteral_3=(Token)match(input,29,FOLLOW_2); 

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
    // InternalModa.g:840:1: ruleRelationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'generation' ) | (enumLiteral_1= 'enactment' ) | (enumLiteral_2= 'deployment' ) | (enumLiteral_3= 'input' ) | (enumLiteral_4= 'output' ) | (enumLiteral_5= 'measurement' ) | (enumLiteral_6= 'otherInterplay' ) | (enumLiteral_7= 'generalization' ) | (enumLiteral_8= 'preparation' ) | (enumLiteral_9= 'analysis' ) ) ;
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
            // InternalModa.g:846:2: ( ( (enumLiteral_0= 'generation' ) | (enumLiteral_1= 'enactment' ) | (enumLiteral_2= 'deployment' ) | (enumLiteral_3= 'input' ) | (enumLiteral_4= 'output' ) | (enumLiteral_5= 'measurement' ) | (enumLiteral_6= 'otherInterplay' ) | (enumLiteral_7= 'generalization' ) | (enumLiteral_8= 'preparation' ) | (enumLiteral_9= 'analysis' ) ) )
            // InternalModa.g:847:2: ( (enumLiteral_0= 'generation' ) | (enumLiteral_1= 'enactment' ) | (enumLiteral_2= 'deployment' ) | (enumLiteral_3= 'input' ) | (enumLiteral_4= 'output' ) | (enumLiteral_5= 'measurement' ) | (enumLiteral_6= 'otherInterplay' ) | (enumLiteral_7= 'generalization' ) | (enumLiteral_8= 'preparation' ) | (enumLiteral_9= 'analysis' ) )
            {
            // InternalModa.g:847:2: ( (enumLiteral_0= 'generation' ) | (enumLiteral_1= 'enactment' ) | (enumLiteral_2= 'deployment' ) | (enumLiteral_3= 'input' ) | (enumLiteral_4= 'output' ) | (enumLiteral_5= 'measurement' ) | (enumLiteral_6= 'otherInterplay' ) | (enumLiteral_7= 'generalization' ) | (enumLiteral_8= 'preparation' ) | (enumLiteral_9= 'analysis' ) )
            int alt14=10;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt14=1;
                }
                break;
            case 31:
                {
                alt14=2;
                }
                break;
            case 32:
                {
                alt14=3;
                }
                break;
            case 26:
                {
                alt14=4;
                }
                break;
            case 27:
                {
                alt14=5;
                }
                break;
            case 33:
                {
                alt14=6;
                }
                break;
            case 34:
                {
                alt14=7;
                }
                break;
            case 35:
                {
                alt14=8;
                }
                break;
            case 36:
                {
                alt14=9;
                }
                break;
            case 37:
                {
                alt14=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalModa.g:848:3: (enumLiteral_0= 'generation' )
                    {
                    // InternalModa.g:848:3: (enumLiteral_0= 'generation' )
                    // InternalModa.g:849:4: enumLiteral_0= 'generation'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getRelationKindAccess().getGenerationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRelationKindAccess().getGenerationEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModa.g:856:3: (enumLiteral_1= 'enactment' )
                    {
                    // InternalModa.g:856:3: (enumLiteral_1= 'enactment' )
                    // InternalModa.g:857:4: enumLiteral_1= 'enactment'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getRelationKindAccess().getEnactmentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRelationKindAccess().getEnactmentEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalModa.g:864:3: (enumLiteral_2= 'deployment' )
                    {
                    // InternalModa.g:864:3: (enumLiteral_2= 'deployment' )
                    // InternalModa.g:865:4: enumLiteral_2= 'deployment'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getRelationKindAccess().getDeploymentEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRelationKindAccess().getDeploymentEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalModa.g:872:3: (enumLiteral_3= 'input' )
                    {
                    // InternalModa.g:872:3: (enumLiteral_3= 'input' )
                    // InternalModa.g:873:4: enumLiteral_3= 'input'
                    {
                    enumLiteral_3=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getRelationKindAccess().getInputEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRelationKindAccess().getInputEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalModa.g:880:3: (enumLiteral_4= 'output' )
                    {
                    // InternalModa.g:880:3: (enumLiteral_4= 'output' )
                    // InternalModa.g:881:4: enumLiteral_4= 'output'
                    {
                    enumLiteral_4=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getRelationKindAccess().getOutputEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRelationKindAccess().getOutputEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalModa.g:888:3: (enumLiteral_5= 'measurement' )
                    {
                    // InternalModa.g:888:3: (enumLiteral_5= 'measurement' )
                    // InternalModa.g:889:4: enumLiteral_5= 'measurement'
                    {
                    enumLiteral_5=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getRelationKindAccess().getMeasurementEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getRelationKindAccess().getMeasurementEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalModa.g:896:3: (enumLiteral_6= 'otherInterplay' )
                    {
                    // InternalModa.g:896:3: (enumLiteral_6= 'otherInterplay' )
                    // InternalModa.g:897:4: enumLiteral_6= 'otherInterplay'
                    {
                    enumLiteral_6=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getRelationKindAccess().getOtherInterplayEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getRelationKindAccess().getOtherInterplayEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalModa.g:904:3: (enumLiteral_7= 'generalization' )
                    {
                    // InternalModa.g:904:3: (enumLiteral_7= 'generalization' )
                    // InternalModa.g:905:4: enumLiteral_7= 'generalization'
                    {
                    enumLiteral_7=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getRelationKindAccess().getGeneralizationEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getRelationKindAccess().getGeneralizationEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalModa.g:912:3: (enumLiteral_8= 'preparation' )
                    {
                    // InternalModa.g:912:3: (enumLiteral_8= 'preparation' )
                    // InternalModa.g:913:4: enumLiteral_8= 'preparation'
                    {
                    enumLiteral_8=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getRelationKindAccess().getPreparationEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getRelationKindAccess().getPreparationEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalModa.g:920:3: (enumLiteral_9= 'analysis' )
                    {
                    // InternalModa.g:920:3: (enumLiteral_9= 'analysis' )
                    // InternalModa.g:921:4: enumLiteral_9= 'analysis'
                    {
                    enumLiteral_9=(Token)match(input,37,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000FA000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000F8000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000E8000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C8000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000003FCC000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});

}