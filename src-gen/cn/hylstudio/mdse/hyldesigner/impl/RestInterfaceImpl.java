/**
 */
package cn.hylstudio.mdse.hyldesigner.impl;

import cn.hylstudio.mdse.hyldesigner.BizService;
import cn.hylstudio.mdse.hyldesigner.DomainEntity;
import cn.hylstudio.mdse.hyldesigner.HyldesignerPackage;
import cn.hylstudio.mdse.hyldesigner.RequestPayload;
import cn.hylstudio.mdse.hyldesigner.ResponseResult;
import cn.hylstudio.mdse.hyldesigner.RestInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rest Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.RestInterfaceImpl#getPayload <em>Payload</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.RestInterfaceImpl#getResult <em>Result</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.RestInterfaceImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.RestInterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.RestInterfaceImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.RestInterfaceImpl#getInvokeBizServices <em>Invoke Biz Services</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.RestInterfaceImpl#getAccess <em>Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestInterfaceImpl extends MinimalEObjectImpl.Container implements RestInterface {
	/**
	 * The cached value of the '{@link #getPayload() <em>Payload</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayload()
	 * @generated
	 * @ordered
	 */
	protected RequestPayload payload;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected ResponseResult result;

	/**
	 * The default value of the '{@link #getMapping() <em>Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected static final String MAPPING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMapping() <em>Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected String mapping = MAPPING_EDEFAULT;

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
	 * The default value of the '{@link #getDesc() <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesc() <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
	protected String desc = DESC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInvokeBizServices() <em>Invoke Biz Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokeBizServices()
	 * @generated
	 * @ordered
	 */
	protected EList<BizService> invokeBizServices;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainEntity> access;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HyldesignerPackage.Literals.REST_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestPayload getPayload() {
		if (payload != null && payload.eIsProxy()) {
			InternalEObject oldPayload = (InternalEObject) payload;
			payload = (RequestPayload) eResolveProxy(oldPayload);
			if (payload != oldPayload) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							HyldesignerPackage.REST_INTERFACE__PAYLOAD, oldPayload, payload));
			}
		}
		return payload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestPayload basicGetPayload() {
		return payload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayload(RequestPayload newPayload) {
		RequestPayload oldPayload = payload;
		payload = newPayload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HyldesignerPackage.REST_INTERFACE__PAYLOAD,
					oldPayload, payload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseResult getResult() {
		if (result != null && result.eIsProxy()) {
			InternalEObject oldResult = (InternalEObject) result;
			result = (ResponseResult) eResolveProxy(oldResult);
			if (result != oldResult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HyldesignerPackage.REST_INTERFACE__RESULT,
							oldResult, result));
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseResult basicGetResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResult(ResponseResult newResult) {
		ResponseResult oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HyldesignerPackage.REST_INTERFACE__RESULT, oldResult,
					result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMapping() {
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMapping(String newMapping) {
		String oldMapping = mapping;
		mapping = newMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HyldesignerPackage.REST_INTERFACE__MAPPING,
					oldMapping, mapping));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HyldesignerPackage.REST_INTERFACE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDesc() {
		return desc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesc(String newDesc) {
		String oldDesc = desc;
		desc = newDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HyldesignerPackage.REST_INTERFACE__DESC, oldDesc,
					desc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BizService> getInvokeBizServices() {
		if (invokeBizServices == null) {
			invokeBizServices = new EObjectContainmentEList<BizService>(BizService.class, this,
					HyldesignerPackage.REST_INTERFACE__INVOKE_BIZ_SERVICES);
		}
		return invokeBizServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DomainEntity> getAccess() {
		if (access == null) {
			access = new EObjectResolvingEList<DomainEntity>(DomainEntity.class, this,
					HyldesignerPackage.REST_INTERFACE__ACCESS);
		}
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HyldesignerPackage.REST_INTERFACE__INVOKE_BIZ_SERVICES:
			return ((InternalEList<?>) getInvokeBizServices()).basicRemove(otherEnd, msgs);
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
		case HyldesignerPackage.REST_INTERFACE__PAYLOAD:
			if (resolve)
				return getPayload();
			return basicGetPayload();
		case HyldesignerPackage.REST_INTERFACE__RESULT:
			if (resolve)
				return getResult();
			return basicGetResult();
		case HyldesignerPackage.REST_INTERFACE__MAPPING:
			return getMapping();
		case HyldesignerPackage.REST_INTERFACE__NAME:
			return getName();
		case HyldesignerPackage.REST_INTERFACE__DESC:
			return getDesc();
		case HyldesignerPackage.REST_INTERFACE__INVOKE_BIZ_SERVICES:
			return getInvokeBizServices();
		case HyldesignerPackage.REST_INTERFACE__ACCESS:
			return getAccess();
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
		case HyldesignerPackage.REST_INTERFACE__PAYLOAD:
			setPayload((RequestPayload) newValue);
			return;
		case HyldesignerPackage.REST_INTERFACE__RESULT:
			setResult((ResponseResult) newValue);
			return;
		case HyldesignerPackage.REST_INTERFACE__MAPPING:
			setMapping((String) newValue);
			return;
		case HyldesignerPackage.REST_INTERFACE__NAME:
			setName((String) newValue);
			return;
		case HyldesignerPackage.REST_INTERFACE__DESC:
			setDesc((String) newValue);
			return;
		case HyldesignerPackage.REST_INTERFACE__INVOKE_BIZ_SERVICES:
			getInvokeBizServices().clear();
			getInvokeBizServices().addAll((Collection<? extends BizService>) newValue);
			return;
		case HyldesignerPackage.REST_INTERFACE__ACCESS:
			getAccess().clear();
			getAccess().addAll((Collection<? extends DomainEntity>) newValue);
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
		case HyldesignerPackage.REST_INTERFACE__PAYLOAD:
			setPayload((RequestPayload) null);
			return;
		case HyldesignerPackage.REST_INTERFACE__RESULT:
			setResult((ResponseResult) null);
			return;
		case HyldesignerPackage.REST_INTERFACE__MAPPING:
			setMapping(MAPPING_EDEFAULT);
			return;
		case HyldesignerPackage.REST_INTERFACE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case HyldesignerPackage.REST_INTERFACE__DESC:
			setDesc(DESC_EDEFAULT);
			return;
		case HyldesignerPackage.REST_INTERFACE__INVOKE_BIZ_SERVICES:
			getInvokeBizServices().clear();
			return;
		case HyldesignerPackage.REST_INTERFACE__ACCESS:
			getAccess().clear();
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
		case HyldesignerPackage.REST_INTERFACE__PAYLOAD:
			return payload != null;
		case HyldesignerPackage.REST_INTERFACE__RESULT:
			return result != null;
		case HyldesignerPackage.REST_INTERFACE__MAPPING:
			return MAPPING_EDEFAULT == null ? mapping != null : !MAPPING_EDEFAULT.equals(mapping);
		case HyldesignerPackage.REST_INTERFACE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case HyldesignerPackage.REST_INTERFACE__DESC:
			return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
		case HyldesignerPackage.REST_INTERFACE__INVOKE_BIZ_SERVICES:
			return invokeBizServices != null && !invokeBizServices.isEmpty();
		case HyldesignerPackage.REST_INTERFACE__ACCESS:
			return access != null && !access.isEmpty();
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
		result.append(" (mapping: ");
		result.append(mapping);
		result.append(", name: ");
		result.append(name);
		result.append(", desc: ");
		result.append(desc);
		result.append(')');
		return result.toString();
	}

} //RestInterfaceImpl
