public class perfectsquare {
    static int sqrt(int x){
        
        int start=0;
        int end=x;
        
        int ans=-1;
        // int fo=-1;


        while (start <= end) {
    int mid = start + (end - start) / 2;
    int val = mid * mid;

    if (x == val) {
        return mid;
    } else if (x > val) {
        // start = mid + 1;
        // ans = mid;
                end = mid - 1;

    } else {
        // end = mid - 1;
        start = mid + 1;
        ans = mid;
    }
}
 return ans;
    
    }
    
    
       public static void main(String[] args) {
        int x=24;
        
        System.out.println(sqrt(x));
       }


}


