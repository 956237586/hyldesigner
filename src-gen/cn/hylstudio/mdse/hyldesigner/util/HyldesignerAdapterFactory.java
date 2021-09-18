/**
 */
package cn.hylstudio.mdse.hyldesigner.util;

import cn.hylstudio.mdse.hyldesigner.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage
 * @generated
 */
public class HyldesignerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HyldesignerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HyldesignerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HyldesignerPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HyldesignerSwitch<Adapter> modelSwitch = new HyldesignerSwitch<Adapter>() {
		@Override
		public Adapter caseProject(Project object) {
			return createProjectAdapter();
		}

		@Override
		public Adapter casePackageDefine(PackageDefine object) {
			return createPackageDefineAdapter();
		}

		@Override
		public Adapter caseDomainAttr(DomainAttr object) {
			return createDomainAttrAdapter();
		}

		@Override
		public Adapter caseDbAttr(DbAttr object) {
			return createDbAttrAdapter();
		}

		@Override
		public Adapter caseRequestAttr(RequestAttr object) {
			return createRequestAttrAdapter();
		}

		@Override
		public Adapter caseResponseAttr(ResponseAttr object) {
			return createResponseAttrAdapter();
		}

		@Override
		public Adapter caseDtoAttr(DtoAttr object) {
			return createDtoAttrAdapter();
		}

		@Override
		public Adapter caseAttr(Attr object) {
			return createAttrAdapter();
		}

		@Override
		public Adapter caseDomainEntity(DomainEntity object) {
			return createDomainEntityAdapter();
		}

		@Override
		public Adapter caseController(Controller object) {
			return createControllerAdapter();
		}

		@Override
		public Adapter caseRestInterface(RestInterface object) {
			return createRestInterfaceAdapter();
		}

		@Override
		public Adapter caseDto(Dto object) {
			return createDtoAdapter();
		}

		@Override
		public Adapter caseService(Service object) {
			return createServiceAdapter();
		}

		@Override
		public Adapter caseBizService(BizService object) {
			return createBizServiceAdapter();
		}

		@Override
		public Adapter caseBaseService(BaseService object) {
			return createBaseServiceAdapter();
		}

		@Override
		public Adapter caseRequestPayload(RequestPayload object) {
			return createRequestPayloadAdapter();
		}

		@Override
		public Adapter caseDbEntity(DbEntity object) {
			return createDbEntityAdapter();
		}

		@Override
		public Adapter caseResponseResult(ResponseResult object) {
			return createResponseResultAdapter();
		}

		@Override
		public Adapter caseRepo(Repo object) {
			return createRepoAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.hylstudio.mdse.hyldesigner.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.hylstudio.mdse.hyldesigner.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.hylstudio.mdse.hyldesigner.PackageDefine <em>Package Define</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.hylstudio.mdse.hyldesigner.PackageDefine
	 * @generated
	 */
	public Adapter createPackageDefineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.hylstudio.mdse.hyldesigner.DomainAttr <em>Domain Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.hylstudio.mdse.hyldesigner.DomainAttr
	 * @generated
	 */
	public Adapter createDomainAttrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.hylstudio.mdse.hyldesigner.DbAttr <em>Db Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.hylstudio.mdse.hyldesigner.DbAttr
	 * @generated
	 */
	public Adapter createDbAttrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.hylstudio.mdse.hyldesigner.RequestAttr <em>Request Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.hylstudio.mdse.hyldesigner.RequestAttr
	 * @generated
	 */
	public Adapter createRequestAttrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.hylstudio.mdse.hyldesigner.ResponseAttr <em>Response Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.hylstudio.mdse.hyldesigner.ResponseAttr
	 * @generated
	 */
	public Adapter createResponseAttrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.hylstudio.mdse.hyldesigner.DtoAttr <em>Dto Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.hylstudio.mdse.hyldesigner.DtoAttr
	 * @generated
	 */
	public Adapter createDtoAttrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.hylstudio.mdse.hyldesigner.Attr <em>Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.hylstudio.mdse.hyldesigner.Attr
	 * @generated
	 */
	public Adapter createAttrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.hylstudio.mdse.hyldesigner.DomainEntity <em>Domain Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.hylstudio.mdse.hyldesigner.DomainEntity
	 * @generated
	 */
	public Adapter createDomainEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.hylstudio.mdse.hyldesigner.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.hylstudio.mdse.hyldesigner.Controller
	 * @generated
	 */
	public Adapter createControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.hylstudio.mdse.hyldesigner.RestInterface <em>Rest Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.hylstudio.mdse.hyldesigner.RestInterface
	 * @generated
	 */
	public Adapter createRestInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.hylstudio.mdse.hyldesigner.Dto <em>Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.hylstudio.mdse.hyldesigner.Dto
	 * @generated
	 */
	public Adapter createDtoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.hylstudio.mdse.hyldesigner.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.hylstudio.mdse.hyldesigner.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.hylstudio.mdse.hyldesigner.BizService <em>Biz Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.hylstudio.mdse.hyldesigner.BizService
	 * @generated
	 */
	public Adapter createBizServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.hylstudio.mdse.hyldesigner.BaseService <em>Base Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.hylstudio.mdse.hyldesigner.BaseService
	 * @generated
	 */
	public Adapter createBaseServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.hylstudio.mdse.hyldesigner.RequestPayload <em>Request Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.hylstudio.mdse.hyldesigner.RequestPayload
	 * @generated
	 */
	public Adapter createRequestPayloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.hylstudio.mdse.hyldesigner.DbEntity <em>Db Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.hylstudio.mdse.hyldesigner.DbEntity
	 * @generated
	 */
	public Adapter createDbEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.hylstudio.mdse.hyldesigner.ResponseResult <em>Response Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.hylstudio.mdse.hyldesigner.ResponseResult
	 * @generated
	 */
	public Adapter createResponseResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.hylstudio.mdse.hyldesigner.Repo <em>Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.hylstudio.mdse.hyldesigner.Repo
	 * @generated
	 */
	public Adapter createRepoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HyldesignerAdapterFactory
