package by.epam.tr.main5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Country {
private String capital;
private List<Region> country;

public Country() {
	capital="";
	country = new ArrayList<Region>();
}
public Country (String capital, List<Region> country) {
	this.capital = capital;
	this.country = new ArrayList<Region>();
	this.country.addAll(country);
}
public String getCapital() {
	return capital;
}
public void setCapital(String capital) {
	this.capital = capital;
}
public List<Region> getCountry() {
	return country;
}
public void setCountry(List<Region> country) {
	this.country = country;
}
@Override
public int hashCode() {
	return Objects.hash(capital, country);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Country other = (Country) obj;
	return Objects.equals(capital, other.capital) && Objects.equals(country, other.country);
}
@Override
public String toString() {
	return "Country [capital=" + capital + ", country=" + country + "]";
}
public void add(List<Region> reg1) {
	// TODO Auto-generated method stub
	
}

}
