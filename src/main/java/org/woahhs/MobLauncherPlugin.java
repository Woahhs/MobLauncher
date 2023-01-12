package org.woahhs;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.woahhs.commands.LauncherSelector;
import org.woahhs.gui.setup.GUIListener;

import javax.security.auth.login.LoginException;

public class MobLauncherPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        registerEvents();
        registerCommands();

    }

    @Override
    public void onDisable() {

    }

    private void registerEvents(){
        Bukkit.getPluginManager().registerEvents(new GUIListener(), this);
    }

    private void registerCommands(){ this.getCommand("launcher").setExecutor(new LauncherSelector());}
}
