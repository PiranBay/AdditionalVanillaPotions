package com.PiranBay.additionalvanillapotions;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtils;
import net.minecraft.potion.Potions;
import net.minecraftforge.common.brewing.IBrewingRecipe;

public class ModBrewingRecipes {

    public static class BadOmen implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.getItem() == Items.POTION && PotionUtils.getPotion(input) == Potions.AWKWARD;
        }

        @Override
        public boolean isIngredient(ItemStack ingredient) {
            String nbt = ingredient.getOrCreateTag().getAsString();
            if (nbt.equals(null)){return false;}
            return ingredient.getItem() == Items.WHITE_BANNER && ingredient.getTag().toString().equals(AdditionalVanillaPotions.OMINOUS_FLAG_NBT);
        }

        @Override
        public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
            return this.isInput(input) && this.isIngredient(ingredient)
                    ? PotionUtils.setPotion(new ItemStack(Items.POTION), ModPotions.BAD_OMEN.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class SplashBadOmen implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.equals(PotionUtils.setPotion(new ItemStack(Items.POTION), ModPotions.BAD_OMEN.get()));
        }

        @Override
        public boolean isIngredient(ItemStack ingredient) {
            String nbt = ingredient.getOrCreateTag().getAsString();
            if (nbt.equals(null)){return false;}
            return ingredient.getItem() == Items.GUNPOWDER;
        }

        @Override
        public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
            return this.isInput(input) && this.isIngredient(ingredient)
                    ? PotionUtils.setPotion(new ItemStack(Items.SPLASH_POTION),ModPotions.BAD_OMEN.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class SplashBadOmenFromAwkward implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.getItem() == Items.SPLASH_POTION && PotionUtils.getPotion(input) == Potions.AWKWARD;
        }

        @Override
        public boolean isIngredient(ItemStack ingredient) {
            String nbt = ingredient.getOrCreateTag().getAsString();
            if (nbt.equals(null)){return false;}
            return ingredient.getItem() == Items.WHITE_BANNER && ingredient.getTag().toString().equals(AdditionalVanillaPotions.OMINOUS_FLAG_NBT);
        }

        @Override
        public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
            return this.isInput(input) && this.isIngredient(ingredient)
                    ? PotionUtils.setPotion(new ItemStack(Items.SPLASH_POTION), ModPotions.BAD_OMEN.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class LingeringBadOmen implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.equals(PotionUtils.setPotion(new ItemStack(Items.POTION), ModPotions.BAD_OMEN.get()));
        }

        @Override
        public boolean isIngredient(ItemStack ingredient) {
            String nbt = ingredient.getOrCreateTag().getAsString();
            if (nbt.equals(null)){return false;}
            return ingredient.getItem() == Items.DRAGON_BREATH;
        }

        @Override
        public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
            return this.isInput(input) && this.isIngredient(ingredient)
                    ? PotionUtils.setPotion(new ItemStack(Items.LINGERING_POTION),ModPotions.BAD_OMEN.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class LingeringBadOmenFromAwkward implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.getItem() == Items.LINGERING_POTION && PotionUtils.getPotion(input) == Potions.AWKWARD;
        }

        @Override
        public boolean isIngredient(ItemStack ingredient) {
            String nbt = ingredient.getOrCreateTag().getAsString();
            if (nbt.equals(null)){return false;}
            return ingredient.getItem() == Items.WHITE_BANNER && ingredient.getTag().toString().equals(AdditionalVanillaPotions.OMINOUS_FLAG_NBT);
        }

        @Override
        public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
            return this.isInput(input) && this.isIngredient(ingredient)
                    ? PotionUtils.setPotion(new ItemStack(Items.LINGERING_POTION), ModPotions.BAD_OMEN.get())
                    : ItemStack.EMPTY;
        }
    }

}


