import java.util.ArrayList; 
import java.util.Scanner; 

public class Tester { 
	public static void main(String[] args) {
		// arraylist to store input
		ArrayList<Double> list = new ArrayList<Double>();
		// scanner object for scanning input
		Scanner scanner = new Scanner(System.in);
		// taking input   
		for(int i = 0; i < 5; i++) {  
			System.out.println("Please enter number " + (i + 1));
			double inputFromScanner = scanner.nextDouble(); //
			list.add(inputFromScanner); // adds input from scanner to arraylist
		}         
		
//		double largest = list.get(0);
//		double smallest = list.get(0);
		// looping through the arraylist.
		
		///getting sum
		//1.  initialize sum variable = 0
		//2. in loop
		//	a. add value of list item to sum
		double sum = 0;
		for (int i = 0; i < list.size(); i ++) {
			sum = sum + list.get(i); // i =0, 1, 2, 3, 4, list.size()
			
		
		
			
			
			
			
		}
		System.out.println("The sum is: " + sum);
		
		
		//getting max ( and min with minor alterations)
		/* 1. create a max varaibale that holds zero - done
		 * 2. iterate through arraylist
		 * 	a. if (value> max){ max = list.get(i)}  
		 * 	b. else { continue;}
		 *
		 */
		double max = list.get(0); // max by default assumes the first item is the max
		for(int i = 0; i < list.size(); i++) {
			if( list.get(i) > max) {
				max = list.get(i);
			}
		}
		System.out.println(max);
		
		//min
		double min = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < min ) {
				min = list.get(i);
			}
		
			
		}
		System.out.println("The min is: "+ min);
		// finding product
		double product = 1;
		for (int i = 0; i < list.size(); i++) {
			product = product * list.get(i);
		}
		     System.out.println("The product is:" + product);
		     
		       	
	}
	
	
}





