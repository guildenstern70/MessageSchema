package it.com.ibm.elux.spike;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.Random;

/**
 *
 */
public class Property
{
    @JsonProperty
    private String name;

    @JsonProperty
    private String value;

    @JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
    private Integer order;

    public Property() { this.order = null; }

    public Property(Integer order)
    {
        this.order = order;
    }

    public Property(Integer order, String name, String value)
    {
        this.order = order;
        this.name = name;
        this.value = value;
    }

    public Integer getOrder()
    {
        return order;
    }

    public void setOrder(int order)
    {
        this.order = order;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public static String getRandomBoolean()
    {
        Random rndSeed = new Random();
        int dice = rndSeed.nextInt(500);
        String av;
        if (dice % 2 == 0)
        {
            av = "true";
        }
        else
        {
            av = "false";
        }
        return av;
    }

    public static String getRandom()
    {
        Random rndSeed = new Random();
        int dice = rndSeed.nextInt(500);
        String av;
        if (dice % 2 == 0)
        {
            av = Double.toString(rndSeed.nextDouble() * dice);
        }
        else
        {
            av = LookupTables.getRandomString();
        }
        return av;
    }
}
