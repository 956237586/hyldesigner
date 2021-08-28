/**
 */
package cn.hylstudio.mdse.hyldesigner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Db Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.DbEntity#getDbattr <em>Dbattr</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.DbEntity#getDomainentity <em>Domainentity</em>}</li>
 * </ul>
 *
 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getDbEntity()
 * @model
 * @generated
 */
public interface DbEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Dbattr</b></em>' containment reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.DbAttr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbattr</em>' containment reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getDbEntity_Dbattr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DbAttr> getDbattr();

	/**
	 * Returns the value of the '<em><b>Domainentity</b></em>' reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.DomainEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domainentity</em>' reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getDbEntity_Domainentity()
	 * @model
	 * @generated
	 */
	EList<DomainEntity> getDomainentity();

} // DbEntity
