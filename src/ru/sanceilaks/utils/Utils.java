package ru.sanceilaks.utils;

import org.bukkit.Material;
import org.bukkit.entity.Player;

public class Utils {

    public static boolean isInDiamond(Player ply) {
        try {

            if (ply.getInventory().getChestplate().getType().equals(Material.DIAMOND_HELMET) || ply.getInventory().getChestplate().getType().equals(Material.DIAMOND_BOOTS) || ply.getInventory().getChestplate().getType().equals(Material.DIAMOND_CHESTPLATE) || ply.getInventory().getChestplate().getType().equals(Material.DIAMOND_LEGGINGS)) {
                return true;
            }
            return false;
        }
        catch (Exception e) {
            return false;
        }
    }
}
