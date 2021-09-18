/**
 */
package cn.hylstudio.mdse.hyldesigner;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Attr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.DomainAttr#isIsBizKey <em>Is Biz Key</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.DomainAttr#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.DomainAttr#isNeedPersistent <em>Need Persistent</em>}</li>
 * </ul>
 *
 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getDomainAttr()
 * @model
 * @generated
 */
public interface DomainAttr extends Attr {
	/**
	 * Returns the value of the '<em><b>Is Biz Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Biz Key</em>' attribute.
	 * @see #setIsBizKey(boolean)
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getDomainAttr_IsBizKey()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsBizKey();

	/**
	 * Sets the value of the '{@link cn.hylstudio.mdse.hyldesigner.DomainAttr#isIsBizKey <em>Is Biz Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Biz Key</em>' attribute.
	 * @see #isIsBizKey()
	 * @generated
	 */
	void setIsBizKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Optional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Optional</em>' attribute.
	 * @see #setIsOptional(boolean)
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getDomainAttr_IsOptional()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsOptional();

	/**
	 * Sets the value of the '{@link cn.hylstudio.mdse.hyldesigner.DomainAttr#isIsOptional <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Optional</em>' attribute.
	 * @see #isIsOptional()
	 * @generated
	 */
	void setIsOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Need Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Need Persistent</em>' attribute.
	 * @see #setNeedPersistent(boolean)
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getDomainAttr_NeedPersistent()
	 * @model required="true"
	 * @generated
	 */
	boolean isNeedPersistent();

	/**
	 * Sets the value of the '{@link cn.hylstudio.mdse.hyldesigner.DomainAttr#isNeedPersistent <em>Need Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Need Persistent</em>' attribute.
	 * @see #isNeedPersistent()
	 * @generated
	 */
	void setNeedPersistent(boolean value);

} // DomainAttr
