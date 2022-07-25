package io.github.clebian.thalassophobia.item;

import io.github.clebian.thalassophobia.Thalassophobia;
import io.github.clebian.thalassophobia.block.ModBlocks;
import io.github.clebian.thalassophobia.entity.ModEntityTypes;
import io.github.clebian.thalassophobia.item.custom.OxygenSyringeItem;
import io.github.clebian.thalassophobia.sound.ModSounds;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
	private ModItems() {
	}

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			Thalassophobia.MODID);

	// Items

	public static final RegistryObject<Item> LOOKER_EYE = ITEMS.register("looker_eye",
			() -> new Item(new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)
					.food(new FoodProperties.Builder().nutrition(2).saturationMod(1.2f).meat()
							.effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600), .3f).build())));

	public static final RegistryObject<Item> COOKED_LOOKER_EYE = ITEMS.register("cooked_looker_eye",
			() -> new Item(new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)
					.food(new FoodProperties.Builder().nutrition(5).saturationMod(6f).meat().build())));

	public static final RegistryObject<Item> CORAL_INFUSED_IRON_INGOT = ITEMS.register("coral_infused_iron_ingot",
			() -> new Item(new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));

	public static final RegistryObject<Item> SCORIA_ORE_ITEM = ITEMS.register("scoria_ore_item",
			() -> new Item(new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));

	public static final RegistryObject<Item> SCORIA_INGOT = ITEMS.register("scoria_ingot",
			() -> new Item(new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));
	
	// Tools
	public static final RegistryObject<SwordItem> CORAL_SWORD = ITEMS.register("coral_sword",
			() -> new SwordItem(ToolMaterialInit.CORAL, 3, -2.4f, new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));

	public static final RegistryObject<HoeItem> CORAL_HOE = ITEMS.register("coral_hoe",
			() -> new HoeItem(ToolMaterialInit.CORAL, -2, -1, new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));

	public static final RegistryObject<PickaxeItem> CORAL_PICKAXE = ITEMS.register("coral_pickaxe",
			() -> new PickaxeItem(ToolMaterialInit.CORAL, 1, -2.8f, new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));

	public static final RegistryObject<ShovelItem> CORAL_SHOVEL = ITEMS.register("coral_shovel",
			() -> new ShovelItem(ToolMaterialInit.CORAL, 1.5f, -3, new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));

	public static final RegistryObject<AxeItem> CORAL_AXE = ITEMS.register("coral_axe",
			() -> new AxeItem(ToolMaterialInit.CORAL, 6, -3.1f, new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));

	public static final RegistryObject<SwordItem> SCORIA_SWORD = ITEMS.register("scoria_sword",
			() -> new SwordItem(ToolMaterialInit.SCORIA, 3, -2.4f, new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));

	public static final RegistryObject<HoeItem> SCORIA_HOE = ITEMS.register("scoria_hoe",
			() -> new HoeItem(ToolMaterialInit.SCORIA, -2, -1, new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));

	public static final RegistryObject<PickaxeItem> SCORIA_PICKAXE = ITEMS.register("scoria_pickaxe",
			() -> new PickaxeItem(ToolMaterialInit.SCORIA, 1, -2.8f, new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));

	public static final RegistryObject<ShovelItem> SCORIA_SHOVEL = ITEMS.register("scoria_shovel",
			() -> new ShovelItem(ToolMaterialInit.SCORIA, 1.5f, -3, new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));

	public static final RegistryObject<AxeItem> SCORIA_AXE = ITEMS.register("scoria_axe",
			() -> new AxeItem(ToolMaterialInit.SCORIA, 6, -3.1f, new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));

	public static final RegistryObject<Item> LOOKER_SPAWN_EGG = ITEMS.register("looker_spawn_egg",
			() -> new ForgeSpawnEggItem(ModEntityTypes.LOOKER,0x010375, 0xa8ba09,
					new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));

	public static final RegistryObject<Item> ANGLER_FISH_SPAWN_EGG = ITEMS.register("angler_fish_spawn_egg",
			() -> new ForgeSpawnEggItem(ModEntityTypes.ANGLER_FISH,0x765032, 0xc9c9c9,
					new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));

	public static final RegistryObject<Item> EEL_SPAWN_EGG = ITEMS.register("eel_spawn_egg",
			() -> new ForgeSpawnEggItem(ModEntityTypes.EEL,0xa8b701, 0x5e6605,
					new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));

	public static final RegistryObject<Item> NARWHAL_SPAWN_EGG = ITEMS.register("narwhal_spawn_egg",
			() -> new ForgeSpawnEggItem(ModEntityTypes.NARWHAL,0x545454, 0xd3d097,
					new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));

	public static final RegistryObject<Item> CRAB_SPAWN_EGG = ITEMS.register("crab_spawn_egg",
			() -> new ForgeSpawnEggItem(ModEntityTypes.CRAB,0x7b3109, 0xb44407,
					new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));

	public static final RegistryObject<Item> LEVIATHAN_TRILOGY_MUSIC_DISC = ITEMS.register("leviathan_trilogy_music_disc",
			() -> new RecordItem(4, ModSounds.LEVIATHAN_TRILOGY,
					new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB).stacksTo(1)));

	public static final RegistryObject<Item> SUNKEN_SEA_MUSIC_DISC = ITEMS.register("sunken_sea_music_disc",
			() -> new RecordItem(4, ModSounds.SUNKEN_SEA,
					new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB).stacksTo(1)));

	public static final RegistryObject<Item> GUARDIAN_OF_THE_FORMER_SEAS_MUSIC_DISC = ITEMS.register("guardian_of_the_former_seas_music_disc",
			() -> new RecordItem(4, ModSounds.GUARDIAN_OF_THE_FORMER_SEAS,
					new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB).stacksTo(1)));

	public static final RegistryObject<Item> HADOPELAGIC_PRESSURE_MUSIC_DISC = ITEMS.register("hadopelagic_pressure_music_disc",
			() -> new RecordItem(4, ModSounds.HADOPELAGIC_PRESSURE,
					new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB).stacksTo(1)));

	public static final RegistryObject<Item> THREATS_OF_THE_OCEAN_FLOOR_MUSIC_DISC = ITEMS.register("threats_of_the_ocean_floor_music_disc",
			() -> new RecordItem(4, ModSounds.THREATS_OF_THE_OCEAN_FLOOR,
					new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB).stacksTo(1)));

	public static final RegistryObject<Item> VOID_MUSIC_DISC = ITEMS.register("void_music_disc",
			() -> new RecordItem(4, ModSounds.VOID,
					new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB).stacksTo(1)));

	public static final RegistryObject<Item> WASTELAND_MUSIC_DISC = ITEMS.register("wasteland_music_disc",
			() -> new RecordItem(4, ModSounds.WASTELAND,
					new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB).stacksTo(1)));

	public static final RegistryObject<Item> OXYGEN_SYRINGE = ITEMS.register("oxygen_syringe",
			() -> new OxygenSyringeItem(new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB).stacksTo(1)));

	// Armor
	public static final RegistryObject<ArmorItem> CORAL_HELMET = ITEMS.register("coral_helmet",
			() -> new ArmorItem(ArmorMaterialInit.CORAL, EquipmentSlot.HEAD,
					new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));

	public static final RegistryObject<ArmorItem> CORAL_CHESTPLATE = ITEMS.register("coral_chestplate",
			() -> new ArmorItem(ArmorMaterialInit.CORAL, EquipmentSlot.CHEST,
					new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));

	public static final RegistryObject<ArmorItem> CORAL_LEGGINGS = ITEMS.register("coral_leggings",
			() -> new ArmorItem(ArmorMaterialInit.CORAL, EquipmentSlot.LEGS,
					new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));

	public static final RegistryObject<ArmorItem> CORAL_BOOTS = ITEMS.register("coral_boots",
			() -> new ArmorItem(ArmorMaterialInit.CORAL, EquipmentSlot.FEET,
					new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));

	public static final RegistryObject<ArmorItem> SCORIA_HELMET = ITEMS.register("scoria_helmet",
			() -> new ArmorItem(ArmorMaterialInit.SCORIA, EquipmentSlot.HEAD,
					new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));

	public static final RegistryObject<ArmorItem> SCORIA_CHESTPLATE = ITEMS.register("scoria_chestplate",
			() -> new ArmorItem(ArmorMaterialInit.SCORIA, EquipmentSlot.CHEST,
					new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));

	public static final RegistryObject<ArmorItem> SCORIA_LEGGINGS = ITEMS.register("scoria_leggings",
			() -> new ArmorItem(ArmorMaterialInit.SCORIA, EquipmentSlot.LEGS,
					new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));

	public static final RegistryObject<ArmorItem> SCORIA_BOOTS = ITEMS.register("scoria_boots",
			() -> new ArmorItem(ArmorMaterialInit.SCORIA, EquipmentSlot.FEET,
					new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));

	// Block Items

	public static final RegistryObject<BlockItem> SCORIA_ORE = ITEMS.register("scoria_ore",
			() -> new BlockItem(ModBlocks.SCORIA_ORE.get(), new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));
}
