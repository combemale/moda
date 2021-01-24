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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'prescriptive'", "'predictive'", "'descriptive'", "'input'", "'output'", "'external'", "'measured'", "'generation'", "'enactment'", "'deployment'", "'measurement'", "'otherInterplay'", "'generalization'", "'preparation'", "'analysis'", "'MODAModel'", "'{'", "'}'", "'model'", "','", "'data'", "'software'", "'sts'", "'relation'", "'\"'", "'->'", "'tgt'"
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalModa.g:275:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:279:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalModa.g:280:2: ( RULE_STRING )
                    {
                    // InternalModa.g:280:2: ( RULE_STRING )
                    // InternalModa.g:281:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModa.g:286:2: ( RULE_ID )
                    {
                    // InternalModa.g:286:2: ( RULE_ID )
                    // InternalModa.g:287:3: RULE_ID
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
    // InternalModa.g:296:1: rule__ModelKind__Alternatives : ( ( ( 'prescriptive' ) ) | ( ( 'predictive' ) ) | ( ( 'descriptive' ) ) );
    public final void rule__ModelKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:300:1: ( ( ( 'prescriptive' ) ) | ( ( 'predictive' ) ) | ( ( 'descriptive' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalModa.g:301:2: ( ( 'prescriptive' ) )
                    {
                    // InternalModa.g:301:2: ( ( 'prescriptive' ) )
                    // InternalModa.g:302:3: ( 'prescriptive' )
                    {
                     before(grammarAccess.getModelKindAccess().getPrescriptiveEnumLiteralDeclaration_0()); 
                    // InternalModa.g:303:3: ( 'prescriptive' )
                    // InternalModa.g:303:4: 'prescriptive'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getModelKindAccess().getPrescriptiveEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModa.g:307:2: ( ( 'predictive' ) )
                    {
                    // InternalModa.g:307:2: ( ( 'predictive' ) )
                    // InternalModa.g:308:3: ( 'predictive' )
                    {
                     before(grammarAccess.getModelKindAccess().getPredictiveEnumLiteralDeclaration_1()); 
                    // InternalModa.g:309:3: ( 'predictive' )
                    // InternalModa.g:309:4: 'predictive'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getModelKindAccess().getPredictiveEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalModa.g:313:2: ( ( 'descriptive' ) )
                    {
                    // InternalModa.g:313:2: ( ( 'descriptive' ) )
                    // InternalModa.g:314:3: ( 'descriptive' )
                    {
                     before(grammarAccess.getModelKindAccess().getDescriptiveEnumLiteralDeclaration_2()); 
                    // InternalModa.g:315:3: ( 'descriptive' )
                    // InternalModa.g:315:4: 'descriptive'
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
    // InternalModa.g:323:1: rule__DataKind__Alternatives : ( ( ( 'input' ) ) | ( ( 'output' ) ) | ( ( 'external' ) ) | ( ( 'measured' ) ) );
    public final void rule__DataKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:327:1: ( ( ( 'input' ) ) | ( ( 'output' ) ) | ( ( 'external' ) ) | ( ( 'measured' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalModa.g:328:2: ( ( 'input' ) )
                    {
                    // InternalModa.g:328:2: ( ( 'input' ) )
                    // InternalModa.g:329:3: ( 'input' )
                    {
                     before(grammarAccess.getDataKindAccess().getInputEnumLiteralDeclaration_0()); 
                    // InternalModa.g:330:3: ( 'input' )
                    // InternalModa.g:330:4: 'input'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataKindAccess().getInputEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModa.g:334:2: ( ( 'output' ) )
                    {
                    // InternalModa.g:334:2: ( ( 'output' ) )
                    // InternalModa.g:335:3: ( 'output' )
                    {
                     before(grammarAccess.getDataKindAccess().getOutputEnumLiteralDeclaration_1()); 
                    // InternalModa.g:336:3: ( 'output' )
                    // InternalModa.g:336:4: 'output'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataKindAccess().getOutputEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalModa.g:340:2: ( ( 'external' ) )
                    {
                    // InternalModa.g:340:2: ( ( 'external' ) )
                    // InternalModa.g:341:3: ( 'external' )
                    {
                     before(grammarAccess.getDataKindAccess().getExternalEnumLiteralDeclaration_2()); 
                    // InternalModa.g:342:3: ( 'external' )
                    // InternalModa.g:342:4: 'external'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataKindAccess().getExternalEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalModa.g:346:2: ( ( 'measured' ) )
                    {
                    // InternalModa.g:346:2: ( ( 'measured' ) )
                    // InternalModa.g:347:3: ( 'measured' )
                    {
                     before(grammarAccess.getDataKindAccess().getMeasuredEnumLiteralDeclaration_3()); 
                    // InternalModa.g:348:3: ( 'measured' )
                    // InternalModa.g:348:4: 'measured'
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
    // InternalModa.g:356:1: rule__RelationKind__Alternatives : ( ( ( 'generation' ) ) | ( ( 'enactment' ) ) | ( ( 'deployment' ) ) | ( ( 'input' ) ) | ( ( 'output' ) ) | ( ( 'measurement' ) ) | ( ( 'otherInterplay' ) ) | ( ( 'generalization' ) ) | ( ( 'preparation' ) ) | ( ( 'analysis' ) ) );
    public final void rule__RelationKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:360:1: ( ( ( 'generation' ) ) | ( ( 'enactment' ) ) | ( ( 'deployment' ) ) | ( ( 'input' ) ) | ( ( 'output' ) ) | ( ( 'measurement' ) ) | ( ( 'otherInterplay' ) ) | ( ( 'generalization' ) ) | ( ( 'preparation' ) ) | ( ( 'analysis' ) ) )
            int alt4=10;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            case 21:
                {
                alt4=6;
                }
                break;
            case 22:
                {
                alt4=7;
                }
                break;
            case 23:
                {
                alt4=8;
                }
                break;
            case 24:
                {
                alt4=9;
                }
                break;
            case 25:
                {
                alt4=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalModa.g:361:2: ( ( 'generation' ) )
                    {
                    // InternalModa.g:361:2: ( ( 'generation' ) )
                    // InternalModa.g:362:3: ( 'generation' )
                    {
                     before(grammarAccess.getRelationKindAccess().getGenerationEnumLiteralDeclaration_0()); 
                    // InternalModa.g:363:3: ( 'generation' )
                    // InternalModa.g:363:4: 'generation'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationKindAccess().getGenerationEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModa.g:367:2: ( ( 'enactment' ) )
                    {
                    // InternalModa.g:367:2: ( ( 'enactment' ) )
                    // InternalModa.g:368:3: ( 'enactment' )
                    {
                     before(grammarAccess.getRelationKindAccess().getEnactmentEnumLiteralDeclaration_1()); 
                    // InternalModa.g:369:3: ( 'enactment' )
                    // InternalModa.g:369:4: 'enactment'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationKindAccess().getEnactmentEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalModa.g:373:2: ( ( 'deployment' ) )
                    {
                    // InternalModa.g:373:2: ( ( 'deployment' ) )
                    // InternalModa.g:374:3: ( 'deployment' )
                    {
                     before(grammarAccess.getRelationKindAccess().getDeploymentEnumLiteralDeclaration_2()); 
                    // InternalModa.g:375:3: ( 'deployment' )
                    // InternalModa.g:375:4: 'deployment'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationKindAccess().getDeploymentEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalModa.g:379:2: ( ( 'input' ) )
                    {
                    // InternalModa.g:379:2: ( ( 'input' ) )
                    // InternalModa.g:380:3: ( 'input' )
                    {
                     before(grammarAccess.getRelationKindAccess().getInputEnumLiteralDeclaration_3()); 
                    // InternalModa.g:381:3: ( 'input' )
                    // InternalModa.g:381:4: 'input'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationKindAccess().getInputEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalModa.g:385:2: ( ( 'output' ) )
                    {
                    // InternalModa.g:385:2: ( ( 'output' ) )
                    // InternalModa.g:386:3: ( 'output' )
                    {
                     before(grammarAccess.getRelationKindAccess().getOutputEnumLiteralDeclaration_4()); 
                    // InternalModa.g:387:3: ( 'output' )
                    // InternalModa.g:387:4: 'output'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationKindAccess().getOutputEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalModa.g:391:2: ( ( 'measurement' ) )
                    {
                    // InternalModa.g:391:2: ( ( 'measurement' ) )
                    // InternalModa.g:392:3: ( 'measurement' )
                    {
                     before(grammarAccess.getRelationKindAccess().getMeasurementEnumLiteralDeclaration_5()); 
                    // InternalModa.g:393:3: ( 'measurement' )
                    // InternalModa.g:393:4: 'measurement'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationKindAccess().getMeasurementEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalModa.g:397:2: ( ( 'otherInterplay' ) )
                    {
                    // InternalModa.g:397:2: ( ( 'otherInterplay' ) )
                    // InternalModa.g:398:3: ( 'otherInterplay' )
                    {
                     before(grammarAccess.getRelationKindAccess().getOtherInterplayEnumLiteralDeclaration_6()); 
                    // InternalModa.g:399:3: ( 'otherInterplay' )
                    // InternalModa.g:399:4: 'otherInterplay'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationKindAccess().getOtherInterplayEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalModa.g:403:2: ( ( 'generalization' ) )
                    {
                    // InternalModa.g:403:2: ( ( 'generalization' ) )
                    // InternalModa.g:404:3: ( 'generalization' )
                    {
                     before(grammarAccess.getRelationKindAccess().getGeneralizationEnumLiteralDeclaration_7()); 
                    // InternalModa.g:405:3: ( 'generalization' )
                    // InternalModa.g:405:4: 'generalization'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationKindAccess().getGeneralizationEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalModa.g:409:2: ( ( 'preparation' ) )
                    {
                    // InternalModa.g:409:2: ( ( 'preparation' ) )
                    // InternalModa.g:410:3: ( 'preparation' )
                    {
                     before(grammarAccess.getRelationKindAccess().getPreparationEnumLiteralDeclaration_8()); 
                    // InternalModa.g:411:3: ( 'preparation' )
                    // InternalModa.g:411:4: 'preparation'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationKindAccess().getPreparationEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalModa.g:415:2: ( ( 'analysis' ) )
                    {
                    // InternalModa.g:415:2: ( ( 'analysis' ) )
                    // InternalModa.g:416:3: ( 'analysis' )
                    {
                     before(grammarAccess.getRelationKindAccess().getAnalysisEnumLiteralDeclaration_9()); 
                    // InternalModa.g:417:3: ( 'analysis' )
                    // InternalModa.g:417:4: 'analysis'
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
    // InternalModa.g:425:1: rule__MODAModel__Group__0 : rule__MODAModel__Group__0__Impl rule__MODAModel__Group__1 ;
    public final void rule__MODAModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:429:1: ( rule__MODAModel__Group__0__Impl rule__MODAModel__Group__1 )
            // InternalModa.g:430:2: rule__MODAModel__Group__0__Impl rule__MODAModel__Group__1
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
    // InternalModa.g:437:1: rule__MODAModel__Group__0__Impl : ( () ) ;
    public final void rule__MODAModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:441:1: ( ( () ) )
            // InternalModa.g:442:1: ( () )
            {
            // InternalModa.g:442:1: ( () )
            // InternalModa.g:443:2: ()
            {
             before(grammarAccess.getMODAModelAccess().getMODAModelAction_0()); 
            // InternalModa.g:444:2: ()
            // InternalModa.g:444:3: 
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
    // InternalModa.g:452:1: rule__MODAModel__Group__1 : rule__MODAModel__Group__1__Impl rule__MODAModel__Group__2 ;
    public final void rule__MODAModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:456:1: ( rule__MODAModel__Group__1__Impl rule__MODAModel__Group__2 )
            // InternalModa.g:457:2: rule__MODAModel__Group__1__Impl rule__MODAModel__Group__2
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
    // InternalModa.g:464:1: rule__MODAModel__Group__1__Impl : ( 'MODAModel' ) ;
    public final void rule__MODAModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:468:1: ( ( 'MODAModel' ) )
            // InternalModa.g:469:1: ( 'MODAModel' )
            {
            // InternalModa.g:469:1: ( 'MODAModel' )
            // InternalModa.g:470:2: 'MODAModel'
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
    // InternalModa.g:479:1: rule__MODAModel__Group__2 : rule__MODAModel__Group__2__Impl rule__MODAModel__Group__3 ;
    public final void rule__MODAModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:483:1: ( rule__MODAModel__Group__2__Impl rule__MODAModel__Group__3 )
            // InternalModa.g:484:2: rule__MODAModel__Group__2__Impl rule__MODAModel__Group__3
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
    // InternalModa.g:491:1: rule__MODAModel__Group__2__Impl : ( ( rule__MODAModel__NameAssignment_2 ) ) ;
    public final void rule__MODAModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:495:1: ( ( ( rule__MODAModel__NameAssignment_2 ) ) )
            // InternalModa.g:496:1: ( ( rule__MODAModel__NameAssignment_2 ) )
            {
            // InternalModa.g:496:1: ( ( rule__MODAModel__NameAssignment_2 ) )
            // InternalModa.g:497:2: ( rule__MODAModel__NameAssignment_2 )
            {
             before(grammarAccess.getMODAModelAccess().getNameAssignment_2()); 
            // InternalModa.g:498:2: ( rule__MODAModel__NameAssignment_2 )
            // InternalModa.g:498:3: rule__MODAModel__NameAssignment_2
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
    // InternalModa.g:506:1: rule__MODAModel__Group__3 : rule__MODAModel__Group__3__Impl rule__MODAModel__Group__4 ;
    public final void rule__MODAModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:510:1: ( rule__MODAModel__Group__3__Impl rule__MODAModel__Group__4 )
            // InternalModa.g:511:2: rule__MODAModel__Group__3__Impl rule__MODAModel__Group__4
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
    // InternalModa.g:518:1: rule__MODAModel__Group__3__Impl : ( '{' ) ;
    public final void rule__MODAModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:522:1: ( ( '{' ) )
            // InternalModa.g:523:1: ( '{' )
            {
            // InternalModa.g:523:1: ( '{' )
            // InternalModa.g:524:2: '{'
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
    // InternalModa.g:533:1: rule__MODAModel__Group__4 : rule__MODAModel__Group__4__Impl rule__MODAModel__Group__5 ;
    public final void rule__MODAModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:537:1: ( rule__MODAModel__Group__4__Impl rule__MODAModel__Group__5 )
            // InternalModa.g:538:2: rule__MODAModel__Group__4__Impl rule__MODAModel__Group__5
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
    // InternalModa.g:545:1: rule__MODAModel__Group__4__Impl : ( ( rule__MODAModel__Group_4__0 )? ) ;
    public final void rule__MODAModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:549:1: ( ( ( rule__MODAModel__Group_4__0 )? ) )
            // InternalModa.g:550:1: ( ( rule__MODAModel__Group_4__0 )? )
            {
            // InternalModa.g:550:1: ( ( rule__MODAModel__Group_4__0 )? )
            // InternalModa.g:551:2: ( rule__MODAModel__Group_4__0 )?
            {
             before(grammarAccess.getMODAModelAccess().getGroup_4()); 
            // InternalModa.g:552:2: ( rule__MODAModel__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==29) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalModa.g:552:3: rule__MODAModel__Group_4__0
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
    // InternalModa.g:560:1: rule__MODAModel__Group__5 : rule__MODAModel__Group__5__Impl rule__MODAModel__Group__6 ;
    public final void rule__MODAModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:564:1: ( rule__MODAModel__Group__5__Impl rule__MODAModel__Group__6 )
            // InternalModa.g:565:2: rule__MODAModel__Group__5__Impl rule__MODAModel__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__MODAModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODAModel__Group__6();

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
    // InternalModa.g:572:1: rule__MODAModel__Group__5__Impl : ( ( rule__MODAModel__Group_5__0 )? ) ;
    public final void rule__MODAModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:576:1: ( ( ( rule__MODAModel__Group_5__0 )? ) )
            // InternalModa.g:577:1: ( ( rule__MODAModel__Group_5__0 )? )
            {
            // InternalModa.g:577:1: ( ( rule__MODAModel__Group_5__0 )? )
            // InternalModa.g:578:2: ( rule__MODAModel__Group_5__0 )?
            {
             before(grammarAccess.getMODAModelAccess().getGroup_5()); 
            // InternalModa.g:579:2: ( rule__MODAModel__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==31) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalModa.g:579:3: rule__MODAModel__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MODAModel__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMODAModelAccess().getGroup_5()); 

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


    // $ANTLR start "rule__MODAModel__Group__6"
    // InternalModa.g:587:1: rule__MODAModel__Group__6 : rule__MODAModel__Group__6__Impl rule__MODAModel__Group__7 ;
    public final void rule__MODAModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:591:1: ( rule__MODAModel__Group__6__Impl rule__MODAModel__Group__7 )
            // InternalModa.g:592:2: rule__MODAModel__Group__6__Impl rule__MODAModel__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__MODAModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODAModel__Group__7();

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
    // $ANTLR end "rule__MODAModel__Group__6"


    // $ANTLR start "rule__MODAModel__Group__6__Impl"
    // InternalModa.g:599:1: rule__MODAModel__Group__6__Impl : ( ( rule__MODAModel__Group_6__0 )? ) ;
    public final void rule__MODAModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:603:1: ( ( ( rule__MODAModel__Group_6__0 )? ) )
            // InternalModa.g:604:1: ( ( rule__MODAModel__Group_6__0 )? )
            {
            // InternalModa.g:604:1: ( ( rule__MODAModel__Group_6__0 )? )
            // InternalModa.g:605:2: ( rule__MODAModel__Group_6__0 )?
            {
             before(grammarAccess.getMODAModelAccess().getGroup_6()); 
            // InternalModa.g:606:2: ( rule__MODAModel__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==32) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalModa.g:606:3: rule__MODAModel__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MODAModel__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMODAModelAccess().getGroup_6()); 

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
    // $ANTLR end "rule__MODAModel__Group__6__Impl"


    // $ANTLR start "rule__MODAModel__Group__7"
    // InternalModa.g:614:1: rule__MODAModel__Group__7 : rule__MODAModel__Group__7__Impl rule__MODAModel__Group__8 ;
    public final void rule__MODAModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:618:1: ( rule__MODAModel__Group__7__Impl rule__MODAModel__Group__8 )
            // InternalModa.g:619:2: rule__MODAModel__Group__7__Impl rule__MODAModel__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__MODAModel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODAModel__Group__8();

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
    // $ANTLR end "rule__MODAModel__Group__7"


    // $ANTLR start "rule__MODAModel__Group__7__Impl"
    // InternalModa.g:626:1: rule__MODAModel__Group__7__Impl : ( ( rule__MODAModel__Group_7__0 )? ) ;
    public final void rule__MODAModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:630:1: ( ( ( rule__MODAModel__Group_7__0 )? ) )
            // InternalModa.g:631:1: ( ( rule__MODAModel__Group_7__0 )? )
            {
            // InternalModa.g:631:1: ( ( rule__MODAModel__Group_7__0 )? )
            // InternalModa.g:632:2: ( rule__MODAModel__Group_7__0 )?
            {
             before(grammarAccess.getMODAModelAccess().getGroup_7()); 
            // InternalModa.g:633:2: ( rule__MODAModel__Group_7__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==33) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalModa.g:633:3: rule__MODAModel__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MODAModel__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMODAModelAccess().getGroup_7()); 

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
    // $ANTLR end "rule__MODAModel__Group__7__Impl"


    // $ANTLR start "rule__MODAModel__Group__8"
    // InternalModa.g:641:1: rule__MODAModel__Group__8 : rule__MODAModel__Group__8__Impl rule__MODAModel__Group__9 ;
    public final void rule__MODAModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:645:1: ( rule__MODAModel__Group__8__Impl rule__MODAModel__Group__9 )
            // InternalModa.g:646:2: rule__MODAModel__Group__8__Impl rule__MODAModel__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__MODAModel__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODAModel__Group__9();

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
    // $ANTLR end "rule__MODAModel__Group__8"


    // $ANTLR start "rule__MODAModel__Group__8__Impl"
    // InternalModa.g:653:1: rule__MODAModel__Group__8__Impl : ( ( rule__MODAModel__Group_8__0 )? ) ;
    public final void rule__MODAModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:657:1: ( ( ( rule__MODAModel__Group_8__0 )? ) )
            // InternalModa.g:658:1: ( ( rule__MODAModel__Group_8__0 )? )
            {
            // InternalModa.g:658:1: ( ( rule__MODAModel__Group_8__0 )? )
            // InternalModa.g:659:2: ( rule__MODAModel__Group_8__0 )?
            {
             before(grammarAccess.getMODAModelAccess().getGroup_8()); 
            // InternalModa.g:660:2: ( rule__MODAModel__Group_8__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==34) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalModa.g:660:3: rule__MODAModel__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MODAModel__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMODAModelAccess().getGroup_8()); 

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
    // $ANTLR end "rule__MODAModel__Group__8__Impl"


    // $ANTLR start "rule__MODAModel__Group__9"
    // InternalModa.g:668:1: rule__MODAModel__Group__9 : rule__MODAModel__Group__9__Impl ;
    public final void rule__MODAModel__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:672:1: ( rule__MODAModel__Group__9__Impl )
            // InternalModa.g:673:2: rule__MODAModel__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MODAModel__Group__9__Impl();

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
    // $ANTLR end "rule__MODAModel__Group__9"


    // $ANTLR start "rule__MODAModel__Group__9__Impl"
    // InternalModa.g:679:1: rule__MODAModel__Group__9__Impl : ( '}' ) ;
    public final void rule__MODAModel__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:683:1: ( ( '}' ) )
            // InternalModa.g:684:1: ( '}' )
            {
            // InternalModa.g:684:1: ( '}' )
            // InternalModa.g:685:2: '}'
            {
             before(grammarAccess.getMODAModelAccess().getRightCurlyBracketKeyword_9()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMODAModelAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__MODAModel__Group__9__Impl"


    // $ANTLR start "rule__MODAModel__Group_4__0"
    // InternalModa.g:695:1: rule__MODAModel__Group_4__0 : rule__MODAModel__Group_4__0__Impl rule__MODAModel__Group_4__1 ;
    public final void rule__MODAModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:699:1: ( rule__MODAModel__Group_4__0__Impl rule__MODAModel__Group_4__1 )
            // InternalModa.g:700:2: rule__MODAModel__Group_4__0__Impl rule__MODAModel__Group_4__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalModa.g:707:1: rule__MODAModel__Group_4__0__Impl : ( 'model' ) ;
    public final void rule__MODAModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:711:1: ( ( 'model' ) )
            // InternalModa.g:712:1: ( 'model' )
            {
            // InternalModa.g:712:1: ( 'model' )
            // InternalModa.g:713:2: 'model'
            {
             before(grammarAccess.getMODAModelAccess().getModelKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMODAModelAccess().getModelKeyword_4_0()); 

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
    // InternalModa.g:722:1: rule__MODAModel__Group_4__1 : rule__MODAModel__Group_4__1__Impl rule__MODAModel__Group_4__2 ;
    public final void rule__MODAModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:726:1: ( rule__MODAModel__Group_4__1__Impl rule__MODAModel__Group_4__2 )
            // InternalModa.g:727:2: rule__MODAModel__Group_4__1__Impl rule__MODAModel__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__MODAModel__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODAModel__Group_4__2();

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
    // InternalModa.g:734:1: rule__MODAModel__Group_4__1__Impl : ( '{' ) ;
    public final void rule__MODAModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:738:1: ( ( '{' ) )
            // InternalModa.g:739:1: ( '{' )
            {
            // InternalModa.g:739:1: ( '{' )
            // InternalModa.g:740:2: '{'
            {
             before(grammarAccess.getMODAModelAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMODAModelAccess().getLeftCurlyBracketKeyword_4_1()); 

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


    // $ANTLR start "rule__MODAModel__Group_4__2"
    // InternalModa.g:749:1: rule__MODAModel__Group_4__2 : rule__MODAModel__Group_4__2__Impl rule__MODAModel__Group_4__3 ;
    public final void rule__MODAModel__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:753:1: ( rule__MODAModel__Group_4__2__Impl rule__MODAModel__Group_4__3 )
            // InternalModa.g:754:2: rule__MODAModel__Group_4__2__Impl rule__MODAModel__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__MODAModel__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODAModel__Group_4__3();

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
    // $ANTLR end "rule__MODAModel__Group_4__2"


    // $ANTLR start "rule__MODAModel__Group_4__2__Impl"
    // InternalModa.g:761:1: rule__MODAModel__Group_4__2__Impl : ( ( rule__MODAModel__ModelAssignment_4_2 ) ) ;
    public final void rule__MODAModel__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:765:1: ( ( ( rule__MODAModel__ModelAssignment_4_2 ) ) )
            // InternalModa.g:766:1: ( ( rule__MODAModel__ModelAssignment_4_2 ) )
            {
            // InternalModa.g:766:1: ( ( rule__MODAModel__ModelAssignment_4_2 ) )
            // InternalModa.g:767:2: ( rule__MODAModel__ModelAssignment_4_2 )
            {
             before(grammarAccess.getMODAModelAccess().getModelAssignment_4_2()); 
            // InternalModa.g:768:2: ( rule__MODAModel__ModelAssignment_4_2 )
            // InternalModa.g:768:3: rule__MODAModel__ModelAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__MODAModel__ModelAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getMODAModelAccess().getModelAssignment_4_2()); 

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
    // $ANTLR end "rule__MODAModel__Group_4__2__Impl"


    // $ANTLR start "rule__MODAModel__Group_4__3"
    // InternalModa.g:776:1: rule__MODAModel__Group_4__3 : rule__MODAModel__Group_4__3__Impl rule__MODAModel__Group_4__4 ;
    public final void rule__MODAModel__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:780:1: ( rule__MODAModel__Group_4__3__Impl rule__MODAModel__Group_4__4 )
            // InternalModa.g:781:2: rule__MODAModel__Group_4__3__Impl rule__MODAModel__Group_4__4
            {
            pushFollow(FOLLOW_7);
            rule__MODAModel__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODAModel__Group_4__4();

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
    // $ANTLR end "rule__MODAModel__Group_4__3"


    // $ANTLR start "rule__MODAModel__Group_4__3__Impl"
    // InternalModa.g:788:1: rule__MODAModel__Group_4__3__Impl : ( ( rule__MODAModel__Group_4_3__0 )* ) ;
    public final void rule__MODAModel__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:792:1: ( ( ( rule__MODAModel__Group_4_3__0 )* ) )
            // InternalModa.g:793:1: ( ( rule__MODAModel__Group_4_3__0 )* )
            {
            // InternalModa.g:793:1: ( ( rule__MODAModel__Group_4_3__0 )* )
            // InternalModa.g:794:2: ( rule__MODAModel__Group_4_3__0 )*
            {
             before(grammarAccess.getMODAModelAccess().getGroup_4_3()); 
            // InternalModa.g:795:2: ( rule__MODAModel__Group_4_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalModa.g:795:3: rule__MODAModel__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__MODAModel__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMODAModelAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__MODAModel__Group_4__3__Impl"


    // $ANTLR start "rule__MODAModel__Group_4__4"
    // InternalModa.g:803:1: rule__MODAModel__Group_4__4 : rule__MODAModel__Group_4__4__Impl ;
    public final void rule__MODAModel__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:807:1: ( rule__MODAModel__Group_4__4__Impl )
            // InternalModa.g:808:2: rule__MODAModel__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MODAModel__Group_4__4__Impl();

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
    // $ANTLR end "rule__MODAModel__Group_4__4"


    // $ANTLR start "rule__MODAModel__Group_4__4__Impl"
    // InternalModa.g:814:1: rule__MODAModel__Group_4__4__Impl : ( '}' ) ;
    public final void rule__MODAModel__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:818:1: ( ( '}' ) )
            // InternalModa.g:819:1: ( '}' )
            {
            // InternalModa.g:819:1: ( '}' )
            // InternalModa.g:820:2: '}'
            {
             before(grammarAccess.getMODAModelAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMODAModelAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__MODAModel__Group_4__4__Impl"


    // $ANTLR start "rule__MODAModel__Group_4_3__0"
    // InternalModa.g:830:1: rule__MODAModel__Group_4_3__0 : rule__MODAModel__Group_4_3__0__Impl rule__MODAModel__Group_4_3__1 ;
    public final void rule__MODAModel__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:834:1: ( rule__MODAModel__Group_4_3__0__Impl rule__MODAModel__Group_4_3__1 )
            // InternalModa.g:835:2: rule__MODAModel__Group_4_3__0__Impl rule__MODAModel__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__MODAModel__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODAModel__Group_4_3__1();

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
    // $ANTLR end "rule__MODAModel__Group_4_3__0"


    // $ANTLR start "rule__MODAModel__Group_4_3__0__Impl"
    // InternalModa.g:842:1: rule__MODAModel__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__MODAModel__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:846:1: ( ( ',' ) )
            // InternalModa.g:847:1: ( ',' )
            {
            // InternalModa.g:847:1: ( ',' )
            // InternalModa.g:848:2: ','
            {
             before(grammarAccess.getMODAModelAccess().getCommaKeyword_4_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMODAModelAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__MODAModel__Group_4_3__0__Impl"


    // $ANTLR start "rule__MODAModel__Group_4_3__1"
    // InternalModa.g:857:1: rule__MODAModel__Group_4_3__1 : rule__MODAModel__Group_4_3__1__Impl ;
    public final void rule__MODAModel__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:861:1: ( rule__MODAModel__Group_4_3__1__Impl )
            // InternalModa.g:862:2: rule__MODAModel__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MODAModel__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__MODAModel__Group_4_3__1"


    // $ANTLR start "rule__MODAModel__Group_4_3__1__Impl"
    // InternalModa.g:868:1: rule__MODAModel__Group_4_3__1__Impl : ( ( rule__MODAModel__ModelAssignment_4_3_1 ) ) ;
    public final void rule__MODAModel__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:872:1: ( ( ( rule__MODAModel__ModelAssignment_4_3_1 ) ) )
            // InternalModa.g:873:1: ( ( rule__MODAModel__ModelAssignment_4_3_1 ) )
            {
            // InternalModa.g:873:1: ( ( rule__MODAModel__ModelAssignment_4_3_1 ) )
            // InternalModa.g:874:2: ( rule__MODAModel__ModelAssignment_4_3_1 )
            {
             before(grammarAccess.getMODAModelAccess().getModelAssignment_4_3_1()); 
            // InternalModa.g:875:2: ( rule__MODAModel__ModelAssignment_4_3_1 )
            // InternalModa.g:875:3: rule__MODAModel__ModelAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MODAModel__ModelAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMODAModelAccess().getModelAssignment_4_3_1()); 

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
    // $ANTLR end "rule__MODAModel__Group_4_3__1__Impl"


    // $ANTLR start "rule__MODAModel__Group_5__0"
    // InternalModa.g:884:1: rule__MODAModel__Group_5__0 : rule__MODAModel__Group_5__0__Impl rule__MODAModel__Group_5__1 ;
    public final void rule__MODAModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:888:1: ( rule__MODAModel__Group_5__0__Impl rule__MODAModel__Group_5__1 )
            // InternalModa.g:889:2: rule__MODAModel__Group_5__0__Impl rule__MODAModel__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__MODAModel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODAModel__Group_5__1();

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
    // $ANTLR end "rule__MODAModel__Group_5__0"


    // $ANTLR start "rule__MODAModel__Group_5__0__Impl"
    // InternalModa.g:896:1: rule__MODAModel__Group_5__0__Impl : ( 'data' ) ;
    public final void rule__MODAModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:900:1: ( ( 'data' ) )
            // InternalModa.g:901:1: ( 'data' )
            {
            // InternalModa.g:901:1: ( 'data' )
            // InternalModa.g:902:2: 'data'
            {
             before(grammarAccess.getMODAModelAccess().getDataKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMODAModelAccess().getDataKeyword_5_0()); 

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
    // $ANTLR end "rule__MODAModel__Group_5__0__Impl"


    // $ANTLR start "rule__MODAModel__Group_5__1"
    // InternalModa.g:911:1: rule__MODAModel__Group_5__1 : rule__MODAModel__Group_5__1__Impl rule__MODAModel__Group_5__2 ;
    public final void rule__MODAModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:915:1: ( rule__MODAModel__Group_5__1__Impl rule__MODAModel__Group_5__2 )
            // InternalModa.g:916:2: rule__MODAModel__Group_5__1__Impl rule__MODAModel__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__MODAModel__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODAModel__Group_5__2();

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
    // $ANTLR end "rule__MODAModel__Group_5__1"


    // $ANTLR start "rule__MODAModel__Group_5__1__Impl"
    // InternalModa.g:923:1: rule__MODAModel__Group_5__1__Impl : ( '{' ) ;
    public final void rule__MODAModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:927:1: ( ( '{' ) )
            // InternalModa.g:928:1: ( '{' )
            {
            // InternalModa.g:928:1: ( '{' )
            // InternalModa.g:929:2: '{'
            {
             before(grammarAccess.getMODAModelAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMODAModelAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__MODAModel__Group_5__1__Impl"


    // $ANTLR start "rule__MODAModel__Group_5__2"
    // InternalModa.g:938:1: rule__MODAModel__Group_5__2 : rule__MODAModel__Group_5__2__Impl rule__MODAModel__Group_5__3 ;
    public final void rule__MODAModel__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:942:1: ( rule__MODAModel__Group_5__2__Impl rule__MODAModel__Group_5__3 )
            // InternalModa.g:943:2: rule__MODAModel__Group_5__2__Impl rule__MODAModel__Group_5__3
            {
            pushFollow(FOLLOW_7);
            rule__MODAModel__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODAModel__Group_5__3();

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
    // $ANTLR end "rule__MODAModel__Group_5__2"


    // $ANTLR start "rule__MODAModel__Group_5__2__Impl"
    // InternalModa.g:950:1: rule__MODAModel__Group_5__2__Impl : ( ( rule__MODAModel__DataAssignment_5_2 ) ) ;
    public final void rule__MODAModel__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:954:1: ( ( ( rule__MODAModel__DataAssignment_5_2 ) ) )
            // InternalModa.g:955:1: ( ( rule__MODAModel__DataAssignment_5_2 ) )
            {
            // InternalModa.g:955:1: ( ( rule__MODAModel__DataAssignment_5_2 ) )
            // InternalModa.g:956:2: ( rule__MODAModel__DataAssignment_5_2 )
            {
             before(grammarAccess.getMODAModelAccess().getDataAssignment_5_2()); 
            // InternalModa.g:957:2: ( rule__MODAModel__DataAssignment_5_2 )
            // InternalModa.g:957:3: rule__MODAModel__DataAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__MODAModel__DataAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getMODAModelAccess().getDataAssignment_5_2()); 

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
    // $ANTLR end "rule__MODAModel__Group_5__2__Impl"


    // $ANTLR start "rule__MODAModel__Group_5__3"
    // InternalModa.g:965:1: rule__MODAModel__Group_5__3 : rule__MODAModel__Group_5__3__Impl rule__MODAModel__Group_5__4 ;
    public final void rule__MODAModel__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:969:1: ( rule__MODAModel__Group_5__3__Impl rule__MODAModel__Group_5__4 )
            // InternalModa.g:970:2: rule__MODAModel__Group_5__3__Impl rule__MODAModel__Group_5__4
            {
            pushFollow(FOLLOW_7);
            rule__MODAModel__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODAModel__Group_5__4();

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
    // $ANTLR end "rule__MODAModel__Group_5__3"


    // $ANTLR start "rule__MODAModel__Group_5__3__Impl"
    // InternalModa.g:977:1: rule__MODAModel__Group_5__3__Impl : ( ( rule__MODAModel__Group_5_3__0 )* ) ;
    public final void rule__MODAModel__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:981:1: ( ( ( rule__MODAModel__Group_5_3__0 )* ) )
            // InternalModa.g:982:1: ( ( rule__MODAModel__Group_5_3__0 )* )
            {
            // InternalModa.g:982:1: ( ( rule__MODAModel__Group_5_3__0 )* )
            // InternalModa.g:983:2: ( rule__MODAModel__Group_5_3__0 )*
            {
             before(grammarAccess.getMODAModelAccess().getGroup_5_3()); 
            // InternalModa.g:984:2: ( rule__MODAModel__Group_5_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalModa.g:984:3: rule__MODAModel__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__MODAModel__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMODAModelAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__MODAModel__Group_5__3__Impl"


    // $ANTLR start "rule__MODAModel__Group_5__4"
    // InternalModa.g:992:1: rule__MODAModel__Group_5__4 : rule__MODAModel__Group_5__4__Impl ;
    public final void rule__MODAModel__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:996:1: ( rule__MODAModel__Group_5__4__Impl )
            // InternalModa.g:997:2: rule__MODAModel__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MODAModel__Group_5__4__Impl();

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
    // $ANTLR end "rule__MODAModel__Group_5__4"


    // $ANTLR start "rule__MODAModel__Group_5__4__Impl"
    // InternalModa.g:1003:1: rule__MODAModel__Group_5__4__Impl : ( '}' ) ;
    public final void rule__MODAModel__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1007:1: ( ( '}' ) )
            // InternalModa.g:1008:1: ( '}' )
            {
            // InternalModa.g:1008:1: ( '}' )
            // InternalModa.g:1009:2: '}'
            {
             before(grammarAccess.getMODAModelAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMODAModelAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__MODAModel__Group_5__4__Impl"


    // $ANTLR start "rule__MODAModel__Group_5_3__0"
    // InternalModa.g:1019:1: rule__MODAModel__Group_5_3__0 : rule__MODAModel__Group_5_3__0__Impl rule__MODAModel__Group_5_3__1 ;
    public final void rule__MODAModel__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1023:1: ( rule__MODAModel__Group_5_3__0__Impl rule__MODAModel__Group_5_3__1 )
            // InternalModa.g:1024:2: rule__MODAModel__Group_5_3__0__Impl rule__MODAModel__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__MODAModel__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODAModel__Group_5_3__1();

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
    // $ANTLR end "rule__MODAModel__Group_5_3__0"


    // $ANTLR start "rule__MODAModel__Group_5_3__0__Impl"
    // InternalModa.g:1031:1: rule__MODAModel__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__MODAModel__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1035:1: ( ( ',' ) )
            // InternalModa.g:1036:1: ( ',' )
            {
            // InternalModa.g:1036:1: ( ',' )
            // InternalModa.g:1037:2: ','
            {
             before(grammarAccess.getMODAModelAccess().getCommaKeyword_5_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMODAModelAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__MODAModel__Group_5_3__0__Impl"


    // $ANTLR start "rule__MODAModel__Group_5_3__1"
    // InternalModa.g:1046:1: rule__MODAModel__Group_5_3__1 : rule__MODAModel__Group_5_3__1__Impl ;
    public final void rule__MODAModel__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1050:1: ( rule__MODAModel__Group_5_3__1__Impl )
            // InternalModa.g:1051:2: rule__MODAModel__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MODAModel__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__MODAModel__Group_5_3__1"


    // $ANTLR start "rule__MODAModel__Group_5_3__1__Impl"
    // InternalModa.g:1057:1: rule__MODAModel__Group_5_3__1__Impl : ( ( rule__MODAModel__DataAssignment_5_3_1 ) ) ;
    public final void rule__MODAModel__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1061:1: ( ( ( rule__MODAModel__DataAssignment_5_3_1 ) ) )
            // InternalModa.g:1062:1: ( ( rule__MODAModel__DataAssignment_5_3_1 ) )
            {
            // InternalModa.g:1062:1: ( ( rule__MODAModel__DataAssignment_5_3_1 ) )
            // InternalModa.g:1063:2: ( rule__MODAModel__DataAssignment_5_3_1 )
            {
             before(grammarAccess.getMODAModelAccess().getDataAssignment_5_3_1()); 
            // InternalModa.g:1064:2: ( rule__MODAModel__DataAssignment_5_3_1 )
            // InternalModa.g:1064:3: rule__MODAModel__DataAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MODAModel__DataAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMODAModelAccess().getDataAssignment_5_3_1()); 

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
    // $ANTLR end "rule__MODAModel__Group_5_3__1__Impl"


    // $ANTLR start "rule__MODAModel__Group_6__0"
    // InternalModa.g:1073:1: rule__MODAModel__Group_6__0 : rule__MODAModel__Group_6__0__Impl rule__MODAModel__Group_6__1 ;
    public final void rule__MODAModel__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1077:1: ( rule__MODAModel__Group_6__0__Impl rule__MODAModel__Group_6__1 )
            // InternalModa.g:1078:2: rule__MODAModel__Group_6__0__Impl rule__MODAModel__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__MODAModel__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODAModel__Group_6__1();

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
    // $ANTLR end "rule__MODAModel__Group_6__0"


    // $ANTLR start "rule__MODAModel__Group_6__0__Impl"
    // InternalModa.g:1085:1: rule__MODAModel__Group_6__0__Impl : ( 'software' ) ;
    public final void rule__MODAModel__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1089:1: ( ( 'software' ) )
            // InternalModa.g:1090:1: ( 'software' )
            {
            // InternalModa.g:1090:1: ( 'software' )
            // InternalModa.g:1091:2: 'software'
            {
             before(grammarAccess.getMODAModelAccess().getSoftwareKeyword_6_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMODAModelAccess().getSoftwareKeyword_6_0()); 

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
    // $ANTLR end "rule__MODAModel__Group_6__0__Impl"


    // $ANTLR start "rule__MODAModel__Group_6__1"
    // InternalModa.g:1100:1: rule__MODAModel__Group_6__1 : rule__MODAModel__Group_6__1__Impl ;
    public final void rule__MODAModel__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1104:1: ( rule__MODAModel__Group_6__1__Impl )
            // InternalModa.g:1105:2: rule__MODAModel__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MODAModel__Group_6__1__Impl();

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
    // $ANTLR end "rule__MODAModel__Group_6__1"


    // $ANTLR start "rule__MODAModel__Group_6__1__Impl"
    // InternalModa.g:1111:1: rule__MODAModel__Group_6__1__Impl : ( ( rule__MODAModel__SoftwareAssignment_6_1 ) ) ;
    public final void rule__MODAModel__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1115:1: ( ( ( rule__MODAModel__SoftwareAssignment_6_1 ) ) )
            // InternalModa.g:1116:1: ( ( rule__MODAModel__SoftwareAssignment_6_1 ) )
            {
            // InternalModa.g:1116:1: ( ( rule__MODAModel__SoftwareAssignment_6_1 ) )
            // InternalModa.g:1117:2: ( rule__MODAModel__SoftwareAssignment_6_1 )
            {
             before(grammarAccess.getMODAModelAccess().getSoftwareAssignment_6_1()); 
            // InternalModa.g:1118:2: ( rule__MODAModel__SoftwareAssignment_6_1 )
            // InternalModa.g:1118:3: rule__MODAModel__SoftwareAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__MODAModel__SoftwareAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMODAModelAccess().getSoftwareAssignment_6_1()); 

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
    // $ANTLR end "rule__MODAModel__Group_6__1__Impl"


    // $ANTLR start "rule__MODAModel__Group_7__0"
    // InternalModa.g:1127:1: rule__MODAModel__Group_7__0 : rule__MODAModel__Group_7__0__Impl rule__MODAModel__Group_7__1 ;
    public final void rule__MODAModel__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1131:1: ( rule__MODAModel__Group_7__0__Impl rule__MODAModel__Group_7__1 )
            // InternalModa.g:1132:2: rule__MODAModel__Group_7__0__Impl rule__MODAModel__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__MODAModel__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODAModel__Group_7__1();

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
    // $ANTLR end "rule__MODAModel__Group_7__0"


    // $ANTLR start "rule__MODAModel__Group_7__0__Impl"
    // InternalModa.g:1139:1: rule__MODAModel__Group_7__0__Impl : ( 'sts' ) ;
    public final void rule__MODAModel__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1143:1: ( ( 'sts' ) )
            // InternalModa.g:1144:1: ( 'sts' )
            {
            // InternalModa.g:1144:1: ( 'sts' )
            // InternalModa.g:1145:2: 'sts'
            {
             before(grammarAccess.getMODAModelAccess().getStsKeyword_7_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMODAModelAccess().getStsKeyword_7_0()); 

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
    // $ANTLR end "rule__MODAModel__Group_7__0__Impl"


    // $ANTLR start "rule__MODAModel__Group_7__1"
    // InternalModa.g:1154:1: rule__MODAModel__Group_7__1 : rule__MODAModel__Group_7__1__Impl ;
    public final void rule__MODAModel__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1158:1: ( rule__MODAModel__Group_7__1__Impl )
            // InternalModa.g:1159:2: rule__MODAModel__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MODAModel__Group_7__1__Impl();

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
    // $ANTLR end "rule__MODAModel__Group_7__1"


    // $ANTLR start "rule__MODAModel__Group_7__1__Impl"
    // InternalModa.g:1165:1: rule__MODAModel__Group_7__1__Impl : ( ( rule__MODAModel__StsAssignment_7_1 ) ) ;
    public final void rule__MODAModel__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1169:1: ( ( ( rule__MODAModel__StsAssignment_7_1 ) ) )
            // InternalModa.g:1170:1: ( ( rule__MODAModel__StsAssignment_7_1 ) )
            {
            // InternalModa.g:1170:1: ( ( rule__MODAModel__StsAssignment_7_1 ) )
            // InternalModa.g:1171:2: ( rule__MODAModel__StsAssignment_7_1 )
            {
             before(grammarAccess.getMODAModelAccess().getStsAssignment_7_1()); 
            // InternalModa.g:1172:2: ( rule__MODAModel__StsAssignment_7_1 )
            // InternalModa.g:1172:3: rule__MODAModel__StsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__MODAModel__StsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMODAModelAccess().getStsAssignment_7_1()); 

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
    // $ANTLR end "rule__MODAModel__Group_7__1__Impl"


    // $ANTLR start "rule__MODAModel__Group_8__0"
    // InternalModa.g:1181:1: rule__MODAModel__Group_8__0 : rule__MODAModel__Group_8__0__Impl rule__MODAModel__Group_8__1 ;
    public final void rule__MODAModel__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1185:1: ( rule__MODAModel__Group_8__0__Impl rule__MODAModel__Group_8__1 )
            // InternalModa.g:1186:2: rule__MODAModel__Group_8__0__Impl rule__MODAModel__Group_8__1
            {
            pushFollow(FOLLOW_5);
            rule__MODAModel__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODAModel__Group_8__1();

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
    // $ANTLR end "rule__MODAModel__Group_8__0"


    // $ANTLR start "rule__MODAModel__Group_8__0__Impl"
    // InternalModa.g:1193:1: rule__MODAModel__Group_8__0__Impl : ( 'relation' ) ;
    public final void rule__MODAModel__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1197:1: ( ( 'relation' ) )
            // InternalModa.g:1198:1: ( 'relation' )
            {
            // InternalModa.g:1198:1: ( 'relation' )
            // InternalModa.g:1199:2: 'relation'
            {
             before(grammarAccess.getMODAModelAccess().getRelationKeyword_8_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMODAModelAccess().getRelationKeyword_8_0()); 

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
    // $ANTLR end "rule__MODAModel__Group_8__0__Impl"


    // $ANTLR start "rule__MODAModel__Group_8__1"
    // InternalModa.g:1208:1: rule__MODAModel__Group_8__1 : rule__MODAModel__Group_8__1__Impl rule__MODAModel__Group_8__2 ;
    public final void rule__MODAModel__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1212:1: ( rule__MODAModel__Group_8__1__Impl rule__MODAModel__Group_8__2 )
            // InternalModa.g:1213:2: rule__MODAModel__Group_8__1__Impl rule__MODAModel__Group_8__2
            {
            pushFollow(FOLLOW_4);
            rule__MODAModel__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODAModel__Group_8__2();

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
    // $ANTLR end "rule__MODAModel__Group_8__1"


    // $ANTLR start "rule__MODAModel__Group_8__1__Impl"
    // InternalModa.g:1220:1: rule__MODAModel__Group_8__1__Impl : ( '{' ) ;
    public final void rule__MODAModel__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1224:1: ( ( '{' ) )
            // InternalModa.g:1225:1: ( '{' )
            {
            // InternalModa.g:1225:1: ( '{' )
            // InternalModa.g:1226:2: '{'
            {
             before(grammarAccess.getMODAModelAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMODAModelAccess().getLeftCurlyBracketKeyword_8_1()); 

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
    // $ANTLR end "rule__MODAModel__Group_8__1__Impl"


    // $ANTLR start "rule__MODAModel__Group_8__2"
    // InternalModa.g:1235:1: rule__MODAModel__Group_8__2 : rule__MODAModel__Group_8__2__Impl rule__MODAModel__Group_8__3 ;
    public final void rule__MODAModel__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1239:1: ( rule__MODAModel__Group_8__2__Impl rule__MODAModel__Group_8__3 )
            // InternalModa.g:1240:2: rule__MODAModel__Group_8__2__Impl rule__MODAModel__Group_8__3
            {
            pushFollow(FOLLOW_7);
            rule__MODAModel__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODAModel__Group_8__3();

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
    // $ANTLR end "rule__MODAModel__Group_8__2"


    // $ANTLR start "rule__MODAModel__Group_8__2__Impl"
    // InternalModa.g:1247:1: rule__MODAModel__Group_8__2__Impl : ( ( rule__MODAModel__ModarelationAssignment_8_2 ) ) ;
    public final void rule__MODAModel__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1251:1: ( ( ( rule__MODAModel__ModarelationAssignment_8_2 ) ) )
            // InternalModa.g:1252:1: ( ( rule__MODAModel__ModarelationAssignment_8_2 ) )
            {
            // InternalModa.g:1252:1: ( ( rule__MODAModel__ModarelationAssignment_8_2 ) )
            // InternalModa.g:1253:2: ( rule__MODAModel__ModarelationAssignment_8_2 )
            {
             before(grammarAccess.getMODAModelAccess().getModarelationAssignment_8_2()); 
            // InternalModa.g:1254:2: ( rule__MODAModel__ModarelationAssignment_8_2 )
            // InternalModa.g:1254:3: rule__MODAModel__ModarelationAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__MODAModel__ModarelationAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getMODAModelAccess().getModarelationAssignment_8_2()); 

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
    // $ANTLR end "rule__MODAModel__Group_8__2__Impl"


    // $ANTLR start "rule__MODAModel__Group_8__3"
    // InternalModa.g:1262:1: rule__MODAModel__Group_8__3 : rule__MODAModel__Group_8__3__Impl rule__MODAModel__Group_8__4 ;
    public final void rule__MODAModel__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1266:1: ( rule__MODAModel__Group_8__3__Impl rule__MODAModel__Group_8__4 )
            // InternalModa.g:1267:2: rule__MODAModel__Group_8__3__Impl rule__MODAModel__Group_8__4
            {
            pushFollow(FOLLOW_7);
            rule__MODAModel__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODAModel__Group_8__4();

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
    // $ANTLR end "rule__MODAModel__Group_8__3"


    // $ANTLR start "rule__MODAModel__Group_8__3__Impl"
    // InternalModa.g:1274:1: rule__MODAModel__Group_8__3__Impl : ( ( rule__MODAModel__Group_8_3__0 )* ) ;
    public final void rule__MODAModel__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1278:1: ( ( ( rule__MODAModel__Group_8_3__0 )* ) )
            // InternalModa.g:1279:1: ( ( rule__MODAModel__Group_8_3__0 )* )
            {
            // InternalModa.g:1279:1: ( ( rule__MODAModel__Group_8_3__0 )* )
            // InternalModa.g:1280:2: ( rule__MODAModel__Group_8_3__0 )*
            {
             before(grammarAccess.getMODAModelAccess().getGroup_8_3()); 
            // InternalModa.g:1281:2: ( rule__MODAModel__Group_8_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==30) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalModa.g:1281:3: rule__MODAModel__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__MODAModel__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMODAModelAccess().getGroup_8_3()); 

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
    // $ANTLR end "rule__MODAModel__Group_8__3__Impl"


    // $ANTLR start "rule__MODAModel__Group_8__4"
    // InternalModa.g:1289:1: rule__MODAModel__Group_8__4 : rule__MODAModel__Group_8__4__Impl ;
    public final void rule__MODAModel__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1293:1: ( rule__MODAModel__Group_8__4__Impl )
            // InternalModa.g:1294:2: rule__MODAModel__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MODAModel__Group_8__4__Impl();

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
    // $ANTLR end "rule__MODAModel__Group_8__4"


    // $ANTLR start "rule__MODAModel__Group_8__4__Impl"
    // InternalModa.g:1300:1: rule__MODAModel__Group_8__4__Impl : ( '}' ) ;
    public final void rule__MODAModel__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1304:1: ( ( '}' ) )
            // InternalModa.g:1305:1: ( '}' )
            {
            // InternalModa.g:1305:1: ( '}' )
            // InternalModa.g:1306:2: '}'
            {
             before(grammarAccess.getMODAModelAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMODAModelAccess().getRightCurlyBracketKeyword_8_4()); 

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
    // $ANTLR end "rule__MODAModel__Group_8__4__Impl"


    // $ANTLR start "rule__MODAModel__Group_8_3__0"
    // InternalModa.g:1316:1: rule__MODAModel__Group_8_3__0 : rule__MODAModel__Group_8_3__0__Impl rule__MODAModel__Group_8_3__1 ;
    public final void rule__MODAModel__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1320:1: ( rule__MODAModel__Group_8_3__0__Impl rule__MODAModel__Group_8_3__1 )
            // InternalModa.g:1321:2: rule__MODAModel__Group_8_3__0__Impl rule__MODAModel__Group_8_3__1
            {
            pushFollow(FOLLOW_4);
            rule__MODAModel__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODAModel__Group_8_3__1();

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
    // $ANTLR end "rule__MODAModel__Group_8_3__0"


    // $ANTLR start "rule__MODAModel__Group_8_3__0__Impl"
    // InternalModa.g:1328:1: rule__MODAModel__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__MODAModel__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1332:1: ( ( ',' ) )
            // InternalModa.g:1333:1: ( ',' )
            {
            // InternalModa.g:1333:1: ( ',' )
            // InternalModa.g:1334:2: ','
            {
             before(grammarAccess.getMODAModelAccess().getCommaKeyword_8_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMODAModelAccess().getCommaKeyword_8_3_0()); 

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
    // $ANTLR end "rule__MODAModel__Group_8_3__0__Impl"


    // $ANTLR start "rule__MODAModel__Group_8_3__1"
    // InternalModa.g:1343:1: rule__MODAModel__Group_8_3__1 : rule__MODAModel__Group_8_3__1__Impl ;
    public final void rule__MODAModel__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1347:1: ( rule__MODAModel__Group_8_3__1__Impl )
            // InternalModa.g:1348:2: rule__MODAModel__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MODAModel__Group_8_3__1__Impl();

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
    // $ANTLR end "rule__MODAModel__Group_8_3__1"


    // $ANTLR start "rule__MODAModel__Group_8_3__1__Impl"
    // InternalModa.g:1354:1: rule__MODAModel__Group_8_3__1__Impl : ( ( rule__MODAModel__ModarelationAssignment_8_3_1 ) ) ;
    public final void rule__MODAModel__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1358:1: ( ( ( rule__MODAModel__ModarelationAssignment_8_3_1 ) ) )
            // InternalModa.g:1359:1: ( ( rule__MODAModel__ModarelationAssignment_8_3_1 ) )
            {
            // InternalModa.g:1359:1: ( ( rule__MODAModel__ModarelationAssignment_8_3_1 ) )
            // InternalModa.g:1360:2: ( rule__MODAModel__ModarelationAssignment_8_3_1 )
            {
             before(grammarAccess.getMODAModelAccess().getModarelationAssignment_8_3_1()); 
            // InternalModa.g:1361:2: ( rule__MODAModel__ModarelationAssignment_8_3_1 )
            // InternalModa.g:1361:3: rule__MODAModel__ModarelationAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MODAModel__ModarelationAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMODAModelAccess().getModarelationAssignment_8_3_1()); 

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
    // $ANTLR end "rule__MODAModel__Group_8_3__1__Impl"


    // $ANTLR start "rule__Model__Group__0"
    // InternalModa.g:1370:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1374:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalModa.g:1375:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalModa.g:1382:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1386:1: ( ( () ) )
            // InternalModa.g:1387:1: ( () )
            {
            // InternalModa.g:1387:1: ( () )
            // InternalModa.g:1388:2: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // InternalModa.g:1389:2: ()
            // InternalModa.g:1389:3: 
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
    // InternalModa.g:1397:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1401:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalModa.g:1402:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalModa.g:1409:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1413:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalModa.g:1414:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalModa.g:1414:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalModa.g:1415:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalModa.g:1416:2: ( rule__Model__NameAssignment_1 )
            // InternalModa.g:1416:3: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

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
    // InternalModa.g:1424:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1428:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalModa.g:1429:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalModa.g:1436:1: rule__Model__Group__2__Impl : ( ( rule__Model__KindAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1440:1: ( ( ( rule__Model__KindAssignment_2 ) ) )
            // InternalModa.g:1441:1: ( ( rule__Model__KindAssignment_2 ) )
            {
            // InternalModa.g:1441:1: ( ( rule__Model__KindAssignment_2 ) )
            // InternalModa.g:1442:2: ( rule__Model__KindAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getKindAssignment_2()); 
            // InternalModa.g:1443:2: ( rule__Model__KindAssignment_2 )
            // InternalModa.g:1443:3: rule__Model__KindAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__KindAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getKindAssignment_2()); 

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
    // InternalModa.g:1451:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1455:1: ( rule__Model__Group__3__Impl )
            // InternalModa.g:1456:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__3__Impl();

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
    // InternalModa.g:1462:1: rule__Model__Group__3__Impl : ( ( rule__Model__Group_3__0 )? ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1466:1: ( ( ( rule__Model__Group_3__0 )? ) )
            // InternalModa.g:1467:1: ( ( rule__Model__Group_3__0 )? )
            {
            // InternalModa.g:1467:1: ( ( rule__Model__Group_3__0 )? )
            // InternalModa.g:1468:2: ( rule__Model__Group_3__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_3()); 
            // InternalModa.g:1469:2: ( rule__Model__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalModa.g:1469:3: rule__Model__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_3()); 

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


    // $ANTLR start "rule__Model__Group_3__0"
    // InternalModa.g:1478:1: rule__Model__Group_3__0 : rule__Model__Group_3__0__Impl rule__Model__Group_3__1 ;
    public final void rule__Model__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1482:1: ( rule__Model__Group_3__0__Impl rule__Model__Group_3__1 )
            // InternalModa.g:1483:2: rule__Model__Group_3__0__Impl rule__Model__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_3__1();

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
    // $ANTLR end "rule__Model__Group_3__0"


    // $ANTLR start "rule__Model__Group_3__0__Impl"
    // InternalModa.g:1490:1: rule__Model__Group_3__0__Impl : ( '\"' ) ;
    public final void rule__Model__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1494:1: ( ( '\"' ) )
            // InternalModa.g:1495:1: ( '\"' )
            {
            // InternalModa.g:1495:1: ( '\"' )
            // InternalModa.g:1496:2: '\"'
            {
             before(grammarAccess.getModelAccess().getQuotationMarkKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getQuotationMarkKeyword_3_0()); 

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
    // $ANTLR end "rule__Model__Group_3__0__Impl"


    // $ANTLR start "rule__Model__Group_3__1"
    // InternalModa.g:1505:1: rule__Model__Group_3__1 : rule__Model__Group_3__1__Impl rule__Model__Group_3__2 ;
    public final void rule__Model__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1509:1: ( rule__Model__Group_3__1__Impl rule__Model__Group_3__2 )
            // InternalModa.g:1510:2: rule__Model__Group_3__1__Impl rule__Model__Group_3__2
            {
            pushFollow(FOLLOW_10);
            rule__Model__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_3__2();

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
    // $ANTLR end "rule__Model__Group_3__1"


    // $ANTLR start "rule__Model__Group_3__1__Impl"
    // InternalModa.g:1517:1: rule__Model__Group_3__1__Impl : ( ( rule__Model__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Model__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1521:1: ( ( ( rule__Model__DescriptionAssignment_3_1 ) ) )
            // InternalModa.g:1522:1: ( ( rule__Model__DescriptionAssignment_3_1 ) )
            {
            // InternalModa.g:1522:1: ( ( rule__Model__DescriptionAssignment_3_1 ) )
            // InternalModa.g:1523:2: ( rule__Model__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getModelAccess().getDescriptionAssignment_3_1()); 
            // InternalModa.g:1524:2: ( rule__Model__DescriptionAssignment_3_1 )
            // InternalModa.g:1524:3: rule__Model__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getDescriptionAssignment_3_1()); 

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
    // $ANTLR end "rule__Model__Group_3__1__Impl"


    // $ANTLR start "rule__Model__Group_3__2"
    // InternalModa.g:1532:1: rule__Model__Group_3__2 : rule__Model__Group_3__2__Impl ;
    public final void rule__Model__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1536:1: ( rule__Model__Group_3__2__Impl )
            // InternalModa.g:1537:2: rule__Model__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_3__2__Impl();

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
    // $ANTLR end "rule__Model__Group_3__2"


    // $ANTLR start "rule__Model__Group_3__2__Impl"
    // InternalModa.g:1543:1: rule__Model__Group_3__2__Impl : ( '\"' ) ;
    public final void rule__Model__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1547:1: ( ( '\"' ) )
            // InternalModa.g:1548:1: ( '\"' )
            {
            // InternalModa.g:1548:1: ( '\"' )
            // InternalModa.g:1549:2: '\"'
            {
             before(grammarAccess.getModelAccess().getQuotationMarkKeyword_3_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getQuotationMarkKeyword_3_2()); 

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
    // $ANTLR end "rule__Model__Group_3__2__Impl"


    // $ANTLR start "rule__Data__Group__0"
    // InternalModa.g:1559:1: rule__Data__Group__0 : rule__Data__Group__0__Impl rule__Data__Group__1 ;
    public final void rule__Data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1563:1: ( rule__Data__Group__0__Impl rule__Data__Group__1 )
            // InternalModa.g:1564:2: rule__Data__Group__0__Impl rule__Data__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalModa.g:1571:1: rule__Data__Group__0__Impl : ( () ) ;
    public final void rule__Data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1575:1: ( ( () ) )
            // InternalModa.g:1576:1: ( () )
            {
            // InternalModa.g:1576:1: ( () )
            // InternalModa.g:1577:2: ()
            {
             before(grammarAccess.getDataAccess().getDataAction_0()); 
            // InternalModa.g:1578:2: ()
            // InternalModa.g:1578:3: 
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
    // InternalModa.g:1586:1: rule__Data__Group__1 : rule__Data__Group__1__Impl rule__Data__Group__2 ;
    public final void rule__Data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1590:1: ( rule__Data__Group__1__Impl rule__Data__Group__2 )
            // InternalModa.g:1591:2: rule__Data__Group__1__Impl rule__Data__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalModa.g:1598:1: rule__Data__Group__1__Impl : ( ( rule__Data__NameAssignment_1 ) ) ;
    public final void rule__Data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1602:1: ( ( ( rule__Data__NameAssignment_1 ) ) )
            // InternalModa.g:1603:1: ( ( rule__Data__NameAssignment_1 ) )
            {
            // InternalModa.g:1603:1: ( ( rule__Data__NameAssignment_1 ) )
            // InternalModa.g:1604:2: ( rule__Data__NameAssignment_1 )
            {
             before(grammarAccess.getDataAccess().getNameAssignment_1()); 
            // InternalModa.g:1605:2: ( rule__Data__NameAssignment_1 )
            // InternalModa.g:1605:3: rule__Data__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Data__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getNameAssignment_1()); 

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
    // InternalModa.g:1613:1: rule__Data__Group__2 : rule__Data__Group__2__Impl rule__Data__Group__3 ;
    public final void rule__Data__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1617:1: ( rule__Data__Group__2__Impl rule__Data__Group__3 )
            // InternalModa.g:1618:2: rule__Data__Group__2__Impl rule__Data__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalModa.g:1625:1: rule__Data__Group__2__Impl : ( ( rule__Data__KindAssignment_2 ) ) ;
    public final void rule__Data__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1629:1: ( ( ( rule__Data__KindAssignment_2 ) ) )
            // InternalModa.g:1630:1: ( ( rule__Data__KindAssignment_2 ) )
            {
            // InternalModa.g:1630:1: ( ( rule__Data__KindAssignment_2 ) )
            // InternalModa.g:1631:2: ( rule__Data__KindAssignment_2 )
            {
             before(grammarAccess.getDataAccess().getKindAssignment_2()); 
            // InternalModa.g:1632:2: ( rule__Data__KindAssignment_2 )
            // InternalModa.g:1632:3: rule__Data__KindAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Data__KindAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getKindAssignment_2()); 

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
    // InternalModa.g:1640:1: rule__Data__Group__3 : rule__Data__Group__3__Impl ;
    public final void rule__Data__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1644:1: ( rule__Data__Group__3__Impl )
            // InternalModa.g:1645:2: rule__Data__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group__3__Impl();

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
    // InternalModa.g:1651:1: rule__Data__Group__3__Impl : ( ( rule__Data__Group_3__0 )? ) ;
    public final void rule__Data__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1655:1: ( ( ( rule__Data__Group_3__0 )? ) )
            // InternalModa.g:1656:1: ( ( rule__Data__Group_3__0 )? )
            {
            // InternalModa.g:1656:1: ( ( rule__Data__Group_3__0 )? )
            // InternalModa.g:1657:2: ( rule__Data__Group_3__0 )?
            {
             before(grammarAccess.getDataAccess().getGroup_3()); 
            // InternalModa.g:1658:2: ( rule__Data__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalModa.g:1658:3: rule__Data__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Data__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataAccess().getGroup_3()); 

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


    // $ANTLR start "rule__Data__Group_3__0"
    // InternalModa.g:1667:1: rule__Data__Group_3__0 : rule__Data__Group_3__0__Impl rule__Data__Group_3__1 ;
    public final void rule__Data__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1671:1: ( rule__Data__Group_3__0__Impl rule__Data__Group_3__1 )
            // InternalModa.g:1672:2: rule__Data__Group_3__0__Impl rule__Data__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Data__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group_3__1();

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
    // $ANTLR end "rule__Data__Group_3__0"


    // $ANTLR start "rule__Data__Group_3__0__Impl"
    // InternalModa.g:1679:1: rule__Data__Group_3__0__Impl : ( '\"' ) ;
    public final void rule__Data__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1683:1: ( ( '\"' ) )
            // InternalModa.g:1684:1: ( '\"' )
            {
            // InternalModa.g:1684:1: ( '\"' )
            // InternalModa.g:1685:2: '\"'
            {
             before(grammarAccess.getDataAccess().getQuotationMarkKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getQuotationMarkKeyword_3_0()); 

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
    // $ANTLR end "rule__Data__Group_3__0__Impl"


    // $ANTLR start "rule__Data__Group_3__1"
    // InternalModa.g:1694:1: rule__Data__Group_3__1 : rule__Data__Group_3__1__Impl rule__Data__Group_3__2 ;
    public final void rule__Data__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1698:1: ( rule__Data__Group_3__1__Impl rule__Data__Group_3__2 )
            // InternalModa.g:1699:2: rule__Data__Group_3__1__Impl rule__Data__Group_3__2
            {
            pushFollow(FOLLOW_10);
            rule__Data__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group_3__2();

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
    // $ANTLR end "rule__Data__Group_3__1"


    // $ANTLR start "rule__Data__Group_3__1__Impl"
    // InternalModa.g:1706:1: rule__Data__Group_3__1__Impl : ( ( rule__Data__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Data__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1710:1: ( ( ( rule__Data__DescriptionAssignment_3_1 ) ) )
            // InternalModa.g:1711:1: ( ( rule__Data__DescriptionAssignment_3_1 ) )
            {
            // InternalModa.g:1711:1: ( ( rule__Data__DescriptionAssignment_3_1 ) )
            // InternalModa.g:1712:2: ( rule__Data__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getDataAccess().getDescriptionAssignment_3_1()); 
            // InternalModa.g:1713:2: ( rule__Data__DescriptionAssignment_3_1 )
            // InternalModa.g:1713:3: rule__Data__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Data__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getDescriptionAssignment_3_1()); 

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
    // $ANTLR end "rule__Data__Group_3__1__Impl"


    // $ANTLR start "rule__Data__Group_3__2"
    // InternalModa.g:1721:1: rule__Data__Group_3__2 : rule__Data__Group_3__2__Impl ;
    public final void rule__Data__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1725:1: ( rule__Data__Group_3__2__Impl )
            // InternalModa.g:1726:2: rule__Data__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group_3__2__Impl();

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
    // $ANTLR end "rule__Data__Group_3__2"


    // $ANTLR start "rule__Data__Group_3__2__Impl"
    // InternalModa.g:1732:1: rule__Data__Group_3__2__Impl : ( '\"' ) ;
    public final void rule__Data__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1736:1: ( ( '\"' ) )
            // InternalModa.g:1737:1: ( '\"' )
            {
            // InternalModa.g:1737:1: ( '\"' )
            // InternalModa.g:1738:2: '\"'
            {
             before(grammarAccess.getDataAccess().getQuotationMarkKeyword_3_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getQuotationMarkKeyword_3_2()); 

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
    // $ANTLR end "rule__Data__Group_3__2__Impl"


    // $ANTLR start "rule__RunningSoftware__Group__0"
    // InternalModa.g:1748:1: rule__RunningSoftware__Group__0 : rule__RunningSoftware__Group__0__Impl rule__RunningSoftware__Group__1 ;
    public final void rule__RunningSoftware__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1752:1: ( rule__RunningSoftware__Group__0__Impl rule__RunningSoftware__Group__1 )
            // InternalModa.g:1753:2: rule__RunningSoftware__Group__0__Impl rule__RunningSoftware__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalModa.g:1760:1: rule__RunningSoftware__Group__0__Impl : ( () ) ;
    public final void rule__RunningSoftware__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1764:1: ( ( () ) )
            // InternalModa.g:1765:1: ( () )
            {
            // InternalModa.g:1765:1: ( () )
            // InternalModa.g:1766:2: ()
            {
             before(grammarAccess.getRunningSoftwareAccess().getRunningSoftwareAction_0()); 
            // InternalModa.g:1767:2: ()
            // InternalModa.g:1767:3: 
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
    // InternalModa.g:1775:1: rule__RunningSoftware__Group__1 : rule__RunningSoftware__Group__1__Impl ;
    public final void rule__RunningSoftware__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1779:1: ( rule__RunningSoftware__Group__1__Impl )
            // InternalModa.g:1780:2: rule__RunningSoftware__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RunningSoftware__Group__1__Impl();

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
    // InternalModa.g:1786:1: rule__RunningSoftware__Group__1__Impl : ( ( rule__RunningSoftware__NameAssignment_1 ) ) ;
    public final void rule__RunningSoftware__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1790:1: ( ( ( rule__RunningSoftware__NameAssignment_1 ) ) )
            // InternalModa.g:1791:1: ( ( rule__RunningSoftware__NameAssignment_1 ) )
            {
            // InternalModa.g:1791:1: ( ( rule__RunningSoftware__NameAssignment_1 ) )
            // InternalModa.g:1792:2: ( rule__RunningSoftware__NameAssignment_1 )
            {
             before(grammarAccess.getRunningSoftwareAccess().getNameAssignment_1()); 
            // InternalModa.g:1793:2: ( rule__RunningSoftware__NameAssignment_1 )
            // InternalModa.g:1793:3: rule__RunningSoftware__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RunningSoftware__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRunningSoftwareAccess().getNameAssignment_1()); 

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


    // $ANTLR start "rule__STS__Group__0"
    // InternalModa.g:1802:1: rule__STS__Group__0 : rule__STS__Group__0__Impl rule__STS__Group__1 ;
    public final void rule__STS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1806:1: ( rule__STS__Group__0__Impl rule__STS__Group__1 )
            // InternalModa.g:1807:2: rule__STS__Group__0__Impl rule__STS__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalModa.g:1814:1: rule__STS__Group__0__Impl : ( () ) ;
    public final void rule__STS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1818:1: ( ( () ) )
            // InternalModa.g:1819:1: ( () )
            {
            // InternalModa.g:1819:1: ( () )
            // InternalModa.g:1820:2: ()
            {
             before(grammarAccess.getSTSAccess().getSTSAction_0()); 
            // InternalModa.g:1821:2: ()
            // InternalModa.g:1821:3: 
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
    // InternalModa.g:1829:1: rule__STS__Group__1 : rule__STS__Group__1__Impl ;
    public final void rule__STS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1833:1: ( rule__STS__Group__1__Impl )
            // InternalModa.g:1834:2: rule__STS__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__STS__Group__1__Impl();

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
    // InternalModa.g:1840:1: rule__STS__Group__1__Impl : ( ( rule__STS__NameAssignment_1 ) ) ;
    public final void rule__STS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1844:1: ( ( ( rule__STS__NameAssignment_1 ) ) )
            // InternalModa.g:1845:1: ( ( rule__STS__NameAssignment_1 ) )
            {
            // InternalModa.g:1845:1: ( ( rule__STS__NameAssignment_1 ) )
            // InternalModa.g:1846:2: ( rule__STS__NameAssignment_1 )
            {
             before(grammarAccess.getSTSAccess().getNameAssignment_1()); 
            // InternalModa.g:1847:2: ( rule__STS__NameAssignment_1 )
            // InternalModa.g:1847:3: rule__STS__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__STS__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSTSAccess().getNameAssignment_1()); 

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


    // $ANTLR start "rule__MODARelation__Group__0"
    // InternalModa.g:1856:1: rule__MODARelation__Group__0 : rule__MODARelation__Group__0__Impl rule__MODARelation__Group__1 ;
    public final void rule__MODARelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1860:1: ( rule__MODARelation__Group__0__Impl rule__MODARelation__Group__1 )
            // InternalModa.g:1861:2: rule__MODARelation__Group__0__Impl rule__MODARelation__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalModa.g:1868:1: rule__MODARelation__Group__0__Impl : ( () ) ;
    public final void rule__MODARelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1872:1: ( ( () ) )
            // InternalModa.g:1873:1: ( () )
            {
            // InternalModa.g:1873:1: ( () )
            // InternalModa.g:1874:2: ()
            {
             before(grammarAccess.getMODARelationAccess().getMODARelationAction_0()); 
            // InternalModa.g:1875:2: ()
            // InternalModa.g:1875:3: 
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
    // InternalModa.g:1883:1: rule__MODARelation__Group__1 : rule__MODARelation__Group__1__Impl rule__MODARelation__Group__2 ;
    public final void rule__MODARelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1887:1: ( rule__MODARelation__Group__1__Impl rule__MODARelation__Group__2 )
            // InternalModa.g:1888:2: rule__MODARelation__Group__1__Impl rule__MODARelation__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalModa.g:1895:1: rule__MODARelation__Group__1__Impl : ( ( rule__MODARelation__NameAssignment_1 ) ) ;
    public final void rule__MODARelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1899:1: ( ( ( rule__MODARelation__NameAssignment_1 ) ) )
            // InternalModa.g:1900:1: ( ( rule__MODARelation__NameAssignment_1 ) )
            {
            // InternalModa.g:1900:1: ( ( rule__MODARelation__NameAssignment_1 ) )
            // InternalModa.g:1901:2: ( rule__MODARelation__NameAssignment_1 )
            {
             before(grammarAccess.getMODARelationAccess().getNameAssignment_1()); 
            // InternalModa.g:1902:2: ( rule__MODARelation__NameAssignment_1 )
            // InternalModa.g:1902:3: rule__MODARelation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MODARelation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMODARelationAccess().getNameAssignment_1()); 

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
    // InternalModa.g:1910:1: rule__MODARelation__Group__2 : rule__MODARelation__Group__2__Impl rule__MODARelation__Group__3 ;
    public final void rule__MODARelation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1914:1: ( rule__MODARelation__Group__2__Impl rule__MODARelation__Group__3 )
            // InternalModa.g:1915:2: rule__MODARelation__Group__2__Impl rule__MODARelation__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalModa.g:1922:1: rule__MODARelation__Group__2__Impl : ( ( rule__MODARelation__KindAssignment_2 ) ) ;
    public final void rule__MODARelation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1926:1: ( ( ( rule__MODARelation__KindAssignment_2 ) ) )
            // InternalModa.g:1927:1: ( ( rule__MODARelation__KindAssignment_2 ) )
            {
            // InternalModa.g:1927:1: ( ( rule__MODARelation__KindAssignment_2 ) )
            // InternalModa.g:1928:2: ( rule__MODARelation__KindAssignment_2 )
            {
             before(grammarAccess.getMODARelationAccess().getKindAssignment_2()); 
            // InternalModa.g:1929:2: ( rule__MODARelation__KindAssignment_2 )
            // InternalModa.g:1929:3: rule__MODARelation__KindAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MODARelation__KindAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMODARelationAccess().getKindAssignment_2()); 

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
    // InternalModa.g:1937:1: rule__MODARelation__Group__3 : rule__MODARelation__Group__3__Impl rule__MODARelation__Group__4 ;
    public final void rule__MODARelation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1941:1: ( rule__MODARelation__Group__3__Impl rule__MODARelation__Group__4 )
            // InternalModa.g:1942:2: rule__MODARelation__Group__3__Impl rule__MODARelation__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalModa.g:1949:1: rule__MODARelation__Group__3__Impl : ( ( rule__MODARelation__SrcAssignment_3 ) ) ;
    public final void rule__MODARelation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1953:1: ( ( ( rule__MODARelation__SrcAssignment_3 ) ) )
            // InternalModa.g:1954:1: ( ( rule__MODARelation__SrcAssignment_3 ) )
            {
            // InternalModa.g:1954:1: ( ( rule__MODARelation__SrcAssignment_3 ) )
            // InternalModa.g:1955:2: ( rule__MODARelation__SrcAssignment_3 )
            {
             before(grammarAccess.getMODARelationAccess().getSrcAssignment_3()); 
            // InternalModa.g:1956:2: ( rule__MODARelation__SrcAssignment_3 )
            // InternalModa.g:1956:3: rule__MODARelation__SrcAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MODARelation__SrcAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMODARelationAccess().getSrcAssignment_3()); 

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
    // InternalModa.g:1964:1: rule__MODARelation__Group__4 : rule__MODARelation__Group__4__Impl rule__MODARelation__Group__5 ;
    public final void rule__MODARelation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1968:1: ( rule__MODARelation__Group__4__Impl rule__MODARelation__Group__5 )
            // InternalModa.g:1969:2: rule__MODARelation__Group__4__Impl rule__MODARelation__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalModa.g:1976:1: rule__MODARelation__Group__4__Impl : ( '->' ) ;
    public final void rule__MODARelation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1980:1: ( ( '->' ) )
            // InternalModa.g:1981:1: ( '->' )
            {
            // InternalModa.g:1981:1: ( '->' )
            // InternalModa.g:1982:2: '->'
            {
             before(grammarAccess.getMODARelationAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMODARelationAccess().getHyphenMinusGreaterThanSignKeyword_4()); 

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
    // InternalModa.g:1991:1: rule__MODARelation__Group__5 : rule__MODARelation__Group__5__Impl ;
    public final void rule__MODARelation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1995:1: ( rule__MODARelation__Group__5__Impl )
            // InternalModa.g:1996:2: rule__MODARelation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MODARelation__Group__5__Impl();

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
    // InternalModa.g:2002:1: rule__MODARelation__Group__5__Impl : ( ( rule__MODARelation__Group_5__0 ) ) ;
    public final void rule__MODARelation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2006:1: ( ( ( rule__MODARelation__Group_5__0 ) ) )
            // InternalModa.g:2007:1: ( ( rule__MODARelation__Group_5__0 ) )
            {
            // InternalModa.g:2007:1: ( ( rule__MODARelation__Group_5__0 ) )
            // InternalModa.g:2008:2: ( rule__MODARelation__Group_5__0 )
            {
             before(grammarAccess.getMODARelationAccess().getGroup_5()); 
            // InternalModa.g:2009:2: ( rule__MODARelation__Group_5__0 )
            // InternalModa.g:2009:3: rule__MODARelation__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__MODARelation__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getMODARelationAccess().getGroup_5()); 

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


    // $ANTLR start "rule__MODARelation__Group_5__0"
    // InternalModa.g:2018:1: rule__MODARelation__Group_5__0 : rule__MODARelation__Group_5__0__Impl rule__MODARelation__Group_5__1 ;
    public final void rule__MODARelation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2022:1: ( rule__MODARelation__Group_5__0__Impl rule__MODARelation__Group_5__1 )
            // InternalModa.g:2023:2: rule__MODARelation__Group_5__0__Impl rule__MODARelation__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__MODARelation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODARelation__Group_5__1();

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
    // $ANTLR end "rule__MODARelation__Group_5__0"


    // $ANTLR start "rule__MODARelation__Group_5__0__Impl"
    // InternalModa.g:2030:1: rule__MODARelation__Group_5__0__Impl : ( 'tgt' ) ;
    public final void rule__MODARelation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2034:1: ( ( 'tgt' ) )
            // InternalModa.g:2035:1: ( 'tgt' )
            {
            // InternalModa.g:2035:1: ( 'tgt' )
            // InternalModa.g:2036:2: 'tgt'
            {
             before(grammarAccess.getMODARelationAccess().getTgtKeyword_5_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMODARelationAccess().getTgtKeyword_5_0()); 

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
    // $ANTLR end "rule__MODARelation__Group_5__0__Impl"


    // $ANTLR start "rule__MODARelation__Group_5__1"
    // InternalModa.g:2045:1: rule__MODARelation__Group_5__1 : rule__MODARelation__Group_5__1__Impl ;
    public final void rule__MODARelation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2049:1: ( rule__MODARelation__Group_5__1__Impl )
            // InternalModa.g:2050:2: rule__MODARelation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MODARelation__Group_5__1__Impl();

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
    // $ANTLR end "rule__MODARelation__Group_5__1"


    // $ANTLR start "rule__MODARelation__Group_5__1__Impl"
    // InternalModa.g:2056:1: rule__MODARelation__Group_5__1__Impl : ( ( rule__MODARelation__TgtAssignment_5_1 ) ) ;
    public final void rule__MODARelation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2060:1: ( ( ( rule__MODARelation__TgtAssignment_5_1 ) ) )
            // InternalModa.g:2061:1: ( ( rule__MODARelation__TgtAssignment_5_1 ) )
            {
            // InternalModa.g:2061:1: ( ( rule__MODARelation__TgtAssignment_5_1 ) )
            // InternalModa.g:2062:2: ( rule__MODARelation__TgtAssignment_5_1 )
            {
             before(grammarAccess.getMODARelationAccess().getTgtAssignment_5_1()); 
            // InternalModa.g:2063:2: ( rule__MODARelation__TgtAssignment_5_1 )
            // InternalModa.g:2063:3: rule__MODARelation__TgtAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__MODARelation__TgtAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMODARelationAccess().getTgtAssignment_5_1()); 

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
    // $ANTLR end "rule__MODARelation__Group_5__1__Impl"


    // $ANTLR start "rule__MODAModel__NameAssignment_2"
    // InternalModa.g:2072:1: rule__MODAModel__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__MODAModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2076:1: ( ( ruleEString ) )
            // InternalModa.g:2077:2: ( ruleEString )
            {
            // InternalModa.g:2077:2: ( ruleEString )
            // InternalModa.g:2078:3: ruleEString
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


    // $ANTLR start "rule__MODAModel__ModelAssignment_4_2"
    // InternalModa.g:2087:1: rule__MODAModel__ModelAssignment_4_2 : ( ruleModel ) ;
    public final void rule__MODAModel__ModelAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2091:1: ( ( ruleModel ) )
            // InternalModa.g:2092:2: ( ruleModel )
            {
            // InternalModa.g:2092:2: ( ruleModel )
            // InternalModa.g:2093:3: ruleModel
            {
             before(grammarAccess.getMODAModelAccess().getModelModelParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getMODAModelAccess().getModelModelParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__MODAModel__ModelAssignment_4_2"


    // $ANTLR start "rule__MODAModel__ModelAssignment_4_3_1"
    // InternalModa.g:2102:1: rule__MODAModel__ModelAssignment_4_3_1 : ( ruleModel ) ;
    public final void rule__MODAModel__ModelAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2106:1: ( ( ruleModel ) )
            // InternalModa.g:2107:2: ( ruleModel )
            {
            // InternalModa.g:2107:2: ( ruleModel )
            // InternalModa.g:2108:3: ruleModel
            {
             before(grammarAccess.getMODAModelAccess().getModelModelParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getMODAModelAccess().getModelModelParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__MODAModel__ModelAssignment_4_3_1"


    // $ANTLR start "rule__MODAModel__DataAssignment_5_2"
    // InternalModa.g:2117:1: rule__MODAModel__DataAssignment_5_2 : ( ruleData ) ;
    public final void rule__MODAModel__DataAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2121:1: ( ( ruleData ) )
            // InternalModa.g:2122:2: ( ruleData )
            {
            // InternalModa.g:2122:2: ( ruleData )
            // InternalModa.g:2123:3: ruleData
            {
             before(grammarAccess.getMODAModelAccess().getDataDataParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getMODAModelAccess().getDataDataParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__MODAModel__DataAssignment_5_2"


    // $ANTLR start "rule__MODAModel__DataAssignment_5_3_1"
    // InternalModa.g:2132:1: rule__MODAModel__DataAssignment_5_3_1 : ( ruleData ) ;
    public final void rule__MODAModel__DataAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2136:1: ( ( ruleData ) )
            // InternalModa.g:2137:2: ( ruleData )
            {
            // InternalModa.g:2137:2: ( ruleData )
            // InternalModa.g:2138:3: ruleData
            {
             before(grammarAccess.getMODAModelAccess().getDataDataParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getMODAModelAccess().getDataDataParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__MODAModel__DataAssignment_5_3_1"


    // $ANTLR start "rule__MODAModel__SoftwareAssignment_6_1"
    // InternalModa.g:2147:1: rule__MODAModel__SoftwareAssignment_6_1 : ( ruleRunningSoftware ) ;
    public final void rule__MODAModel__SoftwareAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2151:1: ( ( ruleRunningSoftware ) )
            // InternalModa.g:2152:2: ( ruleRunningSoftware )
            {
            // InternalModa.g:2152:2: ( ruleRunningSoftware )
            // InternalModa.g:2153:3: ruleRunningSoftware
            {
             before(grammarAccess.getMODAModelAccess().getSoftwareRunningSoftwareParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRunningSoftware();

            state._fsp--;

             after(grammarAccess.getMODAModelAccess().getSoftwareRunningSoftwareParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__MODAModel__SoftwareAssignment_6_1"


    // $ANTLR start "rule__MODAModel__StsAssignment_7_1"
    // InternalModa.g:2162:1: rule__MODAModel__StsAssignment_7_1 : ( ruleSTS ) ;
    public final void rule__MODAModel__StsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2166:1: ( ( ruleSTS ) )
            // InternalModa.g:2167:2: ( ruleSTS )
            {
            // InternalModa.g:2167:2: ( ruleSTS )
            // InternalModa.g:2168:3: ruleSTS
            {
             before(grammarAccess.getMODAModelAccess().getStsSTSParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSTS();

            state._fsp--;

             after(grammarAccess.getMODAModelAccess().getStsSTSParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__MODAModel__StsAssignment_7_1"


    // $ANTLR start "rule__MODAModel__ModarelationAssignment_8_2"
    // InternalModa.g:2177:1: rule__MODAModel__ModarelationAssignment_8_2 : ( ruleMODARelation ) ;
    public final void rule__MODAModel__ModarelationAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2181:1: ( ( ruleMODARelation ) )
            // InternalModa.g:2182:2: ( ruleMODARelation )
            {
            // InternalModa.g:2182:2: ( ruleMODARelation )
            // InternalModa.g:2183:3: ruleMODARelation
            {
             before(grammarAccess.getMODAModelAccess().getModarelationMODARelationParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMODARelation();

            state._fsp--;

             after(grammarAccess.getMODAModelAccess().getModarelationMODARelationParserRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__MODAModel__ModarelationAssignment_8_2"


    // $ANTLR start "rule__MODAModel__ModarelationAssignment_8_3_1"
    // InternalModa.g:2192:1: rule__MODAModel__ModarelationAssignment_8_3_1 : ( ruleMODARelation ) ;
    public final void rule__MODAModel__ModarelationAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2196:1: ( ( ruleMODARelation ) )
            // InternalModa.g:2197:2: ( ruleMODARelation )
            {
            // InternalModa.g:2197:2: ( ruleMODARelation )
            // InternalModa.g:2198:3: ruleMODARelation
            {
             before(grammarAccess.getMODAModelAccess().getModarelationMODARelationParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMODARelation();

            state._fsp--;

             after(grammarAccess.getMODAModelAccess().getModarelationMODARelationParserRuleCall_8_3_1_0()); 

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
    // $ANTLR end "rule__MODAModel__ModarelationAssignment_8_3_1"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalModa.g:2207:1: rule__Model__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2211:1: ( ( ruleEString ) )
            // InternalModa.g:2212:2: ( ruleEString )
            {
            // InternalModa.g:2212:2: ( ruleEString )
            // InternalModa.g:2213:3: ruleEString
            {
             before(grammarAccess.getModelAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__KindAssignment_2"
    // InternalModa.g:2222:1: rule__Model__KindAssignment_2 : ( ruleModelKind ) ;
    public final void rule__Model__KindAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2226:1: ( ( ruleModelKind ) )
            // InternalModa.g:2227:2: ( ruleModelKind )
            {
            // InternalModa.g:2227:2: ( ruleModelKind )
            // InternalModa.g:2228:3: ruleModelKind
            {
             before(grammarAccess.getModelAccess().getKindModelKindEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleModelKind();

            state._fsp--;

             after(grammarAccess.getModelAccess().getKindModelKindEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__KindAssignment_2"


    // $ANTLR start "rule__Model__DescriptionAssignment_3_1"
    // InternalModa.g:2237:1: rule__Model__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Model__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2241:1: ( ( ruleEString ) )
            // InternalModa.g:2242:2: ( ruleEString )
            {
            // InternalModa.g:2242:2: ( ruleEString )
            // InternalModa.g:2243:3: ruleEString
            {
             before(grammarAccess.getModelAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDescriptionEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Model__DescriptionAssignment_3_1"


    // $ANTLR start "rule__Data__NameAssignment_1"
    // InternalModa.g:2252:1: rule__Data__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Data__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2256:1: ( ( ruleEString ) )
            // InternalModa.g:2257:2: ( ruleEString )
            {
            // InternalModa.g:2257:2: ( ruleEString )
            // InternalModa.g:2258:3: ruleEString
            {
             before(grammarAccess.getDataAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Data__NameAssignment_1"


    // $ANTLR start "rule__Data__KindAssignment_2"
    // InternalModa.g:2267:1: rule__Data__KindAssignment_2 : ( ruleDataKind ) ;
    public final void rule__Data__KindAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2271:1: ( ( ruleDataKind ) )
            // InternalModa.g:2272:2: ( ruleDataKind )
            {
            // InternalModa.g:2272:2: ( ruleDataKind )
            // InternalModa.g:2273:3: ruleDataKind
            {
             before(grammarAccess.getDataAccess().getKindDataKindEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataKind();

            state._fsp--;

             after(grammarAccess.getDataAccess().getKindDataKindEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Data__KindAssignment_2"


    // $ANTLR start "rule__Data__DescriptionAssignment_3_1"
    // InternalModa.g:2282:1: rule__Data__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Data__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2286:1: ( ( ruleEString ) )
            // InternalModa.g:2287:2: ( ruleEString )
            {
            // InternalModa.g:2287:2: ( ruleEString )
            // InternalModa.g:2288:3: ruleEString
            {
             before(grammarAccess.getDataAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataAccess().getDescriptionEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Data__DescriptionAssignment_3_1"


    // $ANTLR start "rule__RunningSoftware__NameAssignment_1"
    // InternalModa.g:2297:1: rule__RunningSoftware__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__RunningSoftware__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2301:1: ( ( ruleEString ) )
            // InternalModa.g:2302:2: ( ruleEString )
            {
            // InternalModa.g:2302:2: ( ruleEString )
            // InternalModa.g:2303:3: ruleEString
            {
             before(grammarAccess.getRunningSoftwareAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRunningSoftwareAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__RunningSoftware__NameAssignment_1"


    // $ANTLR start "rule__STS__NameAssignment_1"
    // InternalModa.g:2312:1: rule__STS__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__STS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2316:1: ( ( ruleEString ) )
            // InternalModa.g:2317:2: ( ruleEString )
            {
            // InternalModa.g:2317:2: ( ruleEString )
            // InternalModa.g:2318:3: ruleEString
            {
             before(grammarAccess.getSTSAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSTSAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__STS__NameAssignment_1"


    // $ANTLR start "rule__MODARelation__NameAssignment_1"
    // InternalModa.g:2327:1: rule__MODARelation__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__MODARelation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2331:1: ( ( ruleEString ) )
            // InternalModa.g:2332:2: ( ruleEString )
            {
            // InternalModa.g:2332:2: ( ruleEString )
            // InternalModa.g:2333:3: ruleEString
            {
             before(grammarAccess.getMODARelationAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMODARelationAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MODARelation__NameAssignment_1"


    // $ANTLR start "rule__MODARelation__KindAssignment_2"
    // InternalModa.g:2342:1: rule__MODARelation__KindAssignment_2 : ( ruleRelationKind ) ;
    public final void rule__MODARelation__KindAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2346:1: ( ( ruleRelationKind ) )
            // InternalModa.g:2347:2: ( ruleRelationKind )
            {
            // InternalModa.g:2347:2: ( ruleRelationKind )
            // InternalModa.g:2348:3: ruleRelationKind
            {
             before(grammarAccess.getMODARelationAccess().getKindRelationKindEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationKind();

            state._fsp--;

             after(grammarAccess.getMODARelationAccess().getKindRelationKindEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__MODARelation__KindAssignment_2"


    // $ANTLR start "rule__MODARelation__SrcAssignment_3"
    // InternalModa.g:2357:1: rule__MODARelation__SrcAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__MODARelation__SrcAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2361:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:2362:2: ( ( ruleEString ) )
            {
            // InternalModa.g:2362:2: ( ( ruleEString ) )
            // InternalModa.g:2363:3: ( ruleEString )
            {
             before(grammarAccess.getMODARelationAccess().getSrcMODAElementCrossReference_3_0()); 
            // InternalModa.g:2364:3: ( ruleEString )
            // InternalModa.g:2365:4: ruleEString
            {
             before(grammarAccess.getMODARelationAccess().getSrcMODAElementEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMODARelationAccess().getSrcMODAElementEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMODARelationAccess().getSrcMODAElementCrossReference_3_0()); 

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
    // $ANTLR end "rule__MODARelation__SrcAssignment_3"


    // $ANTLR start "rule__MODARelation__TgtAssignment_5_1"
    // InternalModa.g:2376:1: rule__MODARelation__TgtAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__MODARelation__TgtAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2380:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:2381:2: ( ( ruleEString ) )
            {
            // InternalModa.g:2381:2: ( ( ruleEString ) )
            // InternalModa.g:2382:3: ( ruleEString )
            {
             before(grammarAccess.getMODARelationAccess().getTgtMODAElementCrossReference_5_1_0()); 
            // InternalModa.g:2383:3: ( ruleEString )
            // InternalModa.g:2384:4: ruleEString
            {
             before(grammarAccess.getMODARelationAccess().getTgtMODAElementEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMODARelationAccess().getTgtMODAElementEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getMODARelationAccess().getTgtMODAElementCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__MODARelation__TgtAssignment_5_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000007B0000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003FCC000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000000L});

}