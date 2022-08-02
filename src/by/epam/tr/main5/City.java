package by.epam.tr.main5;

import java.util.Objects;

public class City {

	private String cityName;
	private double citySquare;
	private long numberCitizen;
	

	public City() {
		cityName = "";
		citySquare = 0.0;
		numberCitizen = 0;
		
	}

	public City(String cityName, double citySquare, long numberCitizen) {
		this.cityName = cityName;
		this.citySquare = citySquare;
		this.numberCitizen = numberCitizen;
		
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public double getCitySquare() {
		return citySquare;
	}

	public void setCitySquare(double citySquare) {
		this.citySquare = citySquare;
	}

	public long getNumberCitizen() {
		return numberCitizen;
	}

	public void setNumberCitizen(long numberCitizen) {
		this.numberCitizen = numberCitizen;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cityName, citySquare, numberCitizen);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return Objects.equals(cityName, other.cityName)
				&& Double.doubleToLongBits(citySquare) == Double.doubleToLongBits(other.citySquare)
				&& numberCitizen == other.numberCitizen;
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", citySquare=" + citySquare + ", numberCitizen=" + numberCitizen + "]";
	}


	

}
