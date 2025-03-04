import java.util.Scanner;

public class reverse_string {

    // Method 1: Using String built-in method
    public static boolean UsingString(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Method 2: Using StringBuilder built-in method
    public static boolean UsingStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }

    // Method 3: Using StringBuffer built-in method
    public static boolean UsingStringBuffer(String str) {
        StringBuffer sb = new StringBuffer(str);
        return str.equals(sb.reverse().toString());
    }

    // Method 4: Without using built-in methods
    public static boolean WithoutBuiltIn(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        String s = scanner.nextLine();

        // Using String built-in method
        System.out.println("Using String built-in method: " + UsingString(s));

        // Using StringBuilder built-in method
        System.out.println("Using StringBuilder built-in method: " + UsingStringBuilder(s));

        // Using StringBuffer built-in method
        System.out.println("Using StringBuffer built-in method: " + UsingStringBuffer(s));

        // Without using built-in methods
        System.out.println("Without using built-in methods: " + WithoutBuiltIn(s));

        scanner.close();
    }
}