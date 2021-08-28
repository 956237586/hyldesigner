/**
 */
package cn.hylstudio.mdse.hyldesigner.impl;

import cn.hylstudio.mdse.hyldesigner.DbAttr;
import cn.hylstudio.mdse.hyldesigner.DbEntity;
import cn.hylstudio.mdse.hyldesigner.DomainEntity;
import cn.hylstudio.mdse.hyldesigner.HyldesignerPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Db Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.DbEntityImpl#getDbattr <em>Dbattr</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.DbEntityImpl#getDomainentity <em>Domainentity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DbEntityImpl extends MinimalEObjectImpl.Container implements DbEntity {
	/**
	 * The cached value of the '{@link #getDbattr() <em>Dbattr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbattr()
	 * @generated
	 * @ordered
	 */
	protected EList<DbAttr> dbattr;

	/**
	 * The cached value of the '{@link #getDomainentity() <em>Domainentity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainentity()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainEntity> domainentity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DbEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HyldesignerPackage.Literals.DB_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DbAttr> getDbattr() {
		if (dbattr == null) {
			dbattr = new EObjectContainmentEList<DbAttr>(DbAttr.class, this, HyldesignerPackage.DB_ENTITY__DBATTR);
		}
		return dbattr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DomainEntity> getDomainentity() {
		if (domainentity == null) {
			domainentity = new EObjectResolvingEList<DomainEntity>(DomainEntity.class, this,
					HyldesignerPackage.DB_ENTITY__DOMAINENTITY);
		}
		return domainentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HyldesignerPackage.DB_ENTITY__DBATTR:
			return ((InternalEList<?>) getDbattr()).basicRemove(otherEnd, msgs);
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
		case HyldesignerPackage.DB_ENTITY__DBATTR:
			return getDbattr();
		case HyldesignerPackage.DB_ENTITY__DOMAINENTITY:
			return getDomainentity();
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
		case HyldesignerPackage.DB_ENTITY__DBATTR:
			getDbattr().clear();
			getDbattr().addAll((Collection<? extends DbAttr>) newValue);
			return;
		case HyldesignerPackage.DB_ENTITY__DOMAINENTITY:
			getDomainentity().clear();
			getDomainentity().addAll((Collection<? extends DomainEntity>) newValue);
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
		case HyldesignerPackage.DB_ENTITY__DBATTR:
			getDbattr().clear();
			return;
		case HyldesignerPackage.DB_ENTITY__DOMAINENTITY:
			getDomainentity().clear();
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
		case HyldesignerPackage.DB_ENTITY__DBATTR:
			return dbattr != null && !dbattr.isEmpty();
		case HyldesignerPackage.DB_ENTITY__DOMAINENTITY:
			return domainentity != null && !domainentity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DbEntityImpl
