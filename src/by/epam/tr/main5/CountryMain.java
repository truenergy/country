package by.epam.tr.main5;

import java.util.ArrayList;
import java.util.List;

public class CountryMain {

	public static void main(String[] args) {
		Country country = new Country();
		country.setCapital("MainCapital");

		List<City> city1 = new ArrayList();
		city1.add(new City("Secunda", 105.00, 10000));
		city1.add(new City("Minute", 605.00, 15000));
		city1.add(new City("Hour", 240.00, 161000));

		List<City> city2 = new ArrayList();
		city2.add(new City("Moning", 550.00, 15000));
		city2.add(new City("Afternoon", 125.00, 76200));
		city2.add(new City("Night", 235.00, 176000));

		List<City> city3 = new ArrayList();
		city3.add(new City("First", 520.00, 10000));
		city3.add(new City("Second", 124.00, 16200));
		city3.add(new City("Third", 35.00, 76000));

		List<City> city4 = new ArrayList();
		city4.add(new City("Fourth", 320.00, 10000));
		city4.add(new City("Fifth", 24.00, 1200));
		city4.add(new City("Sixth", 135.00, 176000));

		List<District> dist1 = new ArrayList();
		dist1.add(new District("Time", city1));
		List<District> dist2 = new ArrayList();
		dist2.add(new District("Day", city2));
		List<District> dist3 = new ArrayList();
		dist3.add(new District("Number1", city3));
		List<District> dist4 = new ArrayList();
		dist4.add(new District("Number2", city4));

		List<Region> reg1 = new ArrayList<Region>();
		reg1.add(new Region("Region1", dist1, "Capital1"));
		reg1.add(new Region("Region1", dist2, "Capital1"));

		List<Region> reg2 = new ArrayList<Region>();
		reg2.add(new Region("Region2", dist3, "Capital2"));
		reg2.add(new Region("Region2", dist4, "Capital2"));

		country.add(reg1);
		country.add(reg2);

		CountryView print = new CountryView();
		print.printCountry(country);
		print.printToConsole(reg1, dist1, city1);

	}

}
