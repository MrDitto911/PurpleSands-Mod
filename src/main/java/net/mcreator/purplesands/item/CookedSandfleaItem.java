
package net.mcreator.purplesands.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;

import net.mcreator.purplesands.procedures.CookedSandfleaItemIsSmeltedProcedure;
import net.mcreator.purplesands.init.PurpleSandsModTabs;

public class CookedSandfleaItem extends Item {
	public CookedSandfleaItem() {
		super(new Item.Properties().tab(PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(9).saturationMod(4f)

						.meat().build()));
		setRegistryName("cooked_sandflea");
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		CookedSandfleaItemIsSmeltedProcedure.execute(entity);
	}
}
