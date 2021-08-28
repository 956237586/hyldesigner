/**
 */
package cn.hylstudio.mdse.hyldesigner.impl;

import cn.hylstudio.mdse.hyldesigner.Dto;
import cn.hylstudio.mdse.hyldesigner.HyldesignerPackage;
import cn.hylstudio.mdse.hyldesigner.RequestAttr;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Attr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.RequestAttrImpl#getDto <em>Dto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestAttrImpl extends AttrImpl implements RequestAttr {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestAttrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HyldesignerPackage.Literals.REQUEST_ATTR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Dto> getDto() {
		if (dto == null) {
			dto = new EObjectContainmentEList<Dto>(Dto.class, this, HyldesignerPackage.REQUEST_ATTR__DTO);
		}
		return dto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HyldesignerPackage.REQUEST_ATTR__DTO:
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
		case HyldesignerPackage.REQUEST_ATTR__DTO:
			return getDto();
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
		case HyldesignerPackage.REQUEST_ATTR__DTO:
			getDto().clear();
			getDto().addAll((Collection<? extends Dto>) newValue);
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
		case HyldesignerPackage.REQUEST_ATTR__DTO:
			getDto().clear();
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
		case HyldesignerPackage.REQUEST_ATTR__DTO:
			return dto != null && !dto.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequestAttrImpl
