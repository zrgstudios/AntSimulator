package insects;

import WorldManager.Coordinate;

public class Ant {
    int Legs = 6;
    int Health = 10;
    Coordinate Location;
    public Ant(Coordinate Location)
    {
        this.Location = Location;
    }

    public Coordinate getLocation() {
        return Location;
    }

    public void setLocation(Coordinate NewLocation)
    {
        Location = NewLocation;
    }
}
