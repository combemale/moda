/*
 * generated by Xtext 2.24.0
 */
grammar InternalModa;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package fr.diverse.moda.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleMODAModel
entryRuleMODAModel
:
{ before(grammarAccess.getMODAModelRule()); }
	 ruleMODAModel
{ after(grammarAccess.getMODAModelRule()); } 
	 EOF 
;

// Rule MODAModel
ruleMODAModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMODAModelAccess().getGroup()); }
		(rule__MODAModel__Group__0)
		{ after(grammarAccess.getMODAModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getGroup()); }
		(rule__Model__Group__0)
		{ after(grammarAccess.getModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleData
entryRuleData
:
{ before(grammarAccess.getDataRule()); }
	 ruleData
{ after(grammarAccess.getDataRule()); } 
	 EOF 
;

// Rule Data
ruleData 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDataAccess().getGroup()); }
		(rule__Data__Group__0)
		{ after(grammarAccess.getDataAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRunningSoftware
entryRuleRunningSoftware
:
{ before(grammarAccess.getRunningSoftwareRule()); }
	 ruleRunningSoftware
{ after(grammarAccess.getRunningSoftwareRule()); } 
	 EOF 
;

// Rule RunningSoftware
ruleRunningSoftware 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRunningSoftwareAccess().getGroup()); }
		(rule__RunningSoftware__Group__0)
		{ after(grammarAccess.getRunningSoftwareAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSTS
entryRuleSTS
:
{ before(grammarAccess.getSTSRule()); }
	 ruleSTS
{ after(grammarAccess.getSTSRule()); } 
	 EOF 
;

// Rule STS
ruleSTS 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSTSAccess().getGroup()); }
		(rule__STS__Group__0)
		{ after(grammarAccess.getSTSAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMODARelation
entryRuleMODARelation
:
{ before(grammarAccess.getMODARelationRule()); }
	 ruleMODARelation
{ after(grammarAccess.getMODARelationRule()); } 
	 EOF 
;

// Rule MODARelation
ruleMODARelation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMODARelationAccess().getGroup()); }
		(rule__MODARelation__Group__0)
		{ after(grammarAccess.getMODARelationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule ModelKind
ruleModelKind
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelKindAccess().getAlternatives()); }
		(rule__ModelKind__Alternatives)
		{ after(grammarAccess.getModelKindAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule DataKind
ruleDataKind
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataKindAccess().getAlternatives()); }
		(rule__DataKind__Alternatives)
		{ after(grammarAccess.getDataKindAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule RelationKind
ruleRelationKind
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationKindAccess().getAlternatives()); }
		(rule__RelationKind__Alternatives)
		{ after(grammarAccess.getRelationKindAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODAModel__Alternatives_4_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMODAModelAccess().getModelAssignment_4_1_1_0()); }
		(rule__MODAModel__ModelAssignment_4_1_1_0)
		{ after(grammarAccess.getMODAModelAccess().getModelAssignment_4_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getMODAModelAccess().getDataAssignment_4_1_1_1()); }
		(rule__MODAModel__DataAssignment_4_1_1_1)
		{ after(grammarAccess.getMODAModelAccess().getDataAssignment_4_1_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getMODAModelAccess().getSoftwareAssignment_4_1_1_2()); }
		(rule__MODAModel__SoftwareAssignment_4_1_1_2)
		{ after(grammarAccess.getMODAModelAccess().getSoftwareAssignment_4_1_1_2()); }
	)
	|
	(
		{ before(grammarAccess.getMODAModelAccess().getStsAssignment_4_1_1_3()); }
		(rule__MODAModel__StsAssignment_4_1_1_3)
		{ after(grammarAccess.getMODAModelAccess().getStsAssignment_4_1_1_3()); }
	)
	|
	(
		{ before(grammarAccess.getMODAModelAccess().getModarelationAssignment_4_1_1_4()); }
		(rule__MODAModel__ModarelationAssignment_4_1_1_4)
		{ after(grammarAccess.getMODAModelAccess().getModarelationAssignment_4_1_1_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelKind__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelKindAccess().getPrescriptiveEnumLiteralDeclaration_0()); }
		('prescriptive')
		{ after(grammarAccess.getModelKindAccess().getPrescriptiveEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getModelKindAccess().getPredictiveEnumLiteralDeclaration_1()); }
		('predictive')
		{ after(grammarAccess.getModelKindAccess().getPredictiveEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getModelKindAccess().getDescriptiveEnumLiteralDeclaration_2()); }
		('descriptive')
		{ after(grammarAccess.getModelKindAccess().getDescriptiveEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataKind__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataKindAccess().getInputEnumLiteralDeclaration_0()); }
		('input')
		{ after(grammarAccess.getDataKindAccess().getInputEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getDataKindAccess().getOutputEnumLiteralDeclaration_1()); }
		('output')
		{ after(grammarAccess.getDataKindAccess().getOutputEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getDataKindAccess().getExternalEnumLiteralDeclaration_2()); }
		('external')
		{ after(grammarAccess.getDataKindAccess().getExternalEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getDataKindAccess().getMeasuredEnumLiteralDeclaration_3()); }
		('measured')
		{ after(grammarAccess.getDataKindAccess().getMeasuredEnumLiteralDeclaration_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationKind__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationKindAccess().getGenerationEnumLiteralDeclaration_0()); }
		('generation')
		{ after(grammarAccess.getRelationKindAccess().getGenerationEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getRelationKindAccess().getEnactmentEnumLiteralDeclaration_1()); }
		('enactment')
		{ after(grammarAccess.getRelationKindAccess().getEnactmentEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getRelationKindAccess().getDeploymentEnumLiteralDeclaration_2()); }
		('deployment')
		{ after(grammarAccess.getRelationKindAccess().getDeploymentEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getRelationKindAccess().getInputEnumLiteralDeclaration_3()); }
		('input')
		{ after(grammarAccess.getRelationKindAccess().getInputEnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getRelationKindAccess().getOutputEnumLiteralDeclaration_4()); }
		('output')
		{ after(grammarAccess.getRelationKindAccess().getOutputEnumLiteralDeclaration_4()); }
	)
	|
	(
		{ before(grammarAccess.getRelationKindAccess().getMeasurementEnumLiteralDeclaration_5()); }
		('measurement')
		{ after(grammarAccess.getRelationKindAccess().getMeasurementEnumLiteralDeclaration_5()); }
	)
	|
	(
		{ before(grammarAccess.getRelationKindAccess().getOtherInterplayEnumLiteralDeclaration_6()); }
		('otherInterplay')
		{ after(grammarAccess.getRelationKindAccess().getOtherInterplayEnumLiteralDeclaration_6()); }
	)
	|
	(
		{ before(grammarAccess.getRelationKindAccess().getGeneralizationEnumLiteralDeclaration_7()); }
		('generalization')
		{ after(grammarAccess.getRelationKindAccess().getGeneralizationEnumLiteralDeclaration_7()); }
	)
	|
	(
		{ before(grammarAccess.getRelationKindAccess().getPreparationEnumLiteralDeclaration_8()); }
		('preparation')
		{ after(grammarAccess.getRelationKindAccess().getPreparationEnumLiteralDeclaration_8()); }
	)
	|
	(
		{ before(grammarAccess.getRelationKindAccess().getAnalysisEnumLiteralDeclaration_9()); }
		('analysis')
		{ after(grammarAccess.getRelationKindAccess().getAnalysisEnumLiteralDeclaration_9()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODAModel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MODAModel__Group__0__Impl
	rule__MODAModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MODAModel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMODAModelAccess().getMODAModelAction_0()); }
	()
	{ after(grammarAccess.getMODAModelAccess().getMODAModelAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODAModel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MODAModel__Group__1__Impl
	rule__MODAModel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MODAModel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMODAModelAccess().getMODAModelKeyword_1()); }
	'MODAModel'
	{ after(grammarAccess.getMODAModelAccess().getMODAModelKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODAModel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MODAModel__Group__2__Impl
	rule__MODAModel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MODAModel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMODAModelAccess().getNameAssignment_2()); }
	(rule__MODAModel__NameAssignment_2)
	{ after(grammarAccess.getMODAModelAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODAModel__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MODAModel__Group__3__Impl
	rule__MODAModel__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MODAModel__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMODAModelAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getMODAModelAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODAModel__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MODAModel__Group__4__Impl
	rule__MODAModel__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MODAModel__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMODAModelAccess().getGroup_4()); }
	(rule__MODAModel__Group_4__0)?
	{ after(grammarAccess.getMODAModelAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODAModel__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MODAModel__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MODAModel__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMODAModelAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getMODAModelAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MODAModel__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MODAModel__Group_4__0__Impl
	rule__MODAModel__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MODAModel__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMODAModelAccess().getModelAssignment_4_0()); }
	(rule__MODAModel__ModelAssignment_4_0)
	{ after(grammarAccess.getMODAModelAccess().getModelAssignment_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODAModel__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MODAModel__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MODAModel__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMODAModelAccess().getGroup_4_1()); }
	(rule__MODAModel__Group_4_1__0)*
	{ after(grammarAccess.getMODAModelAccess().getGroup_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MODAModel__Group_4_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MODAModel__Group_4_1__0__Impl
	rule__MODAModel__Group_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MODAModel__Group_4_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMODAModelAccess().getCommaKeyword_4_1_0()); }
	','
	{ after(grammarAccess.getMODAModelAccess().getCommaKeyword_4_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODAModel__Group_4_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MODAModel__Group_4_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MODAModel__Group_4_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMODAModelAccess().getAlternatives_4_1_1()); }
	(rule__MODAModel__Alternatives_4_1_1)
	{ after(grammarAccess.getMODAModelAccess().getAlternatives_4_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getModelAction_0()); }
	()
	{ after(grammarAccess.getModelAccess().getModelAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__1__Impl
	rule__Model__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getModelKeyword_1()); }
	'model'
	{ after(grammarAccess.getModelAccess().getModelKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__2__Impl
	rule__Model__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getNameAssignment_2()); }
	(rule__Model__NameAssignment_2)
	{ after(grammarAccess.getModelAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__3__Impl
	rule__Model__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getKindAssignment_3()); }
	(rule__Model__KindAssignment_3)
	{ after(grammarAccess.getModelAccess().getKindAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getDescriptionAssignment_4()); }
	(rule__Model__DescriptionAssignment_4)?
	{ after(grammarAccess.getModelAccess().getDescriptionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Data__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Data__Group__0__Impl
	rule__Data__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Data__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataAccess().getDataAction_0()); }
	()
	{ after(grammarAccess.getDataAccess().getDataAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Data__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Data__Group__1__Impl
	rule__Data__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Data__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataAccess().getDataKeyword_1()); }
	'data'
	{ after(grammarAccess.getDataAccess().getDataKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Data__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Data__Group__2__Impl
	rule__Data__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Data__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataAccess().getNameAssignment_2()); }
	(rule__Data__NameAssignment_2)
	{ after(grammarAccess.getDataAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Data__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Data__Group__3__Impl
	rule__Data__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Data__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataAccess().getKindAssignment_3()); }
	(rule__Data__KindAssignment_3)
	{ after(grammarAccess.getDataAccess().getKindAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Data__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Data__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Data__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataAccess().getDescriptionAssignment_4()); }
	(rule__Data__DescriptionAssignment_4)?
	{ after(grammarAccess.getDataAccess().getDescriptionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RunningSoftware__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RunningSoftware__Group__0__Impl
	rule__RunningSoftware__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RunningSoftware__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRunningSoftwareAccess().getRunningSoftwareAction_0()); }
	()
	{ after(grammarAccess.getRunningSoftwareAccess().getRunningSoftwareAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RunningSoftware__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RunningSoftware__Group__1__Impl
	rule__RunningSoftware__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RunningSoftware__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRunningSoftwareAccess().getSoftwareKeyword_1()); }
	'software'
	{ after(grammarAccess.getRunningSoftwareAccess().getSoftwareKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RunningSoftware__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RunningSoftware__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RunningSoftware__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRunningSoftwareAccess().getNameAssignment_2()); }
	(rule__RunningSoftware__NameAssignment_2)
	{ after(grammarAccess.getRunningSoftwareAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__STS__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__STS__Group__0__Impl
	rule__STS__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__STS__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSTSAccess().getSTSAction_0()); }
	()
	{ after(grammarAccess.getSTSAccess().getSTSAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__STS__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__STS__Group__1__Impl
	rule__STS__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__STS__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSTSAccess().getStsKeyword_1()); }
	'sts'
	{ after(grammarAccess.getSTSAccess().getStsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__STS__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__STS__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__STS__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSTSAccess().getNameAssignment_2()); }
	(rule__STS__NameAssignment_2)
	{ after(grammarAccess.getSTSAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MODARelation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MODARelation__Group__0__Impl
	rule__MODARelation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MODARelation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMODARelationAccess().getMODARelationAction_0()); }
	()
	{ after(grammarAccess.getMODARelationAccess().getMODARelationAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODARelation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MODARelation__Group__1__Impl
	rule__MODARelation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MODARelation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMODARelationAccess().getRelationKeyword_1()); }
	'relation'
	{ after(grammarAccess.getMODARelationAccess().getRelationKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODARelation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MODARelation__Group__2__Impl
	rule__MODARelation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MODARelation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMODARelationAccess().getNameAssignment_2()); }
	(rule__MODARelation__NameAssignment_2)
	{ after(grammarAccess.getMODARelationAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODARelation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MODARelation__Group__3__Impl
	rule__MODARelation__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MODARelation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMODARelationAccess().getKindAssignment_3()); }
	(rule__MODARelation__KindAssignment_3)
	{ after(grammarAccess.getMODARelationAccess().getKindAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODARelation__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MODARelation__Group__4__Impl
	rule__MODARelation__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MODARelation__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMODARelationAccess().getSrcAssignment_4()); }
	(rule__MODARelation__SrcAssignment_4)
	{ after(grammarAccess.getMODARelationAccess().getSrcAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODARelation__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MODARelation__Group__5__Impl
	rule__MODARelation__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MODARelation__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMODARelationAccess().getHyphenMinusGreaterThanSignKeyword_5()); }
	'->'
	{ after(grammarAccess.getMODARelationAccess().getHyphenMinusGreaterThanSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODARelation__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MODARelation__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MODARelation__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMODARelationAccess().getTgtAssignment_6()); }
	(rule__MODARelation__TgtAssignment_6)
	{ after(grammarAccess.getMODARelationAccess().getTgtAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MODAModel__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMODAModelAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getMODAModelAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODAModel__ModelAssignment_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMODAModelAccess().getModelModelParserRuleCall_4_0_0()); }
		ruleModel
		{ after(grammarAccess.getMODAModelAccess().getModelModelParserRuleCall_4_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODAModel__ModelAssignment_4_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMODAModelAccess().getModelModelParserRuleCall_4_1_1_0_0()); }
		ruleModel
		{ after(grammarAccess.getMODAModelAccess().getModelModelParserRuleCall_4_1_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODAModel__DataAssignment_4_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMODAModelAccess().getDataDataParserRuleCall_4_1_1_1_0()); }
		ruleData
		{ after(grammarAccess.getMODAModelAccess().getDataDataParserRuleCall_4_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODAModel__SoftwareAssignment_4_1_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMODAModelAccess().getSoftwareRunningSoftwareParserRuleCall_4_1_1_2_0()); }
		ruleRunningSoftware
		{ after(grammarAccess.getMODAModelAccess().getSoftwareRunningSoftwareParserRuleCall_4_1_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODAModel__StsAssignment_4_1_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMODAModelAccess().getStsSTSParserRuleCall_4_1_1_3_0()); }
		ruleSTS
		{ after(grammarAccess.getMODAModelAccess().getStsSTSParserRuleCall_4_1_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODAModel__ModarelationAssignment_4_1_1_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMODAModelAccess().getModarelationMODARelationParserRuleCall_4_1_1_4_0()); }
		ruleMODARelation
		{ after(grammarAccess.getMODAModelAccess().getModarelationMODARelationParserRuleCall_4_1_1_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__KindAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getKindModelKindEnumRuleCall_3_0()); }
		ruleModelKind
		{ after(grammarAccess.getModelAccess().getKindModelKindEnumRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__DescriptionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getDescriptionEStringParserRuleCall_4_0()); }
		ruleEString
		{ after(grammarAccess.getModelAccess().getDescriptionEStringParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Data__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getDataAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Data__KindAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataAccess().getKindDataKindEnumRuleCall_3_0()); }
		ruleDataKind
		{ after(grammarAccess.getDataAccess().getKindDataKindEnumRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Data__DescriptionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataAccess().getDescriptionEStringParserRuleCall_4_0()); }
		ruleEString
		{ after(grammarAccess.getDataAccess().getDescriptionEStringParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RunningSoftware__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRunningSoftwareAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getRunningSoftwareAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__STS__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSTSAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getSTSAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODARelation__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMODARelationAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getMODARelationAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODARelation__KindAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMODARelationAccess().getKindRelationKindEnumRuleCall_3_0()); }
		ruleRelationKind
		{ after(grammarAccess.getMODARelationAccess().getKindRelationKindEnumRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODARelation__SrcAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMODARelationAccess().getSrcMODAElementCrossReference_4_0()); }
		(
			{ before(grammarAccess.getMODARelationAccess().getSrcMODAElementEStringParserRuleCall_4_0_1()); }
			ruleEString
			{ after(grammarAccess.getMODARelationAccess().getSrcMODAElementEStringParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getMODARelationAccess().getSrcMODAElementCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODARelation__TgtAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMODARelationAccess().getTgtMODAElementCrossReference_6_0()); }
		(
			{ before(grammarAccess.getMODARelationAccess().getTgtMODAElementEStringParserRuleCall_6_0_1()); }
			ruleEString
			{ after(grammarAccess.getMODARelationAccess().getTgtMODAElementEStringParserRuleCall_6_0_1()); }
		)
		{ after(grammarAccess.getMODARelationAccess().getTgtMODAElementCrossReference_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
