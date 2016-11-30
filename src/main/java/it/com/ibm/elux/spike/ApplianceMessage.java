package it.com.ibm.elux.spike;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

/**
 *
 */
public class ApplianceMessage
{

    private Device originatingDevice;
    private String version;

    @JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
    private String parent;

    private String property;
    private ApplianceValue value;
    private Date timestamp;
    private OperationMode operationMode;

    public ApplianceMessage()
    {
        this.timestamp = new Date();
        this.operationMode = OperationMode.INF_SEND;
    }

    public static ApplianceMessage generate()
    {
        ApplianceMessage am = new ApplianceMessage();
        am.version = "ad";
        am.originatingDevice = new Device("pnc1", "ecl1", "12345678");
        am.property = Properties.getRandomName();
        am.setValue(ApplianceValue.getRandom());
        if (new Random().nextInt(5) == 4)
        {
            am.parent = Properties.getRandomParent();
        }
        return am;
    }

    public String getVersion()
    {
        return version;
    }

    public void setVersion(String version)
    {
        this.version = version;
    }

    public String getProperty()
    {
        return property;
    }

    public void setProperty(String property)
    {
        this.property = property;
    }

    public ApplianceValue getValue()
    {
        return value;
    }

    public void setValue(ApplianceValue value)
    {
        this.value = value;
    }

    public Device getOriginatingDevice()
    {
        return originatingDevice;
    }

    public void setOriginatingDevice(Device originatingDevice)
    {
        this.originatingDevice = originatingDevice;
    }

    public Date getTimestamp()
    {
        return timestamp;
    }

    public String getParent()
    {
        return parent;
    }

    public void setParent(String parent)
    {
        this.parent = parent;
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
            jsonString = mapper.writeValueAsString(this);
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
        return "["+this.version+"] "+this.property+" = "+this.value.toString();
    }


}
