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
public class Y3853992ModelingAssistantProviderOfRequirementEditPart extends Y3853992ModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((RequirementEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(RequirementEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(Y3853992ElementTypes.RequirementDecomposition_4001);
		types.add(Y3853992ElementTypes.RequirementConflicts_4007);
		types.add(Y3853992ElementTypes.RequirementTeamMembers_4005);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((RequirementEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(RequirementEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof RequirementEditPart) {
			types.add(Y3853992ElementTypes.RequirementDecomposition_4001);
		}
		if (targetEditPart instanceof RequirementEditPart) {
			types.add(Y3853992ElementTypes.RequirementConflicts_4007);
		}
		if (targetEditPart instanceof TeamMemberEditPart) {
			types.add(Y3853992ElementTypes.RequirementTeamMembers_4005);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((RequirementEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(RequirementEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Y3853992ElementTypes.RequirementDecomposition_4001) {
			types.add(Y3853992ElementTypes.Requirement_2007);
		} else if (relationshipType == Y3853992ElementTypes.RequirementConflicts_4007) {
			types.add(Y3853992ElementTypes.Requirement_2007);
		} else if (relationshipType == Y3853992ElementTypes.RequirementTeamMembers_4005) {
			types.add(Y3853992ElementTypes.TeamMember_2009);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((RequirementEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(RequirementEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(Y3853992ElementTypes.RequirementDecomposition_4001);
		types.add(Y3853992ElementTypes.RequirementConflicts_4007);
		types.add(Y3853992ElementTypes.TestCaseVerifies_4004);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((RequirementEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(RequirementEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Y3853992ElementTypes.RequirementDecomposition_4001) {
			types.add(Y3853992ElementTypes.Requirement_2007);
		} else if (relationshipType == Y3853992ElementTypes.RequirementConflicts_4007) {
			types.add(Y3853992ElementTypes.Requirement_2007);
		} else if (relationshipType == Y3853992ElementTypes.TestCaseVerifies_4004) {
			types.add(Y3853992ElementTypes.TestCase_2008);
		}
		return types;
	}

}
