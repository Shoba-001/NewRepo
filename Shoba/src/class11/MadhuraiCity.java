package class11;

public class MadhuraiCity implements City {
	int population;
	public void areaName(String areaName) {
		System.out.println(areaName);
	}
	public void isTastyfood(boolean isTastyfood) {
		if(isTastyfood==true) {
			System.out.println("SeaShell is a good hotel");
		}
		else {
			System.out.println("Not a good hotel");
		}
		}
	public void population(int population) {
		System.out.println(population);
	}

}
