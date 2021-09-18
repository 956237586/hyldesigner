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
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.Project#getDomainEntities <em>Domain Entities</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.Project#getDbEntities <em>Db Entities</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.Project#getReqPayloads <em>Req Payloads</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.Project#getRespResults <em>Resp Results</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.Project#getControllers <em>Controllers</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.Project#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.Project#getSubPackages <em>Sub Packages</em>}</li>
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
	 * Returns the value of the '<em><b>Domain Entities</b></em>' containment reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.DomainEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Entities</em>' containment reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getProject_DomainEntities()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainEntity> getDomainEntities();

	/**
	 * Returns the value of the '<em><b>Db Entities</b></em>' containment reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.DbEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Entities</em>' containment reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getProject_DbEntities()
	 * @model containment="true"
	 * @generated
	 */
	EList<DbEntity> getDbEntities();

	/**
	 * Returns the value of the '<em><b>Req Payloads</b></em>' containment reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.RequestPayload}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Payloads</em>' containment reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getProject_ReqPayloads()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequestPayload> getReqPayloads();

	/**
	 * Returns the value of the '<em><b>Resp Results</b></em>' containment reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.ResponseResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resp Results</em>' containment reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getProject_RespResults()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResponseResult> getRespResults();

	/**
	 * Returns the value of the '<em><b>Controllers</b></em>' containment reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.Controller}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controllers</em>' containment reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getProject_Controllers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Controller> getControllers();

	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' reference.
	 * @see #setBasePackage(PackageDefine)
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getProject_BasePackage()
	 * @model required="true"
	 * @generated
	 */
	PackageDefine getBasePackage();

	/**
	 * Sets the value of the '{@link cn.hylstudio.mdse.hyldesigner.Project#getBasePackage <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' reference.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(PackageDefine value);

	/**
	 * Returns the value of the '<em><b>Sub Packages</b></em>' reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.PackageDefine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Packages</em>' reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getProject_SubPackages()
	 * @model
	 * @generated
	 */
	EList<PackageDefine> getSubPackages();

} // Project
