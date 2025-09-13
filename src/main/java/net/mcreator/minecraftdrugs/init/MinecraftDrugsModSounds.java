/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftdrugs.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.minecraftdrugs.MinecraftDrugsMod;

public class MinecraftDrugsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, MinecraftDrugsMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> GRIND = REGISTRY.register("grind", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("minecraft_drugs", "grind")));
	public static final DeferredHolder<SoundEvent, SoundEvent> DISTILL = REGISTRY.register("distill", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("minecraft_drugs", "distill")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BOILFINISH = REGISTRY.register("boilfinish", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("minecraft_drugs", "boilfinish")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BOILSTART = REGISTRY.register("boilstart", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("minecraft_drugs", "boilstart")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BOIL = REGISTRY.register("boil", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("minecraft_drugs", "boil")));
	public static final DeferredHolder<SoundEvent, SoundEvent> DISTILLING = REGISTRY.register("distilling", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("minecraft_drugs", "distilling")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BREATH = REGISTRY.register("breath", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("minecraft_drugs", "breath")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BREATHBUBBLE = REGISTRY.register("breathbubble", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("minecraft_drugs", "breathbubble")));
	public static final DeferredHolder<SoundEvent, SoundEvent> COUGH = REGISTRY.register("cough", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("minecraft_drugs", "cough")));
	public static final DeferredHolder<SoundEvent, SoundEvent> COUGHING = REGISTRY.register("coughing", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("minecraft_drugs", "coughing")));
}