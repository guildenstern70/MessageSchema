package it.com.ibm.elux.spike;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.Random;

/**
 *
 */
public class Component
{
    @JsonProperty
    private String name;

    @JsonProperty
    private Object value;

    @JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
    private Integer order;

    public Component()
    {
        this.order = null;
    }

    public Component(Integer order)
    {
        this.order = order;
    }

    public Component(Integer order, String name, Object value)
    {
        this.order = order;
        this.name = name;
        this.value = value;
    }

    public static Boolean getRandomBoolean()
    {
        Random rndSeed = new Random();
        int dice = rndSeed.nextInt(500);
        Boolean av;
        av = dice % 2 == 0;
        return av;
    }

    public static Object getRandom()
    {
        Random rndSeed = new Random();
        int dice = rndSeed.nextInt(500);
        Object av;
        if (dice % 2 == 0)
        {
            av = new Double(rndSeed.nextDouble() * dice);
        }
        else
        {
            av = LookupTables.getRandomString();
        }
        return av;
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

    public Object getValue()
    {
        return value;
    }

    public void setValue(Object value)
    {
        this.value = value;
    }
}
