package io.github.clebian.thalassophobia.event;


import io.github.clebian.thalassophobia.Thalassophobia;
import io.github.clebian.thalassophobia.entity.ModEntityTypes;
import io.github.clebian.thalassophobia.entity.custom.LookerEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Thalassophobia.MODID, bus = Bus.MOD)
public class ModEventBusEvents {

	@SubscribeEvent
	public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
		event.put(ModEntityTypes.LOOKER.get(), LookerEntity.setAttributes());
	}
	
	
}
