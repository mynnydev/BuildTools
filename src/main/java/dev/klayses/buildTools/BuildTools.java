package dev.klayses.buildTools;

import dev.klayses.buildTools.function.commands.BuildtoolsCommand;
import dev.klayses.buildTools.function.listener.BuildtoolsListener;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class BuildTools extends JavaPlugin {

    public static final String PREFIX;
    public static final String NO_PLAYER;
    public static final String NO_PERMISSION;
    public static final Permission perm;

    @Override
    public void onEnable() {
        this.getCommand("buildtools").setExecutor(new BuildtoolsCommand());

        PluginManager pluginmanager = Bukkit.getPluginManager();
        pluginmanager.registerEvents(new BuildtoolsListener(), this);

    }

    @Override
    public void onDisable() {
    }

    static {
        // Strings
        PREFIX = ChatColor.WHITE + "[" + ChatColor.of("#a503fc") + "BT" + ChatColor.WHITE + "] ";
        NO_PLAYER = ChatColor.RED + "This command can only be executed by the player!";
        NO_PERMISSION = ChatColor.RED + "You do not have permission to execute this command!";

        // Permissions
        perm = new Permission("bt.use");
    }
}
