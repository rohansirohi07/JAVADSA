public class functionstring {
    public static void main(String[] args) {
        String intro= mygreet("Roahn sirohi");
        System.out.println(intro);
        
    }
    static String mygreet( String name){
        String msg="Hello " + name ;
        return msg;
    }
}
