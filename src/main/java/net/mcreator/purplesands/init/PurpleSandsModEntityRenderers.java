
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.purplesands.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.purplesands.client.renderer.SandfleaRenderer;
import net.mcreator.purplesands.client.renderer.GemGolemRenderer;
import net.mcreator.purplesands.client.renderer.DeathadderRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PurpleSandsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PurpleSandsModEntities.SANDFLEA, SandfleaRenderer::new);
		event.registerEntityRenderer(PurpleSandsModEntities.DEATHADDER, DeathadderRenderer::new);
		event.registerEntityRenderer(PurpleSandsModEntities.GEM_GOLEM, GemGolemRenderer::new);
		event.registerEntityRenderer(PurpleSandsModEntities.GEM_STAFF, ThrownItemRenderer::new);
		event.registerEntityRenderer(PurpleSandsModEntities.MYSTERY_ORB, ThrownItemRenderer::new);
		event.registerEntityRenderer(PurpleSandsModEntities.AWAKENED_ORB, ThrownItemRenderer::new);
	}
}
