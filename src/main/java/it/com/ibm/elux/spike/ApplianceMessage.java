package it.com.ibm.elux.spike;

import org.codehaus.jackson.annotate.JsonIgnore;
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

    @JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
    private List<Property> properties;

    private Date timestamp;
    private OperationMode operationMode;

    public ApplianceMessage()
    {
        this.properties = new ArrayList<>();

        Property property = new Property();
        this.properties.add(property);

        this.timestamp = new Date();
        this.operationMode = OperationMode.INF_SEND;
    }

    public void addProperty(Property component)
    {
        this.properties.add(component);
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

    @Override
    public String toString()
    {
        Property mainProperty = this.getMainProperty();
        return "["+this.version+"] "+mainProperty.getName()+" = "+mainProperty.getValue().toString();
    }

    @JsonIgnore
    public Property getMainProperty()
    {
        return this.properties.get(0);
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

    public List<Property> getProperties()
    {
        return properties;
    }

    @JsonIgnore
    public String getName()
    {
        return this.properties.get(0).getName();
    }

}
