package io.github.clebian.thalassophobia.util;

import io.github.clebian.thalassophobia.Thalassophobia;
import io.github.clebian.thalassophobia.block.TwilightLayerPortalBlock;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import java.util.function.Supplier;

@SuppressWarnings("unused")
public class BlocksInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Thalassophobia.MOD_ID);
	
	public static final RegistryObject<Block> SCORIA_ORE = BLOCKS.register("scoria_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
					.strength(30f, 1200f).requiresCorrectToolForDrops()));

	public static final RegistryObject<Block> TWILIGHT_LAYER_PORTAL = registerBlockWithoutBlockItem("twilight_layer_portal_block",
			TwilightLayerPortalBlock::new);



	private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
		return BLOCKS.register(name, block);
	}

	private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
		RegistryObject<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name, toReturn, tab);
		return toReturn;
	}

	private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
																			CreativeModeTab tab) {
		return ItemsInit.ITEMS.register(name, () -> new BlockItem(block.get(),
				new Item.Properties().tab(tab)));
	}

	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
}
