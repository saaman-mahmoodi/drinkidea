package drinkidea;

public class Drink {

	String name;
	
	public Drink() {
		
	}
	public Drink(String name) {
		this.setName(name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
