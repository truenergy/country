package by.epam.tr.main5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class District {
	private String distName;
	private List<City> district;

	public District() {
		distName = "";
		district = new ArrayList<City>();
	}

	public District(String distName, List<City> district) {
		this.distName = distName;
		this.district = new ArrayList<City>();
		this.district.addAll(district);
	}

	public String getDistName() {
		return distName;
	}

	public void setDistName(String distName) {
		this.distName = distName;
	}

	public List<City> getDistrict() {
		return district;
	}

	public void setDistrict(List<City> district) {
		this.district = district;
	}

	@Override
	public int hashCode() {
		return Objects.hash(distName, district);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		District other = (District) obj;
		return Objects.equals(distName, other.distName) && Objects.equals(district, other.district);
	}

	@Override
	public String toString() {
		return "District [distName=" + distName + ", district=" + district + "]";
	}

	public void add(District district2) {
		// TODO Auto-generated method stub
		
	}

	
	
}
