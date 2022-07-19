package io.github.clebian.thalassophobia.core.world;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import io.github.clebian.thalassophobia.Thalassophobia;
import io.github.clebian.thalassophobia.core.init.BlockInit;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

public class OreGeneration {

	public static final List<ConfiguredFeature<?, ?>> OVERWORLD_ORES = new ArrayList<>();
	public static final List<ConfiguredFeature<?, ?>> END_ORES = new ArrayList<>();
	public static final List<ConfiguredFeature<?, ?>> NETHER_ORES = new ArrayList<>();

	public static void registerOres(){
		ConfiguredFeature<?, ?> scoriaOre = Feature.ORE.configured(new OreConfiguration(List.of(
				OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, BlockInit.SCORIA_ORE.get().defaultBlockState()),
				OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, BlockInit.SCORIA_ORE/*this needs to be changed to deepslate scoria ore*/.get().defaultBlockState())
				), 3/*max count in vein*/)).rangeUniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(20)).squared(/*makes y and z randomized*/)/*.count(0) <- how many of this there will be per chunk*/;
		
		OVERWORLD_ORES.add(register("scoria_ore", scoriaOre));
	}
	
	private static <Config extends FeatureConfiguration> ConfiguredFeature<Config, ?> register(String name, ConfiguredFeature<Config, ?> configuredFeature){
		return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(Thalassophobia.MODID, name), configuredFeature);
	}
	
	
	@Mod.EventBusSubscriber(modid = Thalassophobia.MODID, bus = Bus.FORGE)
    public static class ForgeBusSubscriber {
        @SubscribeEvent
        public static void biomeLoading(BiomeLoadingEvent event) {
            List<Supplier<ConfiguredFeature<?, ?>>> features = event.getGeneration()
                    .getFeatures(Decoration.UNDERGROUND_ORES);
            /*if(event.getCategory() == BiomeCategory.OCEAN) use this for biome selection*/
            switch(event.getCategory()) {
                default -> OreGeneration.OVERWORLD_ORES.forEach(ore -> features.add(() -> ore));
            }
        }
    }
}
