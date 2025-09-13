package net.mcreator.minecraftdrugs.potion;

import net.neoforged.neoforge.common.NeoForgeMod;
import net.neoforged.neoforge.common.EffectCures;
import net.neoforged.neoforge.common.EffectCure;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.minecraftdrugs.procedures.LungDiseaseOnEntityHurtProcedure;
import net.mcreator.minecraftdrugs.procedures.LungDiseaseActiveTickConditionProcedure;
import net.mcreator.minecraftdrugs.MinecraftDrugsMod;

import java.util.Set;

public class LungDiseaseMobEffect extends MobEffect {
	public LungDiseaseMobEffect() {
		super(MobEffectCategory.NEUTRAL, -10092493);
		this.addAttributeModifier(Attributes.ATTACK_SPEED, ResourceLocation.fromNamespaceAndPath(MinecraftDrugsMod.MODID, "effect.lung_disease_0"), -0.05, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, ResourceLocation.fromNamespaceAndPath(MinecraftDrugsMod.MODID, "effect.lung_disease_1"), -0.01, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.JUMP_STRENGTH, ResourceLocation.fromNamespaceAndPath(MinecraftDrugsMod.MODID, "effect.lung_disease_2"), -0.02, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(NeoForgeMod.SWIM_SPEED, ResourceLocation.fromNamespaceAndPath(MinecraftDrugsMod.MODID, "effect.lung_disease_3"), -0.5, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.OXYGEN_BONUS, ResourceLocation.fromNamespaceAndPath(MinecraftDrugsMod.MODID, "effect.lung_disease_4"), -20, AttributeModifier.Operation.ADD_VALUE);
	}

	@Override
	public void fillEffectCures(Set<EffectCure> cures, MobEffectInstance effectInstance) {
		cures.add(EffectCures.MILK);
		cures.add(EffectCures.PROTECTED_BY_TOTEM);
		cures.add(EffectCures.HONEY);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		LungDiseaseActiveTickConditionProcedure.execute(entity);
		return super.applyEffectTick(entity, amplifier);
	}

	@Override
	public void onMobHurt(LivingEntity entity, int amplifier, DamageSource damagesource, float damage) {
		LungDiseaseOnEntityHurtProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
	}
}