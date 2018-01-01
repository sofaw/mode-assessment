/**
 */
package Y3853992.impl;

import Y3853992.Conflict;
import Y3853992.Requirement;
import Y3853992.RequirementsModel;
import Y3853992.TeamMember;
import Y3853992.TestCase;
import Y3853992.Y3853992Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirements Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Y3853992.impl.RequirementsModelImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link Y3853992.impl.RequirementsModelImpl#getTestCases <em>Test Cases</em>}</li>
 *   <li>{@link Y3853992.impl.RequirementsModelImpl#getTeamMembers <em>Team Members</em>}</li>
 *   <li>{@link Y3853992.impl.RequirementsModelImpl#getConflicts <em>Conflicts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementsModelImpl extends EObjectImpl implements RequirementsModel {
	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> requirements;

	/**
	 * The cached value of the '{@link #getTestCases() <em>Test Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestCases()
	 * @generated
	 * @ordered
	 */
	protected EList<TestCase> testCases;

	/**
	 * The cached value of the '{@link #getTeamMembers() <em>Team Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeamMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<TeamMember> teamMembers;

	/**
	 * The cached value of the '{@link #getConflicts() <em>Conflicts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConflicts()
	 * @generated
	 * @ordered
	 */
	protected EList<Conflict> conflicts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementsModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Y3853992Package.Literals.REQUIREMENTS_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectContainmentEList<Requirement>(Requirement.class, this, Y3853992Package.REQUIREMENTS_MODEL__REQUIREMENTS);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestCase> getTestCases() {
		if (testCases == null) {
			testCases = new EObjectContainmentEList<TestCase>(TestCase.class, this, Y3853992Package.REQUIREMENTS_MODEL__TEST_CASES);
		}
		return testCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TeamMember> getTeamMembers() {
		if (teamMembers == null) {
			teamMembers = new EObjectContainmentEList<TeamMember>(TeamMember.class, this, Y3853992Package.REQUIREMENTS_MODEL__TEAM_MEMBERS);
		}
		return teamMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Conflict> getConflicts() {
		if (conflicts == null) {
			conflicts = new EObjectContainmentEList<Conflict>(Conflict.class, this, Y3853992Package.REQUIREMENTS_MODEL__CONFLICTS);
		}
		return conflicts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Y3853992Package.REQUIREMENTS_MODEL__REQUIREMENTS:
				return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
			case Y3853992Package.REQUIREMENTS_MODEL__TEST_CASES:
				return ((InternalEList<?>)getTestCases()).basicRemove(otherEnd, msgs);
			case Y3853992Package.REQUIREMENTS_MODEL__TEAM_MEMBERS:
				return ((InternalEList<?>)getTeamMembers()).basicRemove(otherEnd, msgs);
			case Y3853992Package.REQUIREMENTS_MODEL__CONFLICTS:
				return ((InternalEList<?>)getConflicts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Y3853992Package.REQUIREMENTS_MODEL__REQUIREMENTS:
				return getRequirements();
			case Y3853992Package.REQUIREMENTS_MODEL__TEST_CASES:
				return getTestCases();
			case Y3853992Package.REQUIREMENTS_MODEL__TEAM_MEMBERS:
				return getTeamMembers();
			case Y3853992Package.REQUIREMENTS_MODEL__CONFLICTS:
				return getConflicts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Y3853992Package.REQUIREMENTS_MODEL__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends Requirement>)newValue);
				return;
			case Y3853992Package.REQUIREMENTS_MODEL__TEST_CASES:
				getTestCases().clear();
				getTestCases().addAll((Collection<? extends TestCase>)newValue);
				return;
			case Y3853992Package.REQUIREMENTS_MODEL__TEAM_MEMBERS:
				getTeamMembers().clear();
				getTeamMembers().addAll((Collection<? extends TeamMember>)newValue);
				return;
			case Y3853992Package.REQUIREMENTS_MODEL__CONFLICTS:
				getConflicts().clear();
				getConflicts().addAll((Collection<? extends Conflict>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Y3853992Package.REQUIREMENTS_MODEL__REQUIREMENTS:
				getRequirements().clear();
				return;
			case Y3853992Package.REQUIREMENTS_MODEL__TEST_CASES:
				getTestCases().clear();
				return;
			case Y3853992Package.REQUIREMENTS_MODEL__TEAM_MEMBERS:
				getTeamMembers().clear();
				return;
			case Y3853992Package.REQUIREMENTS_MODEL__CONFLICTS:
				getConflicts().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Y3853992Package.REQUIREMENTS_MODEL__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
			case Y3853992Package.REQUIREMENTS_MODEL__TEST_CASES:
				return testCases != null && !testCases.isEmpty();
			case Y3853992Package.REQUIREMENTS_MODEL__TEAM_MEMBERS:
				return teamMembers != null && !teamMembers.isEmpty();
			case Y3853992Package.REQUIREMENTS_MODEL__CONFLICTS:
				return conflicts != null && !conflicts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequirementsModelImpl
