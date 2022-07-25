package io.github.clebian.thalassophobia.entity;

import io.github.clebian.thalassophobia.Thalassophobia;
import io.github.clebian.thalassophobia.entity.custom.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
			DeferredRegister.create(ForgeRegistries.ENTITIES, Thalassophobia.MODID);

	public static final RegistryObject<EntityType<LookerEntity>> LOOKER =
			ENTITY_TYPES.register("looker",
					() -> EntityType.Builder.of(LookerEntity::new, MobCategory.CREATURE)
							.sized(0.8f, 0.6f)
							.build(new ResourceLocation(Thalassophobia.MODID, "looker").toString()));
	public static final RegistryObject<EntityType<AnglerFishEntity>> ANGLER_FISH =
			ENTITY_TYPES.register("angler_fish",
					() -> EntityType.Builder.of(AnglerFishEntity::new, MobCategory.CREATURE)
							.sized(0.8f, 0.6f)
							.build(new ResourceLocation(Thalassophobia.MODID, "angler_fish").toString()));
	public static final RegistryObject<EntityType<CrabEntity>> CRAB =
			ENTITY_TYPES.register("crab",
					() -> EntityType.Builder.of(CrabEntity::new, MobCategory.CREATURE)
							.sized(0.8f, 0.6f)
							.build(new ResourceLocation(Thalassophobia.MODID, "crab").toString()));
	public static final RegistryObject<EntityType<EelEntity>> EEL =
			ENTITY_TYPES.register("eel",
					() -> EntityType.Builder.of(EelEntity::new, MobCategory.CREATURE)
							.sized(0.8f, 0.6f)
							.build(new ResourceLocation(Thalassophobia.MODID, "eel").toString()));
	public static final RegistryObject<EntityType<NarwhalEntity>> NARWHAL =
			ENTITY_TYPES.register("narwhal",
					() -> EntityType.Builder.of(NarwhalEntity::new, MobCategory.CREATURE)
							.sized(0.8f, 0.6f)
							.build(new ResourceLocation(Thalassophobia.MODID, "narwhal").toString()));


	public static void register(IEventBus eventBus) {
		ENTITY_TYPES.register(eventBus);
	}
}
