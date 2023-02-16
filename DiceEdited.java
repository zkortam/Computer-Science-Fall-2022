//Name: Mazen Kharroubi
//Date: December 2, 2022
/*
 * Asks the user how many times they wish to toss a pair of dice, from 1-999.
 * 
 * Simulates randomly tossing a pair of dice as many times as the user requested,
 * creating a 6 x 6 array showing how often each combination of dice was rolled.
 * 
 * Calculates the frequencies for each total of dice.
 */
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class DiceEdited {
    
    public static int getNRolls(Scanner input) {
        int result = 0;
        do {
            System.out.print("How many times do you want to roll the dice (1-999)? ");
            result = input.nextInt();
            if (result < 1 || result > 999) {
				System.out.println("Invalid number.");
            }
        } while (result < 1 || result > 999);
        return result;
    }
    
    public static int[][] rollDice(int nRolls) {
        int[][] rolls = new int[6][6];
        Random random = new Random();
        for (int i = 0; i < nRolls; i++) {
			int x = random.nextInt(6);
			int y = random.nextInt(6);
			rolls[x][y] += 1;
		}
        return rolls;
    }
    
    public static void printRolls(int[][] rolls) {
		System.out.println("Frequencies for individual dice");
		System.out.print("   ");
		for (int i = 0; i < rolls.length; i++) {
			System.out.printf("%3d ",(i + 1) );
		}
		System.out.println();
		System.out.println("   -----------------------");
        for (int i = 0; i < rolls.length; i++) {
			System.out.print((i + 1) + "| ");
			for (int j = 0; j < rolls[i].length; j++) {
				System.out.printf("%3d ", rolls[i][j]);
			}
			System.out.println();
		}
		System.out.println();
    }
    
    public static int[] calcFrequencies(int[][] rolls) {
		int[] totals = new int[11];
		for (int i = 0; i < rolls.length; i++) {
			for (int j = 0; j < rolls[i].length; j++) {
                totals[i + j] += rolls[i][j];
			}
		}
        return totals;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nRolls = getNRolls(input);
        int[][] rolls = rollDice(nRolls);
        printRolls(rolls);
        int[] totals = calcFrequencies(rolls);
        System.out.println("Frequencies of totals");
        for (int i = 0; i < totals.length; i++) {
			System.out.println((i + 2) + ": " + totals[i]);
		}
		input.close();
    }
}
