package co.grandcircus.WeatherApp.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherResponse {

	private String operationalMode;
	private String srsName;
	private String creationDate;
	private String creationDateLocal;
	private String productionCenter;
	private String credit;
	private String moreInformation;
	@JsonProperty("location")
	private WeatherLocation locationInfo;
	@JsonProperty("time")
	private WeatherTime timeInfo;
	@JsonProperty("currentobservation")
	private WeatherObservation observation;
	@JsonProperty("data")
	private WeatherData dataInfo;
	
	public String getOperationalMode() {
		return operationalMode;
	}
	public void setOperationalMode(String operationalMode) {
		this.operationalMode = operationalMode;
	}
	public String getSrsName() {
		return srsName;
	}
	public void setSrsName(String srsName) {
		this.srsName = srsName;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getCreationDateLocal() {
		return creationDateLocal;
	}
	public void setCreationDateLocal(String creationDateLocal) {
		this.creationDateLocal = creationDateLocal;
	}
	public String getProductionCenter() {
		return productionCenter;
	}
	public void setProductionCenter(String productionCenter) {
		this.productionCenter = productionCenter;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getMoreInformation() {
		return moreInformation;
	}
	public void setMoreInformation(String moreInformation) {
		this.moreInformation = moreInformation;
	}
	public WeatherLocation getLocationInfo() {
		return locationInfo;
	}
	public void setLocationInfo(WeatherLocation locationInfo) {
		this.locationInfo = locationInfo;
	}
	public WeatherTime getTimeInfo() {
		return timeInfo;
	}
	public void setTimeInfo(WeatherTime timeInfo) {
		this.timeInfo = timeInfo;
	}
	public WeatherObservation getObservation() {
		return observation;
	}
	public void setObservation(WeatherObservation observation) {
		this.observation = observation;
	}
	public WeatherData getDataInfo() {
		return dataInfo;
	}
	public void setDataInfo(WeatherData dataInfo) {
		this.dataInfo = dataInfo;
	}

	
}
