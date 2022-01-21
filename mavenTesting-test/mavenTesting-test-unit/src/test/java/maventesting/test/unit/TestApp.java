package maventesting.test.unit;

import mavenTesting.domain.App;
import mavenTesting.domain.Owl;
import mavenTesting.domain.Squirrel;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestApp {

    @Test
    public void testAppen(){
        App.app();
    }

    @Test
    public void testCreateSquirrel(){

        List<Squirrel> squirrelList = App.createSquirrels();
        Assert.assertEquals(3,squirrelList.size());

    }

    @Test
    public void testCreateOwl(){
        Owl owl = App.createOwl();
        Assert.assertEquals("Hedvig",owl.getName());
    }

}
