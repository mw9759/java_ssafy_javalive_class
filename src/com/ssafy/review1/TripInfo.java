package com.ssafy.review1;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
class TripBody{
	List<TripDto> items;

	/**
	 * @return the items
	 */
	public List<TripDto> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(List<TripDto> items) {
		this.items = items;
	}
	
}
@JsonIgnoreProperties(ignoreUnknown = true)
class TripResponse{
	//header;필요없다.
	TripBody body;

	/**
	 * @return the body
	 */
	public TripBody getBody() {
		return body;
	}

	/**
	 * @param body the body to set
	 */
	public void setBody(TripBody body) {
		this.body = body;
	}
	
	
}
@JsonIgnoreProperties(ignoreUnknown = true)
public class TripInfo {
	TripResponse response;

	/**
	 * @return the response
	 */
	public TripResponse getResponse() {
		return response;
	}

	/**
	 * @param response the response to set
	 */
	public void setResponse(TripResponse response) {
		this.response = response;
	}
	
	
}
