package com.sbab.backendtest.restclient;

import java.io.IOException;
import java.util.List;

public interface FetchDataFromTrafiklab {

    public List<String> sendHttpBuslineRequest() throws IOException;
    public List<String> sendHttpBusStopRequest() throws IOException;

}
