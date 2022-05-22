
package net.mcreator.purplesands.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.purplesands.entity.MovingCloudEntity;
import net.mcreator.purplesands.client.model.Modelmovingcloud;

public class MovingCloudRenderer extends MobRenderer<MovingCloudEntity, Modelmovingcloud<MovingCloudEntity>> {
	public MovingCloudRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmovingcloud(context.bakeLayer(Modelmovingcloud.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(MovingCloudEntity entity) {
		return new ResourceLocation("purple_sands:textures/movingcloudtexture.png");
	}
}
