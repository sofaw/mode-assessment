/*
 * 
 */
package Y3853992.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import Y3853992.diagram.edit.policies.RequirementConflictsItemSemanticEditPolicy;

/**
 * @generated
 */
public class RequirementConflictsEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4007;

	/**
	* @generated
	*/
	public RequirementConflictsEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new RequirementConflictsItemSemanticEditPolicy());
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/

	protected Connection createConnectionFigure() {
		return new RequirementConflictsFigure();
	}

	/**
	* @generated
	*/
	public RequirementConflictsFigure getPrimaryShape() {
		return (RequirementConflictsFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class RequirementConflictsFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public RequirementConflictsFigure() {
			this.setLineStyle(Graphics.LINE_DOT);
			this.setForegroundColor(THIS_FORE);

		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 255, 0, 0);

}
