/**
 */
package cn.hylstudio.mdse.hyldesigner;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerFactory
 * @model kind="package"
 * @generated
 */
public interface HyldesignerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hyldesigner";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mdse.hylstudio.cn/hyldesigner";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hyldesigner";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HyldesignerPackage eINSTANCE = cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl.init();

	/**
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.DomainEntityImpl <em>Domain Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.DomainEntityImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getDomainEntity()
	 * @generated
	 */
	int DOMAIN_ENTITY = 6;

	/**
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.RequestPayloadImpl <em>Request Payload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.RequestPayloadImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getRequestPayload()
	 * @generated
	 */
	int REQUEST_PAYLOAD = 7;

	/**
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.ProjectImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 8;

	/**
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.DbEntityImpl <em>Db Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.DbEntityImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getDbEntity()
	 * @generated
	 */
	int DB_ENTITY = 9;

	/**
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.AttrImpl <em>Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.AttrImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getAttr()
	 * @generated
	 */
	int ATTR = 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTR__KEY = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTR__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTR__DESC = 2;

	/**
	 * The number of structural features of the '<em>Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.DomainAttrImpl <em>Domain Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.DomainAttrImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getDomainAttr()
	 * @generated
	 */
	int DOMAIN_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ATTR__KEY = ATTR__KEY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ATTR__TYPE = ATTR__TYPE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ATTR__DESC = ATTR__DESC;

	/**
	 * The feature id for the '<em><b>Is Biz Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ATTR__IS_BIZ_KEY = ATTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ATTR__OPTIONAL = ATTR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Domain Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ATTR_FEATURE_COUNT = ATTR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Domain Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ATTR_OPERATION_COUNT = ATTR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.DbAttrImpl <em>Db Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.DbAttrImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getDbAttr()
	 * @generated
	 */
	int DB_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_ATTR__KEY = ATTR__KEY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_ATTR__TYPE = ATTR__TYPE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_ATTR__DESC = ATTR__DESC;

	/**
	 * The number of structural features of the '<em>Db Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_ATTR_FEATURE_COUNT = ATTR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Db Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_ATTR_OPERATION_COUNT = ATTR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.ResponseResultImpl <em>Response Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.ResponseResultImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getResponseResult()
	 * @generated
	 */
	int RESPONSE_RESULT = 10;

	/**
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.ControllerImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 11;

	/**
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.DtoImpl <em>Dto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.DtoImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getDto()
	 * @generated
	 */
	int DTO = 12;

	/**
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.RestInterfaceImpl <em>Rest Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.RestInterfaceImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getRestInterface()
	 * @generated
	 */
	int REST_INTERFACE = 13;

	/**
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.RequestAttrImpl <em>Request Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.RequestAttrImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getRequestAttr()
	 * @generated
	 */
	int REQUEST_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ATTR__KEY = ATTR__KEY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ATTR__TYPE = ATTR__TYPE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ATTR__DESC = ATTR__DESC;

	/**
	 * The feature id for the '<em><b>Dto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ATTR__DTO = ATTR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Request Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ATTR_FEATURE_COUNT = ATTR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Request Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ATTR_OPERATION_COUNT = ATTR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.ResponseAttrImpl <em>Response Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.ResponseAttrImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getResponseAttr()
	 * @generated
	 */
	int RESPONSE_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ATTR__KEY = ATTR__KEY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ATTR__TYPE = ATTR__TYPE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ATTR__DESC = ATTR__DESC;

	/**
	 * The feature id for the '<em><b>Dto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ATTR__DTO = ATTR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Response Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ATTR_FEATURE_COUNT = ATTR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Response Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ATTR_OPERATION_COUNT = ATTR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.DtoAttrImpl <em>Dto Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.DtoAttrImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getDtoAttr()
	 * @generated
	 */
	int DTO_ATTR = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_ATTR__KEY = ATTR__KEY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_ATTR__TYPE = ATTR__TYPE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_ATTR__DESC = ATTR__DESC;

	/**
	 * The number of structural features of the '<em>Dto Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_ATTR_FEATURE_COUNT = ATTR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dto Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_ATTR_OPERATION_COUNT = ATTR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ENTITY__ID = 0;

	/**
	 * The feature id for the '<em><b>Domainattr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ENTITY__DOMAINATTR = 1;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ENTITY__GENERATE = 2;

	/**
	 * The feature id for the '<em><b>Dto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ENTITY__DTO = 3;

	/**
	 * The feature id for the '<em><b>Dbentity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ENTITY__DBENTITY = 4;

	/**
	 * The number of structural features of the '<em>Domain Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ENTITY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Domain Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Generated By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PAYLOAD__GENERATED_BY = 0;

	/**
	 * The feature id for the '<em><b>Requestattr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PAYLOAD__REQUESTATTR = 1;

	/**
	 * The number of structural features of the '<em>Request Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PAYLOAD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Request Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PAYLOAD_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contains Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CONTAINS_DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Contains Payload</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CONTAINS_PAYLOAD = 2;

	/**
	 * The feature id for the '<em><b>Dbentity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DBENTITY = 3;

	/**
	 * The feature id for the '<em><b>Responseresult</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__RESPONSERESULT = 4;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CONTROLLER = 5;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Dbattr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_ENTITY__DBATTR = 0;

	/**
	 * The feature id for the '<em><b>Domainentity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_ENTITY__DOMAINENTITY = 1;

	/**
	 * The number of structural features of the '<em>Db Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Db Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Responseattr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_RESULT__RESPONSEATTR = 0;

	/**
	 * The number of structural features of the '<em>Response Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_RESULT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Response Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_RESULT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Restinterface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__RESTINTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Dto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__DTO = 0;

	/**
	 * The feature id for the '<em><b>Dtoattr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__DTOATTR = 1;

	/**
	 * The number of structural features of the '<em>Dto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Requestpayload</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE__REQUESTPAYLOAD = 0;

	/**
	 * The feature id for the '<em><b>Responseresult</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE__RESPONSERESULT = 1;

	/**
	 * The feature id for the '<em><b>Rest Api Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE__REST_API_URI = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Api Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE__API_DESC = 4;

	/**
	 * The feature id for the '<em><b>Bizservice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE__BIZSERVICE = 5;

	/**
	 * The number of structural features of the '<em>Rest Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Rest Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.ServiceImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.BizServiceImpl <em>Biz Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.BizServiceImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getBizService()
	 * @generated
	 */
	int BIZ_SERVICE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_SERVICE__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Baseservice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_SERVICE__BASESERVICE = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Biz Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Biz Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_SERVICE_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.BaseServiceImpl <em>Base Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.BaseServiceImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getBaseService()
	 * @generated
	 */
	int BASE_SERVICE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERVICE__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Repo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERVICE__REPO = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Base Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Base Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERVICE_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.RepoImpl <em>Repo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.RepoImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getRepo()
	 * @generated
	 */
	int REPO = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Dbentity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPO__DBENTITY = 1;

	/**
	 * The number of structural features of the '<em>Repo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Repo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPO_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link cn.hylstudio.mdse.hyldesigner.DomainEntity <em>Domain Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Entity</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.DomainEntity
	 * @generated
	 */
	EClass getDomainEntity();

	/**
	 * Returns the meta object for the attribute '{@link cn.hylstudio.mdse.hyldesigner.DomainEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.DomainEntity#getId()
	 * @see #getDomainEntity()
	 * @generated
	 */
	EAttribute getDomainEntity_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.DomainEntity#getGenerate <em>Generate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generate</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.DomainEntity#getGenerate()
	 * @see #getDomainEntity()
	 * @generated
	 */
	EReference getDomainEntity_Generate();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.DomainEntity#getDomainattr <em>Domainattr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domainattr</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.DomainEntity#getDomainattr()
	 * @see #getDomainEntity()
	 * @generated
	 */
	EReference getDomainEntity_Domainattr();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.DomainEntity#getDto <em>Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dto</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.DomainEntity#getDto()
	 * @see #getDomainEntity()
	 * @generated
	 */
	EReference getDomainEntity_Dto();

	/**
	 * Returns the meta object for the reference list '{@link cn.hylstudio.mdse.hyldesigner.DomainEntity#getDbentity <em>Dbentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dbentity</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.DomainEntity#getDbentity()
	 * @see #getDomainEntity()
	 * @generated
	 */
	EReference getDomainEntity_Dbentity();

	/**
	 * Returns the meta object for class '{@link cn.hylstudio.mdse.hyldesigner.RequestPayload <em>Request Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Payload</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.RequestPayload
	 * @generated
	 */
	EClass getRequestPayload();

	/**
	 * Returns the meta object for the reference '{@link cn.hylstudio.mdse.hyldesigner.RequestPayload#getGeneratedBy <em>Generated By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generated By</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.RequestPayload#getGeneratedBy()
	 * @see #getRequestPayload()
	 * @generated
	 */
	EReference getRequestPayload_GeneratedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.RequestPayload#getRequestattr <em>Requestattr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requestattr</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.RequestPayload#getRequestattr()
	 * @see #getRequestPayload()
	 * @generated
	 */
	EReference getRequestPayload_Requestattr();

	/**
	 * Returns the meta object for class '{@link cn.hylstudio.mdse.hyldesigner.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link cn.hylstudio.mdse.hyldesigner.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.Project#getContainsDomain <em>Contains Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Domain</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Project#getContainsDomain()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_ContainsDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.Project#getContainsPayload <em>Contains Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Payload</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Project#getContainsPayload()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_ContainsPayload();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.Project#getDbentity <em>Dbentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dbentity</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Project#getDbentity()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Dbentity();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.Project#getResponseresult <em>Responseresult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responseresult</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Project#getResponseresult()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Responseresult();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.Project#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controller</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Project#getController()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Controller();

	/**
	 * Returns the meta object for class '{@link cn.hylstudio.mdse.hyldesigner.DbEntity <em>Db Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Db Entity</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.DbEntity
	 * @generated
	 */
	EClass getDbEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.DbEntity#getDbattr <em>Dbattr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dbattr</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.DbEntity#getDbattr()
	 * @see #getDbEntity()
	 * @generated
	 */
	EReference getDbEntity_Dbattr();

	/**
	 * Returns the meta object for the reference list '{@link cn.hylstudio.mdse.hyldesigner.DbEntity#getDomainentity <em>Domainentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domainentity</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.DbEntity#getDomainentity()
	 * @see #getDbEntity()
	 * @generated
	 */
	EReference getDbEntity_Domainentity();

	/**
	 * Returns the meta object for class '{@link cn.hylstudio.mdse.hyldesigner.DomainAttr <em>Domain Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Attr</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.DomainAttr
	 * @generated
	 */
	EClass getDomainAttr();

	/**
	 * Returns the meta object for the attribute '{@link cn.hylstudio.mdse.hyldesigner.DomainAttr#isIsBizKey <em>Is Biz Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Biz Key</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.DomainAttr#isIsBizKey()
	 * @see #getDomainAttr()
	 * @generated
	 */
	EAttribute getDomainAttr_IsBizKey();

	/**
	 * Returns the meta object for the attribute '{@link cn.hylstudio.mdse.hyldesigner.DomainAttr#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.DomainAttr#isOptional()
	 * @see #getDomainAttr()
	 * @generated
	 */
	EAttribute getDomainAttr_Optional();

	/**
	 * Returns the meta object for class '{@link cn.hylstudio.mdse.hyldesigner.Attr <em>Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attr</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Attr
	 * @generated
	 */
	EClass getAttr();

	/**
	 * Returns the meta object for the attribute '{@link cn.hylstudio.mdse.hyldesigner.Attr#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Attr#getKey()
	 * @see #getAttr()
	 * @generated
	 */
	EAttribute getAttr_Key();

	/**
	 * Returns the meta object for the attribute '{@link cn.hylstudio.mdse.hyldesigner.Attr#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Attr#getType()
	 * @see #getAttr()
	 * @generated
	 */
	EAttribute getAttr_Type();

	/**
	 * Returns the meta object for the attribute '{@link cn.hylstudio.mdse.hyldesigner.Attr#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Attr#getDesc()
	 * @see #getAttr()
	 * @generated
	 */
	EAttribute getAttr_Desc();

	/**
	 * Returns the meta object for class '{@link cn.hylstudio.mdse.hyldesigner.DbAttr <em>Db Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Db Attr</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.DbAttr
	 * @generated
	 */
	EClass getDbAttr();

	/**
	 * Returns the meta object for class '{@link cn.hylstudio.mdse.hyldesigner.ResponseResult <em>Response Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Result</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.ResponseResult
	 * @generated
	 */
	EClass getResponseResult();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.ResponseResult#getResponseattr <em>Responseattr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responseattr</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.ResponseResult#getResponseattr()
	 * @see #getResponseResult()
	 * @generated
	 */
	EReference getResponseResult_Responseattr();

	/**
	 * Returns the meta object for class '{@link cn.hylstudio.mdse.hyldesigner.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the attribute '{@link cn.hylstudio.mdse.hyldesigner.Controller#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Controller#getName()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.Controller#getRestinterface <em>Restinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Restinterface</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Controller#getRestinterface()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Restinterface();

	/**
	 * Returns the meta object for class '{@link cn.hylstudio.mdse.hyldesigner.Dto <em>Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dto</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Dto
	 * @generated
	 */
	EClass getDto();

	/**
	 * Returns the meta object for the reference list '{@link cn.hylstudio.mdse.hyldesigner.Dto#getDto <em>Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dto</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Dto#getDto()
	 * @see #getDto()
	 * @generated
	 */
	EReference getDto_Dto();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.Dto#getDtoattr <em>Dtoattr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dtoattr</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Dto#getDtoattr()
	 * @see #getDto()
	 * @generated
	 */
	EReference getDto_Dtoattr();

	/**
	 * Returns the meta object for class '{@link cn.hylstudio.mdse.hyldesigner.RestInterface <em>Rest Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rest Interface</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.RestInterface
	 * @generated
	 */
	EClass getRestInterface();

	/**
	 * Returns the meta object for the reference '{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getRequestpayload <em>Requestpayload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requestpayload</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.RestInterface#getRequestpayload()
	 * @see #getRestInterface()
	 * @generated
	 */
	EReference getRestInterface_Requestpayload();

	/**
	 * Returns the meta object for the reference '{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getResponseresult <em>Responseresult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responseresult</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.RestInterface#getResponseresult()
	 * @see #getRestInterface()
	 * @generated
	 */
	EReference getRestInterface_Responseresult();

	/**
	 * Returns the meta object for the attribute '{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getRestApiUri <em>Rest Api Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rest Api Uri</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.RestInterface#getRestApiUri()
	 * @see #getRestInterface()
	 * @generated
	 */
	EAttribute getRestInterface_RestApiUri();

	/**
	 * Returns the meta object for the attribute '{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.RestInterface#getName()
	 * @see #getRestInterface()
	 * @generated
	 */
	EAttribute getRestInterface_Name();

	/**
	 * Returns the meta object for the attribute '{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getApiDesc <em>Api Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Desc</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.RestInterface#getApiDesc()
	 * @see #getRestInterface()
	 * @generated
	 */
	EAttribute getRestInterface_ApiDesc();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getBizservice <em>Bizservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bizservice</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.RestInterface#getBizservice()
	 * @see #getRestInterface()
	 * @generated
	 */
	EReference getRestInterface_Bizservice();

	/**
	 * Returns the meta object for class '{@link cn.hylstudio.mdse.hyldesigner.RequestAttr <em>Request Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Attr</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.RequestAttr
	 * @generated
	 */
	EClass getRequestAttr();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.RequestAttr#getDto <em>Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dto</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.RequestAttr#getDto()
	 * @see #getRequestAttr()
	 * @generated
	 */
	EReference getRequestAttr_Dto();

	/**
	 * Returns the meta object for class '{@link cn.hylstudio.mdse.hyldesigner.ResponseAttr <em>Response Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Attr</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.ResponseAttr
	 * @generated
	 */
	EClass getResponseAttr();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.ResponseAttr#getDto <em>Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dto</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.ResponseAttr#getDto()
	 * @see #getResponseAttr()
	 * @generated
	 */
	EReference getResponseAttr_Dto();

	/**
	 * Returns the meta object for class '{@link cn.hylstudio.mdse.hyldesigner.DtoAttr <em>Dto Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dto Attr</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.DtoAttr
	 * @generated
	 */
	EClass getDtoAttr();

	/**
	 * Returns the meta object for class '{@link cn.hylstudio.mdse.hyldesigner.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link cn.hylstudio.mdse.hyldesigner.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for class '{@link cn.hylstudio.mdse.hyldesigner.BizService <em>Biz Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Biz Service</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.BizService
	 * @generated
	 */
	EClass getBizService();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.BizService#getBaseservice <em>Baseservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Baseservice</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.BizService#getBaseservice()
	 * @see #getBizService()
	 * @generated
	 */
	EReference getBizService_Baseservice();

	/**
	 * Returns the meta object for class '{@link cn.hylstudio.mdse.hyldesigner.BaseService <em>Base Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Service</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.BaseService
	 * @generated
	 */
	EClass getBaseService();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.BaseService#getRepo <em>Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repo</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.BaseService#getRepo()
	 * @see #getBaseService()
	 * @generated
	 */
	EReference getBaseService_Repo();

	/**
	 * Returns the meta object for class '{@link cn.hylstudio.mdse.hyldesigner.Repo <em>Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repo</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Repo
	 * @generated
	 */
	EClass getRepo();

	/**
	 * Returns the meta object for the attribute '{@link cn.hylstudio.mdse.hyldesigner.Repo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Repo#getName()
	 * @see #getRepo()
	 * @generated
	 */
	EAttribute getRepo_Name();

	/**
	 * Returns the meta object for the reference '{@link cn.hylstudio.mdse.hyldesigner.Repo#getDbentity <em>Dbentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dbentity</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Repo#getDbentity()
	 * @see #getRepo()
	 * @generated
	 */
	EReference getRepo_Dbentity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HyldesignerFactory getHyldesignerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cn.hylstudio.mdse.hyldesigner.impl.DomainEntityImpl <em>Domain Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.hylstudio.mdse.hyldesigner.impl.DomainEntityImpl
		 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getDomainEntity()
		 * @generated
		 */
		EClass DOMAIN_ENTITY = eINSTANCE.getDomainEntity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_ENTITY__ID = eINSTANCE.getDomainEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Generate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ENTITY__GENERATE = eINSTANCE.getDomainEntity_Generate();

		/**
		 * The meta object literal for the '<em><b>Domainattr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ENTITY__DOMAINATTR = eINSTANCE.getDomainEntity_Domainattr();

		/**
		 * The meta object literal for the '<em><b>Dto</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ENTITY__DTO = eINSTANCE.getDomainEntity_Dto();

		/**
		 * The meta object literal for the '<em><b>Dbentity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ENTITY__DBENTITY = eINSTANCE.getDomainEntity_Dbentity();

		/**
		 * The meta object literal for the '{@link cn.hylstudio.mdse.hyldesigner.impl.RequestPayloadImpl <em>Request Payload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.hylstudio.mdse.hyldesigner.impl.RequestPayloadImpl
		 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getRequestPayload()
		 * @generated
		 */
		EClass REQUEST_PAYLOAD = eINSTANCE.getRequestPayload();

		/**
		 * The meta object literal for the '<em><b>Generated By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_PAYLOAD__GENERATED_BY = eINSTANCE.getRequestPayload_GeneratedBy();

		/**
		 * The meta object literal for the '<em><b>Requestattr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_PAYLOAD__REQUESTATTR = eINSTANCE.getRequestPayload_Requestattr();

		/**
		 * The meta object literal for the '{@link cn.hylstudio.mdse.hyldesigner.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.hylstudio.mdse.hyldesigner.impl.ProjectImpl
		 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Contains Domain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__CONTAINS_DOMAIN = eINSTANCE.getProject_ContainsDomain();

		/**
		 * The meta object literal for the '<em><b>Contains Payload</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__CONTAINS_PAYLOAD = eINSTANCE.getProject_ContainsPayload();

		/**
		 * The meta object literal for the '<em><b>Dbentity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__DBENTITY = eINSTANCE.getProject_Dbentity();

		/**
		 * The meta object literal for the '<em><b>Responseresult</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__RESPONSERESULT = eINSTANCE.getProject_Responseresult();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__CONTROLLER = eINSTANCE.getProject_Controller();

		/**
		 * The meta object literal for the '{@link cn.hylstudio.mdse.hyldesigner.impl.DbEntityImpl <em>Db Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.hylstudio.mdse.hyldesigner.impl.DbEntityImpl
		 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getDbEntity()
		 * @generated
		 */
		EClass DB_ENTITY = eINSTANCE.getDbEntity();

		/**
		 * The meta object literal for the '<em><b>Dbattr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_ENTITY__DBATTR = eINSTANCE.getDbEntity_Dbattr();

		/**
		 * The meta object literal for the '<em><b>Domainentity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_ENTITY__DOMAINENTITY = eINSTANCE.getDbEntity_Domainentity();

		/**
		 * The meta object literal for the '{@link cn.hylstudio.mdse.hyldesigner.impl.DomainAttrImpl <em>Domain Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.hylstudio.mdse.hyldesigner.impl.DomainAttrImpl
		 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getDomainAttr()
		 * @generated
		 */
		EClass DOMAIN_ATTR = eINSTANCE.getDomainAttr();

		/**
		 * The meta object literal for the '<em><b>Is Biz Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_ATTR__IS_BIZ_KEY = eINSTANCE.getDomainAttr_IsBizKey();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_ATTR__OPTIONAL = eINSTANCE.getDomainAttr_Optional();

		/**
		 * The meta object literal for the '{@link cn.hylstudio.mdse.hyldesigner.impl.AttrImpl <em>Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.hylstudio.mdse.hyldesigner.impl.AttrImpl
		 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getAttr()
		 * @generated
		 */
		EClass ATTR = eINSTANCE.getAttr();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTR__KEY = eINSTANCE.getAttr_Key();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTR__TYPE = eINSTANCE.getAttr_Type();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTR__DESC = eINSTANCE.getAttr_Desc();

		/**
		 * The meta object literal for the '{@link cn.hylstudio.mdse.hyldesigner.impl.DbAttrImpl <em>Db Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.hylstudio.mdse.hyldesigner.impl.DbAttrImpl
		 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getDbAttr()
		 * @generated
		 */
		EClass DB_ATTR = eINSTANCE.getDbAttr();

		/**
		 * The meta object literal for the '{@link cn.hylstudio.mdse.hyldesigner.impl.ResponseResultImpl <em>Response Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.hylstudio.mdse.hyldesigner.impl.ResponseResultImpl
		 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getResponseResult()
		 * @generated
		 */
		EClass RESPONSE_RESULT = eINSTANCE.getResponseResult();

		/**
		 * The meta object literal for the '<em><b>Responseattr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_RESULT__RESPONSEATTR = eINSTANCE.getResponseResult_Responseattr();

		/**
		 * The meta object literal for the '{@link cn.hylstudio.mdse.hyldesigner.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.hylstudio.mdse.hyldesigner.impl.ControllerImpl
		 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__NAME = eINSTANCE.getController_Name();

		/**
		 * The meta object literal for the '<em><b>Restinterface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__RESTINTERFACE = eINSTANCE.getController_Restinterface();

		/**
		 * The meta object literal for the '{@link cn.hylstudio.mdse.hyldesigner.impl.DtoImpl <em>Dto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.hylstudio.mdse.hyldesigner.impl.DtoImpl
		 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getDto()
		 * @generated
		 */
		EClass DTO = eINSTANCE.getDto();

		/**
		 * The meta object literal for the '<em><b>Dto</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTO__DTO = eINSTANCE.getDto_Dto();

		/**
		 * The meta object literal for the '<em><b>Dtoattr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTO__DTOATTR = eINSTANCE.getDto_Dtoattr();

		/**
		 * The meta object literal for the '{@link cn.hylstudio.mdse.hyldesigner.impl.RestInterfaceImpl <em>Rest Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.hylstudio.mdse.hyldesigner.impl.RestInterfaceImpl
		 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getRestInterface()
		 * @generated
		 */
		EClass REST_INTERFACE = eINSTANCE.getRestInterface();

		/**
		 * The meta object literal for the '<em><b>Requestpayload</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_INTERFACE__REQUESTPAYLOAD = eINSTANCE.getRestInterface_Requestpayload();

		/**
		 * The meta object literal for the '<em><b>Responseresult</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_INTERFACE__RESPONSERESULT = eINSTANCE.getRestInterface_Responseresult();

		/**
		 * The meta object literal for the '<em><b>Rest Api Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_INTERFACE__REST_API_URI = eINSTANCE.getRestInterface_RestApiUri();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_INTERFACE__NAME = eINSTANCE.getRestInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Api Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_INTERFACE__API_DESC = eINSTANCE.getRestInterface_ApiDesc();

		/**
		 * The meta object literal for the '<em><b>Bizservice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_INTERFACE__BIZSERVICE = eINSTANCE.getRestInterface_Bizservice();

		/**
		 * The meta object literal for the '{@link cn.hylstudio.mdse.hyldesigner.impl.RequestAttrImpl <em>Request Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.hylstudio.mdse.hyldesigner.impl.RequestAttrImpl
		 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getRequestAttr()
		 * @generated
		 */
		EClass REQUEST_ATTR = eINSTANCE.getRequestAttr();

		/**
		 * The meta object literal for the '<em><b>Dto</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_ATTR__DTO = eINSTANCE.getRequestAttr_Dto();

		/**
		 * The meta object literal for the '{@link cn.hylstudio.mdse.hyldesigner.impl.ResponseAttrImpl <em>Response Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.hylstudio.mdse.hyldesigner.impl.ResponseAttrImpl
		 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getResponseAttr()
		 * @generated
		 */
		EClass RESPONSE_ATTR = eINSTANCE.getResponseAttr();

		/**
		 * The meta object literal for the '<em><b>Dto</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_ATTR__DTO = eINSTANCE.getResponseAttr_Dto();

		/**
		 * The meta object literal for the '{@link cn.hylstudio.mdse.hyldesigner.impl.DtoAttrImpl <em>Dto Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.hylstudio.mdse.hyldesigner.impl.DtoAttrImpl
		 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getDtoAttr()
		 * @generated
		 */
		EClass DTO_ATTR = eINSTANCE.getDtoAttr();

		/**
		 * The meta object literal for the '{@link cn.hylstudio.mdse.hyldesigner.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.hylstudio.mdse.hyldesigner.impl.ServiceImpl
		 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '{@link cn.hylstudio.mdse.hyldesigner.impl.BizServiceImpl <em>Biz Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.hylstudio.mdse.hyldesigner.impl.BizServiceImpl
		 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getBizService()
		 * @generated
		 */
		EClass BIZ_SERVICE = eINSTANCE.getBizService();

		/**
		 * The meta object literal for the '<em><b>Baseservice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIZ_SERVICE__BASESERVICE = eINSTANCE.getBizService_Baseservice();

		/**
		 * The meta object literal for the '{@link cn.hylstudio.mdse.hyldesigner.impl.BaseServiceImpl <em>Base Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.hylstudio.mdse.hyldesigner.impl.BaseServiceImpl
		 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getBaseService()
		 * @generated
		 */
		EClass BASE_SERVICE = eINSTANCE.getBaseService();

		/**
		 * The meta object literal for the '<em><b>Repo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_SERVICE__REPO = eINSTANCE.getBaseService_Repo();

		/**
		 * The meta object literal for the '{@link cn.hylstudio.mdse.hyldesigner.impl.RepoImpl <em>Repo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.hylstudio.mdse.hyldesigner.impl.RepoImpl
		 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getRepo()
		 * @generated
		 */
		EClass REPO = eINSTANCE.getRepo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPO__NAME = eINSTANCE.getRepo_Name();

		/**
		 * The meta object literal for the '<em><b>Dbentity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPO__DBENTITY = eINSTANCE.getRepo_Dbentity();

	}

} //HyldesignerPackage
