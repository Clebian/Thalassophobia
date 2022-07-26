package io.github.clebian.thalassophobia.entity.client;

import io.github.clebian.thalassophobia.Thalassophobia;
import io.github.clebian.thalassophobia.entity.custom.AnglerFishEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AnglerFishModel extends AnimatedGeoModel<AnglerFishEntity> {

    @Override
    public ResourceLocation getModelLocation(AnglerFishEntity object) {
        return new ResourceLocation(Thalassophobia.MOD_ID, "geo/angler_fish.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(AnglerFishEntity object) {
        return new ResourceLocation(Thalassophobia.MOD_ID, "textures/entity/angler_fish/angler_fish.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(AnglerFishEntity animatable) {
        return new ResourceLocation(Thalassophobia.MOD_ID, "animations/angler_fish.animation.json");
    }
}
