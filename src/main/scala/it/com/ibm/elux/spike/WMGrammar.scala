/*
 * Copyright (c) IBM Corporation 2016.
 * This is copyrighted software. All rights reserved.
 * IBM - Electrolux - ECP Project
 */

package it.com.ibm.elux.spike

import scala.collection.immutable.HashMap
import scala.collection.{immutable, mutable}

/**
  *
  */
object WMGrammar
{

    val alljoynmap: HashMap[String, String] = immutable.HashMap[String, String](
        "AlertEvent" -> "0470",
        "AnalogSpinSpeed" -> "?",
        "AnalogTemperature" -> "?",
        "AntiCreasePhase" -> "?",
        "ApplianceBootState" -> "04B4",
        "ApplianceElc" -> "000A",
        "ApplianceMainBoardSwVersion" -> "0016",
        "ApplianceMode" -> "0400",
        "AppliancePnc" -> "0007",
        "ApplianceState" -> "0401",
        "ApplianceTotalWorkingTime" -> "04B5",
        "ApplianceUiSwVersion" -> "0013",
        "CurrentDetergentDoseOne" -> "1C1D",
        "CurrentDetergentDoseTwo" -> "1C1E",
        "CyclePhase" -> "1C10",
        "CycleSubPhase" -> "1C11",
        "DoorLock" -> "0461",
        "DoorState" -> "0460",
        "DrainPhase" -> "?",
        "DryingTime" -> "?",
        "ExecuteCommand" -> "0403",
        "ExtraRinseDefault" -> "?",
        "Language" -> "0422",
        "LinkQualityIndicator" -> "0032",
        "LocalTime" -> "0482",
        "MacAddress" -> "0030",
        "MaxDryingTime" -> "?",
        "MaxLoadDetergentDoseOne" -> "1C1A",
        "MaxLoadDetergentDoseTwo" -> "1C1B",
        "MaxRinseNumber" -> "?",
        "MaxSpinStep" -> "?",
        "MaxSteamValue" -> "?",
        "MaxTemperatureStep" -> "?",
        "MeasuredLoadWeight" -> "1C14",
        "MinDryingTime" -> "?",
        "MinRinseNumber" -> "?",
        "MinSpinStep" -> "?",
        "MinSteamValue" -> "?",
        "MinTemperatureStep" -> "?",
        "NightCycle" -> "?",
        "NiuAlertEvent" -> "0473",
        "PreWashPhase" -> "?",
        "ProgramMemoryPosition" -> "?",
        "ProgramParameters" -> "1C0A",
        "ProgramUID" -> "?",
        "RemoteControl" -> "0402",
        "RinseHold" -> "?",
        "RinseNumber" -> "?",
        "RinsePhase" -> "?",
        "SerialNumber" -> "0002",
        "SilentMode" -> "0425",
        "Soak" -> "?",
        "Softener" -> "?",
        "SpinPhase" -> "?",
        "Stain" -> "?",
        "StartTime" -> "0412",
        "SteamPhase" -> "?",
        "SteamValue" -> "?",
        "TimeManagerLevel" -> "?",
        "TimeToEnd" -> "0411",
        "TimeToNotify" -> "?",
        "UiLockMode" -> "0463",
        "UserSelections" -> "1C09",
        "WDDryingLevel" -> "?",
        "WDEnabledDryFabricTypeChange" -> "?",
        "WDEnabledDryingLevel" -> "?",
        "WMEconomy" -> "?",
        "WashPhase" -> "?",
        "WashingNominalLoadWeight" -> "1C12",
        "WaterHardness" -> "04E1",
        "WaterSoftenerMode" -> "1C19"
    )

    val availableNames: Array[String] =
    {
        val namesMap = this.alljoynmap.filter
        { case (_, v) => v != "?" }
        namesMap.values.toArray[String]
    }

    val programParametersComponents: mutable.LinkedHashMap[String, String] = mutable.LinkedHashMap(

        "20" -> "MaxTemperatureStep",
        "21" -> "MinTemperatureStep",
        "22" -> "MaxSpinStep",
        "23" -> "MinSpinStep",
        "6.17" -> "AntiCreasePhase",
        "6.46" -> "SteamPhase",
        "6.44" -> "SpinPhase",
        "6.43" -> "DrainPhase",
        "6.42" -> "Rinse",
        "6.41" -> "Washing",
        "6.7" ->  "PreWash",
        "6.6" ->  "WMEconomy",
        "6.15" -> "RinseHold",
        "6.14" -> "NigthCycle",
        "6.13" -> "Softener",
        "6.10" -> "Stain",
        "6.11" -> "Soak",
        "6.0" -> "Time manager",
        "24.0" -> "WDEnabledDryingLevel",
        "31" -> "MaxDryingTime",
        "32" -> "MinDryingTime",
        "25.4" -> "MaxRinseNumber",
        "25.0" -> "MinRinseNumber",
        "0" -> "ProgramUID"
    )

    /**
      * The subcomponents of UserSelection
      * Key: Component ID from AllJoyn
      * Value: _1 : Byte to read information from (if -1, see Data Format)
      * _2 : Bit position in byte to read information from (if -1, N/A)
      */
    val userSelectionComponents: mutable.LinkedHashMap[String, String] = mutable.LinkedHashMap(

        "2" -> "Analog Temperature",
        "4" -> "Analog Spin Speed",
        "6.17" -> "AntiCrease",
        "6.46" -> "Steam",
        "6.??" -> "Drying",
        "6.44" -> "Spinning",
        "6.43" -> "Draining",
        "6.42" -> "Rinse",
        "6.41" -> "Washing",
        "6.7" -> "PreWash",
        "6.6" -> "WMEconomy",
        "6.15" ->"RinseHold",
        "6.14" ->"NigthCycle",
        "6.13" ->"Softener",
        "6.10" ->"Stain",
        "6.11" ->"Soak",
        "6.0" -> "Time manager",
        "17" -> "Steam",
        "8.0" -> "Drying Level",
        "10" -> "Drying Time",
        "11" -> "Rinse",
        "0" -> "Program UID",
        "1" -> "Program Memory Position"
    )

}
