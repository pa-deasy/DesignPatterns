
public class TestPancakeHouse {
	
	public static void main(String [] args){
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu(); 
		DinerMenu dinerMenu = new DinerMenu();
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		waitress.printTheMenu();
	}

}
