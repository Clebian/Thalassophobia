package io.github.clebian.thalassophobia.entity.client;

import io.github.clebian.thalassophobia.Thalassophobia;
import io.github.clebian.thalassophobia.entity.custom.CrabEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CrabModel extends AnimatedGeoModel<CrabEntity> {

    @Override
    public ResourceLocation getModelLocation(CrabEntity object) {
        return new ResourceLocation(Thalassophobia.MODID, "geo/crab.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(CrabEntity object) {
        return new ResourceLocation(Thalassophobia.MODID, "textures/entity/crab/crab.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(CrabEntity animatable) {
        return new ResourceLocation(Thalassophobia.MODID, "animations/crab.animation.json");
    }
}
