public class RollerCoaster extends Attraction implements ISecurity {

    public RollerCoaster(String name, int price, int minAge, int minHeight){
        super(name, price, minAge, minHeight);
    }

    public boolean isAllowedToRide(Visitor visitor){
        if(visitor.getAge() >= this.getMinAge() &&
                visitor.getHeight() >= this.getMinHeight() &&
                visitor.getFunds() >= this.getPrice()){
            return true;
        }
        return false;
    }

}
