/*
 * 
 * Zakaria Kortam
 * Professor Eisenberg
 * 10/18/2022
 * 
 * 1. Ask for the number of elements in each array
 * 2. Ask for the first and second arrays' numbers. 
 * First array is height in CM and second array is weight in KG.
 * 3. use correlation() to calculate the correlation coefficient.
 * 4. Print from within the main. 
 */
  import java.util.Scanner;

	public class Correlation {
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
				System.out.println("========= Number of People =========");
				System.out.print("Plese enter the number of people: ");
				int numberOfPeople = in.nextInt();
				double [] height = new double [numberOfPeople];
				double [] weight = new double [numberOfPeople];
				System.out.print("\n");
				
				//Weight
				System.out.println("========= Measurements =========");
				System.out.print("Plese enter the weights in kilograms: ");
				for (int i = 0; i<numberOfPeople; i++){
					weight[i] = in.nextDouble();
				}
				System.out.print("\n");
				
				//Height
				System.out.print("Plese enter the heights in centimeters: ");
				for (int i = 0; i<numberOfPeople; i++){
					height[i] = in.nextDouble();
				}
				System.out.print("\n");
				double correlationCoeff = correlation(height,weight,numberOfPeople);
				
				//Result Section
				System.out.println("========= Correlation Coefficient =========");
				System.out.print(correlationCoeff);
		}
		
		public static double correlation(double [] height, double [] weight, int numberOfPeople){
				double totalHeight = 0;
				double totalWeight = 0;
				double averageHeight;
				double averageWeight;
				double answer = 0;
				double heightDenominatorSum= 0;
				double widthDenominatorSum = 0;
				double numerator = 0;
				double denominator = 0;
			
				//General Calculations
				for (int i = 0; i < numberOfPeople; i++){
					totalHeight = totalHeight + height[i];
					totalWeight = totalWeight + weight[i];
				}
				averageHeight = totalHeight / numberOfPeople;
				averageWeight = totalWeight / numberOfPeople;
				
				//Numerator Calculations
				for (int i = 0; i < numberOfPeople; i++){
					height[i] = height[i] - averageHeight;
					weight[i] = weight[i] - averageWeight;
				}
				for (int i = 0; i < numberOfPeople; i++){
					numerator = numerator + (weight[i] * height[i]);
				}
				
				//Denominator Calculations
				for (int i = 0; i < numberOfPeople; i++){
					heightDenominatorSum = Math.pow(height[i], 2.0) + heightDenominatorSum;
					widthDenominatorSum = Math.pow(weight[i], 2.0) + widthDenominatorSum;
				}
				denominator = Math.sqrt((heightDenominatorSum * widthDenominatorSum));
				
				//Answer
				answer = numerator / denominator;
				
			return answer;
			
			}
			
	}
	
	
	

