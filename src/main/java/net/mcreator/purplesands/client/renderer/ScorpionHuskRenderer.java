
package net.mcreator.purplesands.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.purplesands.entity.ScorpionHuskEntity;
import net.mcreator.purplesands.client.model.Modelscorpionhusk;

public class ScorpionHuskRenderer extends MobRenderer<ScorpionHuskEntity, Modelscorpionhusk<ScorpionHuskEntity>> {
	public ScorpionHuskRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelscorpionhusk(context.bakeLayer(Modelscorpionhusk.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(ScorpionHuskEntity entity) {
		return new ResourceLocation("purple_sands:textures/scorpionhusk.png");
	}
}
