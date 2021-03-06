package io.github.clebian.thalassophobia.entity.client.render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Vector3f;
import io.github.clebian.thalassophobia.Thalassophobia;
import io.github.clebian.thalassophobia.entity.LookerEntity;
import io.github.clebian.thalassophobia.entity.client.LookerModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.animal.Cod;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class LookerRenderer extends GeoEntityRenderer<LookerEntity> {
    public LookerRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new LookerModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(LookerEntity instance) {
        return new ResourceLocation(Thalassophobia.MOD_ID, "textures/entity/looker/looker.png");
    }

    @Override
    public RenderType getRenderType(LookerEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8F, 0.8F, 0.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }

    @Override
    protected void applyRotations(LookerEntity pEntityLiving, PoseStack pMatrixStack, float pAgeInTicks, float pRotationYaw, float pPartialTicks) {
        super.applyRotations(pEntityLiving, pMatrixStack, pAgeInTicks, pRotationYaw, pPartialTicks);
        float f = 4.3F * Mth.sin(0.6F * pAgeInTicks);
        pMatrixStack.mulPose(Vector3f.YP.rotationDegrees(f));
        if (!pEntityLiving.isInWater()) {
            pMatrixStack.translate((double)0.1F, (double)0.1F, (double)-0.1F);
            pMatrixStack.mulPose(Vector3f.ZP.rotationDegrees(90.0F));
        }

    }


}
