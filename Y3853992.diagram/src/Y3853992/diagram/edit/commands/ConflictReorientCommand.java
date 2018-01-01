/*
 * 
 */
package Y3853992.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import Y3853992.Conflict;
import Y3853992.Requirement;
import Y3853992.RequirementsModel;
import Y3853992.diagram.edit.policies.Y3853992BaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ConflictReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public ConflictReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Conflict) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Requirement && newEnd instanceof Requirement)) {
			return false;
		}
		Requirement target = getLink().getSecond();
		if (!(getLink().eContainer() instanceof RequirementsModel)) {
			return false;
		}
		RequirementsModel container = (RequirementsModel) getLink().eContainer();
		return Y3853992BaseItemSemanticEditPolicy.getLinkConstraints().canExistConflict_4008(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Requirement && newEnd instanceof Requirement)) {
			return false;
		}
		Requirement source = getLink().getFirst();
		if (!(getLink().eContainer() instanceof RequirementsModel)) {
			return false;
		}
		RequirementsModel container = (RequirementsModel) getLink().eContainer();
		return Y3853992BaseItemSemanticEditPolicy.getLinkConstraints().canExistConflict_4008(container, getLink(),
				source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setFirst(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setSecond(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected Conflict getLink() {
		return (Conflict) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected Requirement getOldSource() {
		return (Requirement) oldEnd;
	}

	/**
	* @generated
	*/
	protected Requirement getNewSource() {
		return (Requirement) newEnd;
	}

	/**
	* @generated
	*/
	protected Requirement getOldTarget() {
		return (Requirement) oldEnd;
	}

	/**
	* @generated
	*/
	protected Requirement getNewTarget() {
		return (Requirement) newEnd;
	}
}
