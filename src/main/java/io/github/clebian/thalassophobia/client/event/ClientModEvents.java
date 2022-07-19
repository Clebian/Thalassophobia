package io.github.clebian.thalassophobia.client.event;


import io.github.clebian.thalassophobia.Thalassophobia;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Thalassophobia.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public final class ClientModEvents {
	
	public ClientModEvents(){}

}
