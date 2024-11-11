package ink.roleuhc;

import ink.roleuhc.commands.StartCommand;
import ink.roleuhc.role.Role;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class RoleUhc extends JavaPlugin {
    public static Map<UUID, Role> roles = new HashMap<>();

    @Override
    public void onEnable() {

        // Register commands
        this.getCommand("start").setExecutor(new StartCommand());

    }
}
