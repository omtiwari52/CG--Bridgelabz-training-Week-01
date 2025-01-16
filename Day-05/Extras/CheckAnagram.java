import java.util.Scanner;
public class CheckAnagram {
    // method to check the string are anagrams or not
    public static boolean checkAnagram(String string1, String string2) {
        //we will create the array to store frequency of each character of string1
        int arr[] = new int[26];
        for (int i = 0; i < string1.length(); i++) {
            arr[string1.charAt(i) - 'a']++;
        }
        //we will match the frequency stored in array with string2
        Boolean anagram = true;
        for (int i = 0; i < string2.length(); i++) {
            if (arr[string2.charAt(i) - 'a'] > 0) {
                arr[string2.charAt(i) - 'a']--;
            } else {
                anagram = false;
                break;
            }
        }
        if (anagram == true) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    anagram = false;
                }
            }
        }
        return anagram;
    }

    public static void main(String[] args) {
        // creating the instance of scanner class
        Scanner input = new Scanner(System.in);
        // taking input from user
        System.out.println("Enter First string : ");
        String string1 = input.next();
        System.out.println("Enter Second string : ");
        String string2 = input.next();
        boolean anagram = checkAnagram(string1, string2);
        if (anagram) {
            System.out.println("yes, the given two strings are anagram ");
        } else {
            System.out.println("No,the given two strings are not anagram ");
        }
        //closing the input stream
        input.close();
    }
}
