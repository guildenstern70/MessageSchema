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
        am.getMainProperty().setValue(Property.getRandom());
        return am;
    }

    public static ApplianceMessage genUserSelections(ApplianceMessage am)
    {
        Property property = am.getMainProperty();
        property.setName("UserSelections");
        property.setValue("Container");

        Property[] properties =
                ComponentsGenerator.userSelectionsGenerator();
        for (Property xprop : properties)
        {
            am.addProperty(xprop);
        }

        return am;
    }

    public static ApplianceMessage genProgramParams(ApplianceMessage am)
    {

        Property property = am.getMainProperty();
        property.setName("ProgramParameters");
        property.setValue("Container");

        Property[] properties =
                ComponentsGenerator.programParametersGenerator();
        for (Property xprop : properties)
        {
            am.addProperty(xprop);
        }

        return am;
    }

}
