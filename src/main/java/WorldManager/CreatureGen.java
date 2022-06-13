package WorldManager;

import insects.Ant;

import java.util.*;

public class CreatureGen {

    private static int[] GetRandomCoordinate(Map<int[], Coordinate> CoordinateObjects)
    {
        Random Rand = new Random();
        List<int[]> Keys = new ArrayList<>(CoordinateObjects.keySet());
        return Keys.get(Rand.nextInt(Keys.size()));
    }
    private static Coordinate GetRandomUnoccupiedCoordinate(Map<int[], Coordinate> CoordinateObjects, List<Ant>AntList)
    {
        int[] RandKey = GetRandomCoordinate(CoordinateObjects);
        List<int[]> AntLocations = new ArrayList<>();
        for (Ant IterAnt : AntList)
        {
            AntLocations.add(IterAnt.getLocation().getCoordinates());
        }
        while (true)
        {
            if (AntLocations.contains(RandKey))
            {
                RandKey = GetRandomCoordinate(CoordinateObjects);
            }
            else
            {
                break;
            }
        }
        return CoordinateObjects.get(RandKey);
    }
    public static void AddAnts(List<Ant> AntList, Map<int[], Coordinate> CoordinateObjects, int Floor) {
        for (int i = 0; i < 3; i++)
        {
            Coordinate Value = GetRandomUnoccupiedCoordinate(CoordinateObjects, AntList);
            while (Value.getYCoordinate() != Floor)
            {
                Value = GetRandomUnoccupiedCoordinate(CoordinateObjects, AntList);
            }

            Ant NewAnt = new Ant(Value);
            AntList.add(NewAnt);
        }
    }
}
