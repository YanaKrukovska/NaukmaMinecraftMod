package com.ykrukovska.naukma;

import com.ykrukovska.naukma.util.RegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("naukma")
public class NaukmaMod {

    public static final String MOD_ID = "naukma";

    public static final ItemGroup TAB = new ItemGroup("naukmaTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.LVIVSKE_CHRISTMAS_BEER.get());
        }
    };

    public NaukmaMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

}


