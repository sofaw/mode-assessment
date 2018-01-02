/*
 * 
 */
package Y3853992.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import Y3853992.diagram.edit.parts.RequirementEditPart;
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

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((TeamMemberEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(TeamMemberEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(Y3853992ElementTypes.TeamMemberRequirements_4009);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((TeamMemberEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(TeamMemberEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof RequirementEditPart) {
			types.add(Y3853992ElementTypes.TeamMemberRequirements_4009);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((TeamMemberEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(TeamMemberEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Y3853992ElementTypes.TeamMemberRequirements_4009) {
			types.add(Y3853992ElementTypes.Requirement_2007);
		}
		return types;
	}

}
