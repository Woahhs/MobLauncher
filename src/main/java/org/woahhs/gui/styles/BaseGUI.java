package org.woahhs.gui.styles;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.woahhs.gui.setup.GUI;
import org.woahhs.gui.setup.GUIButton;
import org.woahhs.launchers.Launchers;

public class BaseGUI extends GUI {
    public BaseGUI() {
        super(ChatColor.AQUA + ChatColor.BOLD.toString() + "Launcher Selector", 4);
        new Launchers();

        setInventoryOpened(opened -> opened.sendMessage(ChatColor.GREEN + "You opened the inventory!"));
        setInventoryClosed(closed -> closed.sendMessage(ChatColor.RED + "You closed the inventory!"));

        for(int i = 0; i < 4*9; i++ ){
            registerButton( new GUIButton(new ItemStack(Material.RED_STAINED_GLASS_PANE)), i);
        }

        registerButton( new GUIButton(Launchers.createLauncher(EntityType.CREEPER, ChatColor.DARK_GREEN + ChatColor.BOLD.toString() + "Creeper " + ChatColor.GOLD + "Launcher")).setWhenClicked(clicked ->{
            clicked.sendMessage(ChatColor.GOLD + "You selected the" + ChatColor.DARK_GREEN + ChatColor.BOLD.toString() + "  Creeper " + ChatColor.GOLD + "Launcher!");
            if(clicked.getInventory().getItemInMainHand().getType() == null || clicked.getInventory().getItemInMainHand().getType() == Material.AIR){
                clicked.setItemInHand(Launchers.createLauncher(EntityType.CREEPER,ChatColor.DARK_GREEN + ChatColor.BOLD.toString() + "Creeper " + ChatColor.GOLD + "Launcher"));
            }else {
                clicked.setItemInHand(Launchers.createLauncher(EntityType.CREEPER,ChatColor.DARK_GREEN + ChatColor.BOLD.toString() + "Creeper " + ChatColor.GOLD + "Launcher"));
            }
        }), 14);



    }
}
