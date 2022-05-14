
package net.mcreator.purplesands.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.purplesands.procedures.TheBaneofArthropodsLivingEntityIsHitWithToolProcedure;
import net.mcreator.purplesands.init.PurpleSandsModTabs;
import net.mcreator.purplesands.init.PurpleSandsModItems;

public class TheBaneofArthropodsItem extends SwordItem {
	public TheBaneofArthropodsItem() {
		super(new Tier() {
			public int getUses() {
				return 2032;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PurpleSandsModItems.BEETLE_SHELL.get()), new ItemStack(Items.HONEYCOMB),
						new ItemStack(Items.HONEY_BOTTLE));
			}
		}, 3, -2f, new Item.Properties().tab(PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		TheBaneofArthropodsLivingEntityIsHitWithToolProcedure.execute(entity);
		return retval;
	}
}
