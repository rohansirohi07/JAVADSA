public class transformingstring {
    public static void main(String[] args) {
        String str = "abc12AD34@##123";
        StringBuilder sb = new StringBuilder(str);

        String st = sb.toString().toLowerCase();
        System.out.println(st);

        String str3 = "";
        String str4 = "";

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                str3 = str3 + ch;
            } else {
                str4 = str4 + ch;
            }
        }

        System.out.println(str3 + str4);
        
        
    }
}