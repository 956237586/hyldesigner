/**
 */
package cn.hylstudio.mdse.hyldesigner.impl;

import cn.hylstudio.mdse.hyldesigner.DomainAttr;
import cn.hylstudio.mdse.hyldesigner.HyldesignerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Attr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.DomainAttrImpl#isIsBizKey <em>Is Biz Key</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.DomainAttrImpl#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.DomainAttrImpl#isNeedPersistent <em>Need Persistent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainAttrImpl extends AttrImpl implements DomainAttr {
	/**
	 * The default value of the '{@link #isIsBizKey() <em>Is Biz Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBizKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BIZ_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBizKey() <em>Is Biz Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBizKey()
	 * @generated
	 * @ordered
	 */
	protected boolean isBizKey = IS_BIZ_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean isOptional = IS_OPTIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isNeedPersistent() <em>Need Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedPersistent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEED_PERSISTENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeedPersistent() <em>Need Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedPersistent()
	 * @generated
	 * @ordered
	 */
	protected boolean needPersistent = NEED_PERSISTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainAttrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HyldesignerPackage.Literals.DOMAIN_ATTR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsBizKey() {
		return isBizKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsBizKey(boolean newIsBizKey) {
		boolean oldIsBizKey = isBizKey;
		isBizKey = newIsBizKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HyldesignerPackage.DOMAIN_ATTR__IS_BIZ_KEY,
					oldIsBizKey, isBizKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsOptional() {
		return isOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsOptional(boolean newIsOptional) {
		boolean oldIsOptional = isOptional;
		isOptional = newIsOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HyldesignerPackage.DOMAIN_ATTR__IS_OPTIONAL,
					oldIsOptional, isOptional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNeedPersistent() {
		return needPersistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeedPersistent(boolean newNeedPersistent) {
		boolean oldNeedPersistent = needPersistent;
		needPersistent = newNeedPersistent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HyldesignerPackage.DOMAIN_ATTR__NEED_PERSISTENT,
					oldNeedPersistent, needPersistent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HyldesignerPackage.DOMAIN_ATTR__IS_BIZ_KEY:
			return isIsBizKey();
		case HyldesignerPackage.DOMAIN_ATTR__IS_OPTIONAL:
			return isIsOptional();
		case HyldesignerPackage.DOMAIN_ATTR__NEED_PERSISTENT:
			return isNeedPersistent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HyldesignerPackage.DOMAIN_ATTR__IS_BIZ_KEY:
			setIsBizKey((Boolean) newValue);
			return;
		case HyldesignerPackage.DOMAIN_ATTR__IS_OPTIONAL:
			setIsOptional((Boolean) newValue);
			return;
		case HyldesignerPackage.DOMAIN_ATTR__NEED_PERSISTENT:
			setNeedPersistent((Boolean) newValue);
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
		case HyldesignerPackage.DOMAIN_ATTR__IS_BIZ_KEY:
			setIsBizKey(IS_BIZ_KEY_EDEFAULT);
			return;
		case HyldesignerPackage.DOMAIN_ATTR__IS_OPTIONAL:
			setIsOptional(IS_OPTIONAL_EDEFAULT);
			return;
		case HyldesignerPackage.DOMAIN_ATTR__NEED_PERSISTENT:
			setNeedPersistent(NEED_PERSISTENT_EDEFAULT);
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
		case HyldesignerPackage.DOMAIN_ATTR__IS_BIZ_KEY:
			return isBizKey != IS_BIZ_KEY_EDEFAULT;
		case HyldesignerPackage.DOMAIN_ATTR__IS_OPTIONAL:
			return isOptional != IS_OPTIONAL_EDEFAULT;
		case HyldesignerPackage.DOMAIN_ATTR__NEED_PERSISTENT:
			return needPersistent != NEED_PERSISTENT_EDEFAULT;
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
		result.append(" (isBizKey: ");
		result.append(isBizKey);
		result.append(", isOptional: ");
		result.append(isOptional);
		result.append(", needPersistent: ");
		result.append(needPersistent);
		result.append(')');
		return result.toString();
	}

} //DomainAttrImpl
