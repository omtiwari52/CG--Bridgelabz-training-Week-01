import java.util.Scanner;
public class PalindromeChecker2 {
    
    //method to check if the given string is palindrome or not
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    //method to take input
    public static String input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        //close scanner
        input.close();
        return str;
    }

    //display results
    public static void display(boolean result) {
        if (result)
            System.out.println("The given string is a palindrome.");
        else
            System.out.println("The given string is not a palindrome.");
    }

    public static void main(String[] args) {
        String str = input();
        boolean result = isPalindrome(str);
        display(result);
    }
}
