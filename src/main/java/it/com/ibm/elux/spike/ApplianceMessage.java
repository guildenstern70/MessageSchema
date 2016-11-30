package it.com.ibm.elux.spike;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.Date;

/**
 *
 */
public class ApplianceMessage
{

    private Device originatingDevice;
    private String version;
    private String property;
    private ApplianceValue value;
    private Date timestamp;

    public ApplianceMessage()
    {
        this.timestamp = new Date();
    }

    public static ApplianceMessage generate()
    {
        ApplianceMessage am = new ApplianceMessage();
        am.version = "ad";
        am.originatingDevice = new Device("pnc1", "ecl1", "12345678");
        am.property = Properties.getRandomName();
        am.setValue(ApplianceValue.getRandom());
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
