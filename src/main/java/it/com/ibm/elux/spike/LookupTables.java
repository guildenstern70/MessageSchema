/*
 * Copyright (c) IBM Corporation 2016.
 * This is copyrighted software. All rights reserved.
 * IBM - Electrolux - ECP Project
 */

package it.com.ibm.elux.spike;

import org.jetbrains.annotations.Contract;

import java.util.Random;

/**
 *
 */
public class LookupTables
{

    static String getRandomName()
    {
        int propertyLen = LookupTables.getNames().length;
        int index = new Random().nextInt(propertyLen-1);
        return LookupTables.getNames()[index];
    }

    @Contract(" -> !null")
    private static String[] getNames()
    {
        return WMGrammar.availableNames();
    }

    public static String getRandomUnit()
    {
        int propertyLen = LookupTables.getUnits().length;
        int index = new Random().nextInt(propertyLen-1);
        return LookupTables.getUnits()[index];
    }

    @Contract(" -> !null")
    static String[] getUnits()
    {
        return new String[]{
                "secs",
                "min",
                "h",
                "days",
                "m",
                "km",
                "l",
                "ml"
        };
    }

    static String getRandomString()
    {
        int propertyLen = LookupTables.getStrings().length;
        int index = new Random().nextInt(propertyLen - 1);
        return LookupTables.getStrings()[index];
    }

    @Contract(" -> !null")
    private static String[] getStrings()
    {
        return new String[]{
                "0A",
                "0B",
                "1B",
                "1A",
                "2F",
                "2C",
                "3A",
                "3B",
                "3D",
                "4E",
                "5F"
        };
    }
}
