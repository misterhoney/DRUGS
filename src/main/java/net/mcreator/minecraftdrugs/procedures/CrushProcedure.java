package net.mcreator.minecraftdrugs.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.minecraftdrugs.world.inventory.MotarMenu;
import net.mcreator.minecraftdrugs.init.MinecraftDrugsModMenus;
import net.mcreator.minecraftdrugs.init.MinecraftDrugsModItems;

public class CrushProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _plr0 && _plr0.containerMenu instanceof MotarMenu) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu1 ? _menu1.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.ECHO_SHARD) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("minecraft_drugs:grind")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("minecraft_drugs:grind")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 5));
				if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.ECHO_PASTE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(0).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu6 ? _menu6.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.PITCHER_POD) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("minecraft_drugs:grind")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("minecraft_drugs:grind")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 5));
				if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.GROUND_PITCHER_POD_FLAKES.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(0).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu11 ? _menu11.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.TORCHFLOWER.asItem()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("minecraft_drugs:grind")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("minecraft_drugs:grind")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 5));
				if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.GROUND_TORCH_FLOWER_FLAKES.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(0).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu16 ? _menu16.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.BREEZE_ROD) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("minecraft_drugs:grind")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("minecraft_drugs:grind")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 5));
				if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.BREEZE_POWDER.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(0).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu21 ? _menu21.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.BLAZE_ROD) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("minecraft_drugs:grind")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("minecraft_drugs:grind")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 5));
				if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(Items.BLAZE_POWDER).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(0).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu26 ? _menu26.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.ANCIENT_DEBRIS.asItem()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("minecraft_drugs:grind")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("minecraft_drugs:grind")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 5));
				if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.POWDERED_ANCIENT_DEBRIS.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(0).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu31 ? _menu31.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.ANCIENT_DEBRIS.asItem()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("minecraft_drugs:grind")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("minecraft_drugs:grind")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 5));
				if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.POWDERED_ANCIENT_DEBRIS.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(0).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu36 ? _menu36.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.PITCHER_PLANT.asItem()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("minecraft_drugs:grind")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("minecraft_drugs:grind")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 5));
				if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.PITCHER_PASTE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(0).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu41 ? _menu41.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == MinecraftDrugsModItems.MEMBRANE_CHAR
					.get()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("minecraft_drugs:grind")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("minecraft_drugs:grind")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 5));
				if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.MEMBRANE_PASTE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(0).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		}
	}
}