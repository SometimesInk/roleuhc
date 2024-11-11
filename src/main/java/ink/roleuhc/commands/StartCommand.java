package ink.roleuhc.commands;

import ink.roleuhc.Uhc;
import ink.roleuhc.role.Role;
import ink.roleuhc.roles.RoleHeretic;
import ink.roleuhc.roles.RoleKing;
import ink.roleuhc.roles.RolePeasant;
import ink.roleuhc.roles.RolePriest;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.*;

public class StartCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Give every player a role depending on the composition
        // TODO: Dynamic compositions
        final List<Role> composition = new ArrayList<Role>() {{
            new RolePeasant();
            new RoleHeretic();
            new RolePriest();
            new RoleKing();
        }};

        // Reset the roles map
        RoleUhc.roles = new HashMap<>();

        // As for each connected player
        for (Player p : Bukkit.getOnlinePlayers()) {
            // Select random role
            Role r = composition.get(new Random().nextInt(0, composition.size()));

            // Assign role to the player's UUID
            RoleUhc.roles.put(p.getUniqueId(), r);

            // Notify player
            p.sendMessage(r.getName());
            p.sendMessage(r.getDescription());
        }

        // TODO: Tp somewhere on map bounds, countdown

        return true;
    }
}
