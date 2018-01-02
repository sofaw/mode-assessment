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

import org.eclipse.gmf.tooling.runtime.parsers.EnumParser;
import Y3853992.Y3853992Package;
import Y3853992.diagram.edit.parts.RequirementDescription2EditPart;
import Y3853992.diagram.edit.parts.RequirementDescriptionEditPart;
import Y3853992.diagram.edit.parts.RequirementDescriptionTypeEditPart;
import Y3853992.diagram.edit.parts.RequirementIdentifierEditPart;
import Y3853992.diagram.edit.parts.RequirementIdentifierTypeEditPart;
import Y3853992.diagram.edit.parts.RequirementProgressEditPart;
import Y3853992.diagram.edit.parts.RequirementTypeEditPart;
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
	private IParser requirementIdentifierType_5007Parser;

	/**
	* @generated
	*/
	private IParser getRequirementIdentifierType_5007Parser() {
		if (requirementIdentifierType_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { Y3853992Package.eINSTANCE.getRequirement_Identifier(),
					Y3853992Package.eINSTANCE.getRequirement_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{1} requirement {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{1} requirement {0}"); //$NON-NLS-1$
			parser.setEditPattern("{1} requirement {0}"); //$NON-NLS-1$
			requirementIdentifierType_5007Parser = parser;
		}
		return requirementIdentifierType_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser requirementDescription_5010Parser;

	/**
	* @generated
	*/
	private IParser getRequirementDescription_5010Parser() {
		if (requirementDescription_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { Y3853992Package.eINSTANCE.getRequirement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Description: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Description: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Description: {0}"); //$NON-NLS-1$
			requirementDescription_5010Parser = parser;
		}
		return requirementDescription_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser requirementProgress_5011Parser;

	/**
	* @generated
	*/
	private IParser getRequirementProgress_5011Parser() {
		if (requirementProgress_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { Y3853992Package.eINSTANCE.getRequirement_Progress() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Progress: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Progress: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Progress: {0}"); //$NON-NLS-1$
			requirementProgress_5011Parser = parser;
		}
		return requirementProgress_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser testCaseDescription_5008Parser;

	/**
	* @generated
	*/
	private IParser getTestCaseDescription_5008Parser() {
		if (testCaseDescription_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { Y3853992Package.eINSTANCE.getTestCase_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Test case: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Test case: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Test case: {0}"); //$NON-NLS-1$
			testCaseDescription_5008Parser = parser;
		}
		return testCaseDescription_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser teamMemberName_5009Parser;

	/**
	* @generated
	*/
	private IParser getTeamMemberName_5009Parser() {
		if (teamMemberName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { Y3853992Package.eINSTANCE.getTeamMember_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Team member: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Team member: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Team member: {0}"); //$NON-NLS-1$
			teamMemberName_5009Parser = parser;
		}
		return teamMemberName_5009Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case RequirementIdentifierTypeEditPart.VISUAL_ID:
			return getRequirementIdentifierType_5007Parser();
		case RequirementDescriptionEditPart.VISUAL_ID:
			return getRequirementDescription_5010Parser();
		case RequirementProgressEditPart.VISUAL_ID:
			return getRequirementProgress_5011Parser();
		case TestCaseDescriptionEditPart.VISUAL_ID:
			return getTestCaseDescription_5008Parser();
		case TeamMemberNameEditPart.VISUAL_ID:
			return getTeamMemberName_5009Parser();
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
