public class rotatedbinary {
    static int Binaryroated(int[]arr){
        int start=0;
        int n=arr.length;
        int end=n-1;
        int ans=-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]<=arr[n-1]){
                ans=mid;
                end=mid-1;
                // start=mid+1;
            }else{
                
                 start=mid+1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int [] arr={10,11,12,13,1,2,3,4,5,6,8,9};
        System.out.println(Binaryroated(arr));
     }
}
