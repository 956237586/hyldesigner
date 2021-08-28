/**
 */
package cn.hylstudio.mdse.hyldesigner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.Project#getName <em>Name</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.Project#getContainsDomain <em>Contains Domain</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.Project#getContainsPayload <em>Contains Payload</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.Project#getDbentity <em>Dbentity</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.Project#getResponseresult <em>Responseresult</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.Project#getController <em>Controller</em>}</li>
 * </ul>
 *
 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cn.hylstudio.mdse.hyldesigner.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contains Domain</b></em>' containment reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.DomainEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Domain</em>' containment reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getProject_ContainsDomain()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainEntity> getContainsDomain();

	/**
	 * Returns the value of the '<em><b>Contains Payload</b></em>' containment reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.RequestPayload}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Payload</em>' containment reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getProject_ContainsPayload()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequestPayload> getContainsPayload();

	/**
	 * Returns the value of the '<em><b>Dbentity</b></em>' containment reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.DbEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbentity</em>' containment reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getProject_Dbentity()
	 * @model containment="true"
	 * @generated
	 */
	EList<DbEntity> getDbentity();

	/**
	 * Returns the value of the '<em><b>Responseresult</b></em>' containment reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.ResponseResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responseresult</em>' containment reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getProject_Responseresult()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResponseResult> getResponseresult();

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' containment reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.Controller}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' containment reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getProject_Controller()
	 * @model containment="true"
	 * @generated
	 */
	EList<Controller> getController();

} // Project
