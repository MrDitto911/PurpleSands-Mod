
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.purplesands.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.purplesands.client.renderer.ScorpionHuskRenderer;
import net.mcreator.purplesands.client.renderer.SandmanRenderer;
import net.mcreator.purplesands.client.renderer.SandfleaRenderer;
import net.mcreator.purplesands.client.renderer.MysteryOrbRenderer;
import net.mcreator.purplesands.client.renderer.MovingCloudRenderer;
import net.mcreator.purplesands.client.renderer.LittleBeetleRenderer;
import net.mcreator.purplesands.client.renderer.GemGolemRenderer;
import net.mcreator.purplesands.client.renderer.FlyingSkullRenderer;
import net.mcreator.purplesands.client.renderer.DesertBeetleRenderer;
import net.mcreator.purplesands.client.renderer.DeathadderRenderer;
import net.mcreator.purplesands.client.renderer.BasicOrbRenderer;
import net.mcreator.purplesands.client.renderer.AwakenedOrbRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PurpleSandsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PurpleSandsModEntities.GEM_STAFF.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PurpleSandsModEntities.MYSTERY_ORB.get(), MysteryOrbRenderer::new);
		event.registerEntityRenderer(PurpleSandsModEntities.AWAKENED_ORB.get(), AwakenedOrbRenderer::new);
		event.registerEntityRenderer(PurpleSandsModEntities.BASIC_ORB.get(), BasicOrbRenderer::new);
		event.registerEntityRenderer(PurpleSandsModEntities.SCORPION_HUSK.get(), ScorpionHuskRenderer::new);
		event.registerEntityRenderer(PurpleSandsModEntities.SANDFLEA.get(), SandfleaRenderer::new);
		event.registerEntityRenderer(PurpleSandsModEntities.DEATHADDER.get(), DeathadderRenderer::new);
		event.registerEntityRenderer(PurpleSandsModEntities.GEM_GOLEM.get(), GemGolemRenderer::new);
		event.registerEntityRenderer(PurpleSandsModEntities.SANDMAN.get(), SandmanRenderer::new);
		event.registerEntityRenderer(PurpleSandsModEntities.FLYING_SKULL.get(), FlyingSkullRenderer::new);
		event.registerEntityRenderer(PurpleSandsModEntities.DESERT_BEETLE.get(), DesertBeetleRenderer::new);
		event.registerEntityRenderer(PurpleSandsModEntities.LITTLE_BEETLE.get(), LittleBeetleRenderer::new);
		event.registerEntityRenderer(PurpleSandsModEntities.MOVING_CLOUD.get(), MovingCloudRenderer::new);
	}
}
