package ru.sanceilaks.listeners;

import com.mysql.jdbc.Util;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.dynmap.bukkit.DynmapPlugin;
import ru.sanceilaks.events.ArmorEquipEvent;
import ru.sanceilaks.types.ArmorType;
import ru.sanceilaks.utils.Utils;

public class ODAListener implements Listener {
    @EventHandler
    public void onEquipFullDiamond(ArmorEquipEvent e) {
            if (e.getNewArmorPiece().getType().equals(Material.DIAMOND_HELMET) || e.getNewArmorPiece().getType().equals(Material.DIAMOND_BOOTS) || e.getNewArmorPiece().getType().equals(Material.DIAMOND_CHESTPLATE) || e.getNewArmorPiece().getType().equals(Material.DIAMOND_LEGGINGS)) {
                if (e.getPlayer() != null) {
                    Player ply = e.getPlayer();
                    if (Utils.isInDiamond(ply)) {
                        DynmapPlugin.plugin.setPlayerVisiblity(ply, true);
                    }
                    else {
                        DynmapPlugin.plugin.setPlayerVisiblity(ply, false);
                    }
                }
            } else {
                DynmapPlugin.plugin.setPlayerVisiblity(e.getPlayer(), false);
            }
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        if (Utils.isInDiamond(e.getPlayer())) {
            DynmapPlugin.plugin.setPlayerVisiblity(e.getPlayer(), true);
        }
        else {
            DynmapPlugin.plugin.setPlayerVisiblity(e.getPlayer(), false);
        }
    }
}

