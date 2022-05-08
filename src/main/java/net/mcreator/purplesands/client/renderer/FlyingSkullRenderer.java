
package net.mcreator.purplesands.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.purplesands.entity.FlyingSkullEntity;
import net.mcreator.purplesands.client.model.ModelFlyingSkull;

public class FlyingSkullRenderer extends MobRenderer<FlyingSkullEntity, ModelFlyingSkull<FlyingSkullEntity>> {
	public FlyingSkullRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFlyingSkull(context.bakeLayer(ModelFlyingSkull.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FlyingSkullEntity entity) {
		return new ResourceLocation("purple_sands:textures/flyingskull.png");
	}
}
