package io.github.clebian.thalassophobia.core.init;


import io.github.clebian.thalassophobia.core.BaseArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorMaterialInit {

	private ArmorMaterialInit() {
	}

	protected static final ArmorMaterial CORAL = new BaseArmorMaterial(9, 15, new int[] {2, 5, 6, 2}, 0, 0, "coral", SoundEvents.ARMOR_EQUIP_IRON,
			() -> Ingredient.of(ItemInit.CORAL_INFUSED_IRON_INGOT.get()));
}
