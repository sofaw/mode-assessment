/*
 * 
 */
package Y3853992.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import Y3853992.diagram.part.Y3853992VisualIDRegistry;

/**
 * @generated
 */
public class Y3853992EditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (Y3853992VisualIDRegistry.getVisualID(view)) {

			case RequirementsModelEditPart.VISUAL_ID:
				return new RequirementsModelEditPart(view);

			case RequirementEditPart.VISUAL_ID:
				return new RequirementEditPart(view);

			case RequirementDescriptionTypeEditPart.VISUAL_ID:
				return new RequirementDescriptionTypeEditPart(view);

			case TestCaseEditPart.VISUAL_ID:
				return new TestCaseEditPart(view);

			case TestCaseDescriptionEditPart.VISUAL_ID:
				return new TestCaseDescriptionEditPart(view);

			case TeamMemberEditPart.VISUAL_ID:
				return new TeamMemberEditPart(view);

			case TeamMemberNameEditPart.VISUAL_ID:
				return new TeamMemberNameEditPart(view);

			case RequirementDecompositionEditPart.VISUAL_ID:
				return new RequirementDecompositionEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case RequirementConflictsEditPart.VISUAL_ID:
				return new RequirementConflictsEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case RequirementTeamMembersEditPart.VISUAL_ID:
				return new RequirementTeamMembersEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case TestCaseVerifiesEditPart.VISUAL_ID:
				return new TestCaseVerifiesEditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
