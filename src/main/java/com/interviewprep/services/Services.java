package com.interviewprep.services;

import org.springframework.web.client.RestTemplate;

import com.interviewprep.consumedarksky.DarkskyResponse;
import com.interviewprep.consumegoogle.GoogleResponse;
import com.interviewprep.consumegoogle.Location;
import com.interviewprep.consumegoogle.Results;

public class Services {
	// private static final Logger log = LoggerFactory.getLogger(Services.class);

	public Results consumeGoogle(String zipCode) {
		String url = "http://maps.googleapis.com/maps/api/geocode/json?address=" + zipCode;
		RestTemplate rt = new RestTemplate();
		GoogleResponse response = null;
		Boolean lock = true;
		try {
			while (lock) {
				response = rt.getForObject(url, GoogleResponse.class);
				if (!response.getStatus().equals("OK")) {
					Thread.sleep(2000);
				} else {
					lock = false;
				}
			}
			if (response.getStatus().equals("OK")) {
				for (Results result : response.getResults()) {
					return result;
				}
			}
		} catch (Exception e) {
			return null;
		}
		return null;
	}

	public DarkskyResponse consumeDarksky(Location loc) {
		DarkskyResponse r = null;
		try {
			String apiKey = "aa041c9efbf81c2c63fad468e2f179ac";
			String url = "https://api.darksky.net/forecast/" + apiKey + "/" + loc.getLat() + "," + loc.getLng();
			RestTemplate rt = new RestTemplate();
			Boolean lock = true;
			while (lock) {
				r = rt.getForObject(url, DarkskyResponse.class);
				if (r != null) {
					lock = false;
				}
			}
			// log.info(r.toString());
			return r;
		} catch (Exception e) {
			return r;
		}
	}

}
