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

    public static class Glowing implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.getItem() == Items.POTION && PotionUtils.getPotion(input) == Potions.AWKWARD;
        }

        @Override
        public boolean isIngredient(ItemStack ingredient) {
            String nbt = ingredient.getOrCreateTag().getAsString();
            if (nbt.equals(null)){return false;}
            return ingredient.getItem() == Items.SEA_PICKLE;
        }

        @Override
        public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
            return this.isInput(input) && this.isIngredient(ingredient)
                    ? PotionUtils.setPotion(new ItemStack(Items.POTION), ModPotions.GLOWING.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class SplashGlowing implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.equals(PotionUtils.setPotion(new ItemStack(Items.POTION), ModPotions.GLOWING.get()));
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
                    ? PotionUtils.setPotion(new ItemStack(Items.SPLASH_POTION),ModPotions.GLOWING.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class SplashGlowingFromAwkward implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.getItem() == Items.SPLASH_POTION && PotionUtils.getPotion(input) == Potions.AWKWARD;
        }

        @Override
        public boolean isIngredient(ItemStack ingredient) {
            String nbt = ingredient.getOrCreateTag().getAsString();
            if (nbt.equals(null)){return false;}
            return ingredient.getItem() == Items.SEA_PICKLE;
        }

        @Override
        public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
            return this.isInput(input) && this.isIngredient(ingredient)
                    ? PotionUtils.setPotion(new ItemStack(Items.SPLASH_POTION), ModPotions.GLOWING.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class LingeringGlowing implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.equals(PotionUtils.setPotion(new ItemStack(Items.POTION), ModPotions.GLOWING.get()));
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
                    ? PotionUtils.setPotion(new ItemStack(Items.LINGERING_POTION),ModPotions.GLOWING.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class LingeringGlowingFromAwkward implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.getItem() == Items.LINGERING_POTION && PotionUtils.getPotion(input) == Potions.AWKWARD;
        }

        @Override
        public boolean isIngredient(ItemStack ingredient) {
            String nbt = ingredient.getOrCreateTag().getAsString();
            if (nbt.equals(null)){return false;}
            return ingredient.getItem() == Items.SEA_PICKLE;
        }

        @Override
        public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
            return this.isInput(input) && this.isIngredient(ingredient)
                    ? PotionUtils.setPotion(new ItemStack(Items.LINGERING_POTION), ModPotions.GLOWING.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class LongGlowing implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.equals(PotionUtils.setPotion(new ItemStack(Items.POTION), ModPotions.GLOWING.get()));
        }

        @Override
        public boolean isIngredient(ItemStack ingredient) {
            String nbt = ingredient.getOrCreateTag().getAsString();
            if (nbt.equals(null)){return false;}
            return ingredient.getItem() == Items.REDSTONE;
        }

        @Override
        public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
            return this.isInput(input) && this.isIngredient(ingredient)
                    ? PotionUtils.setPotion(new ItemStack(Items.POTION), ModPotions.LONG_GLOWING.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class SplashLongGlowing implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.equals(PotionUtils.setPotion(new ItemStack(Items.POTION), ModPotions.LONG_GLOWING.get()));
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
                    ? PotionUtils.setPotion(new ItemStack(Items.SPLASH_POTION),ModPotions.LONG_GLOWING.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class SplashLongGlowingFromShort implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.equals(PotionUtils.setPotion(new ItemStack(Items.SPLASH_POTION), ModPotions.GLOWING.get()));
        }

        @Override
        public boolean isIngredient(ItemStack ingredient) {
            String nbt = ingredient.getOrCreateTag().getAsString();
            if (nbt.equals(null)){return false;}
            return ingredient.getItem() == Items.REDSTONE;
        }

        @Override
        public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
            return this.isInput(input) && this.isIngredient(ingredient)
                    ? PotionUtils.setPotion(new ItemStack(Items.SPLASH_POTION), ModPotions.LONG_GLOWING.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class LingeringLongGlowing implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.equals(PotionUtils.setPotion(new ItemStack(Items.POTION), ModPotions.LONG_GLOWING.get()));
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
                    ? PotionUtils.setPotion(new ItemStack(Items.LINGERING_POTION),ModPotions.LONG_GLOWING.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class LingeringLongGlowingFromShort implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.equals(PotionUtils.setPotion(new ItemStack(Items.LINGERING_POTION), ModPotions.GLOWING.get()));
        }

        @Override
        public boolean isIngredient(ItemStack ingredient) {
            String nbt = ingredient.getOrCreateTag().getAsString();
            if (nbt.equals(null)){return false;}
            return ingredient.getItem() == Items.REDSTONE;
        }

        @Override
        public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
            return this.isInput(input) && this.isIngredient(ingredient)
                    ? PotionUtils.setPotion(new ItemStack(Items.LINGERING_POTION), ModPotions.LONG_GLOWING.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class Wither implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.getItem() == Items.POTION && PotionUtils.getPotion(input) == Potions.AWKWARD;
        }

        @Override
        public boolean isIngredient(ItemStack ingredient) {
            String nbt = ingredient.getOrCreateTag().getAsString();
            if (nbt.equals(null)){return false;}
            return ingredient.getItem() == Items.WITHER_ROSE;
        }

        @Override
        public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
            return this.isInput(input) && this.isIngredient(ingredient)
                    ? PotionUtils.setPotion(new ItemStack(Items.POTION), ModPotions.WITHER.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class SplashWither implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.equals(PotionUtils.setPotion(new ItemStack(Items.POTION), ModPotions.WITHER.get()));
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
                    ? PotionUtils.setPotion(new ItemStack(Items.SPLASH_POTION),ModPotions.WITHER.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class SplashWitherFromAwkward implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.getItem() == Items.SPLASH_POTION && PotionUtils.getPotion(input) == Potions.AWKWARD;
        }

        @Override
        public boolean isIngredient(ItemStack ingredient) {
            String nbt = ingredient.getOrCreateTag().getAsString();
            if (nbt.equals(null)){return false;}
            return ingredient.getItem() == Items.WITHER_ROSE;
        }

        @Override
        public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
            return this.isInput(input) && this.isIngredient(ingredient)
                    ? PotionUtils.setPotion(new ItemStack(Items.SPLASH_POTION), ModPotions.WITHER.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class LingeringWither implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.equals(PotionUtils.setPotion(new ItemStack(Items.POTION), ModPotions.WITHER.get()));
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
                    ? PotionUtils.setPotion(new ItemStack(Items.LINGERING_POTION),ModPotions.WITHER.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class LingeringWitherFromAwkward implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.getItem() == Items.LINGERING_POTION && PotionUtils.getPotion(input) == Potions.AWKWARD;
        }

        @Override
        public boolean isIngredient(ItemStack ingredient) {
            String nbt = ingredient.getOrCreateTag().getAsString();
            if (nbt.equals(null)){return false;}
            return ingredient.getItem() == Items.WITHER_ROSE;
        }

        @Override
        public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
            return this.isInput(input) && this.isIngredient(ingredient)
                    ? PotionUtils.setPotion(new ItemStack(Items.LINGERING_POTION), ModPotions.WITHER.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class LongWither implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.equals(PotionUtils.setPotion(new ItemStack(Items.POTION), ModPotions.WITHER.get()));
        }

        @Override
        public boolean isIngredient(ItemStack ingredient) {
            String nbt = ingredient.getOrCreateTag().getAsString();
            if (nbt.equals(null)){return false;}
            return ingredient.getItem() == Items.REDSTONE;
        }

        @Override
        public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
            return this.isInput(input) && this.isIngredient(ingredient)
                    ? PotionUtils.setPotion(new ItemStack(Items.POTION), ModPotions.LONG_WITHER.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class SplashLongWither implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.equals(PotionUtils.setPotion(new ItemStack(Items.POTION), ModPotions.LONG_WITHER.get()));
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
                    ? PotionUtils.setPotion(new ItemStack(Items.SPLASH_POTION),ModPotions.LONG_WITHER.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class SplashLongWitherFromShort implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.equals(PotionUtils.setPotion(new ItemStack(Items.SPLASH_POTION), ModPotions.WITHER.get()));
        }

        @Override
        public boolean isIngredient(ItemStack ingredient) {
            String nbt = ingredient.getOrCreateTag().getAsString();
            if (nbt.equals(null)){return false;}
            return ingredient.getItem() == Items.REDSTONE;
        }

        @Override
        public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
            return this.isInput(input) && this.isIngredient(ingredient)
                    ? PotionUtils.setPotion(new ItemStack(Items.SPLASH_POTION), ModPotions.LONG_WITHER.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class LingeringLongWither implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.equals(PotionUtils.setPotion(new ItemStack(Items.POTION), ModPotions.LONG_WITHER.get()));
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
                    ? PotionUtils.setPotion(new ItemStack(Items.LINGERING_POTION),ModPotions.LONG_WITHER.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class LingeringLongWitherFromShort implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.equals(PotionUtils.setPotion(new ItemStack(Items.LINGERING_POTION), ModPotions.WITHER.get()));
        }

        @Override
        public boolean isIngredient(ItemStack ingredient) {
            String nbt = ingredient.getOrCreateTag().getAsString();
            if (nbt.equals(null)){return false;}
            return ingredient.getItem() == Items.REDSTONE;
        }

        @Override
        public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
            return this.isInput(input) && this.isIngredient(ingredient)
                    ? PotionUtils.setPotion(new ItemStack(Items.LINGERING_POTION), ModPotions.LONG_WITHER.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class StrongWither implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.equals(PotionUtils.setPotion(new ItemStack(Items.POTION), ModPotions.WITHER.get()));
        }

        @Override
        public boolean isIngredient(ItemStack ingredient) {
            String nbt = ingredient.getOrCreateTag().getAsString();
            if (nbt.equals(null)){return false;}
            return ingredient.getItem() == Items.GLOWSTONE;
        }

        @Override
        public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
            return this.isInput(input) && this.isIngredient(ingredient)
                    ? PotionUtils.setPotion(new ItemStack(Items.POTION), ModPotions.STRONG_WITHER.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class SplashStrongWither implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.equals(PotionUtils.setPotion(new ItemStack(Items.POTION), ModPotions.STRONG_WITHER.get()));
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
                    ? PotionUtils.setPotion(new ItemStack(Items.SPLASH_POTION),ModPotions.STRONG_WITHER.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class SplashStrongWitherFromWeak implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.equals(PotionUtils.setPotion(new ItemStack(Items.SPLASH_POTION), ModPotions.WITHER.get()));
        }

        @Override
        public boolean isIngredient(ItemStack ingredient) {
            String nbt = ingredient.getOrCreateTag().getAsString();
            if (nbt.equals(null)){return false;}
            return ingredient.getItem() == Items.GLOWSTONE;
        }

        @Override
        public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
            return this.isInput(input) && this.isIngredient(ingredient)
                    ? PotionUtils.setPotion(new ItemStack(Items.SPLASH_POTION), ModPotions.STRONG_WITHER.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class LingeringStrongWither implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.equals(PotionUtils.setPotion(new ItemStack(Items.POTION), ModPotions.STRONG_WITHER.get()));
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
                    ? PotionUtils.setPotion(new ItemStack(Items.LINGERING_POTION),ModPotions.STRONG_WITHER.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class LingeringStrongWitherFromWeak implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.equals(PotionUtils.setPotion(new ItemStack(Items.LINGERING_POTION), ModPotions.WITHER.get()));
        }

        @Override
        public boolean isIngredient(ItemStack ingredient) {
            String nbt = ingredient.getOrCreateTag().getAsString();
            if (nbt.equals(null)){return false;}
            return ingredient.getItem() == Items.GLOWSTONE;
        }

        @Override
        public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
            return this.isInput(input) && this.isIngredient(ingredient)
                    ? PotionUtils.setPotion(new ItemStack(Items.LINGERING_POTION), ModPotions.STRONG_WITHER.get())
                    : ItemStack.EMPTY;
        }
    }

    public static class Luck implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.getItem() == Items.POTION && PotionUtils.getPotion(input) == Potions.AWKWARD;
        }

        @Override
        public boolean isIngredient(ItemStack ingredient) {
            String nbt = ingredient.getOrCreateTag().getAsString();
            if (nbt.equals(null)){return false;}
            return ingredient.getItem() == Items.LAPIS_LAZULI;
        }

        @Override
        public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
            return this.isInput(input) && this.isIngredient(ingredient)
                    ? PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LUCK)
                    : ItemStack.EMPTY;
        }
    }

    public static class SplashLuck implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.equals(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LUCK));
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
                    ? PotionUtils.setPotion(new ItemStack(Items.SPLASH_POTION),Potions.LUCK)
                    : ItemStack.EMPTY;
        }
    }

    public static class SplashLuckFromAwkward implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.getItem() == Items.SPLASH_POTION && PotionUtils.getPotion(input) == Potions.AWKWARD;
        }

        @Override
        public boolean isIngredient(ItemStack ingredient) {
            String nbt = ingredient.getOrCreateTag().getAsString();
            if (nbt.equals(null)){return false;}
            return ingredient.getItem() == Items.LAPIS_LAZULI;
        }

        @Override
        public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
            return this.isInput(input) && this.isIngredient(ingredient)
                    ? PotionUtils.setPotion(new ItemStack(Items.SPLASH_POTION), Potions.LUCK)
                    : ItemStack.EMPTY;
        }
    }

    public static class LingeringLuck implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.equals(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LUCK));
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
                    ? PotionUtils.setPotion(new ItemStack(Items.LINGERING_POTION),Potions.LUCK)
                    : ItemStack.EMPTY;
        }
    }

    public static class LingeringLuckFromAwkward implements IBrewingRecipe{

        @Override
        public boolean isInput(ItemStack input) {
            return input.getItem() == Items.LINGERING_POTION && PotionUtils.getPotion(input) == Potions.AWKWARD;
        }

        @Override
        public boolean isIngredient(ItemStack ingredient) {
            String nbt = ingredient.getOrCreateTag().getAsString();
            if (nbt.equals(null)){return false;}
            return ingredient.getItem() == Items.LAPIS_LAZULI;
        }

        @Override
        public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
            return this.isInput(input) && this.isIngredient(ingredient)
                    ? PotionUtils.setPotion(new ItemStack(Items.LINGERING_POTION), Potions.LUCK)
                    : ItemStack.EMPTY;
        }
    }


}


