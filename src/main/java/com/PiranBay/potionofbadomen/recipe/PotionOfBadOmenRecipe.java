package com.PiranBay.potionofbadomen.recipe;

import com.PiranBay.potionofbadomen.PotionofBadOmen;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtils;
import net.minecraft.potion.Potions;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraftforge.common.brewing.IBrewingRecipe;

import java.util.Objects;

public class PotionOfBadOmenRecipe implements IBrewingRecipe {

    @Override
    public boolean isInput(ItemStack input) {
        return input.getItem() == Items.POTION && PotionUtils.getPotion(input) == Potions.AWKWARD;
    }

    @Override
    public boolean isIngredient(ItemStack ingredient) {
        String nbt = ingredient.getOrCreateTag().getAsString();
        if (nbt.equals(null)){return false;}
        return ingredient.getItem() == Items.WHITE_BANNER && ingredient.getTag().toString().equals(PotionofBadOmen.OMINOUS_FLAG_NBT);
    }

    @Override
    public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
        return this.isInput(input) && this.isIngredient(ingredient)
                ? PotionUtils.setPotion(new ItemStack(Items.POTION),PotionofBadOmen.POTION_OF_BAD_OMEN.get())
                : ItemStack.EMPTY;
    }
}
