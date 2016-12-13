/*
 * Copyright (c) IBM Corporation 2016.
 * This is copyrighted software. All rights reserved.
 * IBM - Electrolux - ECP Project
 */

package it.com.ibm.elux.spike;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

/**
 *
 */
public class ApplianceMessageFactory
{
    public static ApplianceMessage fromJSON(String jsonMessage)
    {
        ObjectMapper mapper = new ObjectMapper();
        ApplianceMessage am = null;
        try
        {
            am = mapper.readValue(jsonMessage, ApplianceMessage.class);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return am;
    }
}
