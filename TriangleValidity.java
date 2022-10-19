import java.util.Scanner;

public class Triangle {

	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
			double a, b, c, perimeter; // Three Sides + Perimeter
			boolean validity;
			System.out.print("Please enter the lengths of the three sides ");
			System.out.print("of the triangle seperated by spaces --> ");
			a = in.nextDouble();
			b = in.nextDouble();
			c = in.nextDouble();
			validity = isValid(a,b,c);
			perimeter = a + b + c;
			
			if (validity) {
				System.out.printf("\nThe perimeter is %.2f", perimeter);
			} else { System.out.print("Those sides fail to specify a valid triangle.");
              }
  }


	public static boolean isValid(double a, double b, double c){
			double greatestnumber=0;
			boolean isTriangleValid=true;
			double ab = a+b;
			double ac = a+c;
			double bc = b+c;
		
			if (c >= ab || b >= ac){ 
				isTriangleValid=false;
			}
			if (a >= bc){
				isTriangleValid=false;
			}
	
	return isTriangleValid;
  }

}
