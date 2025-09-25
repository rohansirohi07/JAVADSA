public class palindrom {
    public static void main(String[] args) {
    //     
    String str1="abcde";
    String str2="abcd";
    String str11=str1.substring(str1.length()-3,str1.length())+str1.substring(0,str1.length()-3);
    String str22=str2.substring(str2.length()-1)+ str2.substring(0,3);
    String result=str11+str22;
    System.out.println(result);
    StringBuilder sb=new StringBuilder(result);
     String st=sb.reverse().toString();
    if(st==result){
        System.out.println("palindrom");
    }
    else{
        System.out.println("not palindrom");
    }
    }
}