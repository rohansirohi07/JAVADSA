import java.util.Scanner;

class algebra{
    int add(int a,int b){
        int ans =a+b;
        return ans;

    }
}
public class main {
public static void main(String[] args) {
    algebra obj= new algebra();
    Scanner sc= new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int addition =obj.add(x,y);
    System.out.println(addition);
}
    
}