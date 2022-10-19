/*
* 
* Zakaria Kortam - 10/13/2022 - Professor Eisenberg
* 
* 1. Creatge an empty array, one element array, and an odd/even multi-element
* array.
* 2. Create a method, revrseAndDisplay that 
* calls a new method,reverseInPlace, which flips the array, and then prints the array.
* 3. Show before and after.
* 
* 
* 
*/
	 
	import java.util.Arrays;

		public class ArrayReverse2{
			public static void main(String[] args){
			
				//Arrays
				int[] empty = {0};
				int[] single = {70};
				int[] even = {10,20,30,40,50,60};
				int[] odd = {10,20,30,40,50,60,70};
				
						//Formatting and Method Calls
						System.out.println("\n===========");
						System.out.print("Empty");
					reverseAndDisplay(empty); 
						System.out.println("\n===========");
						System.out.print("Single");
					reverseAndDisplay(single);
						System.out.println("\n===========");
						System.out.print("Even");
					reverseAndDisplay(even);
						System.out.println("\n===========");
						System.out.print("Odd");
					reverseAndDisplay(odd);
			
			}
		
			public static void reverseInPlace(int[]array){
				//Temporary substitute to preserve initial values
				int[] temp = new int[array.length];
					for(int i=0; i<array.length; i++){
						temp[i] = array[i];
					}
					for (int i=0; i<array.length; i++){
						int reverselength = array.length - 1 - i;
						array[i] = temp[reverselength];
					}
			}
			
			public static void reverseAndDisplay(int[]array){
				System.out.print("\n");
				System.out.print("\n");
				System.out.print("Before: ");
				for (int i = 0; i < array.length; i++){
					System.out.print(array[i]);
					System.out.print(" ");
				}
				reverseInPlace(array);
				System.out.println("\n");
				System.out.print("After: ");
				for (int i = 0; i < array.length; i++){
					System.out.print(array[i]);
					System.out.print(" ");
				}
				System.out.print("\n");
				
			}

}
