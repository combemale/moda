/**
 */
package fr.diverse.moda.model.moda.impl;

import fr.diverse.moda.model.moda.Data;
import fr.diverse.moda.model.moda.DataKind;
import fr.diverse.moda.model.moda.MODAElement;
import fr.diverse.moda.model.moda.MODAModel;
import fr.diverse.moda.model.moda.MODARelation;
import fr.diverse.moda.model.moda.ModaFactory;
import fr.diverse.moda.model.moda.ModaPackage;
import fr.diverse.moda.model.moda.Model;
import fr.diverse.moda.model.moda.ModelKind;
import fr.diverse.moda.model.moda.RelationKind;
import fr.diverse.moda.model.moda.RunningSoftware;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModaPackageImpl extends EPackageImpl implements ModaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modaModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runningSoftwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modaElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modaRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.diverse.moda.model.moda.ModaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModaPackageImpl() {
		super(eNS_URI, ModaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ModaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModaPackage init() {
		if (isInited)
			return (ModaPackage) EPackage.Registry.INSTANCE.getEPackage(ModaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ModaPackageImpl theModaPackage = registeredModaPackage instanceof ModaPackageImpl
				? (ModaPackageImpl) registeredModaPackage
				: new ModaPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theModaPackage.createPackageContents();

		// Initialize created meta-data
		theModaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModaPackage.eNS_URI, theModaPackage);
		return theModaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMODAModel() {
		return modaModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMODAModel_Model() {
		return (EReference) modaModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMODAModel_Data() {
		return (EReference) modaModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMODAModel_Software() {
		return (EReference) modaModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMODAModel_Sts() {
		return (EReference) modaModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMODAModel_Modarelation() {
		return (EReference) modaModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMODAModel_Name() {
		return (EAttribute) modaModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Kind() {
		return (EAttribute) modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Description() {
		return (EAttribute) modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Kind() {
		return (EAttribute) dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Description() {
		return (EAttribute) dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunningSoftware() {
		return runningSoftwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSTS() {
		return stsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMODAElement() {
		return modaElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMODAElement_Outgoing() {
		return (EReference) modaElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMODAElement_Incoming() {
		return (EReference) modaElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMODAElement_Name() {
		return (EAttribute) modaElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMODARelation() {
		return modaRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMODARelation_Src() {
		return (EReference) modaRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMODARelation_Tgt() {
		return (EReference) modaRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMODARelation_Kind() {
		return (EAttribute) modaRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMODARelation_Name() {
		return (EAttribute) modaRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataKind() {
		return dataKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModelKind() {
		return modelKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationKind() {
		return relationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModaFactory getModaFactory() {
		return (ModaFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		modaModelEClass = createEClass(MODA_MODEL);
		createEReference(modaModelEClass, MODA_MODEL__MODEL);
		createEReference(modaModelEClass, MODA_MODEL__DATA);
		createEReference(modaModelEClass, MODA_MODEL__SOFTWARE);
		createEReference(modaModelEClass, MODA_MODEL__STS);
		createEReference(modaModelEClass, MODA_MODEL__MODARELATION);
		createEAttribute(modaModelEClass, MODA_MODEL__NAME);

		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__KIND);
		createEAttribute(modelEClass, MODEL__DESCRIPTION);

		dataEClass = createEClass(DATA);
		createEAttribute(dataEClass, DATA__KIND);
		createEAttribute(dataEClass, DATA__DESCRIPTION);

		runningSoftwareEClass = createEClass(RUNNING_SOFTWARE);

		stsEClass = createEClass(STS);

		modaElementEClass = createEClass(MODA_ELEMENT);
		createEReference(modaElementEClass, MODA_ELEMENT__OUTGOING);
		createEReference(modaElementEClass, MODA_ELEMENT__INCOMING);
		createEAttribute(modaElementEClass, MODA_ELEMENT__NAME);

		modaRelationEClass = createEClass(MODA_RELATION);
		createEReference(modaRelationEClass, MODA_RELATION__SRC);
		createEReference(modaRelationEClass, MODA_RELATION__TGT);
		createEAttribute(modaRelationEClass, MODA_RELATION__KIND);
		createEAttribute(modaRelationEClass, MODA_RELATION__NAME);

		// Create enums
		dataKindEEnum = createEEnum(DATA_KIND);
		modelKindEEnum = createEEnum(MODEL_KIND);
		relationKindEEnum = createEEnum(RELATION_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		modelEClass.getESuperTypes().add(this.getMODAElement());
		dataEClass.getESuperTypes().add(this.getMODAElement());
		runningSoftwareEClass.getESuperTypes().add(this.getMODAElement());
		stsEClass.getESuperTypes().add(this.getMODAElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(modaModelEClass, MODAModel.class, "MODAModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMODAModel_Model(), this.getModel(), null, "model", null, 0, -1, MODAModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMODAModel_Data(), this.getData(), null, "data", null, 0, -1, MODAModel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMODAModel_Software(), this.getRunningSoftware(), null, "software", null, 0, 1,
				MODAModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMODAModel_Sts(), this.getSTS(), null, "sts", null, 0, 1, MODAModel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMODAModel_Modarelation(), this.getMODARelation(), null, "modarelation", null, 0, -1,
				MODAModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMODAModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, MODAModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_Kind(), this.getModelKind(), "kind", null, 0, 1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, Model.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getData_Kind(), this.getDataKind(), "kind", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_Description(), ecorePackage.getEString(), "description", null, 0, 1, Data.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runningSoftwareEClass, RunningSoftware.class, "RunningSoftware", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(stsEClass, fr.diverse.moda.model.moda.STS.class, "STS", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(modaElementEClass, MODAElement.class, "MODAElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMODAElement_Outgoing(), this.getMODARelation(), this.getMODARelation_Src(), "outgoing", null,
				0, -1, MODAElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMODAElement_Incoming(), this.getMODARelation(), this.getMODARelation_Tgt(), "incoming", null,
				0, -1, MODAElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMODAElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, MODAElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modaRelationEClass, MODARelation.class, "MODARelation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMODARelation_Src(), this.getMODAElement(), this.getMODAElement_Outgoing(), "src", null, 0, 1,
				MODARelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMODARelation_Tgt(), this.getMODAElement(), this.getMODAElement_Incoming(), "tgt", null, 0, 1,
				MODARelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMODARelation_Kind(), this.getRelationKind(), "kind", null, 0, 1, MODARelation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMODARelation_Name(), ecorePackage.getEString(), "name", null, 0, 1, MODARelation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dataKindEEnum, DataKind.class, "DataKind");
		addEEnumLiteral(dataKindEEnum, DataKind.INPUT);
		addEEnumLiteral(dataKindEEnum, DataKind.OUTPUT);
		addEEnumLiteral(dataKindEEnum, DataKind.EXTERNAL);
		addEEnumLiteral(dataKindEEnum, DataKind.MEASURED);

		initEEnum(modelKindEEnum, ModelKind.class, "ModelKind");
		addEEnumLiteral(modelKindEEnum, ModelKind.PRESCRIPTIVE);
		addEEnumLiteral(modelKindEEnum, ModelKind.PREDICTIVE);
		addEEnumLiteral(modelKindEEnum, ModelKind.DESCRIPTIVE);

		initEEnum(relationKindEEnum, RelationKind.class, "RelationKind");
		addEEnumLiteral(relationKindEEnum, RelationKind.GENERATION);
		addEEnumLiteral(relationKindEEnum, RelationKind.ENACTMENT);
		addEEnumLiteral(relationKindEEnum, RelationKind.DEPLOYMENT);
		addEEnumLiteral(relationKindEEnum, RelationKind.INPUT);
		addEEnumLiteral(relationKindEEnum, RelationKind.OUTPUT);
		addEEnumLiteral(relationKindEEnum, RelationKind.MEASUREMENT);
		addEEnumLiteral(relationKindEEnum, RelationKind.OTHER_INTERPLAY);
		addEEnumLiteral(relationKindEEnum, RelationKind.GENERALIZATION);
		addEEnumLiteral(relationKindEEnum, RelationKind.PREPARATION);
		addEEnumLiteral(relationKindEEnum, RelationKind.ANALYSIS);

		// Create resource
		createResource(eNS_URI);
	}

} //ModaPackageImpl
