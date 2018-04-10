package com.interviewprep.consumegoogle;

public class GoogleResponse {
	private String status;
	private Results[] results;

	public GoogleResponse() {
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Results[] getResults() {
		return results;
	}

	public void setResults(Results[] results) {
		this.results = results;
	}
}
