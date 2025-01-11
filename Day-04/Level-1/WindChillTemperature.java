import java.util.*;
public class WindChillTemperature{
	
	//create a method
	public static double calculateWindChill(double temperature, double windspeed){
	
		double windChill=35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow(windspeed,0.16);
		return windChill;
	}
	public static void main(String args[]){
	
		//creating the instance of scanner class
		Scanner input= new Scanner(System.in);
		
		//taking the input from user
		System.out.println("Enter the temperature ");
		double temp=input.nextInt();
		
		System.out.println("Enter the wind speed ");
		double windSpeed=input.nextInt();
		
		//create a method to find wind chill and store the output in wind chill variable
		double windChill=calculateWindChill(temp,windSpeed);
		
		System.out.println("The wind chill is " + windChill);
		
		//close scanner
		input.close();
	}
}