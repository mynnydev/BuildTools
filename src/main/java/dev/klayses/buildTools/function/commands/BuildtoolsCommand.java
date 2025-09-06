package dev.klayses.buildTools.function.commands;

import dev.klayses.buildTools.BuildTools;
import dev.klayses.buildTools.function.gui.BuildtoolsGUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BuildtoolsCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(player.hasPermission(BuildTools.perm)) {
                BuildtoolsGUI.openGUI_BT(player);
            } else {
                player.sendMessage(BuildTools.NO_PERMISSION);
            }
        } else
            sender.sendMessage(BuildTools.NO_PLAYER);

        return false;
    }
}
