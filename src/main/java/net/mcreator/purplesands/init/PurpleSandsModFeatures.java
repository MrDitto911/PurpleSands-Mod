
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.purplesands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.purplesands.world.features.plants.RoxaFeature;
import net.mcreator.purplesands.world.features.ores.PurpleOreFeature;
import net.mcreator.purplesands.world.features.ores.PetrifiedLogFeature;
import net.mcreator.purplesands.world.features.SandstoneWellTreasureFeature;
import net.mcreator.purplesands.world.features.SandstoneWellTrappedFeature;
import net.mcreator.purplesands.PurpleSandsMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class PurpleSandsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, PurpleSandsMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> PETRIFIED_LOG = register("petrified_log", PetrifiedLogFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, PetrifiedLogFeature.GENERATE_BIOMES, PetrifiedLogFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PURPLE_ORE = register("purple_ore", PurpleOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, PurpleOreFeature.GENERATE_BIOMES, PurpleOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ROXA = register("roxa", RoxaFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, RoxaFeature.GENERATE_BIOMES, RoxaFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SANDSTONE_WELL_TREASURE = register("sandstone_well_treasure",
			SandstoneWellTreasureFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
					SandstoneWellTreasureFeature.GENERATE_BIOMES, SandstoneWellTreasureFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SANDSTONE_WELL_TRAPPED = register("sandstone_well_trapped", SandstoneWellTrappedFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, SandstoneWellTrappedFeature.GENERATE_BIOMES,
					SandstoneWellTrappedFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
