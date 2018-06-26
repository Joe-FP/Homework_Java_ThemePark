import java.util.ArrayList;

public abstract class Attraction {

    ArrayList<Visitor> visitors;
    private String name;
    private int price;
    private int minAge;
    private int minHeight;

    public Attraction(String name, int price, int minAge, int minHeight) {
        this.visitors = new ArrayList<Visitor>();
        this.name = name;
        this.price = price;
        this.minAge = minAge;
        this.minHeight = minHeight;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    public int getMinAge(){
        return this.minAge;
    }

    public int getMinHeight(){
        return this.minHeight;
    }

    public void addVisitor(Visitor visitor){
        this.visitors.add(visitor);
    }

    public int visitorCount(){
        return this.visitors.size();
    }
}
