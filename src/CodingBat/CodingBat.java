package CodingBat;

public class CodingBat {
    public static void main(String[] args) {
        //create an instance of CodingBat class
        CodingBat exercises = new CodingBat();

        //testing
        boolean doWeSleepIn = exercises.sleepIn(true, false);
        System.out.println("Do we sleep in? " + doWeSleepIn);

        boolean areWeInTrouble = exercises.monkeyTrouble(true, true);
        System.out.println("Are we in trouble? " + areWeInTrouble);

        double doubleSum = exercises.sumDouble(10, 10);
        System.out.println(doubleSum);

        double twentyOne = exercises.diff21(200);
        System.out.println(twentyOne);

        boolean pT = exercises.parrotTrouble(true, 19);
        System.out.println("Are we in trouble? " + pT);

        boolean ten = exercises.makes10(5, 6);
        System.out.println(ten);

        boolean withinRange = exercises.nearHundred(111);
        System.out.println(withinRange);

        boolean positiveAndNegative = exercises.posNeg(-200, 300, false);
        System.out.println(positiveAndNegative);
    }

    // The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
    // We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    public boolean sleepIn(boolean weekday, boolean vacation) {
        //if it's not a weekday or if it's vacation
        if (!weekday || vacation) {
            return true;  // return true
        } else {
            return false; //if the above conditions aren't met (is weekday or not on vacation), return false
        }
    }

    // We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
    // We are in trouble if they are both smiling or if neither of them is smiling.
    // Return true if we are in trouble.
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        //if both monkeys are smiling or if both monkeys are not smiling, we're returning true
        if (aSmile && bSmile || !aSmile && !bSmile) { //! serves at the logical NOT operator
            return true;
        } else {
            return false; //if neither of the above conditions are met, we're returning false
        }
    }

    // Given two int values, return their sum. Unless the two values are the same, then return double their sum.
    public int sumDouble(int a, int b) {
        if ( a == b) { //if a and b are equivalent
            return (a + b) * 2; //return the sum of a and b x2
        } else {
            return a + b; // if they're not equivalent, return the sum
        }
    }

    // Given an int n, return the absolute difference between n and 21,
    // except return double the absolute difference if n is over 21.
    public int diff21(int n) {
        // n is greater than 21
        if (n > 21) {
            return (n - 21) * 2; //then return the difference between n and 21 and double it
        } else {
            return 21 - n; //otherwise, subtract n from 21
        }
    }

    // We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
    // We are in trouble if the parrot is talking and the hour is before 7 or after 20.
    // Return true if we are in trouble.
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && hour < 7 ||  talking && hour > 20) { // if the parrot is talking and the hours are either less than  7 or more than 20
            return true; //return true
        } else {
            return false; //if the above conditions aren't met, return false
        }
    }

    // Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || (a + b) == 10) { //if a = 10 OR b = 10 OR a+b = 10, return true. || denotes OR
            return true;
        } else {
            return false; //if none of the above match, return false
        }
    }

    // Given an int n, return true if it is within 10 of 100 or 200.
    // Note: Math.abs(num) computes the absolute value of a number.
    public boolean nearHundred(int n) {
        //math.abs returns the absolute value, so we must use that for the subtraction portion to check if the difference is within 10.
        if (Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10) { //if Math.abs isn't used, then int like 111 or 211 would return true even though they're not within 10
            return true;
        } else {
            return false; //if the difference isn't within 10 of either 100 or 200, we return false
        }
    }

    // Given 2 int values, return true if one is negative and one is positive.
    // Except if the parameter "negative" is true, then return true only if both are negative.
    public boolean posNeg(int a, int b, boolean negative) {
        //if the ints are the opposite sign and the boolean is false, return true. if boolean is true. both ints need to be negative.
        if ((a < 0 && b > 0 && !negative) || (a > 0 && b < 0 && !negative) || (a < 0 && b < 0 && negative)) { //!negative means negative is false. "negative" means negative is true
            return true;
        } else {
            return false;
        }
    }

}
