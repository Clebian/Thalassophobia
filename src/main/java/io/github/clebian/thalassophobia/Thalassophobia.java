package io.github.clebian.thalassophobia;

import io.github.clebian.thalassophobia.core.init.BlockInit;
import io.github.clebian.thalassophobia.core.init.EntityInit;
import io.github.clebian.thalassophobia.core.init.ItemInit;
import io.github.clebian.thalassophobia.core.init.SoundInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Thalassophobia.MODID)
public class Thalassophobia {
	public static final String MODID = "thalassophobia";

	public Thalassophobia() {
		var bus = FMLJavaModLoadingContext.get().getModEventBus();

		SoundInit.SOUNDS.register(bus);
		BlockInit.BLOCKS.register(bus);
		ItemInit.ITEMS.register(bus);
		EntityInit.ENTITIES.register(bus);

	}

	public static final CreativeModeTab THALASSOPHOBIA_TAB = new CreativeModeTab(MODID) {
		@Override
		public ItemStack makeIcon() {
			return ItemInit.LOOKER_EYE.get().getDefaultInstance();
		}
	};
}
