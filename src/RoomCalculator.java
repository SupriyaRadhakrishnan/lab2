import java.util.Scanner;

public class RoomCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scnr = new Scanner(System.in);
     String continueCalculating = "";
     System.out.println("Welcome to Grand Circus’ Room Detail Generator!");
     do {
     System.out.println("Enter the Length of the room :");
     double length = scnr.nextDouble();
     System.out.println("Enter the Width of the room :");
     double width = scnr.nextDouble();
	 
     System.out.println("Area : "+ (length * width));
     System.out.println("Perimeter : "+ ((2*length) + (2*width)));
     
     System.out.println("Continue(y/n) :");
     continueCalculating = scnr.next();
     }while(continueCalculating.equalsIgnoreCase("y"));
     scnr.close();
     System.out.println("The Area and Permimeter is calculated");
	}

}
