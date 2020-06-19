package ru.sanceilaks;


import org.bukkit.plugin.java.JavaPlugin;
import ru.sanceilaks.listeners.ArmorListener;
import ru.sanceilaks.listeners.DispenserArmorListener;
import ru.sanceilaks.listeners.ODAListener;

import java.util.ArrayList;
import java.util.List;

public class ODA extends JavaPlugin {
    private static ODA instance;
    public static ODA getInstance() {
        return instance;
    }


    @Override
    public void onEnable() {
        instance = this;
        List<String> bl = new ArrayList<String>();      //Armor block list
        getServer().getPluginManager().registerEvents(new ArmorListener(bl), this);
        getServer().getPluginManager().registerEvents(new ODAListener(), this);

        super.onEnable();
    }
}
