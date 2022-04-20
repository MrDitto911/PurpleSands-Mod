package net.mcreator.purplesands.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.world.BlockEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.purplesands.init.PurpleSandsModEntities;
import net.mcreator.purplesands.init.PurpleSandsModBlocks;
import net.mcreator.purplesands.entity.GemGolemEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GemGolemNaturalEntitySpawningConditionProcedure {
	@SubscribeEvent
	public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		Entity entity = event.getEntity();
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.CARVED_PUMPKIN
				&& (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == PurpleSandsModBlocks.GEM_BLOCK
				&& (world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) z))).getBlock() == PurpleSandsModBlocks.PURPLE_SANDSTONE
				&& (world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == PurpleSandsModBlocks.PURPLE_SANDSTONE
				&& (world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == PurpleSandsModBlocks.PURPLE_SANDSTONE) {
			world.setBlock(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) x, (int) (y - 1), (int) z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) x, (int) (y - 2), (int) z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) (x - 1), (int) (y - 1), (int) z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) (x + 1), (int) (y - 1), (int) z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new GemGolemEntity(PurpleSandsModEntities.GEM_GOLEM, _level);
				entityToSpawn.moveTo(x, (y - 2), z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.CARVED_PUMPKIN
				&& (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == PurpleSandsModBlocks.GEM_BLOCK
				&& (world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) z))).getBlock() == PurpleSandsModBlocks.PURPLE_SANDSTONE
				&& (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == PurpleSandsModBlocks.PURPLE_SANDSTONE
				&& (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == PurpleSandsModBlocks.PURPLE_SANDSTONE) {
			world.setBlock(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) x, (int) (y - 1), (int) z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) x, (int) (y - 2), (int) z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new GemGolemEntity(PurpleSandsModEntities.GEM_GOLEM, _level);
				entityToSpawn.moveTo(x, (y - 2), z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		}
	}
}
