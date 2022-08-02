package by.epam.tr.main5;

import java.util.List;

public class CountryView {
public void printCountry(Country country) {
	System.out.println("Capital of the country: " + country.getCapital() );
	
		
	}
public String printCity (Region region) {
	String region1 = ",";
	for (District b: region.getRegion())  {
		region1 = region1 + b.getDistrict();
	}
	return region1;
		
	}

public  void printToConsole(List<Region> region, List<District> district, List<City> city) {
	

	
	System.out.println("Name of the district:" + district.get(0).getDistName());
	for(District a: district) {
		for (int i=0; i<(district.size()+2); i++) {
			System.out.println("District's city is: " + city.get(i).getCityName());
			
			
		}
	}
	
	
}
}
	






