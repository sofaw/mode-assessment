/*
 * 
 */
package Y3853992.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import Y3853992.diagram.edit.parts.TeamMemberEditPart;
import Y3853992.diagram.providers.Y3853992ElementTypes;
import Y3853992.diagram.providers.Y3853992ModelingAssistantProvider;

/**
 * @generated
 */
public class Y3853992ModelingAssistantProviderOfTeamMemberEditPart extends Y3853992ModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((TeamMemberEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(TeamMemberEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(Y3853992ElementTypes.RequirementTeamMembers_4005);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((TeamMemberEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(TeamMemberEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Y3853992ElementTypes.RequirementTeamMembers_4005) {
			types.add(Y3853992ElementTypes.Requirement_2007);
		}
		return types;
	}

}
