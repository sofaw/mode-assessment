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
import Y3853992.diagram.edit.parts.RequirementDescriptionTypeEditPart;
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
	private IParser requirementDescriptionType_5007Parser;

	/**
	* @generated
	*/
	private IParser getRequirementDescriptionType_5007Parser() {
		if (requirementDescriptionType_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { Y3853992Package.eINSTANCE.getRequirement_Description(),
					Y3853992Package.eINSTANCE.getRequirement_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			requirementDescriptionType_5007Parser = parser;
		}
		return requirementDescriptionType_5007Parser;
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
			teamMemberName_5009Parser = parser;
		}
		return teamMemberName_5009Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case RequirementDescriptionTypeEditPart.VISUAL_ID:
			return getRequirementDescriptionType_5007Parser();
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
