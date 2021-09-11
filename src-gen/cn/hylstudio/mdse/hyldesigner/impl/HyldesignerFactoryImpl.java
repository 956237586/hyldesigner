/**
 */
package cn.hylstudio.mdse.hyldesigner.impl;

import cn.hylstudio.mdse.hyldesigner.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HyldesignerFactoryImpl extends EFactoryImpl implements HyldesignerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HyldesignerFactory init() {
		try {
			HyldesignerFactory theHyldesignerFactory = (HyldesignerFactory) EPackage.Registry.INSTANCE
					.getEFactory(HyldesignerPackage.eNS_URI);
			if (theHyldesignerFactory != null) {
				return theHyldesignerFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HyldesignerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HyldesignerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case HyldesignerPackage.PROJECT:
			return createProject();
		case HyldesignerPackage.DOMAIN_ATTR:
			return createDomainAttr();
		case HyldesignerPackage.DB_ATTR:
			return createDbAttr();
		case HyldesignerPackage.REQUEST_ATTR:
			return createRequestAttr();
		case HyldesignerPackage.RESPONSE_ATTR:
			return createResponseAttr();
		case HyldesignerPackage.DTO_ATTR:
			return createDtoAttr();
		case HyldesignerPackage.DOMAIN_ENTITY:
			return createDomainEntity();
		case HyldesignerPackage.CONTROLLER:
			return createController();
		case HyldesignerPackage.REST_INTERFACE:
			return createRestInterface();
		case HyldesignerPackage.DTO:
			return createDto();
		case HyldesignerPackage.SERVICE:
			return createService();
		case HyldesignerPackage.BIZ_SERVICE:
			return createBizService();
		case HyldesignerPackage.BASE_SERVICE:
			return createBaseService();
		case HyldesignerPackage.REQUEST_PAYLOAD:
			return createRequestPayload();
		case HyldesignerPackage.DB_ENTITY:
			return createDbEntity();
		case HyldesignerPackage.RESPONSE_RESULT:
			return createResponseResult();
		case HyldesignerPackage.REPO:
			return createRepo();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainEntity createDomainEntity() {
		DomainEntityImpl domainEntity = new DomainEntityImpl();
		return domainEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestPayload createRequestPayload() {
		RequestPayloadImpl requestPayload = new RequestPayloadImpl();
		return requestPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DbEntity createDbEntity() {
		DbEntityImpl dbEntity = new DbEntityImpl();
		return dbEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAttr createDomainAttr() {
		DomainAttrImpl domainAttr = new DomainAttrImpl();
		return domainAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DbAttr createDbAttr() {
		DbAttrImpl dbAttr = new DbAttrImpl();
		return dbAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseResult createResponseResult() {
		ResponseResultImpl responseResult = new ResponseResultImpl();
		return responseResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Controller createController() {
		ControllerImpl controller = new ControllerImpl();
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dto createDto() {
		DtoImpl dto = new DtoImpl();
		return dto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestInterface createRestInterface() {
		RestInterfaceImpl restInterface = new RestInterfaceImpl();
		return restInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestAttr createRequestAttr() {
		RequestAttrImpl requestAttr = new RequestAttrImpl();
		return requestAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseAttr createResponseAttr() {
		ResponseAttrImpl responseAttr = new ResponseAttrImpl();
		return responseAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DtoAttr createDtoAttr() {
		DtoAttrImpl dtoAttr = new DtoAttrImpl();
		return dtoAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BizService createBizService() {
		BizServiceImpl bizService = new BizServiceImpl();
		return bizService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseService createBaseService() {
		BaseServiceImpl baseService = new BaseServiceImpl();
		return baseService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Repo createRepo() {
		RepoImpl repo = new RepoImpl();
		return repo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HyldesignerPackage getHyldesignerPackage() {
		return (HyldesignerPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HyldesignerPackage getPackage() {
		return HyldesignerPackage.eINSTANCE;
	}

} //HyldesignerFactoryImpl
