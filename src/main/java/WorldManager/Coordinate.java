package WorldManager;

import insects.Ant;

public class Coordinate {

    private final int XCoordinate;
    private final int YCoordinate;
    private final int ZCoordinate;
    private final int[] XYZ = new int[3];
    private BlockTypes BlockType;

    public Coordinate(int XCoordinate, int YCoordinate, int ZCoordinate)
    {
        this.XCoordinate = XCoordinate;
        this.YCoordinate = YCoordinate;
        this.ZCoordinate = ZCoordinate;
        XYZ[0] = this.XCoordinate;
        XYZ[1] = this.YCoordinate;
        XYZ[2] = this.ZCoordinate;
    }

    public int getXCoordinate()
    {
        return XCoordinate;
    }

    public int getYCoordinate()
    {
        return YCoordinate;
    }

    public int getZCoordinate() {
        return ZCoordinate;
    }

    public int[] getCoordinates()
    {
        return this.XYZ;
    }

    public BlockTypes getState()
    {
        return this.BlockType;
    }

    public void setState(BlockTypes State)
    {
        this.BlockType = State;
    }
}
