
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.purplesands.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class PurpleSandsModTabs {
	public static CreativeModeTab TAB_PURPLE_SANDS_TAB;

	public static void load() {
		TAB_PURPLE_SANDS_TAB = new CreativeModeTab("tabpurple_sands_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PurpleSandsModBlocks.PURPLE_SAND);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
