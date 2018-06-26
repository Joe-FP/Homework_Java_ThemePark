import com.sun.corba.se.spi.protocol.InitialServerRequestDispatcher;

import java.util.ArrayList;

public class ThemePark {

    // This class is the over-arching class that pulls together attractions and visitors.

    String parkName;
    ArrayList<Attraction> attractions;

    public ThemePark(String parkName) {
        this.parkName = parkName;
        this.attractions = new ArrayList<Attraction>();
    }

    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }

    public int attractionCount() {
        return this.attractions.size();
    }

    public String getName() {
        return this.parkName;
    }

    // The .isAllowedToRide method is part of the ISecurity interface. It is implemented
    // in RollerCoaster and WhiteWater, but not in the abstract class Attraction.

    // In order to use this method on the Attraction object which has been passed into the
    // visit method (below), we have to type cast the attraction object as ISecurity.

    // Interfaces can be used as types.

    // Is is more common to cast an object to a 'more' specific class type?
    // Should you be casting an object to a less specific class type as below?

    public void visit(Attraction attraction, Visitor visitor){
        if( ((ISecurity)attraction).isAllowedToRide(visitor) ){
            attraction.addVisitor(visitor);
        }

    }

}
