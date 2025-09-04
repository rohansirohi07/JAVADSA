public class occrance {
    
    static int recBinarysearch(int[]arr,int target){
        int n=arr.length;
        int start=0;
        int end=n-1;
        int fo=-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                fo=mid;
                end=mid-1;
              

            }else if(arr[mid]>target){
                end=mid-1;

            }   
              else{
                start=mid+1;
             }
            }
             return fo;
     }
     
        
    
    
       public static void main(String[] args) {
        int [] arr={2,5,5,5,6,6,7,8,9};
        
        int target=5;
       System.out.println(recBinarysearch(arr, target));

       }


}
