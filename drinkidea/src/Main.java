import drinkidea.Drink;
import coldDrinks.ColdDrink;
import hotDrinks.HotDrink;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Drink> drinks = new ArrayList<Drink>();
		
		drinks.add(new HotDrink("Espresso"));
		drinks.add(new ColdDrink("Cold Brew"));
		
		System.out.println("You should have a " + whatDrink(drinks).getName());
		
		
	}

	private static Drink whatDrink(ArrayList<Drink> drinks) {
		
		Random rand = new Random();
		
		int index = rand.nextInt(drinks.size());
		
		return drinks.get(index);
		
	}

}
