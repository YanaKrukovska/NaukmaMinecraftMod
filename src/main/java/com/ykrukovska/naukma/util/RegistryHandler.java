package com.ykrukovska.naukma.util;

import com.ykrukovska.naukma.NaukmaMod;
import com.ykrukovska.naukma.items.LvivskeChristmasBeer;
import com.ykrukovska.naukma.items.TeterivCherryBeer;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NaukmaMod.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<LvivskeChristmasBeer> LVIVSKE_CHRISTMAS_BEER = ITEMS.register("lvivske_rizdviane", LvivskeChristmasBeer::new);
    public static final RegistryObject<TeterivCherryBeer> TETERIV_CHERRY_BEER = ITEMS.register("teteriv_cherry", TeterivCherryBeer::new);

}
