package WorldManager;

import insects.Ant;

import java.util.*;

public class WorldGen {
    public static void main(String[] args) {

        Map<int[], Coordinate> CoordinateObjects = new HashMap<>();
        List<Ant> AntList = new ArrayList<>();

        int MaxNum = 10;
        int floor = MaxNum/2;

        for (int x = 0; x < MaxNum; x++)
        {
            for (int y = 0; y < MaxNum; y++)
            {
                for (int z = 0; z < MaxNum; z++)
                {
                    Coordinate CreatedCoordinate = new Coordinate(x, y, z);

                    if (y <= floor)
                    {
                        Dirt DirtBlock = new Dirt(true);
                        CreatedCoordinate.setState(DirtBlock);
                    }

                    else
                    {
                        Air AirBlock = new Air(false);
                        CreatedCoordinate.setState(AirBlock);
                    }
                    CoordinateObjects.put(CreatedCoordinate.getCoordinates(), CreatedCoordinate);
                }
            }
        }
        CreatureGen.AddAnts(AntList, CoordinateObjects, floor);
        for (Ant IterAnt : AntList)
        {
            System.out.println(IterAnt.toString() + " " + Arrays.toString(IterAnt.getLocation().getCoordinates()));
        }

        for (Map.Entry<int[], Coordinate> entry : CoordinateObjects.entrySet())
        {
           String CurrentKey = Arrays.toString(entry.getKey());
           Coordinate CObject = entry.getValue();
           boolean CObjectType = CObject.getState().BlockState;
           //System.out.println("Key = " + CurrentKey + ", State = " + CObjectType);
        }
    }
}
