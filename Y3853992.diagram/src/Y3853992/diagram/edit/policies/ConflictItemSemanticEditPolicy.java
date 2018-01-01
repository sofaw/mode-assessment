/*
* 
*/
package Y3853992.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import Y3853992.diagram.providers.Y3853992ElementTypes;

/**
 * @generated
 */
public class ConflictItemSemanticEditPolicy extends Y3853992BaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ConflictItemSemanticEditPolicy() {
		super(Y3853992ElementTypes.Conflict_4008);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
