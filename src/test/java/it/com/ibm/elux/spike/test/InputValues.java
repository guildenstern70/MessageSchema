/*
 * Copyright (c) IBM Corporation 2016.
 * This is copyrighted software. All rights reserved.
 * IBM - Electrolux - ECP Project
 */

package it.com.ibm.elux.spike.test;

/**
 *
 */
public class InputValues
{
    public static String[] getJSONMessages()
    {
        return new String[]{
                "{\n" +
                        "  \"source\" : \"WM1\",\n" +
                        "  \"destination\" : \"ECP\",\n" +
                        "  \"version\" : \"ad\",\n" +
                        "  \"name\" : \"1C09\",\n" +
                        "  \"components\" : [ {\n" +
                        "    \"name\" : \"2\",\n" +
                        "    \"value\" : 33\n" +
                        "  }, {\n" +
                        "    \"name\" : \"4\",\n" +
                        "    \"value\" : 45\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.17\",\n" +
                        "    \"value\" : true\n" +
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
                        "    \"value\" : false\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.42\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.41\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.7\",\n" +
                        "    \"value\" : false\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.6\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.15\",\n" +
                        "    \"value\" : false\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.14\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.13\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.10\",\n" +
                        "    \"value\" : false\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.11\",\n" +
                        "    \"value\" : false\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.0\",\n" +
                        "    \"value\" : false\n" +
                        "  }, {\n" +
                        "    \"name\" : \"17\",\n" +
                        "    \"value\" : 143\n" +
                        "  }, {\n" +
                        "    \"name\" : \"8.0\",\n" +
                        "    \"value\" : false\n" +
                        "  }, {\n" +
                        "    \"name\" : \"10\",\n" +
                        "    \"value\" : \"Temporary Locked\"\n" +
                        "  }, {\n" +
                        "    \"name\" : \"11\",\n" +
                        "    \"value\" : \"Open\"\n" +
                        "  }, {\n" +
                        "    \"name\" : \"0\",\n" +
                        "    \"value\" : 101\n" +
                        "  }, {\n" +
                        "    \"name\" : \"1\",\n" +
                        "    \"value\" : \"Close\"\n" +
                        "  } ],\n" +
                        "  \"timestamp\" : 1481648759588,\n" +
                        "  \"operationMode\" : \"INF_SEND\"\n" +
                        "}",
                "{\n" +
                        "  \"source\" : \"WM1\",\n" +
                        "  \"destination\" : \"ECP\",\n" +
                        "  \"version\" : \"ad\",\n" +
                        "  \"name\" : \"1C0A\",\n" +
                        "  \"components\" : [ {\n" +
                        "    \"name\" : \"20\",\n" +
                        "    \"value\" : \"Temporary Locked\"\n" +
                        "  }, {\n" +
                        "    \"name\" : \"21\",\n" +
                        "    \"value\" : \"Fix\"\n" +
                        "  }, {\n" +
                        "    \"name\" : \"22\",\n" +
                        "    \"value\" : \"Open\"\n" +
                        "  }, {\n" +
                        "    \"name\" : \"23\",\n" +
                        "    \"value\" : \"Close\"\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.17\",\n" +
                        "    \"value\" : false\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.46\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.44\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.43\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"6.42\",\n" +
                        "    \"value\" : false\n" +
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
                        "    \"value\" : false\n" +
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
                        "    \"value\" : \"Paused\"\n" +
                        "  }, {\n" +
                        "    \"name\" : \"32\",\n" +
                        "    \"value\" : 121\n" +
                        "  }, {\n" +
                        "    \"name\" : \"25.4\",\n" +
                        "    \"value\" : true\n" +
                        "  }, {\n" +
                        "    \"name\" : \"25.0\",\n" +
                        "    \"value\" : false\n" +
                        "  }, {\n" +
                        "    \"name\" : \"0\",\n" +
                        "    \"value\" : \"Paused\"\n" +
                        "  } ],\n" +
                        "  \"timestamp\" : 1481648759253,\n" +
                        "  \"operationMode\" : \"INF_SEND\"\n" +
                        "}\n",
                "{\n" +
                        "  \"source\" : \"WM1\",\n" +
                        "  \"destination\" : \"ECP\",\n" +
                        "  \"version\" : \"ad\",\n" +
                        "  \"components\" : [ {\n" +
                        "    \"name\" : \"1C12\",\n" +
                        "    \"value\" : \"Temporary Locked\"\n" +
                        "  } ],\n" +
                        "  \"timestamp\" : 1481648759261,\n" +
                        "  \"operationMode\" : \"INF_SEND\"\n" +
                        "}"
        };
    }
}
