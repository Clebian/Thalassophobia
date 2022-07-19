package io.github.clebian.thalassophobia.core.init;

import io.github.clebian.thalassophobia.Thalassophobia;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class SoundInit {

	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, 
			Thalassophobia.MODID);
			
	
	public static RegistryObject<SoundEvent> createEvent(String sound){
		return SOUNDS.register(sound, () -> new SoundEvent(new ResourceLocation(Thalassophobia.MODID, sound)));
	}
}
