package io.github.clebian.thalassophobia.item;

import io.github.clebian.thalassophobia.Thalassophobia;
import io.github.clebian.thalassophobia.block.BlockInit;
import io.github.clebian.thalassophobia.entity.ModEntityTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
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

	public static final RegistryObject<Item> RACCOON_SPAWN_EGG = ITEMS.register("looker_spawn_egg",
			() -> new ForgeSpawnEggItem(ModEntityTypes.LOOKER,0x010375, 0xa8ba09,
					new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));

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

	// Block Items

	public static final RegistryObject<BlockItem> SCORIA_ORE = ITEMS.register("scoria_ore",
			() -> new BlockItem(BlockInit.SCORIA_ORE.get(), new Item.Properties().tab(Thalassophobia.THALASSOPHOBIA_TAB)));
}
