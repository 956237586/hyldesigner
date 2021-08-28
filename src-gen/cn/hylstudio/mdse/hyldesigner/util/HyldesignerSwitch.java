/**
 */
package cn.hylstudio.mdse.hyldesigner.util;

import cn.hylstudio.mdse.hyldesigner.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage
 * @generated
 */
public class HyldesignerSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HyldesignerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HyldesignerSwitch() {
		if (modelPackage == null) {
			modelPackage = HyldesignerPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case HyldesignerPackage.DOMAIN_ATTR: {
			DomainAttr domainAttr = (DomainAttr) theEObject;
			T result = caseDomainAttr(domainAttr);
			if (result == null)
				result = caseAttr(domainAttr);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HyldesignerPackage.DB_ATTR: {
			DbAttr dbAttr = (DbAttr) theEObject;
			T result = caseDbAttr(dbAttr);
			if (result == null)
				result = caseAttr(dbAttr);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HyldesignerPackage.REQUEST_ATTR: {
			RequestAttr requestAttr = (RequestAttr) theEObject;
			T result = caseRequestAttr(requestAttr);
			if (result == null)
				result = caseAttr(requestAttr);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HyldesignerPackage.RESPONSE_ATTR: {
			ResponseAttr responseAttr = (ResponseAttr) theEObject;
			T result = caseResponseAttr(responseAttr);
			if (result == null)
				result = caseAttr(responseAttr);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HyldesignerPackage.DTO_ATTR: {
			DtoAttr dtoAttr = (DtoAttr) theEObject;
			T result = caseDtoAttr(dtoAttr);
			if (result == null)
				result = caseAttr(dtoAttr);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HyldesignerPackage.ATTR: {
			Attr attr = (Attr) theEObject;
			T result = caseAttr(attr);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HyldesignerPackage.DOMAIN_ENTITY: {
			DomainEntity domainEntity = (DomainEntity) theEObject;
			T result = caseDomainEntity(domainEntity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HyldesignerPackage.REQUEST_PAYLOAD: {
			RequestPayload requestPayload = (RequestPayload) theEObject;
			T result = caseRequestPayload(requestPayload);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HyldesignerPackage.PROJECT: {
			Project project = (Project) theEObject;
			T result = caseProject(project);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HyldesignerPackage.DB_ENTITY: {
			DbEntity dbEntity = (DbEntity) theEObject;
			T result = caseDbEntity(dbEntity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HyldesignerPackage.RESPONSE_RESULT: {
			ResponseResult responseResult = (ResponseResult) theEObject;
			T result = caseResponseResult(responseResult);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HyldesignerPackage.CONTROLLER: {
			Controller controller = (Controller) theEObject;
			T result = caseController(controller);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HyldesignerPackage.DTO: {
			Dto dto = (Dto) theEObject;
			T result = caseDto(dto);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HyldesignerPackage.REST_INTERFACE: {
			RestInterface restInterface = (RestInterface) theEObject;
			T result = caseRestInterface(restInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HyldesignerPackage.SERVICE: {
			Service service = (Service) theEObject;
			T result = caseService(service);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HyldesignerPackage.BIZ_SERVICE: {
			BizService bizService = (BizService) theEObject;
			T result = caseBizService(bizService);
			if (result == null)
				result = caseService(bizService);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HyldesignerPackage.BASE_SERVICE: {
			BaseService baseService = (BaseService) theEObject;
			T result = caseBaseService(baseService);
			if (result == null)
				result = caseService(baseService);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HyldesignerPackage.REPO: {
			Repo repo = (Repo) theEObject;
			T result = caseRepo(repo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainEntity(DomainEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Payload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Payload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestPayload(RequestPayload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProject(Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Db Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Db Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDbEntity(DbEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Attr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Attr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainAttr(DomainAttr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttr(Attr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Db Attr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Db Attr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDbAttr(DbAttr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseResult(ResponseResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseController(Controller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDto(Dto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestInterface(RestInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Attr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Attr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestAttr(RequestAttr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Attr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Attr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseAttr(ResponseAttr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dto Attr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dto Attr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDtoAttr(DtoAttr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Biz Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Biz Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBizService(BizService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseService(BaseService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepo(Repo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //HyldesignerSwitch
