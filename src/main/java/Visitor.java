public class Visitor {

    String name;
    int age;
    int height;
    int funds;

    public Visitor(String name, int age, int height, int funds) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.funds = funds;
    }

    public String getName() { return this.name; }

    public int getAge() { return this.age; }

    public int getHeight() { return this.height; }

    public int getFunds() { return this.funds; }

}
