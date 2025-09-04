import java.util.*;
public class jaggedarray {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number of Row");
		
		int r = sc.nextInt();
		int a[][] = new int[r][];
		
		for(int i=0; i<a.length; i++) {
			a[i] = new int[i];
		}
		
		System.out.println("Enter the vale in jagged array");
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("values of jagged array");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println("");

		}
	}
}