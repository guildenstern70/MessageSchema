package it.com.ibm.elux.spike;

import java.util.Random;

/**
 *
 */
public class LookupTables
{

    public static String getRandomName()
    {
        int propertyLen = LookupTables.getNames().length;
        int index = new Random().nextInt(propertyLen-1);
        return LookupTables.getNames()[index];
    }

    public static String getRandomUnit()
    {
        int propertyLen = LookupTables.getUnits().length;
        int index = new Random().nextInt(propertyLen-1);
        return LookupTables.getUnits()[index];
    }

    public static String getRandomString()
    {
        int propertyLen = LookupTables.getStrings().length;
        int index = new Random().nextInt(propertyLen-1);
        return LookupTables.getStrings()[index];
    }

    public static String getRandomParent()
    {
        int propertyLen = LookupTables.getParents().length;
        int index = new Random().nextInt(propertyLen-1);
        return LookupTables.getParents()[index];
    }

    public static String[] getParents()
    {
        return new String[]{
                "FC-User Selections",
                "FC-Program Parameters"
        };
    }

    public static String[] getStrings()
    {
        return new String[]{
                "Running",
                "Paused",
                "Stand-By",
                "Temporary Locked",
                "Open",
                "Close",
                "Fix",
                "Stay",
                "Numbered",
                "Emerald",
                "Working"
        };
    }

    public static String[] getUnits()
    {
        return new String[]{
                "secs",
                "msecs",
                "min",
                "h",
                "days",
                "m",
                "km",
                "l",
                "ml"
        };
    }

    public static String[] getNames()
    {
        return new String[] {
                "ApplianceMode",
                "DoorLock",
                "CurrentDetergentDoseTwo",
                "LinkQualityIndicator",
                "SilentMode",
                "MaxLoadDetergentDoseOne",
                "CurrentDetergentDoseOne",
                "MeasuredLoadWeight",
                "RemoteControl",
                "ApplianceElc",
                "ApplianceMainBoardSwVersion",
                "ApplianceBootState",
                "ExecuteCommand",
                "StartTime",
                "WaterHardness",
                "NiuAlertEvent",
                "CycleSubPhase",
                "Language",
                "UserSelections",
                "WashingNominalLoadWeight",
                "AppliancePnc",
                "MaxLoadDetergentDoseTwo",
                "ApplianceState",
                "DoorState",
                "ProgramParameters",
                "WaterSoftenerMode",
                "ApplianceTotalWorkingTime",
                "MacAddress",
                "TimeToEnd",
                "AlertEvent",
                "ApplianceUiSwVersion",
                "LocalTime",
                "UiLockMode",
                "CyclePhase",
                "SerialNumber",
                "InstallationState",
                "TotalCycleCounter"
        };
    }
}
