
package net.mcreator.purplesands.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SilverfishModel;

import net.mcreator.purplesands.entity.LittleBeetleEntity;

public class LittleBeetleRenderer extends MobRenderer<LittleBeetleEntity, SilverfishModel<LittleBeetleEntity>> {
	public LittleBeetleRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel(context.bakeLayer(ModelLayers.SILVERFISH)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LittleBeetleEntity entity) {
		return new ResourceLocation("purple_sands:textures/littlebeetle.png");
	}
}
