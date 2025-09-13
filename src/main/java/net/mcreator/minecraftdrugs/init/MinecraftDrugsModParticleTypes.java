/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftdrugs.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.minecraftdrugs.MinecraftDrugsMod;

public class MinecraftDrugsModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, MinecraftDrugsMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> GLOW_BLOW_PARTICLE = REGISTRY.register("glow_blow_particle", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> VAPE_1P = REGISTRY.register("vape_1p", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> VAPE_2P = REGISTRY.register("vape_2p", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> VAPE_3P = REGISTRY.register("vape_3p", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> VAPE_4P = REGISTRY.register("vape_4p", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> VAPE_5P = REGISTRY.register("vape_5p", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> VAPE_6P = REGISTRY.register("vape_6p", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> VAPE_7P = REGISTRY.register("vape_7p", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> VAPE_8P = REGISTRY.register("vape_8p", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> MPHETIMENBREEZE = REGISTRY.register("mphetimenbreeze", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> MPHETIMENBLAZE = REGISTRY.register("mphetimenblaze", () -> new SimpleParticleType(false));
}