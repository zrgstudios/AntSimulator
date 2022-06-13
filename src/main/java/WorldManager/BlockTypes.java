package WorldManager;

public class BlockTypes {
    boolean BlockState;
    public BlockTypes(boolean BlockState)
    {
        this.BlockState = BlockState;
    }
}

class Dirt extends BlockTypes {

    public Dirt(boolean BlockState) {
        super(BlockState);
    }
}

class Air extends BlockTypes {
    public Air(boolean BlockState) {
        super(BlockState);
    }
}