package net.mcreator.purplesands.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

public class InDesertDemProcedure {
	public static boolean execute(LevelAccessor world) {
		return (world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (ResourceKey.create(Registry.DIMENSION_REGISTRY,
				new ResourceLocation("purple_sands:infinite_desert"))) ? true : false;
	}
}
