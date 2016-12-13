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

    public static String getRandomUnit()
    {
        int propertyLen = LookupTables.getUnits().length;
        int index = new Random().nextInt(propertyLen-1);
        return LookupTables.getUnits()[index];
    }

    static String getRandomString()
    {
        int propertyLen = LookupTables.getStrings().length;
        int index = new Random().nextInt(propertyLen-1);
        return LookupTables.getStrings()[index];
    }

    static String getRandomParent()
    {
        int propertyLen = LookupTables.getParents().length;
        int index = new Random().nextInt(propertyLen-1);
        return LookupTables.getParents()[index];
    }

    @Contract(" -> !null")
    private static String[] getParents()
    {
        return new String[]{
                "FC-User Selections",
                "FC-Program Parameters"
        };
    }

    @Contract(" -> !null")
    private static String[] getStrings()
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

    @Contract(" -> !null")
    static String[] getUnits()
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

    @Contract(" -> !null")
    private static String[] getNames()
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
