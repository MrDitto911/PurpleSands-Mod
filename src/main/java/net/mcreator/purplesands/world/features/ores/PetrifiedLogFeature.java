
package net.mcreator.purplesands.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.purplesands.init.PurpleSandsModBlocks;

import java.util.Set;
import java.util.Random;

public class PetrifiedLogFeature extends OreFeature {
	public static final PetrifiedLogFeature FEATURE = (PetrifiedLogFeature) new PetrifiedLogFeature().setRegistryName("purple_sands:petrified_log");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(PetrifiedLogFeatureRuleTest.INSTANCE, PurpleSandsModBlocks.PETRIFIED_LOG.defaultBlockState(), 8))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64)))).squared().count(10);
	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("deep_cold_ocean"), new ResourceLocation("frozen_ocean"),
			new ResourceLocation("warm_ocean"), new ResourceLocation("deep_warm_ocean"), new ResourceLocation("lukewarm_ocean"),
			new ResourceLocation("ocean"), new ResourceLocation("deep_lukewarm_ocean"), new ResourceLocation("cold_ocean"),
			new ResourceLocation("deep_ocean"), new ResourceLocation("deep_frozen_ocean"));

	public PetrifiedLogFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;
		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		return super.place(context);
	}

	private static class PetrifiedLogFeatureRuleTest extends RuleTest {
		static final PetrifiedLogFeatureRuleTest INSTANCE = new PetrifiedLogFeatureRuleTest();
		static final com.mojang.serialization.Codec<PetrifiedLogFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		static final RuleTestType<PetrifiedLogFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("purple_sands:petrified_log_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;
			if (blockAt.getBlock() == Blocks.STONE)
				blockCriteria = true;
			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
