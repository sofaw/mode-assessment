/*
* 
*/
package Y3853992.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import Y3853992.RequirementsModel;
import Y3853992.Y3853992Package;
import Y3853992.diagram.edit.parts.ConflictEditPart;
import Y3853992.diagram.edit.parts.RequirementDecompositionEditPart;
import Y3853992.diagram.edit.parts.RequirementDescriptionTypeEditPart;
import Y3853992.diagram.edit.parts.RequirementEditPart;
import Y3853992.diagram.edit.parts.RequirementTeamMembersEditPart;
import Y3853992.diagram.edit.parts.RequirementsModelEditPart;
import Y3853992.diagram.edit.parts.TeamMemberEditPart;
import Y3853992.diagram.edit.parts.TeamMemberNameEditPart;
import Y3853992.diagram.edit.parts.TestCaseDescriptionEditPart;
import Y3853992.diagram.edit.parts.TestCaseEditPart;
import Y3853992.diagram.edit.parts.TestCaseVerifiesEditPart;
import Y3853992.diagram.edit.parts.WrappingLabel2EditPart;
import Y3853992.diagram.edit.parts.WrappingLabel3EditPart;
import Y3853992.diagram.edit.parts.WrappingLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class Y3853992VisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "Y3853992.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (RequirementsModelEditPart.MODEL_ID.equals(view.getType())) {
				return RequirementsModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return Y3853992.diagram.part.Y3853992VisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				Y3853992DiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (Y3853992Package.eINSTANCE.getRequirementsModel().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((RequirementsModel) domainElement)) {
			return RequirementsModelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = Y3853992.diagram.part.Y3853992VisualIDRegistry.getModelID(containerView);
		if (!RequirementsModelEditPart.MODEL_ID.equals(containerModelID) && !"Y3853992".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (RequirementsModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = Y3853992.diagram.part.Y3853992VisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = RequirementsModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case RequirementsModelEditPart.VISUAL_ID:
			if (Y3853992Package.eINSTANCE.getRequirement().isSuperTypeOf(domainElement.eClass())) {
				return RequirementEditPart.VISUAL_ID;
			}
			if (Y3853992Package.eINSTANCE.getTestCase().isSuperTypeOf(domainElement.eClass())) {
				return TestCaseEditPart.VISUAL_ID;
			}
			if (Y3853992Package.eINSTANCE.getTeamMember().isSuperTypeOf(domainElement.eClass())) {
				return TeamMemberEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = Y3853992.diagram.part.Y3853992VisualIDRegistry.getModelID(containerView);
		if (!RequirementsModelEditPart.MODEL_ID.equals(containerModelID) && !"Y3853992".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (RequirementsModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = Y3853992.diagram.part.Y3853992VisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = RequirementsModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case RequirementsModelEditPart.VISUAL_ID:
			if (RequirementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TestCaseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TeamMemberEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RequirementEditPart.VISUAL_ID:
			if (RequirementDescriptionTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TestCaseEditPart.VISUAL_ID:
			if (TestCaseDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TeamMemberEditPart.VISUAL_ID:
			if (TeamMemberNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RequirementDecompositionEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RequirementTeamMembersEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TestCaseVerifiesEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (Y3853992Package.eINSTANCE.getConflict().isSuperTypeOf(domainElement.eClass())) {
			return ConflictEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(RequirementsModel element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case RequirementsModelEditPart.VISUAL_ID:
			return false;
		case RequirementEditPart.VISUAL_ID:
		case TestCaseEditPart.VISUAL_ID:
		case TeamMemberEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return Y3853992.diagram.part.Y3853992VisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return Y3853992.diagram.part.Y3853992VisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return Y3853992.diagram.part.Y3853992VisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return Y3853992.diagram.part.Y3853992VisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return Y3853992.diagram.part.Y3853992VisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return Y3853992.diagram.part.Y3853992VisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
