public class test {
    public static void main(String[] args) {
        try{
            String str ="dhvuvdvfjavua";
            int a =Integer.parseInt(str);
            System.out.println(a);
        }
        catch (NumberFormatException e){
            System.out.println("Number is not found ");
        }
    }
}
