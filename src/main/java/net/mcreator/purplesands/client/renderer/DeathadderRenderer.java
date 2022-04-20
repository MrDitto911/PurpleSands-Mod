package net.mcreator.purplesands.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.purplesands.entity.DeathadderEntity;
import net.mcreator.purplesands.client.model.ModelDeathadder;

public class DeathadderRenderer extends MobRenderer<DeathadderEntity, ModelDeathadder<DeathadderEntity>> {
	public DeathadderRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDeathadder(context.bakeLayer(ModelDeathadder.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DeathadderEntity entity) {
		return new ResourceLocation("purple_sands:textures/deathadder.png");
	}
}
