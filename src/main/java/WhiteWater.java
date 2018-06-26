public class WhiteWater extends Attraction implements ISecurity {

    public WhiteWater(String name, int price, int minAge, int minHeight){
        super(name, price, minAge, minHeight);
    }

    // This class includes (inherits) all the properties and methods of the abstract class
    // 'Attraction' (superclass).

    // All classes that implement ISecurity (i.e. use the ISecurity Interface) must include the methods
    // documented within ISecurity.

    // The interface method within each class itself, can be different. I.e., the isAllowedToRide method
    // below must be included in this class. It also must be included in the RollerCoaster class, but the
    // the method bodies can be different.

    public boolean isAllowedToRide(Visitor visitor){
        if(visitor.getAge() >= this.getMinAge() &&
                visitor.getHeight() >= this.getMinHeight() &&
                visitor.getFunds() >= this.getPrice()){
            return true;
        }
        return false;
    }

}
