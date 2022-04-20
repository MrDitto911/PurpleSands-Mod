
package net.mcreator.purplesands.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.purplesands.init.PurpleSandsModTabs;

public class PurpleGemItem extends Item {
	public PurpleGemItem() {
		super(new Item.Properties().tab(PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB).stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
		setRegistryName("purple_gem");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
