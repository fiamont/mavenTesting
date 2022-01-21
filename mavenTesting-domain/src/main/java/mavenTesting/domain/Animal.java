package mavenTesting.domain;

public abstract class Animal {
    protected int age;
    protected int weight;
    protected String name;
    protected boolean hungry;

    //constructor 1
    public Animal(){};

    //constructor 2
    public Animal(int age, int weight, String name, boolean hungry) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.hungry = hungry;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    //other methods
    public abstract boolean eat(Object food);

}