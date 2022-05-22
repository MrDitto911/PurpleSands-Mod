
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.purplesands.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.purplesands.client.model.Modelscorpionhusk;
import net.mcreator.purplesands.client.model.Modelmovingcloud;
import net.mcreator.purplesands.client.model.Modelbeetlearmor;
import net.mcreator.purplesands.client.model.Modelbeetle;
import net.mcreator.purplesands.client.model.ModelSandman;
import net.mcreator.purplesands.client.model.ModelSandFlea;
import net.mcreator.purplesands.client.model.ModelMagicProjectile;
import net.mcreator.purplesands.client.model.ModelGemGolem;
import net.mcreator.purplesands.client.model.ModelFlyingSkull;
import net.mcreator.purplesands.client.model.ModelDeathadder;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PurpleSandsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelbeetlearmor.LAYER_LOCATION, Modelbeetlearmor::createBodyLayer);
		event.registerLayerDefinition(ModelMagicProjectile.LAYER_LOCATION, ModelMagicProjectile::createBodyLayer);
		event.registerLayerDefinition(ModelDeathadder.LAYER_LOCATION, ModelDeathadder::createBodyLayer);
		event.registerLayerDefinition(ModelFlyingSkull.LAYER_LOCATION, ModelFlyingSkull::createBodyLayer);
		event.registerLayerDefinition(Modelscorpionhusk.LAYER_LOCATION, Modelscorpionhusk::createBodyLayer);
		event.registerLayerDefinition(ModelSandman.LAYER_LOCATION, ModelSandman::createBodyLayer);
		event.registerLayerDefinition(ModelSandFlea.LAYER_LOCATION, ModelSandFlea::createBodyLayer);
		event.registerLayerDefinition(Modelmovingcloud.LAYER_LOCATION, Modelmovingcloud::createBodyLayer);
		event.registerLayerDefinition(ModelGemGolem.LAYER_LOCATION, ModelGemGolem::createBodyLayer);
		event.registerLayerDefinition(Modelbeetle.LAYER_LOCATION, Modelbeetle::createBodyLayer);
	}
}
