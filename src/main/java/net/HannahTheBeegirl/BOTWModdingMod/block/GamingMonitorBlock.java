package net.HannahTheBeegirl.BOTWModdingMod.block;

import net.HannahTheBeegirl.BOTWModdingMod.block.enums.Wallpaper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class GamingMonitorBlock extends HorizontalFacingBlock {
    public static final EnumProperty<Wallpaper> WALLPAPER = EnumProperty.of("wallpaper", Wallpaper.class);

    public GamingMonitorBlock(Settings settings){
        super(settings);
        setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
        setDefaultState(this.stateManager.getDefaultState().with(WALLPAPER, Wallpaper.DEFAULT));
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(Properties.HORIZONTAL_FACING);
        stateManager.add(WALLPAPER);
    }
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(Properties.HORIZONTAL_FACING, ctx.getPlayerFacing().getOpposite());
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext ctx) {
        Direction dir = state.get(FACING);
        VoxelShape temp1 = VoxelShapes.cuboid(0f, 0f, 0f, 1f, 1f/16f, 1f);
        VoxelShape temp2;
        switch(dir) {
            case NORTH:
                temp2 = VoxelShapes.cuboid(0f, 0f, 12f/16f, 1f, 12f/16f, 14f/16f);
                break;
            case SOUTH:
                temp2 = VoxelShapes.cuboid(0f, 0f, 2f/16f, 1f, 12f/16f, 4f/16f);
                break;
            case EAST:
                temp2 = VoxelShapes.cuboid(2f/16f, 0f, 0f, 4f/16f, 12f/16f, 1f);
                break;
            case WEST:
            default:
                temp2 = VoxelShapes.cuboid(12f/16f, 0f, 0f, 14f/16f, 12f/16f, 1f);
                break;
        }
        return VoxelShapes.union(temp1, temp2);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        world.setBlockState(pos, state.with(WALLPAPER, Wallpaper.next(state.get(WALLPAPER))));
        return ActionResult.SUCCESS;
    }
}
