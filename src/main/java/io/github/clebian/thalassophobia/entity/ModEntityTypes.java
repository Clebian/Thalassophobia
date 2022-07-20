package io.github.clebian.thalassophobia.entity;

import io.github.clebian.thalassophobia.Thalassophobia;
import io.github.clebian.thalassophobia.entity.custom.LookerEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, 
			Thalassophobia.MODID);


	public static final RegistryObject<EntityType<LookerEntity>> LOOKER =
			ENTITIES.register("looker",
					() -> EntityType.Builder.of(LookerEntity::new, MobCategory.WATER_AMBIENT)
							.sized(0.5F, 0.3F)
							.clientTrackingRange(4)
							.build(new ResourceLocation(Thalassophobia.MODID, "looker").toString()));
}
