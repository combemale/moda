/**
 */
package fr.diverse.moda.model.moda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Relation Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.diverse.moda.model.moda.ModaPackage#getRelationKind()
 * @model
 * @generated
 */
public enum RelationKind implements Enumerator {
	/**
	 * The '<em><b>Generation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERATION_VALUE
	 * @generated
	 * @ordered
	 */
	GENERATION(0, "generation", "generation"),

	/**
	 * The '<em><b>Enactment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENACTMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ENACTMENT(1, "enactment", "enactment"),

	/**
	 * The '<em><b>Deployment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DEPLOYMENT(2, "deployment", "deployment"),

	/**
	 * The '<em><b>Input</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	INPUT(3, "input", "input"),

	/**
	 * The '<em><b>Output</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTPUT_VALUE
	 * @generated
	 * @ordered
	 */
	OUTPUT(4, "output", "output"),

	/**
	 * The '<em><b>Measurement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEASUREMENT_VALUE
	 * @generated
	 * @ordered
	 */
	MEASUREMENT(5, "measurement", "measurement"),

	/**
	 * The '<em><b>Other Interplay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_INTERPLAY_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_INTERPLAY(6, "otherInterplay", "otherInterplay"),

	/**
	 * The '<em><b>Generalization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERALIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	GENERALIZATION(7, "generalization", "generalization"),

	/**
	 * The '<em><b>Preparation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREPARATION_VALUE
	 * @generated
	 * @ordered
	 */
	PREPARATION(8, "preparation", "preparation"),

	/**
	 * The '<em><b>Analysis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALYSIS_VALUE
	 * @generated
	 * @ordered
	 */
	ANALYSIS(9, "analysis", "analysis");

	/**
	 * The '<em><b>Generation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERATION
	 * @model name="generation"
	 * @generated
	 * @ordered
	 */
	public static final int GENERATION_VALUE = 0;

	/**
	 * The '<em><b>Enactment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENACTMENT
	 * @model name="enactment"
	 * @generated
	 * @ordered
	 */
	public static final int ENACTMENT_VALUE = 1;

	/**
	 * The '<em><b>Deployment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOYMENT
	 * @model name="deployment"
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_VALUE = 2;

	/**
	 * The '<em><b>Input</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT
	 * @model name="input"
	 * @generated
	 * @ordered
	 */
	public static final int INPUT_VALUE = 3;

	/**
	 * The '<em><b>Output</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTPUT
	 * @model name="output"
	 * @generated
	 * @ordered
	 */
	public static final int OUTPUT_VALUE = 4;

	/**
	 * The '<em><b>Measurement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEASUREMENT
	 * @model name="measurement"
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE = 5;

	/**
	 * The '<em><b>Other Interplay</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_INTERPLAY
	 * @model name="otherInterplay"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_INTERPLAY_VALUE = 6;

	/**
	 * The '<em><b>Generalization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERALIZATION
	 * @model name="generalization"
	 * @generated
	 * @ordered
	 */
	public static final int GENERALIZATION_VALUE = 7;

	/**
	 * The '<em><b>Preparation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREPARATION
	 * @model name="preparation"
	 * @generated
	 * @ordered
	 */
	public static final int PREPARATION_VALUE = 8;

	/**
	 * The '<em><b>Analysis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALYSIS
	 * @model name="analysis"
	 * @generated
	 * @ordered
	 */
	public static final int ANALYSIS_VALUE = 9;

	/**
	 * An array of all the '<em><b>Relation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RelationKind[] VALUES_ARRAY = new RelationKind[] { GENERATION, ENACTMENT, DEPLOYMENT, INPUT,
			OUTPUT, MEASUREMENT, OTHER_INTERPLAY, GENERALIZATION, PREPARATION, ANALYSIS, };

	/**
	 * A public read-only list of all the '<em><b>Relation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RelationKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Relation Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relation Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relation Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationKind get(int value) {
		switch (value) {
		case GENERATION_VALUE:
			return GENERATION;
		case ENACTMENT_VALUE:
			return ENACTMENT;
		case DEPLOYMENT_VALUE:
			return DEPLOYMENT;
		case INPUT_VALUE:
			return INPUT;
		case OUTPUT_VALUE:
			return OUTPUT;
		case MEASUREMENT_VALUE:
			return MEASUREMENT;
		case OTHER_INTERPLAY_VALUE:
			return OTHER_INTERPLAY;
		case GENERALIZATION_VALUE:
			return GENERALIZATION;
		case PREPARATION_VALUE:
			return PREPARATION;
		case ANALYSIS_VALUE:
			return ANALYSIS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RelationKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //RelationKind
