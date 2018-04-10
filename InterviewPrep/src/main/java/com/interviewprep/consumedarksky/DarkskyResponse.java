package com.interviewprep.consumedarksky;

public class DarkskyResponse {
	private String timezone;
	private Currently currently;

	public DarkskyResponse() {
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public Currently getCurrently() {
		return currently;
	}

	public void setCurrently(Currently currently) {
		this.currently = currently;
	}

}
