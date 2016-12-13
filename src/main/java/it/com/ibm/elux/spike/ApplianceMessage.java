package it.com.ibm.elux.spike;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 */
public class ApplianceMessage
{
    private String source;
    private String destination;
    private String version;

    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    private String name;

    @JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
    private List<Component> components;

    private Date timestamp;
    private OperationMode operationMode;

    ApplianceMessage()
    {
        this.components = new ArrayList<>();
        this.timestamp = new Date();
        this.operationMode = OperationMode.INF_SEND;
    }

    void addComponent(Component component)
    {
        this.components.add(component);
    }

    public String getVersion()
    {
        return version;
    }

    void setVersion(String version)
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

    void setOperationMode(OperationMode operationMode)
    {
        this.operationMode = operationMode;
    }

    String toJson()
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

    @Override
    public String toString()
    {
        Component mainComponent = this.components.get(0);
        return "[" + this.version + "] " + mainComponent.getName() + " = " + mainComponent.getValue().toString();
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

    public List<Component> getComponents()
    {
        return components;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
