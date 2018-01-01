/**
 */
package Y3853992.impl;

import Y3853992.Requirement;
import Y3853992.RequirementType;
import Y3853992.TeamMember;
import Y3853992.TestCase;
import Y3853992.Y3853992Package;

import java.util.Collection;
import java.util.stream.Stream;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Y3853992.impl.RequirementImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link Y3853992.impl.RequirementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Y3853992.impl.RequirementImpl#getProgress <em>Progress</em>}</li>
 *   <li>{@link Y3853992.impl.RequirementImpl#getType <em>Type</em>}</li>
 *   <li>{@link Y3853992.impl.RequirementImpl#getDecomposition <em>Decomposition</em>}</li>
 *   <li>{@link Y3853992.impl.RequirementImpl#getParentDecomposition <em>Parent Decomposition</em>}</li>
 *   <li>{@link Y3853992.impl.RequirementImpl#getTeamMembers <em>Team Members</em>}</li>
 *   <li>{@link Y3853992.impl.RequirementImpl#getTestCases <em>Test Cases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementImpl extends EObjectImpl implements Requirement {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final int IDENTIFIER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected int identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgress() <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgress()
	 * @generated
	 * @ordered
	 */
	protected static final float PROGRESS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getProgress() <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgress()
	 * @generated
	 * @ordered
	 */
	protected float progress = PROGRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final RequirementType TYPE_EDEFAULT = RequirementType.CUSTOMER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RequirementType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDecomposition() <em>Decomposition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposition()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> decomposition;

	/**
	 * The cached value of the '{@link #getParentDecomposition() <em>Parent Decomposition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentDecomposition()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> parentDecomposition;

	/**
	 * The cached value of the '{@link #getTeamMembers() <em>Team Members</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeamMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<TeamMember> teamMembers;

	/**
	 * The cached value of the '{@link #getTestCases() <em>Test Cases</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestCases()
	 * @generated
	 * @ordered
	 */
	protected EList<TestCase> testCases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Y3853992Package.Literals.REQUIREMENT;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(int newIdentifier) {
		int oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Y3853992Package.REQUIREMENT__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Y3853992Package.REQUIREMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public float getProgress() {
		EList<Requirement> decomposition = getDecomposition();
		float size = decomposition.size();
		if(size == 0) {
			return progress;
		}
		float sum = 0;
		for(Requirement r : decomposition) {
			sum += r.getProgress();
		}
		return sum/size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgress(float newProgress) {
		float oldProgress = progress;
		progress = newProgress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Y3853992Package.REQUIREMENT__PROGRESS, oldProgress, progress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(RequirementType newType) {
		RequirementType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Y3853992Package.REQUIREMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getParentDecomposition() {
		if (parentDecomposition == null) {
			parentDecomposition = new EObjectWithInverseResolvingEList.ManyInverse<Requirement>(Requirement.class, this, Y3853992Package.REQUIREMENT__PARENT_DECOMPOSITION, Y3853992Package.REQUIREMENT__DECOMPOSITION);
		}
		return parentDecomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getDecomposition() {
		if (decomposition == null) {
			decomposition = new EObjectWithInverseResolvingEList.ManyInverse<Requirement>(Requirement.class, this, Y3853992Package.REQUIREMENT__DECOMPOSITION, Y3853992Package.REQUIREMENT__PARENT_DECOMPOSITION);
		}
		return decomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TeamMember> getTeamMembers() {
		if (teamMembers == null) {
			teamMembers = new EObjectWithInverseResolvingEList.ManyInverse<TeamMember>(TeamMember.class, this, Y3853992Package.REQUIREMENT__TEAM_MEMBERS, Y3853992Package.TEAM_MEMBER__REQUIREMENTS);
		}
		return teamMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestCase> getTestCases() {
		if (testCases == null) {
			testCases = new EObjectWithInverseResolvingEList.ManyInverse<TestCase>(TestCase.class, this, Y3853992Package.REQUIREMENT__TEST_CASES, Y3853992Package.TEST_CASE__VERIFIES);
		}
		return testCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Y3853992Package.REQUIREMENT__DECOMPOSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDecomposition()).basicAdd(otherEnd, msgs);
			case Y3853992Package.REQUIREMENT__PARENT_DECOMPOSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentDecomposition()).basicAdd(otherEnd, msgs);
			case Y3853992Package.REQUIREMENT__TEAM_MEMBERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTeamMembers()).basicAdd(otherEnd, msgs);
			case Y3853992Package.REQUIREMENT__TEST_CASES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTestCases()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Y3853992Package.REQUIREMENT__DECOMPOSITION:
				return ((InternalEList<?>)getDecomposition()).basicRemove(otherEnd, msgs);
			case Y3853992Package.REQUIREMENT__PARENT_DECOMPOSITION:
				return ((InternalEList<?>)getParentDecomposition()).basicRemove(otherEnd, msgs);
			case Y3853992Package.REQUIREMENT__TEAM_MEMBERS:
				return ((InternalEList<?>)getTeamMembers()).basicRemove(otherEnd, msgs);
			case Y3853992Package.REQUIREMENT__TEST_CASES:
				return ((InternalEList<?>)getTestCases()).basicRemove(otherEnd, msgs);
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
			case Y3853992Package.REQUIREMENT__IDENTIFIER:
				return getIdentifier();
			case Y3853992Package.REQUIREMENT__DESCRIPTION:
				return getDescription();
			case Y3853992Package.REQUIREMENT__PROGRESS:
				return getProgress();
			case Y3853992Package.REQUIREMENT__TYPE:
				return getType();
			case Y3853992Package.REQUIREMENT__DECOMPOSITION:
				return getDecomposition();
			case Y3853992Package.REQUIREMENT__PARENT_DECOMPOSITION:
				return getParentDecomposition();
			case Y3853992Package.REQUIREMENT__TEAM_MEMBERS:
				return getTeamMembers();
			case Y3853992Package.REQUIREMENT__TEST_CASES:
				return getTestCases();
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
			case Y3853992Package.REQUIREMENT__IDENTIFIER:
				setIdentifier((Integer)newValue);
				return;
			case Y3853992Package.REQUIREMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Y3853992Package.REQUIREMENT__PROGRESS:
				setProgress((Float)newValue);
				return;
			case Y3853992Package.REQUIREMENT__TYPE:
				setType((RequirementType)newValue);
				return;
			case Y3853992Package.REQUIREMENT__DECOMPOSITION:
				getDecomposition().clear();
				getDecomposition().addAll((Collection<? extends Requirement>)newValue);
				return;
			case Y3853992Package.REQUIREMENT__PARENT_DECOMPOSITION:
				getParentDecomposition().clear();
				getParentDecomposition().addAll((Collection<? extends Requirement>)newValue);
				return;
			case Y3853992Package.REQUIREMENT__TEAM_MEMBERS:
				getTeamMembers().clear();
				getTeamMembers().addAll((Collection<? extends TeamMember>)newValue);
				return;
			case Y3853992Package.REQUIREMENT__TEST_CASES:
				getTestCases().clear();
				getTestCases().addAll((Collection<? extends TestCase>)newValue);
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
			case Y3853992Package.REQUIREMENT__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case Y3853992Package.REQUIREMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Y3853992Package.REQUIREMENT__PROGRESS:
				setProgress(PROGRESS_EDEFAULT);
				return;
			case Y3853992Package.REQUIREMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Y3853992Package.REQUIREMENT__DECOMPOSITION:
				getDecomposition().clear();
				return;
			case Y3853992Package.REQUIREMENT__PARENT_DECOMPOSITION:
				getParentDecomposition().clear();
				return;
			case Y3853992Package.REQUIREMENT__TEAM_MEMBERS:
				getTeamMembers().clear();
				return;
			case Y3853992Package.REQUIREMENT__TEST_CASES:
				getTestCases().clear();
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
			case Y3853992Package.REQUIREMENT__IDENTIFIER:
				return identifier != IDENTIFIER_EDEFAULT;
			case Y3853992Package.REQUIREMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Y3853992Package.REQUIREMENT__PROGRESS:
				return progress != PROGRESS_EDEFAULT;
			case Y3853992Package.REQUIREMENT__TYPE:
				return type != TYPE_EDEFAULT;
			case Y3853992Package.REQUIREMENT__DECOMPOSITION:
				return decomposition != null && !decomposition.isEmpty();
			case Y3853992Package.REQUIREMENT__PARENT_DECOMPOSITION:
				return parentDecomposition != null && !parentDecomposition.isEmpty();
			case Y3853992Package.REQUIREMENT__TEAM_MEMBERS:
				return teamMembers != null && !teamMembers.isEmpty();
			case Y3853992Package.REQUIREMENT__TEST_CASES:
				return testCases != null && !testCases.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(", description: ");
		result.append(description);
		result.append(", progress: ");
		result.append(progress);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
