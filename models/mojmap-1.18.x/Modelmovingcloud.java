// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmovingcloud<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "movingcloud"), "main");
	private final ModelPart body;

	public Modelmovingcloud(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(576, 216)
				.addBox(-96.0F, -12.0F, -96.0F, 192.0F, 4.0F, 192.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0)
				.addBox(96.0F, -12.0F, 96.0F, 192.0F, 12.0F, 192.0F, new CubeDeformation(0.0F)).texOffs(0, 204)
				.addBox(-288.0F, -12.0F, 96.0F, 192.0F, 12.0F, 192.0F, new CubeDeformation(0.0F)).texOffs(0, 408)
				.addBox(-288.0F, -12.0F, -288.0F, 192.0F, 12.0F, 192.0F, new CubeDeformation(0.0F)).texOffs(576, 12)
				.addBox(96.0F, -12.0F, -288.0F, 192.0F, 12.0F, 192.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
				.addBox(-32.0F, -8.0F, 80.0F, 20.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-96.0F, -8.0F, 80.0F, 40.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
				.addBox(56.0F, -8.0F, 80.0F, 40.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(52, 44)
				.addBox(12.0F, -8.0F, 80.0F, 20.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 612)
				.addBox(-96.0F, -8.0F, -96.0F, 192.0F, 4.0F, 176.0F, new CubeDeformation(0.0F)).texOffs(576, 420)
				.addBox(-96.0F, -4.0F, -96.0F, 192.0F, 4.0F, 192.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		return LayerDefinition.create(meshdefinition, 2048, 2048);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}