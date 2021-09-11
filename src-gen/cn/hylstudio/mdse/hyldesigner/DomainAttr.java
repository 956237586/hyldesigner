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
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.DomainAttr#isOptional <em>Optional</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.DomainAttr#isPersistent <em>Persistent</em>}</li>
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
	 * @model extendedMetaData="desc='\u662f\u5426\u4e1a\u52a1\u4e3b\u952e'"
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
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getDomainAttr_Optional()
	 * @model default="false"
	 *        extendedMetaData="desc='\u662f\u5426\u4e1a\u52a1\u4e3b\u952e'"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link cn.hylstudio.mdse.hyldesigner.DomainAttr#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistent</em>' attribute.
	 * @see #setPersistent(boolean)
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getDomainAttr_Persistent()
	 * @model
	 * @generated
	 */
	boolean isPersistent();

	/**
	 * Sets the value of the '{@link cn.hylstudio.mdse.hyldesigner.DomainAttr#isPersistent <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent</em>' attribute.
	 * @see #isPersistent()
	 * @generated
	 */
	void setPersistent(boolean value);
} // DomainAttr
