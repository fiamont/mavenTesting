package mavenTesting.service;

import mavenTesting.domain.Owl;
import mavenTesting.domain.Pinetree;
import mavenTesting.domain.Squirrel;

public class ForestServiceImpl implements ForestService {

    @Override
    public Owl createOwl(int wingSpan, boolean hungry, int age, int weight, String name){
        return new Owl(name);
    }
    @Override
    public Squirrel createSquirrel(String name){
        return new Squirrel(name);
    }
    @Override
    public Pinetree createPinetree(int age){
        return new Pinetree(age);
    }

}
