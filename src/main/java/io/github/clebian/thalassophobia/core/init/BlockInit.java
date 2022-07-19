package io.github.clebian.thalassophobia.core.init;

import io.github.clebian.thalassophobia.Thalassophobia;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	private BlockInit() {}
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Thalassophobia.MODID);
	
	public static final RegistryObject<Block> SCORIA_ORE = BLOCKS.register("scoria_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
					.strength(30f, 1200f).requiresCorrectToolForDrops()));
}
