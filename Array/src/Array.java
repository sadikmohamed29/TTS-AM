
public class Array {
	public static void main(String[] args) {
		int arr[] = {2,5,6,3,7,8};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("Sum is " + sum);
		
	}
	public static void OutputTest (String[] args) {
		double[ ] exampleArray = {1,5,6,5,4,1};

		double maximum = exampleArray[0];

		int index = 0;

		for (int i = 1; i<exampleArray.length; i++){

			if (exampleArray[ i ] > maximum) {

				maximum = exampleArray[ i ];

				index = i;

			}

		}

		System.out.println(index);

	}
	public static int[] toPower(int size, int power) {
		int array[] = new int[size];
		for(int index = 0; index < size; index++) {
			int total = (int) Math.pow(index, power);
			System.out.println(total);
			array[index] = total;

		}



		return (array);

	}
}