package ink.roleuhc.roles;

import ink.roleuhc.role.Role;
import ink.roleuhc.team.Teams;

public class RoleHeretic extends Role {
    @Override
    public String getName() {
        return "Heretic";
    }

    @Override
    public String getDescription() {
        return "Believer of atheism.";
    }

    @Override
    public Teams getTeam() {
        return Teams.UNDERDARK;
    }
}
