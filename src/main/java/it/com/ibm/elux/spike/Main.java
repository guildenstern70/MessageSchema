/*
 * Copyright (c) IBM Corporation 2016.
 * This is copyrighted software. All rights reserved.
 * IBM - Electrolux - ECP Project
 */

package it.com.ibm.elux.spike;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.JsonSchemaGenerator;

import java.io.IOException;
import java.util.Random;

/**
 *
 */
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("");
        System.out.println("Message Schema v.0.1");
        System.out.println("");
        printSchema();

        System.out.println("");
        System.out.println("Message Examples v.0.1");
        System.out.println("");
        Main.getJSONs();

    }

    private static void printSchema()
    {
        String schema = null;
        try
        {
            schema = Main.getJSONSchema(ApplianceMessage.class);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println(schema);
    }

    private static void getJSONs()
    {
        int howMany = 100;
        Random rnd = new Random();
        while (howMany>0)
        {
            System.out.println("");
            System.out.println("");
            ApplianceMessage am = Generator.generate(rnd);
            System.out.println(am.toJson());
            howMany--;
        }
    }

    private static String getJSONSchema(Class clazz) throws IOException
    {
        ObjectMapper mapper = new ObjectMapper();

        JsonSchemaGenerator schemaGen = new JsonSchemaGenerator(mapper);
        JsonSchema schema = schemaGen.generateSchema(clazz);

        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(schema);
    }
}
