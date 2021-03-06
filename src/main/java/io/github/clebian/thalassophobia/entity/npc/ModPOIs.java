package io.github.clebian.thalassophobia.entity.npc;

import io.github.clebian.thalassophobia.Thalassophobia;
import io.github.clebian.thalassophobia.util.BlocksInit;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPOIs {
    public static final DeferredRegister<PoiType> POI
            = DeferredRegister.create(ForgeRegistries.POI_TYPES, Thalassophobia.MOD_ID);

    public static final RegistryObject<PoiType> TWILIGHT_LAYER_PORTAL =
            POI.register("twilight_layer_portal", () -> new PoiType("twilight_layer_portal",
                    PoiType.getBlockStates(BlocksInit.TWILIGHT_LAYER_PORTAL.get()), 0, 1));


    public static void register(IEventBus eventBus) {
        POI.register(eventBus);
    }
}