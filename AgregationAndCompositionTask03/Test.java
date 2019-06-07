package by.htp.les09.AgregationAndCompositionTask03;

public class Test {

	public static void main (String[] args) {
		
		Town town1 = new Town ("Mogilev", true, false);
		Town town2 = new Town ("Brest", true, false);
		Town town3 = new Town ("Hrodna", true, false);
		Town town4 = new Town ("Minsk", true, true);
		Town town5 = new Town ("Gomel", true, false);
		Town town6 = new Town ("Vitebsk", true, false);
		
		County county1 = new County(town1, 29068);
		County county2 = new County(town2, 32787);
		County county3 = new County(town3, 25127);
		County county4 = new County(town4, 39854);
		County county5 = new County(town5, 40372);
		County county6 = new County(town6, 40051);
		
		Nation nation = new Nation("Belarus");
		
		nation.addCounty(county1);
		nation.addCounty(county2);
		nation.addCounty(county3);
		nation.addCounty(county4);
		nation.addCounty(county5);
		nation.addCounty(county6);
		
		System.out.println(nation);
		
	}
}
