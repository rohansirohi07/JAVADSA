import java.util.*;
public class prime{
public static void main(String[]args)
{
int n,count=0;
System.out.println("Enter any number:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
count++;
}
}
if(count==2)
System.out.println("The given number is a prime number");
else
System.out.println("The given number is not prime");
}
}
