package com.sbab.backendtest.trafiklab;

import com.sbab.backendtest.restclient.FetchDataFromTrafiklab;
import com.sbab.backendtest.restclient.TrafiklabApiClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


@SpringBootApplication
public class
TrafiklabApplication {
	static Logger logger = Logger.getLogger(TrafiklabApplication.class.getName());
	public static final String BUSLINE_DEFAULT_MESSAGE = "Top 10 bus lines with most stops are : ";
	public static final String BUSSTOP_DEFAULT_MESSAGE = "Bus stop name for busline having most bus stop : ";

	public static void main(String[] args) throws IOException {
		SpringApplication.run(TrafiklabApplication.class, args);

		FetchDataFromTrafiklab data = new TrafiklabApiClient();
		List<String> busLineData = new ArrayList<>();
		List<String> finalBusStopNames = new ArrayList<>();

		try{
			busLineData = data.sendHttpBuslineRequest();
			finalBusStopNames = data.sendHttpBusStopRequest();
		}catch (IOException e){
			logger.severe("I/O Exception Occured : "+e.getMessage());
		}

		System.out.println(BUSLINE_DEFAULT_MESSAGE);
		for(String busline : busLineData){
			System.out.println(busline);
		}
		System.out.println();
		System.out.println(BUSSTOP_DEFAULT_MESSAGE);

		for(String busstop : finalBusStopNames){
			System.out.println(busstop);
		}

	}

}
