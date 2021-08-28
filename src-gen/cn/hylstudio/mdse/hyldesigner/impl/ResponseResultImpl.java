/**
 */
package cn.hylstudio.mdse.hyldesigner.impl;

import cn.hylstudio.mdse.hyldesigner.HyldesignerPackage;
import cn.hylstudio.mdse.hyldesigner.ResponseAttr;
import cn.hylstudio.mdse.hyldesigner.ResponseResult;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.ResponseResultImpl#getResponseattr <em>Responseattr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseResultImpl extends MinimalEObjectImpl.Container implements ResponseResult {
	/**
	 * The cached value of the '{@link #getResponseattr() <em>Responseattr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseattr()
	 * @generated
	 * @ordered
	 */
	protected EList<ResponseAttr> responseattr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HyldesignerPackage.Literals.RESPONSE_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResponseAttr> getResponseattr() {
		if (responseattr == null) {
			responseattr = new EObjectContainmentEList<ResponseAttr>(ResponseAttr.class, this,
					HyldesignerPackage.RESPONSE_RESULT__RESPONSEATTR);
		}
		return responseattr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HyldesignerPackage.RESPONSE_RESULT__RESPONSEATTR:
			return ((InternalEList<?>) getResponseattr()).basicRemove(otherEnd, msgs);
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
		case HyldesignerPackage.RESPONSE_RESULT__RESPONSEATTR:
			return getResponseattr();
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
		case HyldesignerPackage.RESPONSE_RESULT__RESPONSEATTR:
			getResponseattr().clear();
			getResponseattr().addAll((Collection<? extends ResponseAttr>) newValue);
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
		case HyldesignerPackage.RESPONSE_RESULT__RESPONSEATTR:
			getResponseattr().clear();
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
		case HyldesignerPackage.RESPONSE_RESULT__RESPONSEATTR:
			return responseattr != null && !responseattr.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResponseResultImpl
