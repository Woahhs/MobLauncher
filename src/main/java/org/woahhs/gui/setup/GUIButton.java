package org.woahhs.gui.setup;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.function.Consumer;

public class GUIButton {
    private ItemStack itemStack;
    private Consumer<Player> whenClicked;

    public GUIButton(ItemStack itemStack){
        this.itemStack = itemStack;

    }
    public Consumer<Player> getWhenClicked() {
        return whenClicked;
    }
    public GUIButton setWhenClicked(Consumer<Player> whenClicked){
        this.whenClicked = whenClicked;
        return this;

    }

    public ItemStack getItemStack() {
        return itemStack;
    }
}
