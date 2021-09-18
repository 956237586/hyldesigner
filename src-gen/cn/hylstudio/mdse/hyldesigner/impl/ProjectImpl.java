/**
 */
package cn.hylstudio.mdse.hyldesigner.impl;

import cn.hylstudio.mdse.hyldesigner.Controller;
import cn.hylstudio.mdse.hyldesigner.DbEntity;
import cn.hylstudio.mdse.hyldesigner.DomainEntity;
import cn.hylstudio.mdse.hyldesigner.HyldesignerPackage;
import cn.hylstudio.mdse.hyldesigner.PackageDefine;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.ProjectImpl#getDomainEntities <em>Domain Entities</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.ProjectImpl#getDbEntities <em>Db Entities</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.ProjectImpl#getReqPayloads <em>Req Payloads</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.ProjectImpl#getRespResults <em>Resp Results</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.ProjectImpl#getControllers <em>Controllers</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.ProjectImpl#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.ProjectImpl#getSubPackages <em>Sub Packages</em>}</li>
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
	 * The cached value of the '{@link #getDomainEntities() <em>Domain Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainEntity> domainEntities;

	/**
	 * The cached value of the '{@link #getDbEntities() <em>Db Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<DbEntity> dbEntities;

	/**
	 * The cached value of the '{@link #getReqPayloads() <em>Req Payloads</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqPayloads()
	 * @generated
	 * @ordered
	 */
	protected EList<RequestPayload> reqPayloads;

	/**
	 * The cached value of the '{@link #getRespResults() <em>Resp Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespResults()
	 * @generated
	 * @ordered
	 */
	protected EList<ResponseResult> respResults;

	/**
	 * The cached value of the '{@link #getControllers() <em>Controllers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllers()
	 * @generated
	 * @ordered
	 */
	protected EList<Controller> controllers;

	/**
	 * The cached value of the '{@link #getBasePackage() <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected PackageDefine basePackage;

	/**
	 * The cached value of the '{@link #getSubPackages() <em>Sub Packages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageDefine> subPackages;

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
	public EList<DomainEntity> getDomainEntities() {
		if (domainEntities == null) {
			domainEntities = new EObjectContainmentEList<DomainEntity>(DomainEntity.class, this,
					HyldesignerPackage.PROJECT__DOMAIN_ENTITIES);
		}
		return domainEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DbEntity> getDbEntities() {
		if (dbEntities == null) {
			dbEntities = new EObjectContainmentEList<DbEntity>(DbEntity.class, this,
					HyldesignerPackage.PROJECT__DB_ENTITIES);
		}
		return dbEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequestPayload> getReqPayloads() {
		if (reqPayloads == null) {
			reqPayloads = new EObjectContainmentEList<RequestPayload>(RequestPayload.class, this,
					HyldesignerPackage.PROJECT__REQ_PAYLOADS);
		}
		return reqPayloads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResponseResult> getRespResults() {
		if (respResults == null) {
			respResults = new EObjectContainmentEList<ResponseResult>(ResponseResult.class, this,
					HyldesignerPackage.PROJECT__RESP_RESULTS);
		}
		return respResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Controller> getControllers() {
		if (controllers == null) {
			controllers = new EObjectContainmentEList<Controller>(Controller.class, this,
					HyldesignerPackage.PROJECT__CONTROLLERS);
		}
		return controllers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageDefine getBasePackage() {
		if (basePackage != null && basePackage.eIsProxy()) {
			InternalEObject oldBasePackage = (InternalEObject) basePackage;
			basePackage = (PackageDefine) eResolveProxy(oldBasePackage);
			if (basePackage != oldBasePackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HyldesignerPackage.PROJECT__BASE_PACKAGE,
							oldBasePackage, basePackage));
			}
		}
		return basePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageDefine basicGetBasePackage() {
		return basePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasePackage(PackageDefine newBasePackage) {
		PackageDefine oldBasePackage = basePackage;
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
	public EList<PackageDefine> getSubPackages() {
		if (subPackages == null) {
			subPackages = new EObjectResolvingEList<PackageDefine>(PackageDefine.class, this,
					HyldesignerPackage.PROJECT__SUB_PACKAGES);
		}
		return subPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HyldesignerPackage.PROJECT__DOMAIN_ENTITIES:
			return ((InternalEList<?>) getDomainEntities()).basicRemove(otherEnd, msgs);
		case HyldesignerPackage.PROJECT__DB_ENTITIES:
			return ((InternalEList<?>) getDbEntities()).basicRemove(otherEnd, msgs);
		case HyldesignerPackage.PROJECT__REQ_PAYLOADS:
			return ((InternalEList<?>) getReqPayloads()).basicRemove(otherEnd, msgs);
		case HyldesignerPackage.PROJECT__RESP_RESULTS:
			return ((InternalEList<?>) getRespResults()).basicRemove(otherEnd, msgs);
		case HyldesignerPackage.PROJECT__CONTROLLERS:
			return ((InternalEList<?>) getControllers()).basicRemove(otherEnd, msgs);
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
		case HyldesignerPackage.PROJECT__DOMAIN_ENTITIES:
			return getDomainEntities();
		case HyldesignerPackage.PROJECT__DB_ENTITIES:
			return getDbEntities();
		case HyldesignerPackage.PROJECT__REQ_PAYLOADS:
			return getReqPayloads();
		case HyldesignerPackage.PROJECT__RESP_RESULTS:
			return getRespResults();
		case HyldesignerPackage.PROJECT__CONTROLLERS:
			return getControllers();
		case HyldesignerPackage.PROJECT__BASE_PACKAGE:
			if (resolve)
				return getBasePackage();
			return basicGetBasePackage();
		case HyldesignerPackage.PROJECT__SUB_PACKAGES:
			return getSubPackages();
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
		case HyldesignerPackage.PROJECT__DOMAIN_ENTITIES:
			getDomainEntities().clear();
			getDomainEntities().addAll((Collection<? extends DomainEntity>) newValue);
			return;
		case HyldesignerPackage.PROJECT__DB_ENTITIES:
			getDbEntities().clear();
			getDbEntities().addAll((Collection<? extends DbEntity>) newValue);
			return;
		case HyldesignerPackage.PROJECT__REQ_PAYLOADS:
			getReqPayloads().clear();
			getReqPayloads().addAll((Collection<? extends RequestPayload>) newValue);
			return;
		case HyldesignerPackage.PROJECT__RESP_RESULTS:
			getRespResults().clear();
			getRespResults().addAll((Collection<? extends ResponseResult>) newValue);
			return;
		case HyldesignerPackage.PROJECT__CONTROLLERS:
			getControllers().clear();
			getControllers().addAll((Collection<? extends Controller>) newValue);
			return;
		case HyldesignerPackage.PROJECT__BASE_PACKAGE:
			setBasePackage((PackageDefine) newValue);
			return;
		case HyldesignerPackage.PROJECT__SUB_PACKAGES:
			getSubPackages().clear();
			getSubPackages().addAll((Collection<? extends PackageDefine>) newValue);
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
		case HyldesignerPackage.PROJECT__DOMAIN_ENTITIES:
			getDomainEntities().clear();
			return;
		case HyldesignerPackage.PROJECT__DB_ENTITIES:
			getDbEntities().clear();
			return;
		case HyldesignerPackage.PROJECT__REQ_PAYLOADS:
			getReqPayloads().clear();
			return;
		case HyldesignerPackage.PROJECT__RESP_RESULTS:
			getRespResults().clear();
			return;
		case HyldesignerPackage.PROJECT__CONTROLLERS:
			getControllers().clear();
			return;
		case HyldesignerPackage.PROJECT__BASE_PACKAGE:
			setBasePackage((PackageDefine) null);
			return;
		case HyldesignerPackage.PROJECT__SUB_PACKAGES:
			getSubPackages().clear();
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
		case HyldesignerPackage.PROJECT__DOMAIN_ENTITIES:
			return domainEntities != null && !domainEntities.isEmpty();
		case HyldesignerPackage.PROJECT__DB_ENTITIES:
			return dbEntities != null && !dbEntities.isEmpty();
		case HyldesignerPackage.PROJECT__REQ_PAYLOADS:
			return reqPayloads != null && !reqPayloads.isEmpty();
		case HyldesignerPackage.PROJECT__RESP_RESULTS:
			return respResults != null && !respResults.isEmpty();
		case HyldesignerPackage.PROJECT__CONTROLLERS:
			return controllers != null && !controllers.isEmpty();
		case HyldesignerPackage.PROJECT__BASE_PACKAGE:
			return basePackage != null;
		case HyldesignerPackage.PROJECT__SUB_PACKAGES:
			return subPackages != null && !subPackages.isEmpty();
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

} //ProjectImpl
