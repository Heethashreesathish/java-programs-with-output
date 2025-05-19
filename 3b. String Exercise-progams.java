//Write a Java Program for Checking if a given string is null or contains only whitespace using user defined function isNullOrEmpty().
public class StringNullOrEmptyCheck {
    public static void main(String[] args) {
        String input = "   "; // Try changing this to null, "", or actual text
        System.out.println("Is null or empty? " + isNullOrEmpty(input));
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}
//Write a Java Program for Counting how many times a substring appears in a main string using user defined function countOccurrences()
public class SubstringCounter {
    public static void main(String[] args) {
        String mainStr = "banana";
        String subStr = "an";
        System.out.println("Occurrences: " + countOccurrences(mainStr, subStr));
    }

    public static int countOccurrences(String mainStr, String subStr) {
        if (mainStr == null || subStr == null || subStr.isEmpty()) return 0;

        int count = 0;
        int index = 0;
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }
        return count;
    }
}
//Write a Java Program for Reversing the characters in a string using user defined function reverseString().
public class StringReverser {
    public static void main(String[] args) {
        String input = "Hello World!";
        System.out.println("Reversed: " + reverseString(input));
    }

    public static String reverseString(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }
}
//Write a Java Program for Checking if a string reads the same backward as forward (ignoring case and punctuation) using user defined function isPalindrome():
public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama";
        System.out.println("Is palindrome? " + isPalindrome(input));
    }

    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}
//Write a Java Program for Eliminating all whitespace characters from a string using user defined function removeWhitespace()
public class WhitespaceRemover {
    public static void main(String[] args) {
        String input = "  This string \t has \n spaces  ";
        System.out.println("Original: '" + input + "'");
        System.out.println("Without whitespace: '" + removeWhitespace(input) + "'");
    }

    public static String removeWhitespace(String str) {
        if (str == null) return null;
        return str.replaceAll("\\s+", "");
    }
}
//Write a Java Program for Capitalizing the first letter of each word. using user defined function capitalizeWords()
public class CapitalizeWords {
    public static void main(String[] args) {
        String input = "hello world from java";
        System.out.println("Capitalized: " + capitalizeWords(input));
    }

    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) return str;

        String[] words = str.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase()).append(" ");
            }
        }

        return result.toString().trim();
    }
}
//Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user defined function truncate()
public class TruncateString {
    public static void main(String[] args) {
        String input = "This is a long sentence that needs truncating.";
        System.out.println(truncate(input, 20));
    }

    public static String truncate(String str, int length) {
        if (str == null || length < 0) return "";
        return str.length() <= length ? str : str.substring(0, length) + "...";
    }
}
//Write a Java Program for Verifying if a string contains only numeric characters using user defined function isNumeric()
public class NumericCheck {
    public static void main(String[] args) {
        String input = "123456";
        System.out.println("Is numeric? " + isNumeric(input));
    }

    public static boolean isNumeric(String str) {
        return str != null && str.matches("\\d+");
    }
}
// Write a Java Program for Creating a random string of a specified length using user defined function generateRandomString()
import java.util.Random;

public class RandomStringGenerator {
    public static void main(String[] args) {
        System.out.println("Random String: " + generateRandomString(10));
    }

    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(rand.nextInt(chars.length())));
        }

        return sb.toString();
    }
}
//Write a Java Program for Counting the number of words in a string using user defined function countWords()
public class WordCounter {
    public static void main(String[] args) {
        String input = "This is a sentence with several words.";
        System.out.println("Word count: " + countWords(input));
    }

    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}
