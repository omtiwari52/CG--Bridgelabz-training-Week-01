public class VolumeOfEarth{
      public static void main(String[] args){
               
              // creating a int variable earthRadius to store the radius of earth 
                int earthRadiusInKilometers = 6378;

             // calculating volume of earch in Km^3 and storing it in double variable
              double volumeInCubicKilometers = (4 * 3.14 * earthRadiusInKilometers*earthRadiusInKilometers*earthRadiusInKilometers) /3;
                
              double kilometerToMiles = 0.621371 ;

             // creating a double variable to store volume to earth in miles
                double volumeInCubicMiles =  volumeInCubicKilometers * Math.pow(kilometerToMiles,3) ;

             //printing the volume
                System.out.println("The volume of earth in cubic kilometers is " + volumeInCubicKilometers + " and cubic miles is " + volumeInCubicMiles);
      }
}