/*
 * 
 */
package Y3853992.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import Y3853992.diagram.edit.parts.RequirementsModelEditPart;
import Y3853992.diagram.edit.parts.Y3853992EditPartFactory;
import Y3853992.diagram.part.Y3853992VisualIDRegistry;

/**
 * @generated
 */
public class Y3853992EditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public Y3853992EditPartProvider() {
		super(new Y3853992EditPartFactory(), Y3853992VisualIDRegistry.TYPED_INSTANCE,
				RequirementsModelEditPart.MODEL_ID);
	}

}
