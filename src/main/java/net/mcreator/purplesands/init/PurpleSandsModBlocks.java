
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.purplesands.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.purplesands.block.SandRefinerBlock;
import net.mcreator.purplesands.block.RoxaBlock;
import net.mcreator.purplesands.block.PurpleSandstoneBlock;
import net.mcreator.purplesands.block.PurpleSandBlock;
import net.mcreator.purplesands.block.PurpleOreBlock;
import net.mcreator.purplesands.block.PetrifiedWoodBlock;
import net.mcreator.purplesands.block.PetrifiedStairsBlock;
import net.mcreator.purplesands.block.PetrifiedSlabBlock;
import net.mcreator.purplesands.block.PetrifiedPressurePlateBlock;
import net.mcreator.purplesands.block.PetrifiedPlanksBlock;
import net.mcreator.purplesands.block.PetrifiedLogBlock;
import net.mcreator.purplesands.block.PetrifiedLeavesBlock;
import net.mcreator.purplesands.block.PetrifiedFenceGateBlock;
import net.mcreator.purplesands.block.PetrifiedFenceBlock;
import net.mcreator.purplesands.block.PetrifiedDoorBlock;
import net.mcreator.purplesands.block.PetrifiedButtonBlock;
import net.mcreator.purplesands.block.OrbCrafterBlock;
import net.mcreator.purplesands.block.GemBlockBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PurpleSandsModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block PURPLE_SAND = register(new PurpleSandBlock());
	public static final Block PURPLE_SANDSTONE = register(new PurpleSandstoneBlock());
	public static final Block PETRIFIED_WOOD = register(new PetrifiedWoodBlock());
	public static final Block PETRIFIED_LOG = register(new PetrifiedLogBlock());
	public static final Block PETRIFIED_PLANKS = register(new PetrifiedPlanksBlock());
	public static final Block PETRIFIED_STAIRS = register(new PetrifiedStairsBlock());
	public static final Block PETRIFIED_SLAB = register(new PetrifiedSlabBlock());
	public static final Block PETRIFIED_BUTTON = register(new PetrifiedButtonBlock());
	public static final Block PETRIFIED_DOOR = register(new PetrifiedDoorBlock());
	public static final Block PURPLE_ORE = register(new PurpleOreBlock());
	public static final Block ROXA = register(new RoxaBlock());
	public static final Block GEM_BLOCK = register(new GemBlockBlock());
	public static final Block SAND_REFINER = register(new SandRefinerBlock());
	public static final Block PETRIFIED_LEAVES = register(new PetrifiedLeavesBlock());
	public static final Block PETRIFIED_FENCE = register(new PetrifiedFenceBlock());
	public static final Block PETRIFIED_FENCE_GATE = register(new PetrifiedFenceGateBlock());
	public static final Block PETRIFIED_PRESSURE_PLATE = register(new PetrifiedPressurePlateBlock());
	public static final Block ORB_CRAFTER = register(new OrbCrafterBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			PetrifiedDoorBlock.registerRenderLayer();
			RoxaBlock.registerRenderLayer();
			SandRefinerBlock.registerRenderLayer();
			OrbCrafterBlock.registerRenderLayer();
		}
	}
}
