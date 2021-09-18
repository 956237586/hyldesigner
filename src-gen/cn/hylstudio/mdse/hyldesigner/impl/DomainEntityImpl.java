/**
 */
package cn.hylstudio.mdse.hyldesigner.impl;

import cn.hylstudio.mdse.hyldesigner.DbEntity;
import cn.hylstudio.mdse.hyldesigner.DomainAttr;
import cn.hylstudio.mdse.hyldesigner.DomainEntity;
import cn.hylstudio.mdse.hyldesigner.Dto;
import cn.hylstudio.mdse.hyldesigner.HyldesignerPackage;
import cn.hylstudio.mdse.hyldesigner.PackageDefine;
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
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.DomainEntityImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.DomainEntityImpl#getGeneratedPayload <em>Generated Payload</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.DomainEntityImpl#getGeneratedDto <em>Generated Dto</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.DomainEntityImpl#getGeneratedDbEntity <em>Generated Db Entity</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.DomainEntityImpl#getBelongTo <em>Belong To</em>}</li>
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
	 * The cached value of the '{@link #getAttr() <em>Attr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttr()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainAttr> attr;

	/**
	 * The cached value of the '{@link #getGeneratedPayload() <em>Generated Payload</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedPayload()
	 * @generated
	 * @ordered
	 */
	protected EList<RequestPayload> generatedPayload;

	/**
	 * The cached value of the '{@link #getGeneratedDto() <em>Generated Dto</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedDto()
	 * @generated
	 * @ordered
	 */
	protected EList<Dto> generatedDto;

	/**
	 * The cached value of the '{@link #getGeneratedDbEntity() <em>Generated Db Entity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedDbEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<DbEntity> generatedDbEntity;

	/**
	 * The cached value of the '{@link #getBelongTo() <em>Belong To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongTo()
	 * @generated
	 * @ordered
	 */
	protected PackageDefine belongTo;

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
	public EList<DomainAttr> getAttr() {
		if (attr == null) {
			attr = new EObjectContainmentEList<DomainAttr>(DomainAttr.class, this,
					HyldesignerPackage.DOMAIN_ENTITY__ATTR);
		}
		return attr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequestPayload> getGeneratedPayload() {
		if (generatedPayload == null) {
			generatedPayload = new EObjectContainmentEList<RequestPayload>(RequestPayload.class, this,
					HyldesignerPackage.DOMAIN_ENTITY__GENERATED_PAYLOAD);
		}
		return generatedPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Dto> getGeneratedDto() {
		if (generatedDto == null) {
			generatedDto = new EObjectContainmentEList<Dto>(Dto.class, this,
					HyldesignerPackage.DOMAIN_ENTITY__GENERATED_DTO);
		}
		return generatedDto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DbEntity> getGeneratedDbEntity() {
		if (generatedDbEntity == null) {
			generatedDbEntity = new EObjectResolvingEList<DbEntity>(DbEntity.class, this,
					HyldesignerPackage.DOMAIN_ENTITY__GENERATED_DB_ENTITY);
		}
		return generatedDbEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageDefine getBelongTo() {
		if (belongTo != null && belongTo.eIsProxy()) {
			InternalEObject oldBelongTo = (InternalEObject) belongTo;
			belongTo = (PackageDefine) eResolveProxy(oldBelongTo);
			if (belongTo != oldBelongTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							HyldesignerPackage.DOMAIN_ENTITY__BELONG_TO, oldBelongTo, belongTo));
			}
		}
		return belongTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageDefine basicGetBelongTo() {
		return belongTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBelongTo(PackageDefine newBelongTo) {
		PackageDefine oldBelongTo = belongTo;
		belongTo = newBelongTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HyldesignerPackage.DOMAIN_ENTITY__BELONG_TO,
					oldBelongTo, belongTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HyldesignerPackage.DOMAIN_ENTITY__ATTR:
			return ((InternalEList<?>) getAttr()).basicRemove(otherEnd, msgs);
		case HyldesignerPackage.DOMAIN_ENTITY__GENERATED_PAYLOAD:
			return ((InternalEList<?>) getGeneratedPayload()).basicRemove(otherEnd, msgs);
		case HyldesignerPackage.DOMAIN_ENTITY__GENERATED_DTO:
			return ((InternalEList<?>) getGeneratedDto()).basicRemove(otherEnd, msgs);
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
		case HyldesignerPackage.DOMAIN_ENTITY__ATTR:
			return getAttr();
		case HyldesignerPackage.DOMAIN_ENTITY__GENERATED_PAYLOAD:
			return getGeneratedPayload();
		case HyldesignerPackage.DOMAIN_ENTITY__GENERATED_DTO:
			return getGeneratedDto();
		case HyldesignerPackage.DOMAIN_ENTITY__GENERATED_DB_ENTITY:
			return getGeneratedDbEntity();
		case HyldesignerPackage.DOMAIN_ENTITY__BELONG_TO:
			if (resolve)
				return getBelongTo();
			return basicGetBelongTo();
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
		case HyldesignerPackage.DOMAIN_ENTITY__ATTR:
			getAttr().clear();
			getAttr().addAll((Collection<? extends DomainAttr>) newValue);
			return;
		case HyldesignerPackage.DOMAIN_ENTITY__GENERATED_PAYLOAD:
			getGeneratedPayload().clear();
			getGeneratedPayload().addAll((Collection<? extends RequestPayload>) newValue);
			return;
		case HyldesignerPackage.DOMAIN_ENTITY__GENERATED_DTO:
			getGeneratedDto().clear();
			getGeneratedDto().addAll((Collection<? extends Dto>) newValue);
			return;
		case HyldesignerPackage.DOMAIN_ENTITY__GENERATED_DB_ENTITY:
			getGeneratedDbEntity().clear();
			getGeneratedDbEntity().addAll((Collection<? extends DbEntity>) newValue);
			return;
		case HyldesignerPackage.DOMAIN_ENTITY__BELONG_TO:
			setBelongTo((PackageDefine) newValue);
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
		case HyldesignerPackage.DOMAIN_ENTITY__ATTR:
			getAttr().clear();
			return;
		case HyldesignerPackage.DOMAIN_ENTITY__GENERATED_PAYLOAD:
			getGeneratedPayload().clear();
			return;
		case HyldesignerPackage.DOMAIN_ENTITY__GENERATED_DTO:
			getGeneratedDto().clear();
			return;
		case HyldesignerPackage.DOMAIN_ENTITY__GENERATED_DB_ENTITY:
			getGeneratedDbEntity().clear();
			return;
		case HyldesignerPackage.DOMAIN_ENTITY__BELONG_TO:
			setBelongTo((PackageDefine) null);
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
		case HyldesignerPackage.DOMAIN_ENTITY__ATTR:
			return attr != null && !attr.isEmpty();
		case HyldesignerPackage.DOMAIN_ENTITY__GENERATED_PAYLOAD:
			return generatedPayload != null && !generatedPayload.isEmpty();
		case HyldesignerPackage.DOMAIN_ENTITY__GENERATED_DTO:
			return generatedDto != null && !generatedDto.isEmpty();
		case HyldesignerPackage.DOMAIN_ENTITY__GENERATED_DB_ENTITY:
			return generatedDbEntity != null && !generatedDbEntity.isEmpty();
		case HyldesignerPackage.DOMAIN_ENTITY__BELONG_TO:
			return belongTo != null;
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
