/**
 */
package Y3853992;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Y3853992.System#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link Y3853992.System#getTestCases <em>Test Cases</em>}</li>
 *   <li>{@link Y3853992.System#getTeamMembers <em>Team Members</em>}</li>
 * </ul>
 *
 * @see Y3853992.Y3853992Package#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link Y3853992.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see Y3853992.Y3853992Package#getSystem_Requirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getRequirements();

	/**
	 * Returns the value of the '<em><b>Test Cases</b></em>' containment reference list.
	 * The list contents are of type {@link Y3853992.TestCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Cases</em>' containment reference list.
	 * @see Y3853992.Y3853992Package#getSystem_TestCases()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestCase> getTestCases();

	/**
	 * Returns the value of the '<em><b>Team Members</b></em>' containment reference list.
	 * The list contents are of type {@link Y3853992.TeamMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Team Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team Members</em>' containment reference list.
	 * @see Y3853992.Y3853992Package#getSystem_TeamMembers()
	 * @model containment="true"
	 * @generated
	 */
	EList<TeamMember> getTeamMembers();

} // System
