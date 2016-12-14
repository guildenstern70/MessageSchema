/*
 * Copyright (c) IBM Corporation 2016.
 * This is copyrighted software. All rights reserved.
 * IBM - Electrolux - ECP Project
 */

package it.com.ibm.elux.spike.test;

import it.com.ibm.elux.spike.ApplianceMessage;
import it.com.ibm.elux.spike.Component;
import it.com.ibm.elux.spike.Generator;
import it.com.ibm.elux.spike.Message;
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
            ApplianceMessage am = ApplianceMessage.fromJSON(json);
            Assert.assertNotNull(am);
            System.out.println(am.toString());
        }
    }

    @Test
    public void generateContainer()
    {
        Component[] components = InputValues.getContainerComponents();
        Message am = Message.createContainer("1C0A", components);
        Assert.assertEquals("1C0A", am.getName());
    }

    @Test
    public void generateSimple()
    {
        Message am = Message.create("1C14", 200);
        Assert.assertEquals("1C14", am.getName());
        Assert.assertEquals(200, am.getValue());
    }

    @Test
    public void generateSimpleWithMetadata()
    {
        Message am = Message.create("1C12", 45);
        am.addMetadata("Units", "kg");
        Assert.assertEquals("1C12", am.getName());
        Assert.assertEquals(45, am.getValue());
        Assert.assertEquals("kg", am.getMetadata("Units"));
    }

    @Test
    public void generatedJSON()
    {
        int howMany = 100;
        Random rnd = new Random();
        System.out.println("[");
        while (howMany>0)
        {
            ApplianceMessage am = Generator.generate(rnd);
            Assert.assertNotNull(am);
            System.out.print(am.toJson());
            System.out.println(",");
            howMany--;
        }
        System.out.println("]");
    }


}
