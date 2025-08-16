package net.mcreator.minecraftdrugs.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.minecraftdrugs.procedures.MagmaticCobblestoneBlockAddedProcedure;

public class MagmaticCobblestoneBlock extends Block {
	public MagmaticCobblestoneBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.BASALT).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		MagmaticCobblestoneBlockAddedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}