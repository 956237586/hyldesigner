/**
 */
package cn.hylstudio.mdse.hyldesigner;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biz Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cn.hylstudio.mdse.hyldesigner.BizService#getBaseservice <em>Baseservice</em>}</li>
 * </ul>
 *
 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getBizService()
 * @model
 * @generated
 */
public interface BizService extends Service {
	/**
	 * Returns the value of the '<em><b>Baseservice</b></em>' containment reference list.
	 * The list contents are of type {@link cn.hylstudio.mdse.hyldesigner.BaseService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baseservice</em>' containment reference list.
	 * @see cn.hylstudio.mdse.hyldesigner.HyldesignerPackage#getBizService_Baseservice()
	 * @model containment="true"
	 * @generated
	 */
	EList<BaseService> getBaseservice();

} // BizService
