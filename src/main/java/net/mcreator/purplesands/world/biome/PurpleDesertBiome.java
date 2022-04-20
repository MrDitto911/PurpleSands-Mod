
package net.mcreator.purplesands.world.biome;

import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.level.levelgen.surfacebuilders.SurfaceBuilderBaseConfiguration;
import net.minecraft.world.level.levelgen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.level.levelgen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.mcreator.purplesands.init.PurpleSandsModBlocks;
import net.mcreator.purplesands.init.PurpleSandsModBiomes;
import net.mcreator.purplesands.PurpleSandsMod;

public class PurpleDesertBiome {
	private static final ConfiguredSurfaceBuilder<?> SURFACE_BUILDER = SurfaceBuilder.DEFAULT
			.configured(new SurfaceBuilderBaseConfiguration(PurpleSandsModBlocks.PURPLE_SAND.defaultBlockState(),
					PurpleSandsModBlocks.PURPLE_SANDSTONE.defaultBlockState(), PurpleSandsModBlocks.PURPLE_SANDSTONE.defaultBlockState()));

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-3355393).waterColor(-3355393).waterFogColor(329011)
				.skyColor(-3355393).foliageColorOverride(-6710785).grassColorOverride(-6723841).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SURFACE_BUILDER);
		BiomeDefaultFeatures.addDefaultCarvers(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder().setPlayerCanSpawn();
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).biomeCategory(Biome.BiomeCategory.DESERT).depth(0.1f).scale(0.2f)
				.temperature(1.5f).downfall(0f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build())
				.generationSettings(biomeGenerationSettings.build()).build();
	}

	public static void init() {
		Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new ResourceLocation(PurpleSandsMod.MODID, "purple_desert"), SURFACE_BUILDER);
		BiomeDictionary.addTypes(ResourceKey.create(Registry.BIOME_REGISTRY, BuiltinRegistries.BIOME.getKey(PurpleSandsModBiomes.PURPLE_DESERT)),
				BiomeDictionary.Type.OVERWORLD, BiomeDictionary.Type.SANDY, BiomeDictionary.Type.HOT, BiomeDictionary.Type.DRY,
				BiomeDictionary.Type.MODIFIED);
		BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(
				ResourceKey.create(Registry.BIOME_REGISTRY, BuiltinRegistries.BIOME.getKey(PurpleSandsModBiomes.PURPLE_DESERT)), 10));
	}
}
