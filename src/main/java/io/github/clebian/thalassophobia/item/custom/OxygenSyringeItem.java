package io.github.clebian.thalassophobia.item.custom;

import io.github.clebian.thalassophobia.item.ModItems;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;


public class OxygenSyringeItem extends Item {
    public OxygenSyringeItem(Properties pProperties) {
        super(pProperties);
    }

/*
    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        Player pPlayer = ((Player) pAttacker);
        if (!pPlayer.level.isClientSide && pTarget.isAlive()) {
            pTarget.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1200));
            pStack.shrink(1);
            pPlayer.getInventory().add(new ItemStack(ModItems.LOOKER_EYE.get()));
        }
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }*/



}
