 class algebra{
    int a;
    int b;

    algebra( int x, int y){
        a=x;
        b=y;
    }
    int add(){
        int ans =a+b;
        return ans;
     }
     int sub(){
        return a-b;

     }
     int mul(){
        return a*b;
     }
    }
public class constructor {
    public static void main(String[] args) {
        algebra obj= new algebra(2,5);
        System.out.println(obj.add());
        System.out.println(obj.mul());
        System.out.println(obj.sub());
    }
}
