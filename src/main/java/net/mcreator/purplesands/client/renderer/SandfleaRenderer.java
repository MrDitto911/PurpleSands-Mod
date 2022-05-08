
package net.mcreator.purplesands.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.purplesands.entity.SandfleaEntity;
import net.mcreator.purplesands.client.model.ModelSandFlea;

public class SandfleaRenderer extends MobRenderer<SandfleaEntity, ModelSandFlea<SandfleaEntity>> {
	public SandfleaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSandFlea(context.bakeLayer(ModelSandFlea.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SandfleaEntity entity) {
		return new ResourceLocation("purple_sands:textures/sandflea.png");
	}
}
