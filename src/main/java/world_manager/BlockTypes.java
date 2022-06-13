package world_manager;

public class BlockTypes {
    boolean blockState;

    public BlockTypes(boolean BlockState) {
        this.blockState = BlockState;
    }
}

class Dirt extends BlockTypes {
    public Dirt(boolean blockState) {
        super(blockState);
    }
}

class Air extends BlockTypes {
    public Air(boolean blockState) {
        super(blockState);
    }
}