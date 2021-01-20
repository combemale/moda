/**
 */
package fr.diverse.moda.model.moda;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MODA Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.diverse.moda.model.moda.MODAModel#getModel <em>Model</em>}</li>
 *   <li>{@link fr.diverse.moda.model.moda.MODAModel#getData <em>Data</em>}</li>
 *   <li>{@link fr.diverse.moda.model.moda.MODAModel#getSoftware <em>Software</em>}</li>
 *   <li>{@link fr.diverse.moda.model.moda.MODAModel#getSts <em>Sts</em>}</li>
 *   <li>{@link fr.diverse.moda.model.moda.MODAModel#getModarelation <em>Modarelation</em>}</li>
 *   <li>{@link fr.diverse.moda.model.moda.MODAModel#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fr.diverse.moda.model.moda.ModaPackage#getMODAModel()
 * @model
 * @generated
 */
public interface MODAModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference list.
	 * The list contents are of type {@link fr.diverse.moda.model.moda.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference list.
	 * @see fr.diverse.moda.model.moda.ModaPackage#getMODAModel_Model()
	 * @model containment="true"
	 * @generated
	 */
	EList<Model> getModel();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link fr.diverse.moda.model.moda.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see fr.diverse.moda.model.moda.ModaPackage#getMODAModel_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * Returns the value of the '<em><b>Software</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software</em>' containment reference.
	 * @see #setSoftware(RunningSoftware)
	 * @see fr.diverse.moda.model.moda.ModaPackage#getMODAModel_Software()
	 * @model containment="true"
	 * @generated
	 */
	RunningSoftware getSoftware();

	/**
	 * Sets the value of the '{@link fr.diverse.moda.model.moda.MODAModel#getSoftware <em>Software</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software</em>' containment reference.
	 * @see #getSoftware()
	 * @generated
	 */
	void setSoftware(RunningSoftware value);

	/**
	 * Returns the value of the '<em><b>Sts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sts</em>' containment reference.
	 * @see #setSts(STS)
	 * @see fr.diverse.moda.model.moda.ModaPackage#getMODAModel_Sts()
	 * @model containment="true"
	 * @generated
	 */
	STS getSts();

	/**
	 * Sets the value of the '{@link fr.diverse.moda.model.moda.MODAModel#getSts <em>Sts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sts</em>' containment reference.
	 * @see #getSts()
	 * @generated
	 */
	void setSts(STS value);

	/**
	 * Returns the value of the '<em><b>Modarelation</b></em>' containment reference list.
	 * The list contents are of type {@link fr.diverse.moda.model.moda.MODARelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modarelation</em>' containment reference list.
	 * @see fr.diverse.moda.model.moda.ModaPackage#getMODAModel_Modarelation()
	 * @model containment="true"
	 * @generated
	 */
	EList<MODARelation> getModarelation();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.diverse.moda.model.moda.ModaPackage#getMODAModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.diverse.moda.model.moda.MODAModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // MODAModel
