package by.epam.tr.main5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Region {
private List<District> region;
private String regionName;
private String regionCapital;
public Region () {
	regionName="";
	region = new ArrayList<District>();
	regionCapital = "";
}
public Region(String regionName, List<District> region, String regionCapital) {
	this.regionName= regionName;
	this.region = new ArrayList<District>();
	this.region.addAll(region);
	this.regionCapital = regionCapital;
}
public List<District> getRegion() {
	return region;
}
public void setRegion(List<District> region) {
	this.region = region;
}
public String getRegionName() {
	return regionName;
}
public void setRegionName(String regionName) {
	this.regionName = regionName;
}
public String getRegionCapital() {
	return regionCapital;
}
public void setRegionCapital(String regionCapital) {
	this.regionCapital = regionCapital;
}
@Override
public int hashCode() {
	return Objects.hash(region, regionCapital, regionName);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Region other = (Region) obj;
	return Objects.equals(region, other.region) && Objects.equals(regionCapital, other.regionCapital)
			&& Objects.equals(regionName, other.regionName);
}
@Override
public String toString() {
	return "Region [region=" + region + ", regionName=" + regionName + ", regionCapital=" + regionCapital + "]";
}
public void add(District region2) {
	// TODO Auto-generated method stub
	
}

}
