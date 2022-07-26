package io.github.clebian.thalassophobia.event;


import io.github.clebian.thalassophobia.Thalassophobia;
import io.github.clebian.thalassophobia.entity.ModEntityTypes;
import io.github.clebian.thalassophobia.entity.custom.*;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Thalassophobia.MOD_ID, bus = Bus.MOD)
public class ModEventBusEvents {

	@SubscribeEvent
	public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
		event.put(ModEntityTypes.LOOKER.get(), LookerEntity.setAttributes());
		event.put(ModEntityTypes.ANGLER_FISH.get(), AnglerFishEntity.setAttributes());
		event.put(ModEntityTypes.CRAB.get(), CrabEntity.setAttributes());
		event.put(ModEntityTypes.EEL.get(), EelEntity.setAttributes());
		event.put(ModEntityTypes.NARWHAL.get(), NarwhalEntity.setAttributes());
	}
}
