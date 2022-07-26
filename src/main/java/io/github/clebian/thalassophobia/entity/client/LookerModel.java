package io.github.clebian.thalassophobia.entity.client;

import io.github.clebian.thalassophobia.Thalassophobia;
import io.github.clebian.thalassophobia.entity.custom.LookerEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LookerModel extends AnimatedGeoModel<LookerEntity> {

    @Override
    public ResourceLocation getModelLocation(LookerEntity object) {
        return new ResourceLocation(Thalassophobia.MOD_ID, "geo/looker.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(LookerEntity object) {
        return new ResourceLocation(Thalassophobia.MOD_ID, "textures/entity/looker/looker.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(LookerEntity animatable) {
        return new ResourceLocation(Thalassophobia.MOD_ID, "animations/looker.animation.json");
    }
}
