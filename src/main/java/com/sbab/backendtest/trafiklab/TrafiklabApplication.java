package com.sbab.backendtest.trafiklab;

import com.sbab.backendtest.restclient.FetchDataFromTrafiklab;
import com.sbab.backendtest.restclient.TrafiklabApiClient;
import org.apache.hc.core5.http.ParseException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;
import java.net.URISyntaxException;


@SpringBootApplication
public class TrafiklabApplication {

	public static void main(String[] args) throws URISyntaxException, IOException, ParseException {
		SpringApplication.run(TrafiklabApplication.class, args);

		FetchDataFromTrafiklab data = new TrafiklabApiClient();
		data.sendHttpBuslineRequest();
		System.out.println();
		data.sendHttpBusStopRequest();

	}

}
