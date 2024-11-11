package ink.roleuhc.roles;

import ink.roleuhc.role.Role;
import ink.roleuhc.team.Teams;

public class RolePeasant extends Role {
    @Override
    public String getName() {
        return "Peasant";
    }

    @Override
    public String getDescription() {
        return "A simple being.";
    }

    @Override
    public Teams getTeam() {
        return Teams.KINGDOM;
    }
}
