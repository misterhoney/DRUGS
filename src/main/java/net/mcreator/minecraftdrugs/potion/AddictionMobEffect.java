package net.mcreator.minecraftdrugs.potion;

import net.neoforged.neoforge.common.EffectCures;
import net.neoforged.neoforge.common.EffectCure;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import java.util.Set;

public class AddictionMobEffect extends MobEffect {
	public AddictionMobEffect() {
		super(MobEffectCategory.HARMFUL, -65536);
	}

	@Override
	public void fillEffectCures(Set<EffectCure> cures, MobEffectInstance effectInstance) {
			}
}