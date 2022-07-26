package io.github.clebian.thalassophobia.item;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;


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

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(new TranslatableComponent("tooltip.thalassophobia.oxygen_syringe.tooltip.shift"));
    }
}
