package mavenTesting.dao;

import mavenTesting.domain.Owl;
import mavenTesting.domain.Squirrel;
import mavenTesting.domain.Pinetree;

import java.sql.Connection;
import java.sql.SQLException;

public interface ForestDao {

    Owl createOwl(int wingSpan);

    Squirrel createSquirrel(int age, String name);

    Pinetree createPineTree(int numOfPineCones);

    Boolean killOwl(Owl owl);

    Connection getConnection() throws SQLException;

}
