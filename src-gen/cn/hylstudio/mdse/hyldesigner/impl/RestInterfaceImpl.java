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
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.RestInterfaceImpl#getRequestpayload <em>Requestpayload</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.RestInterfaceImpl#getResponseresult <em>Responseresult</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.RestInterfaceImpl#getRestApiUri <em>Rest Api Uri</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.RestInterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.RestInterfaceImpl#getApiDesc <em>Api Desc</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.RestInterfaceImpl#getBizservice <em>Bizservice</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.RestInterfaceImpl#getAccess <em>Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestInterfaceImpl extends MinimalEObjectImpl.Container implements RestInterface {
	/**
	 * The cached value of the '{@link #getRequestpayload() <em>Requestpayload</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestpayload()
	 * @generated
	 * @ordered
	 */
	protected RequestPayload requestpayload;

	/**
	 * The cached value of the '{@link #getResponseresult() <em>Responseresult</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseresult()
	 * @generated
	 * @ordered
	 */
	protected ResponseResult responseresult;

	/**
	 * The default value of the '{@link #getRestApiUri() <em>Rest Api Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestApiUri()
	 * @generated
	 * @ordered
	 */
	protected static final String REST_API_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRestApiUri() <em>Rest Api Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestApiUri()
	 * @generated
	 * @ordered
	 */
	protected String restApiUri = REST_API_URI_EDEFAULT;

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
	 * The default value of the '{@link #getApiDesc() <em>Api Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String API_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiDesc() <em>Api Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiDesc()
	 * @generated
	 * @ordered
	 */
	protected String apiDesc = API_DESC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBizservice() <em>Bizservice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBizservice()
	 * @generated
	 * @ordered
	 */
	protected EList<BizService> bizservice;

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
	public RequestPayload getRequestpayload() {
		if (requestpayload != null && requestpayload.eIsProxy()) {
			InternalEObject oldRequestpayload = (InternalEObject) requestpayload;
			requestpayload = (RequestPayload) eResolveProxy(oldRequestpayload);
			if (requestpayload != oldRequestpayload) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							HyldesignerPackage.REST_INTERFACE__REQUESTPAYLOAD, oldRequestpayload, requestpayload));
			}
		}
		return requestpayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestPayload basicGetRequestpayload() {
		return requestpayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestpayload(RequestPayload newRequestpayload) {
		RequestPayload oldRequestpayload = requestpayload;
		requestpayload = newRequestpayload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HyldesignerPackage.REST_INTERFACE__REQUESTPAYLOAD,
					oldRequestpayload, requestpayload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseResult getResponseresult() {
		if (responseresult != null && responseresult.eIsProxy()) {
			InternalEObject oldResponseresult = (InternalEObject) responseresult;
			responseresult = (ResponseResult) eResolveProxy(oldResponseresult);
			if (responseresult != oldResponseresult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							HyldesignerPackage.REST_INTERFACE__RESPONSERESULT, oldResponseresult, responseresult));
			}
		}
		return responseresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseResult basicGetResponseresult() {
		return responseresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseresult(ResponseResult newResponseresult) {
		ResponseResult oldResponseresult = responseresult;
		responseresult = newResponseresult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HyldesignerPackage.REST_INTERFACE__RESPONSERESULT,
					oldResponseresult, responseresult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRestApiUri() {
		return restApiUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestApiUri(String newRestApiUri) {
		String oldRestApiUri = restApiUri;
		restApiUri = newRestApiUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HyldesignerPackage.REST_INTERFACE__REST_API_URI,
					oldRestApiUri, restApiUri));
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
	public String getApiDesc() {
		return apiDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiDesc(String newApiDesc) {
		String oldApiDesc = apiDesc;
		apiDesc = newApiDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HyldesignerPackage.REST_INTERFACE__API_DESC,
					oldApiDesc, apiDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BizService> getBizservice() {
		if (bizservice == null) {
			bizservice = new EObjectContainmentEList<BizService>(BizService.class, this,
					HyldesignerPackage.REST_INTERFACE__BIZSERVICE);
		}
		return bizservice;
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
		case HyldesignerPackage.REST_INTERFACE__BIZSERVICE:
			return ((InternalEList<?>) getBizservice()).basicRemove(otherEnd, msgs);
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
		case HyldesignerPackage.REST_INTERFACE__REQUESTPAYLOAD:
			if (resolve)
				return getRequestpayload();
			return basicGetRequestpayload();
		case HyldesignerPackage.REST_INTERFACE__RESPONSERESULT:
			if (resolve)
				return getResponseresult();
			return basicGetResponseresult();
		case HyldesignerPackage.REST_INTERFACE__REST_API_URI:
			return getRestApiUri();
		case HyldesignerPackage.REST_INTERFACE__NAME:
			return getName();
		case HyldesignerPackage.REST_INTERFACE__API_DESC:
			return getApiDesc();
		case HyldesignerPackage.REST_INTERFACE__BIZSERVICE:
			return getBizservice();
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
		case HyldesignerPackage.REST_INTERFACE__REQUESTPAYLOAD:
			setRequestpayload((RequestPayload) newValue);
			return;
		case HyldesignerPackage.REST_INTERFACE__RESPONSERESULT:
			setResponseresult((ResponseResult) newValue);
			return;
		case HyldesignerPackage.REST_INTERFACE__REST_API_URI:
			setRestApiUri((String) newValue);
			return;
		case HyldesignerPackage.REST_INTERFACE__NAME:
			setName((String) newValue);
			return;
		case HyldesignerPackage.REST_INTERFACE__API_DESC:
			setApiDesc((String) newValue);
			return;
		case HyldesignerPackage.REST_INTERFACE__BIZSERVICE:
			getBizservice().clear();
			getBizservice().addAll((Collection<? extends BizService>) newValue);
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
		case HyldesignerPackage.REST_INTERFACE__REQUESTPAYLOAD:
			setRequestpayload((RequestPayload) null);
			return;
		case HyldesignerPackage.REST_INTERFACE__RESPONSERESULT:
			setResponseresult((ResponseResult) null);
			return;
		case HyldesignerPackage.REST_INTERFACE__REST_API_URI:
			setRestApiUri(REST_API_URI_EDEFAULT);
			return;
		case HyldesignerPackage.REST_INTERFACE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case HyldesignerPackage.REST_INTERFACE__API_DESC:
			setApiDesc(API_DESC_EDEFAULT);
			return;
		case HyldesignerPackage.REST_INTERFACE__BIZSERVICE:
			getBizservice().clear();
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
		case HyldesignerPackage.REST_INTERFACE__REQUESTPAYLOAD:
			return requestpayload != null;
		case HyldesignerPackage.REST_INTERFACE__RESPONSERESULT:
			return responseresult != null;
		case HyldesignerPackage.REST_INTERFACE__REST_API_URI:
			return REST_API_URI_EDEFAULT == null ? restApiUri != null : !REST_API_URI_EDEFAULT.equals(restApiUri);
		case HyldesignerPackage.REST_INTERFACE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case HyldesignerPackage.REST_INTERFACE__API_DESC:
			return API_DESC_EDEFAULT == null ? apiDesc != null : !API_DESC_EDEFAULT.equals(apiDesc);
		case HyldesignerPackage.REST_INTERFACE__BIZSERVICE:
			return bizservice != null && !bizservice.isEmpty();
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
		result.append(" (restApiUri: ");
		result.append(restApiUri);
		result.append(", name: ");
		result.append(name);
		result.append(", apiDesc: ");
		result.append(apiDesc);
		result.append(')');
		return result.toString();
	}

} //RestInterfaceImpl
