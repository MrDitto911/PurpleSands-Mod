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

// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelDeathadder<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("purple_sands", "model_deathadder"), "main");
	public final ModelPart head;
	public final ModelPart group1;
	public final ModelPart group2;
	public final ModelPart tail;

	public ModelDeathadder(ModelPart root) {
		this.head = root.getChild("head");
		this.group1 = root.getChild("group1");
		this.group2 = root.getChild("group2");
		this.tail = root.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -4.2857F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 6)
						.addBox(-2.0F, 0.0F, -3.2857F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 19)
						.addBox(1.0F, 0.0F, -3.2857F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(-1.0F, -1.0F, -3.2857F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 0)
						.addBox(1.0F, -1.0F, -2.2857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 0)
						.addBox(-2.0F, -1.0F, -2.2857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-2.0F, -1.0F, -1.2857F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 23.0F, -3.7143F));
		PartDefinition group1 = partdefinition.addOrReplaceChild("group1",
				CubeListBuilder.create().texOffs(18, 13).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 17)
						.addBox(-1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 2)
						.addBox(-1.0F, -1.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 15)
						.addBox(-1.0F, -1.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-1.0F, -1.0F, 8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 7)
						.addBox(-1.0F, -1.0F, 10.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 13)
						.addBox(-1.0F, -1.0F, 12.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 13)
						.addBox(-1.0F, -1.0F, 14.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 13).addBox(-1.0F, -1.0F, 16.0F, 2.0F,
								2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 23.0F, -4.0F, 0.0F, 0.0F, 0.0F));
		PartDefinition group2 = partdefinition.addOrReplaceChild("group2",
				CubeListBuilder.create().texOffs(12, 11).addBox(-1.0F, -1.0F, -14.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 11)
						.addBox(-1.0F, -1.0F, -16.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 11)
						.addBox(-1.0F, -1.0F, -18.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(-1.0F, -1.0F, -12.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 0)
						.addBox(-1.0F, -1.0F, -10.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 9)
						.addBox(-1.0F, -1.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 5)
						.addBox(-1.0F, -1.0F, -6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 23.0F, 20.0F));
		PartDefinition tail = partdefinition.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(18, 17).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 20.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		head.render(poseStack, buffer, packedLight, packedOverlay);
		group1.render(poseStack, buffer, packedLight, packedOverlay);
		group2.render(poseStack, buffer, packedLight, packedOverlay);
		tail.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.group2.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.group1.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
