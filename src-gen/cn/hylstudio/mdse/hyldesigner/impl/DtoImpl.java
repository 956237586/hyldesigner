/**
 */
package cn.hylstudio.mdse.hyldesigner.impl;

import cn.hylstudio.mdse.hyldesigner.Dto;
import cn.hylstudio.mdse.hyldesigner.DtoAttr;
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
 * An implementation of the model object '<em><b>Dto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.DtoImpl#getDto <em>Dto</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.DtoImpl#getDtoattr <em>Dtoattr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DtoImpl extends MinimalEObjectImpl.Container implements Dto {
	/**
	 * The cached value of the '{@link #getDto() <em>Dto</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDto()
	 * @generated
	 * @ordered
	 */
	protected EList<Dto> dto;

	/**
	 * The cached value of the '{@link #getDtoattr() <em>Dtoattr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtoattr()
	 * @generated
	 * @ordered
	 */
	protected EList<DtoAttr> dtoattr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DtoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HyldesignerPackage.Literals.DTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Dto> getDto() {
		if (dto == null) {
			dto = new EObjectResolvingEList<Dto>(Dto.class, this, HyldesignerPackage.DTO__DTO);
		}
		return dto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DtoAttr> getDtoattr() {
		if (dtoattr == null) {
			dtoattr = new EObjectContainmentEList<DtoAttr>(DtoAttr.class, this, HyldesignerPackage.DTO__DTOATTR);
		}
		return dtoattr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HyldesignerPackage.DTO__DTOATTR:
			return ((InternalEList<?>) getDtoattr()).basicRemove(otherEnd, msgs);
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
		case HyldesignerPackage.DTO__DTO:
			return getDto();
		case HyldesignerPackage.DTO__DTOATTR:
			return getDtoattr();
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
		case HyldesignerPackage.DTO__DTO:
			getDto().clear();
			getDto().addAll((Collection<? extends Dto>) newValue);
			return;
		case HyldesignerPackage.DTO__DTOATTR:
			getDtoattr().clear();
			getDtoattr().addAll((Collection<? extends DtoAttr>) newValue);
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
		case HyldesignerPackage.DTO__DTO:
			getDto().clear();
			return;
		case HyldesignerPackage.DTO__DTOATTR:
			getDtoattr().clear();
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
		case HyldesignerPackage.DTO__DTO:
			return dto != null && !dto.isEmpty();
		case HyldesignerPackage.DTO__DTOATTR:
			return dtoattr != null && !dtoattr.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DtoImpl
