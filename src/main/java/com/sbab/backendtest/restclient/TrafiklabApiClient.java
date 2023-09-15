package com.sbab.backendtest.restclient;

import com.sbab.backendtest.datamangement.DataManager;
import com.sbab.backendtest.datamangement.DataManagement;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.net.URIBuilder;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientSsl;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;


public class TrafiklabApiClient implements FetchDataFromTrafiklab{
    DataManager data = new DataManagement();

    private final RestTemplate restTemplate;

    static Logger logger = Logger.getLogger(TrafiklabApiClient.class.getName());
    public static final String BASE_URL = "https://api.sl.se/api2/linedata.json";
    public static final String KEY_NAME = "key";
    public static final String KEY_VALUE = "8c27a2ca35794288a3f71a50514cdd66";
    public static final String MODEL_NAME = "model";
    public static final String MODEL_JOURNEY_VALUE = "jour";
    public static final String MODEL_STOP_VALUE = "stop";
    public static final String DEFAULT_TRANSPORT_MODE_CODE = "DefaultTransportModeCode";
    public static final String DEFAULT_TRANSPORT_MODE_CODE_VALUE = "BUS";

    public TrafiklabApiClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    Map<String, String> getCommonParams(){
        Map<String, String> params = new HashMap<>();
        params.put(KEY_NAME, KEY_VALUE);
        params.put(MODEL_NAME, MODEL_JOURNEY_VALUE);
        params.put(DEFAULT_TRANSPORT_MODE_CODE, DEFAULT_TRANSPORT_MODE_CODE_VALUE);

        return params;
    }

    /*
    * REST Client method to get response of bus line API from Trafiklab.se
    *
     */

    @Override
    public List<String> sendHttpBuslineRequest() throws IOException {
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<?> entity = new HttpEntity<>(headers);

        ResponseEntity<String> response = restTemplate.exchange(
                BASE_URL+"?"+KEY_NAME+"={key}&"+MODEL_NAME+"={model}&"+DEFAULT_TRANSPORT_MODE_CODE+"={DefaultTransportModeCode}",
                HttpMethod.GET,
                entity,
                String.class,
                KEY_VALUE,
                MODEL_JOURNEY_VALUE,
                DEFAULT_TRANSPORT_MODE_CODE_VALUE
        );

        return data.getTopTenBusStops(response.getBody());

    }



    /*
    * REST Client method to get response of bus stop API from Trafiklab.se
    *
    * */
    @Override
    public List<String> sendHttpBusStopRequest() throws IOException {
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<?> entity = new HttpEntity<>(headers);

        ResponseEntity<String> response = restTemplate.exchange(
                BASE_URL + "?" + KEY_NAME + "={key}&" + MODEL_NAME + "={model}&" + DEFAULT_TRANSPORT_MODE_CODE + "={DefaultTransportModeCode}",
                HttpMethod.GET,
                entity,
                String.class,
                KEY_VALUE,
                MODEL_STOP_VALUE,
                DEFAULT_TRANSPORT_MODE_CODE_VALUE
        );

        return data.getBusStopName(response.getBody());
    }


}
