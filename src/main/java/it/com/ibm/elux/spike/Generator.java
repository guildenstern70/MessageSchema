/*
 * Copyright (c) IBM Corporation 2016.
 * This is copyrighted software. All rights reserved.
 * IBM - Electrolux - ECP Project
 */

package it.com.ibm.elux.spike;

import java.util.Random;

/**
 *
 */
public class Generator
{

    public static Message generate(Random rnd)
    {
        Message am = Message.create();
        am.setVersion("ad");
        am.setSource("WM1");
        am.setDestination("ECP");
        am.setOperationMode(OperationMode.INF_SEND);

        int nextInt = rnd.nextInt(15);
        if (nextInt % 3 == 0)
        {
            am = Generator.genUserSelections(am);
        }
        else if (nextInt % 5 == 0)
        {
            am = Generator.genProgramParams(am);
        }
        else
        {
            am = Generator.generatePlain(am);
        }

        if (nextInt == 10 || nextInt == 11)
        {
            am.addMetadata("Weight Unit", "kg");
            am.addMetadata("Temperature Unit", "C");
            am.addMetadata("Test", "true");
        }

        return am;
    }

    public static Message genUserSelections(Message am)
    {
        am.setMainComponent("1C09", true);  // UserSelections
        Component[] properties =
                ComponentsGenerator.userSelectionsGenerator();

        for (Component property : properties)
        {
            am.addComponent(property);
        }

        return am;
    }

    public static Message genProgramParams(Message am)
    {
        am.setMainComponent("1C0A", true);  // ProgramParameters

        Component[] properties =
                ComponentsGenerator.programParametersGenerator();
        for (Component property : properties)
        {
            am.addComponent(property);
        }

        return am;
    }

    public static Message generatePlain(Message am)
    {
        Component mainComponent = new Component();
        mainComponent.setName(LookupTables.getRandomName());
        mainComponent.setValue(Component.getRandom());
        am.addComponent(mainComponent);
        return am;
    }

}
