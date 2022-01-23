package maventesting.test.unit;

import mavenTesting.domain.Owl;
import mavenTesting.service.ForestService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:mavenTesting-service.xml");

    private ForestService forestService;

    @Before
    public void before(){
        forestService = (ForestService) applicationContext.getBean("forestService");
    }

    @Test
    public void testForestServiceDependencyInjection(){
        Owl owl = forestService.createOwl(91, true, 7, 456, "Hedvig");
    }


}
