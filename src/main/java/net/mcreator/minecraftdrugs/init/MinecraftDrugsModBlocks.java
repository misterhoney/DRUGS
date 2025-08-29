/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftdrugs.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.minecraftdrugs.block.MortarandPestleBlock;
import net.mcreator.minecraftdrugs.block.MagmaticCobblestoneBlock;
import net.mcreator.minecraftdrugs.block.DistilleryBlock;
import net.mcreator.minecraftdrugs.MinecraftDrugsMod;

public class MinecraftDrugsModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(MinecraftDrugsMod.MODID);
	public static final DeferredBlock<Block> DISTILLERY = REGISTRY.register("distillery", DistilleryBlock::new);
	public static final DeferredBlock<Block> MAGMATIC_COBBLESTONE = REGISTRY.register("magmatic_cobblestone", MagmaticCobblestoneBlock::new);
	public static final DeferredBlock<Block> MORTARAND_PESTLE = REGISTRY.register("mortarand_pestle", MortarandPestleBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}