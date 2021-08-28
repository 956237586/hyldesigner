/**
 */
package cn.hylstudio.mdse.hyldesigner;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.Repo#getName <em>Name</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.Repo#getDbentity <em>Dbentity</em>}</li>
 * </ul>
 *
 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getRepo()
 * @model
 * @generated
 */
public interface Repo extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getRepo_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cn.hylstudio.mdse.hyldesigner.Repo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Dbentity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbentity</em>' reference.
	 * @see #setDbentity(DbEntity)
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getRepo_Dbentity()
	 * @model required="true"
	 * @generated
	 */
	DbEntity getDbentity();

	/**
	 * Sets the value of the '{@link cn.hylstudio.mdse.hyldesigner.Repo#getDbentity <em>Dbentity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbentity</em>' reference.
	 * @see #getDbentity()
	 * @generated
	 */
	void setDbentity(DbEntity value);

} // Repo
