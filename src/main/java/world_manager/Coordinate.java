package world_manager;

import insects.Ant;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Coordinate {

    private final int xCoordinate;
    private final int yCoordinate;
    private final int zCoordinate;
    private final int[] xyz = new int[3];
    private BlockTypes blockType;

    public Coordinate(int xCoordinate, int yCoordinate, int zCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.zCoordinate = zCoordinate;
        xyz[0] = this.xCoordinate;
        xyz[1] = this.yCoordinate;
        xyz[2] = this.zCoordinate;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public int getZCoordinate() {
        return zCoordinate;
    }

    public int[] getCoordinates() {
        return this.xyz;
    }

    public BlockTypes getState() {
        return this.blockType;
    }

    public void setState(BlockTypes State) {
        this.blockType = State;
    }

    public static int[] getRandomCoordinate(Map<int[], Coordinate> coordinateObjects) {
        Random rand = new Random();
        List<int[]> keys = new ArrayList<>(coordinateObjects.keySet());
        return keys.get(rand.nextInt(keys.size()));
    }

    public static Coordinate getRandomUnoccupiedCoordinate(Map<int[], Coordinate> coordinateObjects, List<Ant> antList) {
        int[] randKey = getRandomCoordinate(coordinateObjects);
        List<int[]> AntLocations = new ArrayList<>();
        for (Ant iterAnt : antList) {
            AntLocations.add(iterAnt.getLocation().getCoordinates());
        }
        while (AntLocations.contains(randKey)) {
            randKey = getRandomCoordinate(coordinateObjects);
        }
        return coordinateObjects.get(randKey);
    }
}
