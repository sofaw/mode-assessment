/*
 * 
 */
package Y3853992.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import Y3853992.Y3853992Package;
import Y3853992.diagram.edit.parts.RequirementDescriptionEditPart;
import Y3853992.diagram.edit.parts.RequirementIdentifierTypeEditPart;
import Y3853992.diagram.edit.parts.RequirementProgressEditPart;
import Y3853992.diagram.edit.parts.TeamMemberNameEditPart;
import Y3853992.diagram.edit.parts.TestCaseDescriptionEditPart;
import Y3853992.diagram.parsers.MessageFormatParser;
import Y3853992.diagram.part.Y3853992VisualIDRegistry;

/**
 * @generated
 */
public class Y3853992ParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser requirementIdentifierType_5001Parser;

	/**
	* @generated
	*/
	private IParser getRequirementIdentifierType_5001Parser() {
		if (requirementIdentifierType_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { Y3853992Package.eINSTANCE.getRequirement_Identifier(),
					Y3853992Package.eINSTANCE.getRequirement_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{1} requirement {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{1} requirement {0}"); //$NON-NLS-1$
			parser.setEditPattern("{1} requirement {0}"); //$NON-NLS-1$
			requirementIdentifierType_5001Parser = parser;
		}
		return requirementIdentifierType_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser requirementDescription_5002Parser;

	/**
	* @generated
	*/
	private IParser getRequirementDescription_5002Parser() {
		if (requirementDescription_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { Y3853992Package.eINSTANCE.getRequirement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Description: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Description: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Description: {0}"); //$NON-NLS-1$
			requirementDescription_5002Parser = parser;
		}
		return requirementDescription_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser requirementProgress_5003Parser;

	/**
	* @generated
	*/
	private IParser getRequirementProgress_5003Parser() {
		if (requirementProgress_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { Y3853992Package.eINSTANCE.getRequirement_Progress() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Progress: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Progress: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Progress: {0}"); //$NON-NLS-1$
			requirementProgress_5003Parser = parser;
		}
		return requirementProgress_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser testCaseDescription_5004Parser;

	/**
	* @generated
	*/
	private IParser getTestCaseDescription_5004Parser() {
		if (testCaseDescription_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { Y3853992Package.eINSTANCE.getTestCase_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Test case: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Test case: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Test case: {0}"); //$NON-NLS-1$
			testCaseDescription_5004Parser = parser;
		}
		return testCaseDescription_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser teamMemberName_5005Parser;

	/**
	* @generated
	*/
	private IParser getTeamMemberName_5005Parser() {
		if (teamMemberName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { Y3853992Package.eINSTANCE.getTeamMember_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Team member: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Team member: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Team member: {0}"); //$NON-NLS-1$
			teamMemberName_5005Parser = parser;
		}
		return teamMemberName_5005Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case RequirementIdentifierTypeEditPart.VISUAL_ID:
			return getRequirementIdentifierType_5001Parser();
		case RequirementDescriptionEditPart.VISUAL_ID:
			return getRequirementDescription_5002Parser();
		case RequirementProgressEditPart.VISUAL_ID:
			return getRequirementProgress_5003Parser();
		case TestCaseDescriptionEditPart.VISUAL_ID:
			return getTestCaseDescription_5004Parser();
		case TeamMemberNameEditPart.VISUAL_ID:
			return getTeamMemberName_5005Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(Y3853992VisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(Y3853992VisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (Y3853992ElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
