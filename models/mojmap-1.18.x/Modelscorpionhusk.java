// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelscorpionhusk<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "scorpionhusk"), "main");
	private final ModelPart body;
	private final ModelPart legRB;
	private final ModelPart legRM;
	private final ModelPart legRF;
	private final ModelPart legLB;
	private final ModelPart legLM;
	private final ModelPart legLF;
	private final ModelPart Tail;
	private final ModelPart ClayL;
	private final ModelPart ClayR;

	public Modelscorpionhusk(ModelPart root) {
		this.body = root.getChild("body");
		this.legRB = root.getChild("legRB");
		this.legRM = root.getChild("legRM");
		this.legRF = root.getChild("legRF");
		this.legLB = root.getChild("legLB");
		this.legLM = root.getChild("legLM");
		this.legLF = root.getChild("legLF");
		this.Tail = root.getChild("Tail");
		this.ClayL = root.getChild("ClayL");
		this.ClayR = root.getChild("ClayR");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-9.0F, -14.0F, -20.0F, 18.0F, 5.0F, 40.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition legRB = partdefinition.addOrReplaceChild("legRB", CubeListBuilder.create(),
				PartPose.offset(-7.6174F, 13.434F, 13.212F));

		PartDefinition cube_r1 = legRB.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(99, 70).addBox(-5.5F, -1.5F, -1.5F, 11.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.4561F, -5.434F, 9.6616F, -0.5942F, 0.5484F, -0.9136F));

		PartDefinition cube_r2 = legRB.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(13, 99).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.1456F, 9.566F, 17.5066F, 0.0F, 0.8727F, 0.0F));

		PartDefinition cube_r3 = legRB.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(101, 53).addBox(-14.25F, -1.0F, -1.0F, 13.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.1326F, -3.434F, 12.038F, 0.0F, 0.2618F, -1.5708F));

		PartDefinition cube_r4 = legRB.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 80).addBox(-6.5F, -1.5F, -1.5F, 13.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3826F, -4.184F, 3.288F, 1.4873F, 0.6725F, 1.3616F));

		PartDefinition legRM = partdefinition.addOrReplaceChild("legRM", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-7.6174F, 13.434F, -1.6074F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r5 = legRM.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(55, 98).addBox(-9.1113F, -0.7401F, 1.8736F, 11.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.3063F, -8.434F, 6.472F, -0.5942F, 0.5484F, -0.9136F));

		PartDefinition cube_r6 = legRM.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 99).addBox(-4.7394F, 2.0F, 2.5701F, 4.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.9958F, 6.566F, 13.817F, 0.0F, 0.8727F, 0.0F));

		PartDefinition cube_r7 = legRM.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(84, 98).addBox(-18.1585F, -0.1342F, 1.9957F, 13.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.9828F, -6.434F, 8.8484F, 0.0F, 0.2618F, -1.5708F));

		PartDefinition cube_r8 = legRM.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(63, 79).addBox(-6.4966F, 3.4589F, -0.8604F, 13.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2328F, -7.184F, 0.0984F, 1.4873F, 0.6725F, 1.3616F));

		PartDefinition legRF = partdefinition.addOrReplaceChild("legRF", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-7.6174F, 13.434F, -9.838F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r9 = legRF.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(26, 96).addBox(-10.8137F, -1.6219F, 5.4282F, 11.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.5685F, -8.934F, 3.1816F, -0.5942F, 0.5484F, -0.9136F));

		PartDefinition cube_r10 = legRF.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(59, 86).addBox(-6.8754F, 2.5F, 5.9628F, 4.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.258F, 6.066F, 10.5266F, 0.0F, 0.8727F, 0.0F));

		PartDefinition cube_r11 = legRF.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(96, 79).addBox(-19.6307F, 1.0706F, 5.5582F, 13.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.245F, -6.934F, 5.558F, 0.0F, 0.2618F, -1.5708F));

		PartDefinition cube_r12 = legRF.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(77, 28).addBox(-8.2994F, 6.8078F, 0.4983F, 13.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.495F, -7.684F, -3.192F, 1.4873F, 0.6725F, 1.3616F));

		PartDefinition legLB = partdefinition.addOrReplaceChild("legLB", CubeListBuilder.create(),
				PartPose.offset(8.6174F, 13.434F, 13.212F));

		PartDefinition cube_r13 = legLB.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 92).addBox(-5.5F, -1.5F, -1.5F, 11.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.4561F, -5.434F, 9.6616F, -0.5942F, -0.5484F, 0.9136F));

		PartDefinition cube_r14 = legLB.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(54, 64).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.1456F, 9.566F, 17.5066F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r15 = legLB.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(92, 93).addBox(1.25F, -1.0F, -1.0F, 13.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.1326F, -3.434F, 12.038F, 0.0F, -0.2618F, 1.5708F));

		PartDefinition cube_r16 = legLB.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(77, 21).addBox(-6.5F, -1.5F, -1.5F, 13.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3826F, -4.184F, 3.288F, 1.4873F, -0.6725F, -1.3616F));

		PartDefinition legLM = partdefinition.addOrReplaceChild("legLM", CubeListBuilder.create(),
				PartPose.offsetAndRotation(8.6174F, 13.434F, -1.6074F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r17 = legLM.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(91, 58).addBox(-1.8887F, -0.7401F, 1.8736F, 11.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3063F, -8.434F, 6.472F, -0.5942F, -0.5484F, 0.9136F));

		PartDefinition cube_r18 = legLM.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(21, 21).addBox(0.7394F, 2.0F, 2.5701F, 4.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.9958F, 6.566F, 13.817F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r19 = legLM.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(91, 65).addBox(5.1585F, -0.1342F, 1.9957F, 13.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.9828F, -6.434F, 8.8484F, 0.0F, -0.2618F, 1.5708F));

		PartDefinition cube_r20 = legLM.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(77, 14).addBox(-6.5034F, 3.4589F, -0.8604F, 13.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2328F, -7.184F, 0.0984F, 1.4873F, -0.6725F, -1.3616F));

		PartDefinition legLF = partdefinition.addOrReplaceChild("legLF", CubeListBuilder.create(),
				PartPose.offsetAndRotation(8.6174F, 13.434F, -9.838F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r21 = legLF.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(84, 86).addBox(-0.1863F, -1.6219F, 5.4282F, 11.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.6026F, -8.934F, 2.9228F, -0.5942F, -0.5484F, 0.9136F));

		PartDefinition cube_r22 = legLF.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(21, 16).addBox(2.8754F, 2.5F, 5.9628F, 4.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.2921F, 6.066F, 10.2678F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r23 = legLF.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(77, 35).addBox(6.6307F, 1.0706F, 5.5582F, 13.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.2791F, -6.934F, 5.2992F, 0.0F, -0.2618F, 1.5708F));

		PartDefinition cube_r24 = legLF.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(77, 7).addBox(-4.7006F, 6.8078F, 0.4983F, 13.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5291F, -7.684F, -3.4508F, 1.4873F, -0.6725F, -1.3616F));

		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail",
				CubeListBuilder.create().texOffs(0, 32)
						.addBox(-8.0F, -13.0F, 20.0F, 16.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(70, 53)
						.addBox(-7.0F, -13.0F, 22.0F, 14.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 87)
						.addBox(-5.0F, -13.0F, 23.0F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 6)
						.addBox(-3.0F, -13.0F, 24.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 64)
						.addBox(-4.0F, -42.2522F, 16.7042F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(21, 0)
						.addBox(-3.0F, -41.2522F, 15.7042F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -40.2522F, 12.7042F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(-0.5F, -39.2522F, 11.7042F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r25 = Tail.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(25, 80).addBox(-2.0F, -1.5F, -3.0F, 4.0F, 3.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -34.7522F, 26.7042F, 2.2689F, 0.0F, 0.0F));

		PartDefinition cube_r26 = Tail.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(42, 84).addBox(-2.0F, -1.5F, -3.0F, 4.0F, 3.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -28.2522F, 30.2042F, 1.9635F, 0.0F, 0.0F));

		PartDefinition cube_r27 = Tail.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(67, 86).addBox(-2.0F, -1.5F, -3.0F, 4.0F, 3.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -21.2522F, 31.2042F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r28 = Tail.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(29, 46).addBox(-2.0F, -1.5F, -3.0F, 4.0F, 3.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -16.2522F, 30.2042F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r29 = Tail
				.addOrReplaceChild("cube_r29",
						CubeListBuilder.create().texOffs(21, 64).addBox(-2.0F, -2.0F, 2.0F, 4.0F, 3.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -10.0F, 22.5F, 0.48F, 0.0F, 0.0F));

		PartDefinition ClayL = partdefinition.addOrReplaceChild("ClayL", CubeListBuilder.create().texOffs(41, 46)
				.addBox(10.1875F, -3.75F, -18.125F, 8.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(33, 64)
				.addBox(17.1875F, -2.75F, -26.125F, 4.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
				.addBox(7.1875F, -2.75F, -26.125F, 4.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.5625F, 12.75F, -15.875F));

		PartDefinition cube_r30 = ClayL.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(77, 0).addBox(-7.0F, -1.5F, -1.5F, 14.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.4375F, -0.25F, -3.625F, 0.0F, 0.6109F, -0.0873F));

		PartDefinition ClayR = partdefinition.addOrReplaceChild("ClayR", CubeListBuilder.create().texOffs(0, 46)
				.addBox(-18.1875F, -3.75F, -18.125F, 8.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
				.addBox(-21.1875F, -2.75F, -26.125F, 4.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-11.1875F, -2.75F, -26.125F, 4.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-8.5625F, 12.75F, -15.875F));

		PartDefinition cube_r31 = ClayR.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(70, 46).addBox(-7.0F, -1.5F, -1.5F, 14.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.4375F, -0.25F, -3.625F, 0.0F, -0.6109F, 0.0873F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legRB.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legRM.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legRF.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legLB.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legLM.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legLF.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ClayL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ClayR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.legRF.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.ClayR.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.legLB.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legRM.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legLF.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.ClayL.yRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.legLM.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legRB.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}