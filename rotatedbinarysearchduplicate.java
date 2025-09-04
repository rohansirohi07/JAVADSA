public class rotatedbinarysearchduplicate {
   
    static int Roatedbinarysearchdublicate(int[] a,int target){
        int n=a.length-1;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==target){
                return mid;

            } else if(a[start]==a[mid]&& a[end]==a[mid]){
                start++;
                end--;
            }
            else if(a[mid]<=a[end]){
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
        int[] a={1,1,1,1,1,1,2,2,3,1};
        int target=2;
        System.out.println(Roatedbinarysearchdublicate(a, target));

    }
}


