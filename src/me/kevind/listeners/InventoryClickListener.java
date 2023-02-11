package me.kevind.listeners;

import me.kevind.RtpMenu;
import me.kevind.utils.ItemList;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.util.Random;

public class InventoryClickListener implements Listener {
    @EventHandler
    public void onInvClick(InventoryClickEvent e) {
        if (e.getWhoClicked() instanceof Player) {
            Random random = new Random();
            if (e.getClickedInventory() == null) {
                return;
            }
            if (e.getCurrentItem() == null) {
                e.setCancelled(true);
                return;
            }
            if (e.getClickedInventory().equals(RtpMenu.getMenuRtpGUI())) {
                if (e.getCurrentItem().isSimilar(ItemList.rtp30)) {

                }
                if (e.getCurrentItem().isSimilar(ItemList.rtp60)) {

                }
                if (e.getCurrentItem().isSimilar(ItemList.rtp90)) {

                }
            }
        }
    }
}
