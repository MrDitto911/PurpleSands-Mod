package net.mcreator.purplesands.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class PurpleSandPitAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.canSeeSkyFromBelowWater(new BlockPos(x, y, z))) {
			return true;
		}
		return false;
	}
}
