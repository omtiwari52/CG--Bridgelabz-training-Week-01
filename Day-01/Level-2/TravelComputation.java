//Create TravelComputation Class to compute the Distance and Travel Time
import java.util.Scanner;
class TravelComputation {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        //Create a variable to take user input for name
		System.out.println("Enter Name: ");
        String name = input.nextLine();

        /*Create variables to take user input for fromCity, viaCity and toCity to indicate the city
        from city, via city and to city the person is travelling*/
		System.out.println("Enter From City: ");
        String fromCity = input.nextLine();
		System.out.println("Enter Via City: ");
		String viaCity = input.nextLine();
		System.out.println("Enter To City: ");
		String toCity = input.nextLine();

        /*Create a variable to take user input for distanceFromToVia to indicate the distance 
	    between the fromCity to viaCity*/
		System.out.println("Enter Distance From to Via: ");
        double distanceFromToVia = input.nextDouble();

		//Create a variable to take user input for hoursFromToVia taken
		System.out.println("Enter time in hours for FromToVia: ");
		int hoursFromToVia = input.nextInt();
		
		//Create a variable to take user input for minutesFromToVia taken
		System.out.println("Enter time in minutes for FromToVia: ");
		int minutesFromToVia = input.nextInt();
		
        /*Create a variable timeFromToVia to indicate the time taken to
        travel from fromCity to viaCity in minutes*/
        int timeFromToVia = (hoursFromToVia * 60) + minutesFromToVia;
		
        /*Create a variable distanceViaToFinalCity to indicate the distance
        between the viaCity to toCity*/
		System.out.println("Enter distance from via to final city: ");
        double distanceViaToFinalCity = input.nextDouble();

		//Create a variable to take user input for hoursViaToFinalCity taken
		System.out.println("Enter time in hours for via to final city: ");
		int hoursViaToFinalCity = input.nextInt();
		
		//Create a variable to take user input for minutesViaToFinalCity taken
		System.out.println("Enter time in minutes for via to final city: ");
		int minutesViaToFinalCity = input.nextInt();
		
        /*Create a variable timeViaToFinalCity to indicate the time taken to
        travel from viaCity to toCity in minutes*/
        int timeViaToFinalCity = (hoursViaToFinalCity * 60) + minutesViaToFinalCity;

        /*Create a variable totalDistance to indicate the total distance
        between the fromCity to toCity*/
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;

        /*Create a variable totalTime to indicate the total time taken to
        travel from fromCity to toCity in minutes*/
        int totalTime = timeFromToVia + timeViaToFinalCity;
		
		//Print the output of total distance an user travels fromCity to toCity and the total time taken for it
		System.out.print("The total distance an user travels fromCity to toCity is " + totalDistance + " and the total time taken for it is " + totalTime + " minutes.");
        
		//closing scanner
		input.close();
	}
}