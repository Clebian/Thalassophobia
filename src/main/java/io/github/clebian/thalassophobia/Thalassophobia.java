package io.github.clebian.thalassophobia;

import com.mojang.logging.LogUtils;
import io.github.clebian.thalassophobia.util.BlocksInit;
import io.github.clebian.thalassophobia.util.EntityTypesInit;
import io.github.clebian.thalassophobia.util.ItemsInit;
import io.github.clebian.thalassophobia.sound.ModSounds;
import io.github.clebian.thalassophobia.entity.client.render.LookerRenderer;
import io.github.clebian.thalassophobia.entity.npc.ModPOIs;
import io.github.clebian.thalassophobia.world.dimension.ModDimensions;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

@Mod(Thalassophobia.MOD_ID)
public class Thalassophobia {
	public static final String MOD_ID = "thalassophobia";
	public static final Logger LOGGER = LogUtils.getLogger();

	public Thalassophobia() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		BlocksInit.BLOCKS.register(bus);
		ItemsInit.ITEMS.register(bus);
		EntityTypesInit.ENTITY_TYPES.register(bus);
		ModSounds.SOUND_EVENTS.register(bus);
		ModDimensions.register();
		ModPOIs.register(bus);


		bus.addListener(this::clientSetup);
		GeckoLib.initialize();
	}

	public static final CreativeModeTab THALASSOPHOBIA_TAB = new CreativeModeTab(MOD_ID) {

		@Override
		public ItemStack makeIcon() {
			return ItemsInit.SCORIA_ORE_ITEM.get().getDefaultInstance();
		}
	};

	private void clientSetup(final FMLClientSetupEvent event){
		EntityRenderers.register(EntityTypesInit.LOOKER.get(), LookerRenderer::new);
		ItemBlockRenderTypes.setRenderLayer(BlocksInit.TWILIGHT_LAYER_PORTAL.get(), RenderType.translucent());
	}

}
