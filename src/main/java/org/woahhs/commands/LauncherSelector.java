package org.woahhs.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.woahhs.gui.styles.BaseGUI;

public class LauncherSelector implements CommandExecutor {
    BaseGUI GUI = new BaseGUI();
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

            // checks the command the sender uses
            if(!cmd.getName().equalsIgnoreCase("launcher")){
                return true;
            }
            // checks if the sender is a player
            if(!(sender instanceof Player)){
                sender.sendMessage(ChatColor.RED + "You cannot execute this command!");
                return true;
            }
            //checks if the sender has permission or is op
            if(!sender.hasPermission("moblauncher.use") || !sender.isOp()){
                sender.sendMessage(ChatColor.RED + "You do not have permission to use this.");
                return true;
            }

            // opens launcher gui
            GUI.open((Player) sender);

        return false;
    }
}
