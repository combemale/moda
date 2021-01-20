/**
 */
package fr.diverse.moda.model.moda;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.diverse.moda.model.moda.ModaFactory
 * @model kind="package"
 * @generated
 */
public interface ModaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "moda";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.diverse.fr/moda";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "moda";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModaPackage eINSTANCE = fr.diverse.moda.model.moda.impl.ModaPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.diverse.moda.model.moda.impl.MODAModelImpl <em>MODA Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.diverse.moda.model.moda.impl.MODAModelImpl
	 * @see fr.diverse.moda.model.moda.impl.ModaPackageImpl#getMODAModel()
	 * @generated
	 */
	int MODA_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_MODEL__MODEL = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_MODEL__DATA = 1;

	/**
	 * The feature id for the '<em><b>Software</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_MODEL__SOFTWARE = 2;

	/**
	 * The feature id for the '<em><b>Sts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_MODEL__STS = 3;

	/**
	 * The feature id for the '<em><b>Modarelation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_MODEL__MODARELATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_MODEL__NAME = 5;

	/**
	 * The number of structural features of the '<em>MODA Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_MODEL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>MODA Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.diverse.moda.model.moda.impl.MODAElementImpl <em>MODA Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.diverse.moda.model.moda.impl.MODAElementImpl
	 * @see fr.diverse.moda.model.moda.impl.ModaPackageImpl#getMODAElement()
	 * @generated
	 */
	int MODA_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_ELEMENT__OUTGOING = 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_ELEMENT__INCOMING = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_ELEMENT__NAME = 2;

	/**
	 * The number of structural features of the '<em>MODA Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>MODA Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.diverse.moda.model.moda.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.diverse.moda.model.moda.impl.ModelImpl
	 * @see fr.diverse.moda.model.moda.impl.ModaPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OUTGOING = MODA_ELEMENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__INCOMING = MODA_ELEMENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = MODA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__KIND = MODA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DESCRIPTION = MODA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = MODA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = MODA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.diverse.moda.model.moda.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.diverse.moda.model.moda.impl.DataImpl
	 * @see fr.diverse.moda.model.moda.impl.ModaPackageImpl#getData()
	 * @generated
	 */
	int DATA = 2;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__OUTGOING = MODA_ELEMENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__INCOMING = MODA_ELEMENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = MODA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__KIND = MODA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DESCRIPTION = MODA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = MODA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = MODA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.diverse.moda.model.moda.impl.RunningSoftwareImpl <em>Running Software</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.diverse.moda.model.moda.impl.RunningSoftwareImpl
	 * @see fr.diverse.moda.model.moda.impl.ModaPackageImpl#getRunningSoftware()
	 * @generated
	 */
	int RUNNING_SOFTWARE = 3;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_SOFTWARE__OUTGOING = MODA_ELEMENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_SOFTWARE__INCOMING = MODA_ELEMENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_SOFTWARE__NAME = MODA_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Running Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_SOFTWARE_FEATURE_COUNT = MODA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Running Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_SOFTWARE_OPERATION_COUNT = MODA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.diverse.moda.model.moda.impl.STSImpl <em>STS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.diverse.moda.model.moda.impl.STSImpl
	 * @see fr.diverse.moda.model.moda.impl.ModaPackageImpl#getSTS()
	 * @generated
	 */
	int STS = 4;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STS__OUTGOING = MODA_ELEMENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STS__INCOMING = MODA_ELEMENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STS__NAME = MODA_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>STS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STS_FEATURE_COUNT = MODA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>STS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STS_OPERATION_COUNT = MODA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.diverse.moda.model.moda.impl.MODARelationImpl <em>MODA Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.diverse.moda.model.moda.impl.MODARelationImpl
	 * @see fr.diverse.moda.model.moda.impl.ModaPackageImpl#getMODARelation()
	 * @generated
	 */
	int MODA_RELATION = 6;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_RELATION__SRC = 0;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_RELATION__TGT = 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_RELATION__KIND = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_RELATION__NAME = 3;

	/**
	 * The number of structural features of the '<em>MODA Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_RELATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>MODA Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.diverse.moda.model.moda.DataKind <em>Data Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.diverse.moda.model.moda.DataKind
	 * @see fr.diverse.moda.model.moda.impl.ModaPackageImpl#getDataKind()
	 * @generated
	 */
	int DATA_KIND = 7;

	/**
	 * The meta object id for the '{@link fr.diverse.moda.model.moda.ModelKind <em>Model Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.diverse.moda.model.moda.ModelKind
	 * @see fr.diverse.moda.model.moda.impl.ModaPackageImpl#getModelKind()
	 * @generated
	 */
	int MODEL_KIND = 8;

	/**
	 * The meta object id for the '{@link fr.diverse.moda.model.moda.RelationKind <em>Relation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.diverse.moda.model.moda.RelationKind
	 * @see fr.diverse.moda.model.moda.impl.ModaPackageImpl#getRelationKind()
	 * @generated
	 */
	int RELATION_KIND = 9;

	/**
	 * Returns the meta object for class '{@link fr.diverse.moda.model.moda.MODAModel <em>MODA Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MODA Model</em>'.
	 * @see fr.diverse.moda.model.moda.MODAModel
	 * @generated
	 */
	EClass getMODAModel();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.diverse.moda.model.moda.MODAModel#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model</em>'.
	 * @see fr.diverse.moda.model.moda.MODAModel#getModel()
	 * @see #getMODAModel()
	 * @generated
	 */
	EReference getMODAModel_Model();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.diverse.moda.model.moda.MODAModel#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see fr.diverse.moda.model.moda.MODAModel#getData()
	 * @see #getMODAModel()
	 * @generated
	 */
	EReference getMODAModel_Data();

	/**
	 * Returns the meta object for the containment reference '{@link fr.diverse.moda.model.moda.MODAModel#getSoftware <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Software</em>'.
	 * @see fr.diverse.moda.model.moda.MODAModel#getSoftware()
	 * @see #getMODAModel()
	 * @generated
	 */
	EReference getMODAModel_Software();

	/**
	 * Returns the meta object for the containment reference '{@link fr.diverse.moda.model.moda.MODAModel#getSts <em>Sts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sts</em>'.
	 * @see fr.diverse.moda.model.moda.MODAModel#getSts()
	 * @see #getMODAModel()
	 * @generated
	 */
	EReference getMODAModel_Sts();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.diverse.moda.model.moda.MODAModel#getModarelation <em>Modarelation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modarelation</em>'.
	 * @see fr.diverse.moda.model.moda.MODAModel#getModarelation()
	 * @see #getMODAModel()
	 * @generated
	 */
	EReference getMODAModel_Modarelation();

	/**
	 * Returns the meta object for the attribute '{@link fr.diverse.moda.model.moda.MODAModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.diverse.moda.model.moda.MODAModel#getName()
	 * @see #getMODAModel()
	 * @generated
	 */
	EAttribute getMODAModel_Name();

	/**
	 * Returns the meta object for class '{@link fr.diverse.moda.model.moda.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see fr.diverse.moda.model.moda.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link fr.diverse.moda.model.moda.Model#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see fr.diverse.moda.model.moda.Model#getKind()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Kind();

	/**
	 * Returns the meta object for the attribute '{@link fr.diverse.moda.model.moda.Model#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.diverse.moda.model.moda.Model#getDescription()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Description();

	/**
	 * Returns the meta object for class '{@link fr.diverse.moda.model.moda.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see fr.diverse.moda.model.moda.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link fr.diverse.moda.model.moda.Data#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see fr.diverse.moda.model.moda.Data#getKind()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Kind();

	/**
	 * Returns the meta object for the attribute '{@link fr.diverse.moda.model.moda.Data#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.diverse.moda.model.moda.Data#getDescription()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Description();

	/**
	 * Returns the meta object for class '{@link fr.diverse.moda.model.moda.RunningSoftware <em>Running Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Running Software</em>'.
	 * @see fr.diverse.moda.model.moda.RunningSoftware
	 * @generated
	 */
	EClass getRunningSoftware();

	/**
	 * Returns the meta object for class '{@link fr.diverse.moda.model.moda.STS <em>STS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>STS</em>'.
	 * @see fr.diverse.moda.model.moda.STS
	 * @generated
	 */
	EClass getSTS();

	/**
	 * Returns the meta object for class '{@link fr.diverse.moda.model.moda.MODAElement <em>MODA Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MODA Element</em>'.
	 * @see fr.diverse.moda.model.moda.MODAElement
	 * @generated
	 */
	EClass getMODAElement();

	/**
	 * Returns the meta object for the reference list '{@link fr.diverse.moda.model.moda.MODAElement#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see fr.diverse.moda.model.moda.MODAElement#getOutgoing()
	 * @see #getMODAElement()
	 * @generated
	 */
	EReference getMODAElement_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link fr.diverse.moda.model.moda.MODAElement#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see fr.diverse.moda.model.moda.MODAElement#getIncoming()
	 * @see #getMODAElement()
	 * @generated
	 */
	EReference getMODAElement_Incoming();

	/**
	 * Returns the meta object for the attribute '{@link fr.diverse.moda.model.moda.MODAElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.diverse.moda.model.moda.MODAElement#getName()
	 * @see #getMODAElement()
	 * @generated
	 */
	EAttribute getMODAElement_Name();

	/**
	 * Returns the meta object for class '{@link fr.diverse.moda.model.moda.MODARelation <em>MODA Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MODA Relation</em>'.
	 * @see fr.diverse.moda.model.moda.MODARelation
	 * @generated
	 */
	EClass getMODARelation();

	/**
	 * Returns the meta object for the reference '{@link fr.diverse.moda.model.moda.MODARelation#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see fr.diverse.moda.model.moda.MODARelation#getSrc()
	 * @see #getMODARelation()
	 * @generated
	 */
	EReference getMODARelation_Src();

	/**
	 * Returns the meta object for the reference '{@link fr.diverse.moda.model.moda.MODARelation#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt</em>'.
	 * @see fr.diverse.moda.model.moda.MODARelation#getTgt()
	 * @see #getMODARelation()
	 * @generated
	 */
	EReference getMODARelation_Tgt();

	/**
	 * Returns the meta object for the attribute '{@link fr.diverse.moda.model.moda.MODARelation#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see fr.diverse.moda.model.moda.MODARelation#getKind()
	 * @see #getMODARelation()
	 * @generated
	 */
	EAttribute getMODARelation_Kind();

	/**
	 * Returns the meta object for the attribute '{@link fr.diverse.moda.model.moda.MODARelation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.diverse.moda.model.moda.MODARelation#getName()
	 * @see #getMODARelation()
	 * @generated
	 */
	EAttribute getMODARelation_Name();

	/**
	 * Returns the meta object for enum '{@link fr.diverse.moda.model.moda.DataKind <em>Data Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Kind</em>'.
	 * @see fr.diverse.moda.model.moda.DataKind
	 * @generated
	 */
	EEnum getDataKind();

	/**
	 * Returns the meta object for enum '{@link fr.diverse.moda.model.moda.ModelKind <em>Model Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Model Kind</em>'.
	 * @see fr.diverse.moda.model.moda.ModelKind
	 * @generated
	 */
	EEnum getModelKind();

	/**
	 * Returns the meta object for enum '{@link fr.diverse.moda.model.moda.RelationKind <em>Relation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relation Kind</em>'.
	 * @see fr.diverse.moda.model.moda.RelationKind
	 * @generated
	 */
	EEnum getRelationKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModaFactory getModaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.diverse.moda.model.moda.impl.MODAModelImpl <em>MODA Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.diverse.moda.model.moda.impl.MODAModelImpl
		 * @see fr.diverse.moda.model.moda.impl.ModaPackageImpl#getMODAModel()
		 * @generated
		 */
		EClass MODA_MODEL = eINSTANCE.getMODAModel();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODA_MODEL__MODEL = eINSTANCE.getMODAModel_Model();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODA_MODEL__DATA = eINSTANCE.getMODAModel_Data();

		/**
		 * The meta object literal for the '<em><b>Software</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODA_MODEL__SOFTWARE = eINSTANCE.getMODAModel_Software();

		/**
		 * The meta object literal for the '<em><b>Sts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODA_MODEL__STS = eINSTANCE.getMODAModel_Sts();

		/**
		 * The meta object literal for the '<em><b>Modarelation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODA_MODEL__MODARELATION = eINSTANCE.getMODAModel_Modarelation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODA_MODEL__NAME = eINSTANCE.getMODAModel_Name();

		/**
		 * The meta object literal for the '{@link fr.diverse.moda.model.moda.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.diverse.moda.model.moda.impl.ModelImpl
		 * @see fr.diverse.moda.model.moda.impl.ModaPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__KIND = eINSTANCE.getModel_Kind();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__DESCRIPTION = eINSTANCE.getModel_Description();

		/**
		 * The meta object literal for the '{@link fr.diverse.moda.model.moda.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.diverse.moda.model.moda.impl.DataImpl
		 * @see fr.diverse.moda.model.moda.impl.ModaPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__KIND = eINSTANCE.getData_Kind();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__DESCRIPTION = eINSTANCE.getData_Description();

		/**
		 * The meta object literal for the '{@link fr.diverse.moda.model.moda.impl.RunningSoftwareImpl <em>Running Software</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.diverse.moda.model.moda.impl.RunningSoftwareImpl
		 * @see fr.diverse.moda.model.moda.impl.ModaPackageImpl#getRunningSoftware()
		 * @generated
		 */
		EClass RUNNING_SOFTWARE = eINSTANCE.getRunningSoftware();

		/**
		 * The meta object literal for the '{@link fr.diverse.moda.model.moda.impl.STSImpl <em>STS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.diverse.moda.model.moda.impl.STSImpl
		 * @see fr.diverse.moda.model.moda.impl.ModaPackageImpl#getSTS()
		 * @generated
		 */
		EClass STS = eINSTANCE.getSTS();

		/**
		 * The meta object literal for the '{@link fr.diverse.moda.model.moda.impl.MODAElementImpl <em>MODA Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.diverse.moda.model.moda.impl.MODAElementImpl
		 * @see fr.diverse.moda.model.moda.impl.ModaPackageImpl#getMODAElement()
		 * @generated
		 */
		EClass MODA_ELEMENT = eINSTANCE.getMODAElement();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODA_ELEMENT__OUTGOING = eINSTANCE.getMODAElement_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODA_ELEMENT__INCOMING = eINSTANCE.getMODAElement_Incoming();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODA_ELEMENT__NAME = eINSTANCE.getMODAElement_Name();

		/**
		 * The meta object literal for the '{@link fr.diverse.moda.model.moda.impl.MODARelationImpl <em>MODA Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.diverse.moda.model.moda.impl.MODARelationImpl
		 * @see fr.diverse.moda.model.moda.impl.ModaPackageImpl#getMODARelation()
		 * @generated
		 */
		EClass MODA_RELATION = eINSTANCE.getMODARelation();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODA_RELATION__SRC = eINSTANCE.getMODARelation_Src();

		/**
		 * The meta object literal for the '<em><b>Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODA_RELATION__TGT = eINSTANCE.getMODARelation_Tgt();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODA_RELATION__KIND = eINSTANCE.getMODARelation_Kind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODA_RELATION__NAME = eINSTANCE.getMODARelation_Name();

		/**
		 * The meta object literal for the '{@link fr.diverse.moda.model.moda.DataKind <em>Data Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.diverse.moda.model.moda.DataKind
		 * @see fr.diverse.moda.model.moda.impl.ModaPackageImpl#getDataKind()
		 * @generated
		 */
		EEnum DATA_KIND = eINSTANCE.getDataKind();

		/**
		 * The meta object literal for the '{@link fr.diverse.moda.model.moda.ModelKind <em>Model Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.diverse.moda.model.moda.ModelKind
		 * @see fr.diverse.moda.model.moda.impl.ModaPackageImpl#getModelKind()
		 * @generated
		 */
		EEnum MODEL_KIND = eINSTANCE.getModelKind();

		/**
		 * The meta object literal for the '{@link fr.diverse.moda.model.moda.RelationKind <em>Relation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.diverse.moda.model.moda.RelationKind
		 * @see fr.diverse.moda.model.moda.impl.ModaPackageImpl#getRelationKind()
		 * @generated
		 */
		EEnum RELATION_KIND = eINSTANCE.getRelationKind();

	}

} //ModaPackage
