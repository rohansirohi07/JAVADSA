 import java.util.*;
public class swap2darray {
    


    public static void main (String[] args) throws java.lang.Exception {
        int[][] arr = {
            {24, 29, 12, 23},
            {25, 36, 18, 17},
            {31, 22, 43, 67}
        };

        int n = 3;
        int m = 4;

        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < m-1; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i+1][j+1];
                arr[i+1][j+1] = temp;
            }
        }

        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}


