  import java.util.*;
 public class countinstances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read integers n and m
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine(); // consume newline

        // Read strings s1 and s2
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        // Loop through each character in s1
        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            int count = 0;

            // Compare with each character in s2
            for (int j = 0; j < s2.length(); j++) {
                if (ch1 == s2.charAt(j)) {
                    count++;
                }
            }

            System.out.print(count + " ");
        }
    }
}


