
package net.mcreator.purplesands.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.purplesands.procedures.BowlofSandItemIsCraftedProcedure;
import net.mcreator.purplesands.init.PurpleSandsModTabs;

public class BowlofSandItem extends Item {
	public BowlofSandItem() {
		super(new Item.Properties().tab(PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB).stacksTo(16).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(8).saturationMod(4f)

						.build()));
		setRegistryName("bowlof_sand");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 48;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(Items.BOWL);
		super.finishUsingItem(itemstack, world, entity);
		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		BowlofSandItemIsCraftedProcedure.execute(entity);
	}
}
