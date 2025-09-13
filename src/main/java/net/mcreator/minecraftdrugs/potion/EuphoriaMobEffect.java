package net.mcreator.minecraftdrugs.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.minecraftdrugs.MinecraftDrugsMod;

public class EuphoriaMobEffect extends MobEffect {
	public EuphoriaMobEffect() {
		super(MobEffectCategory.NEUTRAL, -39424);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, ResourceLocation.fromNamespaceAndPath(MinecraftDrugsMod.MODID, "effect.euphoria_0"), 0.02, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.MAX_HEALTH, ResourceLocation.fromNamespaceAndPath(MinecraftDrugsMod.MODID, "effect.euphoria_1"), -10, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ARMOR, ResourceLocation.fromNamespaceAndPath(MinecraftDrugsMod.MODID, "effect.euphoria_2"), -0.2, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.FLYING_SPEED, ResourceLocation.fromNamespaceAndPath(MinecraftDrugsMod.MODID, "effect.euphoria_3"), 0.02, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.JUMP_STRENGTH, ResourceLocation.fromNamespaceAndPath(MinecraftDrugsMod.MODID, "effect.euphoria_4"), 0.05, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.GRAVITY, ResourceLocation.fromNamespaceAndPath(MinecraftDrugsMod.MODID, "effect.euphoria_5"), -0.05, AttributeModifier.Operation.ADD_VALUE);
	}
}