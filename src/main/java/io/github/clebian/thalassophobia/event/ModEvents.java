package io.github.clebian.thalassophobia.event;


import io.github.clebian.thalassophobia.Thalassophobia;
import io.github.clebian.thalassophobia.entity.*;
import io.github.clebian.thalassophobia.util.EntityTypesInit;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Thalassophobia.MOD_ID, bus = Bus.MOD)
public class ModEvents {

	@SubscribeEvent
	public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
		event.put(EntityTypesInit.LOOKER.get(), LookerEntity.setAttributes());
		event.put(EntityTypesInit.ANGLER_FISH.get(), AnglerFishEntity.setAttributes());
		event.put(EntityTypesInit.CRAB.get(), CrabEntity.setAttributes());
		event.put(EntityTypesInit.EEL.get(), EelEntity.setAttributes());
		event.put(EntityTypesInit.NARWHAL.get(), NarwhalEntity.setAttributes());
	}
}
