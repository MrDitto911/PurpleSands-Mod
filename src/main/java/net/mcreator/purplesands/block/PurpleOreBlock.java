
package net.mcreator.purplesands.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

import net.mcreator.purplesands.init.PurpleSandsModItems;

import java.util.List;
import java.util.Collections;

public class PurpleOreBlock extends Block {
	public PurpleOreBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(3f, 5f).lightLevel(s -> 1).requiresCorrectToolForDrops()
				.hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
		setRegistryName("purple_ore");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem()instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 2;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(PurpleSandsModItems.PURPLE_PILE));
	}
}
