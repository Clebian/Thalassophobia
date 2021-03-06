package io.github.clebian.thalassophobia.util;

import io.github.clebian.thalassophobia.Thalassophobia;
import io.github.clebian.thalassophobia.entity.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("unused")
public class EntityTypesInit {
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
			DeferredRegister.create(ForgeRegistries.ENTITIES, Thalassophobia.MOD_ID);

	public static final RegistryObject<EntityType<LookerEntity>> LOOKER =
			ENTITY_TYPES.register("looker",
					() -> EntityType.Builder.of(LookerEntity::new, MobCategory.CREATURE)
							.sized(0.8f, 0.6f)
							.build(new ResourceLocation(Thalassophobia.MOD_ID, "looker").toString()));
	public static final RegistryObject<EntityType<AnglerFishEntity>> ANGLER_FISH =
			ENTITY_TYPES.register("angler_fish",
					() -> EntityType.Builder.of(AnglerFishEntity::new, MobCategory.CREATURE)
							.sized(0.8f, 0.6f)
							.build(new ResourceLocation(Thalassophobia.MOD_ID, "angler_fish").toString()));
	public static final RegistryObject<EntityType<CrabEntity>> CRAB =
			ENTITY_TYPES.register("crab",
					() -> EntityType.Builder.of(CrabEntity::new, MobCategory.CREATURE)
							.sized(0.8f, 0.6f)
							.build(new ResourceLocation(Thalassophobia.MOD_ID, "crab").toString()));
	public static final RegistryObject<EntityType<EelEntity>> EEL =
			ENTITY_TYPES.register("eel",
					() -> EntityType.Builder.of(EelEntity::new, MobCategory.CREATURE)
							.sized(0.8f, 0.6f)
							.build(new ResourceLocation(Thalassophobia.MOD_ID, "eel").toString()));
	public static final RegistryObject<EntityType<NarwhalEntity>> NARWHAL =
			ENTITY_TYPES.register("narwhal",
					() -> EntityType.Builder.of(NarwhalEntity::new, MobCategory.CREATURE)
							.sized(0.8f, 0.6f)
							.build(new ResourceLocation(Thalassophobia.MOD_ID, "narwhal").toString()));


	public static void register(IEventBus eventBus) {
		ENTITY_TYPES.register(eventBus);
	}
}
