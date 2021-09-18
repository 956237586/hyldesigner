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
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.ProjectImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Domain Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DOMAIN_ENTITIES = 1;

	/**
	 * The feature id for the '<em><b>Db Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DB_ENTITIES = 2;

	/**
	 * The feature id for the '<em><b>Req Payloads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__REQ_PAYLOADS = 3;

	/**
	 * The feature id for the '<em><b>Resp Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__RESP_RESULTS = 4;

	/**
	 * The feature id for the '<em><b>Controllers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CONTROLLERS = 5;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__BASE_PACKAGE = 6;

	/**
	 * The feature id for the '<em><b>Sub Packages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SUB_PACKAGES = 7;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.PackageDefineImpl <em>Package Define</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.PackageDefineImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getPackageDefine()
	 * @generated
	 */
	int PACKAGE_DEFINE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DEFINE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DEFINE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DEFINE__PARENT = 2;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DEFINE__CHILD = 3;

	/**
	 * The number of structural features of the '<em>Package Define</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DEFINE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Package Define</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DEFINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.AttrImpl <em>Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.AttrImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getAttr()
	 * @generated
	 */
	int ATTR = 7;

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
	int DOMAIN_ATTR = 2;

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
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ATTR__IS_OPTIONAL = ATTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Need Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ATTR__NEED_PERSISTENT = ATTR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Domain Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ATTR_FEATURE_COUNT = ATTR_FEATURE_COUNT + 3;

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
	int DB_ATTR = 3;

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
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.RequestAttrImpl <em>Request Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.RequestAttrImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getRequestAttr()
	 * @generated
	 */
	int REQUEST_ATTR = 4;

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
	int RESPONSE_ATTR = 5;

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
	int DTO_ATTR = 6;

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
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.DomainEntityImpl <em>Domain Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.DomainEntityImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getDomainEntity()
	 * @generated
	 */
	int DOMAIN_ENTITY = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ENTITY__ID = 0;

	/**
	 * The feature id for the '<em><b>Attr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ENTITY__ATTR = 1;

	/**
	 * The feature id for the '<em><b>Generated Payload</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ENTITY__GENERATED_PAYLOAD = 2;

	/**
	 * The feature id for the '<em><b>Generated Dto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ENTITY__GENERATED_DTO = 3;

	/**
	 * The feature id for the '<em><b>Generated Db Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ENTITY__GENERATED_DB_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Belong To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ENTITY__BELONG_TO = 5;

	/**
	 * The number of structural features of the '<em>Domain Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ENTITY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Domain Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.ControllerImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rest Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__REST_INTERFACE = 1;

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
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.RestInterfaceImpl <em>Rest Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.RestInterfaceImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getRestInterface()
	 * @generated
	 */
	int REST_INTERFACE = 10;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE__PAYLOAD = 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE__RESULT = 1;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE__MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE__DESC = 4;

	/**
	 * The feature id for the '<em><b>Invoke Biz Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE__INVOKE_BIZ_SERVICES = 5;

	/**
	 * The feature id for the '<em><b>Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE__ACCESS = 6;

	/**
	 * The number of structural features of the '<em>Rest Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Rest Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.DtoImpl <em>Dto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.DtoImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getDto()
	 * @generated
	 */
	int DTO = 11;

	/**
	 * The feature id for the '<em><b>Generated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__GENERATED_BY = 0;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__GENERATED = 1;

	/**
	 * The feature id for the '<em><b>Attr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__ATTR = 2;

	/**
	 * The number of structural features of the '<em>Dto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.ServiceImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 12;

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
	int BIZ_SERVICE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_SERVICE__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Invoke Base</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_SERVICE__INVOKE_BASE = SERVICE_FEATURE_COUNT + 0;

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
	int BASE_SERVICE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERVICE__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Access Repo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERVICE__ACCESS_REPO = SERVICE_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.RequestPayloadImpl <em>Request Payload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.RequestPayloadImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getRequestPayload()
	 * @generated
	 */
	int REQUEST_PAYLOAD = 15;

	/**
	 * The feature id for the '<em><b>Generated By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PAYLOAD__GENERATED_BY = 0;

	/**
	 * The feature id for the '<em><b>Contains Attr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PAYLOAD__CONTAINS_ATTR = 1;

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
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.DbEntityImpl <em>Db Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.DbEntityImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getDbEntity()
	 * @generated
	 */
	int DB_ENTITY = 16;

	/**
	 * The feature id for the '<em><b>Attr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_ENTITY__ATTR = 0;

	/**
	 * The feature id for the '<em><b>Generated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_ENTITY__GENERATED_BY = 1;

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
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.ResponseResultImpl <em>Response Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.ResponseResultImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getResponseResult()
	 * @generated
	 */
	int RESPONSE_RESULT = 17;

	/**
	 * The feature id for the '<em><b>Attr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_RESULT__ATTR = 0;

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
	 * The meta object id for the '{@link cn.hylstudio.mdse.hyldesigner.impl.RepoImpl <em>Repo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.hylstudio.mdse.hyldesigner.impl.RepoImpl
	 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getRepo()
	 * @generated
	 */
	int REPO = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Store Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPO__STORE_ENTITY = 1;

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
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.Project#getDomainEntities <em>Domain Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Entities</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Project#getDomainEntities()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_DomainEntities();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.Project#getDbEntities <em>Db Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Db Entities</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Project#getDbEntities()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_DbEntities();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.Project#getReqPayloads <em>Req Payloads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Req Payloads</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Project#getReqPayloads()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_ReqPayloads();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.Project#getRespResults <em>Resp Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resp Results</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Project#getRespResults()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_RespResults();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.Project#getControllers <em>Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controllers</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Project#getControllers()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Controllers();

	/**
	 * Returns the meta object for the reference '{@link cn.hylstudio.mdse.hyldesigner.Project#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Project#getBasePackage()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_BasePackage();

	/**
	 * Returns the meta object for the reference list '{@link cn.hylstudio.mdse.hyldesigner.Project#getSubPackages <em>Sub Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Packages</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Project#getSubPackages()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_SubPackages();

	/**
	 * Returns the meta object for class '{@link cn.hylstudio.mdse.hyldesigner.PackageDefine <em>Package Define</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Define</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.PackageDefine
	 * @generated
	 */
	EClass getPackageDefine();

	/**
	 * Returns the meta object for the attribute '{@link cn.hylstudio.mdse.hyldesigner.PackageDefine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.PackageDefine#getName()
	 * @see #getPackageDefine()
	 * @generated
	 */
	EAttribute getPackageDefine_Name();

	/**
	 * Returns the meta object for the attribute '{@link cn.hylstudio.mdse.hyldesigner.PackageDefine#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.PackageDefine#getType()
	 * @see #getPackageDefine()
	 * @generated
	 */
	EAttribute getPackageDefine_Type();

	/**
	 * Returns the meta object for the reference '{@link cn.hylstudio.mdse.hyldesigner.PackageDefine#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.PackageDefine#getParent()
	 * @see #getPackageDefine()
	 * @generated
	 */
	EReference getPackageDefine_Parent();

	/**
	 * Returns the meta object for the reference list '{@link cn.hylstudio.mdse.hyldesigner.PackageDefine#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.PackageDefine#getChild()
	 * @see #getPackageDefine()
	 * @generated
	 */
	EReference getPackageDefine_Child();

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
	 * Returns the meta object for the attribute '{@link cn.hylstudio.mdse.hyldesigner.DomainAttr#isIsOptional <em>Is Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Optional</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.DomainAttr#isIsOptional()
	 * @see #getDomainAttr()
	 * @generated
	 */
	EAttribute getDomainAttr_IsOptional();

	/**
	 * Returns the meta object for the attribute '{@link cn.hylstudio.mdse.hyldesigner.DomainAttr#isNeedPersistent <em>Need Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Need Persistent</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.DomainAttr#isNeedPersistent()
	 * @see #getDomainAttr()
	 * @generated
	 */
	EAttribute getDomainAttr_NeedPersistent();

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
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.DomainEntity#getAttr <em>Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attr</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.DomainEntity#getAttr()
	 * @see #getDomainEntity()
	 * @generated
	 */
	EReference getDomainEntity_Attr();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.DomainEntity#getGeneratedPayload <em>Generated Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generated Payload</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.DomainEntity#getGeneratedPayload()
	 * @see #getDomainEntity()
	 * @generated
	 */
	EReference getDomainEntity_GeneratedPayload();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.DomainEntity#getGeneratedDto <em>Generated Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generated Dto</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.DomainEntity#getGeneratedDto()
	 * @see #getDomainEntity()
	 * @generated
	 */
	EReference getDomainEntity_GeneratedDto();

	/**
	 * Returns the meta object for the reference list '{@link cn.hylstudio.mdse.hyldesigner.DomainEntity#getGeneratedDbEntity <em>Generated Db Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generated Db Entity</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.DomainEntity#getGeneratedDbEntity()
	 * @see #getDomainEntity()
	 * @generated
	 */
	EReference getDomainEntity_GeneratedDbEntity();

	/**
	 * Returns the meta object for the reference '{@link cn.hylstudio.mdse.hyldesigner.DomainEntity#getBelongTo <em>Belong To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belong To</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.DomainEntity#getBelongTo()
	 * @see #getDomainEntity()
	 * @generated
	 */
	EReference getDomainEntity_BelongTo();

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
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.Controller#getRestInterface <em>Rest Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rest Interface</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Controller#getRestInterface()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_RestInterface();

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
	 * Returns the meta object for the reference '{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getPayload <em>Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payload</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.RestInterface#getPayload()
	 * @see #getRestInterface()
	 * @generated
	 */
	EReference getRestInterface_Payload();

	/**
	 * Returns the meta object for the reference '{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.RestInterface#getResult()
	 * @see #getRestInterface()
	 * @generated
	 */
	EReference getRestInterface_Result();

	/**
	 * Returns the meta object for the attribute '{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapping</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.RestInterface#getMapping()
	 * @see #getRestInterface()
	 * @generated
	 */
	EAttribute getRestInterface_Mapping();

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
	 * Returns the meta object for the attribute '{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.RestInterface#getDesc()
	 * @see #getRestInterface()
	 * @generated
	 */
	EAttribute getRestInterface_Desc();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getInvokeBizServices <em>Invoke Biz Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invoke Biz Services</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.RestInterface#getInvokeBizServices()
	 * @see #getRestInterface()
	 * @generated
	 */
	EReference getRestInterface_InvokeBizServices();

	/**
	 * Returns the meta object for the reference list '{@link cn.hylstudio.mdse.hyldesigner.RestInterface#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Access</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.RestInterface#getAccess()
	 * @see #getRestInterface()
	 * @generated
	 */
	EReference getRestInterface_Access();

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
	 * Returns the meta object for the reference list '{@link cn.hylstudio.mdse.hyldesigner.Dto#getGeneratedBy <em>Generated By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generated By</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Dto#getGeneratedBy()
	 * @see #getDto()
	 * @generated
	 */
	EReference getDto_GeneratedBy();

	/**
	 * Returns the meta object for the reference list '{@link cn.hylstudio.mdse.hyldesigner.Dto#getGenerated <em>Generated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generated</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Dto#getGenerated()
	 * @see #getDto()
	 * @generated
	 */
	EReference getDto_Generated();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.Dto#getAttr <em>Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attr</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Dto#getAttr()
	 * @see #getDto()
	 * @generated
	 */
	EReference getDto_Attr();

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
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.BizService#getInvokeBase <em>Invoke Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invoke Base</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.BizService#getInvokeBase()
	 * @see #getBizService()
	 * @generated
	 */
	EReference getBizService_InvokeBase();

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
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.BaseService#getAccessRepo <em>Access Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Repo</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.BaseService#getAccessRepo()
	 * @see #getBaseService()
	 * @generated
	 */
	EReference getBaseService_AccessRepo();

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
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.RequestPayload#getContainsAttr <em>Contains Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Attr</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.RequestPayload#getContainsAttr()
	 * @see #getRequestPayload()
	 * @generated
	 */
	EReference getRequestPayload_ContainsAttr();

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
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.DbEntity#getAttr <em>Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attr</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.DbEntity#getAttr()
	 * @see #getDbEntity()
	 * @generated
	 */
	EReference getDbEntity_Attr();

	/**
	 * Returns the meta object for the reference list '{@link cn.hylstudio.mdse.hyldesigner.DbEntity#getGeneratedBy <em>Generated By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generated By</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.DbEntity#getGeneratedBy()
	 * @see #getDbEntity()
	 * @generated
	 */
	EReference getDbEntity_GeneratedBy();

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
	 * Returns the meta object for the containment reference list '{@link cn.hylstudio.mdse.hyldesigner.ResponseResult#getAttr <em>Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attr</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.ResponseResult#getAttr()
	 * @see #getResponseResult()
	 * @generated
	 */
	EReference getResponseResult_Attr();

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
	 * Returns the meta object for the reference '{@link cn.hylstudio.mdse.hyldesigner.Repo#getStoreEntity <em>Store Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Store Entity</em>'.
	 * @see cn.hylstudio.mdse.hyldesigner.Repo#getStoreEntity()
	 * @see #getRepo()
	 * @generated
	 */
	EReference getRepo_StoreEntity();

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
		 * The meta object literal for the '<em><b>Domain Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__DOMAIN_ENTITIES = eINSTANCE.getProject_DomainEntities();

		/**
		 * The meta object literal for the '<em><b>Db Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__DB_ENTITIES = eINSTANCE.getProject_DbEntities();

		/**
		 * The meta object literal for the '<em><b>Req Payloads</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__REQ_PAYLOADS = eINSTANCE.getProject_ReqPayloads();

		/**
		 * The meta object literal for the '<em><b>Resp Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__RESP_RESULTS = eINSTANCE.getProject_RespResults();

		/**
		 * The meta object literal for the '<em><b>Controllers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__CONTROLLERS = eINSTANCE.getProject_Controllers();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__BASE_PACKAGE = eINSTANCE.getProject_BasePackage();

		/**
		 * The meta object literal for the '<em><b>Sub Packages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__SUB_PACKAGES = eINSTANCE.getProject_SubPackages();

		/**
		 * The meta object literal for the '{@link cn.hylstudio.mdse.hyldesigner.impl.PackageDefineImpl <em>Package Define</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.hylstudio.mdse.hyldesigner.impl.PackageDefineImpl
		 * @see cn.hylstudio.mdse.hyldesigner.impl.HyldesignerPackageImpl#getPackageDefine()
		 * @generated
		 */
		EClass PACKAGE_DEFINE = eINSTANCE.getPackageDefine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_DEFINE__NAME = eINSTANCE.getPackageDefine_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_DEFINE__TYPE = eINSTANCE.getPackageDefine_Type();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_DEFINE__PARENT = eINSTANCE.getPackageDefine_Parent();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_DEFINE__CHILD = eINSTANCE.getPackageDefine_Child();

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
		 * The meta object literal for the '<em><b>Is Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_ATTR__IS_OPTIONAL = eINSTANCE.getDomainAttr_IsOptional();

		/**
		 * The meta object literal for the '<em><b>Need Persistent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_ATTR__NEED_PERSISTENT = eINSTANCE.getDomainAttr_NeedPersistent();

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
		 * The meta object literal for the '<em><b>Attr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ENTITY__ATTR = eINSTANCE.getDomainEntity_Attr();

		/**
		 * The meta object literal for the '<em><b>Generated Payload</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ENTITY__GENERATED_PAYLOAD = eINSTANCE.getDomainEntity_GeneratedPayload();

		/**
		 * The meta object literal for the '<em><b>Generated Dto</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ENTITY__GENERATED_DTO = eINSTANCE.getDomainEntity_GeneratedDto();

		/**
		 * The meta object literal for the '<em><b>Generated Db Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ENTITY__GENERATED_DB_ENTITY = eINSTANCE.getDomainEntity_GeneratedDbEntity();

		/**
		 * The meta object literal for the '<em><b>Belong To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ENTITY__BELONG_TO = eINSTANCE.getDomainEntity_BelongTo();

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
		 * The meta object literal for the '<em><b>Rest Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__REST_INTERFACE = eINSTANCE.getController_RestInterface();

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
		 * The meta object literal for the '<em><b>Payload</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_INTERFACE__PAYLOAD = eINSTANCE.getRestInterface_Payload();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_INTERFACE__RESULT = eINSTANCE.getRestInterface_Result();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_INTERFACE__MAPPING = eINSTANCE.getRestInterface_Mapping();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_INTERFACE__NAME = eINSTANCE.getRestInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_INTERFACE__DESC = eINSTANCE.getRestInterface_Desc();

		/**
		 * The meta object literal for the '<em><b>Invoke Biz Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_INTERFACE__INVOKE_BIZ_SERVICES = eINSTANCE.getRestInterface_InvokeBizServices();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_INTERFACE__ACCESS = eINSTANCE.getRestInterface_Access();

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
		 * The meta object literal for the '<em><b>Generated By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTO__GENERATED_BY = eINSTANCE.getDto_GeneratedBy();

		/**
		 * The meta object literal for the '<em><b>Generated</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTO__GENERATED = eINSTANCE.getDto_Generated();

		/**
		 * The meta object literal for the '<em><b>Attr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTO__ATTR = eINSTANCE.getDto_Attr();

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
		 * The meta object literal for the '<em><b>Invoke Base</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIZ_SERVICE__INVOKE_BASE = eINSTANCE.getBizService_InvokeBase();

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
		 * The meta object literal for the '<em><b>Access Repo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_SERVICE__ACCESS_REPO = eINSTANCE.getBaseService_AccessRepo();

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
		 * The meta object literal for the '<em><b>Contains Attr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_PAYLOAD__CONTAINS_ATTR = eINSTANCE.getRequestPayload_ContainsAttr();

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
		 * The meta object literal for the '<em><b>Attr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_ENTITY__ATTR = eINSTANCE.getDbEntity_Attr();

		/**
		 * The meta object literal for the '<em><b>Generated By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_ENTITY__GENERATED_BY = eINSTANCE.getDbEntity_GeneratedBy();

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
		 * The meta object literal for the '<em><b>Attr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_RESULT__ATTR = eINSTANCE.getResponseResult_Attr();

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
		 * The meta object literal for the '<em><b>Store Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPO__STORE_ENTITY = eINSTANCE.getRepo_StoreEntity();

	}

} //HyldesignerPackage
