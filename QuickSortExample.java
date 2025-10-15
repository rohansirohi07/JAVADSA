import java.util.Scanner;

public class QuickSortExample {

    // Function to partition the array
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // choosing the last element as pivot
        int i = low - 1; // index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place the pivot element at the correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Recursive QuickSort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array input from user
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nBefore Sorting:");
        for (int num : arr)
            System.out.print(num + " ");

        // Call quick sort function
        quickSort(arr, 0, n - 1);

        System.out.println("\nAfter Quick Sort:");
        for (int num : arr)
            System.out.print(num + " ");

        sc.close();
    }
}
