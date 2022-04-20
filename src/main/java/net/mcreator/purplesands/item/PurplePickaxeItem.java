
package net.mcreator.purplesands.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.purplesands.init.PurpleSandsModTabs;
import net.mcreator.purplesands.init.PurpleSandsModItems;

public class PurplePickaxeItem extends PickaxeItem {
	public PurplePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2000;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PurpleSandsModItems.PURPLE_GEM));
			}
		}, 1, -3f, new Item.Properties().tab(PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB));
		setRegistryName("purple_pickaxe");
	}
}
