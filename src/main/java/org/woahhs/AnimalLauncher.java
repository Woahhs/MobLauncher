package org.woahhs;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.woahhs.commands.LauncherSelector;
import org.woahhs.gui.setup.GUIListener;

public class AnimalLauncher extends JavaPlugin {

    @Override
    public void onEnable() {
        registerEvents();
        registerCommands();

        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    private void registerEvents(){
        Bukkit.getPluginManager().registerEvents(new GUIListener(), this);
    }

    private void registerCommands(){ this.getCommand("launcher").setExecutor(new LauncherSelector());}
}
