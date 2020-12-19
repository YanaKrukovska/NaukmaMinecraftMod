package com.ykrukovska.naukma.util;

import com.ykrukovska.naukma.NaukmaMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NaukmaMod.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> LVIVSKE_CHRISTMAS_BEER = ITEMS.register("lvivske_rizdviane", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

}
