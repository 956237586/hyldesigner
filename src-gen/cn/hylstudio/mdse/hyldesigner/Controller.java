/**
 */
package cn.hylstudio.mdse.hyldesigner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.Controller#getName <em>Name</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.Controller#getRestinterface <em>Restinterface</em>}</li>
 * </ul>
 *
 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getController()
 * @model
 * @generated
 */
public interface Controller extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getController_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cn.hylstudio.mdse.hyldesigner.Controller#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Restinterface</b></em>' containment reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.RestInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restinterface</em>' containment reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getController_Restinterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<RestInterface> getRestinterface();

} // Controller
