package mavenTesting.service;

import mavenTesting.domain.Owl;
import mavenTesting.domain.Pinetree;
import mavenTesting.domain.Squirrel;

public class ForrestServiceImpl {

    public Owl createOwl(int wingSpan, boolean hungry, int age, int weight, String name){
        return new Owl(name);
    }
    public Squirrel createSquirrel(String name){
        return new Squirrel(name);
    }
    public Pinetree createPinetree(int age){
        return new Pinetree(age);
    }

}
