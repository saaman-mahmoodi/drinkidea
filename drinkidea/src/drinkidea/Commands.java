package drinkidea;

import java.util.ArrayList;
import java.util.Random;

public class Commands {

	public static Drink whatDrink(ArrayList<Drink> drinks) {
		
		Random rand = new Random();
		
		int index = rand.nextInt(drinks.size());
		
		return drinks.get(index);
		
	}
	
}
