/*
* 
*/
package Y3853992.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import Y3853992.diagram.part.Y3853992VisualIDRegistry;

/**
 * @generated
 */
public class Y3853992NavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4011;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 4010;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof Y3853992NavigatorItem) {
			Y3853992NavigatorItem item = (Y3853992NavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return Y3853992VisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
