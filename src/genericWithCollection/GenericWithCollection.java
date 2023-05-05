package genericWithCollection;

import java.util.ArrayList;
import java.util.List;

class Fruit {}

class Banana extends Fruit {}

class Orange extends Fruit {}

public class GenericWithCollection {
	
	public static void useBasketOfFruits(List<Fruit> fruits) {
		
		
	}
	
	public static void main(String[] args) {
		
		Banana banana = new Banana();
		
		Orange orange = new Orange();
		
		List<Fruit> basketOfFruits = new ArrayList<>();
		basketOfFruits.add(banana);
		basketOfFruits.add(orange);
		
		useBasketOfFruits(basketOfFruits);	
		
	}

}
