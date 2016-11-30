package it.com.ibm.elux.spike;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.Random;

/**
 *
 */
public class ApplianceValue
{
    @JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
    private String valueString;

    @JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
    private Double valueNumber;

    @JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
    private String unitsOfMeasurement;

    public static ApplianceValue getRandom()
    {
        Random rndSeed = new Random();
        int dice = rndSeed.nextInt(500);
        ApplianceValue av = new ApplianceValue();
        if (dice % 2 == 0)
        {
            av.valueString = null;
            av.valueNumber = rndSeed.nextDouble() * dice;
            av.unitsOfMeasurement = Properties.getRandomUnit();
        }
        else
        {
            av.valueNumber = null;
            av.valueString = Properties.getRandomString();
            av.unitsOfMeasurement = null;
        }
        return av;
    }

    public String getValueString()
    {
        return valueString;
    }

    public void setValueString(String valueString)
    {
        this.valueString = valueString;
    }

    public Double getValueNumber()
    {
        return valueNumber;
    }

    public void setValueNumber(Double valueNumber)
    {
        this.valueNumber = valueNumber;
    }

    public String getUnitsOfMeasurement()
    {
        return unitsOfMeasurement;
    }

    public void setUnitsOfMeasurement(String unitsOfMeasurement)
    {
        this.unitsOfMeasurement = unitsOfMeasurement;
    }

    @Override
    public String toString()
    {
        if (this.valueString == null)
        {
            return this.valueNumber.toString()+ " " + this.unitsOfMeasurement;
        }

        return this.valueString;
    }
}
