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
}