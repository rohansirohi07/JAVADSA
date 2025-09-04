import java.util.Scanner;

public class linear {
//     static int linearsearch(int[] arr, int target){
       
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==target){
//             return i;
//            }
//        }
//        return -1;

//     }


   
    static int linearSearchRecursive(int[] arr, int target, int i) {
       
        if (i > arr.length) {
            return -1; 
        }

        
        if (arr[i] == target) {
            return i; 
        }

        
        return linearSearchRecursive(arr, target, i + 1);
    }

   public static void main(String[] args) {
    int target=4;
    // int index =5;
     Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter" +n + "element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(linearSearchRecursive(arr,target ,0));

   }

}

