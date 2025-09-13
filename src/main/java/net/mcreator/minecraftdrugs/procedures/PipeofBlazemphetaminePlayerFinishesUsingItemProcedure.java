package net.mcreator.minecraftdrugs.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.minecraftdrugs.init.MinecraftDrugsModParticleTypes;
import net.mcreator.minecraftdrugs.init.MinecraftDrugsModItems;

public class PipeofBlazemphetaminePlayerFinishesUsingItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.FLINT_AND_STEEL) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.OFF_HAND, true);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("minecraft_drugs:breathbubble")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("minecraft_drugs:breathbubble")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.flintandsteel.use")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.flintandsteel.use")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (MinecraftDrugsModParticleTypes.MPHETIMENBREEZE.get()), (x + entity.getLookAngle().x), (y + 1.5), (z + entity.getLookAngle().z), 3, 0.1, 0.1, 0.1, 0.1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (MinecraftDrugsModParticleTypes.MPHETIMENBREEZE.get()), (x + entity.getLookAngle().x), (y + 1.8), (z + entity.getLookAngle().z), 3, 0.1, 0.1, 0.1, 0.1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FLAME, (x + entity.getLookAngle().x), (y + 1.2), (z + entity.getLookAngle().z), 3, 0.1, 0.1, 0.1, 0.05);
			if (world instanceof ServerLevel _level) {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
				});
			}
			if (world instanceof ServerLevel _level) {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
				});
			}
		}
		if (itemstack.getDamageValue() > itemstack.getMaxDamage() - 1) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.PIPE.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
	}
}