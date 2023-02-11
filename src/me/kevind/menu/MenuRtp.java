package me.kevind.menu;

import me.kevind.utils.ItemList;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public final class MenuRtp {
    private final Inventory inv;
    public MenuRtp() {
        inv = Bukkit.createInventory(null, 27, "RTP");
        inv.setItem(10, ItemList.rtp30);
        inv.setItem(12, ItemList.rtp60);
        inv.setItem(14, ItemList.rtp90);

    }
    public Inventory getInv() {
        return inv;
    }
}
