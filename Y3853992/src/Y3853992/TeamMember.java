/**
 */
package Y3853992;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Y3853992.TeamMember#getName <em>Name</em>}</li>
 *   <li>{@link Y3853992.TeamMember#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @see Y3853992.Y3853992Package#getTeamMember()
 * @model annotation="gmf.node figure='ellipse' margin='10' label='name' label.view.pattern='Team member: {0}' border.color='255,165,0' border.width='3'"
 * @generated
 */
public interface TeamMember extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Y3853992.Y3853992Package#getTeamMember_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Y3853992.TeamMember#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' reference list.
	 * The list contents are of type {@link Y3853992.Requirement}.
	 * It is bidirectional and its opposite is '{@link Y3853992.Requirement#getTeamMembers <em>Team Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' reference list.
	 * @see Y3853992.Y3853992Package#getTeamMember_Requirements()
	 * @see Y3853992.Requirement#getTeamMembers
	 * @model opposite="teamMembers"
	 *        annotation="gmf.link style='dot' target.decoration='arrow' color='255,165,0'"
	 * @generated
	 */
	EList<Requirement> getRequirements();

} // TeamMember
