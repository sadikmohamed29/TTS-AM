import java.util.HashMap; 
import java.util.Scanner;
public class CarDealer {   
	public static void main(String[] args) {   
		//Hashmap is a type of Ojvect that has a key and value for that key
		HashMap<Double, Double> myHashmap = new HashMap<Double,Double>(); // double = key, value = double
		HashMap<String, Integer> myHashmap2 = new HashMap<String, Integer>(); // String = key, Integer = value
		
		
		
		HashMap<String, String> carHashmap = new HashMap<String,String>();
		carHashmap.put("Honda", "Civic");
		carHashmap.put("Toyota", "Tundra");
		carHashmap.containsKey("Honda");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What model are you looking for?");
		String model = scanner.nextLine();
		if(carHashmap.containsKey(model)) {
			System.out.println( "Oh, you're looking for a " + model +  ", Our " +  (carHashmap.get(model)) + " selection is right over here...");
		}
		else {
			System.out.println("We do not have in stock.");
		}
		
		
		
		
		
		
		
		
		
	} 
} 


