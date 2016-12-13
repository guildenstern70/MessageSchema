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

    public static ApplianceMessage generate(Random rnd)
    {
        ApplianceMessage am = new ApplianceMessage();
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

        return am;
    }

    public static ApplianceMessage generatePlain(ApplianceMessage am)
    {
        Component mainComponent = new Component();
        mainComponent.setName(LookupTables.getRandomName());
        mainComponent.setValue(Component.getRandom());
        am.addComponent(mainComponent);
        return am;
    }

    public static ApplianceMessage genUserSelections(ApplianceMessage am)
    {
        am.setName("1C09");  // UserSelections
        Component[] properties =
                ComponentsGenerator.userSelectionsGenerator();

        for (Component xprop : properties)
        {
            am.addComponent(xprop);
        }

        return am;
    }

    public static ApplianceMessage genProgramParams(ApplianceMessage am)
    {
        am.setName("1C0A");  // ProgramParameters

        Component[] properties =
                ComponentsGenerator.programParametersGenerator();
        for (Component xprop : properties)
        {
            am.addComponent(xprop);
        }

        return am;
    }

}
