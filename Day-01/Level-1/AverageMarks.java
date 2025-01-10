public class AverageMarks{
      public static void main(String[] args){
           //creating a int variable to store marks obtained in maths
             int mathsMarks = 94;
           //creating a int variable to store marks obtained in physics
             int physicsMarks = 95;
           //creating a int variable to store marks obtained in chemistry
             int chemistryMarks = 96;
           //creating a int variable to store total marks 
             int totalMarks = mathsMarks + physicsMarks+ chemistryMarks;
           //calculating the average marks of sam using formula (totalMarks / no. of subjects)
             int averageMarks =  totalMarks / 3;
             System.out.println("Sam’s average mark in PCM is "+ averageMarks);
       }
}
