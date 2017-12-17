/*
* 
*/
package Y3853992.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import Y3853992.diagram.providers.Y3853992ElementTypes;

/**
 * @generated
 */
public class RequirementConflictsItemSemanticEditPolicy extends Y3853992BaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public RequirementConflictsItemSemanticEditPolicy() {
		super(Y3853992ElementTypes.RequirementConflicts_4007);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
