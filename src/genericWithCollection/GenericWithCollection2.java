package genericWithCollection;

import java.util.ArrayList;
import java.util.List;

public class GenericWithCollection2 {
	
	public static void useBasketOfFruits(List<Fruit> fruits) {
		
		
	}
	
	public static void main(String[] args) {
		
		Banana banana = new Banana();
		Banana banana2 = new Banana();
		
		Orange orange = new Orange();
		
		List<Banana> basketOfFruits = new ArrayList<>();
		basketOfFruits.add(banana);
		basketOfFruits.add(banana2);
		
//		useBasketOfFruits(basketOfFruits);	// can not
		//Banana extends from Fruit
		//But List<Banana> do not extend from List<Fruit>
		
	}

}
