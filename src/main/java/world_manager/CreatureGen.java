package world_manager;

import insects.Ant;

import java.util.List;
import java.util.Map;

import static world_manager.Coordinate.getRandomUnoccupiedCoordinate;

public class CreatureGen {

    public static void generateAnts(List<Ant> antList, Map<int[], Coordinate> coordinateObjects, int floor) {
        for (int i = 0; i < 3; i++) {
            Coordinate coordinate = getRandomUnoccupiedCoordinate(coordinateObjects, antList);
            while (coordinate.getYCoordinate() != floor) {
                coordinate = getRandomUnoccupiedCoordinate(coordinateObjects, antList);
            }
            Ant NewAnt = new Ant(coordinate);
            antList.add(NewAnt);
        }
    }
}
