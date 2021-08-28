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
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getRequestpayload <em>Requestpayload</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getResponseresult <em>Responseresult</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getRestApiUri <em>Rest Api Uri</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getName <em>Name</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getApiDesc <em>Api Desc</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getBizservice <em>Bizservice</em>}</li>
 * </ul>
 *
 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getRestInterface()
 * @model
 * @generated
 */
public interface RestInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Requestpayload</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requestpayload</em>' reference.
	 * @see #setRequestpayload(RequestPayload)
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getRestInterface_Requestpayload()
	 * @model
	 * @generated
	 */
	RequestPayload getRequestpayload();

	/**
	 * Sets the value of the '{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getRequestpayload <em>Requestpayload</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requestpayload</em>' reference.
	 * @see #getRequestpayload()
	 * @generated
	 */
	void setRequestpayload(RequestPayload value);

	/**
	 * Returns the value of the '<em><b>Responseresult</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responseresult</em>' reference.
	 * @see #setResponseresult(ResponseResult)
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getRestInterface_Responseresult()
	 * @model
	 * @generated
	 */
	ResponseResult getResponseresult();

	/**
	 * Sets the value of the '{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getResponseresult <em>Responseresult</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responseresult</em>' reference.
	 * @see #getResponseresult()
	 * @generated
	 */
	void setResponseresult(ResponseResult value);

	/**
	 * Returns the value of the '<em><b>Rest Api Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest Api Uri</em>' attribute.
	 * @see #setRestApiUri(String)
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getRestInterface_RestApiUri()
	 * @model
	 * @generated
	 */
	String getRestApiUri();

	/**
	 * Sets the value of the '{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getRestApiUri <em>Rest Api Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest Api Uri</em>' attribute.
	 * @see #getRestApiUri()
	 * @generated
	 */
	void setRestApiUri(String value);

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
	 * Returns the value of the '<em><b>Api Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Desc</em>' attribute.
	 * @see #setApiDesc(String)
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getRestInterface_ApiDesc()
	 * @model
	 * @generated
	 */
	String getApiDesc();

	/**
	 * Sets the value of the '{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getApiDesc <em>Api Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Desc</em>' attribute.
	 * @see #getApiDesc()
	 * @generated
	 */
	void setApiDesc(String value);

	/**
	 * Returns the value of the '<em><b>Bizservice</b></em>' containment reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.BizService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bizservice</em>' containment reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getRestInterface_Bizservice()
	 * @model containment="true"
	 * @generated
	 */
	EList<BizService> getBizservice();

} // RestInterface
