package net.mcreator.purplesands.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SandRefinerSunOffConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (!world.canSeeSkyFromBelowWater(new BlockPos(x, y, z)) || world.dayTime() < 700 || world.dayTime() > 12010) {
			return true;
		}
		return false;
	}
}
