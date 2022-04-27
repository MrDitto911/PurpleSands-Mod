
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.purplesands.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.purplesands.item.SandBallItem;
import net.mcreator.purplesands.item.RawSandfleaItem;
import net.mcreator.purplesands.item.PurpleSwordItem;
import net.mcreator.purplesands.item.PurpleShovelItem;
import net.mcreator.purplesands.item.PurplePileItem;
import net.mcreator.purplesands.item.PurplePickaxeItem;
import net.mcreator.purplesands.item.PurpleHoeItem;
import net.mcreator.purplesands.item.PurpleGemItem;
import net.mcreator.purplesands.item.PurpleAxeItem;
import net.mcreator.purplesands.item.PurpleArmorItem;
import net.mcreator.purplesands.item.PurpleAppleItem;
import net.mcreator.purplesands.item.PrideBreadItem;
import net.mcreator.purplesands.item.MysteryOrbItem;
import net.mcreator.purplesands.item.InfiniteDesertItem;
import net.mcreator.purplesands.item.GemStaffItem;
import net.mcreator.purplesands.item.CreeperCookieItem;
import net.mcreator.purplesands.item.CookedSandfleaItem;
import net.mcreator.purplesands.item.BowlofSandItem;
import net.mcreator.purplesands.item.AwakenedOrbItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PurpleSandsModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item SANDFLEA = register(
			new SpawnEggItem(PurpleSandsModEntities.SANDFLEA, -4616725, -6726942, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("sandflea_spawn_egg"));
	public static final Item DEATHADDER = register(
			new SpawnEggItem(PurpleSandsModEntities.DEATHADDER, -1, -10066432, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("deathadder_spawn_egg"));
	public static final Item GEM_GOLEM = register(
			new SpawnEggItem(PurpleSandsModEntities.GEM_GOLEM, -5874179, -11925875, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("gem_golem_spawn_egg"));
	public static final Item PURPLE_SAND = register(PurpleSandsModBlocks.PURPLE_SAND, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final Item PURPLE_SANDSTONE = register(PurpleSandsModBlocks.PURPLE_SANDSTONE, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final Item PETRIFIED_WOOD = register(PurpleSandsModBlocks.PETRIFIED_WOOD, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final Item PETRIFIED_LOG = register(PurpleSandsModBlocks.PETRIFIED_LOG, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final Item PETRIFIED_PLANKS = register(PurpleSandsModBlocks.PETRIFIED_PLANKS, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final Item PETRIFIED_STAIRS = register(PurpleSandsModBlocks.PETRIFIED_STAIRS, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final Item PETRIFIED_SLAB = register(PurpleSandsModBlocks.PETRIFIED_SLAB, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final Item PETRIFIED_BUTTON = register(PurpleSandsModBlocks.PETRIFIED_BUTTON, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final Item PETRIFIED_DOOR = register(PurpleSandsModBlocks.PETRIFIED_DOOR, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final Item PURPLE_GEM = register(new PurpleGemItem());
	public static final Item PURPLE_PILE = register(new PurplePileItem());
	public static final Item PRIDE_BREAD = register(new PrideBreadItem());
	public static final Item CREEPER_COOKIE = register(new CreeperCookieItem());
	public static final Item SAND_BALL = register(new SandBallItem());
	public static final Item PURPLE_ORE = register(PurpleSandsModBlocks.PURPLE_ORE, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final Item RAW_SANDFLEA = register(new RawSandfleaItem());
	public static final Item COOKED_SANDFLEA = register(new CookedSandfleaItem());
	public static final Item BOWLOF_SAND = register(new BowlofSandItem());
	public static final Item PURPLE_APPLE = register(new PurpleAppleItem());
	public static final Item ROXA = register(PurpleSandsModBlocks.ROXA, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final Item GEM_BLOCK = register(PurpleSandsModBlocks.GEM_BLOCK, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final Item SAND_REFINER = register(PurpleSandsModBlocks.SAND_REFINER, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final Item GEM_STAFF = register(new GemStaffItem());
	public static final Item MYSTERY_ORB = register(new MysteryOrbItem());
	public static final Item PURPLE_PICKAXE = register(new PurplePickaxeItem());
	public static final Item PURPLE_AXE = register(new PurpleAxeItem());
	public static final Item PURPLE_SWORD = register(new PurpleSwordItem());
	public static final Item PURPLE_SHOVEL = register(new PurpleShovelItem());
	public static final Item PURPLE_HOE = register(new PurpleHoeItem());
	public static final Item PURPLE_ARMOR_HELMET = register(new PurpleArmorItem.Helmet());
	public static final Item PURPLE_ARMOR_CHESTPLATE = register(new PurpleArmorItem.Chestplate());
	public static final Item PURPLE_ARMOR_LEGGINGS = register(new PurpleArmorItem.Leggings());
	public static final Item PURPLE_ARMOR_BOOTS = register(new PurpleArmorItem.Boots());
	public static final Item PETRIFIED_LEAVES = register(PurpleSandsModBlocks.PETRIFIED_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final Item PETRIFIED_FENCE = register(PurpleSandsModBlocks.PETRIFIED_FENCE, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final Item PETRIFIED_FENCE_GATE = register(PurpleSandsModBlocks.PETRIFIED_FENCE_GATE, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final Item PETRIFIED_PRESSURE_PLATE = register(PurpleSandsModBlocks.PETRIFIED_PRESSURE_PLATE,
			PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final Item AWAKENED_ORB = register(new AwakenedOrbItem());
	public static final Item ORB_CRAFTER = register(PurpleSandsModBlocks.ORB_CRAFTER, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final Item PORTAL_FRAME = register(PurpleSandsModBlocks.PORTAL_FRAME, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final Item INFINITE_DESERT = register(new InfiniteDesertItem());
	public static final Item PURPLE_SANDSTONE_SLAB = register(PurpleSandsModBlocks.PURPLE_SANDSTONE_SLAB, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final Item PURPLE_SANDSTONE_WALL = register(PurpleSandsModBlocks.PURPLE_SANDSTONE_WALL, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final Item PURPLE_SANDSTONE_STAIRS = register(PurpleSandsModBlocks.PURPLE_SANDSTONE_STAIRS,
			PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final Item PURPLE_SANDSTONE_BUTTON = register(PurpleSandsModBlocks.PURPLE_SANDSTONE_BUTTON,
			PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final Item PURPLE_SANDSTONE_PRESSURE_PLATE = register(PurpleSandsModBlocks.PURPLE_SANDSTONE_PRESSURE_PLATE,
			PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final Item SANDMAN = register(
			new SpawnEggItem(PurpleSandsModEntities.SANDMAN, -13034432, -9347978, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("sandman_spawn_egg"));
	public static final Item FLYING_SKULL = register(
			new SpawnEggItem(PurpleSandsModEntities.FLYING_SKULL, -16777216, -6726942, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("flying_skull_spawn_egg"));
	public static final Item GLOW_GLASS = register(PurpleSandsModBlocks.GLOW_GLASS, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final Item PORTAL_FRAME_DOOR = register(PurpleSandsModBlocks.PORTAL_FRAME_DOOR, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final Item PORTAL_FRAME_TRAP_DOOR = register(PurpleSandsModBlocks.PORTAL_FRAME_TRAP_DOOR, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final Item PETRIFIED_TRAP_DOOR = register(PurpleSandsModBlocks.PETRIFIED_TRAP_DOOR, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
