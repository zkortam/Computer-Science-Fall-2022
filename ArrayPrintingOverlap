/*
 * Zakaria Kortam
 * Professor Eisenberg 
 * 10/18/2022
 * 
 * 1. Have three void functions that have the same names
 * 2. In the first function, send only an array.  
 * 3. Second function sends array and limits the number
 * of stuff per row. No comma at the end of a line.
 * 4. Third sends array, row limit, and also a special formatting string. 
 * 
 * Everything is printed within the functions.
 */

import java.util.Arrays;

	public class Printing{
		public static void main(String[] args){
			double [] array = {10,20,30,40,50,60,70,80,90,100,110};
			int itemsperline = 4;
			String format = "%6.2s";
			
				System.out.println("\n\n\n======Array One======");
			doublePrintArray(array);
				System.out.println("\n\n\n======Array Two======");
			doublePrintArray(array, itemsperline);
				System.out.println("\n\n\n======Array Three======");
			doublePrintArray(array, itemsperline,format);
		}
			
			
		public static void doublePrintArray(double[]array){
			System.out.print(Arrays.toString(array) );
		}
	
		public static void doublePrintArray(double[]array, int itemsperline){
		
			System.out.print("[ ");
			for( int i=0; i<array.length; i++){
				if ( i % 4 == 0) {
					System.out.print("\n");
				}
				if ( i % 4 != 0) {
					System.out.print(", ");
				}
				System.out.print(array[i]);
			}
			System.out.print(" ]");
		}
	
		public static void doublePrintArray(double[]array, int itemsperline, String format){
		
			System.out.print("[ ");
			for( int i=0; i<array.length; i++){
				if ( i % 4 == 0) {
					System.out.print("\n");
				}
				if ( i % 4 != 0) {
					System.out.print(",");
					System.out.printf(format, " ");
				}
				System.out.print(array[i]);
			}
			System.out.print(" ]");
		}
	
	}
