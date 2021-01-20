/**
 */
package fr.diverse.moda.model.moda;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.diverse.moda.model.moda.ModaPackage
 * @generated
 */
public interface ModaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModaFactory eINSTANCE = fr.diverse.moda.model.moda.impl.ModaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MODA Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MODA Model</em>'.
	 * @generated
	 */
	MODAModel createMODAModel();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data</em>'.
	 * @generated
	 */
	Data createData();

	/**
	 * Returns a new object of class '<em>Running Software</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Running Software</em>'.
	 * @generated
	 */
	RunningSoftware createRunningSoftware();

	/**
	 * Returns a new object of class '<em>STS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>STS</em>'.
	 * @generated
	 */
	STS createSTS();

	/**
	 * Returns a new object of class '<em>MODA Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MODA Relation</em>'.
	 * @generated
	 */
	MODARelation createMODARelation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModaPackage getModaPackage();

} //ModaFactory
