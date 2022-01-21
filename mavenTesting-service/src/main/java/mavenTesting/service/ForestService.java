package mavenTesting.service;

import mavenTesting.domain.Owl;
import mavenTesting.domain.Pinetree;
import mavenTesting.domain.Squirrel;

public interface ForestService {
    public Owl createOwl(int wingSpan, boolean hungry, int age, int weight, String name);
    public Squirrel createSquirrel(String name);
    public Pinetree createPinetree(int age);
}
