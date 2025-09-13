package net.mcreator.minecraftdrugs.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.minecraftdrugs.init.MinecraftDrugsModParticleTypes;
import net.mcreator.minecraftdrugs.init.MinecraftDrugsModMobEffects;
import net.mcreator.minecraftdrugs.init.MinecraftDrugsModItems;

public class Vapepod5Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level) {
			itemstack.hurtAndBreak(1, _level, null, _stkprov -> {
			});
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (MinecraftDrugsModParticleTypes.VAPE_5P.get()), ((x + entity.getLookAngle().x) - 0.1), (y + 1.5), ((z + entity.getLookAngle().z) - 0.1), 8, 0.01, 0.01, 0.01, 0.05);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("minecraft_drugs:breath")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("minecraft_drugs:breath")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (itemstack.getDamageValue() > itemstack.getMaxDamage() - 1) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.VAPE_POD.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
		if (!(entity instanceof LivingEntity _livEnt11 && _livEnt11.hasEffect(MinecraftDrugsModMobEffects.ADDICTION))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 600, 0, true, true));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 600, 0, true, true));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 600, 1, true, true));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 10, 0, true, true));
		} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MinecraftDrugsModMobEffects.ADDICTION) ? _livEnt.getEffect(MinecraftDrugsModMobEffects.ADDICTION).getAmplifier() : 0) == 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 300, 0, true, true));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 300, 0, true, true));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 300, 1, true, true));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 75, 0, true, true));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MinecraftDrugsModMobEffects.ADDICTION, 6000, 0, true, true));
		}
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MinecraftDrugsModMobEffects.ADDICTION) ? _livEnt.getEffect(MinecraftDrugsModMobEffects.ADDICTION).getAmplifier() : 0) == 1) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 100, 0, true, true));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 100, 0, true, true));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 100, 1, true, true));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 100, 0, true, true));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MinecraftDrugsModMobEffects.ADDICTION, 6000, 1, true, true));
		}
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MinecraftDrugsModMobEffects.ADDICTION) ? _livEnt.getEffect(MinecraftDrugsModMobEffects.ADDICTION).getAmplifier() : 0) == 2) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 50, 0, true, true));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 50, 0, true, true));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 50, 1, true, true));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 150, 0, true, true));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MinecraftDrugsModMobEffects.ADDICTION, 6000, 2, true, true));
		}
		if (entity instanceof LivingEntity _livEnt34 && _livEnt34.hasEffect(MinecraftDrugsModMobEffects.CRAVING)) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MinecraftDrugsModMobEffects.CRAVING);
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1200, 0, true, true));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 1200, 1, true, true));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1200, 0, true, true));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MinecraftDrugsModMobEffects.ADDICTION, 6000, 2, true, true));
		}
	}
}