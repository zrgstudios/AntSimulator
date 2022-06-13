package insects;

import world_manager.Coordinate;

public class Ant {
    int Legs = 6;
    int Health = 10;
    Coordinate Location;

    public Ant(Coordinate location) {
        this.Location = location;
    }

    public Coordinate getLocation() {
        return Location;
    }

    public void setLocation(Coordinate newLocation) {
        Location = newLocation;
    }
}
