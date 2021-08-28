/**
 */
package cn.hylstudio.mdse.hyldesigner.impl;

import cn.hylstudio.mdse.hyldesigner.DbEntity;
import cn.hylstudio.mdse.hyldesigner.DomainAttr;
import cn.hylstudio.mdse.hyldesigner.DomainEntity;
import cn.hylstudio.mdse.hyldesigner.Dto;
import cn.hylstudio.mdse.hyldesigner.HyldesignerPackage;
import cn.hylstudio.mdse.hyldesigner.RequestPayload;

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
 * An implementation of the model object '<em><b>Domain Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.DomainEntityImpl#getId <em>Id</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.DomainEntityImpl#getDomainattr <em>Domainattr</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.DomainEntityImpl#getGenerate <em>Generate</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.DomainEntityImpl#getDto <em>Dto</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.DomainEntityImpl#getDbentity <em>Dbentity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainEntityImpl extends MinimalEObjectImpl.Container implements DomainEntity {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDomainattr() <em>Domainattr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainattr()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainAttr> domainattr;

	/**
	 * The cached value of the '{@link #getGenerate() <em>Generate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerate()
	 * @generated
	 * @ordered
	 */
	protected EList<RequestPayload> generate;

	/**
	 * The cached value of the '{@link #getDto() <em>Dto</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDto()
	 * @generated
	 * @ordered
	 */
	protected EList<Dto> dto;

	/**
	 * The cached value of the '{@link #getDbentity() <em>Dbentity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbentity()
	 * @generated
	 * @ordered
	 */
	protected EList<DbEntity> dbentity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HyldesignerPackage.Literals.DOMAIN_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HyldesignerPackage.DOMAIN_ENTITY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequestPayload> getGenerate() {
		if (generate == null) {
			generate = new EObjectContainmentEList<RequestPayload>(RequestPayload.class, this,
					HyldesignerPackage.DOMAIN_ENTITY__GENERATE);
		}
		return generate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DomainAttr> getDomainattr() {
		if (domainattr == null) {
			domainattr = new EObjectContainmentEList<DomainAttr>(DomainAttr.class, this,
					HyldesignerPackage.DOMAIN_ENTITY__DOMAINATTR);
		}
		return domainattr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Dto> getDto() {
		if (dto == null) {
			dto = new EObjectContainmentEList<Dto>(Dto.class, this, HyldesignerPackage.DOMAIN_ENTITY__DTO);
		}
		return dto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DbEntity> getDbentity() {
		if (dbentity == null) {
			dbentity = new EObjectResolvingEList<DbEntity>(DbEntity.class, this,
					HyldesignerPackage.DOMAIN_ENTITY__DBENTITY);
		}
		return dbentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HyldesignerPackage.DOMAIN_ENTITY__DOMAINATTR:
			return ((InternalEList<?>) getDomainattr()).basicRemove(otherEnd, msgs);
		case HyldesignerPackage.DOMAIN_ENTITY__GENERATE:
			return ((InternalEList<?>) getGenerate()).basicRemove(otherEnd, msgs);
		case HyldesignerPackage.DOMAIN_ENTITY__DTO:
			return ((InternalEList<?>) getDto()).basicRemove(otherEnd, msgs);
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
		case HyldesignerPackage.DOMAIN_ENTITY__ID:
			return getId();
		case HyldesignerPackage.DOMAIN_ENTITY__DOMAINATTR:
			return getDomainattr();
		case HyldesignerPackage.DOMAIN_ENTITY__GENERATE:
			return getGenerate();
		case HyldesignerPackage.DOMAIN_ENTITY__DTO:
			return getDto();
		case HyldesignerPackage.DOMAIN_ENTITY__DBENTITY:
			return getDbentity();
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
		case HyldesignerPackage.DOMAIN_ENTITY__ID:
			setId((String) newValue);
			return;
		case HyldesignerPackage.DOMAIN_ENTITY__DOMAINATTR:
			getDomainattr().clear();
			getDomainattr().addAll((Collection<? extends DomainAttr>) newValue);
			return;
		case HyldesignerPackage.DOMAIN_ENTITY__GENERATE:
			getGenerate().clear();
			getGenerate().addAll((Collection<? extends RequestPayload>) newValue);
			return;
		case HyldesignerPackage.DOMAIN_ENTITY__DTO:
			getDto().clear();
			getDto().addAll((Collection<? extends Dto>) newValue);
			return;
		case HyldesignerPackage.DOMAIN_ENTITY__DBENTITY:
			getDbentity().clear();
			getDbentity().addAll((Collection<? extends DbEntity>) newValue);
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
		case HyldesignerPackage.DOMAIN_ENTITY__ID:
			setId(ID_EDEFAULT);
			return;
		case HyldesignerPackage.DOMAIN_ENTITY__DOMAINATTR:
			getDomainattr().clear();
			return;
		case HyldesignerPackage.DOMAIN_ENTITY__GENERATE:
			getGenerate().clear();
			return;
		case HyldesignerPackage.DOMAIN_ENTITY__DTO:
			getDto().clear();
			return;
		case HyldesignerPackage.DOMAIN_ENTITY__DBENTITY:
			getDbentity().clear();
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
		case HyldesignerPackage.DOMAIN_ENTITY__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case HyldesignerPackage.DOMAIN_ENTITY__DOMAINATTR:
			return domainattr != null && !domainattr.isEmpty();
		case HyldesignerPackage.DOMAIN_ENTITY__GENERATE:
			return generate != null && !generate.isEmpty();
		case HyldesignerPackage.DOMAIN_ENTITY__DTO:
			return dto != null && !dto.isEmpty();
		case HyldesignerPackage.DOMAIN_ENTITY__DBENTITY:
			return dbentity != null && !dbentity.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //DomainEntityImpl
