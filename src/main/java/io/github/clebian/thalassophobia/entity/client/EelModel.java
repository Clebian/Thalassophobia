package io.github.clebian.thalassophobia.entity.client;

import io.github.clebian.thalassophobia.Thalassophobia;
import io.github.clebian.thalassophobia.entity.custom.EelEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class EelModel extends AnimatedGeoModel<EelEntity> {

    @Override
    public ResourceLocation getModelLocation(EelEntity object) {
        return new ResourceLocation(Thalassophobia.MOD_ID, "geo/eel.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(EelEntity object) {
        return new ResourceLocation(Thalassophobia.MOD_ID, "textures/entity/eel/eel.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EelEntity animatable) {
        return new ResourceLocation(Thalassophobia.MOD_ID, "animations/eel.animation.json");
    }
}
