/**
 */
package fr.diverse.moda.model.moda;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.diverse.moda.model.moda.Data#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.diverse.moda.model.moda.Data#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see fr.diverse.moda.model.moda.ModaPackage#getData()
 * @model
 * @generated
 */
public interface Data extends MODAElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.diverse.moda.model.moda.DataKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see fr.diverse.moda.model.moda.DataKind
	 * @see #setKind(DataKind)
	 * @see fr.diverse.moda.model.moda.ModaPackage#getData_Kind()
	 * @model
	 * @generated
	 */
	DataKind getKind();

	/**
	 * Sets the value of the '{@link fr.diverse.moda.model.moda.Data#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see fr.diverse.moda.model.moda.DataKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(DataKind value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see fr.diverse.moda.model.moda.ModaPackage#getData_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fr.diverse.moda.model.moda.Data#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Data
