package net.mcreator.minecraftdrugs.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.minecraftdrugs.block.model.DistilleryBlockModel;
import net.mcreator.minecraftdrugs.block.entity.DistilleryTileEntity;

public class DistilleryTileRenderer extends GeoBlockRenderer<DistilleryTileEntity> {
	public DistilleryTileRenderer() {
		super(new DistilleryBlockModel());
	}

	@Override
	public RenderType getRenderType(DistilleryTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}