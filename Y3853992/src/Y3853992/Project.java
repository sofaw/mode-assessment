/**
 */
package Y3853992;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Y3853992.Project#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link Y3853992.Project#getTestCases <em>Test Cases</em>}</li>
 *   <li>{@link Y3853992.Project#getTeamMembers <em>Team Members</em>}</li>
 * </ul>
 *
 * @see Y3853992.Y3853992Package#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
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
	 * @see Y3853992.Y3853992Package#getProject_Requirements()
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
	 * @see Y3853992.Y3853992Package#getProject_TestCases()
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
	 * @see Y3853992.Y3853992Package#getProject_TeamMembers()
	 * @model containment="true"
	 * @generated
	 */
	EList<TeamMember> getTeamMembers();

} // Project
