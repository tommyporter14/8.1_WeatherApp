package co.grandcircus.WeatherApp.Model;

public class WeatherTime {

	private String layoutKey;
	private String[] startPeriodName;
	private String[] startValidTime;
	private String[] tempLabel;
	
	public String getLayoutKey() {
		return layoutKey;
	}
	public void setLayoutKey(String layoutKey) {
		this.layoutKey = layoutKey;
	}
	public String[] getStartPeriodName() {
		return startPeriodName;
	}
	public void setStartPeriodName(String[] startPeriodName) {
		this.startPeriodName = startPeriodName;
	}
	public String[] getStartValidTime() {
		return startValidTime;
	}
	public void setStartValidTime(String[] startValidTime) {
		this.startValidTime = startValidTime;
	}
	public String[] getTempLabel() {
		return tempLabel;
	}
	public void setTempLabel(String[] tempLabel) {
		this.tempLabel = tempLabel;
	}


}
