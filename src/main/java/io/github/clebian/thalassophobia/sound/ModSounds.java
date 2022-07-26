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
			Thalassophobia.MOD_ID);
			
	public static RegistryObject<SoundEvent> LEVIATHAN_TRILOGY = createEvent("leviathan_trilogy");
	public static RegistryObject<SoundEvent> SUNKEN_SEA= createEvent("sunken_sea");
	public static RegistryObject<SoundEvent> GUARDIAN_OF_THE_FORMER_SEAS= createEvent("guardian_of_the_former_seas");
	public static RegistryObject<SoundEvent> HADOPELAGIC_PRESSURE= createEvent("hadopelagic_pressure");
	public static RegistryObject<SoundEvent> THREATS_OF_THE_OCEAN_FLOOR= createEvent("threats_of_the_ocean_floor");
	public static RegistryObject<SoundEvent> VOID= createEvent("void");
	public static RegistryObject<SoundEvent> WASTELAND= createEvent("wasteland");


	public static RegistryObject<SoundEvent> createEvent(String sound){
		return SOUND_EVENTS.register(sound, () -> new SoundEvent(new ResourceLocation(Thalassophobia.MOD_ID, sound)));
	}
}
