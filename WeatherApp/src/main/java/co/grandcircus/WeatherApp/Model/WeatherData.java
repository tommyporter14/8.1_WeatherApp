package co.grandcircus.WeatherApp.Model;

public class WeatherData {

	private String[] temperature;
	private String[] pop;
	private String[] weather;
	private String[] iconLink;
	private String[] hazard;
	private String[] hazardUrl;
	private String[] text;
	
	public String[] getTemperature() {
		return temperature;
	}
	public void setTemperature(String[] temperature) {
		this.temperature = temperature;
	}
	public String[] getPop() {
		return pop;
	}
	public void setPop(String[] pop) {
		this.pop = pop;
	}
	public String[] getWeather() {
		return weather;
	}
	public void setWeather(String[] weather) {
		this.weather = weather;
	}
	public String[] getIconLink() {
		return iconLink;
	}
	public void setIconLink(String[] iconLink) {
		this.iconLink = iconLink;
	}
	public String[] getHazard() {
		return hazard;
	}
	public void setHazard(String[] hazard) {
		this.hazard = hazard;
	}
	public String[] getHazardUrl() {
		return hazardUrl;
	}
	public void setHazardUrl(String[] hazardUrl) {
		this.hazardUrl = hazardUrl;
	}
	public String[] getText() {
		return text;
	}
	public void setText(String[] text) {
		this.text = text;
	}
	
	
}
