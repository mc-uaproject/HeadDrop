package me.rrs.util;

import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class ItemStack {
    public static void rename(org.bukkit.inventory.ItemStack itemStack, String name){
        ItemMeta m = itemStack.getItemMeta();
        if (m != null) {
            m.setDisplayName(name);
        }

        itemStack.setItemMeta(m);
    }
}
