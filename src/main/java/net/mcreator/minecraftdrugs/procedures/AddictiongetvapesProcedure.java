package net.mcreator.minecraftdrugs.procedures;

import net.neoforged.neoforge.event.entity.living.LivingEntityUseItemEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.minecraftdrugs.init.MinecraftDrugsModMobEffects;

import javax.annotation.Nullable;

@EventBusSubscriber
public class AddictiongetvapesProcedure {
	@SubscribeEvent
	public static void onUseItemFinish(LivingEntityUseItemEvent.Finish event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity(), event.getItem());
		}
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MinecraftDrugsModMobEffects.CRAVING)) {
			if (itemstack.getItem() == Items.MILK_BUCKET) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MinecraftDrugsModMobEffects.CRAVING, 12000, 0, true, true));
			}
		}
		if (itemstack.is(ItemTags.create(ResourceLocation.parse("minecraft:drugs")))) {
			if (Math.random() < 0.08) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MinecraftDrugsModMobEffects.ADDICTION, 6000, 0, true, true));
			}
		}
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MinecraftDrugsModMobEffects.ADDICTION) ? _livEnt.getEffect(MinecraftDrugsModMobEffects.ADDICTION).getAmplifier() : 0) == 0) {
			if (itemstack.is(ItemTags.create(ResourceLocation.parse("minecraft:drugs")))) {
				if (Math.random() < 0.1) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MinecraftDrugsModMobEffects.ADDICTION, 6000, 1, true, true));
				}
			}
		}
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MinecraftDrugsModMobEffects.ADDICTION) ? _livEnt.getEffect(MinecraftDrugsModMobEffects.ADDICTION).getAmplifier() : 0) == 1) {
			if (itemstack.is(ItemTags.create(ResourceLocation.parse("minecraft:drugs")))) {
				if (Math.random() < 0.15) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MinecraftDrugsModMobEffects.ADDICTION, 6000, 2, true, true));
				}
			}
		}
	}
}