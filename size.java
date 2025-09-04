class array{
    void arraysize(){
        int arr []={1,2,3,4,5};
        System.out.println("Size of array:" +arr.length);
        // for( int i=0;i<3;i++){
        //     System.out.println(arr[i]);
        // }
        // for(int ages:arr){
        //     System.out.println(ages);
        // }
        int i=0;
        while(i<3){
            System.out.println(arr[i]);
            i++;
        }
    }
}
public class size {
    public static void main(String[] args) {
        array obj =new array();
        obj.arraysize();
    
    }
}

