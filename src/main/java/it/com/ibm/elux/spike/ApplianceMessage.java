/*
 * Copyright (c) IBM Corporation 2016.
 * This is copyrighted software. All rights reserved.
 * IBM - Electrolux - ECP Project
 */

package it.com.ibm.elux.spike;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.IOException;
import java.util.*;

/**
 *
 */
public class ApplianceMessage
{
    private String source;
    private String destination;
    private String version;

    @JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
    private List<Component> components;

    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    private Map<String, String> metadata;

    private Date timestamp;
    private OperationMode operationMode;

    private ApplianceMessage()
    {
        this.metadata = null;
        this.components = new ArrayList<>();
        this.timestamp = new Date();
        this.operationMode = OperationMode.INF_SEND;
    }

    public static ApplianceMessage create()
    {
        return new ApplianceMessage();
    }

    public static ApplianceMessage create(String name, String value, Map<String, String> metadata)
    {
        ApplianceMessage am = ApplianceMessage.create(name, value);
        am.setMetadata(metadata);
        return am;
    }

    public static ApplianceMessage create(String name, Object value)
    {
        ApplianceMessage am = new ApplianceMessage();
        Component component = new Component();
        component.setName(name);
        component.setValue(value);
        am.addComponent(component);
        return am;
    }

    public void addComponent(Component component)
    {
        this.components.add(component);
    }

    public static ApplianceMessage createContainer(String name, Component[] components)
    {
        ApplianceMessage am = new ApplianceMessage();
        am.setMainComponent(name, true);
        for (Component entry : components)
        {
            am.addComponent(entry);
        }
        return am;
    }

    protected void setMainComponent(String name, boolean container)
    {
        Component component = new Component();
        component.setName(name);
        if (container) component.setValue("Container");
        this.addComponent(component);
    }

    public static ApplianceMessage fromJSON(String jsonMessage)
    {
        ObjectMapper mapper = new ObjectMapper();
        ApplianceMessage am = null;
        try
        {
            am = mapper.readValue(jsonMessage, ApplianceMessage.class);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return am;
    }

    public void addMetadata(String key, String value)
    {
        if (this.metadata == null)
        {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, value);
    }

    public String getMetadata(String key)
    {
        return this.metadata.get(key);
    }

    public Map<String, String> getMetadata()
    {
        return this.metadata;
    }

    public void setMetadata(Map<String, String> metadata)
    {
        this.metadata = metadata;
    }

    public String getVersion()
    {
        return version;
    }

    public void setVersion(String version)
    {
        this.version = version;
    }

    public Date getTimestamp()
    {
        return timestamp;
    }

    public OperationMode getOperationMode()
    {
        return operationMode;
    }

    public void setOperationMode(OperationMode operationMode)
    {
        this.operationMode = operationMode;
    }

    public String toJson()
    {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = null;
        try
        {
            jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(this);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return jsonString;
    }

    public String getSource()
    {
        return source;
    }

    public void setSource(String source)
    {
        this.source = source;
    }

    public String getDestination()
    {
        return destination;
    }

    public void setDestination(String destination)
    {
        this.destination = destination;
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

    public List<Component> getComponents()
    {
        return components;
    }
}
