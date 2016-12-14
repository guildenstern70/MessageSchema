/*
 * Copyright (c) IBM Corporation 2016.
 * This is copyrighted software. All rights reserved.
 * IBM - Electrolux - ECP Project
 */

package it.com.ibm.elux.spike;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.IOException;
import java.io.Serializable;
import java.util.*;

/**
 *
 */
public class ApplianceMessage implements Serializable
{
    protected String version;
    @JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
    protected List<Component> components;
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    protected Map<String, String> metadata;
    private String source;
    private String destination;
    private Date timestamp;
    private OperationMode operationMode;

    public ApplianceMessage()
    {
        this.metadata = null;
        this.components = new ArrayList<>();
        this.timestamp = new Date();
        this.operationMode = OperationMode.INF_SEND;
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

    protected void setMainComponent(String name, boolean container)
    {
        Component component = new Component();
        component.setName(name);
        if (container) component.setValue("Container");
        this.addComponent(component);
    }

    public void addComponent(Component component)
    {
        this.components.add(component);
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

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder("[" + this.version + "] ");

        for (Component c : this.getComponents())
        {
            sb.append(c.toString());
            sb.append("\n");
        }

        return sb.toString();
    }

    public List<Component> getComponents()
    {
        return components;
    }
}
