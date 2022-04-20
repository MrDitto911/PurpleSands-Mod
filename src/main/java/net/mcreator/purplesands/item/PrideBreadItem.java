
package net.mcreator.purplesands.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.purplesands.procedures.PrideBreadItemIsCraftedProcedure;
import net.mcreator.purplesands.procedures.PrideBreadFoodEatenProcedure;
import net.mcreator.purplesands.init.PurpleSandsModTabs;

public class PrideBreadItem extends Item {
	public PrideBreadItem() {
		super(new Item.Properties().tab(PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB).stacksTo(16).rarity(Rarity.UNCOMMON)
				.food((new FoodProperties.Builder()).nutrition(12).saturationMod(16f)

						.build()));
		setRegistryName("pride_bread");
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		PrideBreadFoodEatenProcedure.execute(entity);
		return retval;
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		PrideBreadItemIsCraftedProcedure.execute(entity);
	}
}
