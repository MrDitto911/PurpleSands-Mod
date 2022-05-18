
package net.mcreator.purplesands.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.purplesands.procedures.ScorpionDaggerLivingEntityIsHitWithToolProcedure;
import net.mcreator.purplesands.init.PurpleSandsModTabs;

public class ScorpionDaggerItem extends SwordItem {
	public ScorpionDaggerItem() {
		super(new Tier() {
			public int getUses() {
				return 946;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 3;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -3.5f, new Item.Properties().tab(PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		ScorpionDaggerLivingEntityIsHitWithToolProcedure.execute(entity);
		return retval;
	}
}
