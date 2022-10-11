import java.util.Scanner;

public class ChargeCompare {

	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
			int timelimit;
			double beforePrice;
			double afterPrice;
			double dynamics, elektra;
			int minutes = 0;
			minutes = getMinutes(in);
			if (minutes >= 0){
				
				dynamics = calculateCost(minutes, 15, 0.27, 0.30);
				elektra = calculateCost(minutes, 20, 0.25, 0.35);
				System.out.printf("%nThe cost for EV Dynamics is $%.2f",dynamics);
				System.out.printf("%nThe cost for ElektraCharge is $%.2f",elektra);
				if (elektra > dynamics){
				System.out.printf("%nEV Dynamics is cheaper.");
					} else if (elektra != dynamics) {
					System.out.printf("%nElektraCharge is cheaper");
					}
					
			} else System.out.print("You can not have negative minutes");
		
			
}

	public static int getMinutes(Scanner in){
			int minutes = 0;
			System.out.print("Enter the number of minutes that you ");
			System.out.print("would like to charge your viechle: ");
			minutes = in.nextInt();
		return minutes;
	}
	
	public static double calculateCost(int minutes, int timeLimit, double beforePrice, double afterPrice) {
		
			double answer = 0;
		
			if (minutes <= timeLimit) {
			answer = minutes * beforePrice;
			}
			if (minutes > timeLimit) {
			answer = (timeLimit * beforePrice) + ((minutes - timeLimit) * afterPrice);
			}
		return answer;
	}
}
