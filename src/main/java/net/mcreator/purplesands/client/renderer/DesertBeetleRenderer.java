
package net.mcreator.purplesands.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.purplesands.entity.DesertBeetleEntity;
import net.mcreator.purplesands.client.model.Modelbeetle;

public class DesertBeetleRenderer extends MobRenderer<DesertBeetleEntity, Modelbeetle<DesertBeetleEntity>> {
	public DesertBeetleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbeetle(context.bakeLayer(Modelbeetle.LAYER_LOCATION)), 1.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(DesertBeetleEntity entity) {
		return new ResourceLocation("purple_sands:textures/beetletexture.png");
	}
}
