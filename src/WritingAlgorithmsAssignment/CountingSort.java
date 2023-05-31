package WritingAlgorithmsAssignment;

import java.util.Arrays;

public class CountingSort {
    public static String countSort(String arr) {
        char[] letterArray = arr.toCharArray(); //convert to character array
        Arrays.sort(letterArray); //sort in ascending order
        return new String(letterArray); //converted back to string and returned as an output
    }

    public static void main(String[] args) {
        String letters = "edsab";
        System.out.println(countSort(letters));

        String chaos = "geeksforgeeks";
        System.out.println(countSort(chaos));

    }
}
