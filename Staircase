    import java.util.*;

    public class Staircase{
	public static void main(String[]args){
	    
	  Scanner sc = new Scanner(System.in); // replace sc with in
	
	
	  System.out.print ("Welcome to the secure Zaktonian portal. Please state the first letter of the assignment name to open ---> "); // just for fun; type S to run the program
      char code = sc.next().charAt(0);
	  if (code == 'S'){
	
	  System.out.print ("Access granted. Welcome to the staircase calculator ");
	  System.out.println();
	  System.out.println();
	
	  System.out.print("Please state the number of steps in the staircase: ");
	    double step = sc.nextDouble();   // Number of Steps
	
	  System.out.print("Please state the step width in centimeters: ");
	    double width = sc.nextDouble();   // Step width
	
	  System.out.print("Please state the step height in centimeters: ");
	    double height = sc.nextDouble();   // Step height
	
	  System.out.print("Please state the step length in centimeters: ");
	    double length = sc.nextDouble();
	
      System.out.println();
	  sc.nextLine();
	
	  double answer = ((width * height * length) * ((step * (step + 1)) / 2));
	  int answerRounded = (int) (Math.ceil(answer));

	  System.out.printf ( "The total volume of the staircase is: %.1f centimeters cubed.", answer);


      }else {System.out.println ("Authentication failed"); }
}
}
