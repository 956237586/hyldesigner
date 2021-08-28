/**
 */
package cn.hylstudio.mdse.hyldesigner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.DomainEntity#getId <em>Id</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.DomainEntity#getDomainattr <em>Domainattr</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.DomainEntity#getGenerate <em>Generate</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.DomainEntity#getDto <em>Dto</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.DomainEntity#getDbentity <em>Dbentity</em>}</li>
 * </ul>
 *
 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getDomainEntity()
 * @model
 * @generated
 */
public interface DomainEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getDomainEntity_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link cn.hylstudio.mdse.hyldesigner.DomainEntity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Generate</b></em>' containment reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.RequestPayload}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate</em>' containment reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getDomainEntity_Generate()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequestPayload> getGenerate();

	/**
	 * Returns the value of the '<em><b>Domainattr</b></em>' containment reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.DomainAttr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domainattr</em>' containment reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getDomainEntity_Domainattr()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainAttr> getDomainattr();

	/**
	 * Returns the value of the '<em><b>Dto</b></em>' containment reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.Dto}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dto</em>' containment reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getDomainEntity_Dto()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dto> getDto();

	/**
	 * Returns the value of the '<em><b>Dbentity</b></em>' reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.DbEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbentity</em>' reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getDomainEntity_Dbentity()
	 * @model
	 * @generated
	 */
	EList<DbEntity> getDbentity();

} // DomainEntity
