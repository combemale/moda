/**
 */
package fr.diverse.moda.model.moda;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MODA Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.diverse.moda.model.moda.MODARelation#getSrc <em>Src</em>}</li>
 *   <li>{@link fr.diverse.moda.model.moda.MODARelation#getTgt <em>Tgt</em>}</li>
 *   <li>{@link fr.diverse.moda.model.moda.MODARelation#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.diverse.moda.model.moda.MODARelation#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fr.diverse.moda.model.moda.ModaPackage#getMODARelation()
 * @model
 * @generated
 */
public interface MODARelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.diverse.moda.model.moda.MODAElement#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(MODAElement)
	 * @see fr.diverse.moda.model.moda.ModaPackage#getMODARelation_Src()
	 * @see fr.diverse.moda.model.moda.MODAElement#getOutgoing
	 * @model opposite="outgoing"
	 * @generated
	 */
	MODAElement getSrc();

	/**
	 * Sets the value of the '{@link fr.diverse.moda.model.moda.MODARelation#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(MODAElement value);

	/**
	 * Returns the value of the '<em><b>Tgt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.diverse.moda.model.moda.MODAElement#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgt</em>' reference.
	 * @see #setTgt(MODAElement)
	 * @see fr.diverse.moda.model.moda.ModaPackage#getMODARelation_Tgt()
	 * @see fr.diverse.moda.model.moda.MODAElement#getIncoming
	 * @model opposite="incoming"
	 * @generated
	 */
	MODAElement getTgt();

	/**
	 * Sets the value of the '{@link fr.diverse.moda.model.moda.MODARelation#getTgt <em>Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt</em>' reference.
	 * @see #getTgt()
	 * @generated
	 */
	void setTgt(MODAElement value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.diverse.moda.model.moda.RelationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see fr.diverse.moda.model.moda.RelationKind
	 * @see #setKind(RelationKind)
	 * @see fr.diverse.moda.model.moda.ModaPackage#getMODARelation_Kind()
	 * @model
	 * @generated
	 */
	RelationKind getKind();

	/**
	 * Sets the value of the '{@link fr.diverse.moda.model.moda.MODARelation#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see fr.diverse.moda.model.moda.RelationKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(RelationKind value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.diverse.moda.model.moda.ModaPackage#getMODARelation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.diverse.moda.model.moda.MODARelation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // MODARelation
