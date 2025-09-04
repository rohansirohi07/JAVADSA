class add{
    void addexample(){

        int arr[]={1,3,5};
        int X=5;
        int ans=-1;
        for(int i=0;i<3;i++){
            //  add+= arr[i];
            if(arr[i]==X){
                ans=i;
        }
       }
     System.out.println( "found"+X +"at index of"+ans);

}
}

public class addarray {
    public static void main(String[] args) {
        add obj=new add();
        obj.addexample();
    }
}
