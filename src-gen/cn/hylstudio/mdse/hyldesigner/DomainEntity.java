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
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.DomainEntity#getAttr <em>Attr</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.DomainEntity#getGeneratedPayload <em>Generated Payload</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.DomainEntity#getGeneratedDto <em>Generated Dto</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.DomainEntity#getGeneratedDbEntity <em>Generated Db Entity</em>}</li>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.DomainEntity#getBelongTo <em>Belong To</em>}</li>
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
	 * Returns the value of the '<em><b>Attr</b></em>' containment reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.DomainAttr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr</em>' containment reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getDomainEntity_Attr()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainAttr> getAttr();

	/**
	 * Returns the value of the '<em><b>Generated Payload</b></em>' containment reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.RequestPayload}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Payload</em>' containment reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getDomainEntity_GeneratedPayload()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequestPayload> getGeneratedPayload();

	/**
	 * Returns the value of the '<em><b>Generated Dto</b></em>' containment reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.Dto}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Dto</em>' containment reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getDomainEntity_GeneratedDto()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dto> getGeneratedDto();

	/**
	 * Returns the value of the '<em><b>Generated Db Entity</b></em>' reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.DbEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Db Entity</em>' reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getDomainEntity_GeneratedDbEntity()
	 * @model
	 * @generated
	 */
	EList<DbEntity> getGeneratedDbEntity();

	/**
	 * Returns the value of the '<em><b>Belong To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belong To</em>' reference.
	 * @see #setBelongTo(PackageDefine)
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getDomainEntity_BelongTo()
	 * @model required="true"
	 * @generated
	 */
	PackageDefine getBelongTo();

	/**
	 * Sets the value of the '{@link cn.hylstudio.mdse.hyldesigner.DomainEntity#getBelongTo <em>Belong To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belong To</em>' reference.
	 * @see #getBelongTo()
	 * @generated
	 */
	void setBelongTo(PackageDefine value);

} // DomainEntity
