package io.github.clebian.thalassophobia.world.dimension;

import io.github.clebian.thalassophobia.Thalassophobia;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class ModDimensions {

    public static final ResourceKey<Level> TWILIGHT_LAYER_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(Thalassophobia.MOD_ID, "twilight_layer"));
    public static final ResourceKey<DimensionType> TWILIGHT_LAYER_TYPE =
            ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, TWILIGHT_LAYER_KEY.getRegistryName());

    public static void register(){
        System.out.println("Registering ModDimensions for "+ Thalassophobia.MOD_ID);
    }
}
