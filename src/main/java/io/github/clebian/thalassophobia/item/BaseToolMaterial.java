package io.github.clebian.thalassophobia.item;

import java.util.function.Supplier;

import io.github.clebian.thalassophobia.util.ItemsInit;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public record BaseToolMaterial(float attackDamageBonus, int enchantability, int harvestLevel, float speed, int durability, Supplier<Ingredient> repairMaterial) implements Tier {

	public static final Tier CORAL = new BaseToolMaterial(2f, 14, 2, 6, 250,
			() -> Ingredient.of(ItemsInit.CORAL_INFUSED_IRON_INGOT.get()));

	public static final Tier SCORIA = new BaseToolMaterial(5, 18, 4, 11, 4000,
			() -> Ingredient.of(ItemsInit.SCORIA_INGOT.get()));


	@Override
	public int getUses() {
		return this.durability;
	}

	@Override
	public float getSpeed() {
		return this.speed;
	}

	@Override
	public float getAttackDamageBonus() {
		return this.attackDamageBonus;
	}

	@Override
	public int getLevel() {
		return this.harvestLevel;
	}

	@Override
	public int getEnchantmentValue() {
		return this.enchantability;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairMaterial.get();
	}

}
