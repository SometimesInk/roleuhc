package ink.roleuhc.roles;

import ink.roleuhc.role.PermanentEffectRole;
import ink.roleuhc.role.Role;
import ink.roleuhc.team.Teams;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.List;

public class RoleKing extends Role implements PermanentEffectRole {
    @Override
    public String getName() {
        return "King";
    }

    @Override
    public String getDescription() {
        return "Your people worship you and all know your name.";
    }

    @Override
    public Teams getTeam() {
        return Teams.KINGDOM;
    }

    @Override
    public List<PotionEffect> effects() {
        return new ArrayList<PotionEffect>() {{
            new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 20 * 60 * 60 * 24, 1, false);
            new PotionEffect(PotionEffectType.HEALTH_BOOST, 20 * 60 * 60 * 24, 2, false);
        }};
    }
}
