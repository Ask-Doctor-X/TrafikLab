package com.sbab.backendtest.restclient;

import java.io.IOException;
import java.net.URISyntaxException;

public interface FetchDataFromTrafiklab {

    public void sendHttpBuslineRequest() throws URISyntaxException, IOException;
    public void sendHttpBusStopRequest() throws URISyntaxException, IOException;

}
