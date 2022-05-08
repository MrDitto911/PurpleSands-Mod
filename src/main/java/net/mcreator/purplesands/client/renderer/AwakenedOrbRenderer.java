package net.mcreator.purplesands.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.purplesands.entity.AwakenedOrbEntity;
import net.mcreator.purplesands.client.model.ModelMagicProjectile;

import com.mojang.math.Vector3f;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AwakenedOrbRenderer extends EntityRenderer<AwakenedOrbEntity> {
	private static final ResourceLocation texture = new ResourceLocation("purple_sands:textures/magictexture.png");
	private final ModelMagicProjectile model;

	public AwakenedOrbRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new ModelMagicProjectile(context.bakeLayer(ModelMagicProjectile.LAYER_LOCATION));
	}

	@Override
	public void render(AwakenedOrbEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn,
			int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Vector3f.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(AwakenedOrbEntity entity) {
		return texture;
	}
}
