package dev.klayses.buildTools.function.gui;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BuildtoolsGUI {

    public static void openGUI_BT(Player player) {
        Inventory inv = Bukkit.createInventory(null, 3*9, ChatColor.WHITE + "Building Tools");

        // Placeholder
        ItemStack glass = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta meta = glass.getItemMeta();
        if (meta != null) {
            meta.setDisplayName(" ");
            glass.setItemMeta(meta);
        }

        for (int i = 0; i < inv.getSize(); i++) {
            inv.setItem(i, glass);
        }

        // Debug
        ItemStack debug_stick = new ItemStack(Material.DEBUG_STICK);
        ItemMeta debug_stick_meta = debug_stick.getItemMeta();
        debug_stick_meta.lore();
        debug_stick.setItemMeta(debug_stick_meta);
        inv.setItem(10, debug_stick);

        // Light
        ItemStack light = new ItemStack(Material.LIGHT);
        ItemMeta light_meta = light.getItemMeta();
        light.setItemMeta(light_meta);
        inv.setItem(12, light);

        // Barrier
        ItemStack barrier = new ItemStack(Material.BARRIER);
        ItemMeta barrier_meta = barrier.getItemMeta();
        barrier.setItemMeta(barrier_meta);
        inv.setItem(14, barrier);

        // Structure Void
        ItemStack structure_void = new ItemStack(Material.STRUCTURE_VOID);
        ItemMeta structure_viod_meta = structure_void.getItemMeta();
        structure_void.setItemMeta(structure_viod_meta);
        inv.setItem(16, structure_void);

        // Open GUI
        player.openInventory(inv);
    }
}
