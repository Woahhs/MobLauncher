package org.woahhs.gui.setup;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class GUIManager {
    private static GUIManager instance;
    private final Map<UUID, GUI> openGuis;

    public GUIManager() {
        this.openGuis = new HashMap<>();
    }

    public static GUIManager getInstance(){
        if(instance == null){
            instance = new GUIManager();
        }
        return instance;
    }
    public void registerGui(UUID toRegister, GUI gui){
        openGuis.put(toRegister, gui);
    }

    public void unregisterGui(UUID toUnRegister){
        openGuis.remove(toUnRegister);
    }

    public GUI matchMenu(UUID user){ return openGuis.get(user); }
}
