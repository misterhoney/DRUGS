package net.mcreator.minecraftdrugs.procedures;

import net.minecraft.world.entity.Entity;

public class LungDiseaseActiveTickConditionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isSprinting()) {
			entity.setAirSupply(-30);
		}
	}
}