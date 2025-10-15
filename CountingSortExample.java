public class CountingSortExample {

    // Function to perform counting sort
    public static void countingSort(int[] arr) {
        if (arr.length == 0) return;

        // Step 1: Find the maximum and minimum elements
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        // Step 2: Create a count array (size = range of elements)
        int range = max - min + 1;
        int[] count = new int[range];

        // Step 3: Store the count of each element
        for (int num : arr) {
            count[num - min]++;
        }

        // Step 4: Modify count array to store cumulative sum
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Step 5: Build the output (sorted) array
        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        // Step 6: Copy sorted elements back to original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    // Main function to test
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        System.out.println("Before Sorting:");
        for (int num : arr) System.out.print(num + " ");

        countingSort(arr); // function call

        System.out.println("\nAfter Counting Sort:");
        for (int num : arr) System.out.print(num + " ");
    }
}
