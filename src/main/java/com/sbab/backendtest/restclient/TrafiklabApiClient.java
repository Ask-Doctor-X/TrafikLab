package com.sbab.backendtest.restclient;

import com.sbab.backendtest.datamangement.DataManager;
import com.sbab.backendtest.datamangement.DataManagement;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.net.URIBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class TrafiklabApiClient implements FetchDataFromTrafiklab{
    DataManager data = new DataManagement();
    public static final String BASE_URL = "https://api.sl.se/api2/linedata.json";
    public static final String KEY_NAME = "key";
    public static final String KEY_VALUE = "8c27a2ca35794288a3f71a50514cdd66";
    public static final String MODEL_NAME = "model";
    public static final String MODEL_JOURNEY_VALUE = "jour";
    public static final String MODEL_STOP_VALUE = "stop";
    public static final String DEFAULT_TRANSPORT_MODE_CODE = "DefaultTransportModeCode";
    public static final String DEFAULT_TRANSPORT_MODE_CODE_VALUE = "BUS";

    @Override
    public void sendHttpBuslineRequest() throws URISyntaxException, IOException {
        CloseableHttpClient client = HttpClients.createDefault();

        try {
            HttpGet httpGet = new HttpGet(BASE_URL);
            URI uri = new URIBuilder(httpGet.getUri())
                    .addParameter(KEY_NAME, KEY_VALUE)
                    .addParameter(MODEL_NAME, MODEL_JOURNEY_VALUE)
                    .addParameter(DEFAULT_TRANSPORT_MODE_CODE, DEFAULT_TRANSPORT_MODE_CODE_VALUE)
                    .build();
            httpGet.setUri(uri);
            data.createLineModelArrayFromJson(EntityUtils.toString((client.execute(httpGet)).getEntity()));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            client.close();
        }

    }

    @Override
    public void sendHttpBusStopRequest() throws URISyntaxException, IOException {
        CloseableHttpClient client = HttpClients.createDefault();

        try {
            HttpGet httpGet = new HttpGet(BASE_URL);
            URI uri = new URIBuilder(httpGet.getUri())
                    .addParameter(KEY_NAME, KEY_VALUE)
                    .addParameter(MODEL_NAME, MODEL_STOP_VALUE)
                    .addParameter(DEFAULT_TRANSPORT_MODE_CODE, DEFAULT_TRANSPORT_MODE_CODE_VALUE)
                    .build();
            httpGet.setUri(uri);
            data.getBusStopName(EntityUtils.toString((client.execute(httpGet)).getEntity()));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            client.close();
        }

    }


}
