package by.htp.les09.AgregationAndCompositionTask03;

import java.util.ArrayList;
import java.util.List;

public class Nation {
	private String name;
	private int nationArea;
	private String capitalName;
	private int amountOfCounties;
	private List<String> countyCapitalNames = new ArrayList<String>();
	
	
	
	public Nation (String name) {
		this.name = name;
	}
	
	public void addCounty(County county) {
		this.nationArea = this.nationArea + county.getCountyArea();
		this.amountOfCounties++;
		if (county.isCapitolNationalCapitol()==true) {
			this.capitalName = county.getCountyName();
		}
		String temp = county.getCountyName();
		this.countyCapitalNames.add(temp);
	}

	@Override
	public String toString() {
		return name + "\nArea = " + nationArea + "km2\nThe Capital of "+ name + " is "+ capitalName
				+ "\nNation consists of " + amountOfCounties + " counties\nCounty Capital Names are " + countyCapitalNames;
	}
	
	
}
