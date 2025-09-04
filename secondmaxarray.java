import java.util.Scanner;

public class secondmaxarray {
    static int findfirstmaxarray(int[] arr){
       
        int mx = Integer.MIN_VALUE;
        for( int i=0;i<arr.length; i++){
            if(arr[i]>mx){
                mx=arr[i];

            }
        }
        return mx;
        

    }
    static int findsecondmaxarray(int[] arr){
        int mx= findfirstmaxarray(arr);
        for( int i=0;i<arr.length; i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;


            }
        }
            int secondmax=findfirstmaxarray(arr);
          return secondmax;
    }
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter" +n + "element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findsecondmaxarray(arr));
    }
}
