package org.woahhs.launchers;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Launchers {


    public static ItemStack CreeperLauncher(){
        ItemStack item = new ItemStack(Material.CREEPER_SPAWN_EGG);
        String name = ChatColor.DARK_GREEN + ChatColor.BOLD.toString() + "Creeper " + ChatColor.GOLD + "Launcher";
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName(name);
        List<String> lore = new ArrayList<String>();

        lore.add("");
        lore.add(ChatColor.YELLOW + "Right-Click the launcher to launch");
        lore.add(ChatColor.YELLOW + "your selected mob!");
        lore.add("");
        lore.add(ChatColor.YELLOW + "Shift + Right-Click to select");
        lore.add(ChatColor.YELLOW + "your desired mob!");
        lore.add("");
        itemMeta.setLore(lore);
        item.setItemMeta(itemMeta);

        return item;
    }




}
