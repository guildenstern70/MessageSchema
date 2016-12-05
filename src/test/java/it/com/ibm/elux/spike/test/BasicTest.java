package it.com.ibm.elux.spike.test;

import it.com.ibm.elux.spike.ApplianceMessage;
import it.com.ibm.elux.spike.Generator;
import org.junit.*;

import java.util.Random;

/**
 *
 */
public class BasicTest
{

    // Run once, e.g. Database connection, connection pool
    @BeforeClass
    public static void runOnceBeforeClass()
    {
    }

    // Run once, e.g close connection, cleanup
    @AfterClass
    public static void runOnceAfterClass()
    {
    }

    // Should rename to @BeforeTestMethod
    // e.g. Creating an similar object and share for all @Test
    @Before
    public void runBeforeTestMethod()
    {
    }

    // Should rename to @AfterTestMethod
    @After
    public void runAfterTestMethod()
    {
    }

    @Test
    public void generate()
    {
        int howMany = 100;
        Random rnd = new Random();
        while (howMany>0)
        {
            ApplianceMessage am = Generator.generate(rnd);
            System.out.println(am.toString());
            howMany--;
        }
    }



}
