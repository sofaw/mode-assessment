/**
 */
package Y3853992;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Y3853992.Requirement#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link Y3853992.Requirement#getDescription <em>Description</em>}</li>
 *   <li>{@link Y3853992.Requirement#getProgress <em>Progress</em>}</li>
 *   <li>{@link Y3853992.Requirement#getType <em>Type</em>}</li>
 *   <li>{@link Y3853992.Requirement#getDecomposition <em>Decomposition</em>}</li>
 *   <li>{@link Y3853992.Requirement#getParentDecomposition <em>Parent Decomposition</em>}</li>
 *   <li>{@link Y3853992.Requirement#getTeamMembers <em>Team Members</em>}</li>
 *   <li>{@link Y3853992.Requirement#getTestCases <em>Test Cases</em>}</li>
 * </ul>
 *
 * @see Y3853992.Y3853992Package#getRequirement()
 * @model annotation="gmf.node label='type,description'"
 * @generated
 */
public interface Requirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(int)
	 * @see Y3853992.Y3853992Package#getRequirement_Identifier()
	 * @model required="true"
	 * @generated
	 */
	int getIdentifier();

	/**
	 * Sets the value of the '{@link Y3853992.Requirement#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(int value);

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
	 * @see Y3853992.Y3853992Package#getRequirement_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Y3853992.Requirement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Progress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progress</em>' attribute.
	 * @see #setProgress(float)
	 * @see Y3853992.Y3853992Package#getRequirement_Progress()
	 * @model required="true" derived="true"
	 * @generated
	 */
	float getProgress();

	/**
	 * Sets the value of the '{@link Y3853992.Requirement#getProgress <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progress</em>' attribute.
	 * @see #getProgress()
	 * @generated
	 */
	void setProgress(float value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Y3853992.RequirementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Y3853992.RequirementType
	 * @see #setType(RequirementType)
	 * @see Y3853992.Y3853992Package#getRequirement_Type()
	 * @model required="true"
	 * @generated
	 */
	RequirementType getType();

	/**
	 * Sets the value of the '{@link Y3853992.Requirement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Y3853992.RequirementType
	 * @see #getType()
	 * @generated
	 */
	void setType(RequirementType value);

	/**
	 * Returns the value of the '<em><b>Parent Decomposition</b></em>' reference list.
	 * The list contents are of type {@link Y3853992.Requirement}.
	 * It is bidirectional and its opposite is '{@link Y3853992.Requirement#getDecomposition <em>Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Decomposition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Decomposition</em>' reference list.
	 * @see Y3853992.Y3853992Package#getRequirement_ParentDecomposition()
	 * @see Y3853992.Requirement#getDecomposition
	 * @model opposite="decomposition"
	 * @generated
	 */
	EList<Requirement> getParentDecomposition();

	/**
	 * Returns the value of the '<em><b>Decomposition</b></em>' reference list.
	 * The list contents are of type {@link Y3853992.Requirement}.
	 * It is bidirectional and its opposite is '{@link Y3853992.Requirement#getParentDecomposition <em>Parent Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposition</em>' reference list.
	 * @see Y3853992.Y3853992Package#getRequirement_Decomposition()
	 * @see Y3853992.Requirement#getParentDecomposition
	 * @model opposite="parentDecomposition"
	 *        annotation="gmf.link target.decoration='arrow' color='0,0,0'"
	 * @generated
	 */
	EList<Requirement> getDecomposition();

	/**
	 * Returns the value of the '<em><b>Team Members</b></em>' reference list.
	 * The list contents are of type {@link Y3853992.TeamMember}.
	 * It is bidirectional and its opposite is '{@link Y3853992.TeamMember#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Team Members</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team Members</em>' reference list.
	 * @see Y3853992.Y3853992Package#getRequirement_TeamMembers()
	 * @see Y3853992.TeamMember#getRequirements
	 * @model opposite="requirements" required="true"
	 *        annotation="gmf.link style='dot'"
	 * @generated
	 */
	EList<TeamMember> getTeamMembers();

	/**
	 * Returns the value of the '<em><b>Test Cases</b></em>' reference list.
	 * The list contents are of type {@link Y3853992.TestCase}.
	 * It is bidirectional and its opposite is '{@link Y3853992.TestCase#getVerifies <em>Verifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Cases</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Cases</em>' reference list.
	 * @see Y3853992.Y3853992Package#getRequirement_TestCases()
	 * @see Y3853992.TestCase#getVerifies
	 * @model opposite="verifies"
	 * @generated
	 */
	EList<TestCase> getTestCases();

} // Requirement
