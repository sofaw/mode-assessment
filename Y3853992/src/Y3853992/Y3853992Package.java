/**
 */
package Y3853992;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Y3853992.Y3853992Factory
 * @model kind="package"
 * @generated
 */
public interface Y3853992Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Y3853992";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://Y3853992";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Y3853992Package eINSTANCE = Y3853992.impl.Y3853992PackageImpl.init();

	/**
	 * The meta object id for the '{@link Y3853992.impl.RequirementsModelImpl <em>Requirements Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3853992.impl.RequirementsModelImpl
	 * @see Y3853992.impl.Y3853992PackageImpl#getRequirementsModel()
	 * @generated
	 */
	int REQUIREMENTS_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__REQUIREMENTS = 0;

	/**
	 * The feature id for the '<em><b>Test Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__TEST_CASES = 1;

	/**
	 * The feature id for the '<em><b>Team Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__TEAM_MEMBERS = 2;

	/**
	 * The number of structural features of the '<em>Requirements Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link Y3853992.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3853992.impl.RequirementImpl
	 * @see Y3853992.impl.Y3853992PackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PROGRESS = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Parent Decomposition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PARENT_DECOMPOSITION = 4;

	/**
	 * The feature id for the '<em><b>Decomposition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DECOMPOSITION = 5;

	/**
	 * The feature id for the '<em><b>Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CONFLICTS = 6;

	/**
	 * The feature id for the '<em><b>Team Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TEAM_MEMBERS = 7;

	/**
	 * The feature id for the '<em><b>Test Cases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TEST_CASES = 8;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link Y3853992.impl.TestCaseImpl <em>Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3853992.impl.TestCaseImpl
	 * @see Y3853992.impl.Y3853992PackageImpl#getTestCase()
	 * @generated
	 */
	int TEST_CASE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Verifies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__VERIFIES = 1;

	/**
	 * The number of structural features of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Y3853992.impl.TeamMemberImpl <em>Team Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3853992.impl.TeamMemberImpl
	 * @see Y3853992.impl.Y3853992PackageImpl#getTeamMember()
	 * @generated
	 */
	int TEAM_MEMBER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MEMBER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MEMBER__REQUIREMENTS = 1;

	/**
	 * The number of structural features of the '<em>Team Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MEMBER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Y3853992.RequirementType <em>Requirement Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3853992.RequirementType
	 * @see Y3853992.impl.Y3853992PackageImpl#getRequirementType()
	 * @generated
	 */
	int REQUIREMENT_TYPE = 4;


	/**
	 * Returns the meta object for class '{@link Y3853992.RequirementsModel <em>Requirements Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Model</em>'.
	 * @see Y3853992.RequirementsModel
	 * @generated
	 */
	EClass getRequirementsModel();

	/**
	 * Returns the meta object for the containment reference list '{@link Y3853992.RequirementsModel#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see Y3853992.RequirementsModel#getRequirements()
	 * @see #getRequirementsModel()
	 * @generated
	 */
	EReference getRequirementsModel_Requirements();

	/**
	 * Returns the meta object for the containment reference list '{@link Y3853992.RequirementsModel#getTestCases <em>Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Cases</em>'.
	 * @see Y3853992.RequirementsModel#getTestCases()
	 * @see #getRequirementsModel()
	 * @generated
	 */
	EReference getRequirementsModel_TestCases();

	/**
	 * Returns the meta object for the containment reference list '{@link Y3853992.RequirementsModel#getTeamMembers <em>Team Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Team Members</em>'.
	 * @see Y3853992.RequirementsModel#getTeamMembers()
	 * @see #getRequirementsModel()
	 * @generated
	 */
	EReference getRequirementsModel_TeamMembers();

	/**
	 * Returns the meta object for class '{@link Y3853992.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see Y3853992.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link Y3853992.Requirement#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see Y3853992.Requirement#getIdentifier()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link Y3853992.Requirement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Y3853992.Requirement#getDescription()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Description();

	/**
	 * Returns the meta object for the attribute '{@link Y3853992.Requirement#getProgress <em>Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Progress</em>'.
	 * @see Y3853992.Requirement#getProgress()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Progress();

	/**
	 * Returns the meta object for the attribute '{@link Y3853992.Requirement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Y3853992.Requirement#getType()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Type();

	/**
	 * Returns the meta object for the reference list '{@link Y3853992.Requirement#getParentDecomposition <em>Parent Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Decomposition</em>'.
	 * @see Y3853992.Requirement#getParentDecomposition()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_ParentDecomposition();

	/**
	 * Returns the meta object for the reference list '{@link Y3853992.Requirement#getDecomposition <em>Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Decomposition</em>'.
	 * @see Y3853992.Requirement#getDecomposition()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Decomposition();

	/**
	 * Returns the meta object for the reference list '{@link Y3853992.Requirement#getConflicts <em>Conflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conflicts</em>'.
	 * @see Y3853992.Requirement#getConflicts()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Conflicts();

	/**
	 * Returns the meta object for the reference list '{@link Y3853992.Requirement#getTeamMembers <em>Team Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Team Members</em>'.
	 * @see Y3853992.Requirement#getTeamMembers()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_TeamMembers();

	/**
	 * Returns the meta object for the reference list '{@link Y3853992.Requirement#getTestCases <em>Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Test Cases</em>'.
	 * @see Y3853992.Requirement#getTestCases()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_TestCases();

	/**
	 * Returns the meta object for class '{@link Y3853992.TestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Case</em>'.
	 * @see Y3853992.TestCase
	 * @generated
	 */
	EClass getTestCase();

	/**
	 * Returns the meta object for the attribute '{@link Y3853992.TestCase#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Y3853992.TestCase#getDescription()
	 * @see #getTestCase()
	 * @generated
	 */
	EAttribute getTestCase_Description();

	/**
	 * Returns the meta object for the reference list '{@link Y3853992.TestCase#getVerifies <em>Verifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Verifies</em>'.
	 * @see Y3853992.TestCase#getVerifies()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_Verifies();

	/**
	 * Returns the meta object for class '{@link Y3853992.TeamMember <em>Team Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team Member</em>'.
	 * @see Y3853992.TeamMember
	 * @generated
	 */
	EClass getTeamMember();

	/**
	 * Returns the meta object for the attribute '{@link Y3853992.TeamMember#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Y3853992.TeamMember#getName()
	 * @see #getTeamMember()
	 * @generated
	 */
	EAttribute getTeamMember_Name();

	/**
	 * Returns the meta object for the reference list '{@link Y3853992.TeamMember#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requirements</em>'.
	 * @see Y3853992.TeamMember#getRequirements()
	 * @see #getTeamMember()
	 * @generated
	 */
	EReference getTeamMember_Requirements();

	/**
	 * Returns the meta object for enum '{@link Y3853992.RequirementType <em>Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Requirement Type</em>'.
	 * @see Y3853992.RequirementType
	 * @generated
	 */
	EEnum getRequirementType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Y3853992Factory getY3853992Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Y3853992.impl.RequirementsModelImpl <em>Requirements Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3853992.impl.RequirementsModelImpl
		 * @see Y3853992.impl.Y3853992PackageImpl#getRequirementsModel()
		 * @generated
		 */
		EClass REQUIREMENTS_MODEL = eINSTANCE.getRequirementsModel();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_MODEL__REQUIREMENTS = eINSTANCE.getRequirementsModel_Requirements();

		/**
		 * The meta object literal for the '<em><b>Test Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_MODEL__TEST_CASES = eINSTANCE.getRequirementsModel_TestCases();

		/**
		 * The meta object literal for the '<em><b>Team Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_MODEL__TEAM_MEMBERS = eINSTANCE.getRequirementsModel_TeamMembers();

		/**
		 * The meta object literal for the '{@link Y3853992.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3853992.impl.RequirementImpl
		 * @see Y3853992.impl.Y3853992PackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__IDENTIFIER = eINSTANCE.getRequirement_Identifier();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__DESCRIPTION = eINSTANCE.getRequirement_Description();

		/**
		 * The meta object literal for the '<em><b>Progress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__PROGRESS = eINSTANCE.getRequirement_Progress();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__TYPE = eINSTANCE.getRequirement_Type();

		/**
		 * The meta object literal for the '<em><b>Parent Decomposition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__PARENT_DECOMPOSITION = eINSTANCE.getRequirement_ParentDecomposition();

		/**
		 * The meta object literal for the '<em><b>Decomposition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__DECOMPOSITION = eINSTANCE.getRequirement_Decomposition();

		/**
		 * The meta object literal for the '<em><b>Conflicts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__CONFLICTS = eINSTANCE.getRequirement_Conflicts();

		/**
		 * The meta object literal for the '<em><b>Team Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__TEAM_MEMBERS = eINSTANCE.getRequirement_TeamMembers();

		/**
		 * The meta object literal for the '<em><b>Test Cases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__TEST_CASES = eINSTANCE.getRequirement_TestCases();

		/**
		 * The meta object literal for the '{@link Y3853992.impl.TestCaseImpl <em>Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3853992.impl.TestCaseImpl
		 * @see Y3853992.impl.Y3853992PackageImpl#getTestCase()
		 * @generated
		 */
		EClass TEST_CASE = eINSTANCE.getTestCase();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE__DESCRIPTION = eINSTANCE.getTestCase_Description();

		/**
		 * The meta object literal for the '<em><b>Verifies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__VERIFIES = eINSTANCE.getTestCase_Verifies();

		/**
		 * The meta object literal for the '{@link Y3853992.impl.TeamMemberImpl <em>Team Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3853992.impl.TeamMemberImpl
		 * @see Y3853992.impl.Y3853992PackageImpl#getTeamMember()
		 * @generated
		 */
		EClass TEAM_MEMBER = eINSTANCE.getTeamMember();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MEMBER__NAME = eINSTANCE.getTeamMember_Name();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM_MEMBER__REQUIREMENTS = eINSTANCE.getTeamMember_Requirements();

		/**
		 * The meta object literal for the '{@link Y3853992.RequirementType <em>Requirement Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3853992.RequirementType
		 * @see Y3853992.impl.Y3853992PackageImpl#getRequirementType()
		 * @generated
		 */
		EEnum REQUIREMENT_TYPE = eINSTANCE.getRequirementType();

	}

} //Y3853992Package
