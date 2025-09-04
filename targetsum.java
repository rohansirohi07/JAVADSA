
public class targetsum {//  class target{
    void add(){
    int arr[]={1,4,5,6,3};
    int n=arr.length;
    int target=12;
    int ans =0;
    for(int i=0;i<n;i++){
        for(int j=i+1; j<n;j++){
            for (int k=j+1;k<n;k++){
            if(arr[i]+arr[j] +arr[k]==target){
                ans++;
            }
        }
    }
}
     System.out.println(ans);
 }

    
// public class targetsum {
    public static void main(String[] args) {
        targetsum sum=new targetsum();
        sum.add();

        
    }
}
