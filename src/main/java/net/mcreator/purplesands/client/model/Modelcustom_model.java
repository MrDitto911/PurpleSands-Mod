package net.mcreator.purplesands.client.model;

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
public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("purple_sands", "modelcustom_model"), "main");
	public final ModelPart head;
	public final ModelPart body2;
	public final ModelPart Leg1;
	public final ModelPart Leg2;
	public final ModelPart Leg3;
	public final ModelPart Leg4;
	public final ModelPart Leg5;
	public final ModelPart Leg6;
	public final ModelPart Leg7;
	public final ModelPart Leg8;
	public final ModelPart jawl;
	public final ModelPart jawr;

	public Modelcustom_model(ModelPart root) {
		this.head = root.getChild("head");
		this.body2 = root.getChild("body2");
		this.Leg1 = root.getChild("Leg1");
		this.Leg2 = root.getChild("Leg2");
		this.Leg3 = root.getChild("Leg3");
		this.Leg4 = root.getChild("Leg4");
		this.Leg5 = root.getChild("Leg5");
		this.Leg6 = root.getChild("Leg6");
		this.Leg7 = root.getChild("Leg7");
		this.Leg8 = root.getChild("Leg8");
		this.jawl = root.getChild("jawl");
		this.jawr = root.getChild("jawr");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 44).addBox(-8.0F, -6.0F, -8.0F, 16.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 16.0F, -12.5F));
		PartDefinition body2 = partdefinition.addOrReplaceChild("body2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -14.0F, -12.5F, 24.0F, 16.0F, 28.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 20.0F, 0.0F));
		PartDefinition Leg1 = partdefinition.addOrReplaceChild("Leg1",
				CubeListBuilder.create().texOffs(0, 79).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(9.0F, 22.0F, -9.0F));
		PartDefinition Leg2 = partdefinition.addOrReplaceChild("Leg2",
				CubeListBuilder.create().texOffs(40, 75).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-9.0F, 22.0F, -9.0F));
		PartDefinition Leg3 = partdefinition.addOrReplaceChild("Leg3",
				CubeListBuilder.create().texOffs(32, 75).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(9.0F, 22.0F, 12.0F));
		PartDefinition Leg4 = partdefinition.addOrReplaceChild("Leg4",
				CubeListBuilder.create().texOffs(24, 75).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-9.0F, 22.0F, 12.0F));
		PartDefinition Leg5 = partdefinition.addOrReplaceChild("Leg5",
				CubeListBuilder.create().texOffs(16, 75).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(9.0F, 22.0F, 5.0F));
		PartDefinition Leg6 = partdefinition.addOrReplaceChild("Leg6",
				CubeListBuilder.create().texOffs(8, 75).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(9.0F, 22.0F, -2.0F));
		PartDefinition Leg7 = partdefinition.addOrReplaceChild("Leg7",
				CubeListBuilder.create().texOffs(0, 75).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-9.0F, 22.0F, -2.0F));
		PartDefinition Leg8 = partdefinition.addOrReplaceChild("Leg8",
				CubeListBuilder.create().texOffs(26, 68).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-9.0F, 22.0F, 5.0F));
		PartDefinition jawl = partdefinition.addOrReplaceChild("jawl",
				CubeListBuilder.create().texOffs(0, 64).addBox(-1.0F, -0.5F, -10.2F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(16, 81)
						.addBox(-2.0F, -0.5F, -9.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 79)
						.addBox(-2.0F, -0.5F, -7.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 81)
						.addBox(-2.0F, -0.5F, -4.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 66)
						.addBox(-3.0F, -0.5F, -11.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 20.5F, -20.3F));
		PartDefinition jawr = partdefinition.addOrReplaceChild("jawr",
				CubeListBuilder.create().texOffs(48, 44).addBox(-2.0F, -0.5F, -10.2F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(12, 79)
						.addBox(1.0F, -0.5F, -4.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 81)
						.addBox(1.0F, -0.5F, -9.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 79)
						.addBox(1.0F, -0.5F, -7.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 64)
						.addBox(-1.0F, -0.5F, -11.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 20.5F, -20.3F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg8.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		jawl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		jawr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Leg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Leg3.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Leg4.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Leg5.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.jawr.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Leg1.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Leg6.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Leg7.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.jawl.yRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.Leg8.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
