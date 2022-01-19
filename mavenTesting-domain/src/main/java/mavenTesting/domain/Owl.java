package mavenTesting.domain;

import java.util.Random;

public class Owl extends Animal{
    private int wingSpan;

    //constructor 1
    public Owl(int wingSpan, boolean hungry, int age, int weight, String name){
        super(age, weight, name, hungry);
        this.wingSpan = wingSpan;
        this.hungry = hungry;
        this.age = age;
        this.weight = weight;
        this.name = name;
    }
    //constructor 2
    public Owl(String name){
        super();
        this.name=name;
    }

    //getters & setters
    public int getWingSpan() {return wingSpan;}
    public void setWingSpan(int wingSpan) {this.wingSpan = wingSpan;}

    public boolean isHungry() {return hungry;}
    public void setHungry(boolean hungry) {this.hungry = hungry;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public int getWeight() {return weight;}
    public void setWeight(int weight) {this.weight = weight;}

    //other methods
    @Override
    public boolean eat(Object food) {
        return false;
    }

    public boolean eat(boolean night, boolean hungry){
        Random random = new Random();
        int successOrNot = random.nextInt(2);
        return (night && hungry && successOrNot==1);
    }

    @Override
    public String toString() {
        return "The owl " + name + " weighs " + weight + " g, is " + age + " years old, have a wingspan of " + wingSpan + " cm, and the hungerfeelings is " + hungry + "!";
    }
}

