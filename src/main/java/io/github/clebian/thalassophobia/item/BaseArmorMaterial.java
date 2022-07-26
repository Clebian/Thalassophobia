package io.github.clebian.thalassophobia.item;

import java.util.function.Supplier;

import io.github.clebian.thalassophobia.util.ItemsInit;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public record BaseArmorMaterial(int enchantability, int durability, int[] damageReduction, float knockbackResistance, float toughness, String name, SoundEvent equipSound, Supplier<Ingredient> repairMaterial) implements ArmorMaterial {
	// TODO: balance lmao
	public static final ArmorMaterial CORAL = new BaseArmorMaterial(9, 15, new int[]{2, 5, 6, 2},
			0, 0, "coral", SoundEvents.ARMOR_EQUIP_IRON,
			() -> Ingredient.of(ItemsInit.CORAL_INFUSED_IRON_INGOT.get()));

	public static final ArmorMaterial SCORIA = new BaseArmorMaterial(15, 50, new int[]{6, 12, 16, 6 /* twice as much health as nethrite */},
			.2f, 4, "scoria", SoundEvents.ARMOR_EQUIP_NETHERITE,
			() -> Ingredient.of(ItemsInit.SCORIA_INGOT.get()));

	private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};

	@Override
	public int getDurabilityForSlot(EquipmentSlot slot) {
		return HEALTH_PER_SLOT[slot.getIndex()] * this.durability;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlot slot) {
		return this.damageReduction[slot.getIndex()];
	}

	@Override
	public int getEnchantmentValue() {
		return this.enchantability;
	}

	@Override
	public SoundEvent getEquipSound() {
		return this.equipSound;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairMaterial.get();
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}

}
