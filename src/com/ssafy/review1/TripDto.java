package com.ssafy.review1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TripDto {

	/** 관광지명 */
	@JsonProperty("trrsrtNm")//잭슨용어노테이션
	@SerializedName("trrsrtNm")//gson용
	private String touristDestination;
	
	@JsonProperty("rdnmadr")
	@SerializedName("rdnmadr")//gson용
	/** 관광지 도로명주소 */
	private String streetAddress;
	
	@JsonProperty("lnmadr")
	@SerializedName("lnmadr")//gson용
	/** 관광지 지번주소 */
	private String lotAddress;
	
	@JsonProperty("latitude")
	@SerializedName("latitude")//gson용
	/** 관광지 위도 */
	private double lat;
	
	@JsonProperty("longitude")
	@SerializedName("longitude")//gson용
	/** 관광지 경도 */
	private double lng;
	
	@JsonProperty("trrsrtIntrcn")
	@SerializedName("trrsrtIntrcn")//gson용
	/** 관광지 상세설명 */
	private String info;
	
	@JsonProperty("phoneNumber")
	@SerializedName("phoneNumber")//gson용
	/** 관광지 관리 전화번호 */
	private String tel;

	public TripDto() {
	}

	public String getTouristDestination() {
		return touristDestination;
	}

	public void setTouristDestination(String touristDestination) {
		this.touristDestination = touristDestination;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getLotAddress() {
		return lotAddress;
	}

	public void setLotAddress(String lotAddress) {
		this.lotAddress = lotAddress;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "TripDto [touristDestination=" + touristDestination + ", streetAddress=" + streetAddress
				+ ", lotAddress=" + lotAddress + ", lat=" + lat + ", lng=" + lng + ", info=" + info + ", tel=" + tel
				+ "]";
	}
}
