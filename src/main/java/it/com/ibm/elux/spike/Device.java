package it.com.ibm.elux.spike;

public class Device
{

    private String deviceType;
    private String deviceId;

    public Device(String pnc, String elc, String serialNr)
    {
        this.deviceType = "d:" + pnc + ":" + elc;
        this.deviceId = serialNr;
    }

    public String getDeviceType()
    {
        return deviceType;
    }

    public void setDeviceType(String deviceType)
    {
        this.deviceType = deviceType;
    }

    public String getDeviceId()
    {
        return deviceId;
    }

    public void setDeviceId(String deviceId)
    {
        this.deviceId = deviceId;
    }

    @Override
    public String toString()
    {
        return "d:" + this.deviceType + ":" + this.deviceId;
    }
}

