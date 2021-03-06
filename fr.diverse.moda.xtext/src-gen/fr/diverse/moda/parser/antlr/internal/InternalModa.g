/*
 * generated by Xtext 2.24.0
 */
grammar InternalModa;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package fr.diverse.moda.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleMODAModel
entryRuleMODAModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMODAModelRule()); }
	iv_ruleMODAModel=ruleMODAModel
	{ $current=$iv_ruleMODAModel.current; }
	EOF;

// Rule MODAModel
ruleMODAModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getMODAModelAccess().getMODAModelAction_0(),
					$current);
			}
		)
		otherlv_1='MODAModel'
		{
			newLeafNode(otherlv_1, grammarAccess.getMODAModelAccess().getMODAModelKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMODAModelAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMODAModelRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"fr.diverse.moda.Moda.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getMODAModelAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getMODAModelAccess().getModelModelParserRuleCall_4_0_0());
					}
					lv_model_4_0=ruleModel
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMODAModelRule());
						}
						add(
							$current,
							"model",
							lv_model_4_0,
							"fr.diverse.moda.Moda.Model");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getMODAModelAccess().getCommaKeyword_4_1_0());
				}
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getMODAModelAccess().getModelModelParserRuleCall_4_1_1_0_0());
							}
							lv_model_6_0=ruleModel
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getMODAModelRule());
								}
								add(
									$current,
									"model",
									lv_model_6_0,
									"fr.diverse.moda.Moda.Model");
								afterParserOrEnumRuleCall();
							}
						)
					)
					    |
					(
						(
							{
								newCompositeNode(grammarAccess.getMODAModelAccess().getDataDataParserRuleCall_4_1_1_1_0());
							}
							lv_data_7_0=ruleData
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getMODAModelRule());
								}
								add(
									$current,
									"data",
									lv_data_7_0,
									"fr.diverse.moda.Moda.Data");
								afterParserOrEnumRuleCall();
							}
						)
					)
					    |
					(
						(
							{
								newCompositeNode(grammarAccess.getMODAModelAccess().getSoftwareRunningSoftwareParserRuleCall_4_1_1_2_0());
							}
							lv_software_8_0=ruleRunningSoftware
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getMODAModelRule());
								}
								set(
									$current,
									"software",
									lv_software_8_0,
									"fr.diverse.moda.Moda.RunningSoftware");
								afterParserOrEnumRuleCall();
							}
						)
					)
					    |
					(
						(
							{
								newCompositeNode(grammarAccess.getMODAModelAccess().getStsSTSParserRuleCall_4_1_1_3_0());
							}
							lv_sts_9_0=ruleSTS
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getMODAModelRule());
								}
								set(
									$current,
									"sts",
									lv_sts_9_0,
									"fr.diverse.moda.Moda.STS");
								afterParserOrEnumRuleCall();
							}
						)
					)
					    |
					(
						(
							{
								newCompositeNode(grammarAccess.getMODAModelAccess().getModarelationMODARelationParserRuleCall_4_1_1_4_0());
							}
							lv_modarelation_10_0=ruleMODARelation
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getMODAModelRule());
								}
								add(
									$current,
									"modarelation",
									lv_modarelation_10_0,
									"fr.diverse.moda.Moda.MODARelation");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)
			)*
		)?
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getMODAModelAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getModelAccess().getModelAction_0(),
					$current);
			}
		)
		otherlv_1='model'
		{
			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"fr.diverse.moda.Moda.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getKindModelKindEnumRuleCall_3_0());
				}
				lv_kind_3_0=ruleModelKind
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"kind",
						lv_kind_3_0,
						"fr.diverse.moda.Moda.ModelKind");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getDescriptionEStringParserRuleCall_4_0());
				}
				lv_description_4_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"description",
						lv_description_4_0,
						"fr.diverse.moda.Moda.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleData
entryRuleData returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataRule()); }
	iv_ruleData=ruleData
	{ $current=$iv_ruleData.current; }
	EOF;

// Rule Data
ruleData returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDataAccess().getDataAction_0(),
					$current);
			}
		)
		otherlv_1='data'
		{
			newLeafNode(otherlv_1, grammarAccess.getDataAccess().getDataKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDataAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDataRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"fr.diverse.moda.Moda.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDataAccess().getKindDataKindEnumRuleCall_3_0());
				}
				lv_kind_3_0=ruleDataKind
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDataRule());
					}
					set(
						$current,
						"kind",
						lv_kind_3_0,
						"fr.diverse.moda.Moda.DataKind");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDataAccess().getDescriptionEStringParserRuleCall_4_0());
				}
				lv_description_4_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDataRule());
					}
					set(
						$current,
						"description",
						lv_description_4_0,
						"fr.diverse.moda.Moda.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleRunningSoftware
entryRuleRunningSoftware returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRunningSoftwareRule()); }
	iv_ruleRunningSoftware=ruleRunningSoftware
	{ $current=$iv_ruleRunningSoftware.current; }
	EOF;

// Rule RunningSoftware
ruleRunningSoftware returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRunningSoftwareAccess().getRunningSoftwareAction_0(),
					$current);
			}
		)
		otherlv_1='software'
		{
			newLeafNode(otherlv_1, grammarAccess.getRunningSoftwareAccess().getSoftwareKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRunningSoftwareAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRunningSoftwareRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"fr.diverse.moda.Moda.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSTS
entryRuleSTS returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSTSRule()); }
	iv_ruleSTS=ruleSTS
	{ $current=$iv_ruleSTS.current; }
	EOF;

// Rule STS
ruleSTS returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSTSAccess().getSTSAction_0(),
					$current);
			}
		)
		otherlv_1='sts'
		{
			newLeafNode(otherlv_1, grammarAccess.getSTSAccess().getStsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSTSAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSTSRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"fr.diverse.moda.Moda.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleMODARelation
entryRuleMODARelation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMODARelationRule()); }
	iv_ruleMODARelation=ruleMODARelation
	{ $current=$iv_ruleMODARelation.current; }
	EOF;

// Rule MODARelation
ruleMODARelation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getMODARelationAccess().getMODARelationAction_0(),
					$current);
			}
		)
		otherlv_1='relation'
		{
			newLeafNode(otherlv_1, grammarAccess.getMODARelationAccess().getRelationKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMODARelationAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMODARelationRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"fr.diverse.moda.Moda.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getMODARelationAccess().getKindRelationKindEnumRuleCall_3_0());
				}
				lv_kind_3_0=ruleRelationKind
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMODARelationRule());
					}
					set(
						$current,
						"kind",
						lv_kind_3_0,
						"fr.diverse.moda.Moda.RelationKind");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMODARelationRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getMODARelationAccess().getSrcMODAElementCrossReference_4_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='->'
		{
			newLeafNode(otherlv_5, grammarAccess.getMODARelationAccess().getHyphenMinusGreaterThanSignKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMODARelationRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getMODARelationAccess().getTgtMODAElementCrossReference_6_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Rule ModelKind
ruleModelKind returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='prescriptive'
			{
				$current = grammarAccess.getModelKindAccess().getPrescriptiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getModelKindAccess().getPrescriptiveEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='predictive'
			{
				$current = grammarAccess.getModelKindAccess().getPredictiveEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getModelKindAccess().getPredictiveEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='descriptive'
			{
				$current = grammarAccess.getModelKindAccess().getDescriptiveEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getModelKindAccess().getDescriptiveEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule DataKind
ruleDataKind returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='input'
			{
				$current = grammarAccess.getDataKindAccess().getInputEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDataKindAccess().getInputEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='output'
			{
				$current = grammarAccess.getDataKindAccess().getOutputEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDataKindAccess().getOutputEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='external'
			{
				$current = grammarAccess.getDataKindAccess().getExternalEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getDataKindAccess().getExternalEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='measured'
			{
				$current = grammarAccess.getDataKindAccess().getMeasuredEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getDataKindAccess().getMeasuredEnumLiteralDeclaration_3());
			}
		)
	)
;

// Rule RelationKind
ruleRelationKind returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='generation'
			{
				$current = grammarAccess.getRelationKindAccess().getGenerationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getRelationKindAccess().getGenerationEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='enactment'
			{
				$current = grammarAccess.getRelationKindAccess().getEnactmentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getRelationKindAccess().getEnactmentEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='deployment'
			{
				$current = grammarAccess.getRelationKindAccess().getDeploymentEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getRelationKindAccess().getDeploymentEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='input'
			{
				$current = grammarAccess.getRelationKindAccess().getInputEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getRelationKindAccess().getInputEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='output'
			{
				$current = grammarAccess.getRelationKindAccess().getOutputEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getRelationKindAccess().getOutputEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='measurement'
			{
				$current = grammarAccess.getRelationKindAccess().getMeasurementEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getRelationKindAccess().getMeasurementEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='otherInterplay'
			{
				$current = grammarAccess.getRelationKindAccess().getOtherInterplayEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getRelationKindAccess().getOtherInterplayEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='generalization'
			{
				$current = grammarAccess.getRelationKindAccess().getGeneralizationEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getRelationKindAccess().getGeneralizationEnumLiteralDeclaration_7());
			}
		)
		    |
		(
			enumLiteral_8='preparation'
			{
				$current = grammarAccess.getRelationKindAccess().getPreparationEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_8, grammarAccess.getRelationKindAccess().getPreparationEnumLiteralDeclaration_8());
			}
		)
		    |
		(
			enumLiteral_9='analysis'
			{
				$current = grammarAccess.getRelationKindAccess().getAnalysisEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_9, grammarAccess.getRelationKindAccess().getAnalysisEnumLiteralDeclaration_9());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
