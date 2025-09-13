package net.mcreator.minecraftdrugs.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.minecraftdrugs.init.MinecraftDrugsModMobEffects;

public class CravingOverlyaDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MinecraftDrugsModMobEffects.CRAVING)) {
			return true;
		}
		return false;
	}
}