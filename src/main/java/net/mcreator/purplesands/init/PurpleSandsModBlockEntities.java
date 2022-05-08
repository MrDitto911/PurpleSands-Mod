
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.purplesands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.purplesands.block.entity.SandRefinerBlockEntity;
import net.mcreator.purplesands.block.entity.OrbCrafterBlockEntity;
import net.mcreator.purplesands.PurpleSandsMod;

public class PurpleSandsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, PurpleSandsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> SAND_REFINER = register("sand_refiner", PurpleSandsModBlocks.SAND_REFINER,
			SandRefinerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ORB_CRAFTER = register("orb_crafter", PurpleSandsModBlocks.ORB_CRAFTER,
			OrbCrafterBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
