import java.util.Scanner;

public class Copy2DArrayTo1DArray {
    public static void main(String[] args) {
	
		//creating instance of scanner class
        Scanner input = new Scanner(System.in);

        // Taking input for rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();

        // Create a 2D array
        int[][] matrix = new int[rows][cols];

        // Taking user input for the matrix's values
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        // Create a 1D array to store elements
        int[] array = new int[rows * cols];
        int index = 0;

        // Copy elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Display the 1D array
        System.out.println("1D Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

		//closing scanner
        input.close();
    }
}
