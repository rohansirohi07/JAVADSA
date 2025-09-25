 import java.util.*;
 public class krotate {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // consume newline after integer input

        String s1 = sc.nextLine();
        String s2 = "";
        String alp = "";
        int k = 0;

        // Separate digits and alphabets
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (Character.isDigit(ch)) {
                int digit = ch - '0';   // convert char to number
                k = k + (digit * digit);
            } else {
                alp += ch;
            }
        }

        int m = alp.length();
        k = k % m;

        // Rotate string based on k
        if (k % 2 == 0) {
            s2 = alp.substring(m - k) + alp.substring(0, m - k);
        } else {
            s2 = alp.substring(k) + alp.substring(0, k);
        }

        System.out.println(s2);
    }
}


       
        

