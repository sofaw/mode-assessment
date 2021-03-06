/*
* 
*/
package Y3853992.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import Y3853992.diagram.edit.commands.ConflictCreateCommand;
import Y3853992.diagram.edit.commands.ConflictReorientCommand;
import Y3853992.diagram.edit.commands.RequirementDecompositionCreateCommand;
import Y3853992.diagram.edit.commands.RequirementDecompositionReorientCommand;
import Y3853992.diagram.edit.commands.TeamMemberRequirementsCreateCommand;
import Y3853992.diagram.edit.commands.TeamMemberRequirementsReorientCommand;
import Y3853992.diagram.edit.commands.TestCaseVerifiesCreateCommand;
import Y3853992.diagram.edit.commands.TestCaseVerifiesReorientCommand;
import Y3853992.diagram.edit.parts.ConflictEditPart;
import Y3853992.diagram.edit.parts.RequirementDecompositionEditPart;
import Y3853992.diagram.edit.parts.TeamMemberRequirementsEditPart;
import Y3853992.diagram.edit.parts.TestCaseVerifiesEditPart;
import Y3853992.diagram.part.Y3853992VisualIDRegistry;
import Y3853992.diagram.providers.Y3853992ElementTypes;

/**
 * @generated
 */
public class RequirementItemSemanticEditPolicy extends Y3853992BaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public RequirementItemSemanticEditPolicy() {
		super(Y3853992ElementTypes.Requirement_2001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (Y3853992VisualIDRegistry.getVisualID(incomingLink) == ConflictEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (Y3853992VisualIDRegistry.getVisualID(incomingLink) == RequirementDecompositionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (Y3853992VisualIDRegistry.getVisualID(incomingLink) == TestCaseVerifiesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (Y3853992VisualIDRegistry.getVisualID(incomingLink) == TeamMemberRequirementsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (Y3853992VisualIDRegistry.getVisualID(outgoingLink) == ConflictEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (Y3853992VisualIDRegistry.getVisualID(outgoingLink) == RequirementDecompositionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (Y3853992ElementTypes.Conflict_4001 == req.getElementType()) {
			return getGEFWrapper(new ConflictCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (Y3853992ElementTypes.RequirementDecomposition_4002 == req.getElementType()) {
			return getGEFWrapper(new RequirementDecompositionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (Y3853992ElementTypes.TestCaseVerifies_4003 == req.getElementType()) {
			return null;
		}
		if (Y3853992ElementTypes.TeamMemberRequirements_4004 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (Y3853992ElementTypes.Conflict_4001 == req.getElementType()) {
			return getGEFWrapper(new ConflictCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (Y3853992ElementTypes.RequirementDecomposition_4002 == req.getElementType()) {
			return getGEFWrapper(new RequirementDecompositionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (Y3853992ElementTypes.TestCaseVerifies_4003 == req.getElementType()) {
			return getGEFWrapper(new TestCaseVerifiesCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (Y3853992ElementTypes.TeamMemberRequirements_4004 == req.getElementType()) {
			return getGEFWrapper(new TeamMemberRequirementsCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	* Returns command to reorient EClass based link. New link target or source
	* should be the domain model element associated with this node.
	* 
	* @generated
	*/
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ConflictEditPart.VISUAL_ID:
			return getGEFWrapper(new ConflictReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case RequirementDecompositionEditPart.VISUAL_ID:
			return getGEFWrapper(new RequirementDecompositionReorientCommand(req));
		case TestCaseVerifiesEditPart.VISUAL_ID:
			return getGEFWrapper(new TestCaseVerifiesReorientCommand(req));
		case TeamMemberRequirementsEditPart.VISUAL_ID:
			return getGEFWrapper(new TeamMemberRequirementsReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
