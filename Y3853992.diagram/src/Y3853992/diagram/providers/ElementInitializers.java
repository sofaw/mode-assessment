/*
 * 
 */
package Y3853992.diagram.providers;

import Y3853992.diagram.part.Y3853992DiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = Y3853992DiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			Y3853992DiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
