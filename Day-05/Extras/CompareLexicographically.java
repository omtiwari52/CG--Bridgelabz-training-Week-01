public class CompareLexicographically {
    // Methods to compare two strings lexicographically without using built-in compare method    
    public static int compare(String a, String b) {
        int length = Math.min(a.length(), b.length());
        for (int i = 0; i < length; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return a.charAt(i) - b.charAt(i);
            }
        }
        return a.length() - b.length();
    }

    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        int result = compare(str1, str2);
        if (result < 0) {
            System.out.println(str1 + " comes before " + str2);
        } else if (result > 0) {
            System.out.println(str1 + " comes after " + str2);
        } else {
            System.out.println(str1 + " and " + str2 + " are equal");
        }
    }
}