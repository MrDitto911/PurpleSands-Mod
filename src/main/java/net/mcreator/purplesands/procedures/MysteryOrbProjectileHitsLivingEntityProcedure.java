package net.mcreator.purplesands.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

public class MysteryOrbProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world instanceof Level _lvl ? _lvl.isDay() : false) && world.canSeeSkyFromBelowWater(new BlockPos((int) x, (int) y, (int) z))) {
			entity.setSecondsOnFire(15);
		} else if (!(world instanceof Level _lvl ? _lvl.isDay() : false) && world.canSeeSkyFromBelowWater(new BlockPos((int) x, (int) y, (int) z))) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 480, 1));
		} else if (!world.canSeeSkyFromBelowWater(new BlockPos((int) x, (int) y, (int) z))) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 480, 1));
		}
	}
}
