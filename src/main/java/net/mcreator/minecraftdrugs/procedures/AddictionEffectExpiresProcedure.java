package net.mcreator.minecraftdrugs.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.minecraftdrugs.init.MinecraftDrugsModMobEffects;
import net.mcreator.minecraftdrugs.MinecraftDrugsMod;

public class AddictionEffectExpiresProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		MinecraftDrugsMod.queueServerWork(1, () -> {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MinecraftDrugsModMobEffects.CRAVING, 12000, 0, true, true));
		});
	}
}