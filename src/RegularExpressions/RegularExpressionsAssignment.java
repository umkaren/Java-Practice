package RegularExpressions;

public class RegularExpressionsAssignment {
    public static void main(String[] args) {
        // Test valid email address
        String email = "example@example.com";
        String notEmail = "klsajfds@gmail.c";
        System.out.println("Email is valid: " + isValidEmail(email));
        System.out.println("Email is valid: " + isValidEmail(notEmail));

        // Test valid phone number
        String phoneNumber = "(123) 456-7890";
        String notPhone = "123-29193-939";
        System.out.println("Phone number is valid: " + isValidPhoneNumber(phoneNumber));
        System.out.println("Phone number is valid: " + isValidPhoneNumber(notPhone));

        // Test valid date
        String date = "04/02/1994";
        String notDate = "032/393/2011";
        System.out.println("Date is valid: " + isValidDate(date));
        System.out.println("Date is valid: " + isValidDate(notDate));

        // Test valid URL
        String url = "http://www.example.com";
        String notUrl = "ww.neopets.com";
        System.out.println("URL is valid: " + isValidURL(url));
        System.out.println("URL is valid: " + isValidURL(notUrl));

        // Test valid credit card number
        String creditCardNumber = "1234-5678-9012-3456";
        String notCreditCard = "123456678";
        System.out.println("Credit card number is valid: " + isValidCreditCardNumber(creditCardNumber));
        System.out.println("Credit card number is valid: " + isValidCreditCardNumber(notCreditCard));

        // Test valid US zip code
        String zipCode = "12345-6789";
        String secondZip = "28012";
        System.out.println("Zip code is valid: " + isValidZipCode(zipCode));
        System.out.println("Zip code is valid: " + isValidZipCode(secondZip));

        // Test valid Java identifier
        String identifier = "stuff";
        String leadingDigit = "8ght";
        System.out.println("Java identifier is valid: " + isValidJavaIdentifier(identifier));
        System.out.println("Java identifier is valid: " + isValidJavaIdentifier(leadingDigit));


        // Test valid hexadecimal color code
        String colorCode = "#aabbcc";
        String notColor = "f3ablj";
        System.out.println("Hexadecimal color code is valid: " + isValidHexColorCode(colorCode));
        System.out.println("Hexadecimal color code is valid: " + isValidHexColorCode(notColor));

        // Test valid time in 24-hour format
        String time = "15:30";
        String notTime = "25:02";
        System.out.println("Time is valid: " + isValidTime(time));
        System.out.println("Time is valid: " + isValidTime(notTime));

    }

    public static boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return email.matches(regex);
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";
        return phoneNumber.matches(regex);
    }

    public static boolean isValidDate(String date) {
        String regex = "^(0[1-9]|1[0-2])/(0[1-9]|[12]\\d|3[01])/\\d{4}$";
        return date.matches(regex);
    }

    public static boolean isValidURL(String url) {
        String regex = "^(http|https)://[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\S*)$";
        return url.matches(regex);
    }

    public static boolean isValidCreditCardNumber(String creditCardNumber) {
        String regex = "^(\\d{4}[- ]?){3}\\d{4}$";
        return creditCardNumber.replaceAll("[- ]", "").matches(regex);
    }

    public static boolean isValidZipCode(String zipCode) {
        String regex = "^\\d{5}(-\\d{4})?$";
        return zipCode.matches(regex);
    }

    public static boolean isValidJavaIdentifier(String identifier) {
        String regex = "^(?!\\d)\\w+$";
        return identifier.matches(regex);
    }

    public static boolean isValidHexColorCode(String colorCode) {
        String regex = "^#([A-Fa-f0-9]{6})$";
        return colorCode.matches(regex);
    }

    public static boolean isValidTime(String time) {
        String regex = "^(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9])$";
        return time.matches(regex);
    }
}