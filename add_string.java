// adding to string number 

    import java.util.*;

public class add_string {
    public static void main(String[] args) {

        String a = "12340000";
        String b = "1234";
        int i = a.length() - 1;
        int j = b.length() - 1;
        int d1, d2, c = 0, s, in;
        StringBuilder sum = new StringBuilder();
        while (i >= 0 || j >= 0 || c != 0) {
            d1 = i >= 0 ? a.charAt(i) - '0' : 0;
            d2 = j >= 0 ? b.charAt(j) - '0' : 0;
            in = d1 + d2 + c;
            c = in / 10;
            sum.append(in % 10);
            i--;
            j--;
        }
        System.out.println(sum.reverse());
    }
}
output:

12341234