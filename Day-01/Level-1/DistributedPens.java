public class DistributedPens{
      public static void main(String[] args){
                    //creating a int variable to store total number of pens
                    int totalPen = 14;

                   //creating a int variable to store the total number of students
                   int totalStudent = 3;

                   //creating a variable to calculate and store that how many pens each student will get
                   int penEachStudent = totalPen / totalStudent;

                   // creating a variable to calcualte and store that how many pens are not distributed
                   int notDistributed = totalPen - (penEachStudent*totalStudent);
                     
                   //printing the output
                   System.out.println("The Pen Per Student is "+ penEachStudent+ " and the remaining pen not distributed is "+ notDistributed);
       }
}
