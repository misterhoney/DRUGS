/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftdrugs.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.minecraftdrugs.item.TorchflowerExtractItem;
import net.mcreator.minecraftdrugs.item.PowderedAncientDebrisItem;
import net.mcreator.minecraftdrugs.item.NetherWartExtractItem;
import net.mcreator.minecraftdrugs.item.MembraneExtractItem;
import net.mcreator.minecraftdrugs.item.MagmaCreamExtractItem;
import net.mcreator.minecraftdrugs.item.EchoPasteItem;
import net.mcreator.minecraftdrugs.item.DistilledghasttearItem;
import net.mcreator.minecraftdrugs.item.BottleofLavaItem;
import net.mcreator.minecraftdrugs.item.BeetrootExtractItem;
import net.mcreator.minecraftdrugs.block.display.DistilleryDisplayItem;
import net.mcreator.minecraftdrugs.MinecraftDrugsMod;

public class MinecraftDrugsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(MinecraftDrugsMod.MODID);
	public static final DeferredItem<Item> DISTILLERY = REGISTRY.register(MinecraftDrugsModBlocks.DISTILLERY.getId().getPath(), () -> new DistilleryDisplayItem(MinecraftDrugsModBlocks.DISTILLERY.get(), new Item.Properties()));
	public static final DeferredItem<Item> ECHO_PASTE = REGISTRY.register("echo_paste", EchoPasteItem::new);
	public static final DeferredItem<Item> POWDERED_ANCIENT_DEBRIS = REGISTRY.register("powdered_ancient_debris", PowderedAncientDebrisItem::new);
	public static final DeferredItem<Item> NETHER_WART_EXTRACT = REGISTRY.register("nether_wart_extract", NetherWartExtractItem::new);
	public static final DeferredItem<Item> TORCHFLOWER_EXTRACT = REGISTRY.register("torchflower_extract", TorchflowerExtractItem::new);
	public static final DeferredItem<Item> MEMBRANE_EXTRACT = REGISTRY.register("membrane_extract", MembraneExtractItem::new);
	public static final DeferredItem<Item> DISTILLEDGHASTTEAR = REGISTRY.register("distilledghasttear", DistilledghasttearItem::new);
	public static final DeferredItem<Item> MAGMATIC_COBBLESTONE = block(MinecraftDrugsModBlocks.MAGMATIC_COBBLESTONE);
	public static final DeferredItem<Item> MAGMA_CREAM_EXTRACT = REGISTRY.register("magma_cream_extract", MagmaCreamExtractItem::new);
	public static final DeferredItem<Item> BEETROOT_EXTRACT = REGISTRY.register("beetroot_extract", BeetrootExtractItem::new);
	public static final DeferredItem<Item> BOTTLEOF_LAVA = REGISTRY.register("bottleof_lava", BottleofLavaItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}