
/*
 * 
 */
package Y3853992.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import Y3853992.diagram.providers.Y3853992ElementTypes;

/**
 * @generated
 */
public class Y3853992PaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createRequirement1CreationTool());
		paletteContainer.add(createTeamMember2CreationTool());
		paletteContainer.add(createTestCase3CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createConflict1CreationTool());
		paletteContainer.add(createDecomposition2CreationTool());
		paletteContainer.add(createTeamMembers3CreationTool());
		paletteContainer.add(createVerifies4CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createRequirement1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Requirement1CreationTool_title,
				Messages.Requirement1CreationTool_desc,
				Collections.singletonList(Y3853992ElementTypes.Requirement_2007));
		entry.setId("createRequirement1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Y3853992ElementTypes.getImageDescriptor(Y3853992ElementTypes.Requirement_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTeamMember2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TeamMember2CreationTool_title,
				Messages.TeamMember2CreationTool_desc, Collections.singletonList(Y3853992ElementTypes.TeamMember_2009));
		entry.setId("createTeamMember2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Y3853992ElementTypes.getImageDescriptor(Y3853992ElementTypes.TeamMember_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTestCase3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TestCase3CreationTool_title,
				Messages.TestCase3CreationTool_desc, Collections.singletonList(Y3853992ElementTypes.TestCase_2008));
		entry.setId("createTestCase3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Y3853992ElementTypes.getImageDescriptor(Y3853992ElementTypes.TestCase_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createConflict1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Conflict1CreationTool_title,
				Messages.Conflict1CreationTool_desc, Collections.singletonList(Y3853992ElementTypes.Conflict_4008));
		entry.setId("createConflict1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Y3853992ElementTypes.getImageDescriptor(Y3853992ElementTypes.Conflict_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDecomposition2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Decomposition2CreationTool_title,
				Messages.Decomposition2CreationTool_desc,
				Collections.singletonList(Y3853992ElementTypes.RequirementDecomposition_4001));
		entry.setId("createDecomposition2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Y3853992ElementTypes.getImageDescriptor(Y3853992ElementTypes.RequirementDecomposition_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTeamMembers3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.TeamMembers3CreationTool_title,
				Messages.TeamMembers3CreationTool_desc,
				Collections.singletonList(Y3853992ElementTypes.RequirementTeamMembers_4005));
		entry.setId("createTeamMembers3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Y3853992ElementTypes.getImageDescriptor(Y3853992ElementTypes.RequirementTeamMembers_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createVerifies4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Verifies4CreationTool_title,
				Messages.Verifies4CreationTool_desc,
				Collections.singletonList(Y3853992ElementTypes.TestCaseVerifies_4004));
		entry.setId("createVerifies4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Y3853992ElementTypes.getImageDescriptor(Y3853992ElementTypes.TestCaseVerifies_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
