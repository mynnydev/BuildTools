package dev.klayses.buildTools.function.listener;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BuildtoolsListener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        Inventory inv = event.getInventory();
        Player player = (Player) event.getWhoClicked();
        if (event.getView().getTitle().equals(ChatColor.WHITE + "Building Tools")) {
            int slot = event.getRawSlot();
            if (slot < event.getInventory().getSize()) {
                event.setCancelled(true);

                // Debug
                if (slot == 10) {
                    ItemStack debug_stick = new ItemStack(Material.DEBUG_STICK);
                    ItemMeta debug_stick_meta = debug_stick.getItemMeta();
                    debug_stick.setItemMeta(debug_stick_meta);

                    player.closeInventory();
                    player.getInventory().addItem(debug_stick);
                }

                // Light
                if (slot == 12) {
                    ItemStack light = new ItemStack(Material.LIGHT);
                    ItemMeta light_meta = light.getItemMeta();
                    light.setItemMeta(light_meta);

                    player.closeInventory();
                    player.getInventory().addItem(light);
                }

                // Barrier
                if (slot == 14) {
                    ItemStack barrier = new ItemStack(Material.BARRIER);
                    ItemMeta barrier_meta = barrier.getItemMeta();
                    barrier.setItemMeta(barrier_meta);

                    player.closeInventory();
                    player.getInventory().addItem(barrier);
                }

                // Structure Void
                if (slot == 16) {
                    ItemStack structure_void = new ItemStack(Material.STRUCTURE_VOID);
                    ItemMeta structure_viod_meta = structure_void.getItemMeta();
                    structure_void.setItemMeta(structure_viod_meta);

                    player.closeInventory();
                    player.getInventory().addItem(structure_void);
                }
            }
        }
    }
}
