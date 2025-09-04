public class roatedsearch {
    static int Roatedbinarysearch(int[] a,int target){
        int n=a.length-1;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==target){
                return mid;
            }else if(a[mid]<a[end]){
                if(target>=a[mid]&& target<a[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if(a[start]<=target && target<a[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] a={3,4,5,1,2};
        int target=4;
        System.out.println(Roatedbinarysearch(a, target));

    }
}
