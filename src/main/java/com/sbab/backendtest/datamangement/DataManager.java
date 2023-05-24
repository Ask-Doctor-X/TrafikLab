package com.sbab.backendtest.datamangement;


import com.sbab.backendtest.model.Line;

import java.util.List;
import java.util.Map;

public interface DataManager {

    public List<String> getTopTenBusStops(String response);

    public List<String> getBusStopName(String response);
    public List<String> arrangeNumberOfStops(List<Line> arr);

    public List<String> sortMaps(Map<String, Integer> map);
    public List<String> returnTopBusLines(Map<String, Integer> map, List<Integer> topTenBusLineStops);
}
