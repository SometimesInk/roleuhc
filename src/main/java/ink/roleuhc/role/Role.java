package ink.roleuhc.role;

import ink.roleuhc.team.Teams;

public abstract class Role {
    public abstract String getName();
    public abstract String getDescription();
    public abstract Teams getTeam();
}