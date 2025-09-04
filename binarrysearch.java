public class binarrysearch {
     static int  Binarysearch(int[] arr, int target){ 
        int n=arr.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;

            }else if(arr[mid]>target){
                end=mid-1;

            }   
              else{
                start=mid+1;
             }
            }
             return -1;
     }
     
    // static boolean recBinarysearch(int[]arr, int start,int end,int target){
    //     if(start>=end) return false;
    //     int mid=(start+end)/2;
    //     if(arr[mid]==target){
    //         return true;
    //     }else if(arr[mid]>target){
    //         return recBinarysearch(arr, start, mid-1, target);

    //     }else{
    //         return recBinarysearch(arr, mid+1, end, target);
    //     }
    
    // }
       public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        int target=4;
       System.out.println(Binarysearch(arr, target));

       }
}

