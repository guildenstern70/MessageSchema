/*
 * Copyright (c) IBM Corporation 2016.
 * This is copyrighted software. All rights reserved.
 * IBM - Electrolux - ECP Project
 */

package it.com.ibm.elux.spike.test;

import it.com.ibm.elux.spike.Component;

/**
 *
 */
public class InputValues
{

    public static Component[] getContainerComponents()
    {
        return new Component[]{

                new Component("20", "Stand-By"),
                new Component("21", "Numbered"),
                new Component("22", "Temporary Locked"),
                new Component("23", "4"),
                new Component("6.17", "true"),
                new Component("6.46", "true"),
                new Component("6.44", "false"),
                new Component("6.43", "true"),
                new Component("6.42", "false"),
                new Component("6.41", "false"),
                new Component("6.7", "false"),
                new Component("6.6", "false"),
                new Component("6.15", "true"),
                new Component("6.14", "true"),
                new Component("6.13", "true"),
                new Component("6.10", "true"),
                new Component("6.11", "false"),
                new Component("6.0", "true"),
                new Component("24.0", "true"),
                new Component("31", "Close"),
                new Component("32", "Numbered"),
                new Component("25.4", "true"),
                new Component("25.0", "true"),
                new Component("0", "99")

        };
    }

    public static String[] getJSONMessages()
    {
        return new String[]{
                "{\n" +
                        "  \"source\" : \"WM1\",\n" +
                        "  \"destination\" : \"ECP\",\n" +
                        "  \"version\" : \"ad\",\n" +
                        "  \"components\" : [ {\n" +
                        "    \"name\" : \"0412\",\n" +
                        "    \"value\" : \"Paused\"\n" +
                        "  } ],\n" +
                        "  \"timestamp\" : 1481723158530,\n" +
                        "  \"operationMode\" : \"INF_SEND\"\n" +
                        "}",
                "{\n" +
                        "  \"source\" : \"WM1\",\n" +
                        "  \"destination\" : \"ECP\",\n" +
                        "  \"version\" : \"ad\",\n" +
                        "  \"components\" : [ {\n" +
                        "    \"name\" : \"1C0A\",\n" +
                        "    \"value\" : \"Container\"\n" +
                        "  }, {\n" +
                        "    \"name\" : \"20\",\n" +
                        "    \"value\" : \"Stand-By\"\n" +
                        "  }, {\n" +
                        "    \"name\" : \"21\",\n" +
                        "    \"value\" : \"Numbered\"\n" +
                        "  }, {\n" +
                        "    \"name\" : \"22\",\n" +
                        "    \"value\" : \"Temporary Locked\"\n" +
                        "  }, {\n" +
                        "    \"name\" : \"23\",\n" +
                        "    \"value\" : 4\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.17\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.46\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.44\",\n" +
                        "    \"value\" : false\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.43\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.42\",\n" +
                        "    \"value\" : false\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.41\",\n" +
                        "    \"value\" : false\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.7\",\n" +
                        "    \"value\" : false\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.6\",\n" +
                        "    \"value\" : false\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.15\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.14\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.13\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.10\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.11\",\n" +
                        "    \"value\" : false\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.0\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"24.0\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"31\",\n" +
                        "    \"value\" : \"Close\"\n" +
                        "  }, {\n" +
                        "    \"name\" : \"32\",\n" +
                        "    \"value\" : \"Numbered\"\n" +
                        "  }, {\n" +
                        "    \"name\" : \"25.4\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"25.0\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"0\",\n" +
                        "    \"value\" : 99\n" +
                        "  } ],\n" +
                        "  \"timestamp\" : 1481723158553,\n" +
                        "  \"operationMode\" : \"INF_SEND\"\n" +
                        "}",
                "{\n" +
                        "  \"source\" : \"WM1\",\n" +
                        "  \"destination\" : \"ECP\",\n" +
                        "  \"version\" : \"ad\",\n" +
                        "  \"components\" : [ {\n" +
                        "    \"name\" : \"1C09\",\n" +
                        "    \"value\" : \"Container\"\n" +
                        "  }, {\n" +
                        "    \"name\" : \"2\",\n" +
                        "    \"value\" : \"Temporary Locked\"\n" +
                        "  }, {\n" +
                        "    \"name\" : \"4\",\n" +
                        "    \"value\" : \"Open\"\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.17\",\n" +
                        "    \"value\" : false\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.46\",\n" +
                        "    \"value\" : false\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.??\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.44\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.43\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.42\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.41\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.7\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.6\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.15\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.14\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.13\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.10\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.11\",\n" +
                        "    \"value\" : false\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.0\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"17\",\n" +
                        "    \"value\" : \"Stay\"\n" +
                        "  }, {\n" +
                        "    \"name\" : \"8.0\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"10\",\n" +
                        "    \"value\" : 166\n" +
                        "  }, {\n" +
                        "    \"name\" : \"11\",\n" +
                        "    \"value\" : \"Temporary Locked\"\n" +
                        "  }, {\n" +
                        "    \"name\" : \"0\",\n" +
                        "    \"value\" : \"Stay\"\n" +
                        "  }, {\n" +
                        "    \"name\" : \"1\",\n" +
                        "    \"value\" : 17\n" +
                        "  } ],\n" +
                        "  \"timestamp\" : 1481723158587,\n" +
                        "  \"operationMode\" : \"INF_SEND\"\n" +
                        "}"
        };
    }
}
