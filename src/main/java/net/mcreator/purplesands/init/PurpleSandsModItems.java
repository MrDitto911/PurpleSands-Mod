
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.purplesands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.purplesands.item.TheBaneofArthropodsItem;
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
import net.mcreator.purplesands.item.BeetleShellItem;
import net.mcreator.purplesands.item.BeetleArmorItem;
import net.mcreator.purplesands.item.BasicOrbItem;
import net.mcreator.purplesands.item.AwakenedOrbItem;
import net.mcreator.purplesands.PurpleSandsMod;

public class PurpleSandsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PurpleSandsMod.MODID);
	public static final RegistryObject<Item> PURPLE_SAND = block(PurpleSandsModBlocks.PURPLE_SAND, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> PURPLE_SANDSTONE = block(PurpleSandsModBlocks.PURPLE_SANDSTONE, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> PETRIFIED_WOOD = block(PurpleSandsModBlocks.PETRIFIED_WOOD, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> PETRIFIED_LOG = block(PurpleSandsModBlocks.PETRIFIED_LOG, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> PETRIFIED_PLANKS = block(PurpleSandsModBlocks.PETRIFIED_PLANKS, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> PETRIFIED_STAIRS = block(PurpleSandsModBlocks.PETRIFIED_STAIRS, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> PETRIFIED_SLAB = block(PurpleSandsModBlocks.PETRIFIED_SLAB, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> PETRIFIED_BUTTON = block(PurpleSandsModBlocks.PETRIFIED_BUTTON, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> PETRIFIED_DOOR = doubleBlock(PurpleSandsModBlocks.PETRIFIED_DOOR,
			PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> PURPLE_GEM = REGISTRY.register("purple_gem", () -> new PurpleGemItem());
	public static final RegistryObject<Item> PURPLE_PILE = REGISTRY.register("purple_pile", () -> new PurplePileItem());
	public static final RegistryObject<Item> PURPLE_ORE = block(PurpleSandsModBlocks.PURPLE_ORE, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> ROXA = block(PurpleSandsModBlocks.ROXA, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> GEM_BLOCK = block(PurpleSandsModBlocks.GEM_BLOCK, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> SAND_REFINER = block(PurpleSandsModBlocks.SAND_REFINER, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> GEM_STAFF = REGISTRY.register("gem_staff", () -> new GemStaffItem());
	public static final RegistryObject<Item> MYSTERY_ORB = REGISTRY.register("mystery_orb", () -> new MysteryOrbItem());
	public static final RegistryObject<Item> PURPLE_PICKAXE = REGISTRY.register("purple_pickaxe", () -> new PurplePickaxeItem());
	public static final RegistryObject<Item> PURPLE_AXE = REGISTRY.register("purple_axe", () -> new PurpleAxeItem());
	public static final RegistryObject<Item> PURPLE_SWORD = REGISTRY.register("purple_sword", () -> new PurpleSwordItem());
	public static final RegistryObject<Item> PURPLE_SHOVEL = REGISTRY.register("purple_shovel", () -> new PurpleShovelItem());
	public static final RegistryObject<Item> PURPLE_HOE = REGISTRY.register("purple_hoe", () -> new PurpleHoeItem());
	public static final RegistryObject<Item> PURPLE_ARMOR_HELMET = REGISTRY.register("purple_armor_helmet", () -> new PurpleArmorItem.Helmet());
	public static final RegistryObject<Item> PURPLE_ARMOR_CHESTPLATE = REGISTRY.register("purple_armor_chestplate",
			() -> new PurpleArmorItem.Chestplate());
	public static final RegistryObject<Item> PURPLE_ARMOR_LEGGINGS = REGISTRY.register("purple_armor_leggings", () -> new PurpleArmorItem.Leggings());
	public static final RegistryObject<Item> PURPLE_ARMOR_BOOTS = REGISTRY.register("purple_armor_boots", () -> new PurpleArmorItem.Boots());
	public static final RegistryObject<Item> PETRIFIED_FENCE = block(PurpleSandsModBlocks.PETRIFIED_FENCE, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> PETRIFIED_FENCE_GATE = block(PurpleSandsModBlocks.PETRIFIED_FENCE_GATE,
			PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> PETRIFIED_PRESSURE_PLATE = block(PurpleSandsModBlocks.PETRIFIED_PRESSURE_PLATE,
			PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> AWAKENED_ORB = REGISTRY.register("awakened_orb", () -> new AwakenedOrbItem());
	public static final RegistryObject<Item> ORB_CRAFTER = block(PurpleSandsModBlocks.ORB_CRAFTER, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> PORTAL_FRAME = block(PurpleSandsModBlocks.PORTAL_FRAME, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> INFINITE_DESERT = REGISTRY.register("infinite_desert", () -> new InfiniteDesertItem());
	public static final RegistryObject<Item> PURPLE_SANDSTONE_SLAB = block(PurpleSandsModBlocks.PURPLE_SANDSTONE_SLAB,
			PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> PURPLE_SANDSTONE_WALL = block(PurpleSandsModBlocks.PURPLE_SANDSTONE_WALL,
			PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> PURPLE_SANDSTONE_STAIRS = block(PurpleSandsModBlocks.PURPLE_SANDSTONE_STAIRS,
			PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> PURPLE_SANDSTONE_BUTTON = block(PurpleSandsModBlocks.PURPLE_SANDSTONE_BUTTON,
			PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> PURPLE_SANDSTONE_PRESSURE_PLATE = block(PurpleSandsModBlocks.PURPLE_SANDSTONE_PRESSURE_PLATE,
			PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> GLOW_GLASS = block(PurpleSandsModBlocks.GLOW_GLASS, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> PORTAL_FRAME_DOOR = doubleBlock(PurpleSandsModBlocks.PORTAL_FRAME_DOOR,
			PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> PORTAL_FRAME_TRAP_DOOR = block(PurpleSandsModBlocks.PORTAL_FRAME_TRAP_DOOR,
			PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> PETRIFIED_TRAP_DOOR = block(PurpleSandsModBlocks.PETRIFIED_TRAP_DOOR,
			PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> BEETLE_SHELL = REGISTRY.register("beetle_shell", () -> new BeetleShellItem());
	public static final RegistryObject<Item> PRIDE_BREAD = REGISTRY.register("pride_bread", () -> new PrideBreadItem());
	public static final RegistryObject<Item> CREEPER_COOKIE = REGISTRY.register("creeper_cookie", () -> new CreeperCookieItem());
	public static final RegistryObject<Item> SAND_BALL = REGISTRY.register("sand_ball", () -> new SandBallItem());
	public static final RegistryObject<Item> RAW_SANDFLEA = REGISTRY.register("raw_sandflea", () -> new RawSandfleaItem());
	public static final RegistryObject<Item> COOKED_SANDFLEA = REGISTRY.register("cooked_sandflea", () -> new CookedSandfleaItem());
	public static final RegistryObject<Item> BOWLOF_SAND = REGISTRY.register("bowlof_sand", () -> new BowlofSandItem());
	public static final RegistryObject<Item> PURPLE_APPLE = REGISTRY.register("purple_apple", () -> new PurpleAppleItem());
	public static final RegistryObject<Item> THE_BANEOF_ARTHROPODS = REGISTRY.register("the_baneof_arthropods", () -> new TheBaneofArthropodsItem());
	public static final RegistryObject<Item> ARID_SHROOM = block(PurpleSandsModBlocks.ARID_SHROOM, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> SMOOTH_PURPLE_SANDSTONE = block(PurpleSandsModBlocks.SMOOTH_PURPLE_SANDSTONE,
			PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> CARVED_PURPLE_SANDSTONE = block(PurpleSandsModBlocks.CARVED_PURPLE_SANDSTONE,
			PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> BEETLE_ARMOR_HELMET = REGISTRY.register("beetle_armor_helmet", () -> new BeetleArmorItem.Helmet());
	public static final RegistryObject<Item> BEETLE_ARMOR_CHESTPLATE = REGISTRY.register("beetle_armor_chestplate",
			() -> new BeetleArmorItem.Chestplate());
	public static final RegistryObject<Item> BEETLE_ARMOR_LEGGINGS = REGISTRY.register("beetle_armor_leggings", () -> new BeetleArmorItem.Leggings());
	public static final RegistryObject<Item> BEETLE_ARMOR_BOOTS = REGISTRY.register("beetle_armor_boots", () -> new BeetleArmorItem.Boots());
	public static final RegistryObject<Item> BASIC_ORB = REGISTRY.register("basic_orb", () -> new BasicOrbItem());
	public static final RegistryObject<Item> PURPLE_SAND_PIT = block(PurpleSandsModBlocks.PURPLE_SAND_PIT, PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB);
	public static final RegistryObject<Item> SCORPION_HUSK = REGISTRY.register("scorpion_husk_spawn_egg",
			() -> new ForgeSpawnEggItem(PurpleSandsModEntities.SCORPION_HUSK, -6710785, -3355393,
					new Item.Properties().tab(PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB)));
	public static final RegistryObject<Item> SANDFLEA = REGISTRY.register("sandflea_spawn_egg",
			() -> new ForgeSpawnEggItem(PurpleSandsModEntities.SANDFLEA, -4616725, -6726942,
					new Item.Properties().tab(PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB)));
	public static final RegistryObject<Item> DEATHADDER = REGISTRY.register("deathadder_spawn_egg",
			() -> new ForgeSpawnEggItem(PurpleSandsModEntities.DEATHADDER, -1, -10066432,
					new Item.Properties().tab(PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB)));
	public static final RegistryObject<Item> GEM_GOLEM = REGISTRY.register("gem_golem_spawn_egg",
			() -> new ForgeSpawnEggItem(PurpleSandsModEntities.GEM_GOLEM, -5874179, -11925875,
					new Item.Properties().tab(PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB)));
	public static final RegistryObject<Item> SANDMAN = REGISTRY.register("sandman_spawn_egg",
			() -> new ForgeSpawnEggItem(PurpleSandsModEntities.SANDMAN, -13034432, -9347978,
					new Item.Properties().tab(PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB)));
	public static final RegistryObject<Item> FLYING_SKULL = REGISTRY.register("flying_skull_spawn_egg",
			() -> new ForgeSpawnEggItem(PurpleSandsModEntities.FLYING_SKULL, -16777216, -6726942,
					new Item.Properties().tab(PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB)));
	public static final RegistryObject<Item> DESERT_BEETLE = REGISTRY.register("desert_beetle_spawn_egg",
			() -> new ForgeSpawnEggItem(PurpleSandsModEntities.DESERT_BEETLE, -11722619, -13695389,
					new Item.Properties().tab(PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB)));
	public static final RegistryObject<Item> LITTLE_BEETLE = REGISTRY.register("little_beetle_spawn_egg",
			() -> new ForgeSpawnEggItem(PurpleSandsModEntities.LITTLE_BEETLE, -16777216, -9303809,
					new Item.Properties().tab(PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB)));
	public static final RegistryObject<Item> PETRIFIED_LEAVES = block(PurpleSandsModBlocks.PETRIFIED_LEAVES, CreativeModeTab.TAB_DECORATIONS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
