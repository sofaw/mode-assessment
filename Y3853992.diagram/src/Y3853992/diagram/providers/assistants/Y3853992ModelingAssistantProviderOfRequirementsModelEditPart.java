/*
 * 
 */
package Y3853992.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import Y3853992.diagram.providers.Y3853992ElementTypes;
import Y3853992.diagram.providers.Y3853992ModelingAssistantProvider;

/**
 * @generated
 */
public class Y3853992ModelingAssistantProviderOfRequirementsModelEditPart extends Y3853992ModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(Y3853992ElementTypes.Requirement_2007);
		types.add(Y3853992ElementTypes.TestCase_2008);
		types.add(Y3853992ElementTypes.TeamMember_2009);
		return types;
	}

}
