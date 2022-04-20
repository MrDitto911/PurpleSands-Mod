// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelSandFlea<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "sandflea"), "main");
	private final ModelPart LeftAnt;
	private final ModelPart RightAnt;
	private final ModelPart Body1;
	private final ModelPart Body2;
	private final ModelPart Body3;
	private final ModelPart RL1;
	private final ModelPart RL2;
	private final ModelPart RL3;
	private final ModelPart LL1;
	private final ModelPart LL2;
	private final ModelPart LL3;
	private final ModelPart bb_main;

	public ModelSandFlea(ModelPart root) {
		this.LeftAnt = root.getChild("LeftAnt");
		this.RightAnt = root.getChild("RightAnt");
		this.Body1 = root.getChild("Body1");
		this.Body2 = root.getChild("Body2");
		this.Body3 = root.getChild("Body3");
		this.RL1 = root.getChild("RL1");
		this.RL2 = root.getChild("RL2");
		this.RL3 = root.getChild("RL3");
		this.LL1 = root.getChild("LL1");
		this.LL2 = root.getChild("LL2");
		this.LL3 = root.getChild("LL3");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition LeftAnt = partdefinition.addOrReplaceChild("LeftAnt",
				CubeListBuilder.create().texOffs(10, 15)
						.addBox(0.75F, -0.5F, -3.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 0)
						.addBox(-0.25F, -0.5F, -2.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.25F, 22.5F, -4.75F));

		PartDefinition RightAnt = partdefinition.addOrReplaceChild("RightAnt",
				CubeListBuilder.create().texOffs(15, 5)
						.addBox(-0.75F, -0.5F, -2.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(15, 10)
						.addBox(-2.75F, -0.5F, -3.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.25F, 22.5F, -4.75F));

		PartDefinition Body1 = partdefinition.addOrReplaceChild("Body1", CubeListBuilder.create().texOffs(0, 10).addBox(
				-3.0F, -3.0F, -3.0F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body2 = partdefinition.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(0, 5).addBox(
				-3.0F, -3.0F, 0.0F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body3 = partdefinition.addOrReplaceChild("Body3", CubeListBuilder.create().texOffs(0, 0).addBox(
				-3.0F, -3.0F, 3.0F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition RL1 = partdefinition.addOrReplaceChild("RL1", CubeListBuilder.create().texOffs(18, 12).addBox(
				-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 23.0F, -1.5F));

		PartDefinition RL2 = partdefinition.addOrReplaceChild("RL2", CubeListBuilder.create().texOffs(18, 3).addBox(
				-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 23.0F, 1.5F));

		PartDefinition RL3 = partdefinition.addOrReplaceChild("RL3", CubeListBuilder.create().texOffs(12, 17).addBox(
				-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 23.0F, 4.5F));

		PartDefinition LL1 = partdefinition.addOrReplaceChild("LL1", CubeListBuilder.create().texOffs(18, 8).addBox(
				-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 23.0F, -1.5F));

		PartDefinition LL2 = partdefinition.addOrReplaceChild("LL2", CubeListBuilder.create().texOffs(17, 14).addBox(
				-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 23.0F, 1.5F));

		PartDefinition LL3 = partdefinition.addOrReplaceChild("LL3", CubeListBuilder.create().texOffs(15, 16).addBox(
				-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 23.0F, 4.5F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 15)
				.addBox(-2.0F, -3.0F, -5.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		LeftAnt.render(poseStack, buffer, packedLight, packedOverlay);
		RightAnt.render(poseStack, buffer, packedLight, packedOverlay);
		Body1.render(poseStack, buffer, packedLight, packedOverlay);
		Body2.render(poseStack, buffer, packedLight, packedOverlay);
		Body3.render(poseStack, buffer, packedLight, packedOverlay);
		RL1.render(poseStack, buffer, packedLight, packedOverlay);
		RL2.render(poseStack, buffer, packedLight, packedOverlay);
		RL3.render(poseStack, buffer, packedLight, packedOverlay);
		LL1.render(poseStack, buffer, packedLight, packedOverlay);
		LL2.render(poseStack, buffer, packedLight, packedOverlay);
		LL3.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LL1.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.LL3.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.LL2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftAnt.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RL1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.RL3.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.RL2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightAnt.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}