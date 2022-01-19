package mavenTesting.domain;

public class Squirrel extends Animal {
    private int numOfConesInNest;

    //constructor 1
    public Squirrel (int weight, int numOfConesInNest, boolean hungry, int age, String name){
        super(age, weight, name, hungry);
        this.weight = weight;
        this.numOfConesInNest = numOfConesInNest;
        this.hungry = hungry;
        this.age = age;
        this.name = name;
    }

    //constructor 2
    public Squirrel(String name){
        super();
        this.name=name;
    }

    //getters & setters
    public int getWeight() {return weight;}
    public void setWeight(int weight) {this.weight = weight;}

    public int getNumOfConesInNest() {return numOfConesInNest;}
    public void setNumOfConesInNest(int numOfConesInNest) {this.numOfConesInNest = numOfConesInNest;}

    public boolean isHungry() {return hungry;}
    public void setHungry(boolean hungry) {this.hungry = hungry;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    //other methods
    @Override
    public boolean eat(Object food) {
        return food instanceof Pinetree.PineCone;
    }

    public boolean eat(boolean hungry, int numOfConesInNest){
        return (hungry && numOfConesInNest>0);
    }

    @Override
    public String toString() {
        return "The squirrel " + name + " weighs " + weight + " g, is " + age + " years old, have " + numOfConesInNest + " cones in its nest, and the hungerfeelings " + hungry + "!";
    }

}
