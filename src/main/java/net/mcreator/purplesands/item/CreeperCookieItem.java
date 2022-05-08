
package net.mcreator.purplesands.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.purplesands.procedures.CreeperCookieItemIsCraftedProcedure;
import net.mcreator.purplesands.procedures.CreeperCookieFoodEatenProcedure;
import net.mcreator.purplesands.init.PurpleSandsModTabs;

public class CreeperCookieItem extends Item {
	public CreeperCookieItem() {
		super(new Item.Properties().tab(PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB).stacksTo(1).rarity(Rarity.UNCOMMON)
				.food((new FoodProperties.Builder()).nutrition(1).saturationMod(1f).alwaysEat()

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 16;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		CreeperCookieFoodEatenProcedure.execute(world, x, y, z, entity);
		return retval;
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		CreeperCookieItemIsCraftedProcedure.execute(entity);
	}
}
