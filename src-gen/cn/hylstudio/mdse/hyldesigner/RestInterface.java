/**
 */
package cn.hylstudio.mdse.hyldesigner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rest Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getPayload <em>Payload</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getResult <em>Result</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getMapping <em>Mapping</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getName <em>Name</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getDesc <em>Desc</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getInvokeBizServices <em>Invoke Biz Services</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getAccess <em>Access</em>}</li>
 * </ul>
 *
 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getRestInterface()
 * @model
 * @generated
 */
public interface RestInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Payload</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payload</em>' reference.
	 * @see #setPayload(RequestPayload)
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getRestInterface_Payload()
	 * @model
	 * @generated
	 */
	RequestPayload getPayload();

	/**
	 * Sets the value of the '{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getPayload <em>Payload</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payload</em>' reference.
	 * @see #getPayload()
	 * @generated
	 */
	void setPayload(RequestPayload value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' reference.
	 * @see #setResult(ResponseResult)
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getRestInterface_Result()
	 * @model
	 * @generated
	 */
	ResponseResult getResult();

	/**
	 * Sets the value of the '{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getResult <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(ResponseResult value);

	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' attribute.
	 * @see #setMapping(String)
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getRestInterface_Mapping()
	 * @model
	 * @generated
	 */
	String getMapping();

	/**
	 * Sets the value of the '{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getMapping <em>Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' attribute.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getRestInterface_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #setDesc(String)
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getRestInterface_Desc()
	 * @model
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

	/**
	 * Returns the value of the '<em><b>Invoke Biz Services</b></em>' containment reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.BizService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoke Biz Services</em>' containment reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getRestInterface_InvokeBizServices()
	 * @model containment="true"
	 * @generated
	 */
	EList<BizService> getInvokeBizServices();

	/**
	 * Returns the value of the '<em><b>Access</b></em>' reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.DomainEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getRestInterface_Access()
	 * @model
	 * @generated
	 */
	EList<DomainEntity> getAccess();

} // RestInterface
