/*
* 
*/
package Y3853992.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import Y3853992.Requirement;
import Y3853992.RequirementsModel;
import Y3853992.TeamMember;
import Y3853992.TestCase;
import Y3853992.Y3853992Package;
import Y3853992.diagram.edit.parts.RequirementConflictsEditPart;
import Y3853992.diagram.edit.parts.RequirementDecompositionEditPart;
import Y3853992.diagram.edit.parts.RequirementEditPart;
import Y3853992.diagram.edit.parts.RequirementTeamMembersEditPart;
import Y3853992.diagram.edit.parts.RequirementsModelEditPart;
import Y3853992.diagram.edit.parts.TeamMemberEditPart;
import Y3853992.diagram.edit.parts.TestCaseEditPart;
import Y3853992.diagram.edit.parts.TestCaseVerifiesEditPart;
import Y3853992.diagram.providers.Y3853992ElementTypes;

/**
 * @generated
 */
public class Y3853992DiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<Y3853992NodeDescriptor> getSemanticChildren(View view) {
		switch (Y3853992VisualIDRegistry.getVisualID(view)) {
		case RequirementsModelEditPart.VISUAL_ID:
			return getRequirementsModel_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<Y3853992NodeDescriptor> getRequirementsModel_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		RequirementsModel modelElement = (RequirementsModel) view.getElement();
		LinkedList<Y3853992NodeDescriptor> result = new LinkedList<Y3853992NodeDescriptor>();
		for (Iterator<?> it = modelElement.getRequirements().iterator(); it.hasNext();) {
			Requirement childElement = (Requirement) it.next();
			int visualID = Y3853992VisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RequirementEditPart.VISUAL_ID) {
				result.add(new Y3853992NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTestCases().iterator(); it.hasNext();) {
			TestCase childElement = (TestCase) it.next();
			int visualID = Y3853992VisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == TestCaseEditPart.VISUAL_ID) {
				result.add(new Y3853992NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTeamMembers().iterator(); it.hasNext();) {
			TeamMember childElement = (TeamMember) it.next();
			int visualID = Y3853992VisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == TeamMemberEditPart.VISUAL_ID) {
				result.add(new Y3853992NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<Y3853992LinkDescriptor> getContainedLinks(View view) {
		switch (Y3853992VisualIDRegistry.getVisualID(view)) {
		case RequirementsModelEditPart.VISUAL_ID:
			return getRequirementsModel_1000ContainedLinks(view);
		case RequirementEditPart.VISUAL_ID:
			return getRequirement_2007ContainedLinks(view);
		case TestCaseEditPart.VISUAL_ID:
			return getTestCase_2008ContainedLinks(view);
		case TeamMemberEditPart.VISUAL_ID:
			return getTeamMember_2009ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<Y3853992LinkDescriptor> getIncomingLinks(View view) {
		switch (Y3853992VisualIDRegistry.getVisualID(view)) {
		case RequirementEditPart.VISUAL_ID:
			return getRequirement_2007IncomingLinks(view);
		case TestCaseEditPart.VISUAL_ID:
			return getTestCase_2008IncomingLinks(view);
		case TeamMemberEditPart.VISUAL_ID:
			return getTeamMember_2009IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<Y3853992LinkDescriptor> getOutgoingLinks(View view) {
		switch (Y3853992VisualIDRegistry.getVisualID(view)) {
		case RequirementEditPart.VISUAL_ID:
			return getRequirement_2007OutgoingLinks(view);
		case TestCaseEditPart.VISUAL_ID:
			return getTestCase_2008OutgoingLinks(view);
		case TeamMemberEditPart.VISUAL_ID:
			return getTeamMember_2009OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<Y3853992LinkDescriptor> getRequirementsModel_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<Y3853992LinkDescriptor> getRequirement_2007ContainedLinks(View view) {
		Requirement modelElement = (Requirement) view.getElement();
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Requirement_Decomposition_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Requirement_Conflicts_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Requirement_TeamMembers_4005(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<Y3853992LinkDescriptor> getTestCase_2008ContainedLinks(View view) {
		TestCase modelElement = (TestCase) view.getElement();
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_TestCase_Verifies_4004(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<Y3853992LinkDescriptor> getTeamMember_2009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<Y3853992LinkDescriptor> getRequirement_2007IncomingLinks(View view) {
		Requirement modelElement = (Requirement) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Requirement_Decomposition_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Requirement_Conflicts_4007(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_TestCase_Verifies_4004(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<Y3853992LinkDescriptor> getTestCase_2008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<Y3853992LinkDescriptor> getTeamMember_2009IncomingLinks(View view) {
		TeamMember modelElement = (TeamMember) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Requirement_TeamMembers_4005(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<Y3853992LinkDescriptor> getRequirement_2007OutgoingLinks(View view) {
		Requirement modelElement = (Requirement) view.getElement();
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Requirement_Decomposition_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Requirement_Conflicts_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Requirement_TeamMembers_4005(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<Y3853992LinkDescriptor> getTestCase_2008OutgoingLinks(View view) {
		TestCase modelElement = (TestCase) view.getElement();
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_TestCase_Verifies_4004(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<Y3853992LinkDescriptor> getTeamMember_2009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<Y3853992LinkDescriptor> getIncomingFeatureModelFacetLinks_Requirement_Decomposition_4001(
			Requirement target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == Y3853992Package.eINSTANCE.getRequirement_Decomposition()) {
				result.add(new Y3853992LinkDescriptor(setting.getEObject(), target,
						Y3853992ElementTypes.RequirementDecomposition_4001,
						RequirementDecompositionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<Y3853992LinkDescriptor> getIncomingFeatureModelFacetLinks_Requirement_Conflicts_4007(
			Requirement target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == Y3853992Package.eINSTANCE.getRequirement_Conflicts()) {
				result.add(new Y3853992LinkDescriptor(setting.getEObject(), target,
						Y3853992ElementTypes.RequirementConflicts_4007, RequirementConflictsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<Y3853992LinkDescriptor> getIncomingFeatureModelFacetLinks_Requirement_TeamMembers_4005(
			TeamMember target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == Y3853992Package.eINSTANCE.getRequirement_TeamMembers()) {
				result.add(new Y3853992LinkDescriptor(setting.getEObject(), target,
						Y3853992ElementTypes.RequirementTeamMembers_4005, RequirementTeamMembersEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Y3853992LinkDescriptor> getIncomingFeatureModelFacetLinks_TestCase_Verifies_4004(
			Requirement target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == Y3853992Package.eINSTANCE.getTestCase_Verifies()) {
				result.add(new Y3853992LinkDescriptor(setting.getEObject(), target,
						Y3853992ElementTypes.TestCaseVerifies_4004, TestCaseVerifiesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<Y3853992LinkDescriptor> getOutgoingFeatureModelFacetLinks_Requirement_Decomposition_4001(
			Requirement source) {
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		for (Iterator<?> destinations = source.getDecomposition().iterator(); destinations.hasNext();) {
			Requirement destination = (Requirement) destinations.next();
			result.add(new Y3853992LinkDescriptor(source, destination,
					Y3853992ElementTypes.RequirementDecomposition_4001, RequirementDecompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<Y3853992LinkDescriptor> getOutgoingFeatureModelFacetLinks_Requirement_Conflicts_4007(
			Requirement source) {
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		for (Iterator<?> destinations = source.getConflicts().iterator(); destinations.hasNext();) {
			Requirement destination = (Requirement) destinations.next();
			result.add(new Y3853992LinkDescriptor(source, destination, Y3853992ElementTypes.RequirementConflicts_4007,
					RequirementConflictsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<Y3853992LinkDescriptor> getOutgoingFeatureModelFacetLinks_Requirement_TeamMembers_4005(
			Requirement source) {
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		for (Iterator<?> destinations = source.getTeamMembers().iterator(); destinations.hasNext();) {
			TeamMember destination = (TeamMember) destinations.next();
			result.add(new Y3853992LinkDescriptor(source, destination, Y3853992ElementTypes.RequirementTeamMembers_4005,
					RequirementTeamMembersEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<Y3853992LinkDescriptor> getOutgoingFeatureModelFacetLinks_TestCase_Verifies_4004(
			TestCase source) {
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		for (Iterator<?> destinations = source.getVerifies().iterator(); destinations.hasNext();) {
			Requirement destination = (Requirement) destinations.next();
			result.add(new Y3853992LinkDescriptor(source, destination, Y3853992ElementTypes.TestCaseVerifies_4004,
					TestCaseVerifiesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<Y3853992NodeDescriptor> getSemanticChildren(View view) {
			return Y3853992DiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<Y3853992LinkDescriptor> getContainedLinks(View view) {
			return Y3853992DiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<Y3853992LinkDescriptor> getIncomingLinks(View view) {
			return Y3853992DiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<Y3853992LinkDescriptor> getOutgoingLinks(View view) {
			return Y3853992DiagramUpdater.getOutgoingLinks(view);
		}
	};

}
