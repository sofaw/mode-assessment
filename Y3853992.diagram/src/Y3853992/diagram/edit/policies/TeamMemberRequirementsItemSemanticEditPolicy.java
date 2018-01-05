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
public class TeamMemberRequirementsItemSemanticEditPolicy extends Y3853992BaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TeamMemberRequirementsItemSemanticEditPolicy() {
		super(Y3853992ElementTypes.TeamMemberRequirements_4004);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
