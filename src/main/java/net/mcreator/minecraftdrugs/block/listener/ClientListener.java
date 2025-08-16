package net.mcreator.minecraftdrugs.block.listener;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.entity.BlockEntityType;

import net.mcreator.minecraftdrugs.init.MinecraftDrugsModBlockEntities;
import net.mcreator.minecraftdrugs.block.renderer.DistilleryTileRenderer;
import net.mcreator.minecraftdrugs.block.entity.DistilleryTileEntity;
import net.mcreator.minecraftdrugs.MinecraftDrugsMod;

@EventBusSubscriber(modid = MinecraftDrugsMod.MODID, value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer((BlockEntityType<DistilleryTileEntity>) MinecraftDrugsModBlockEntities.DISTILLERY.get(), context -> new DistilleryTileRenderer());
	}
}