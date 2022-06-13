package world_manager;

import insects.Ant;

import java.util.*;

public class WorldGen {
    public static void main(String[] args) {

        Map<int[], Coordinate> coordinateObjects = new HashMap<>();
        List<Ant> antList = new ArrayList<>();

        int maxName = 10;
        int floor = maxName / 2;

        for (int x = 0; x < maxName; x++) {
            for (int y = 0; y < maxName; y++) {
                for (int z = 0; z < maxName; z++) {
                    Coordinate createdCoordinate = new Coordinate(x, y, z);

                    if (y <= floor) {
                        Dirt DirtBlock = new Dirt(true);
                        createdCoordinate.setState(DirtBlock);
                    } else {
                        Air AirBlock = new Air(false);
                        createdCoordinate.setState(AirBlock);
                    }
                    coordinateObjects.put(createdCoordinate.getCoordinates(), createdCoordinate);
                }
            }
        }
        CreatureGen.generateAnts(antList, coordinateObjects, floor);
        for (Ant IterAnt : antList) {
            System.out.println(IterAnt.toString() + " " + Arrays.toString(IterAnt.getLocation().getCoordinates()));
        }

        for (Map.Entry<int[], Coordinate> entry : coordinateObjects.entrySet()) {
            String currentKey = Arrays.toString(entry.getKey());
            Coordinate cObject = entry.getValue();
            boolean cObjectType = cObject.getState().blockState;
            //System.out.println("Key = " + currentKey + ", State = " + cObjectType);
        }
    }
}
