package net.mcreator.minecraftdrugs.potion;

import net.neoforged.neoforge.common.NeoForgeMod;
import net.neoforged.neoforge.common.EffectCures;
import net.neoforged.neoforge.common.EffectCure;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.minecraftdrugs.MinecraftDrugsMod;

import java.util.Set;

public class CravingMobEffect extends MobEffect {
	public CravingMobEffect() {
		super(MobEffectCategory.HARMFUL, -13408768);
		this.addAttributeModifier(Attributes.JUMP_STRENGTH, ResourceLocation.fromNamespaceAndPath(MinecraftDrugsMod.MODID, "effect.craving_0"), -0.05, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ATTACK_SPEED, ResourceLocation.fromNamespaceAndPath(MinecraftDrugsMod.MODID, "effect.craving_1"), -0.1, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, ResourceLocation.fromNamespaceAndPath(MinecraftDrugsMod.MODID, "effect.craving_2"), -5, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ARMOR, ResourceLocation.fromNamespaceAndPath(MinecraftDrugsMod.MODID, "effect.craving_3"), -5, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.MINING_EFFICIENCY, ResourceLocation.fromNamespaceAndPath(MinecraftDrugsMod.MODID, "effect.craving_4"), -0.2, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.KNOCKBACK_RESISTANCE, ResourceLocation.fromNamespaceAndPath(MinecraftDrugsMod.MODID, "effect.craving_5"), -5, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.MAX_HEALTH, ResourceLocation.fromNamespaceAndPath(MinecraftDrugsMod.MODID, "effect.craving_6"), -2, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, ResourceLocation.fromNamespaceAndPath(MinecraftDrugsMod.MODID, "effect.craving_7"), -0.05, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(NeoForgeMod.SWIM_SPEED, ResourceLocation.fromNamespaceAndPath(MinecraftDrugsMod.MODID, "effect.craving_8"), -0.3, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.SAFE_FALL_DISTANCE, ResourceLocation.fromNamespaceAndPath(MinecraftDrugsMod.MODID, "effect.craving_9"), -2, AttributeModifier.Operation.ADD_VALUE);
	}

	@Override
	public void fillEffectCures(Set<EffectCure> cures, MobEffectInstance effectInstance) {
		
	}
}