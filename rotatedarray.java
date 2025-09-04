import java.util.Arrays;

public class rotatedarray {
    static int  [] array(int[] arr, int k){
        int n=arr.length;
         int[] ans=new int[n];
         int j=0;
         k=k%n;
         for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
         }
         for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
         }
         return ans;

    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(array(arr, 1)));


    }
}
