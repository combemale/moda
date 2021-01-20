/**
 */
package fr.diverse.moda.model.moda;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MODA Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.diverse.moda.model.moda.MODAElement#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link fr.diverse.moda.model.moda.MODAElement#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link fr.diverse.moda.model.moda.MODAElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fr.diverse.moda.model.moda.ModaPackage#getMODAElement()
 * @model abstract="true"
 * @generated
 */
public interface MODAElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link fr.diverse.moda.model.moda.MODARelation}.
	 * It is bidirectional and its opposite is '{@link fr.diverse.moda.model.moda.MODARelation#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see fr.diverse.moda.model.moda.ModaPackage#getMODAElement_Outgoing()
	 * @see fr.diverse.moda.model.moda.MODARelation#getSrc
	 * @model opposite="src"
	 * @generated
	 */
	EList<MODARelation> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link fr.diverse.moda.model.moda.MODARelation}.
	 * It is bidirectional and its opposite is '{@link fr.diverse.moda.model.moda.MODARelation#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see fr.diverse.moda.model.moda.ModaPackage#getMODAElement_Incoming()
	 * @see fr.diverse.moda.model.moda.MODARelation#getTgt
	 * @model opposite="tgt"
	 * @generated
	 */
	EList<MODARelation> getIncoming();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.diverse.moda.model.moda.ModaPackage#getMODAElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.diverse.moda.model.moda.MODAElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // MODAElement
