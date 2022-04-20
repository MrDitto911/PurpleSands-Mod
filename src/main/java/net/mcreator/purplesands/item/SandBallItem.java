
package net.mcreator.purplesands.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;

import net.mcreator.purplesands.procedures.SandBallItemIsCraftedProcedure;
import net.mcreator.purplesands.init.PurpleSandsModTabs;

public class SandBallItem extends Item {
	public SandBallItem() {
		super(new Item.Properties().tab(PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB).stacksTo(32).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(2).saturationMod(20f)

						.build()));
		setRegistryName("sand_ball");
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		SandBallItemIsCraftedProcedure.execute(entity);
	}
}
