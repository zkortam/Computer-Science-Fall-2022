	// Zakaria Kortam 
	// Professor Eisenberg 
	// 12/7/2022
	/*1. Ask user for input file name
	 * 2. Open up a file scanner 
	 * 3. Using a try/catch system check for Number Format and FileNotFound exceptions
	 * 4. take the data in one string and break it down using split. 
	 * 5. Make a new person using the data.
	 * 6. Open a printwriter and check for FileNotFoundException
	 * 7. output the student's averages and names in a new file 
	 * 8. File name chosen by student
	 */

	import java.io.*;
	import java.util.*;

	public class TestAveragesX{

	    public static void main(String[] args) {

	        String fileName = "inputfile.txt";
	        Scanner in = new Scanner(System.in);
	        System.out.print("Please enter your input-file name: ");
	        fileName = in.nextLine();
	        File inputFile = new File(fileName);
	        
	        System.out.print("Please enter your Output-file name: ");
	        String OutputFileName = in .nextLine();
	        File outputFile = new File(OutputFileName);
	        
	        int k=0;
	        Student [] studentList = new Student[30];
	        
	        try(Scanner read = new Scanner(inputFile); PrintWriter output = new PrintWriter(outputFile);){
				while (read.hasNextLine()) {

	                String line = read.nextLine();
	                String[] splitLine = line.split(":");
	                double [] dScores = new double[10];
	                
	                if (splitLine.length > 1) {
	                    double sum = 0.0;
	                    int n = 0;
	                    String[] scores = splitLine[1].split(",");
	                    splitLine[0] = splitLine[0].trim();
	                    for (int i = 0; i < scores.length; i++) {
	                        try {
	                            sum += Double.parseDouble(scores[i]);
	                            dScores[i] = Double.parseDouble(scores[i]);
	                            n++;
	                        } catch (NumberFormatException ex) {
	                            System.out.println("\nNot a number. Student: " + splitLine[0]);
	                            System.out.println(ex.getMessage());
	                        }
	                    }
	                    if (scores.length > 0) {
							studentList[k] = new Student(splitLine[0],dScores,n);
	                        output.print(studentList[k].toString());
	                    }	
	                } else if(splitLine[0].length() > 1) {
						 System.out.println("The following student has no scores: " + splitLine[0]);
					}
	                
	                k++;
	            }
			} catch (FileNotFoundException ex) {
	            System.out.printf("%s can not be found%n", fileName);
	            System.out.println(ex.getMessage());
	        }
		}
	}
	
	class Student {

	    public String name;
	    public double[] scores;
	    public double avg;
	    public int numberOfTests;

	    Student() {
	        name = " ";
	    }

	    Student(String name, double[] scores, int n) {
	        this.name = name;
	        this.scores = scores;
	        numberOfTests = n;
	    }

	    public double getAvg() {
	        double total = 0;
	        for (int i = 0; i < scores.length; i++) {
	            total += scores[i];
	        }
	        return total / scores.length;
	    }

	    public String toString() {

	        return String.format("%s : %.2f (%d tests)%n", name, getAvg(), numberOfTests);
	    }


	}
				
				
				
				
				
				
				
				
				
				
				
			
