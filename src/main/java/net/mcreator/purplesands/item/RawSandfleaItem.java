
package net.mcreator.purplesands.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.purplesands.init.PurpleSandsModTabs;

public class RawSandfleaItem extends Item {
	public RawSandfleaItem() {
		super(new Item.Properties().tab(PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(2f)

						.meat().build()));
		setRegistryName("raw_sandflea");
	}
}
