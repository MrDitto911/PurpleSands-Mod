
package net.mcreator.purplesands.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.purplesands.entity.SandmanEntity;
import net.mcreator.purplesands.client.model.ModelSandman;

public class SandmanRenderer extends MobRenderer<SandmanEntity, ModelSandman<SandmanEntity>> {
	public SandmanRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSandman(context.bakeLayer(ModelSandman.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SandmanEntity entity) {
		return new ResourceLocation("purple_sands:textures/sandmanskin.png");
	}
}
