package io.github.clebian.thalassophobia.core.init;

import io.github.clebian.thalassophobia.core.BaseToolMaterial;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class ToolMaterialInit {
	protected static final Tier CORAL = new BaseToolMaterial(2f, 14, 2, 6, 250, 
			() -> Ingredient.of(ItemInit.CORAL_INFUSED_IRON_INGOT.get()));
	private ToolMaterialInit() {
		
	}
}
