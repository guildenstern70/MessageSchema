package it.com.ibm.elux.spike;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.schema.JsonSchema;

import java.io.IOException;

/**
 *
 */
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("");
        System.out.println("Message Schema v.0.1");
        System.out.println("");

        String schema = null;
        try
        {
            schema = Main.getJsonSchema(ApplianceMessage.class);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println(schema);

        System.out.println("");
        System.out.println("Message Examples v.0.1");
        System.out.println("");
        Main.getJsons();

    }

    private static void getJsons()
    {
        int howMany = 10;
        while (howMany>0)
        {
            ApplianceMessage am = ApplianceMessage.generate();
            System.out.println(am.toJson());
            howMany--;
        }
    }

    public static String getJsonSchema(Class clazz) throws IOException
    {
        org.codehaus.jackson.map.ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationConfig.Feature.WRITE_ENUMS_USING_TO_STRING, true);
        JsonSchema schema = mapper.generateJsonSchema(clazz);
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(schema);
    }
}
