package io.github.clebian.thalassophobia.item;


import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorMaterialInit {

	private ArmorMaterialInit() {
	}

	public static final ArmorMaterial CORAL = new BaseArmorMaterial(9, 15, new int[] {2, 5, 6, 2},
			0, 0, "coral", SoundEvents.ARMOR_EQUIP_IRON,
			() -> Ingredient.of(ModItems.CORAL_INFUSED_IRON_INGOT.get()));

	public static final ArmorMaterial SCORIA = new BaseArmorMaterial(15, 50, new int[] {6, 12, 16, 6 /* twice as much health as nethrite */},
			.2f, 4, "scoria", SoundEvents.ARMOR_EQUIP_NETHERITE,
			() -> Ingredient.of(ModItems.SCORIA_INGOT.get()));
}
