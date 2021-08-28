/**
 */
package cn.hylstudio.mdse.hyldesigner;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage
 * @generated
 */
public interface HyldesignerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HyldesignerFactory eINSTANCE = cn.hylstudio.mdse.hyldesigner.impl.HyldesignerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Domain Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Entity</em>'.
	 * @generated
	 */
	DomainEntity createDomainEntity();

	/**
	 * Returns a new object of class '<em>Request Payload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Payload</em>'.
	 * @generated
	 */
	RequestPayload createRequestPayload();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	Project createProject();

	/**
	 * Returns a new object of class '<em>Db Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Db Entity</em>'.
	 * @generated
	 */
	DbEntity createDbEntity();

	/**
	 * Returns a new object of class '<em>Domain Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Attr</em>'.
	 * @generated
	 */
	DomainAttr createDomainAttr();

	/**
	 * Returns a new object of class '<em>Db Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Db Attr</em>'.
	 * @generated
	 */
	DbAttr createDbAttr();

	/**
	 * Returns a new object of class '<em>Response Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Result</em>'.
	 * @generated
	 */
	ResponseResult createResponseResult();

	/**
	 * Returns a new object of class '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controller</em>'.
	 * @generated
	 */
	Controller createController();

	/**
	 * Returns a new object of class '<em>Dto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dto</em>'.
	 * @generated
	 */
	Dto createDto();

	/**
	 * Returns a new object of class '<em>Rest Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rest Interface</em>'.
	 * @generated
	 */
	RestInterface createRestInterface();

	/**
	 * Returns a new object of class '<em>Request Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Attr</em>'.
	 * @generated
	 */
	RequestAttr createRequestAttr();

	/**
	 * Returns a new object of class '<em>Response Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Attr</em>'.
	 * @generated
	 */
	ResponseAttr createResponseAttr();

	/**
	 * Returns a new object of class '<em>Dto Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dto Attr</em>'.
	 * @generated
	 */
	DtoAttr createDtoAttr();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Biz Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Biz Service</em>'.
	 * @generated
	 */
	BizService createBizService();

	/**
	 * Returns a new object of class '<em>Base Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Service</em>'.
	 * @generated
	 */
	BaseService createBaseService();

	/**
	 * Returns a new object of class '<em>Repo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repo</em>'.
	 * @generated
	 */
	Repo createRepo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HyldesignerPackage getHyldesignerPackage();

} //HyldesignerFactory
