package co.grandcircus.WeatherApp.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherObservation {
	
	private String elev;
	private String latitude;
	private String longitude;
	@JsonProperty("Temp")
	private String temp;
	@JsonProperty("Winds")
	private String winds;
	@JsonProperty("Weather")
	private String weather;
	@JsonProperty("Visibility")
	private String visibility;
	
	public String getElev() {
		return elev;
	}
	public void setElev(String elev) {
		this.elev = elev;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	public String getWinds() {
		return winds;
	}
	public void setWinds(String winds) {
		this.winds = winds;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getVisibility() {
		return visibility;
	}
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
	
	
	
}
