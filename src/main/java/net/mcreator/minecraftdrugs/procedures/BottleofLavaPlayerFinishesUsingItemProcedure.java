package net.mcreator.minecraftdrugs.procedures;

import net.minecraft.world.entity.Entity;

public class BottleofLavaPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.igniteForSeconds(5);
	}
}