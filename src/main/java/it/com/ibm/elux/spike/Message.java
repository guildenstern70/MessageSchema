/*
 * Copyright (c) IBM Corporation 2016.
 * This is copyrighted software. All rights reserved.
 * IBM - Electrolux - ECP Project
 */

package it.com.ibm.elux.spike;

import org.codehaus.jackson.annotate.JsonIgnore;

import java.util.Map;

/**
 * Message class is a wrapper around ApplianceMessage
 * that extends the original class with helper methods.
 */
public class Message extends ApplianceMessage
{
    private Message()
    {
    }

    public static Message create()
    {
        return new Message();
    }

    public static Message create(String name, String value, Map<String, String> metadata)
    {
        Message am = Message.create(name, value);
        am.setMetadata(metadata);
        return am;
    }

    public static Message create(String name, Object value)
    {
        Message am = new Message();
        Component component = new Component();
        component.setName(name);
        component.setValue(value);
        am.addComponent(component);
        return am;
    }

    public static Message createContainer(String name, Component[] components)
    {
        Message am = new Message();
        am.setMainComponent(name, true);
        for (Component entry : components)
        {
            am.addComponent(entry);
        }
        return am;
    }

    @JsonIgnore
    public String getName()
    {
        if (this.getMainComponent() == null) return null;
        return this.getMainComponent().getName();
    }

    @JsonIgnore
    protected Component getMainComponent()
    {
        return this.components.get(0);
    }

    @JsonIgnore
    public Object getValue()
    {
        if (this.getMainComponent() == null) return null;
        return this.getMainComponent().getValue();
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder("[" + this.version + "] ");
        if (this.isContainer())
        {
            sb.append("CONTAINER ");
            sb.append("Name: ").append(this.getMainComponent().getName()).append("\n");
            for (Component c : this.getComponents())
            {
                sb.append(c.toString());
                sb.append("\n");
            }
        }
        else
        {
            Component mainComponent = this.components.get(0);
            sb.append(" Name = ").append(mainComponent.getName());
            sb.append(" Value = ").append(mainComponent.getValue());
        }

        return sb.toString();
    }


    @JsonIgnore
    protected boolean isContainer()
    {
        return this.getMainComponent().getValue().equals("Container");
    }

}
