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
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.DomainAttrImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.impl.DomainAttrImpl#isPersistent <em>Persistent</em>}</li>
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
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERSISTENT_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistent()
	 * @generated
	 * @ordered
	 */
	protected boolean persistent = PERSISTENT_EDEFAULT;

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
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HyldesignerPackage.DOMAIN_ATTR__OPTIONAL, oldOptional,
					optional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPersistent() {
		return persistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersistent(boolean newPersistent) {
		boolean oldPersistent = persistent;
		persistent = newPersistent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HyldesignerPackage.DOMAIN_ATTR__PERSISTENT,
					oldPersistent, persistent));
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
		case HyldesignerPackage.DOMAIN_ATTR__OPTIONAL:
			return isOptional();
		case HyldesignerPackage.DOMAIN_ATTR__PERSISTENT:
			return isPersistent();
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
		case HyldesignerPackage.DOMAIN_ATTR__OPTIONAL:
			setOptional((Boolean) newValue);
			return;
		case HyldesignerPackage.DOMAIN_ATTR__PERSISTENT:
			setPersistent((Boolean) newValue);
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
		case HyldesignerPackage.DOMAIN_ATTR__OPTIONAL:
			setOptional(OPTIONAL_EDEFAULT);
			return;
		case HyldesignerPackage.DOMAIN_ATTR__PERSISTENT:
			setPersistent(PERSISTENT_EDEFAULT);
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
		case HyldesignerPackage.DOMAIN_ATTR__OPTIONAL:
			return optional != OPTIONAL_EDEFAULT;
		case HyldesignerPackage.DOMAIN_ATTR__PERSISTENT:
			return persistent != PERSISTENT_EDEFAULT;
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
		result.append(", optional: ");
		result.append(optional);
		result.append(", persistent: ");
		result.append(persistent);
		result.append(')');
		return result.toString();
	}

} //DomainAttrImpl
