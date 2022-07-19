package io.github.clebian.thalassophobia.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class ToolMaterialInit {
	public static final Tier CORAL = new BaseToolMaterial(2f, 14, 2, 6, 250,
			() -> Ingredient.of(ModItems.CORAL_INFUSED_IRON_INGOT.get()));
	private ToolMaterialInit() {
		
	}
}
