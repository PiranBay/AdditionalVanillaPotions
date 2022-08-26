package com.PiranBay.additionalvanillapotions;

import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTION_TYPES, AdditionalVanillaPotions.MOD_ID);

    public static final RegistryObject<Potion> BAD_OMEN = POTIONS.register("bad_omen",
            ()-> new Potion("bad_omen", new EffectInstance(Effects.BAD_OMEN,120000,0)));

    public static final RegistryObject<Potion> GLOWING = POTIONS.register("glowing",
            ()-> new Potion("glowing", new EffectInstance(Effects.GLOWING,3600)));
    public static final RegistryObject<Potion> LONG_GLOWING = POTIONS.register("long_glowing",
            ()-> new Potion("glowing", new EffectInstance(Effects.GLOWING,9600)));

    public static final RegistryObject<Potion> WITHER = POTIONS.register("wither",
            ()-> new Potion("wither", new EffectInstance(Effects.WITHER,900,0)));
    public static final RegistryObject<Potion> LONG_WITHER = POTIONS.register("long_wither",
            ()-> new Potion("wither", new EffectInstance(Effects.WITHER,1800,0)));
    public static final RegistryObject<Potion> STRONG_WITHER = POTIONS.register("strong_wither",
            ()-> new Potion("wither", new EffectInstance(Effects.WITHER,440,1)));

}
