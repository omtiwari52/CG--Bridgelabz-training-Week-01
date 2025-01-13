import java.util.Scanner;
public class FindNumberOfRound{

	public static int NumberOfRound(int firstSide,int secondSide,int thirdSide){
	
		//converting 5km to meters and storing that distance in a variable
		int distance = 5000;
		//perimeter of the triangle = sum of all sides
		int perimeter=firstSide+secondSide+thirdSide;
		return  distance/perimeter;
	}
	public static void main(String args[]){
		//creating the object of scanner class
		Scanner input= new Scanner(System.in);
		
		//take input from user for the sides of triangle
		System.out.println("Enter First side (in Cm): ");
		int firstSide=input.nextInt();
		
		System.out.println("Enter Second side (in Cm): ");
		int secondSide=input.nextInt();		
		
		System.out.println("Enter Third side (in Cm): ");
		int thirdSide=input.nextInt();
		
		//call method to count the number of rounds athlete will cover
		int round=NumberOfRound(firstSide,secondSide,thirdSide);
		
		System.out.println("The number of rounds required to complete 5 km distance : "+ round);
		
		//close the scanner
		input.close();
		
	}
}