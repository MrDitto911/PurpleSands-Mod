
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.purplesands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.purplesands.block.SmoothPurpleSandstoneBlock;
import net.mcreator.purplesands.block.SandRefinerBlock;
import net.mcreator.purplesands.block.RoxaBlock;
import net.mcreator.purplesands.block.PurpleSandstoneWallBlock;
import net.mcreator.purplesands.block.PurpleSandstoneStairsBlock;
import net.mcreator.purplesands.block.PurpleSandstoneSlabBlock;
import net.mcreator.purplesands.block.PurpleSandstonePressurePlateBlock;
import net.mcreator.purplesands.block.PurpleSandstoneButtonBlock;
import net.mcreator.purplesands.block.PurpleSandstoneBlock;
import net.mcreator.purplesands.block.PurpleSandBlock;
import net.mcreator.purplesands.block.PurpleOreBlock;
import net.mcreator.purplesands.block.PortalFrameTrapDoorBlock;
import net.mcreator.purplesands.block.PortalFrameDoorBlock;
import net.mcreator.purplesands.block.PortalFrameBlock;
import net.mcreator.purplesands.block.PetrifiedWoodBlock;
import net.mcreator.purplesands.block.PetrifiedTrapDoorBlock;
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
import net.mcreator.purplesands.block.InfiniteDesertPortalBlock;
import net.mcreator.purplesands.block.GlowGlassBlock;
import net.mcreator.purplesands.block.GemBlockBlock;
import net.mcreator.purplesands.block.CarvedPurpleSandstoneBlock;
import net.mcreator.purplesands.block.AridShroomBlock;
import net.mcreator.purplesands.PurpleSandsMod;

public class PurpleSandsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PurpleSandsMod.MODID);
	public static final RegistryObject<Block> PURPLE_SAND = REGISTRY.register("purple_sand", () -> new PurpleSandBlock());
	public static final RegistryObject<Block> PURPLE_SANDSTONE = REGISTRY.register("purple_sandstone", () -> new PurpleSandstoneBlock());
	public static final RegistryObject<Block> PETRIFIED_WOOD = REGISTRY.register("petrified_wood", () -> new PetrifiedWoodBlock());
	public static final RegistryObject<Block> PETRIFIED_LOG = REGISTRY.register("petrified_log", () -> new PetrifiedLogBlock());
	public static final RegistryObject<Block> PETRIFIED_PLANKS = REGISTRY.register("petrified_planks", () -> new PetrifiedPlanksBlock());
	public static final RegistryObject<Block> PETRIFIED_STAIRS = REGISTRY.register("petrified_stairs", () -> new PetrifiedStairsBlock());
	public static final RegistryObject<Block> PETRIFIED_SLAB = REGISTRY.register("petrified_slab", () -> new PetrifiedSlabBlock());
	public static final RegistryObject<Block> PETRIFIED_BUTTON = REGISTRY.register("petrified_button", () -> new PetrifiedButtonBlock());
	public static final RegistryObject<Block> PETRIFIED_DOOR = REGISTRY.register("petrified_door", () -> new PetrifiedDoorBlock());
	public static final RegistryObject<Block> PURPLE_ORE = REGISTRY.register("purple_ore", () -> new PurpleOreBlock());
	public static final RegistryObject<Block> ROXA = REGISTRY.register("roxa", () -> new RoxaBlock());
	public static final RegistryObject<Block> GEM_BLOCK = REGISTRY.register("gem_block", () -> new GemBlockBlock());
	public static final RegistryObject<Block> SAND_REFINER = REGISTRY.register("sand_refiner", () -> new SandRefinerBlock());
	public static final RegistryObject<Block> PETRIFIED_LEAVES = REGISTRY.register("petrified_leaves", () -> new PetrifiedLeavesBlock());
	public static final RegistryObject<Block> PETRIFIED_FENCE = REGISTRY.register("petrified_fence", () -> new PetrifiedFenceBlock());
	public static final RegistryObject<Block> PETRIFIED_FENCE_GATE = REGISTRY.register("petrified_fence_gate", () -> new PetrifiedFenceGateBlock());
	public static final RegistryObject<Block> PETRIFIED_PRESSURE_PLATE = REGISTRY.register("petrified_pressure_plate",
			() -> new PetrifiedPressurePlateBlock());
	public static final RegistryObject<Block> ORB_CRAFTER = REGISTRY.register("orb_crafter", () -> new OrbCrafterBlock());
	public static final RegistryObject<Block> PORTAL_FRAME = REGISTRY.register("portal_frame", () -> new PortalFrameBlock());
	public static final RegistryObject<Block> INFINITE_DESERT_PORTAL = REGISTRY.register("infinite_desert_portal",
			() -> new InfiniteDesertPortalBlock());
	public static final RegistryObject<Block> PURPLE_SANDSTONE_SLAB = REGISTRY.register("purple_sandstone_slab",
			() -> new PurpleSandstoneSlabBlock());
	public static final RegistryObject<Block> PURPLE_SANDSTONE_WALL = REGISTRY.register("purple_sandstone_wall",
			() -> new PurpleSandstoneWallBlock());
	public static final RegistryObject<Block> PURPLE_SANDSTONE_STAIRS = REGISTRY.register("purple_sandstone_stairs",
			() -> new PurpleSandstoneStairsBlock());
	public static final RegistryObject<Block> PURPLE_SANDSTONE_BUTTON = REGISTRY.register("purple_sandstone_button",
			() -> new PurpleSandstoneButtonBlock());
	public static final RegistryObject<Block> PURPLE_SANDSTONE_PRESSURE_PLATE = REGISTRY.register("purple_sandstone_pressure_plate",
			() -> new PurpleSandstonePressurePlateBlock());
	public static final RegistryObject<Block> GLOW_GLASS = REGISTRY.register("glow_glass", () -> new GlowGlassBlock());
	public static final RegistryObject<Block> PORTAL_FRAME_DOOR = REGISTRY.register("portal_frame_door", () -> new PortalFrameDoorBlock());
	public static final RegistryObject<Block> PORTAL_FRAME_TRAP_DOOR = REGISTRY.register("portal_frame_trap_door",
			() -> new PortalFrameTrapDoorBlock());
	public static final RegistryObject<Block> PETRIFIED_TRAP_DOOR = REGISTRY.register("petrified_trap_door", () -> new PetrifiedTrapDoorBlock());
	public static final RegistryObject<Block> ARID_SHROOM = REGISTRY.register("arid_shroom", () -> new AridShroomBlock());
	public static final RegistryObject<Block> SMOOTH_PURPLE_SANDSTONE = REGISTRY.register("smooth_purple_sandstone",
			() -> new SmoothPurpleSandstoneBlock());
	public static final RegistryObject<Block> CARVED_PURPLE_SANDSTONE = REGISTRY.register("carved_purple_sandstone",
			() -> new CarvedPurpleSandstoneBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			PetrifiedDoorBlock.registerRenderLayer();
			RoxaBlock.registerRenderLayer();
			SandRefinerBlock.registerRenderLayer();
			OrbCrafterBlock.registerRenderLayer();
			PurpleSandstoneSlabBlock.registerRenderLayer();
			PurpleSandstoneWallBlock.registerRenderLayer();
			PurpleSandstoneStairsBlock.registerRenderLayer();
			PurpleSandstoneButtonBlock.registerRenderLayer();
			PurpleSandstonePressurePlateBlock.registerRenderLayer();
			GlowGlassBlock.registerRenderLayer();
			PortalFrameDoorBlock.registerRenderLayer();
			PortalFrameTrapDoorBlock.registerRenderLayer();
			PetrifiedTrapDoorBlock.registerRenderLayer();
			AridShroomBlock.registerRenderLayer();
		}
	}
}
