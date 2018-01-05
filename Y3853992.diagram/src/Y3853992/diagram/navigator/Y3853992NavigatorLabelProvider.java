/*
* 
*/
package Y3853992.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import Y3853992.diagram.edit.parts.ConflictEditPart;
import Y3853992.diagram.edit.parts.RequirementDecompositionEditPart;
import Y3853992.diagram.edit.parts.RequirementDescriptionEditPart;
import Y3853992.diagram.edit.parts.RequirementDescriptionTypeEditPart;
import Y3853992.diagram.edit.parts.RequirementEditPart;
import Y3853992.diagram.edit.parts.RequirementIdentifierTypeEditPart;
import Y3853992.diagram.edit.parts.RequirementTypeEditPart;
import Y3853992.diagram.edit.parts.RequirementsModelEditPart;
import Y3853992.diagram.edit.parts.TeamMemberEditPart;
import Y3853992.diagram.edit.parts.TeamMemberNameEditPart;
import Y3853992.diagram.edit.parts.TeamMemberRequirementsEditPart;
import Y3853992.diagram.edit.parts.TestCaseDescriptionEditPart;
import Y3853992.diagram.edit.parts.TestCaseEditPart;
import Y3853992.diagram.edit.parts.TestCaseVerifiesEditPart;
import Y3853992.diagram.part.Y3853992DiagramEditorPlugin;
import Y3853992.diagram.part.Y3853992VisualIDRegistry;
import Y3853992.diagram.providers.Y3853992ElementTypes;
import Y3853992.diagram.providers.Y3853992ParserProvider;

/**
 * @generated
 */
public class Y3853992NavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		Y3853992DiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		Y3853992DiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof Y3853992NavigatorItem && !isOwnView(((Y3853992NavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof Y3853992NavigatorGroup) {
			Y3853992NavigatorGroup group = (Y3853992NavigatorGroup) element;
			return Y3853992DiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof Y3853992NavigatorItem) {
			Y3853992NavigatorItem navigatorItem = (Y3853992NavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (Y3853992VisualIDRegistry.getVisualID(view)) {
		case RequirementsModelEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://Y3853992?RequirementsModel", //$NON-NLS-1$
					Y3853992ElementTypes.RequirementsModel_1000);
		case RequirementEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://Y3853992?Requirement", //$NON-NLS-1$
					Y3853992ElementTypes.Requirement_2001);
		case TestCaseEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://Y3853992?TestCase", Y3853992ElementTypes.TestCase_2002); //$NON-NLS-1$
		case TeamMemberEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://Y3853992?TeamMember", Y3853992ElementTypes.TeamMember_2003); //$NON-NLS-1$
		case ConflictEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://Y3853992?Conflict", Y3853992ElementTypes.Conflict_4001); //$NON-NLS-1$
		case RequirementDecompositionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://Y3853992?Requirement?decomposition", //$NON-NLS-1$
					Y3853992ElementTypes.RequirementDecomposition_4002);
		case TestCaseVerifiesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://Y3853992?TestCase?verifies", //$NON-NLS-1$
					Y3853992ElementTypes.TestCaseVerifies_4003);
		case TeamMemberRequirementsEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://Y3853992?TeamMember?requirements", //$NON-NLS-1$
					Y3853992ElementTypes.TeamMemberRequirements_4004);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = Y3853992DiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && Y3853992ElementTypes.isKnownElementType(elementType)) {
			image = Y3853992ElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof Y3853992NavigatorGroup) {
			Y3853992NavigatorGroup group = (Y3853992NavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof Y3853992NavigatorItem) {
			Y3853992NavigatorItem navigatorItem = (Y3853992NavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (Y3853992VisualIDRegistry.getVisualID(view)) {
		case RequirementsModelEditPart.VISUAL_ID:
			return getRequirementsModel_1000Text(view);
		case RequirementEditPart.VISUAL_ID:
			return getRequirement_2001Text(view);
		case TestCaseEditPart.VISUAL_ID:
			return getTestCase_2002Text(view);
		case TeamMemberEditPart.VISUAL_ID:
			return getTeamMember_2003Text(view);
		case ConflictEditPart.VISUAL_ID:
			return getConflict_4001Text(view);
		case RequirementDecompositionEditPart.VISUAL_ID:
			return getRequirementDecomposition_4002Text(view);
		case TestCaseVerifiesEditPart.VISUAL_ID:
			return getTestCaseVerifies_4003Text(view);
		case TeamMemberRequirementsEditPart.VISUAL_ID:
			return getTeamMemberRequirements_4004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getRequirementsModel_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getRequirement_2001Text(View view) {
		IParser parser = Y3853992ParserProvider.getParser(Y3853992ElementTypes.Requirement_2001,
				view.getElement() != null ? view.getElement() : view,
				Y3853992VisualIDRegistry.getType(RequirementIdentifierTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Y3853992DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTestCase_2002Text(View view) {
		IParser parser = Y3853992ParserProvider.getParser(Y3853992ElementTypes.TestCase_2002,
				view.getElement() != null ? view.getElement() : view,
				Y3853992VisualIDRegistry.getType(TestCaseDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Y3853992DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTeamMember_2003Text(View view) {
		IParser parser = Y3853992ParserProvider.getParser(Y3853992ElementTypes.TeamMember_2003,
				view.getElement() != null ? view.getElement() : view,
				Y3853992VisualIDRegistry.getType(TeamMemberNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Y3853992DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConflict_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getRequirementDecomposition_4002Text(View view) {
		IParser parser = Y3853992ParserProvider.getParser(Y3853992ElementTypes.RequirementDecomposition_4002,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Y3853992DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTestCaseVerifies_4003Text(View view) {
		IParser parser = Y3853992ParserProvider.getParser(Y3853992ElementTypes.TestCaseVerifies_4003,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Y3853992DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTeamMemberRequirements_4004Text(View view) {
		IParser parser = Y3853992ParserProvider.getParser(Y3853992ElementTypes.TeamMemberRequirements_4004,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Y3853992DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return RequirementsModelEditPart.MODEL_ID.equals(Y3853992VisualIDRegistry.getModelID(view));
	}

}
