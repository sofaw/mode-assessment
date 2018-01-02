/*
 * 
 */
package Y3853992.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import Y3853992.Y3853992Package;
import Y3853992.diagram.edit.parts.ConflictEditPart;
import Y3853992.diagram.edit.parts.RequirementDecompositionEditPart;
import Y3853992.diagram.edit.parts.RequirementEditPart;
import Y3853992.diagram.edit.parts.RequirementsModelEditPart;
import Y3853992.diagram.edit.parts.TeamMemberEditPart;
import Y3853992.diagram.edit.parts.TeamMemberRequirementsEditPart;
import Y3853992.diagram.edit.parts.TestCaseEditPart;
import Y3853992.diagram.edit.parts.TestCaseVerifiesEditPart;
import Y3853992.diagram.part.Y3853992DiagramEditorPlugin;

/**
 * @generated
 */
public class Y3853992ElementTypes {

	/**
	* @generated
	*/
	private Y3853992ElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			Y3853992DiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType RequirementsModel_1000 = getElementType("Y3853992.diagram.RequirementsModel_1000"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Requirement_2007 = getElementType("Y3853992.diagram.Requirement_2007"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType TestCase_2008 = getElementType("Y3853992.diagram.TestCase_2008"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType TeamMember_2009 = getElementType("Y3853992.diagram.TeamMember_2009"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Conflict_4008 = getElementType("Y3853992.diagram.Conflict_4008"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType RequirementDecomposition_4001 = getElementType(
			"Y3853992.diagram.RequirementDecomposition_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TestCaseVerifies_4004 = getElementType("Y3853992.diagram.TestCaseVerifies_4004"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType TeamMemberRequirements_4009 = getElementType(
			"Y3853992.diagram.TeamMemberRequirements_4009"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(RequirementsModel_1000, Y3853992Package.eINSTANCE.getRequirementsModel());

			elements.put(Requirement_2007, Y3853992Package.eINSTANCE.getRequirement());

			elements.put(TestCase_2008, Y3853992Package.eINSTANCE.getTestCase());

			elements.put(TeamMember_2009, Y3853992Package.eINSTANCE.getTeamMember());

			elements.put(Conflict_4008, Y3853992Package.eINSTANCE.getConflict());

			elements.put(RequirementDecomposition_4001, Y3853992Package.eINSTANCE.getRequirement_Decomposition());

			elements.put(TestCaseVerifies_4004, Y3853992Package.eINSTANCE.getTestCase_Verifies());

			elements.put(TeamMemberRequirements_4009, Y3853992Package.eINSTANCE.getTeamMember_Requirements());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(RequirementsModel_1000);
			KNOWN_ELEMENT_TYPES.add(Requirement_2007);
			KNOWN_ELEMENT_TYPES.add(TestCase_2008);
			KNOWN_ELEMENT_TYPES.add(TeamMember_2009);
			KNOWN_ELEMENT_TYPES.add(Conflict_4008);
			KNOWN_ELEMENT_TYPES.add(RequirementDecomposition_4001);
			KNOWN_ELEMENT_TYPES.add(TestCaseVerifies_4004);
			KNOWN_ELEMENT_TYPES.add(TeamMemberRequirements_4009);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case RequirementsModelEditPart.VISUAL_ID:
			return RequirementsModel_1000;
		case RequirementEditPart.VISUAL_ID:
			return Requirement_2007;
		case TestCaseEditPart.VISUAL_ID:
			return TestCase_2008;
		case TeamMemberEditPart.VISUAL_ID:
			return TeamMember_2009;
		case ConflictEditPart.VISUAL_ID:
			return Conflict_4008;
		case RequirementDecompositionEditPart.VISUAL_ID:
			return RequirementDecomposition_4001;
		case TestCaseVerifiesEditPart.VISUAL_ID:
			return TestCaseVerifies_4004;
		case TeamMemberRequirementsEditPart.VISUAL_ID:
			return TeamMemberRequirements_4009;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return Y3853992.diagram.providers.Y3853992ElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return Y3853992.diagram.providers.Y3853992ElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return Y3853992.diagram.providers.Y3853992ElementTypes.getElement(elementTypeAdapter);
		}
	};

}
