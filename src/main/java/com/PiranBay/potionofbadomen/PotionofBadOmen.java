package com.PiranBay.potionofbadomen;

import com.PiranBay.potionofbadomen.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.potion.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("potionofbadomen")
public class PotionofBadOmen
{
    public static final String MOD_ID = "potionofbadomen";
    public static final String OMINOUS_FLAG_NBT = "{HideFlags:32,BlockEntityTag:{Patterns:[{Pattern:\"mr\",Color:9},{Pattern:\"bs\",Color:8},{Pattern:\"cs\",Color:7},{Pattern:\"bo\",Color:8},{Pattern:\"ms\",Color:15},{Pattern:\"hh\",Color:8},{Pattern:\"mc\",Color:8},{Pattern:\"bo\",Color:15}]},display:{Name:'{\"color\":\"gold\",\"translate\":\"block.minecraft.ominous_banner\"}'}}";
    private static final Logger LOGGER = LogManager.getLogger();

    public PotionofBadOmen() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        POTIONS.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event){
        LOGGER.info("Drink some potions of bad omen and enjoy raids!");

        ItemStack OMINOUS_BANNER = new ItemStack(Items.WHITE_BANNER);
        event.enqueueWork(()->{
            BrewingRecipeRegistry.addRecipe(new PotionOfBadOmenRecipe());
            BrewingRecipeRegistry.addRecipe(new SplashPotionOfBadOmenRecipe());
            BrewingRecipeRegistry.addRecipe(new SplashPotionOfBadOmenRecipeFromAwkward());
            BrewingRecipeRegistry.addRecipe(new LingeringPotionOfBadOmenRecipe());
            BrewingRecipeRegistry.addRecipe(new LingeringPotionOfBadOmenRecipeFromAwkward());

        });

    }

    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTION_TYPES, PotionofBadOmen.MOD_ID);

    public static final RegistryObject<Potion> POTION_OF_BAD_OMEN = POTIONS.register("bad_omen",
            ()-> new Potion("bad_omen", new EffectInstance(Effects.BAD_OMEN,120000,0)));


}
