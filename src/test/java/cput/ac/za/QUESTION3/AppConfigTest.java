package cput.ac.za.QUESTION3;

import cput.ac.za.AppConfig;
import cput.ac.za.QUESTION3.WithSpringFramework.AccountInterface;
import cput.ac.za.QUESTION3.WithSpringFramework.AccountInterfaceImp;
import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Mandisi on 3/26/2017.
 */
public class AppConfigTest {
    private AccountInterface calc;
    @BeforeMethod
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        calc =(AccountInterfaceImp)ctx.getBean("calc");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        System.out.println("You done testing :)");
    }

    @Test
    public void testBalance() throws Exception {
        int result = calc.balance(10);
        Assert.assertEquals("Subtract (default credict)R20 - results", 10, result);
    }
    @Test
    public void testName() throws Exception {
        Assert.assertEquals("Account Holder == Mandisi", "Mandisi", calc.getName());
    }
    @Test
    public void testAge() throws Exception {
        Assert.assertEquals("Mandisi aged", 26, calc.getAge());
    }
    @Test
    public void testDetails() throws Exception {
        System.out.println("The account holders details :\n"+"Name    :"+calc.getName()+"\n"+"Age     :"+calc.getAge()+"\n"+"Balance :R"+calc.balance(10));
    }
}