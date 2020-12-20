package com.ykrukovska.naukma.items;

import com.ykrukovska.naukma.NaukmaMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class LvivskeChristmasBeer extends Item {

    public LvivskeChristmasBeer() {
        super(new Item.Properties()
                .group(NaukmaMod.TAB)
                .food(new Food.Builder()
                        .hunger(10)
                        .saturation(1.2f)
                        .effect(() -> new EffectInstance(Effects.GLOWING, 600, 1), 1)
                        .effect(() -> new EffectInstance(Effects.STRENGTH, 600, 1), 1)
                        .setAlwaysEdible()
                        .build())

        );
    }
}
