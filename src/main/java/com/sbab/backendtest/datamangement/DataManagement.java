package com.sbab.backendtest.datamangement;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sbab.backendtest.model.Line;
import com.sbab.backendtest.model.Stop;

import java.util.*;


public class DataManagement implements DataManager{

    List<Line> sortedData = new ArrayList<>();
    int busLineWithMostNumberOfStops = 0;
    int validCount = 0;
    public static final String RESPONSE_DATA = "ResponseData";
    public static final String RESULT = "Result";
    public static final String LINE_NUMBER = "LineNumber";
    public static final String JOURNEY_PATTERN_POINT_NUMBER = "JourneyPatternPointNumber";
    public static final String STOP_POINT_NUMBER = "StopPointNumber";
    public static final String STOP_POINT_NAME = "StopPointName";
    public static final String BUSLINE_DEFAULT_MESSAGE = "Top 10 bus lines with most stops are : ";
    public static final String BUSSTOP_DEFAULT_MESSAGE = "Bus stop name for busline having most bus stop : ";


    public void createLineModelArrayFromJson(String response){

        JsonObject jsonObject = new JsonParser().parse(response).getAsJsonObject();
        JsonObject responseData = jsonObject.getAsJsonObject(RESPONSE_DATA).getAsJsonObject();
        JsonArray resultArray = responseData.get(RESULT).getAsJsonArray();



        for(JsonElement element : resultArray){
            JsonObject lineObject = new JsonParser().parse(String.valueOf(element)).getAsJsonObject();
            Line lineElement = new Line();
            lineElement.setLineNumber(lineObject.get(LINE_NUMBER).getAsString());
            lineElement.setUniqueStopPointNumber(lineObject.get(JOURNEY_PATTERN_POINT_NUMBER).getAsString());
            sortedData.add(lineElement);
        }
        arrangeNumberOfStops(sortedData);
    }

    public void arrangeNumberOfStops(List<Line> arr){
        Map<String, Integer> countMap = new HashMap<>();
        int lastLineNumber = 0;
        int currentLineNumber = 0;
        int count = 0;

        for(Line line : arr){
            currentLineNumber = Integer.valueOf(line.getLineNumber());

            if(currentLineNumber == lastLineNumber){
                count++;

            }else{
                countMap.put(String.valueOf(lastLineNumber), count);
                count = 1;
                lastLineNumber = currentLineNumber;

            }
        }

        printMaps(countMap);
    }

    public void printMaps(Map<String, Integer> map){
        List<Integer> stops = new ArrayList<>();
        int count = 0;
        int lastElement = 0;

        for(Map.Entry<String, Integer> checkMap : map.entrySet()){
               stops.add(checkMap.getValue());
        }
        Collections.sort(stops, Collections.reverseOrder());
        List<Integer> topTenBuslineStops = new ArrayList<>();

        for(Integer stop : stops){
            if(count == 10)
                break;

            topTenBuslineStops.add(stop);
            count++;
        }

        System.out.println(BUSLINE_DEFAULT_MESSAGE);

        for(Integer value : topTenBuslineStops) {
            if(lastElement == value)
                continue;
            for (Map.Entry<String, Integer> checkMap : map.entrySet()) {
                if(Objects.equals(checkMap.getValue(), value)) {
                    if(validCount == 0)
                        busLineWithMostNumberOfStops = Integer.valueOf(checkMap.getKey());
                    System.out.println(checkMap.getKey());
                    validCount++;
                }
            }
            lastElement = value;
        }

    }

    public void getBusStopName(String response){
        List<Integer> stopPoints = new ArrayList<>();
        List<String> stopPointNames = new ArrayList<>();
        List<Stop> stopList = new ArrayList<>();

        JsonObject jsonObject = new JsonParser().parse(response).getAsJsonObject();
        JsonObject responseData = jsonObject.getAsJsonObject(RESPONSE_DATA).getAsJsonObject();
        JsonArray resultArray = responseData.get(RESULT).getAsJsonArray();

        for(Line line : sortedData){
            if(Integer.valueOf(line.getLineNumber()) == busLineWithMostNumberOfStops)
                stopPoints.add(Integer.valueOf(line.getUniqueStopPointNumber()));

        }


        for (JsonElement element : resultArray) {
                JsonObject stopObject = new JsonParser().parse(String.valueOf(element)).getAsJsonObject();
                Stop stop = new Stop();
                stop.setStopPointNumber(stopObject.get(STOP_POINT_NUMBER).getAsInt());
                stop.setStopPointName(stopObject.get(STOP_POINT_NAME).getAsString());
                stopList.add(stop);
            }

        for(Integer stopPoint : stopPoints){
            for(Stop stop :  stopList){
                if(stop.getStopPointNumber() == stopPoint)
                    stopPointNames.add(stop.getStopPointName());
            }

    }
        System.out.println(BUSSTOP_DEFAULT_MESSAGE);

        String busStopName = null;
        for (String name : stopPointNames){
           if(name.equalsIgnoreCase(busStopName))
                continue;
            System.out.println(name);
            busStopName = name;
        }

    }


}
