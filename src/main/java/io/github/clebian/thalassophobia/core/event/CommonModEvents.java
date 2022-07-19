package io.github.clebian.thalassophobia.core.event;


import io.github.clebian.thalassophobia.Thalassophobia;
import io.github.clebian.thalassophobia.core.world.OreGeneration;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = Thalassophobia.MODID, bus = Bus.MOD)
public class CommonModEvents {

	@SubscribeEvent
	public static void commonSetup(FMLCommonSetupEvent event) {
		event.enqueueWork(OreGeneration::registerOres);
	}
	
	
}
