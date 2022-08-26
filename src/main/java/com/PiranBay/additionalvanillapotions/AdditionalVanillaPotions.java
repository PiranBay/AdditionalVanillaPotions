package com.PiranBay.additionalvanillapotions;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("additionalvanillapotions")
public class AdditionalVanillaPotions
{
    public static final String MOD_ID = "additionalvanillapotions";
    public static final String OMINOUS_FLAG_NBT = "{HideFlags:32,BlockEntityTag:{Patterns:[{Pattern:\"mr\",Color:9},{Pattern:\"bs\",Color:8},{Pattern:\"cs\",Color:7},{Pattern:\"bo\",Color:8},{Pattern:\"ms\",Color:15},{Pattern:\"hh\",Color:8},{Pattern:\"mc\",Color:8},{Pattern:\"bo\",Color:15}]},display:{Name:'{\"color\":\"gold\",\"translate\":\"block.minecraft.ominous_banner\"}'}}";
    private static final Logger LOGGER = LogManager.getLogger();

    public AdditionalVanillaPotions() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        ModPotions.POTIONS.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event){
        LOGGER.info("Drink some potions of bad omen and enjoy raids!");

        event.enqueueWork(()->{
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.BadOmen());
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.SplashBadOmen());
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.SplashBadOmenFromAwkward());
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.LingeringBadOmen());
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.LingeringBadOmenFromAwkward());

            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.Glowing());
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.SplashGlowing());
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.SplashGlowingFromAwkward());
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.LingeringGlowing());
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.LingeringGlowingFromAwkward());

            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.LongGlowing());
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.SplashLongGlowing());
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.SplashLongGlowingFromShort());
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.LingeringLongGlowing());
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.LingeringLongGlowingFromShort());
            
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.Wither());
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.SplashWither());
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.SplashWitherFromAwkward());
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.LingeringWither());
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.LingeringWitherFromAwkward());

            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.LongWither());
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.SplashLongWither());
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.SplashLongWitherFromShort());
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.LingeringLongWither());
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.LingeringLongWitherFromShort());

            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.StrongWither());
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.SplashStrongWither());
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.SplashStrongWitherFromWeak());
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.LingeringStrongWither());
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.LingeringStrongWitherFromWeak());

            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.Luck());
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.SplashLuck());
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.SplashLuckFromAwkward());
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.LingeringLuck());
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipes.LingeringLuckFromAwkward());

        });
    }
}
