/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftdrugs.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.minecraftdrugs.MinecraftDrugsMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class MinecraftDrugsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MinecraftDrugsMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CITRINIUM = REGISTRY.register("citrinium",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.minecraft_drugs.citrinium")).icon(() -> new ItemStack(MinecraftDrugsModItems.NETHER_WART_EXTRACT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MinecraftDrugsModBlocks.DISTILLERY.get().asItem());
				tabData.accept(MinecraftDrugsModBlocks.MORTARAND_PESTLE.get().asItem());
				tabData.accept(MinecraftDrugsModItems.BREEZE_POWDER.get());
				tabData.accept(MinecraftDrugsModItems.NETHER_WART_EXTRACT.get());
				tabData.accept(MinecraftDrugsModItems.TORCHFLOWER_EXTRACT.get());
				tabData.accept(MinecraftDrugsModItems.MEMBRANE_EXTRACT.get());
				tabData.accept(MinecraftDrugsModItems.DISTILLEDGHASTTEAR.get());
				tabData.accept(MinecraftDrugsModItems.MAGMA_CREAM_EXTRACT.get());
				tabData.accept(MinecraftDrugsModItems.BEETROOT_EXTRACT.get());
				tabData.accept(MinecraftDrugsModItems.BOTTLEOF_LAVA.get());
				tabData.accept(MinecraftDrugsModItems.MEMBRANE_CHAR.get());
				tabData.accept(MinecraftDrugsModItems.CHARREDPRISMARINESHARD.get());
				tabData.accept(MinecraftDrugsModItems.POWDERED_ANCIENT_DEBRIS.get());
				tabData.accept(MinecraftDrugsModItems.ECHO_PASTE.get());
				tabData.accept(MinecraftDrugsModItems.GROUND_PITCHER_POD_FLAKES.get());
				tabData.accept(MinecraftDrugsModItems.GROUND_TORCH_FLOWER_FLAKES.get());
				tabData.accept(MinecraftDrugsModBlocks.MAGMATIC_COBBLESTONE.get().asItem());
				tabData.accept(MinecraftDrugsModItems.PITCHER_PASTE.get());
				tabData.accept(MinecraftDrugsModItems.MEMBRANE_PASTE.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(MinecraftDrugsModBlocks.DISTILLERY.get().asItem());
		}
	}
}