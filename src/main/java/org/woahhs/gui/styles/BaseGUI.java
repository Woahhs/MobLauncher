package org.woahhs.gui.styles;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.woahhs.gui.setup.GUI;
import org.woahhs.gui.setup.GUIButton;

public class BaseGUI extends GUI {
    public BaseGUI() {
        super(ChatColor.AQUA + ChatColor.BOLD.toString() + "Launcher Selector", 4);

        setInventoryOpened(opened -> opened.sendMessage(ChatColor.GREEN + "You opened the inventory!"));
        setInventoryClosed(closed -> closed.sendMessage(ChatColor.RED + "You closed the inventory!"));


        registerButton( new GUIButton( new ItemStack(Material.CREEPER_SPAWN_EGG)).setWhenClicked(clicked ->{
            clicked.sendMessage(ChatColor.GOLD + "You selected the" + ChatColor.DARK_GREEN + ChatColor.BOLD.toString() + " Creeper " + ChatColor.GOLD + "Launcher!");
            if(clicked.getInventory().getItemInMainHand().getType() == null || clicked.getInventory().getItemInMainHand().getType() == Material.AIR){
                clicked.setItemInHand(new ItemStack(Material.CREEPER_SPAWN_EGG));
            }else
            clicked.getInventory().getItemInMainHand().setType(Material.CREEPER_SPAWN_EGG);
        }), 14);



    }
}
