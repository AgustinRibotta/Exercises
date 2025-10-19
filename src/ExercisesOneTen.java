public class ExercisesOneTen {
    // 1. Check if a number is prime
    // Write a program that determines whether a given number is prime or not.

    public static void isPrime (int num) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        System.out.println(num + (isPrime ? " Is prime" :" Is not prime"));
    }

    // 2. Reverse a string
    // Create a program that takes a string and displays its reversed version.
    public static void reversed(String str) {
        System.out.println("Original version: " + str);

        char[] chars = str.toCharArray();
        System.out.print("Reversed version: ");
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }

    // 3. Calculate factorial (recursive and functional)
    // Implement the factorial of a number in two ways:
    // using recursion and using functional programming (Streams).

    // 4. Count vowels in a string
    // Given a text, count how many vowels it contains (uppercase and lowercase).

    // 5. Sort a list of names (functional programming)
    // Create a list of names and sort it alphabetically using Streams and lambdas.

    // 6. Check if a phrase is a palindrome
    // Verify whether a given string is a palindrome, ignoring spaces and case sensitivity.

    // 7. Classic FizzBuzz
    // Display numbers from 1 to 50, replacing multiples of 3 with "Fizz",
    // multiples of 5 with "Buzz", and multiples of both with "FizzBuzz".

    // 8. Filter and map a list of objects (functional programming)
    // Create a list of people with name and age, and display only the names
    // in uppercase for those who are adults (18 or older).

    // 9. Measure execution time of a code block
    // Calculate how long it takes for a block of code to execute,
    // such as summing one million numbers.

    // 10. Generate, sort, and average a random list (functional programming)
    // Generate a list of random numbers, print them in sorted order,
    // and calculate their average using Streams.

}
