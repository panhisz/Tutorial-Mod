package net.maks.tutorialmod.Item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    public static  final FoodComponent LIVING_CRYSTALIUM  = new FoodComponent.Builder().hunger(5).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600), 0.25f).build();
}
