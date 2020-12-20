package com.ykrukovska.naukma.items;

import com.ykrukovska.naukma.NaukmaMod;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase(Properties properties) {
        super(new Item.Properties().group(NaukmaMod.TAB));
    }

    public static Item create() {
        return new Item(new Item.Properties().group(NaukmaMod.TAB));
    }
}
