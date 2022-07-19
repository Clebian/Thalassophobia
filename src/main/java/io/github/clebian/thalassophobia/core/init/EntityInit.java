package io.github.clebian.thalassophobia.core.init;

import io.github.clebian.thalassophobia.Thalassophobia;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityInit {
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, 
			Thalassophobia.MODID);
}
