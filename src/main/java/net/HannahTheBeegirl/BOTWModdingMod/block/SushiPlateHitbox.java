package net.HannahTheBeegirl.BOTWModdingMod.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class SushiPlateHitbox extends DecorationBlock{
    public SushiPlateHitbox(Settings settings){
        super(settings);
        setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext ctx) {
        Direction dir = state.get(FACING);
        switch(dir) {
            case NORTH:
            case SOUTH:
                return VoxelShapes.cuboid(-0.375f, 0f, 0.125f, 1.375f, 0.0875f, 0.875f);
            case EAST:
            case WEST:
                return VoxelShapes.cuboid(0.125f, 0f, -0.275f, 0.875f, 0.0875f, 1.375f);
            default:
                return VoxelShapes.fullCube();
        }
    }
}
