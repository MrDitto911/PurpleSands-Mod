
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.purplesands.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.purplesands.entity.SandmanEntity;
import net.mcreator.purplesands.entity.SandfleaEntity;
import net.mcreator.purplesands.entity.MysteryOrbEntity;
import net.mcreator.purplesands.entity.GemStaffEntity;
import net.mcreator.purplesands.entity.GemGolemEntity;
import net.mcreator.purplesands.entity.FlyingSkullEntity;
import net.mcreator.purplesands.entity.DeathadderEntity;
import net.mcreator.purplesands.entity.AwakenedOrbEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PurpleSandsModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<SandfleaEntity> SANDFLEA = register("sandflea",
			EntityType.Builder.<SandfleaEntity>of(SandfleaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(SandfleaEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<DeathadderEntity> DEATHADDER = register("deathadder",
			EntityType.Builder.<DeathadderEntity>of(DeathadderEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DeathadderEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<GemGolemEntity> GEM_GOLEM = register("gem_golem",
			EntityType.Builder.<GemGolemEntity>of(GemGolemEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(GemGolemEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<GemStaffEntity> GEM_STAFF = register("entitybulletgem_staff",
			EntityType.Builder.<GemStaffEntity>of(GemStaffEntity::new, MobCategory.MISC).setCustomClientFactory(GemStaffEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<MysteryOrbEntity> MYSTERY_ORB = register("entitybulletmystery_orb",
			EntityType.Builder.<MysteryOrbEntity>of(MysteryOrbEntity::new, MobCategory.MISC).setCustomClientFactory(MysteryOrbEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<AwakenedOrbEntity> AWAKENED_ORB = register("entitybulletawakened_orb",
			EntityType.Builder.<AwakenedOrbEntity>of(AwakenedOrbEntity::new, MobCategory.MISC).setCustomClientFactory(AwakenedOrbEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<SandmanEntity> SANDMAN = register("sandman",
			EntityType.Builder.<SandmanEntity>of(SandmanEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(SandmanEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<FlyingSkullEntity> FLYING_SKULL = register("flying_skull",
			EntityType.Builder.<FlyingSkullEntity>of(FlyingSkullEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FlyingSkullEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SandfleaEntity.init();
			DeathadderEntity.init();
			GemGolemEntity.init();
			SandmanEntity.init();
			FlyingSkullEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SANDFLEA, SandfleaEntity.createAttributes().build());
		event.put(DEATHADDER, DeathadderEntity.createAttributes().build());
		event.put(GEM_GOLEM, GemGolemEntity.createAttributes().build());
		event.put(SANDMAN, SandmanEntity.createAttributes().build());
		event.put(FLYING_SKULL, FlyingSkullEntity.createAttributes().build());
	}
}
