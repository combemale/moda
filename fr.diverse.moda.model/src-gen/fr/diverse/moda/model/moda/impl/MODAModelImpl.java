/**
 */
package fr.diverse.moda.model.moda.impl;

import fr.diverse.moda.model.moda.Data;
import fr.diverse.moda.model.moda.MODAModel;
import fr.diverse.moda.model.moda.MODARelation;
import fr.diverse.moda.model.moda.ModaPackage;
import fr.diverse.moda.model.moda.Model;
import fr.diverse.moda.model.moda.RunningSoftware;
import fr.diverse.moda.model.moda.STS;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MODA Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.diverse.moda.model.moda.impl.MODAModelImpl#getModel <em>Model</em>}</li>
 *   <li>{@link fr.diverse.moda.model.moda.impl.MODAModelImpl#getData <em>Data</em>}</li>
 *   <li>{@link fr.diverse.moda.model.moda.impl.MODAModelImpl#getSoftware <em>Software</em>}</li>
 *   <li>{@link fr.diverse.moda.model.moda.impl.MODAModelImpl#getSts <em>Sts</em>}</li>
 *   <li>{@link fr.diverse.moda.model.moda.impl.MODAModelImpl#getModarelation <em>Modarelation</em>}</li>
 *   <li>{@link fr.diverse.moda.model.moda.impl.MODAModelImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MODAModelImpl extends MinimalEObjectImpl.Container implements MODAModel {
	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> model;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * The cached value of the '{@link #getSoftware() <em>Software</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftware()
	 * @generated
	 * @ordered
	 */
	protected RunningSoftware software;

	/**
	 * The cached value of the '{@link #getSts() <em>Sts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSts()
	 * @generated
	 * @ordered
	 */
	protected STS sts;

	/**
	 * The cached value of the '{@link #getModarelation() <em>Modarelation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModarelation()
	 * @generated
	 * @ordered
	 */
	protected EList<MODARelation> modarelation;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MODAModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModaPackage.Literals.MODA_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getModel() {
		if (model == null) {
			model = new EObjectContainmentEList<Model>(Model.class, this, ModaPackage.MODA_MODEL__MODEL);
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<Data>(Data.class, this, ModaPackage.MODA_MODEL__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunningSoftware getSoftware() {
		return software;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftware(RunningSoftware newSoftware, NotificationChain msgs) {
		RunningSoftware oldSoftware = software;
		software = newSoftware;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModaPackage.MODA_MODEL__SOFTWARE, oldSoftware, newSoftware);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftware(RunningSoftware newSoftware) {
		if (newSoftware != software) {
			NotificationChain msgs = null;
			if (software != null)
				msgs = ((InternalEObject) software).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ModaPackage.MODA_MODEL__SOFTWARE, null, msgs);
			if (newSoftware != null)
				msgs = ((InternalEObject) newSoftware).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ModaPackage.MODA_MODEL__SOFTWARE, null, msgs);
			msgs = basicSetSoftware(newSoftware, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModaPackage.MODA_MODEL__SOFTWARE, newSoftware,
					newSoftware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STS getSts() {
		return sts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSts(STS newSts, NotificationChain msgs) {
		STS oldSts = sts;
		sts = newSts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModaPackage.MODA_MODEL__STS,
					oldSts, newSts);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSts(STS newSts) {
		if (newSts != sts) {
			NotificationChain msgs = null;
			if (sts != null)
				msgs = ((InternalEObject) sts).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ModaPackage.MODA_MODEL__STS, null, msgs);
			if (newSts != null)
				msgs = ((InternalEObject) newSts).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ModaPackage.MODA_MODEL__STS, null, msgs);
			msgs = basicSetSts(newSts, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModaPackage.MODA_MODEL__STS, newSts, newSts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MODARelation> getModarelation() {
		if (modarelation == null) {
			modarelation = new EObjectContainmentEList<MODARelation>(MODARelation.class, this,
					ModaPackage.MODA_MODEL__MODARELATION);
		}
		return modarelation;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModaPackage.MODA_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModaPackage.MODA_MODEL__MODEL:
			return ((InternalEList<?>) getModel()).basicRemove(otherEnd, msgs);
		case ModaPackage.MODA_MODEL__DATA:
			return ((InternalEList<?>) getData()).basicRemove(otherEnd, msgs);
		case ModaPackage.MODA_MODEL__SOFTWARE:
			return basicSetSoftware(null, msgs);
		case ModaPackage.MODA_MODEL__STS:
			return basicSetSts(null, msgs);
		case ModaPackage.MODA_MODEL__MODARELATION:
			return ((InternalEList<?>) getModarelation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModaPackage.MODA_MODEL__MODEL:
			return getModel();
		case ModaPackage.MODA_MODEL__DATA:
			return getData();
		case ModaPackage.MODA_MODEL__SOFTWARE:
			return getSoftware();
		case ModaPackage.MODA_MODEL__STS:
			return getSts();
		case ModaPackage.MODA_MODEL__MODARELATION:
			return getModarelation();
		case ModaPackage.MODA_MODEL__NAME:
			return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModaPackage.MODA_MODEL__MODEL:
			getModel().clear();
			getModel().addAll((Collection<? extends Model>) newValue);
			return;
		case ModaPackage.MODA_MODEL__DATA:
			getData().clear();
			getData().addAll((Collection<? extends Data>) newValue);
			return;
		case ModaPackage.MODA_MODEL__SOFTWARE:
			setSoftware((RunningSoftware) newValue);
			return;
		case ModaPackage.MODA_MODEL__STS:
			setSts((STS) newValue);
			return;
		case ModaPackage.MODA_MODEL__MODARELATION:
			getModarelation().clear();
			getModarelation().addAll((Collection<? extends MODARelation>) newValue);
			return;
		case ModaPackage.MODA_MODEL__NAME:
			setName((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ModaPackage.MODA_MODEL__MODEL:
			getModel().clear();
			return;
		case ModaPackage.MODA_MODEL__DATA:
			getData().clear();
			return;
		case ModaPackage.MODA_MODEL__SOFTWARE:
			setSoftware((RunningSoftware) null);
			return;
		case ModaPackage.MODA_MODEL__STS:
			setSts((STS) null);
			return;
		case ModaPackage.MODA_MODEL__MODARELATION:
			getModarelation().clear();
			return;
		case ModaPackage.MODA_MODEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ModaPackage.MODA_MODEL__MODEL:
			return model != null && !model.isEmpty();
		case ModaPackage.MODA_MODEL__DATA:
			return data != null && !data.isEmpty();
		case ModaPackage.MODA_MODEL__SOFTWARE:
			return software != null;
		case ModaPackage.MODA_MODEL__STS:
			return sts != null;
		case ModaPackage.MODA_MODEL__MODARELATION:
			return modarelation != null && !modarelation.isEmpty();
		case ModaPackage.MODA_MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MODAModelImpl
