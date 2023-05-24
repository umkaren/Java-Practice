package DebuggingPracticeExercise;
public class Average {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; //adds numbers from the example

//      numbers = null; //setting up null. Null pointer exception occurs at line 22 and 7. Use debugger to step over and step into the main method. Went line by line and saw where null exception was indicated by line. It all came back to the numbers variable in this line here.
        double average = findAverage(numbers); //findAverage method is invoked and returns the average. This is then assigned to the average variable
        System.out.println("Average is: " + average);

//      int indexError = numbers[666]; //introducing Array Index Error
        //ArrayIndexOutOfBoundsException error occurs at line 10 due to length of the array being only 5 and index ending at 4.

//        System.out.println("Value at index 666 is " + indexError);
    }

    // Write a Java method that calculates the average of an array of integers.
    // This method should take an array of integers as input and return a double as output.

    //Test your method with an array containing the numbers 1, 2, 3, 4, 5. Your method should return 3.0.

    public static double findAverage(int[] numbers) { //takes an array of integers
        int sum = 0; //initialize sum so that each number in the array can be added to it during the loops
        for (int number : numbers) {
            sum += number; //for each number in the array, add it to sum
        }
        return (double) sum/ (numbers.length - 1 /*introducing logic error by taking away 1 from the length*/); //returns double quotient of the sum divided by how many numbers are in the array
    }
}
