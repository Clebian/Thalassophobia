package io.github.clebian.thalassophobia.entity.client;

import io.github.clebian.thalassophobia.Thalassophobia;
import io.github.clebian.thalassophobia.entity.custom.NarwhalEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class NarwhalModel extends AnimatedGeoModel<NarwhalEntity> {

    @Override
    public ResourceLocation getModelLocation(NarwhalEntity object) {
        return new ResourceLocation(Thalassophobia.MODID, "geo/narwhal.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(NarwhalEntity object) {
        return new ResourceLocation(Thalassophobia.MODID, "textures/entity/narwhal/narwhal.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(NarwhalEntity animatable) {
        return new ResourceLocation(Thalassophobia.MODID, "animations/narwhal.animation.json");
    }
}
