/**
 */
package Y3853992;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Y3853992.TestCase#getDescription <em>Description</em>}</li>
 *   <li>{@link Y3853992.TestCase#getVerifies <em>Verifies</em>}</li>
 * </ul>
 *
 * @see Y3853992.Y3853992Package#getTestCase()
 * @model annotation="gmf.node figure='polygon' polygon.x='40 80 40 0' polygon.y='0 60 120 60' margin='20' label='description' label.view.pattern='Test case: {0}' border.color='60,179,113' border.width='3'"
 * @generated
 */
public interface TestCase extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see Y3853992.Y3853992Package#getTestCase_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Y3853992.TestCase#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Verifies</b></em>' reference list.
	 * The list contents are of type {@link Y3853992.Requirement}.
	 * It is bidirectional and its opposite is '{@link Y3853992.Requirement#getTestCases <em>Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verifies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verifies</em>' reference list.
	 * @see Y3853992.Y3853992Package#getTestCase_Verifies()
	 * @see Y3853992.Requirement#getTestCases
	 * @model opposite="testCases" required="true"
	 *        annotation="gmf.link style='dash' target.decoration='arrow' color='60,179,113'"
	 * @generated
	 */
	EList<Requirement> getVerifies();

} // TestCase
