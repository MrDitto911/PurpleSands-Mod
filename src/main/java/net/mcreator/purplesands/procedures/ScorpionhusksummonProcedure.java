package net.mcreator.purplesands.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.purplesands.init.PurpleSandsModItems;
import net.mcreator.purplesands.init.PurpleSandsModEntities;
import net.mcreator.purplesands.init.PurpleSandsModBlocks;
import net.mcreator.purplesands.entity.ScorpionHuskEntity;

import java.util.function.Supplier;
import java.util.Map;

public class ScorpionhusksummonProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == PurpleSandsModBlocks.PURPLE_SAND_PIT.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
						.getItem() == PurpleSandsModItems.RAW_SANDFLEA.get()
				&& new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
								&& _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(0) >= 64) {
			world.setBlock(new BlockPos(x, y, z), PurpleSandsModBlocks.PURPLE_SAND.get().defaultBlockState(), 3);
			if (entity instanceof Player _player)
				_player.closeContainer();
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new ScorpionHuskEntity(PurpleSandsModEntities.SCORPION_HUSK.get(), _level);
				entityToSpawn.moveTo(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		}
	}
}
