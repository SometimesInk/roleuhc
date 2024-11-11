package ink.roleuhc.roles;

import ink.roleuhc.role.Role;
import ink.roleuhc.team.Teams;

public class RolePriest extends Role {
    @Override
    public String getName() {
        return "Priest";
    }

    @Override
    public String getDescription() {
        return "God be with you on your travels.";
    }

    @Override
    public Teams getTeam() {
        return Teams.DIVINE;
    }
}
