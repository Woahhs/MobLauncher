package org.woahhs.gui.setup;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class GUIListener implements Listener {
    @EventHandler
    public void InventoryClick(InventoryClickEvent event) {
        GUI matchedMenu = GUIManager.getInstance().matchMenu(event.getWhoClicked().getUniqueId());

        if (matchedMenu != null) {
            // Menu found.
            matchedMenu.handleClick(event);
        }
    }
    @EventHandler
    public void InventoryClose(InventoryCloseEvent event) {
        GUI matchedMenu = GUIManager.getInstance().matchMenu(event.getPlayer().getUniqueId());

        if (matchedMenu != null) {
            // Menu found.
            matchedMenu.handleClose((Player) event.getPlayer());
        }

        // Unregister menu - it has been closed.
        GUIManager.getInstance().unregisterGui(event.getPlayer().getUniqueId());
    }

    @EventHandler
    public void PlayerQuit(PlayerQuitEvent event) {
        GUI matchedMenu = GUIManager.getInstance().matchMenu(event.getPlayer().getUniqueId());

        if (matchedMenu != null) {
            // Menu found.
            matchedMenu.handleClose(event.getPlayer());
        }

        // Unregister menu - the player has quit.
        GUIManager.getInstance().unregisterGui(event.getPlayer().getUniqueId());
    }
}
