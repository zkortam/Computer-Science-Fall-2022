import java.util.Scanner;

public class Shipping {

	public static void main(String[]args){
	  Scanner in = new Scanner(System.in);
		double w; //Weight
		double cost=0;
								
		System.out.print("Welcome, please state the package weight: ");
		w = in.nextDouble();
		if (0 < w && w <= 2) cost = 3.50;
		if (2 < w && w < 7) cost = 5.90;
		if (7 < w && w < 16) cost = 10.85;
		if (16 < w && w < 25) cost = 12.35;
		if (0 < w && w < 25)  {
		System.out.printf("The cost is %.2f",cost);
	     } else {
		   if (w < 0) System.out.print("\nWeight may not be negative.");	 
		   if (w > 25) System.out.print("\nWeight may not be above 25.");	 	 
		   }
           in.close();


}
