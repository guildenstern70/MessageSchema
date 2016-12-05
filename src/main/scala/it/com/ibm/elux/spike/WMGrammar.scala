package it.com.ibm.elux.spike

import scala.collection.mutable

/**
  *
  */
object WMGrammar
{

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
