package io.github.clebian.thalassophobia;

import io.github.clebian.thalassophobia.block.ModBlocks;
import io.github.clebian.thalassophobia.entity.ModEntityTypes;
import io.github.clebian.thalassophobia.item.ModItems;
import io.github.clebian.thalassophobia.sound.ModSounds;
import io.github.clebian.thalassophobia.entity.client.LookerRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib3.GeckoLib;

@Mod(Thalassophobia.MODID)
public class Thalassophobia {
	public static final String MODID = "thalassophobia";

	public Thalassophobia() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		ModSounds.SOUND_EVENTS.register(bus);
		ModBlocks.BLOCKS.register(bus);
		ModItems.ITEMS.register(bus);
		ModEntityTypes.ENTITY_TYPES.register(bus);

		GeckoLib.initialize();
		bus.addListener(this::clientSetup);
	}

	public static final CreativeModeTab THALASSOPHOBIA_TAB = new CreativeModeTab(MODID) {

		@Override
		public ItemStack makeIcon() {
			return ModItems.SCORIA_ORE_ITEM.get().getDefaultInstance();
		}
	};

	private void clientSetup(final FMLClientSetupEvent event){
		EntityRenderers.register(ModEntityTypes.LOOKER.get(), LookerRenderer::new);
	}
}
