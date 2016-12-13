/*
 * Copyright (c) IBM Corporation 2016.
 * This is copyrighted software. All rights reserved.
 * IBM - Electrolux - ECP Project
 */

package it.com.ibm.elux.spike;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Random;

/**
 *
 */
public class Component
{
    @JsonProperty
    private String name;

    @JsonProperty
    private Object value;


    public Component()
    {
    }

    public Component(String name, Object value)
    {
        this.name = name;
        this.value = value;
    }

    public static Boolean getRandomBoolean()
    {
        Random rndSeed = new Random();
        int dice = rndSeed.nextInt(500);
        Boolean av;
        av = dice % 2 == 0;
        return av;
    }

    public static Object getRandom()
    {
        Random rndSeed = new Random();
        int dice = rndSeed.nextInt(500);
        Object av;
        if (dice % 2 == 0)
        {
            av = rndSeed.nextInt(200);
        }
        else
        {
            av = LookupTables.getRandomString();
        }
        return av;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Object getValue()
    {
        return value;
    }

    public void setValue(Object value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return " Component: " + this.getName() + " > Value = " + this.getValue();
    }
}
