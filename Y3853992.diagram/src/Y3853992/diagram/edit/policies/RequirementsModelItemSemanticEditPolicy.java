/*
* 
*/
package Y3853992.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import Y3853992.diagram.edit.commands.RequirementCreateCommand;
import Y3853992.diagram.edit.commands.TeamMemberCreateCommand;
import Y3853992.diagram.edit.commands.TestCaseCreateCommand;
import Y3853992.diagram.providers.Y3853992ElementTypes;

/**
 * @generated
 */
public class RequirementsModelItemSemanticEditPolicy extends Y3853992BaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public RequirementsModelItemSemanticEditPolicy() {
		super(Y3853992ElementTypes.RequirementsModel_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Y3853992ElementTypes.Requirement_2007 == req.getElementType()) {
			return getGEFWrapper(new RequirementCreateCommand(req));
		}
		if (Y3853992ElementTypes.TestCase_2008 == req.getElementType()) {
			return getGEFWrapper(new TestCaseCreateCommand(req));
		}
		if (Y3853992ElementTypes.TeamMember_2009 == req.getElementType()) {
			return getGEFWrapper(new TeamMemberCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
