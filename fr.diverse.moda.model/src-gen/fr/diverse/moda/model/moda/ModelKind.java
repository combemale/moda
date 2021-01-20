/**
 */
package fr.diverse.moda.model.moda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Model Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.diverse.moda.model.moda.ModaPackage#getModelKind()
 * @model
 * @generated
 */
public enum ModelKind implements Enumerator {
	/**
	 * The '<em><b>Prescriptive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	PRESCRIPTIVE(0, "prescriptive", "prescriptive"),

	/**
	 * The '<em><b>Predictive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREDICTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	PREDICTIVE(1, "predictive", "predictive"),

	/**
	 * The '<em><b>Descriptive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCRIPTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	DESCRIPTIVE(2, "descriptive", "descriptive");

	/**
	 * The '<em><b>Prescriptive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTIVE
	 * @model name="prescriptive"
	 * @generated
	 * @ordered
	 */
	public static final int PRESCRIPTIVE_VALUE = 0;

	/**
	 * The '<em><b>Predictive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREDICTIVE
	 * @model name="predictive"
	 * @generated
	 * @ordered
	 */
	public static final int PREDICTIVE_VALUE = 1;

	/**
	 * The '<em><b>Descriptive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCRIPTIVE
	 * @model name="descriptive"
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTIVE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Model Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModelKind[] VALUES_ARRAY = new ModelKind[] { PRESCRIPTIVE, PREDICTIVE, DESCRIPTIVE, };

	/**
	 * A public read-only list of all the '<em><b>Model Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModelKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Model Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelKind get(int value) {
		switch (value) {
		case PRESCRIPTIVE_VALUE:
			return PRESCRIPTIVE;
		case PREDICTIVE_VALUE:
			return PREDICTIVE;
		case DESCRIPTIVE_VALUE:
			return DESCRIPTIVE;
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
	private ModelKind(int value, String name, String literal) {
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

} //ModelKind
