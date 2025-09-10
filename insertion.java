public class insertion {
    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void sort(int[] arr){
        for (int j = 1; j < arr.length; j++) {  // start from 1
            int temp = arr[j];
            int i = j - 1;
            while (i >= 0 && temp < arr[i]) {   // check till 0
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = temp;   // correct placement
        }
    }

    public static void main(String[] args) {
        int[] arr = {11, 10, 2, 6, 1, 3};
        sort(arr);
        printarray(arr);
    }
}
