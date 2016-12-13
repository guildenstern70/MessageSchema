/*
 * Copyright (c) IBM Corporation 2016.
 * This is copyrighted software. All rights reserved.
 * IBM - Electrolux - ECP Project
 */

package it.com.ibm.elux.spike.test;

import it.com.ibm.elux.spike.ApplianceMessage;
import it.com.ibm.elux.spike.ApplianceMessageFactory;
import it.com.ibm.elux.spike.Generator;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

/**
 *
 */
public class BasicTest
{

    @Test
    public void createFromJSON()
    {
        String[] jsons = InputValues.getJSONMessages();

        for (String json : jsons)
        {
            ApplianceMessage am = ApplianceMessageFactory.fromJSON(json);
            Assert.assertNotNull(am);
            System.out.println(am.toString());
        }
    }

    @Test
    public void generate()
    {
        int howMany = 100;
        Random rnd = new Random();
        while (howMany>0)
        {
            ApplianceMessage am = Generator.generate(rnd);
            Assert.assertNotNull(am);
            System.out.println(am.toString());
            howMany--;
        }
    }


}
