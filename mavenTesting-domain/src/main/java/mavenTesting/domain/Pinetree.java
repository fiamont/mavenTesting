package mavenTesting.domain;

import java.util.ArrayList;

public class Pinetree {
    private int numOfCones;
    private int age;
    private int pests;
    private Owl owl;
    private ArrayList<Squirrel> squirrels;

    //constructor 1
    public Pinetree(int numOfCones, int age, int pests, Owl owl, ArrayList<Squirrel> squirrels){
        this.numOfCones = numOfCones;
        this.age = age;
        this.pests = pests;
        this.owl = owl;
        this.squirrels = squirrels;
    }

    //constructor 2
    public Pinetree(int age){
        super();
        this.age=age;
    }

    //getters & setters
    public int getNumOfCones() {return numOfCones;}
    public void setNumOfCones(int numOfCones) {this.numOfCones = numOfCones;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public int getPests() {return pests;}
    public void setPests(int pests) {this.pests = pests;}

    public Owl getOwl() {return owl;}
    public void setOwl(Owl owl) {this.owl = owl;}

    public ArrayList<Squirrel> getSquirrels() {return squirrels;}
    public void setSquirrels(ArrayList<Squirrel> squirrels) {this.squirrels = squirrels;}

    //other methods/classes
    public boolean fall(int pests, int age){
        return (pests>10&&age>400);
    }

    static class PineCone{}

    @Override
    public String toString() {
        return "In this tree lives " + squirrels.size() + " squirrels and an owl." + " It got " + pests + " pests and " + numOfCones + " cones, and is " + age + " years old!";

    }
}