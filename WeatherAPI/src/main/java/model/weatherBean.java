package model;

public class weatherBean {

	// deklarerar privata variabler
	private String cityStr;

	private String countryStr;

	private String cloudsStr;

	private String dateStr;

	private double temperatureKelvin;

	// constructor som tar in parametrarna cityStr och countyStr
	public weatherBean(String cityStr, String countryStr) {

		this.cityStr = cityStr;
		this.countryStr = countryStr;

	}

	// getters och setters, för att lagra information och få information
	public String getCityStr() {
		return cityStr;
	}

	public String getCountryStr() {
		return countryStr;
	}

	public String getCloudsStr() {
		return cloudsStr;
	}

	public void setCloudsStr(String cloudsStr) {
		this.cloudsStr = cloudsStr;
	}

	public double getTemperatureKelvin() {
		return temperatureKelvin;
	}

	public void setTemperatureKelvin(double temperatureKelvin) {
		this.temperatureKelvin = temperatureKelvin;
	}

	public String getDateStr() {
		return dateStr;
	}

	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}

	// metod för att konvertera kelvin till celsius
	public double getCelsius() {
		double celsius = getTemperatureKelvin() - 273.15;
		return Math.round(celsius);
	}

}