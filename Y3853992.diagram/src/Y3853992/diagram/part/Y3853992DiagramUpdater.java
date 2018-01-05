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

import Y3853992.Conflict;
import Y3853992.Requirement;
import Y3853992.RequirementsModel;
import Y3853992.TeamMember;
import Y3853992.TestCase;
import Y3853992.Y3853992Package;
import Y3853992.diagram.edit.parts.ConflictEditPart;
import Y3853992.diagram.edit.parts.RequirementDecompositionEditPart;
import Y3853992.diagram.edit.parts.RequirementEditPart;
import Y3853992.diagram.edit.parts.RequirementsModelEditPart;
import Y3853992.diagram.edit.parts.TeamMemberEditPart;
import Y3853992.diagram.edit.parts.TeamMemberRequirementsEditPart;
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
			return getRequirement_2001ContainedLinks(view);
		case TestCaseEditPart.VISUAL_ID:
			return getTestCase_2002ContainedLinks(view);
		case TeamMemberEditPart.VISUAL_ID:
			return getTeamMember_2003ContainedLinks(view);
		case ConflictEditPart.VISUAL_ID:
			return getConflict_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<Y3853992LinkDescriptor> getIncomingLinks(View view) {
		switch (Y3853992VisualIDRegistry.getVisualID(view)) {
		case RequirementEditPart.VISUAL_ID:
			return getRequirement_2001IncomingLinks(view);
		case TestCaseEditPart.VISUAL_ID:
			return getTestCase_2002IncomingLinks(view);
		case TeamMemberEditPart.VISUAL_ID:
			return getTeamMember_2003IncomingLinks(view);
		case ConflictEditPart.VISUAL_ID:
			return getConflict_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<Y3853992LinkDescriptor> getOutgoingLinks(View view) {
		switch (Y3853992VisualIDRegistry.getVisualID(view)) {
		case RequirementEditPart.VISUAL_ID:
			return getRequirement_2001OutgoingLinks(view);
		case TestCaseEditPart.VISUAL_ID:
			return getTestCase_2002OutgoingLinks(view);
		case TeamMemberEditPart.VISUAL_ID:
			return getTeamMember_2003OutgoingLinks(view);
		case ConflictEditPart.VISUAL_ID:
			return getConflict_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<Y3853992LinkDescriptor> getRequirementsModel_1000ContainedLinks(View view) {
		RequirementsModel modelElement = (RequirementsModel) view.getElement();
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Conflict_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<Y3853992LinkDescriptor> getRequirement_2001ContainedLinks(View view) {
		Requirement modelElement = (Requirement) view.getElement();
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Requirement_Decomposition_4002(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<Y3853992LinkDescriptor> getTestCase_2002ContainedLinks(View view) {
		TestCase modelElement = (TestCase) view.getElement();
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_TestCase_Verifies_4003(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<Y3853992LinkDescriptor> getTeamMember_2003ContainedLinks(View view) {
		TeamMember modelElement = (TeamMember) view.getElement();
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_TeamMember_Requirements_4004(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<Y3853992LinkDescriptor> getConflict_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<Y3853992LinkDescriptor> getRequirement_2001IncomingLinks(View view) {
		Requirement modelElement = (Requirement) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Conflict_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Requirement_Decomposition_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_TestCase_Verifies_4003(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_TeamMember_Requirements_4004(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<Y3853992LinkDescriptor> getTestCase_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<Y3853992LinkDescriptor> getTeamMember_2003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<Y3853992LinkDescriptor> getConflict_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<Y3853992LinkDescriptor> getRequirement_2001OutgoingLinks(View view) {
		Requirement modelElement = (Requirement) view.getElement();
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Conflict_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Requirement_Decomposition_4002(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<Y3853992LinkDescriptor> getTestCase_2002OutgoingLinks(View view) {
		TestCase modelElement = (TestCase) view.getElement();
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_TestCase_Verifies_4003(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<Y3853992LinkDescriptor> getTeamMember_2003OutgoingLinks(View view) {
		TeamMember modelElement = (TeamMember) view.getElement();
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_TeamMember_Requirements_4004(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<Y3853992LinkDescriptor> getConflict_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<Y3853992LinkDescriptor> getContainedTypeModelFacetLinks_Conflict_4001(
			RequirementsModel container) {
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		for (Iterator<?> links = container.getConflicts().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Conflict) {
				continue;
			}
			Conflict link = (Conflict) linkObject;
			if (ConflictEditPart.VISUAL_ID != Y3853992VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Requirement dst = link.getSecond();
			Requirement src = link.getFirst();
			result.add(new Y3853992LinkDescriptor(src, dst, link, Y3853992ElementTypes.Conflict_4001,
					ConflictEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<Y3853992LinkDescriptor> getIncomingTypeModelFacetLinks_Conflict_4001(Requirement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != Y3853992Package.eINSTANCE.getConflict_Second()
					|| false == setting.getEObject() instanceof Conflict) {
				continue;
			}
			Conflict link = (Conflict) setting.getEObject();
			if (ConflictEditPart.VISUAL_ID != Y3853992VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Requirement src = link.getFirst();
			result.add(new Y3853992LinkDescriptor(src, target, link, Y3853992ElementTypes.Conflict_4001,
					ConflictEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<Y3853992LinkDescriptor> getIncomingFeatureModelFacetLinks_Requirement_Decomposition_4002(
			Requirement target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == Y3853992Package.eINSTANCE.getRequirement_Decomposition()) {
				result.add(new Y3853992LinkDescriptor(setting.getEObject(), target,
						Y3853992ElementTypes.RequirementDecomposition_4002,
						RequirementDecompositionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<Y3853992LinkDescriptor> getIncomingFeatureModelFacetLinks_TestCase_Verifies_4003(
			Requirement target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == Y3853992Package.eINSTANCE.getTestCase_Verifies()) {
				result.add(new Y3853992LinkDescriptor(setting.getEObject(), target,
						Y3853992ElementTypes.TestCaseVerifies_4003, TestCaseVerifiesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<Y3853992LinkDescriptor> getIncomingFeatureModelFacetLinks_TeamMember_Requirements_4004(
			Requirement target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == Y3853992Package.eINSTANCE.getTeamMember_Requirements()) {
				result.add(new Y3853992LinkDescriptor(setting.getEObject(), target,
						Y3853992ElementTypes.TeamMemberRequirements_4004, TeamMemberRequirementsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<Y3853992LinkDescriptor> getOutgoingTypeModelFacetLinks_Conflict_4001(Requirement source) {
		RequirementsModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof RequirementsModel) {
				container = (RequirementsModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		for (Iterator<?> links = container.getConflicts().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Conflict) {
				continue;
			}
			Conflict link = (Conflict) linkObject;
			if (ConflictEditPart.VISUAL_ID != Y3853992VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Requirement dst = link.getSecond();
			Requirement src = link.getFirst();
			if (src != source) {
				continue;
			}
			result.add(new Y3853992LinkDescriptor(src, dst, link, Y3853992ElementTypes.Conflict_4001,
					ConflictEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<Y3853992LinkDescriptor> getOutgoingFeatureModelFacetLinks_Requirement_Decomposition_4002(
			Requirement source) {
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		for (Iterator<?> destinations = source.getDecomposition().iterator(); destinations.hasNext();) {
			Requirement destination = (Requirement) destinations.next();
			result.add(new Y3853992LinkDescriptor(source, destination,
					Y3853992ElementTypes.RequirementDecomposition_4002, RequirementDecompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<Y3853992LinkDescriptor> getOutgoingFeatureModelFacetLinks_TestCase_Verifies_4003(
			TestCase source) {
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		for (Iterator<?> destinations = source.getVerifies().iterator(); destinations.hasNext();) {
			Requirement destination = (Requirement) destinations.next();
			result.add(new Y3853992LinkDescriptor(source, destination, Y3853992ElementTypes.TestCaseVerifies_4003,
					TestCaseVerifiesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<Y3853992LinkDescriptor> getOutgoingFeatureModelFacetLinks_TeamMember_Requirements_4004(
			TeamMember source) {
		LinkedList<Y3853992LinkDescriptor> result = new LinkedList<Y3853992LinkDescriptor>();
		for (Iterator<?> destinations = source.getRequirements().iterator(); destinations.hasNext();) {
			Requirement destination = (Requirement) destinations.next();
			result.add(new Y3853992LinkDescriptor(source, destination, Y3853992ElementTypes.TeamMemberRequirements_4004,
					TeamMemberRequirementsEditPart.VISUAL_ID));
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
