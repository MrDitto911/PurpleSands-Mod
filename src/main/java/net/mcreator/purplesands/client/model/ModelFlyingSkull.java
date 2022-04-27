package net.mcreator.purplesands.client.model;

import org.apache.logging.log4j.core.Core;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelFlyingSkull<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("purple_sands", "model_flying_skull"),
			"main");
	public final ModelPart head;
	public final ModelPart Jaw;
	public final ModelPart Core;

	public ModelFlyingSkull(ModelPart root) {
		this.head = root.getChild("head");
		this.Jaw = root.getChild("Jaw");
		this.Core = root.getChild("Core");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 18).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 7)
						.addBox(3.0F, -8.0F, -3.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(-4.0F, -8.0F, -3.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(18, 18)
						.addBox(-4.0F, -8.0F, 3.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 30)
						.addBox(1.0F, -4.0F, 3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 24)
						.addBox(-3.0F, -2.0F, 3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 30)
						.addBox(-3.0F, -4.0F, 3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 30)
						.addBox(3.0F, -6.0F, 3.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 30)
						.addBox(-4.0F, -6.0F, 3.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(-1.0F, -6.0F, 3.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -8.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(24, 26)
						.addBox(-3.0F, -3.0F, -3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 24)
						.addBox(-4.0F, -3.0F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(3.0F, -3.0F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(24, 0).addBox(-3.0F, -2.0F, -2.0F, 6.0F,
								1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition Jaw = partdefinition.addOrReplaceChild("Jaw",
				CubeListBuilder.create().texOffs(28, 7).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition Core = partdefinition.addOrReplaceChild("Core",
				CubeListBuilder.create().texOffs(36, 18).addBox(-3.0F, -7.0F, 1.0F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Jaw.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Core.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Jaw.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
