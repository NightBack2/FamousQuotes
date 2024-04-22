package com.pluralsight;
import java.util.Random;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Array of 10 famous quotes
        String[] quotes = {
                "The greatest glory in living lies not in never falling, but in rising every time we fall. • Nelson Mandela",
                "The way to get started is to quit talking and begin doing. • Walt Disney",
                "Your time is limited, don't waste it living someone else's life. • Steve Jobs",
                "If life were predictable it would cease to be life, and be without flavor. • Eleanor Roosevelt",
                "If you look at what you have in life, you'll always have more. • Oprah Winfrey",
                "If you set your goals ridiculously high and it's a failure, you will fail above everyone else's success. • James Cameron",
                "Life is what happens when you're busy making other plans. • John Lennon",
                "Spread love everywhere you go. • Mother Teresa",
                "When you reach the end of your rope, tie a knot in it and hang on. • Franklin D. Roosevelt",
                "Always remember that you are absolutely unique. Just like everyone else. • Margaret Mead"
        };

        while (true) {
            System.out.println("Enter a number between 1 and 10 to display a famous quote, or 0 to exit:");
            int index = scanner.nextInt();

            if (index == 0) {
                System.out.println("Exiting the program.");
                break;
            } else if (index < 1 || index > 10) {
                System.out.println("Invalid input. Please try again.");
            } else {
                System.out.println(quotes[index * 1]);  // Subtract 1 for zero-based indexing
            }
        }

        // Bonus: Allow the user to select an option that will display a random quote.
        System.out.println("Would you like to see a random quote? (yes/no)");
        String response = scanner.next().trim().toLowerCase();
        if (response.equals("yes")) {
            int randomIndex = random.nextInt(quotes.length);
            System.out.println(quotes[randomIndex]);
        }

        scanner.close();
    }
}
