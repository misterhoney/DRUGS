package net.mcreator.minecraftdrugs.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.minecraftdrugs.world.inventory.MixingtableguiMenu;
import net.mcreator.minecraftdrugs.init.MinecraftDrugsModMenus;
import net.mcreator.minecraftdrugs.init.MinecraftDrugsModItems;

public class MixingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _plr0 && _plr0.containerMenu instanceof MixingtableguiMenu) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu1 ? _menu1.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == MinecraftDrugsModItems.COPPER_BATTERY
					.get()) {
				if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu3 ? _menu3.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == MinecraftDrugsModItems.VAPE_POD.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu5 ? _menu5.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == MinecraftDrugsModItems.VAPE_POD
								.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu7 ? _menu7.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == MinecraftDrugsModItems.VAPE_POD
								.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu9 ? _menu9.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == MinecraftDrugsModItems.VAPE_POD
								.get())
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu11 ? _menu11.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.SUGAR
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu13 ? _menu13.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Items.SUGAR
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu15 ? _menu15.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Items.SUGAR
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu17 ? _menu17.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Items.SUGAR)
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu19 ? _menu19.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.POTION
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu21 ? _menu21.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Items.POTION
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu23 ? _menu23.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Items.POTION
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu25 ? _menu25.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Items.POTION)
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu27 ? _menu27.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.GLOW_BERRIES
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu29 ? _menu29.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Items.GLOW_BERRIES
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu31 ? _menu31.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Items.GLOW_BERRIES
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu33 ? _menu33.getSlots().get(3).getItem() : ItemStack.EMPTY)
										.getItem() == Items.GLOW_BERRIES)) {
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(0).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(1).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(2).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(3).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.VAPE_POD_GLOW_BLOW_FLAVOR.get()).copy();
						_setstack.setCount(1);
						_menu.getSlots().get(4).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (world instanceof ServerLevel _level)
						_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 5));
					if (world instanceof ServerLevel _level) {
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu41 ? _menu41.getSlots().get(5).getItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu43 ? _menu43.getSlots().get(5).getItem() : ItemStack.EMPTY)
							.getDamageValue() > (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu45 ? _menu45.getSlots().get(5).getItem() : ItemStack.EMPTY).getMaxDamage() - 1) {
						if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
							ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.COPPER_BATTERY_DEAD.get()).copy();
							_setstack.setCount(1);
							_menu.getSlots().get(5).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
					}
				}
				if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu48 ? _menu48.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == MinecraftDrugsModItems.VAPE_POD
						.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu50 ? _menu50.getSlots().get(1).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.VAPE_POD.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu52 ? _menu52.getSlots().get(2).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.VAPE_POD.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu54 ? _menu54.getSlots().get(3).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.VAPE_POD.get())
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu56 ? _menu56.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.GLOWSTONE_DUST
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu58 ? _menu58.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Items.GLOWSTONE_DUST
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu60 ? _menu60.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Items.GLOWSTONE_DUST
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu62 ? _menu62.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Items.GLOWSTONE_DUST)
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu64 ? _menu64.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.POTION
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu66 ? _menu66.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Items.POTION
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu68 ? _menu68.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Items.POTION
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu70 ? _menu70.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Items.POTION)
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu72 ? _menu72.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.GLISTERING_MELON_SLICE
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu74 ? _menu74.getSlots().get(1).getItem() : ItemStack.EMPTY)
										.getItem() == Items.GLISTERING_MELON_SLICE
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu76 ? _menu76.getSlots().get(2).getItem() : ItemStack.EMPTY)
										.getItem() == Items.GLISTERING_MELON_SLICE
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu78 ? _menu78.getSlots().get(3).getItem() : ItemStack.EMPTY)
										.getItem() == Items.GLISTERING_MELON_SLICE)) {
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(0).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(1).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(2).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(3).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.VAPE_POD_MELON.get()).copy();
						_setstack.setCount(1);
						_menu.getSlots().get(4).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (world instanceof ServerLevel _level)
						_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 5));
					if (world instanceof ServerLevel _level) {
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu86 ? _menu86.getSlots().get(5).getItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu88 ? _menu88.getSlots().get(5).getItem() : ItemStack.EMPTY)
							.getDamageValue() > (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu90 ? _menu90.getSlots().get(5).getItem() : ItemStack.EMPTY).getMaxDamage() - 1) {
						if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
							ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.COPPER_BATTERY_DEAD.get()).copy();
							_setstack.setCount(1);
							_menu.getSlots().get(5).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
					}
				}
				if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu93 ? _menu93.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == MinecraftDrugsModItems.VAPE_POD
						.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu95 ? _menu95.getSlots().get(1).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.VAPE_POD.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu97 ? _menu97.getSlots().get(2).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.VAPE_POD.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu99 ? _menu99.getSlots().get(3).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.VAPE_POD.get())
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu101 ? _menu101.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.GUNPOWDER
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu103 ? _menu103.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Items.GUNPOWDER
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu105 ? _menu105.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Items.GUNPOWDER
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu107 ? _menu107.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Items.GUNPOWDER)
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu109 ? _menu109.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.OMINOUS_BOTTLE
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu111 ? _menu111.getSlots().get(1).getItem() : ItemStack.EMPTY)
										.getItem() == Items.OMINOUS_BOTTLE
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu113 ? _menu113.getSlots().get(2).getItem() : ItemStack.EMPTY)
										.getItem() == Items.OMINOUS_BOTTLE
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu115 ? _menu115.getSlots().get(3).getItem() : ItemStack.EMPTY)
										.getItem() == Items.OMINOUS_BOTTLE)
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu117 ? _menu117.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.BROWN_MUSHROOM
								.asItem()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu119 ? _menu119.getSlots().get(1).getItem() : ItemStack.EMPTY)
										.getItem() == Blocks.BROWN_MUSHROOM.asItem()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu121 ? _menu121.getSlots().get(2).getItem() : ItemStack.EMPTY)
										.getItem() == Blocks.BROWN_MUSHROOM.asItem()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu123 ? _menu123.getSlots().get(3).getItem() : ItemStack.EMPTY)
										.getItem() == Blocks.BROWN_MUSHROOM.asItem())) {
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(0).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(1).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(2).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(3).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.VAPE_POD_PILLAGER.get()).copy();
						_setstack.setCount(1);
						_menu.getSlots().get(4).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (world instanceof ServerLevel _level)
						_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 5));
					if (world instanceof ServerLevel _level) {
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu131 ? _menu131.getSlots().get(5).getItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu133 ? _menu133.getSlots().get(5).getItem() : ItemStack.EMPTY)
							.getDamageValue() > (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu135 ? _menu135.getSlots().get(5).getItem() : ItemStack.EMPTY).getMaxDamage()
									- 1) {
						if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
							ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.COPPER_BATTERY_DEAD.get()).copy();
							_setstack.setCount(1);
							_menu.getSlots().get(5).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
					}
				}
				if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu138 ? _menu138.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == MinecraftDrugsModItems.VAPE_POD
						.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu140 ? _menu140.getSlots().get(1).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.VAPE_POD.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu142 ? _menu142.getSlots().get(2).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.VAPE_POD.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu144 ? _menu144.getSlots().get(3).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.VAPE_POD.get())
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu146 ? _menu146.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.BLAZE_POWDER
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu148 ? _menu148.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Items.BLAZE_POWDER
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu150 ? _menu150.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Items.BLAZE_POWDER
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu152 ? _menu152.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Items.BLAZE_POWDER)
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu154 ? _menu154.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.BOTTLEOF_LAVA.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu156 ? _menu156.getSlots().get(1).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.BOTTLEOF_LAVA.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu158 ? _menu158.getSlots().get(2).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.BOTTLEOF_LAVA.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu160 ? _menu160.getSlots().get(3).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.BOTTLEOF_LAVA.get())
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu162 ? _menu162.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.MAGMA_CREAM
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu164 ? _menu164.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Items.MAGMA_CREAM
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu166 ? _menu166.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Items.MAGMA_CREAM
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu168 ? _menu168.getSlots().get(3).getItem() : ItemStack.EMPTY)
										.getItem() == Items.MAGMA_CREAM)) {
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(0).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(1).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(2).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(3).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.VAPE_POD_MAGMA.get()).copy();
						_setstack.setCount(1);
						_menu.getSlots().get(4).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (world instanceof ServerLevel _level)
						_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 5));
					if (world instanceof ServerLevel _level) {
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu176 ? _menu176.getSlots().get(5).getItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu178 ? _menu178.getSlots().get(5).getItem() : ItemStack.EMPTY)
							.getDamageValue() > (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu180 ? _menu180.getSlots().get(5).getItem() : ItemStack.EMPTY).getMaxDamage()
									- 1) {
						if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
							ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.COPPER_BATTERY_DEAD.get()).copy();
							_setstack.setCount(1);
							_menu.getSlots().get(5).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
					}
				}
				if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu183 ? _menu183.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == MinecraftDrugsModItems.VAPE_POD
						.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu185 ? _menu185.getSlots().get(1).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.VAPE_POD.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu187 ? _menu187.getSlots().get(2).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.VAPE_POD.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu189 ? _menu189.getSlots().get(3).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.VAPE_POD.get())
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu191 ? _menu191.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.REDSTONE
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu193 ? _menu193.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Items.REDSTONE
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu195 ? _menu195.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Items.REDSTONE
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu197 ? _menu197.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Items.REDSTONE)
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu199 ? _menu199.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.BEETROOT_EXTRACT.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu201 ? _menu201.getSlots().get(1).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.BEETROOT_EXTRACT.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu203 ? _menu203.getSlots().get(2).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.BEETROOT_EXTRACT.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu205 ? _menu205.getSlots().get(3).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.BEETROOT_EXTRACT.get())
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu207 ? _menu207.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.FERMENTED_SPIDER_EYE
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu209 ? _menu209.getSlots().get(1).getItem() : ItemStack.EMPTY)
										.getItem() == Items.FERMENTED_SPIDER_EYE
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu211 ? _menu211.getSlots().get(2).getItem() : ItemStack.EMPTY)
										.getItem() == Items.FERMENTED_SPIDER_EYE
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu213 ? _menu213.getSlots().get(3).getItem() : ItemStack.EMPTY)
										.getItem() == Items.FERMENTED_SPIDER_EYE)) {
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(0).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(1).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(2).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(3).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.VAPE_PODWITCH.get()).copy();
						_setstack.setCount(1);
						_menu.getSlots().get(4).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (world instanceof ServerLevel _level)
						_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 5));
					if (world instanceof ServerLevel _level) {
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu221 ? _menu221.getSlots().get(5).getItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu223 ? _menu223.getSlots().get(5).getItem() : ItemStack.EMPTY)
							.getDamageValue() > (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu225 ? _menu225.getSlots().get(5).getItem() : ItemStack.EMPTY).getMaxDamage()
									- 1) {
						if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
							ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.COPPER_BATTERY_DEAD.get()).copy();
							_setstack.setCount(1);
							_menu.getSlots().get(5).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
					}
				}
				if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu228 ? _menu228.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == MinecraftDrugsModItems.VAPE_POD
						.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu230 ? _menu230.getSlots().get(1).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.VAPE_POD.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu232 ? _menu232.getSlots().get(2).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.VAPE_POD.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu234 ? _menu234.getSlots().get(3).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.VAPE_POD.get())
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu236 ? _menu236.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.BREEZE_POWDER.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu238 ? _menu238.getSlots().get(1).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.BREEZE_POWDER.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu240 ? _menu240.getSlots().get(2).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.BREEZE_POWDER.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu242 ? _menu242.getSlots().get(3).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.BREEZE_POWDER.get())
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu244 ? _menu244.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.POTION
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu246 ? _menu246.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Items.POTION
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu248 ? _menu248.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Items.POTION
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu250 ? _menu250.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Items.POTION)
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu252 ? _menu252.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.PITCHER_PASTE.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu254 ? _menu254.getSlots().get(1).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.PITCHER_PASTE.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu256 ? _menu256.getSlots().get(2).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.PITCHER_PASTE.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu258 ? _menu258.getSlots().get(3).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.PITCHER_PASTE.get())) {
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(0).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(1).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(2).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(3).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.VAPE_POD_PITCHER.get()).copy();
						_setstack.setCount(1);
						_menu.getSlots().get(4).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (world instanceof ServerLevel _level)
						_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 5));
					if (world instanceof ServerLevel _level) {
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu266 ? _menu266.getSlots().get(5).getItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu268 ? _menu268.getSlots().get(5).getItem() : ItemStack.EMPTY)
							.getDamageValue() > (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu270 ? _menu270.getSlots().get(5).getItem() : ItemStack.EMPTY).getMaxDamage()
									- 1) {
						if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
							ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.COPPER_BATTERY_DEAD.get()).copy();
							_setstack.setCount(1);
							_menu.getSlots().get(5).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
					}
				}
				if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu273 ? _menu273.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == MinecraftDrugsModItems.VAPE_POD
						.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu275 ? _menu275.getSlots().get(1).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.VAPE_POD.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu277 ? _menu277.getSlots().get(2).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.VAPE_POD.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu279 ? _menu279.getSlots().get(3).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.VAPE_POD.get())
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu281 ? _menu281.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.GROUND_PITCHER_POD_FLAKES.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu283 ? _menu283.getSlots().get(1).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.GROUND_PITCHER_POD_FLAKES.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu285 ? _menu285.getSlots().get(2).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.GROUND_PITCHER_POD_FLAKES.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu287 ? _menu287.getSlots().get(3).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.GROUND_PITCHER_POD_FLAKES.get())
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu289 ? _menu289.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.NETHER_WART_EXTRACT.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu291 ? _menu291.getSlots().get(1).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.NETHER_WART_EXTRACT.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu293 ? _menu293.getSlots().get(2).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.NETHER_WART_EXTRACT.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu295 ? _menu295.getSlots().get(3).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.NETHER_WART_EXTRACT.get())
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu297 ? _menu297.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.MEMBRANE_CHAR.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu299 ? _menu299.getSlots().get(1).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.MEMBRANE_CHAR.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu301 ? _menu301.getSlots().get(2).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.MEMBRANE_CHAR.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu303 ? _menu303.getSlots().get(3).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.MEMBRANE_CHAR.get())) {
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(0).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(1).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(2).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(3).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.VAPE_POD_PHANTOM.get()).copy();
						_setstack.setCount(1);
						_menu.getSlots().get(4).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (world instanceof ServerLevel _level)
						_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 5));
					if (world instanceof ServerLevel _level) {
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu311 ? _menu311.getSlots().get(5).getItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu313 ? _menu313.getSlots().get(5).getItem() : ItemStack.EMPTY)
							.getDamageValue() > (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu315 ? _menu315.getSlots().get(5).getItem() : ItemStack.EMPTY).getMaxDamage()
									- 1) {
						if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
							ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.COPPER_BATTERY_DEAD.get()).copy();
							_setstack.setCount(1);
							_menu.getSlots().get(5).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
					}
				}
				if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu318 ? _menu318.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == MinecraftDrugsModItems.VAPE_POD
						.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu320 ? _menu320.getSlots().get(1).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.VAPE_POD.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu322 ? _menu322.getSlots().get(2).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.VAPE_POD.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu324 ? _menu324.getSlots().get(3).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.VAPE_POD.get())
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu326 ? _menu326.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.SUGAR
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu328 ? _menu328.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Items.SUGAR
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu330 ? _menu330.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Items.SUGAR
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu332 ? _menu332.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Items.SUGAR)
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu334 ? _menu334.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.POTION
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu336 ? _menu336.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Items.POTION
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu338 ? _menu338.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Items.POTION
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu340 ? _menu340.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Items.POTION)
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu342 ? _menu342.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.CHARREDPRISMARINESHARD.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu344 ? _menu344.getSlots().get(1).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.CHARREDPRISMARINESHARD.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu346 ? _menu346.getSlots().get(2).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.CHARREDPRISMARINESHARD.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu348 ? _menu348.getSlots().get(3).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.CHARREDPRISMARINESHARD.get())) {
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(0).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(1).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(2).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(3).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.VAPE_POD_GAURDIAN.get()).copy();
						_setstack.setCount(1);
						_menu.getSlots().get(4).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (world instanceof ServerLevel _level)
						_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 5));
					if (world instanceof ServerLevel _level) {
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu356 ? _menu356.getSlots().get(5).getItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu358 ? _menu358.getSlots().get(5).getItem() : ItemStack.EMPTY)
							.getDamageValue() > (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu360 ? _menu360.getSlots().get(5).getItem() : ItemStack.EMPTY).getMaxDamage()
									- 1) {
						if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
							ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.COPPER_BATTERY_DEAD.get()).copy();
							_setstack.setCount(1);
							_menu.getSlots().get(5).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
					}
				}
				if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu363 ? _menu363.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.BUCKET
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu365 ? _menu365.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Items.BUCKET
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu367 ? _menu367.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Items.BUCKET
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu369 ? _menu369.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Items.BUCKET)
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu371 ? _menu371.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.GUNPOWDER
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu373 ? _menu373.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Items.GUNPOWDER
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu375 ? _menu375.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Items.GUNPOWDER
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu377 ? _menu377.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Items.GUNPOWDER)
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu379 ? _menu379.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.MAGMA_CREAM_EXTRACT.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu381 ? _menu381.getSlots().get(1).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.MAGMA_CREAM_EXTRACT.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu383 ? _menu383.getSlots().get(2).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.MAGMA_CREAM_EXTRACT.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu385 ? _menu385.getSlots().get(3).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.MAGMA_CREAM_EXTRACT.get())
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu387 ? _menu387.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.BLAZE_POWDER
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu389 ? _menu389.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Items.BLAZE_POWDER
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu391 ? _menu391.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Items.BLAZE_POWDER
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu393 ? _menu393.getSlots().get(3).getItem() : ItemStack.EMPTY)
										.getItem() == Items.BLAZE_POWDER)) {
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(0).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(1).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(2).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(3).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.BUCKETOF_LIQUID_BLAZEMPHETAMINE.get()).copy();
						_setstack.setCount(1);
						_menu.getSlots().get(4).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (world instanceof ServerLevel _level)
						_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 5));
					if (world instanceof ServerLevel _level) {
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu401 ? _menu401.getSlots().get(5).getItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu403 ? _menu403.getSlots().get(5).getItem() : ItemStack.EMPTY)
							.getDamageValue() > (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu405 ? _menu405.getSlots().get(5).getItem() : ItemStack.EMPTY).getMaxDamage()
									- 1) {
						if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
							ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.COPPER_BATTERY_DEAD.get()).copy();
							_setstack.setCount(1);
							_menu.getSlots().get(5).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
					}
				}
				if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu408 ? _menu408.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.BUCKET
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu410 ? _menu410.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Items.BUCKET
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu412 ? _menu412.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Items.BUCKET
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu414 ? _menu414.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Items.BUCKET)
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu416 ? _menu416.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.SUGAR
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu418 ? _menu418.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Items.SUGAR
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu420 ? _menu420.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Items.SUGAR
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu422 ? _menu422.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Items.SUGAR)
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu424 ? _menu424.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.DISTILLEDGHASTTEAR.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu426 ? _menu426.getSlots().get(1).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.DISTILLEDGHASTTEAR.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu428 ? _menu428.getSlots().get(2).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.DISTILLEDGHASTTEAR.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu430 ? _menu430.getSlots().get(3).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.DISTILLEDGHASTTEAR.get())
						&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu432 ? _menu432.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getItem() == MinecraftDrugsModItems.BREEZE_POWDER.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu434 ? _menu434.getSlots().get(1).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.BREEZE_POWDER.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu436 ? _menu436.getSlots().get(2).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.BREEZE_POWDER.get()
								|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu438 ? _menu438.getSlots().get(3).getItem() : ItemStack.EMPTY)
										.getItem() == MinecraftDrugsModItems.BREEZE_POWDER.get())) {
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(0).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(1).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(2).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(3).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.BUCKETOF_LIQUID_BREEZEMPHETAMINE.get()).copy();
						_setstack.setCount(1);
						_menu.getSlots().get(4).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (world instanceof ServerLevel _level)
						_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 5));
					if (world instanceof ServerLevel _level) {
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu446 ? _menu446.getSlots().get(5).getItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu448 ? _menu448.getSlots().get(5).getItem() : ItemStack.EMPTY)
							.getDamageValue() > (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu450 ? _menu450.getSlots().get(5).getItem() : ItemStack.EMPTY).getMaxDamage()
									- 1) {
						if (entity instanceof Player _player && _player.containerMenu instanceof MinecraftDrugsModMenus.MenuAccessor _menu) {
							ItemStack _setstack = new ItemStack(MinecraftDrugsModItems.COPPER_BATTERY_DEAD.get()).copy();
							_setstack.setCount(1);
							_menu.getSlots().get(5).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
					}
				}
			}
		}
	}
}