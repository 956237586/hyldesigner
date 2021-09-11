/**
 */
package cn.hylstudio.mdse.hyldesigner.impl;

import cn.hylstudio.mdse.hyldesigner.Controller;
import cn.hylstudio.mdse.hyldesigner.DbEntity;
import cn.hylstudio.mdse.hyldesigner.DomainEntity;
import cn.hylstudio.mdse.hyldesigner.HyldesignerPackage;
import cn.hylstudio.mdse.hyldesigner.Project;

import cn.hylstudio.mdse.hyldesigner.RequestPayload;
import cn.hylstudio.mdse.hyldesigner.ResponseResult;
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
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.ProjectImpl#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.ProjectImpl#getContainsDomain <em>Contains Domain</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.ProjectImpl#getContainsPayload <em>Contains Payload</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.ProjectImpl#getDbentity <em>Dbentity</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.ProjectImpl#getResponseresult <em>Responseresult</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.ProjectImpl#getController <em>Controller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
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
	 * The default value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected String basePackage = BASE_PACKAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainsDomain() <em>Contains Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainEntity> containsDomain;

	/**
	 * The cached value of the '{@link #getContainsPayload() <em>Contains Payload</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsPayload()
	 * @generated
	 * @ordered
	 */
	protected EList<RequestPayload> containsPayload;

	/**
	 * The cached value of the '{@link #getDbentity() <em>Dbentity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbentity()
	 * @generated
	 * @ordered
	 */
	protected EList<DbEntity> dbentity;

	/**
	 * The cached value of the '{@link #getResponseresult() <em>Responseresult</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseresult()
	 * @generated
	 * @ordered
	 */
	protected EList<ResponseResult> responseresult;

	/**
	 * The cached value of the '{@link #getController() <em>Controller</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected EList<Controller> controller;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HyldesignerPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HyldesignerPackage.PROJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBasePackage() {
		return basePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasePackage(String newBasePackage) {
		String oldBasePackage = basePackage;
		basePackage = newBasePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HyldesignerPackage.PROJECT__BASE_PACKAGE,
					oldBasePackage, basePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DomainEntity> getContainsDomain() {
		if (containsDomain == null) {
			containsDomain = new EObjectContainmentEList<DomainEntity>(DomainEntity.class, this,
					HyldesignerPackage.PROJECT__CONTAINS_DOMAIN);
		}
		return containsDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequestPayload> getContainsPayload() {
		if (containsPayload == null) {
			containsPayload = new EObjectContainmentEList<RequestPayload>(RequestPayload.class, this,
					HyldesignerPackage.PROJECT__CONTAINS_PAYLOAD);
		}
		return containsPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DbEntity> getDbentity() {
		if (dbentity == null) {
			dbentity = new EObjectContainmentEList<DbEntity>(DbEntity.class, this,
					HyldesignerPackage.PROJECT__DBENTITY);
		}
		return dbentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResponseResult> getResponseresult() {
		if (responseresult == null) {
			responseresult = new EObjectContainmentEList<ResponseResult>(ResponseResult.class, this,
					HyldesignerPackage.PROJECT__RESPONSERESULT);
		}
		return responseresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Controller> getController() {
		if (controller == null) {
			controller = new EObjectContainmentEList<Controller>(Controller.class, this,
					HyldesignerPackage.PROJECT__CONTROLLER);
		}
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HyldesignerPackage.PROJECT__CONTAINS_DOMAIN:
			return ((InternalEList<?>) getContainsDomain()).basicRemove(otherEnd, msgs);
		case HyldesignerPackage.PROJECT__CONTAINS_PAYLOAD:
			return ((InternalEList<?>) getContainsPayload()).basicRemove(otherEnd, msgs);
		case HyldesignerPackage.PROJECT__DBENTITY:
			return ((InternalEList<?>) getDbentity()).basicRemove(otherEnd, msgs);
		case HyldesignerPackage.PROJECT__RESPONSERESULT:
			return ((InternalEList<?>) getResponseresult()).basicRemove(otherEnd, msgs);
		case HyldesignerPackage.PROJECT__CONTROLLER:
			return ((InternalEList<?>) getController()).basicRemove(otherEnd, msgs);
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
		case HyldesignerPackage.PROJECT__NAME:
			return getName();
		case HyldesignerPackage.PROJECT__BASE_PACKAGE:
			return getBasePackage();
		case HyldesignerPackage.PROJECT__CONTAINS_DOMAIN:
			return getContainsDomain();
		case HyldesignerPackage.PROJECT__CONTAINS_PAYLOAD:
			return getContainsPayload();
		case HyldesignerPackage.PROJECT__DBENTITY:
			return getDbentity();
		case HyldesignerPackage.PROJECT__RESPONSERESULT:
			return getResponseresult();
		case HyldesignerPackage.PROJECT__CONTROLLER:
			return getController();
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
		case HyldesignerPackage.PROJECT__NAME:
			setName((String) newValue);
			return;
		case HyldesignerPackage.PROJECT__BASE_PACKAGE:
			setBasePackage((String) newValue);
			return;
		case HyldesignerPackage.PROJECT__CONTAINS_DOMAIN:
			getContainsDomain().clear();
			getContainsDomain().addAll((Collection<? extends DomainEntity>) newValue);
			return;
		case HyldesignerPackage.PROJECT__CONTAINS_PAYLOAD:
			getContainsPayload().clear();
			getContainsPayload().addAll((Collection<? extends RequestPayload>) newValue);
			return;
		case HyldesignerPackage.PROJECT__DBENTITY:
			getDbentity().clear();
			getDbentity().addAll((Collection<? extends DbEntity>) newValue);
			return;
		case HyldesignerPackage.PROJECT__RESPONSERESULT:
			getResponseresult().clear();
			getResponseresult().addAll((Collection<? extends ResponseResult>) newValue);
			return;
		case HyldesignerPackage.PROJECT__CONTROLLER:
			getController().clear();
			getController().addAll((Collection<? extends Controller>) newValue);
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
		case HyldesignerPackage.PROJECT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case HyldesignerPackage.PROJECT__BASE_PACKAGE:
			setBasePackage(BASE_PACKAGE_EDEFAULT);
			return;
		case HyldesignerPackage.PROJECT__CONTAINS_DOMAIN:
			getContainsDomain().clear();
			return;
		case HyldesignerPackage.PROJECT__CONTAINS_PAYLOAD:
			getContainsPayload().clear();
			return;
		case HyldesignerPackage.PROJECT__DBENTITY:
			getDbentity().clear();
			return;
		case HyldesignerPackage.PROJECT__RESPONSERESULT:
			getResponseresult().clear();
			return;
		case HyldesignerPackage.PROJECT__CONTROLLER:
			getController().clear();
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
		case HyldesignerPackage.PROJECT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case HyldesignerPackage.PROJECT__BASE_PACKAGE:
			return BASE_PACKAGE_EDEFAULT == null ? basePackage != null : !BASE_PACKAGE_EDEFAULT.equals(basePackage);
		case HyldesignerPackage.PROJECT__CONTAINS_DOMAIN:
			return containsDomain != null && !containsDomain.isEmpty();
		case HyldesignerPackage.PROJECT__CONTAINS_PAYLOAD:
			return containsPayload != null && !containsPayload.isEmpty();
		case HyldesignerPackage.PROJECT__DBENTITY:
			return dbentity != null && !dbentity.isEmpty();
		case HyldesignerPackage.PROJECT__RESPONSERESULT:
			return responseresult != null && !responseresult.isEmpty();
		case HyldesignerPackage.PROJECT__CONTROLLER:
			return controller != null && !controller.isEmpty();
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
		result.append(", basePackage: ");
		result.append(basePackage);
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
