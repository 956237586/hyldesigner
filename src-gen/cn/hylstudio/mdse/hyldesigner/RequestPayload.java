/**
 */
package cn.hylstudio.mdse.hyldesigner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Payload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.RequestPayload#getGeneratedBy <em>Generated By</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.RequestPayload#getContainsAttr <em>Contains Attr</em>}</li>
 * </ul>
 *
 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getRequestPayload()
 * @model
 * @generated
 */
public interface RequestPayload extends EObject {
	/**
	 * Returns the value of the '<em><b>Generated By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated By</em>' reference.
	 * @see #setGeneratedBy(DomainEntity)
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getRequestPayload_GeneratedBy()
	 * @model required="true"
	 * @generated
	 */
	DomainEntity getGeneratedBy();

	/**
	 * Sets the value of the '{@link cn.hylstudio.mdse.hyldesigner.RequestPayload#getGeneratedBy <em>Generated By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generated By</em>' reference.
	 * @see #getGeneratedBy()
	 * @generated
	 */
	void setGeneratedBy(DomainEntity value);

	/**
	 * Returns the value of the '<em><b>Contains Attr</b></em>' containment reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.RequestAttr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Attr</em>' containment reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getRequestPayload_ContainsAttr()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequestAttr> getContainsAttr();

} // RequestPayload
