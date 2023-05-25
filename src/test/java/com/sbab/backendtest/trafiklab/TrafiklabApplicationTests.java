package com.sbab.backendtest.trafiklab;

import com.sbab.backendtest.datamangement.DataManagement;
import com.sbab.backendtest.datamangement.DataManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class TrafiklabApplicationTests {
	DataManager dataManager = new DataManagement();

	public static final String busLineObject = "{\n" +
			"    \"StatusCode\": 0,\n" +
			"    \"Message\": null,\n" +
			"    \"ExecutionTime\": 397,\n" +
			"    \"ResponseData\": {\n" +
			"        \"Version\": \"2023-05-24 00:12\",\n" +
			"        \"Type\": \"JourneyPatternPointOnLine\",\n" +
			"        \"Result\": [\n" +
			"            {\n" +
			"                \"LineNumber\": \"1\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10009\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2022-02-15 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2022-02-15 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"2\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10015\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2022-08-10 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2022-08-10 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"2\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10019\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2022-11-06 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2022-11-06 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"3\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10025\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2022-02-17 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2022-02-17 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"3\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10031\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2022-05-04 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2022-05-04 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"3\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10033\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"4\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10035\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2022-03-18 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2022-03-18 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"4\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10037\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2022-03-03 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2022-03-03 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"4\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10043\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"4\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10045\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2022-01-08 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2022-01-08 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"5\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10052\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2022-03-10 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2022-03-10 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"5\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10054\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2013-12-19 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2013-12-19 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"5\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10056\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"5\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10058\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"5\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10060\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"6\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10065\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2023-03-07 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2023-03-07 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"6\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10127\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2022-05-20 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2022-05-20 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"6\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10153\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"6\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10155\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2023-05-12 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2023-05-12 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"6\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10157\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2022-01-22 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2022-01-22 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"6\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10450\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2022-06-30 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2022-06-30 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"7\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10452\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2022-03-03 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2022-03-03 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"7\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10454\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"7\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10456\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2023-04-18 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2023-04-18 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"7\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10505\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2023-03-04 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2023-03-04 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"7\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10644\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2023-05-09 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2023-05-09 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"7\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10728\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2013-12-19 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2013-12-19 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"7\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10736\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"8\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10742\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"8\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"10756\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"8\",\n" +
			"                \"DirectionCode\": \"1\",\n" +
			"                \"JourneyPatternPointNumber\": \"12024\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"             {\n" +
			"                \"LineNumber\": \"8\",\n" +
			"                \"DirectionCode\": \"1\",\n" +
			"                \"JourneyPatternPointNumber\": \"12030\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"8\",\n" +
			"                \"DirectionCode\": \"1\",\n" +
			"                \"JourneyPatternPointNumber\": \"12034\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"8\",\n" +
			"                \"DirectionCode\": \"1\",\n" +
			"                \"JourneyPatternPointNumber\": \"12042\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2023-04-26 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2023-04-26 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"8\",\n" +
			"                \"DirectionCode\": \"1\",\n" +
			"                \"JourneyPatternPointNumber\": \"12048\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"8\",\n" +
			"                \"DirectionCode\": \"1\",\n" +
			"                \"JourneyPatternPointNumber\": \"12098\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"9\",\n" +
			"                \"DirectionCode\": \"1\",\n" +
			"                \"JourneyPatternPointNumber\": \"12106\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2023-04-27 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2023-04-27 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"9\",\n" +
			"                \"DirectionCode\": \"1\",\n" +
			"                \"JourneyPatternPointNumber\": \"12108\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"9\",\n" +
			"                \"DirectionCode\": \"1\",\n" +
			"                \"JourneyPatternPointNumber\": \"12112\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"9\",\n" +
			"                \"DirectionCode\": \"1\",\n" +
			"                \"JourneyPatternPointNumber\": \"12114\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2020-10-28 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2020-10-28 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"9\",\n" +
			"                \"DirectionCode\": \"1\",\n" +
			"                \"JourneyPatternPointNumber\": \"12116\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"9\",\n" +
			"                \"DirectionCode\": \"1\",\n" +
			"                \"JourneyPatternPointNumber\": \"12118\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"9\",\n" +
			"                \"DirectionCode\": \"1\",\n" +
			"                \"JourneyPatternPointNumber\": \"12120\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"9\",\n" +
			"                \"DirectionCode\": \"1\",\n" +
			"                \"JourneyPatternPointNumber\": \"12122\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"9\",\n" +
			"                \"DirectionCode\": \"1\",\n" +
			"                \"JourneyPatternPointNumber\": \"12126\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"10\",\n" +
			"                \"DirectionCode\": \"1\",\n" +
			"                \"JourneyPatternPointNumber\": \"12130\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"10\",\n" +
			"                \"DirectionCode\": \"1\",\n" +
			"                \"JourneyPatternPointNumber\": \"12143\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"10\",\n" +
			"                \"DirectionCode\": \"1\",\n" +
			"                \"JourneyPatternPointNumber\": \"12324\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2022-05-25 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2022-05-25 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"10\",\n" +
			"                \"DirectionCode\": \"1\",\n" +
			"                \"JourneyPatternPointNumber\": \"12400\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"10\",\n" +
			"                \"DirectionCode\": \"1\",\n" +
			"                \"JourneyPatternPointNumber\": \"12407\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"10\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"12023\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"10\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"12029\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"10\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"12031\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"10\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"12033\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2012-06-23 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2012-06-23 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"LineNumber\": \"10\",\n" +
			"                \"DirectionCode\": \"2\",\n" +
			"                \"JourneyPatternPointNumber\": \"12035\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2022-03-05 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2022-03-05 00:00:00.000\"\n" +
			"            }\n" +
			"        ]\n" +
			"    }\n" +
			"}\n";

	public static final String busStopObject = "{\n" +
			"    \"StatusCode\": 0,\n" +
			"    \"Message\": null,\n" +
			"    \"ExecutionTime\": 428,\n" +
			"    \"ResponseData\": {\n" +
			"        \"Version\": \"2023-05-24 00:12\",\n" +
			"        \"Type\": \"StopPoint\",\n" +
			"        \"Result\": [\n" +
			"            {\n" +
			"                \"StopPointNumber\": \"12130\",\n" +
			"                \"StopPointName\": \"Stadshagsplan\",\n" +
			"                \"StopAreaNumber\": \"10001\",\n" +
			"                \"LocationNorthingCoordinate\": \"59.3373571967995\",\n" +
			"                \"LocationEastingCoordinate\": \"18.0214674159693\",\n" +
			"                \"ZoneShortName\": \"A\",\n" +
			"                \"StopAreaTypeCode\": \"BUSTERM\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2022-10-28 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2022-10-28 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"StopPointNumber\": \"12143\",\n" +
			"                \"StopPointName\": \"John Bergs plan\",\n" +
			"                \"StopAreaNumber\": \"10002\",\n" +
			"                \"LocationNorthingCoordinate\": \"59.3361450073188\",\n" +
			"                \"LocationEastingCoordinate\": \"18.0222866342593\",\n" +
			"                \"ZoneShortName\": \"A\",\n" +
			"                \"StopAreaTypeCode\": \"BUSTERM\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2015-09-24 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2015-09-24 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"StopPointNumber\": \"12324\",\n" +
			"                \"StopPointName\": \"Arbetargatan\",\n" +
			"                \"StopAreaNumber\": \"10002\",\n" +
			"                \"LocationNorthingCoordinate\": \"59.3361450073188\",\n" +
			"                \"LocationEastingCoordinate\": \"18.0222866342593\",\n" +
			"                \"ZoneShortName\": \"A\",\n" +
			"                \"StopAreaTypeCode\": \"BUSTERM\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2015-09-24 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2015-09-24 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"StopPointNumber\": \"12400\",\n" +
			"                \"StopPointName\": \"Frihamnens färjeterminal\",\n" +
			"                \"StopAreaNumber\": \"10002\",\n" +
			"                \"LocationNorthingCoordinate\": \"59.3361450073188\",\n" +
			"                \"LocationEastingCoordinate\": \"18.0222866342593\",\n" +
			"                \"ZoneShortName\": \"A\",\n" +
			"                \"StopAreaTypeCode\": \"BUSTERM\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2015-09-24 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2015-09-24 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"StopPointNumber\": \"12407\",\n" +
			"                \"StopPointName\": \"Frihamnsporten\",\n" +
			"                \"StopAreaNumber\": \"10002\",\n" +
			"                \"LocationNorthingCoordinate\": \"59.3361450073188\",\n" +
			"                \"LocationEastingCoordinate\": \"18.0222866342593\",\n" +
			"                \"ZoneShortName\": \"A\",\n" +
			"                \"StopAreaTypeCode\": \"BUSTERM\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2015-09-24 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2015-09-24 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"StopPointNumber\": \"12023\",\n" +
			"                \"StopPointName\": \"Celsiusgatan\",\n" +
			"                \"StopAreaNumber\": \"10002\",\n" +
			"                \"LocationNorthingCoordinate\": \"59.3361450073188\",\n" +
			"                \"LocationEastingCoordinate\": \"18.0222866342593\",\n" +
			"                \"ZoneShortName\": \"A\",\n" +
			"                \"StopAreaTypeCode\": \"BUSTERM\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2015-09-24 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2015-09-24 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"StopPointNumber\": \"12029\",\n" +
			"                \"StopPointName\": \"Scheelegatan\",\n" +
			"                \"StopAreaNumber\": \"10002\",\n" +
			"                \"LocationNorthingCoordinate\": \"59.3361450073188\",\n" +
			"                \"LocationEastingCoordinate\": \"18.0222866342593\",\n" +
			"                \"ZoneShortName\": \"A\",\n" +
			"                \"StopAreaTypeCode\": \"BUSTERM\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2015-09-24 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2015-09-24 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"StopPointNumber\": \"12031\",\n" +
			"                \"StopPointName\": \"Kungsbroplan\",\n" +
			"                \"StopAreaNumber\": \"10002\",\n" +
			"                \"LocationNorthingCoordinate\": \"59.3361450073188\",\n" +
			"                \"LocationEastingCoordinate\": \"18.0222866342593\",\n" +
			"                \"ZoneShortName\": \"A\",\n" +
			"                \"StopAreaTypeCode\": \"BUSTERM\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2015-09-24 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2015-09-24 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"StopPointNumber\": \"12033\",\n" +
			"                \"StopPointName\": \"Cityterminalen\",\n" +
			"                \"StopAreaNumber\": \"10002\",\n" +
			"                \"LocationNorthingCoordinate\": \"59.3361450073188\",\n" +
			"                \"LocationEastingCoordinate\": \"18.0222866342593\",\n" +
			"                \"ZoneShortName\": \"A\",\n" +
			"                \"StopAreaTypeCode\": \"BUSTERM\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2015-09-24 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2015-09-24 00:00:00.000\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"StopPointNumber\": \"12035\",\n" +
			"                \"StopPointName\": \"Vasagatan\",\n" +
			"                \"StopAreaNumber\": \"10002\",\n" +
			"                \"LocationNorthingCoordinate\": \"59.3361450073188\",\n" +
			"                \"LocationEastingCoordinate\": \"18.0222866342593\",\n" +
			"                \"ZoneShortName\": \"A\",\n" +
			"                \"StopAreaTypeCode\": \"BUSTERM\",\n" +
			"                \"LastModifiedUtcDateTime\": \"2015-09-24 00:00:00.000\",\n" +
			"                \"ExistsFromDate\": \"2015-09-24 00:00:00.000\"\n" +
			"            }\n" +
			"        ]\n" +
			"    }\n" +
			"}";
	public static final List<String> correctOrder = Arrays.asList("10", "9", "8", "7", "6",
																  "5", "4", "3", "2", "1");
	public static final List<String> correctBusStopOrder = Arrays.asList("Stadshagsplan",
															"John Bergs plan", "Arbetargatan",
															"Frihamnens färjeterminal", "Frihamnsporten",
															"Celsiusgatan", "Scheelegatan", "Kungsbroplan",
															"Cityterminalen", "Vasagatan");
	List<String> fetchedBusStops = new ArrayList<>();

	@BeforeEach
	void addBusLines(){
		fetchedBusStops = dataManager.getTopTenBusStops(busLineObject);
	}

	@Test
	void testTopTenBusLine(){
		Assertions.assertEquals(correctOrder, fetchedBusStops);
	}

	@Test
	void testBusStops(){
		List<String> fetchedData = dataManager.getBusStopName(busStopObject);
		Assertions.assertEquals(correctBusStopOrder, fetchedData);
	}

}
