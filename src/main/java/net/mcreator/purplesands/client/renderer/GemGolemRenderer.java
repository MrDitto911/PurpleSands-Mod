package net.mcreator.purplesands.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.purplesands.entity.GemGolemEntity;
import net.mcreator.purplesands.client.model.ModelGemGolem;

public class GemGolemRenderer extends MobRenderer<GemGolemEntity, ModelGemGolem<GemGolemEntity>> {
	public GemGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGemGolem(context.bakeLayer(ModelGemGolem.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GemGolemEntity entity) {
		return new ResourceLocation("purple_sands:textures/gem_golem.png");
	}
}
