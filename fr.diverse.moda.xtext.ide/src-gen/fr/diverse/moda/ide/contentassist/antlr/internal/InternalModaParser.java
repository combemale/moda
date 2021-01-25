package fr.diverse.moda.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.diverse.moda.services.ModaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalModaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'prescriptive'", "'predictive'", "'descriptive'", "'input'", "'output'", "'external'", "'measured'", "'generation'", "'enactment'", "'deployment'", "'measurement'", "'otherInterplay'", "'generalization'", "'preparation'", "'analysis'", "'MODAModel'", "'{'", "'}'", "','", "'model'", "'data'", "'software'", "'sts'", "'relation'", "'->'"
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

    	public void setGrammarAccess(ModaGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMODAModel"
    // InternalModa.g:53:1: entryRuleMODAModel : ruleMODAModel EOF ;
    public final void entryRuleMODAModel() throws RecognitionException {
        try {
            // InternalModa.g:54:1: ( ruleMODAModel EOF )
            // InternalModa.g:55:1: ruleMODAModel EOF
            {
             before(grammarAccess.getMODAModelRule()); 
            pushFollow(FOLLOW_1);
            ruleMODAModel();

            state._fsp--;

             after(grammarAccess.getMODAModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMODAModel"


    // $ANTLR start "ruleMODAModel"
    // InternalModa.g:62:1: ruleMODAModel : ( ( rule__MODAModel__Group__0 ) ) ;
    public final void ruleMODAModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:66:2: ( ( ( rule__MODAModel__Group__0 ) ) )
            // InternalModa.g:67:2: ( ( rule__MODAModel__Group__0 ) )
            {
            // InternalModa.g:67:2: ( ( rule__MODAModel__Group__0 ) )
            // InternalModa.g:68:3: ( rule__MODAModel__Group__0 )
            {
             before(grammarAccess.getMODAModelAccess().getGroup()); 
            // InternalModa.g:69:3: ( rule__MODAModel__Group__0 )
            // InternalModa.g:69:4: rule__MODAModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MODAModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMODAModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMODAModel"


    // $ANTLR start "entryRuleModel"
    // InternalModa.g:78:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalModa.g:79:1: ( ruleModel EOF )
            // InternalModa.g:80:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalModa.g:87:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:91:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalModa.g:92:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalModa.g:92:2: ( ( rule__Model__Group__0 ) )
            // InternalModa.g:93:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalModa.g:94:3: ( rule__Model__Group__0 )
            // InternalModa.g:94:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleData"
    // InternalModa.g:103:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // InternalModa.g:104:1: ( ruleData EOF )
            // InternalModa.g:105:1: ruleData EOF
            {
             before(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalModa.g:112:1: ruleData : ( ( rule__Data__Group__0 ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:116:2: ( ( ( rule__Data__Group__0 ) ) )
            // InternalModa.g:117:2: ( ( rule__Data__Group__0 ) )
            {
            // InternalModa.g:117:2: ( ( rule__Data__Group__0 ) )
            // InternalModa.g:118:3: ( rule__Data__Group__0 )
            {
             before(grammarAccess.getDataAccess().getGroup()); 
            // InternalModa.g:119:3: ( rule__Data__Group__0 )
            // InternalModa.g:119:4: rule__Data__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleRunningSoftware"
    // InternalModa.g:128:1: entryRuleRunningSoftware : ruleRunningSoftware EOF ;
    public final void entryRuleRunningSoftware() throws RecognitionException {
        try {
            // InternalModa.g:129:1: ( ruleRunningSoftware EOF )
            // InternalModa.g:130:1: ruleRunningSoftware EOF
            {
             before(grammarAccess.getRunningSoftwareRule()); 
            pushFollow(FOLLOW_1);
            ruleRunningSoftware();

            state._fsp--;

             after(grammarAccess.getRunningSoftwareRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRunningSoftware"


    // $ANTLR start "ruleRunningSoftware"
    // InternalModa.g:137:1: ruleRunningSoftware : ( ( rule__RunningSoftware__Group__0 ) ) ;
    public final void ruleRunningSoftware() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:141:2: ( ( ( rule__RunningSoftware__Group__0 ) ) )
            // InternalModa.g:142:2: ( ( rule__RunningSoftware__Group__0 ) )
            {
            // InternalModa.g:142:2: ( ( rule__RunningSoftware__Group__0 ) )
            // InternalModa.g:143:3: ( rule__RunningSoftware__Group__0 )
            {
             before(grammarAccess.getRunningSoftwareAccess().getGroup()); 
            // InternalModa.g:144:3: ( rule__RunningSoftware__Group__0 )
            // InternalModa.g:144:4: rule__RunningSoftware__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RunningSoftware__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRunningSoftwareAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRunningSoftware"


    // $ANTLR start "entryRuleSTS"
    // InternalModa.g:153:1: entryRuleSTS : ruleSTS EOF ;
    public final void entryRuleSTS() throws RecognitionException {
        try {
            // InternalModa.g:154:1: ( ruleSTS EOF )
            // InternalModa.g:155:1: ruleSTS EOF
            {
             before(grammarAccess.getSTSRule()); 
            pushFollow(FOLLOW_1);
            ruleSTS();

            state._fsp--;

             after(grammarAccess.getSTSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSTS"


    // $ANTLR start "ruleSTS"
    // InternalModa.g:162:1: ruleSTS : ( ( rule__STS__Group__0 ) ) ;
    public final void ruleSTS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:166:2: ( ( ( rule__STS__Group__0 ) ) )
            // InternalModa.g:167:2: ( ( rule__STS__Group__0 ) )
            {
            // InternalModa.g:167:2: ( ( rule__STS__Group__0 ) )
            // InternalModa.g:168:3: ( rule__STS__Group__0 )
            {
             before(grammarAccess.getSTSAccess().getGroup()); 
            // InternalModa.g:169:3: ( rule__STS__Group__0 )
            // InternalModa.g:169:4: rule__STS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__STS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSTSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSTS"


    // $ANTLR start "entryRuleMODARelation"
    // InternalModa.g:178:1: entryRuleMODARelation : ruleMODARelation EOF ;
    public final void entryRuleMODARelation() throws RecognitionException {
        try {
            // InternalModa.g:179:1: ( ruleMODARelation EOF )
            // InternalModa.g:180:1: ruleMODARelation EOF
            {
             before(grammarAccess.getMODARelationRule()); 
            pushFollow(FOLLOW_1);
            ruleMODARelation();

            state._fsp--;

             after(grammarAccess.getMODARelationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMODARelation"


    // $ANTLR start "ruleMODARelation"
    // InternalModa.g:187:1: ruleMODARelation : ( ( rule__MODARelation__Group__0 ) ) ;
    public final void ruleMODARelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:191:2: ( ( ( rule__MODARelation__Group__0 ) ) )
            // InternalModa.g:192:2: ( ( rule__MODARelation__Group__0 ) )
            {
            // InternalModa.g:192:2: ( ( rule__MODARelation__Group__0 ) )
            // InternalModa.g:193:3: ( rule__MODARelation__Group__0 )
            {
             before(grammarAccess.getMODARelationAccess().getGroup()); 
            // InternalModa.g:194:3: ( rule__MODARelation__Group__0 )
            // InternalModa.g:194:4: rule__MODARelation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MODARelation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMODARelationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMODARelation"


    // $ANTLR start "entryRuleEString"
    // InternalModa.g:203:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalModa.g:204:1: ( ruleEString EOF )
            // InternalModa.g:205:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalModa.g:212:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:216:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalModa.g:217:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalModa.g:217:2: ( ( rule__EString__Alternatives ) )
            // InternalModa.g:218:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalModa.g:219:3: ( rule__EString__Alternatives )
            // InternalModa.g:219:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleModelKind"
    // InternalModa.g:228:1: ruleModelKind : ( ( rule__ModelKind__Alternatives ) ) ;
    public final void ruleModelKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:232:1: ( ( ( rule__ModelKind__Alternatives ) ) )
            // InternalModa.g:233:2: ( ( rule__ModelKind__Alternatives ) )
            {
            // InternalModa.g:233:2: ( ( rule__ModelKind__Alternatives ) )
            // InternalModa.g:234:3: ( rule__ModelKind__Alternatives )
            {
             before(grammarAccess.getModelKindAccess().getAlternatives()); 
            // InternalModa.g:235:3: ( rule__ModelKind__Alternatives )
            // InternalModa.g:235:4: rule__ModelKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ModelKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelKind"


    // $ANTLR start "ruleDataKind"
    // InternalModa.g:244:1: ruleDataKind : ( ( rule__DataKind__Alternatives ) ) ;
    public final void ruleDataKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:248:1: ( ( ( rule__DataKind__Alternatives ) ) )
            // InternalModa.g:249:2: ( ( rule__DataKind__Alternatives ) )
            {
            // InternalModa.g:249:2: ( ( rule__DataKind__Alternatives ) )
            // InternalModa.g:250:3: ( rule__DataKind__Alternatives )
            {
             before(grammarAccess.getDataKindAccess().getAlternatives()); 
            // InternalModa.g:251:3: ( rule__DataKind__Alternatives )
            // InternalModa.g:251:4: rule__DataKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataKind"


    // $ANTLR start "ruleRelationKind"
    // InternalModa.g:260:1: ruleRelationKind : ( ( rule__RelationKind__Alternatives ) ) ;
    public final void ruleRelationKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:264:1: ( ( ( rule__RelationKind__Alternatives ) ) )
            // InternalModa.g:265:2: ( ( rule__RelationKind__Alternatives ) )
            {
            // InternalModa.g:265:2: ( ( rule__RelationKind__Alternatives ) )
            // InternalModa.g:266:3: ( rule__RelationKind__Alternatives )
            {
             before(grammarAccess.getRelationKindAccess().getAlternatives()); 
            // InternalModa.g:267:3: ( rule__RelationKind__Alternatives )
            // InternalModa.g:267:4: rule__RelationKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RelationKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationKind"


    // $ANTLR start "rule__MODAModel__Alternatives_4_1_1"
    // InternalModa.g:275:1: rule__MODAModel__Alternatives_4_1_1 : ( ( ( rule__MODAModel__ModelAssignment_4_1_1_0 ) ) | ( ( rule__MODAModel__DataAssignment_4_1_1_1 ) ) | ( ( rule__MODAModel__SoftwareAssignment_4_1_1_2 ) ) | ( ( rule__MODAModel__StsAssignment_4_1_1_3 ) ) | ( ( rule__MODAModel__ModarelationAssignment_4_1_1_4 ) ) );
    public final void rule__MODAModel__Alternatives_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:279:1: ( ( ( rule__MODAModel__ModelAssignment_4_1_1_0 ) ) | ( ( rule__MODAModel__DataAssignment_4_1_1_1 ) ) | ( ( rule__MODAModel__SoftwareAssignment_4_1_1_2 ) ) | ( ( rule__MODAModel__StsAssignment_4_1_1_3 ) ) | ( ( rule__MODAModel__ModarelationAssignment_4_1_1_4 ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt1=1;
                }
                break;
            case 31:
                {
                alt1=2;
                }
                break;
            case 32:
                {
                alt1=3;
                }
                break;
            case 33:
                {
                alt1=4;
                }
                break;
            case 34:
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
                    // InternalModa.g:280:2: ( ( rule__MODAModel__ModelAssignment_4_1_1_0 ) )
                    {
                    // InternalModa.g:280:2: ( ( rule__MODAModel__ModelAssignment_4_1_1_0 ) )
                    // InternalModa.g:281:3: ( rule__MODAModel__ModelAssignment_4_1_1_0 )
                    {
                     before(grammarAccess.getMODAModelAccess().getModelAssignment_4_1_1_0()); 
                    // InternalModa.g:282:3: ( rule__MODAModel__ModelAssignment_4_1_1_0 )
                    // InternalModa.g:282:4: rule__MODAModel__ModelAssignment_4_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MODAModel__ModelAssignment_4_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMODAModelAccess().getModelAssignment_4_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModa.g:286:2: ( ( rule__MODAModel__DataAssignment_4_1_1_1 ) )
                    {
                    // InternalModa.g:286:2: ( ( rule__MODAModel__DataAssignment_4_1_1_1 ) )
                    // InternalModa.g:287:3: ( rule__MODAModel__DataAssignment_4_1_1_1 )
                    {
                     before(grammarAccess.getMODAModelAccess().getDataAssignment_4_1_1_1()); 
                    // InternalModa.g:288:3: ( rule__MODAModel__DataAssignment_4_1_1_1 )
                    // InternalModa.g:288:4: rule__MODAModel__DataAssignment_4_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MODAModel__DataAssignment_4_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMODAModelAccess().getDataAssignment_4_1_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalModa.g:292:2: ( ( rule__MODAModel__SoftwareAssignment_4_1_1_2 ) )
                    {
                    // InternalModa.g:292:2: ( ( rule__MODAModel__SoftwareAssignment_4_1_1_2 ) )
                    // InternalModa.g:293:3: ( rule__MODAModel__SoftwareAssignment_4_1_1_2 )
                    {
                     before(grammarAccess.getMODAModelAccess().getSoftwareAssignment_4_1_1_2()); 
                    // InternalModa.g:294:3: ( rule__MODAModel__SoftwareAssignment_4_1_1_2 )
                    // InternalModa.g:294:4: rule__MODAModel__SoftwareAssignment_4_1_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MODAModel__SoftwareAssignment_4_1_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMODAModelAccess().getSoftwareAssignment_4_1_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalModa.g:298:2: ( ( rule__MODAModel__StsAssignment_4_1_1_3 ) )
                    {
                    // InternalModa.g:298:2: ( ( rule__MODAModel__StsAssignment_4_1_1_3 ) )
                    // InternalModa.g:299:3: ( rule__MODAModel__StsAssignment_4_1_1_3 )
                    {
                     before(grammarAccess.getMODAModelAccess().getStsAssignment_4_1_1_3()); 
                    // InternalModa.g:300:3: ( rule__MODAModel__StsAssignment_4_1_1_3 )
                    // InternalModa.g:300:4: rule__MODAModel__StsAssignment_4_1_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__MODAModel__StsAssignment_4_1_1_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getMODAModelAccess().getStsAssignment_4_1_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalModa.g:304:2: ( ( rule__MODAModel__ModarelationAssignment_4_1_1_4 ) )
                    {
                    // InternalModa.g:304:2: ( ( rule__MODAModel__ModarelationAssignment_4_1_1_4 ) )
                    // InternalModa.g:305:3: ( rule__MODAModel__ModarelationAssignment_4_1_1_4 )
                    {
                     before(grammarAccess.getMODAModelAccess().getModarelationAssignment_4_1_1_4()); 
                    // InternalModa.g:306:3: ( rule__MODAModel__ModarelationAssignment_4_1_1_4 )
                    // InternalModa.g:306:4: rule__MODAModel__ModarelationAssignment_4_1_1_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__MODAModel__ModarelationAssignment_4_1_1_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getMODAModelAccess().getModarelationAssignment_4_1_1_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODAModel__Alternatives_4_1_1"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalModa.g:314:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:318:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalModa.g:319:2: ( RULE_STRING )
                    {
                    // InternalModa.g:319:2: ( RULE_STRING )
                    // InternalModa.g:320:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModa.g:325:2: ( RULE_ID )
                    {
                    // InternalModa.g:325:2: ( RULE_ID )
                    // InternalModa.g:326:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__ModelKind__Alternatives"
    // InternalModa.g:335:1: rule__ModelKind__Alternatives : ( ( ( 'prescriptive' ) ) | ( ( 'predictive' ) ) | ( ( 'descriptive' ) ) );
    public final void rule__ModelKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:339:1: ( ( ( 'prescriptive' ) ) | ( ( 'predictive' ) ) | ( ( 'descriptive' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalModa.g:340:2: ( ( 'prescriptive' ) )
                    {
                    // InternalModa.g:340:2: ( ( 'prescriptive' ) )
                    // InternalModa.g:341:3: ( 'prescriptive' )
                    {
                     before(grammarAccess.getModelKindAccess().getPrescriptiveEnumLiteralDeclaration_0()); 
                    // InternalModa.g:342:3: ( 'prescriptive' )
                    // InternalModa.g:342:4: 'prescriptive'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getModelKindAccess().getPrescriptiveEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModa.g:346:2: ( ( 'predictive' ) )
                    {
                    // InternalModa.g:346:2: ( ( 'predictive' ) )
                    // InternalModa.g:347:3: ( 'predictive' )
                    {
                     before(grammarAccess.getModelKindAccess().getPredictiveEnumLiteralDeclaration_1()); 
                    // InternalModa.g:348:3: ( 'predictive' )
                    // InternalModa.g:348:4: 'predictive'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getModelKindAccess().getPredictiveEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalModa.g:352:2: ( ( 'descriptive' ) )
                    {
                    // InternalModa.g:352:2: ( ( 'descriptive' ) )
                    // InternalModa.g:353:3: ( 'descriptive' )
                    {
                     before(grammarAccess.getModelKindAccess().getDescriptiveEnumLiteralDeclaration_2()); 
                    // InternalModa.g:354:3: ( 'descriptive' )
                    // InternalModa.g:354:4: 'descriptive'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getModelKindAccess().getDescriptiveEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelKind__Alternatives"


    // $ANTLR start "rule__DataKind__Alternatives"
    // InternalModa.g:362:1: rule__DataKind__Alternatives : ( ( ( 'input' ) ) | ( ( 'output' ) ) | ( ( 'external' ) ) | ( ( 'measured' ) ) );
    public final void rule__DataKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:366:1: ( ( ( 'input' ) ) | ( ( 'output' ) ) | ( ( 'external' ) ) | ( ( 'measured' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 17:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalModa.g:367:2: ( ( 'input' ) )
                    {
                    // InternalModa.g:367:2: ( ( 'input' ) )
                    // InternalModa.g:368:3: ( 'input' )
                    {
                     before(grammarAccess.getDataKindAccess().getInputEnumLiteralDeclaration_0()); 
                    // InternalModa.g:369:3: ( 'input' )
                    // InternalModa.g:369:4: 'input'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataKindAccess().getInputEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModa.g:373:2: ( ( 'output' ) )
                    {
                    // InternalModa.g:373:2: ( ( 'output' ) )
                    // InternalModa.g:374:3: ( 'output' )
                    {
                     before(grammarAccess.getDataKindAccess().getOutputEnumLiteralDeclaration_1()); 
                    // InternalModa.g:375:3: ( 'output' )
                    // InternalModa.g:375:4: 'output'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataKindAccess().getOutputEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalModa.g:379:2: ( ( 'external' ) )
                    {
                    // InternalModa.g:379:2: ( ( 'external' ) )
                    // InternalModa.g:380:3: ( 'external' )
                    {
                     before(grammarAccess.getDataKindAccess().getExternalEnumLiteralDeclaration_2()); 
                    // InternalModa.g:381:3: ( 'external' )
                    // InternalModa.g:381:4: 'external'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataKindAccess().getExternalEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalModa.g:385:2: ( ( 'measured' ) )
                    {
                    // InternalModa.g:385:2: ( ( 'measured' ) )
                    // InternalModa.g:386:3: ( 'measured' )
                    {
                     before(grammarAccess.getDataKindAccess().getMeasuredEnumLiteralDeclaration_3()); 
                    // InternalModa.g:387:3: ( 'measured' )
                    // InternalModa.g:387:4: 'measured'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataKindAccess().getMeasuredEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataKind__Alternatives"


    // $ANTLR start "rule__RelationKind__Alternatives"
    // InternalModa.g:395:1: rule__RelationKind__Alternatives : ( ( ( 'generation' ) ) | ( ( 'enactment' ) ) | ( ( 'deployment' ) ) | ( ( 'input' ) ) | ( ( 'output' ) ) | ( ( 'measurement' ) ) | ( ( 'otherInterplay' ) ) | ( ( 'generalization' ) ) | ( ( 'preparation' ) ) | ( ( 'analysis' ) ) );
    public final void rule__RelationKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:399:1: ( ( ( 'generation' ) ) | ( ( 'enactment' ) ) | ( ( 'deployment' ) ) | ( ( 'input' ) ) | ( ( 'output' ) ) | ( ( 'measurement' ) ) | ( ( 'otherInterplay' ) ) | ( ( 'generalization' ) ) | ( ( 'preparation' ) ) | ( ( 'analysis' ) ) )
            int alt5=10;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            case 15:
                {
                alt5=5;
                }
                break;
            case 21:
                {
                alt5=6;
                }
                break;
            case 22:
                {
                alt5=7;
                }
                break;
            case 23:
                {
                alt5=8;
                }
                break;
            case 24:
                {
                alt5=9;
                }
                break;
            case 25:
                {
                alt5=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalModa.g:400:2: ( ( 'generation' ) )
                    {
                    // InternalModa.g:400:2: ( ( 'generation' ) )
                    // InternalModa.g:401:3: ( 'generation' )
                    {
                     before(grammarAccess.getRelationKindAccess().getGenerationEnumLiteralDeclaration_0()); 
                    // InternalModa.g:402:3: ( 'generation' )
                    // InternalModa.g:402:4: 'generation'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationKindAccess().getGenerationEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModa.g:406:2: ( ( 'enactment' ) )
                    {
                    // InternalModa.g:406:2: ( ( 'enactment' ) )
                    // InternalModa.g:407:3: ( 'enactment' )
                    {
                     before(grammarAccess.getRelationKindAccess().getEnactmentEnumLiteralDeclaration_1()); 
                    // InternalModa.g:408:3: ( 'enactment' )
                    // InternalModa.g:408:4: 'enactment'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationKindAccess().getEnactmentEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalModa.g:412:2: ( ( 'deployment' ) )
                    {
                    // InternalModa.g:412:2: ( ( 'deployment' ) )
                    // InternalModa.g:413:3: ( 'deployment' )
                    {
                     before(grammarAccess.getRelationKindAccess().getDeploymentEnumLiteralDeclaration_2()); 
                    // InternalModa.g:414:3: ( 'deployment' )
                    // InternalModa.g:414:4: 'deployment'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationKindAccess().getDeploymentEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalModa.g:418:2: ( ( 'input' ) )
                    {
                    // InternalModa.g:418:2: ( ( 'input' ) )
                    // InternalModa.g:419:3: ( 'input' )
                    {
                     before(grammarAccess.getRelationKindAccess().getInputEnumLiteralDeclaration_3()); 
                    // InternalModa.g:420:3: ( 'input' )
                    // InternalModa.g:420:4: 'input'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationKindAccess().getInputEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalModa.g:424:2: ( ( 'output' ) )
                    {
                    // InternalModa.g:424:2: ( ( 'output' ) )
                    // InternalModa.g:425:3: ( 'output' )
                    {
                     before(grammarAccess.getRelationKindAccess().getOutputEnumLiteralDeclaration_4()); 
                    // InternalModa.g:426:3: ( 'output' )
                    // InternalModa.g:426:4: 'output'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationKindAccess().getOutputEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalModa.g:430:2: ( ( 'measurement' ) )
                    {
                    // InternalModa.g:430:2: ( ( 'measurement' ) )
                    // InternalModa.g:431:3: ( 'measurement' )
                    {
                     before(grammarAccess.getRelationKindAccess().getMeasurementEnumLiteralDeclaration_5()); 
                    // InternalModa.g:432:3: ( 'measurement' )
                    // InternalModa.g:432:4: 'measurement'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationKindAccess().getMeasurementEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalModa.g:436:2: ( ( 'otherInterplay' ) )
                    {
                    // InternalModa.g:436:2: ( ( 'otherInterplay' ) )
                    // InternalModa.g:437:3: ( 'otherInterplay' )
                    {
                     before(grammarAccess.getRelationKindAccess().getOtherInterplayEnumLiteralDeclaration_6()); 
                    // InternalModa.g:438:3: ( 'otherInterplay' )
                    // InternalModa.g:438:4: 'otherInterplay'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationKindAccess().getOtherInterplayEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalModa.g:442:2: ( ( 'generalization' ) )
                    {
                    // InternalModa.g:442:2: ( ( 'generalization' ) )
                    // InternalModa.g:443:3: ( 'generalization' )
                    {
                     before(grammarAccess.getRelationKindAccess().getGeneralizationEnumLiteralDeclaration_7()); 
                    // InternalModa.g:444:3: ( 'generalization' )
                    // InternalModa.g:444:4: 'generalization'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationKindAccess().getGeneralizationEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalModa.g:448:2: ( ( 'preparation' ) )
                    {
                    // InternalModa.g:448:2: ( ( 'preparation' ) )
                    // InternalModa.g:449:3: ( 'preparation' )
                    {
                     before(grammarAccess.getRelationKindAccess().getPreparationEnumLiteralDeclaration_8()); 
                    // InternalModa.g:450:3: ( 'preparation' )
                    // InternalModa.g:450:4: 'preparation'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationKindAccess().getPreparationEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalModa.g:454:2: ( ( 'analysis' ) )
                    {
                    // InternalModa.g:454:2: ( ( 'analysis' ) )
                    // InternalModa.g:455:3: ( 'analysis' )
                    {
                     before(grammarAccess.getRelationKindAccess().getAnalysisEnumLiteralDeclaration_9()); 
                    // InternalModa.g:456:3: ( 'analysis' )
                    // InternalModa.g:456:4: 'analysis'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationKindAccess().getAnalysisEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationKind__Alternatives"


    // $ANTLR start "rule__MODAModel__Group__0"
    // InternalModa.g:464:1: rule__MODAModel__Group__0 : rule__MODAModel__Group__0__Impl rule__MODAModel__Group__1 ;
    public final void rule__MODAModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:468:1: ( rule__MODAModel__Group__0__Impl rule__MODAModel__Group__1 )
            // InternalModa.g:469:2: rule__MODAModel__Group__0__Impl rule__MODAModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MODAModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODAModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODAModel__Group__0"


    // $ANTLR start "rule__MODAModel__Group__0__Impl"
    // InternalModa.g:476:1: rule__MODAModel__Group__0__Impl : ( () ) ;
    public final void rule__MODAModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:480:1: ( ( () ) )
            // InternalModa.g:481:1: ( () )
            {
            // InternalModa.g:481:1: ( () )
            // InternalModa.g:482:2: ()
            {
             before(grammarAccess.getMODAModelAccess().getMODAModelAction_0()); 
            // InternalModa.g:483:2: ()
            // InternalModa.g:483:3: 
            {
            }

             after(grammarAccess.getMODAModelAccess().getMODAModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODAModel__Group__0__Impl"


    // $ANTLR start "rule__MODAModel__Group__1"
    // InternalModa.g:491:1: rule__MODAModel__Group__1 : rule__MODAModel__Group__1__Impl rule__MODAModel__Group__2 ;
    public final void rule__MODAModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:495:1: ( rule__MODAModel__Group__1__Impl rule__MODAModel__Group__2 )
            // InternalModa.g:496:2: rule__MODAModel__Group__1__Impl rule__MODAModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MODAModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODAModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODAModel__Group__1"


    // $ANTLR start "rule__MODAModel__Group__1__Impl"
    // InternalModa.g:503:1: rule__MODAModel__Group__1__Impl : ( 'MODAModel' ) ;
    public final void rule__MODAModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:507:1: ( ( 'MODAModel' ) )
            // InternalModa.g:508:1: ( 'MODAModel' )
            {
            // InternalModa.g:508:1: ( 'MODAModel' )
            // InternalModa.g:509:2: 'MODAModel'
            {
             before(grammarAccess.getMODAModelAccess().getMODAModelKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMODAModelAccess().getMODAModelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODAModel__Group__1__Impl"


    // $ANTLR start "rule__MODAModel__Group__2"
    // InternalModa.g:518:1: rule__MODAModel__Group__2 : rule__MODAModel__Group__2__Impl rule__MODAModel__Group__3 ;
    public final void rule__MODAModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:522:1: ( rule__MODAModel__Group__2__Impl rule__MODAModel__Group__3 )
            // InternalModa.g:523:2: rule__MODAModel__Group__2__Impl rule__MODAModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MODAModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODAModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODAModel__Group__2"


    // $ANTLR start "rule__MODAModel__Group__2__Impl"
    // InternalModa.g:530:1: rule__MODAModel__Group__2__Impl : ( ( rule__MODAModel__NameAssignment_2 ) ) ;
    public final void rule__MODAModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:534:1: ( ( ( rule__MODAModel__NameAssignment_2 ) ) )
            // InternalModa.g:535:1: ( ( rule__MODAModel__NameAssignment_2 ) )
            {
            // InternalModa.g:535:1: ( ( rule__MODAModel__NameAssignment_2 ) )
            // InternalModa.g:536:2: ( rule__MODAModel__NameAssignment_2 )
            {
             before(grammarAccess.getMODAModelAccess().getNameAssignment_2()); 
            // InternalModa.g:537:2: ( rule__MODAModel__NameAssignment_2 )
            // InternalModa.g:537:3: rule__MODAModel__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MODAModel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMODAModelAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODAModel__Group__2__Impl"


    // $ANTLR start "rule__MODAModel__Group__3"
    // InternalModa.g:545:1: rule__MODAModel__Group__3 : rule__MODAModel__Group__3__Impl rule__MODAModel__Group__4 ;
    public final void rule__MODAModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:549:1: ( rule__MODAModel__Group__3__Impl rule__MODAModel__Group__4 )
            // InternalModa.g:550:2: rule__MODAModel__Group__3__Impl rule__MODAModel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__MODAModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODAModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODAModel__Group__3"


    // $ANTLR start "rule__MODAModel__Group__3__Impl"
    // InternalModa.g:557:1: rule__MODAModel__Group__3__Impl : ( '{' ) ;
    public final void rule__MODAModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:561:1: ( ( '{' ) )
            // InternalModa.g:562:1: ( '{' )
            {
            // InternalModa.g:562:1: ( '{' )
            // InternalModa.g:563:2: '{'
            {
             before(grammarAccess.getMODAModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMODAModelAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODAModel__Group__3__Impl"


    // $ANTLR start "rule__MODAModel__Group__4"
    // InternalModa.g:572:1: rule__MODAModel__Group__4 : rule__MODAModel__Group__4__Impl rule__MODAModel__Group__5 ;
    public final void rule__MODAModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:576:1: ( rule__MODAModel__Group__4__Impl rule__MODAModel__Group__5 )
            // InternalModa.g:577:2: rule__MODAModel__Group__4__Impl rule__MODAModel__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__MODAModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODAModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODAModel__Group__4"


    // $ANTLR start "rule__MODAModel__Group__4__Impl"
    // InternalModa.g:584:1: rule__MODAModel__Group__4__Impl : ( ( rule__MODAModel__Group_4__0 )? ) ;
    public final void rule__MODAModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:588:1: ( ( ( rule__MODAModel__Group_4__0 )? ) )
            // InternalModa.g:589:1: ( ( rule__MODAModel__Group_4__0 )? )
            {
            // InternalModa.g:589:1: ( ( rule__MODAModel__Group_4__0 )? )
            // InternalModa.g:590:2: ( rule__MODAModel__Group_4__0 )?
            {
             before(grammarAccess.getMODAModelAccess().getGroup_4()); 
            // InternalModa.g:591:2: ( rule__MODAModel__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalModa.g:591:3: rule__MODAModel__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MODAModel__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMODAModelAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODAModel__Group__4__Impl"


    // $ANTLR start "rule__MODAModel__Group__5"
    // InternalModa.g:599:1: rule__MODAModel__Group__5 : rule__MODAModel__Group__5__Impl ;
    public final void rule__MODAModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:603:1: ( rule__MODAModel__Group__5__Impl )
            // InternalModa.g:604:2: rule__MODAModel__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MODAModel__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODAModel__Group__5"


    // $ANTLR start "rule__MODAModel__Group__5__Impl"
    // InternalModa.g:610:1: rule__MODAModel__Group__5__Impl : ( '}' ) ;
    public final void rule__MODAModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:614:1: ( ( '}' ) )
            // InternalModa.g:615:1: ( '}' )
            {
            // InternalModa.g:615:1: ( '}' )
            // InternalModa.g:616:2: '}'
            {
             before(grammarAccess.getMODAModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMODAModelAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODAModel__Group__5__Impl"


    // $ANTLR start "rule__MODAModel__Group_4__0"
    // InternalModa.g:626:1: rule__MODAModel__Group_4__0 : rule__MODAModel__Group_4__0__Impl rule__MODAModel__Group_4__1 ;
    public final void rule__MODAModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:630:1: ( rule__MODAModel__Group_4__0__Impl rule__MODAModel__Group_4__1 )
            // InternalModa.g:631:2: rule__MODAModel__Group_4__0__Impl rule__MODAModel__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__MODAModel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODAModel__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODAModel__Group_4__0"


    // $ANTLR start "rule__MODAModel__Group_4__0__Impl"
    // InternalModa.g:638:1: rule__MODAModel__Group_4__0__Impl : ( ( rule__MODAModel__ModelAssignment_4_0 ) ) ;
    public final void rule__MODAModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:642:1: ( ( ( rule__MODAModel__ModelAssignment_4_0 ) ) )
            // InternalModa.g:643:1: ( ( rule__MODAModel__ModelAssignment_4_0 ) )
            {
            // InternalModa.g:643:1: ( ( rule__MODAModel__ModelAssignment_4_0 ) )
            // InternalModa.g:644:2: ( rule__MODAModel__ModelAssignment_4_0 )
            {
             before(grammarAccess.getMODAModelAccess().getModelAssignment_4_0()); 
            // InternalModa.g:645:2: ( rule__MODAModel__ModelAssignment_4_0 )
            // InternalModa.g:645:3: rule__MODAModel__ModelAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__MODAModel__ModelAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getMODAModelAccess().getModelAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODAModel__Group_4__0__Impl"


    // $ANTLR start "rule__MODAModel__Group_4__1"
    // InternalModa.g:653:1: rule__MODAModel__Group_4__1 : rule__MODAModel__Group_4__1__Impl ;
    public final void rule__MODAModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:657:1: ( rule__MODAModel__Group_4__1__Impl )
            // InternalModa.g:658:2: rule__MODAModel__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MODAModel__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODAModel__Group_4__1"


    // $ANTLR start "rule__MODAModel__Group_4__1__Impl"
    // InternalModa.g:664:1: rule__MODAModel__Group_4__1__Impl : ( ( rule__MODAModel__Group_4_1__0 )* ) ;
    public final void rule__MODAModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:668:1: ( ( ( rule__MODAModel__Group_4_1__0 )* ) )
            // InternalModa.g:669:1: ( ( rule__MODAModel__Group_4_1__0 )* )
            {
            // InternalModa.g:669:1: ( ( rule__MODAModel__Group_4_1__0 )* )
            // InternalModa.g:670:2: ( rule__MODAModel__Group_4_1__0 )*
            {
             before(grammarAccess.getMODAModelAccess().getGroup_4_1()); 
            // InternalModa.g:671:2: ( rule__MODAModel__Group_4_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalModa.g:671:3: rule__MODAModel__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__MODAModel__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getMODAModelAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODAModel__Group_4__1__Impl"


    // $ANTLR start "rule__MODAModel__Group_4_1__0"
    // InternalModa.g:680:1: rule__MODAModel__Group_4_1__0 : rule__MODAModel__Group_4_1__0__Impl rule__MODAModel__Group_4_1__1 ;
    public final void rule__MODAModel__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:684:1: ( rule__MODAModel__Group_4_1__0__Impl rule__MODAModel__Group_4_1__1 )
            // InternalModa.g:685:2: rule__MODAModel__Group_4_1__0__Impl rule__MODAModel__Group_4_1__1
            {
            pushFollow(FOLLOW_9);
            rule__MODAModel__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODAModel__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODAModel__Group_4_1__0"


    // $ANTLR start "rule__MODAModel__Group_4_1__0__Impl"
    // InternalModa.g:692:1: rule__MODAModel__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__MODAModel__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:696:1: ( ( ',' ) )
            // InternalModa.g:697:1: ( ',' )
            {
            // InternalModa.g:697:1: ( ',' )
            // InternalModa.g:698:2: ','
            {
             before(grammarAccess.getMODAModelAccess().getCommaKeyword_4_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMODAModelAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODAModel__Group_4_1__0__Impl"


    // $ANTLR start "rule__MODAModel__Group_4_1__1"
    // InternalModa.g:707:1: rule__MODAModel__Group_4_1__1 : rule__MODAModel__Group_4_1__1__Impl ;
    public final void rule__MODAModel__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:711:1: ( rule__MODAModel__Group_4_1__1__Impl )
            // InternalModa.g:712:2: rule__MODAModel__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MODAModel__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODAModel__Group_4_1__1"


    // $ANTLR start "rule__MODAModel__Group_4_1__1__Impl"
    // InternalModa.g:718:1: rule__MODAModel__Group_4_1__1__Impl : ( ( rule__MODAModel__Alternatives_4_1_1 ) ) ;
    public final void rule__MODAModel__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:722:1: ( ( ( rule__MODAModel__Alternatives_4_1_1 ) ) )
            // InternalModa.g:723:1: ( ( rule__MODAModel__Alternatives_4_1_1 ) )
            {
            // InternalModa.g:723:1: ( ( rule__MODAModel__Alternatives_4_1_1 ) )
            // InternalModa.g:724:2: ( rule__MODAModel__Alternatives_4_1_1 )
            {
             before(grammarAccess.getMODAModelAccess().getAlternatives_4_1_1()); 
            // InternalModa.g:725:2: ( rule__MODAModel__Alternatives_4_1_1 )
            // InternalModa.g:725:3: rule__MODAModel__Alternatives_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MODAModel__Alternatives_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMODAModelAccess().getAlternatives_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODAModel__Group_4_1__1__Impl"


    // $ANTLR start "rule__Model__Group__0"
    // InternalModa.g:734:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:738:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalModa.g:739:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalModa.g:746:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:750:1: ( ( () ) )
            // InternalModa.g:751:1: ( () )
            {
            // InternalModa.g:751:1: ( () )
            // InternalModa.g:752:2: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // InternalModa.g:753:2: ()
            // InternalModa.g:753:3: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalModa.g:761:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:765:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalModa.g:766:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalModa.g:773:1: rule__Model__Group__1__Impl : ( 'model' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:777:1: ( ( 'model' ) )
            // InternalModa.g:778:1: ( 'model' )
            {
            // InternalModa.g:778:1: ( 'model' )
            // InternalModa.g:779:2: 'model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getModelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalModa.g:788:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:792:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalModa.g:793:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalModa.g:800:1: rule__Model__Group__2__Impl : ( ( rule__Model__NameAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:804:1: ( ( ( rule__Model__NameAssignment_2 ) ) )
            // InternalModa.g:805:1: ( ( rule__Model__NameAssignment_2 ) )
            {
            // InternalModa.g:805:1: ( ( rule__Model__NameAssignment_2 ) )
            // InternalModa.g:806:2: ( rule__Model__NameAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_2()); 
            // InternalModa.g:807:2: ( rule__Model__NameAssignment_2 )
            // InternalModa.g:807:3: rule__Model__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalModa.g:815:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:819:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalModa.g:820:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalModa.g:827:1: rule__Model__Group__3__Impl : ( ( rule__Model__KindAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:831:1: ( ( ( rule__Model__KindAssignment_3 ) ) )
            // InternalModa.g:832:1: ( ( rule__Model__KindAssignment_3 ) )
            {
            // InternalModa.g:832:1: ( ( rule__Model__KindAssignment_3 ) )
            // InternalModa.g:833:2: ( rule__Model__KindAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getKindAssignment_3()); 
            // InternalModa.g:834:2: ( rule__Model__KindAssignment_3 )
            // InternalModa.g:834:3: rule__Model__KindAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Model__KindAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getKindAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalModa.g:842:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:846:1: ( rule__Model__Group__4__Impl )
            // InternalModa.g:847:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalModa.g:853:1: rule__Model__Group__4__Impl : ( ( rule__Model__DescriptionAssignment_4 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:857:1: ( ( ( rule__Model__DescriptionAssignment_4 )? ) )
            // InternalModa.g:858:1: ( ( rule__Model__DescriptionAssignment_4 )? )
            {
            // InternalModa.g:858:1: ( ( rule__Model__DescriptionAssignment_4 )? )
            // InternalModa.g:859:2: ( rule__Model__DescriptionAssignment_4 )?
            {
             before(grammarAccess.getModelAccess().getDescriptionAssignment_4()); 
            // InternalModa.g:860:2: ( rule__Model__DescriptionAssignment_4 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalModa.g:860:3: rule__Model__DescriptionAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__DescriptionAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getDescriptionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Data__Group__0"
    // InternalModa.g:869:1: rule__Data__Group__0 : rule__Data__Group__0__Impl rule__Data__Group__1 ;
    public final void rule__Data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:873:1: ( rule__Data__Group__0__Impl rule__Data__Group__1 )
            // InternalModa.g:874:2: rule__Data__Group__0__Impl rule__Data__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Data__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__0"


    // $ANTLR start "rule__Data__Group__0__Impl"
    // InternalModa.g:881:1: rule__Data__Group__0__Impl : ( () ) ;
    public final void rule__Data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:885:1: ( ( () ) )
            // InternalModa.g:886:1: ( () )
            {
            // InternalModa.g:886:1: ( () )
            // InternalModa.g:887:2: ()
            {
             before(grammarAccess.getDataAccess().getDataAction_0()); 
            // InternalModa.g:888:2: ()
            // InternalModa.g:888:3: 
            {
            }

             after(grammarAccess.getDataAccess().getDataAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__0__Impl"


    // $ANTLR start "rule__Data__Group__1"
    // InternalModa.g:896:1: rule__Data__Group__1 : rule__Data__Group__1__Impl rule__Data__Group__2 ;
    public final void rule__Data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:900:1: ( rule__Data__Group__1__Impl rule__Data__Group__2 )
            // InternalModa.g:901:2: rule__Data__Group__1__Impl rule__Data__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Data__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__1"


    // $ANTLR start "rule__Data__Group__1__Impl"
    // InternalModa.g:908:1: rule__Data__Group__1__Impl : ( 'data' ) ;
    public final void rule__Data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:912:1: ( ( 'data' ) )
            // InternalModa.g:913:1: ( 'data' )
            {
            // InternalModa.g:913:1: ( 'data' )
            // InternalModa.g:914:2: 'data'
            {
             before(grammarAccess.getDataAccess().getDataKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getDataKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__1__Impl"


    // $ANTLR start "rule__Data__Group__2"
    // InternalModa.g:923:1: rule__Data__Group__2 : rule__Data__Group__2__Impl rule__Data__Group__3 ;
    public final void rule__Data__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:927:1: ( rule__Data__Group__2__Impl rule__Data__Group__3 )
            // InternalModa.g:928:2: rule__Data__Group__2__Impl rule__Data__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Data__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__2"


    // $ANTLR start "rule__Data__Group__2__Impl"
    // InternalModa.g:935:1: rule__Data__Group__2__Impl : ( ( rule__Data__NameAssignment_2 ) ) ;
    public final void rule__Data__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:939:1: ( ( ( rule__Data__NameAssignment_2 ) ) )
            // InternalModa.g:940:1: ( ( rule__Data__NameAssignment_2 ) )
            {
            // InternalModa.g:940:1: ( ( rule__Data__NameAssignment_2 ) )
            // InternalModa.g:941:2: ( rule__Data__NameAssignment_2 )
            {
             before(grammarAccess.getDataAccess().getNameAssignment_2()); 
            // InternalModa.g:942:2: ( rule__Data__NameAssignment_2 )
            // InternalModa.g:942:3: rule__Data__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Data__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__2__Impl"


    // $ANTLR start "rule__Data__Group__3"
    // InternalModa.g:950:1: rule__Data__Group__3 : rule__Data__Group__3__Impl rule__Data__Group__4 ;
    public final void rule__Data__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:954:1: ( rule__Data__Group__3__Impl rule__Data__Group__4 )
            // InternalModa.g:955:2: rule__Data__Group__3__Impl rule__Data__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Data__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__3"


    // $ANTLR start "rule__Data__Group__3__Impl"
    // InternalModa.g:962:1: rule__Data__Group__3__Impl : ( ( rule__Data__KindAssignment_3 ) ) ;
    public final void rule__Data__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:966:1: ( ( ( rule__Data__KindAssignment_3 ) ) )
            // InternalModa.g:967:1: ( ( rule__Data__KindAssignment_3 ) )
            {
            // InternalModa.g:967:1: ( ( rule__Data__KindAssignment_3 ) )
            // InternalModa.g:968:2: ( rule__Data__KindAssignment_3 )
            {
             before(grammarAccess.getDataAccess().getKindAssignment_3()); 
            // InternalModa.g:969:2: ( rule__Data__KindAssignment_3 )
            // InternalModa.g:969:3: rule__Data__KindAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Data__KindAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getKindAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__3__Impl"


    // $ANTLR start "rule__Data__Group__4"
    // InternalModa.g:977:1: rule__Data__Group__4 : rule__Data__Group__4__Impl ;
    public final void rule__Data__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:981:1: ( rule__Data__Group__4__Impl )
            // InternalModa.g:982:2: rule__Data__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__4"


    // $ANTLR start "rule__Data__Group__4__Impl"
    // InternalModa.g:988:1: rule__Data__Group__4__Impl : ( ( rule__Data__DescriptionAssignment_4 )? ) ;
    public final void rule__Data__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:992:1: ( ( ( rule__Data__DescriptionAssignment_4 )? ) )
            // InternalModa.g:993:1: ( ( rule__Data__DescriptionAssignment_4 )? )
            {
            // InternalModa.g:993:1: ( ( rule__Data__DescriptionAssignment_4 )? )
            // InternalModa.g:994:2: ( rule__Data__DescriptionAssignment_4 )?
            {
             before(grammarAccess.getDataAccess().getDescriptionAssignment_4()); 
            // InternalModa.g:995:2: ( rule__Data__DescriptionAssignment_4 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalModa.g:995:3: rule__Data__DescriptionAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Data__DescriptionAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataAccess().getDescriptionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__4__Impl"


    // $ANTLR start "rule__RunningSoftware__Group__0"
    // InternalModa.g:1004:1: rule__RunningSoftware__Group__0 : rule__RunningSoftware__Group__0__Impl rule__RunningSoftware__Group__1 ;
    public final void rule__RunningSoftware__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1008:1: ( rule__RunningSoftware__Group__0__Impl rule__RunningSoftware__Group__1 )
            // InternalModa.g:1009:2: rule__RunningSoftware__Group__0__Impl rule__RunningSoftware__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__RunningSoftware__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RunningSoftware__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunningSoftware__Group__0"


    // $ANTLR start "rule__RunningSoftware__Group__0__Impl"
    // InternalModa.g:1016:1: rule__RunningSoftware__Group__0__Impl : ( () ) ;
    public final void rule__RunningSoftware__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1020:1: ( ( () ) )
            // InternalModa.g:1021:1: ( () )
            {
            // InternalModa.g:1021:1: ( () )
            // InternalModa.g:1022:2: ()
            {
             before(grammarAccess.getRunningSoftwareAccess().getRunningSoftwareAction_0()); 
            // InternalModa.g:1023:2: ()
            // InternalModa.g:1023:3: 
            {
            }

             after(grammarAccess.getRunningSoftwareAccess().getRunningSoftwareAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunningSoftware__Group__0__Impl"


    // $ANTLR start "rule__RunningSoftware__Group__1"
    // InternalModa.g:1031:1: rule__RunningSoftware__Group__1 : rule__RunningSoftware__Group__1__Impl rule__RunningSoftware__Group__2 ;
    public final void rule__RunningSoftware__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1035:1: ( rule__RunningSoftware__Group__1__Impl rule__RunningSoftware__Group__2 )
            // InternalModa.g:1036:2: rule__RunningSoftware__Group__1__Impl rule__RunningSoftware__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RunningSoftware__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RunningSoftware__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunningSoftware__Group__1"


    // $ANTLR start "rule__RunningSoftware__Group__1__Impl"
    // InternalModa.g:1043:1: rule__RunningSoftware__Group__1__Impl : ( 'software' ) ;
    public final void rule__RunningSoftware__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1047:1: ( ( 'software' ) )
            // InternalModa.g:1048:1: ( 'software' )
            {
            // InternalModa.g:1048:1: ( 'software' )
            // InternalModa.g:1049:2: 'software'
            {
             before(grammarAccess.getRunningSoftwareAccess().getSoftwareKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRunningSoftwareAccess().getSoftwareKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunningSoftware__Group__1__Impl"


    // $ANTLR start "rule__RunningSoftware__Group__2"
    // InternalModa.g:1058:1: rule__RunningSoftware__Group__2 : rule__RunningSoftware__Group__2__Impl ;
    public final void rule__RunningSoftware__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1062:1: ( rule__RunningSoftware__Group__2__Impl )
            // InternalModa.g:1063:2: rule__RunningSoftware__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RunningSoftware__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunningSoftware__Group__2"


    // $ANTLR start "rule__RunningSoftware__Group__2__Impl"
    // InternalModa.g:1069:1: rule__RunningSoftware__Group__2__Impl : ( ( rule__RunningSoftware__NameAssignment_2 ) ) ;
    public final void rule__RunningSoftware__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1073:1: ( ( ( rule__RunningSoftware__NameAssignment_2 ) ) )
            // InternalModa.g:1074:1: ( ( rule__RunningSoftware__NameAssignment_2 ) )
            {
            // InternalModa.g:1074:1: ( ( rule__RunningSoftware__NameAssignment_2 ) )
            // InternalModa.g:1075:2: ( rule__RunningSoftware__NameAssignment_2 )
            {
             before(grammarAccess.getRunningSoftwareAccess().getNameAssignment_2()); 
            // InternalModa.g:1076:2: ( rule__RunningSoftware__NameAssignment_2 )
            // InternalModa.g:1076:3: rule__RunningSoftware__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RunningSoftware__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRunningSoftwareAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunningSoftware__Group__2__Impl"


    // $ANTLR start "rule__STS__Group__0"
    // InternalModa.g:1085:1: rule__STS__Group__0 : rule__STS__Group__0__Impl rule__STS__Group__1 ;
    public final void rule__STS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1089:1: ( rule__STS__Group__0__Impl rule__STS__Group__1 )
            // InternalModa.g:1090:2: rule__STS__Group__0__Impl rule__STS__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__STS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__STS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STS__Group__0"


    // $ANTLR start "rule__STS__Group__0__Impl"
    // InternalModa.g:1097:1: rule__STS__Group__0__Impl : ( () ) ;
    public final void rule__STS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1101:1: ( ( () ) )
            // InternalModa.g:1102:1: ( () )
            {
            // InternalModa.g:1102:1: ( () )
            // InternalModa.g:1103:2: ()
            {
             before(grammarAccess.getSTSAccess().getSTSAction_0()); 
            // InternalModa.g:1104:2: ()
            // InternalModa.g:1104:3: 
            {
            }

             after(grammarAccess.getSTSAccess().getSTSAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STS__Group__0__Impl"


    // $ANTLR start "rule__STS__Group__1"
    // InternalModa.g:1112:1: rule__STS__Group__1 : rule__STS__Group__1__Impl rule__STS__Group__2 ;
    public final void rule__STS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1116:1: ( rule__STS__Group__1__Impl rule__STS__Group__2 )
            // InternalModa.g:1117:2: rule__STS__Group__1__Impl rule__STS__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__STS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__STS__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STS__Group__1"


    // $ANTLR start "rule__STS__Group__1__Impl"
    // InternalModa.g:1124:1: rule__STS__Group__1__Impl : ( 'sts' ) ;
    public final void rule__STS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1128:1: ( ( 'sts' ) )
            // InternalModa.g:1129:1: ( 'sts' )
            {
            // InternalModa.g:1129:1: ( 'sts' )
            // InternalModa.g:1130:2: 'sts'
            {
             before(grammarAccess.getSTSAccess().getStsKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSTSAccess().getStsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STS__Group__1__Impl"


    // $ANTLR start "rule__STS__Group__2"
    // InternalModa.g:1139:1: rule__STS__Group__2 : rule__STS__Group__2__Impl ;
    public final void rule__STS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1143:1: ( rule__STS__Group__2__Impl )
            // InternalModa.g:1144:2: rule__STS__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__STS__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STS__Group__2"


    // $ANTLR start "rule__STS__Group__2__Impl"
    // InternalModa.g:1150:1: rule__STS__Group__2__Impl : ( ( rule__STS__NameAssignment_2 ) ) ;
    public final void rule__STS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1154:1: ( ( ( rule__STS__NameAssignment_2 ) ) )
            // InternalModa.g:1155:1: ( ( rule__STS__NameAssignment_2 ) )
            {
            // InternalModa.g:1155:1: ( ( rule__STS__NameAssignment_2 ) )
            // InternalModa.g:1156:2: ( rule__STS__NameAssignment_2 )
            {
             before(grammarAccess.getSTSAccess().getNameAssignment_2()); 
            // InternalModa.g:1157:2: ( rule__STS__NameAssignment_2 )
            // InternalModa.g:1157:3: rule__STS__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__STS__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSTSAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STS__Group__2__Impl"


    // $ANTLR start "rule__MODARelation__Group__0"
    // InternalModa.g:1166:1: rule__MODARelation__Group__0 : rule__MODARelation__Group__0__Impl rule__MODARelation__Group__1 ;
    public final void rule__MODARelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1170:1: ( rule__MODARelation__Group__0__Impl rule__MODARelation__Group__1 )
            // InternalModa.g:1171:2: rule__MODARelation__Group__0__Impl rule__MODARelation__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MODARelation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODARelation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODARelation__Group__0"


    // $ANTLR start "rule__MODARelation__Group__0__Impl"
    // InternalModa.g:1178:1: rule__MODARelation__Group__0__Impl : ( () ) ;
    public final void rule__MODARelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1182:1: ( ( () ) )
            // InternalModa.g:1183:1: ( () )
            {
            // InternalModa.g:1183:1: ( () )
            // InternalModa.g:1184:2: ()
            {
             before(grammarAccess.getMODARelationAccess().getMODARelationAction_0()); 
            // InternalModa.g:1185:2: ()
            // InternalModa.g:1185:3: 
            {
            }

             after(grammarAccess.getMODARelationAccess().getMODARelationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODARelation__Group__0__Impl"


    // $ANTLR start "rule__MODARelation__Group__1"
    // InternalModa.g:1193:1: rule__MODARelation__Group__1 : rule__MODARelation__Group__1__Impl rule__MODARelation__Group__2 ;
    public final void rule__MODARelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1197:1: ( rule__MODARelation__Group__1__Impl rule__MODARelation__Group__2 )
            // InternalModa.g:1198:2: rule__MODARelation__Group__1__Impl rule__MODARelation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MODARelation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODARelation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODARelation__Group__1"


    // $ANTLR start "rule__MODARelation__Group__1__Impl"
    // InternalModa.g:1205:1: rule__MODARelation__Group__1__Impl : ( 'relation' ) ;
    public final void rule__MODARelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1209:1: ( ( 'relation' ) )
            // InternalModa.g:1210:1: ( 'relation' )
            {
            // InternalModa.g:1210:1: ( 'relation' )
            // InternalModa.g:1211:2: 'relation'
            {
             before(grammarAccess.getMODARelationAccess().getRelationKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMODARelationAccess().getRelationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODARelation__Group__1__Impl"


    // $ANTLR start "rule__MODARelation__Group__2"
    // InternalModa.g:1220:1: rule__MODARelation__Group__2 : rule__MODARelation__Group__2__Impl rule__MODARelation__Group__3 ;
    public final void rule__MODARelation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1224:1: ( rule__MODARelation__Group__2__Impl rule__MODARelation__Group__3 )
            // InternalModa.g:1225:2: rule__MODARelation__Group__2__Impl rule__MODARelation__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__MODARelation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODARelation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODARelation__Group__2"


    // $ANTLR start "rule__MODARelation__Group__2__Impl"
    // InternalModa.g:1232:1: rule__MODARelation__Group__2__Impl : ( ( rule__MODARelation__NameAssignment_2 ) ) ;
    public final void rule__MODARelation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1236:1: ( ( ( rule__MODARelation__NameAssignment_2 ) ) )
            // InternalModa.g:1237:1: ( ( rule__MODARelation__NameAssignment_2 ) )
            {
            // InternalModa.g:1237:1: ( ( rule__MODARelation__NameAssignment_2 ) )
            // InternalModa.g:1238:2: ( rule__MODARelation__NameAssignment_2 )
            {
             before(grammarAccess.getMODARelationAccess().getNameAssignment_2()); 
            // InternalModa.g:1239:2: ( rule__MODARelation__NameAssignment_2 )
            // InternalModa.g:1239:3: rule__MODARelation__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MODARelation__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMODARelationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODARelation__Group__2__Impl"


    // $ANTLR start "rule__MODARelation__Group__3"
    // InternalModa.g:1247:1: rule__MODARelation__Group__3 : rule__MODARelation__Group__3__Impl rule__MODARelation__Group__4 ;
    public final void rule__MODARelation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1251:1: ( rule__MODARelation__Group__3__Impl rule__MODARelation__Group__4 )
            // InternalModa.g:1252:2: rule__MODARelation__Group__3__Impl rule__MODARelation__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__MODARelation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODARelation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODARelation__Group__3"


    // $ANTLR start "rule__MODARelation__Group__3__Impl"
    // InternalModa.g:1259:1: rule__MODARelation__Group__3__Impl : ( ( rule__MODARelation__KindAssignment_3 ) ) ;
    public final void rule__MODARelation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1263:1: ( ( ( rule__MODARelation__KindAssignment_3 ) ) )
            // InternalModa.g:1264:1: ( ( rule__MODARelation__KindAssignment_3 ) )
            {
            // InternalModa.g:1264:1: ( ( rule__MODARelation__KindAssignment_3 ) )
            // InternalModa.g:1265:2: ( rule__MODARelation__KindAssignment_3 )
            {
             before(grammarAccess.getMODARelationAccess().getKindAssignment_3()); 
            // InternalModa.g:1266:2: ( rule__MODARelation__KindAssignment_3 )
            // InternalModa.g:1266:3: rule__MODARelation__KindAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MODARelation__KindAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMODARelationAccess().getKindAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODARelation__Group__3__Impl"


    // $ANTLR start "rule__MODARelation__Group__4"
    // InternalModa.g:1274:1: rule__MODARelation__Group__4 : rule__MODARelation__Group__4__Impl rule__MODARelation__Group__5 ;
    public final void rule__MODARelation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1278:1: ( rule__MODARelation__Group__4__Impl rule__MODARelation__Group__5 )
            // InternalModa.g:1279:2: rule__MODARelation__Group__4__Impl rule__MODARelation__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__MODARelation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODARelation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODARelation__Group__4"


    // $ANTLR start "rule__MODARelation__Group__4__Impl"
    // InternalModa.g:1286:1: rule__MODARelation__Group__4__Impl : ( ( rule__MODARelation__SrcAssignment_4 ) ) ;
    public final void rule__MODARelation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1290:1: ( ( ( rule__MODARelation__SrcAssignment_4 ) ) )
            // InternalModa.g:1291:1: ( ( rule__MODARelation__SrcAssignment_4 ) )
            {
            // InternalModa.g:1291:1: ( ( rule__MODARelation__SrcAssignment_4 ) )
            // InternalModa.g:1292:2: ( rule__MODARelation__SrcAssignment_4 )
            {
             before(grammarAccess.getMODARelationAccess().getSrcAssignment_4()); 
            // InternalModa.g:1293:2: ( rule__MODARelation__SrcAssignment_4 )
            // InternalModa.g:1293:3: rule__MODARelation__SrcAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MODARelation__SrcAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMODARelationAccess().getSrcAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODARelation__Group__4__Impl"


    // $ANTLR start "rule__MODARelation__Group__5"
    // InternalModa.g:1301:1: rule__MODARelation__Group__5 : rule__MODARelation__Group__5__Impl rule__MODARelation__Group__6 ;
    public final void rule__MODARelation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1305:1: ( rule__MODARelation__Group__5__Impl rule__MODARelation__Group__6 )
            // InternalModa.g:1306:2: rule__MODARelation__Group__5__Impl rule__MODARelation__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__MODARelation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODARelation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODARelation__Group__5"


    // $ANTLR start "rule__MODARelation__Group__5__Impl"
    // InternalModa.g:1313:1: rule__MODARelation__Group__5__Impl : ( '->' ) ;
    public final void rule__MODARelation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1317:1: ( ( '->' ) )
            // InternalModa.g:1318:1: ( '->' )
            {
            // InternalModa.g:1318:1: ( '->' )
            // InternalModa.g:1319:2: '->'
            {
             before(grammarAccess.getMODARelationAccess().getHyphenMinusGreaterThanSignKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMODARelationAccess().getHyphenMinusGreaterThanSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODARelation__Group__5__Impl"


    // $ANTLR start "rule__MODARelation__Group__6"
    // InternalModa.g:1328:1: rule__MODARelation__Group__6 : rule__MODARelation__Group__6__Impl ;
    public final void rule__MODARelation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1332:1: ( rule__MODARelation__Group__6__Impl )
            // InternalModa.g:1333:2: rule__MODARelation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MODARelation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODARelation__Group__6"


    // $ANTLR start "rule__MODARelation__Group__6__Impl"
    // InternalModa.g:1339:1: rule__MODARelation__Group__6__Impl : ( ( rule__MODARelation__TgtAssignment_6 ) ) ;
    public final void rule__MODARelation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1343:1: ( ( ( rule__MODARelation__TgtAssignment_6 ) ) )
            // InternalModa.g:1344:1: ( ( rule__MODARelation__TgtAssignment_6 ) )
            {
            // InternalModa.g:1344:1: ( ( rule__MODARelation__TgtAssignment_6 ) )
            // InternalModa.g:1345:2: ( rule__MODARelation__TgtAssignment_6 )
            {
             before(grammarAccess.getMODARelationAccess().getTgtAssignment_6()); 
            // InternalModa.g:1346:2: ( rule__MODARelation__TgtAssignment_6 )
            // InternalModa.g:1346:3: rule__MODARelation__TgtAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__MODARelation__TgtAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMODARelationAccess().getTgtAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODARelation__Group__6__Impl"


    // $ANTLR start "rule__MODAModel__NameAssignment_2"
    // InternalModa.g:1355:1: rule__MODAModel__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__MODAModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1359:1: ( ( ruleEString ) )
            // InternalModa.g:1360:2: ( ruleEString )
            {
            // InternalModa.g:1360:2: ( ruleEString )
            // InternalModa.g:1361:3: ruleEString
            {
             before(grammarAccess.getMODAModelAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMODAModelAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODAModel__NameAssignment_2"


    // $ANTLR start "rule__MODAModel__ModelAssignment_4_0"
    // InternalModa.g:1370:1: rule__MODAModel__ModelAssignment_4_0 : ( ruleModel ) ;
    public final void rule__MODAModel__ModelAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1374:1: ( ( ruleModel ) )
            // InternalModa.g:1375:2: ( ruleModel )
            {
            // InternalModa.g:1375:2: ( ruleModel )
            // InternalModa.g:1376:3: ruleModel
            {
             before(grammarAccess.getMODAModelAccess().getModelModelParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getMODAModelAccess().getModelModelParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODAModel__ModelAssignment_4_0"


    // $ANTLR start "rule__MODAModel__ModelAssignment_4_1_1_0"
    // InternalModa.g:1385:1: rule__MODAModel__ModelAssignment_4_1_1_0 : ( ruleModel ) ;
    public final void rule__MODAModel__ModelAssignment_4_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1389:1: ( ( ruleModel ) )
            // InternalModa.g:1390:2: ( ruleModel )
            {
            // InternalModa.g:1390:2: ( ruleModel )
            // InternalModa.g:1391:3: ruleModel
            {
             before(grammarAccess.getMODAModelAccess().getModelModelParserRuleCall_4_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getMODAModelAccess().getModelModelParserRuleCall_4_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODAModel__ModelAssignment_4_1_1_0"


    // $ANTLR start "rule__MODAModel__DataAssignment_4_1_1_1"
    // InternalModa.g:1400:1: rule__MODAModel__DataAssignment_4_1_1_1 : ( ruleData ) ;
    public final void rule__MODAModel__DataAssignment_4_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1404:1: ( ( ruleData ) )
            // InternalModa.g:1405:2: ( ruleData )
            {
            // InternalModa.g:1405:2: ( ruleData )
            // InternalModa.g:1406:3: ruleData
            {
             before(grammarAccess.getMODAModelAccess().getDataDataParserRuleCall_4_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getMODAModelAccess().getDataDataParserRuleCall_4_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODAModel__DataAssignment_4_1_1_1"


    // $ANTLR start "rule__MODAModel__SoftwareAssignment_4_1_1_2"
    // InternalModa.g:1415:1: rule__MODAModel__SoftwareAssignment_4_1_1_2 : ( ruleRunningSoftware ) ;
    public final void rule__MODAModel__SoftwareAssignment_4_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1419:1: ( ( ruleRunningSoftware ) )
            // InternalModa.g:1420:2: ( ruleRunningSoftware )
            {
            // InternalModa.g:1420:2: ( ruleRunningSoftware )
            // InternalModa.g:1421:3: ruleRunningSoftware
            {
             before(grammarAccess.getMODAModelAccess().getSoftwareRunningSoftwareParserRuleCall_4_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRunningSoftware();

            state._fsp--;

             after(grammarAccess.getMODAModelAccess().getSoftwareRunningSoftwareParserRuleCall_4_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODAModel__SoftwareAssignment_4_1_1_2"


    // $ANTLR start "rule__MODAModel__StsAssignment_4_1_1_3"
    // InternalModa.g:1430:1: rule__MODAModel__StsAssignment_4_1_1_3 : ( ruleSTS ) ;
    public final void rule__MODAModel__StsAssignment_4_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1434:1: ( ( ruleSTS ) )
            // InternalModa.g:1435:2: ( ruleSTS )
            {
            // InternalModa.g:1435:2: ( ruleSTS )
            // InternalModa.g:1436:3: ruleSTS
            {
             before(grammarAccess.getMODAModelAccess().getStsSTSParserRuleCall_4_1_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSTS();

            state._fsp--;

             after(grammarAccess.getMODAModelAccess().getStsSTSParserRuleCall_4_1_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODAModel__StsAssignment_4_1_1_3"


    // $ANTLR start "rule__MODAModel__ModarelationAssignment_4_1_1_4"
    // InternalModa.g:1445:1: rule__MODAModel__ModarelationAssignment_4_1_1_4 : ( ruleMODARelation ) ;
    public final void rule__MODAModel__ModarelationAssignment_4_1_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1449:1: ( ( ruleMODARelation ) )
            // InternalModa.g:1450:2: ( ruleMODARelation )
            {
            // InternalModa.g:1450:2: ( ruleMODARelation )
            // InternalModa.g:1451:3: ruleMODARelation
            {
             before(grammarAccess.getMODAModelAccess().getModarelationMODARelationParserRuleCall_4_1_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMODARelation();

            state._fsp--;

             after(grammarAccess.getMODAModelAccess().getModarelationMODARelationParserRuleCall_4_1_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODAModel__ModarelationAssignment_4_1_1_4"


    // $ANTLR start "rule__Model__NameAssignment_2"
    // InternalModa.g:1460:1: rule__Model__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Model__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1464:1: ( ( ruleEString ) )
            // InternalModa.g:1465:2: ( ruleEString )
            {
            // InternalModa.g:1465:2: ( ruleEString )
            // InternalModa.g:1466:3: ruleEString
            {
             before(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_2"


    // $ANTLR start "rule__Model__KindAssignment_3"
    // InternalModa.g:1475:1: rule__Model__KindAssignment_3 : ( ruleModelKind ) ;
    public final void rule__Model__KindAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1479:1: ( ( ruleModelKind ) )
            // InternalModa.g:1480:2: ( ruleModelKind )
            {
            // InternalModa.g:1480:2: ( ruleModelKind )
            // InternalModa.g:1481:3: ruleModelKind
            {
             before(grammarAccess.getModelAccess().getKindModelKindEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleModelKind();

            state._fsp--;

             after(grammarAccess.getModelAccess().getKindModelKindEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__KindAssignment_3"


    // $ANTLR start "rule__Model__DescriptionAssignment_4"
    // InternalModa.g:1490:1: rule__Model__DescriptionAssignment_4 : ( ruleEString ) ;
    public final void rule__Model__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1494:1: ( ( ruleEString ) )
            // InternalModa.g:1495:2: ( ruleEString )
            {
            // InternalModa.g:1495:2: ( ruleEString )
            // InternalModa.g:1496:3: ruleEString
            {
             before(grammarAccess.getModelAccess().getDescriptionEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDescriptionEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DescriptionAssignment_4"


    // $ANTLR start "rule__Data__NameAssignment_2"
    // InternalModa.g:1505:1: rule__Data__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Data__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1509:1: ( ( ruleEString ) )
            // InternalModa.g:1510:2: ( ruleEString )
            {
            // InternalModa.g:1510:2: ( ruleEString )
            // InternalModa.g:1511:3: ruleEString
            {
             before(grammarAccess.getDataAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__NameAssignment_2"


    // $ANTLR start "rule__Data__KindAssignment_3"
    // InternalModa.g:1520:1: rule__Data__KindAssignment_3 : ( ruleDataKind ) ;
    public final void rule__Data__KindAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1524:1: ( ( ruleDataKind ) )
            // InternalModa.g:1525:2: ( ruleDataKind )
            {
            // InternalModa.g:1525:2: ( ruleDataKind )
            // InternalModa.g:1526:3: ruleDataKind
            {
             before(grammarAccess.getDataAccess().getKindDataKindEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDataKind();

            state._fsp--;

             after(grammarAccess.getDataAccess().getKindDataKindEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__KindAssignment_3"


    // $ANTLR start "rule__Data__DescriptionAssignment_4"
    // InternalModa.g:1535:1: rule__Data__DescriptionAssignment_4 : ( ruleEString ) ;
    public final void rule__Data__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1539:1: ( ( ruleEString ) )
            // InternalModa.g:1540:2: ( ruleEString )
            {
            // InternalModa.g:1540:2: ( ruleEString )
            // InternalModa.g:1541:3: ruleEString
            {
             before(grammarAccess.getDataAccess().getDescriptionEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataAccess().getDescriptionEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__DescriptionAssignment_4"


    // $ANTLR start "rule__RunningSoftware__NameAssignment_2"
    // InternalModa.g:1550:1: rule__RunningSoftware__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RunningSoftware__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1554:1: ( ( ruleEString ) )
            // InternalModa.g:1555:2: ( ruleEString )
            {
            // InternalModa.g:1555:2: ( ruleEString )
            // InternalModa.g:1556:3: ruleEString
            {
             before(grammarAccess.getRunningSoftwareAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRunningSoftwareAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunningSoftware__NameAssignment_2"


    // $ANTLR start "rule__STS__NameAssignment_2"
    // InternalModa.g:1565:1: rule__STS__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__STS__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1569:1: ( ( ruleEString ) )
            // InternalModa.g:1570:2: ( ruleEString )
            {
            // InternalModa.g:1570:2: ( ruleEString )
            // InternalModa.g:1571:3: ruleEString
            {
             before(grammarAccess.getSTSAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSTSAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STS__NameAssignment_2"


    // $ANTLR start "rule__MODARelation__NameAssignment_2"
    // InternalModa.g:1580:1: rule__MODARelation__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__MODARelation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1584:1: ( ( ruleEString ) )
            // InternalModa.g:1585:2: ( ruleEString )
            {
            // InternalModa.g:1585:2: ( ruleEString )
            // InternalModa.g:1586:3: ruleEString
            {
             before(grammarAccess.getMODARelationAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMODARelationAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODARelation__NameAssignment_2"


    // $ANTLR start "rule__MODARelation__KindAssignment_3"
    // InternalModa.g:1595:1: rule__MODARelation__KindAssignment_3 : ( ruleRelationKind ) ;
    public final void rule__MODARelation__KindAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1599:1: ( ( ruleRelationKind ) )
            // InternalModa.g:1600:2: ( ruleRelationKind )
            {
            // InternalModa.g:1600:2: ( ruleRelationKind )
            // InternalModa.g:1601:3: ruleRelationKind
            {
             before(grammarAccess.getMODARelationAccess().getKindRelationKindEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationKind();

            state._fsp--;

             after(grammarAccess.getMODARelationAccess().getKindRelationKindEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODARelation__KindAssignment_3"


    // $ANTLR start "rule__MODARelation__SrcAssignment_4"
    // InternalModa.g:1610:1: rule__MODARelation__SrcAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__MODARelation__SrcAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1614:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:1615:2: ( ( ruleEString ) )
            {
            // InternalModa.g:1615:2: ( ( ruleEString ) )
            // InternalModa.g:1616:3: ( ruleEString )
            {
             before(grammarAccess.getMODARelationAccess().getSrcMODAElementCrossReference_4_0()); 
            // InternalModa.g:1617:3: ( ruleEString )
            // InternalModa.g:1618:4: ruleEString
            {
             before(grammarAccess.getMODARelationAccess().getSrcMODAElementEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMODARelationAccess().getSrcMODAElementEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getMODARelationAccess().getSrcMODAElementCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODARelation__SrcAssignment_4"


    // $ANTLR start "rule__MODARelation__TgtAssignment_6"
    // InternalModa.g:1629:1: rule__MODARelation__TgtAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__MODARelation__TgtAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1633:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:1634:2: ( ( ruleEString ) )
            {
            // InternalModa.g:1634:2: ( ( ruleEString ) )
            // InternalModa.g:1635:3: ( ruleEString )
            {
             before(grammarAccess.getMODARelationAccess().getTgtMODAElementCrossReference_6_0()); 
            // InternalModa.g:1636:3: ( ruleEString )
            // InternalModa.g:1637:4: ruleEString
            {
             before(grammarAccess.getMODARelationAccess().getTgtMODAElementEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMODARelationAccess().getTgtMODAElementEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getMODARelationAccess().getTgtMODAElementCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODARelation__TgtAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000007C0000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003FCC000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});

}