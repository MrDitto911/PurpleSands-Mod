
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.purplesands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.purplesands.entity.SandmanEntity;
import net.mcreator.purplesands.entity.SandfleaEntity;
import net.mcreator.purplesands.entity.MysteryOrbEntity;
import net.mcreator.purplesands.entity.LittleBeetleEntity;
import net.mcreator.purplesands.entity.GemStaffEntity;
import net.mcreator.purplesands.entity.GemGolemEntity;
import net.mcreator.purplesands.entity.FlyingSkullEntity;
import net.mcreator.purplesands.entity.DesertBeetleEntity;
import net.mcreator.purplesands.entity.DeathadderEntity;
import net.mcreator.purplesands.entity.AwakenedOrbEntity;
import net.mcreator.purplesands.PurpleSandsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PurpleSandsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, PurpleSandsMod.MODID);
	public static final RegistryObject<EntityType<SandfleaEntity>> SANDFLEA = register("sandflea",
			EntityType.Builder.<SandfleaEntity>of(SandfleaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(SandfleaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DeathadderEntity>> DEATHADDER = register("deathadder",
			EntityType.Builder.<DeathadderEntity>of(DeathadderEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DeathadderEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GemGolemEntity>> GEM_GOLEM = register("gem_golem",
			EntityType.Builder.<GemGolemEntity>of(GemGolemEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(GemGolemEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GemStaffEntity>> GEM_STAFF = register("projectile_gem_staff",
			EntityType.Builder.<GemStaffEntity>of(GemStaffEntity::new, MobCategory.MISC).setCustomClientFactory(GemStaffEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MysteryOrbEntity>> MYSTERY_ORB = register("projectile_mystery_orb",
			EntityType.Builder.<MysteryOrbEntity>of(MysteryOrbEntity::new, MobCategory.MISC).setCustomClientFactory(MysteryOrbEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AwakenedOrbEntity>> AWAKENED_ORB = register("projectile_awakened_orb",
			EntityType.Builder.<AwakenedOrbEntity>of(AwakenedOrbEntity::new, MobCategory.MISC).setCustomClientFactory(AwakenedOrbEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SandmanEntity>> SANDMAN = register("sandman",
			EntityType.Builder.<SandmanEntity>of(SandmanEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(SandmanEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FlyingSkullEntity>> FLYING_SKULL = register("flying_skull",
			EntityType.Builder.<FlyingSkullEntity>of(FlyingSkullEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FlyingSkullEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DesertBeetleEntity>> DESERT_BEETLE = register("desert_beetle",
			EntityType.Builder.<DesertBeetleEntity>of(DesertBeetleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DesertBeetleEntity::new)

					.sized(1f, 1.8f));
	public static final RegistryObject<EntityType<LittleBeetleEntity>> LITTLE_BEETLE = register("little_beetle",
			EntityType.Builder.<LittleBeetleEntity>of(LittleBeetleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LittleBeetleEntity::new)

					.sized(0.4f, 0.3f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SandfleaEntity.init();
			DeathadderEntity.init();
			GemGolemEntity.init();
			SandmanEntity.init();
			FlyingSkullEntity.init();
			DesertBeetleEntity.init();
			LittleBeetleEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SANDFLEA.get(), SandfleaEntity.createAttributes().build());
		event.put(DEATHADDER.get(), DeathadderEntity.createAttributes().build());
		event.put(GEM_GOLEM.get(), GemGolemEntity.createAttributes().build());
		event.put(SANDMAN.get(), SandmanEntity.createAttributes().build());
		event.put(FLYING_SKULL.get(), FlyingSkullEntity.createAttributes().build());
		event.put(DESERT_BEETLE.get(), DesertBeetleEntity.createAttributes().build());
		event.put(LITTLE_BEETLE.get(), LittleBeetleEntity.createAttributes().build());
	}
}
