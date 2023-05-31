package WritingAlgorithmsAssignment;

public class BubbleSort {
    public static void bubbleSorting(int[] arr, int n) {
        int i, j, hold;
        boolean swapped; //keeps track if swapping occurs
        for (i = 0; i < n - 1; i++) {
            swapped = false; //sets to false at the beginning since we're assuming no swaps have been made at the beginning of the current pass
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) { //compares adjacent elements

                    hold = arr[j]; //hold serves as an intermediary location to hold the value of one element during the swapping process
                    arr[j] = arr[j + 1]; //since arr[j] is bigger, we set its value to the adjacent element to hold the smaller value
                    arr[j + 1] = hold; //the rightside element than gets the value of the bigger element from hold
                    swapped = true; //if swapping occurs, boolean is set to true
                }
            }
            if (swapped == false) //if no swapping occurs, break out of loop
                break;
        }
    }
    public static void main(String[] args) {
        int[] array1 = {4, 1, 3, 9, 7}; //assign values to array
        int N = 5; //sets size of the array
        bubbleSorting(array1, N);
        System.out.println("Sorted array: ");
        for (int i = 0; i < N; i++) {
            System.out.println(array1[i] + " ");
        }
        System.out.println();

        int [] array2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int n = 10;
        bubbleSorting(array2, n);
        System.out.println("Sorted array: ");
        for (int j = 0; j < n; j++) {
            System.out.println(array2[j] + " ");
        }
        System.out.println();
    }
}
