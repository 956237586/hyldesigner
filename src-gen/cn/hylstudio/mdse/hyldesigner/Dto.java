/**
 */
package cn.hylstudio.mdse.hyldesigner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.Dto#getDto <em>Dto</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.Dto#getDtoattr <em>Dtoattr</em>}</li>
 * </ul>
 *
 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getDto()
 * @model
 * @generated
 */
public interface Dto extends EObject {
	/**
	 * Returns the value of the '<em><b>Dto</b></em>' reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.Dto}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dto</em>' reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getDto_Dto()
	 * @model
	 * @generated
	 */
	EList<Dto> getDto();

	/**
	 * Returns the value of the '<em><b>Dtoattr</b></em>' containment reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.DtoAttr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtoattr</em>' containment reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getDto_Dtoattr()
	 * @model containment="true"
	 * @generated
	 */
	EList<DtoAttr> getDtoattr();

} // Dto
