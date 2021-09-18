/**
 */
package cn.hylstudio.mdse.hyldesigner.impl;

import cn.hylstudio.mdse.hyldesigner.BaseService;
import cn.hylstudio.mdse.hyldesigner.BizService;
import cn.hylstudio.mdse.hyldesigner.HyldesignerPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Biz Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.BizServiceImpl#getInvokeBase <em>Invoke Base</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BizServiceImpl extends ServiceImpl implements BizService {
	/**
	 * The cached value of the '{@link #getInvokeBase() <em>Invoke Base</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokeBase()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseService> invokeBase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BizServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HyldesignerPackage.Literals.BIZ_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BaseService> getInvokeBase() {
		if (invokeBase == null) {
			invokeBase = new EObjectContainmentEList<BaseService>(BaseService.class, this,
					HyldesignerPackage.BIZ_SERVICE__INVOKE_BASE);
		}
		return invokeBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HyldesignerPackage.BIZ_SERVICE__INVOKE_BASE:
			return ((InternalEList<?>) getInvokeBase()).basicRemove(otherEnd, msgs);
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
		case HyldesignerPackage.BIZ_SERVICE__INVOKE_BASE:
			return getInvokeBase();
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
		case HyldesignerPackage.BIZ_SERVICE__INVOKE_BASE:
			getInvokeBase().clear();
			getInvokeBase().addAll((Collection<? extends BaseService>) newValue);
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
		case HyldesignerPackage.BIZ_SERVICE__INVOKE_BASE:
			getInvokeBase().clear();
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
		case HyldesignerPackage.BIZ_SERVICE__INVOKE_BASE:
			return invokeBase != null && !invokeBase.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BizServiceImpl
