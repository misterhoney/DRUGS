/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftdrugs.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.minecraftdrugs.procedures.AddictionEffectExpiresProcedure;
import net.mcreator.minecraftdrugs.potion.PsychosisMobEffect;
import net.mcreator.minecraftdrugs.potion.ParanoiaMobEffect;
import net.mcreator.minecraftdrugs.potion.LungDiseaseMobEffect;
import net.mcreator.minecraftdrugs.potion.EuphoriaMobEffect;
import net.mcreator.minecraftdrugs.potion.CravingMobEffect;
import net.mcreator.minecraftdrugs.potion.AddictionMobEffect;
import net.mcreator.minecraftdrugs.MinecraftDrugsMod;

@EventBusSubscriber
public class MinecraftDrugsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, MinecraftDrugsMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> ADDICTION = REGISTRY.register("addiction", () -> new AddictionMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> PSYCHOSIS = REGISTRY.register("psychosis", () -> new PsychosisMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> PARANOIA = REGISTRY.register("paranoia", () -> new ParanoiaMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> EUPHORIA = REGISTRY.register("euphoria", () -> new EuphoriaMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> CRAVING = REGISTRY.register("craving", () -> new CravingMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> LUNG_DISEASE = REGISTRY.register("lung_disease", () -> new LungDiseaseMobEffect());

	@SubscribeEvent
	public static void onEffectRemoved(MobEffectEvent.Remove event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	@SubscribeEvent
	public static void onEffectExpired(MobEffectEvent.Expired event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	private static void expireEffects(Entity entity, MobEffectInstance effectInstance) {
		if (effectInstance.getEffect().is(ADDICTION)) {
			AddictionEffectExpiresProcedure.execute(entity.level(), entity);
		}
	}
}