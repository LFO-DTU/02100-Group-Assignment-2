import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner stdinScanner = new Scanner(System.in);
        System.out.print("Enter potential palindrome: ");
        String potentialPalindrome = stdinScanner.nextLine();
        stdinScanner.close();

        String lowerPotPal = potentialPalindrome.toLowerCase();
        String cleanedPotPal = "";
        for (int i = 0; i < potentialPalindrome.length(); i++) {
            if (Character.isAlphabetic(lowerPotPal.charAt(i))) {
                cleanedPotPal += lowerPotPal.charAt(i);
            }
        }

        for (int i = 0; i < (cleanedPotPal.length() / 2); i++) {
            if (cleanedPotPal.charAt(i) != cleanedPotPal.charAt(cleanedPotPal.length()-i-1)) {
                System.out.println("\"" + potentialPalindrome + "\" is not a palindrome.");
                return;
            }
        }

        System.out.println("\"" + potentialPalindrome + "\" is a palindrome!");
    }
}