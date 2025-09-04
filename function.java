// import java.util.Scanner;

// public class function { 
//     static void sum(){
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter the number");
//         int num1 =in.nextInt();
//         System.out.println("Enter the number ");
//         int num2=in.nextInt();
//         int sum =num1 +num2;
//         System.out.println("sum of the two number=" +sum);
//     }

//     public static void main(String[] args) {
//         sum();
//     } 
// }
// import java.util.Scanner;

// public class function { 
//     static int  sum(){
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter the number");
//         int num1 =in.nextInt();
//         System.out.println("Enter the number ");
//         int num2=in.nextInt();
//         int sum =num1 +num2;
//         return sum;
//     }

//     public static void main(String[] args) {
//         int ans = sum();
//         System.out.println("sum of the two  number ="+ans);
//     }
// }

public class function{
    static int sum(int a,int b){
        int sum3 = a+b;
        return sum3;
    }
    public static void main(String[] args) {
        int ans=  sum(20,30);
        System.out.println(ans);
    }
    
}
