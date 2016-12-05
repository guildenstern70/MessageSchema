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
        am.getMainProperty().setName(LookupTables.getRandomName());
        am.getMainProperty().setValue(Component.getRandom());
        return am;
    }

    public static ApplianceMessage genUserSelections(ApplianceMessage am)
    {
        Component component = am.getMainProperty();
        component.setName("UserSelections");
        component.setValue("Container");

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

        Component component = am.getMainProperty();
        component.setName("ProgramParameters");
        component.setValue("Container");

        Component[] properties =
                ComponentsGenerator.programParametersGenerator();
        for (Component xprop : properties)
        {
            am.addComponent(xprop);
        }

        return am;
    }

}
