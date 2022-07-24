package io.github.clebian.thalassophobia.sound;

import io.github.clebian.thalassophobia.Thalassophobia;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModSounds {

	public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,
			Thalassophobia.MODID);
			
	public static RegistryObject<SoundEvent> LEVIATHAN_TRILOGY = createEvent("leviathan_trilogy");
	public static RegistryObject<SoundEvent> SUNKEN_SEA= createEvent("sunken_sea");


	public static RegistryObject<SoundEvent> createEvent(String sound){
		return SOUND_EVENTS.register(sound, () -> new SoundEvent(new ResourceLocation(Thalassophobia.MODID, sound)));
	}

	public static void register(IEventBus bus){
		SOUND_EVENTS.register(bus);
	}
}
