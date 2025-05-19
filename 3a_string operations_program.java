//Develop a java program for performing various string operations with different string handling functions directed as follows: String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and startsWith() and endsWith()

public class StringOperationsDemo {
    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        String str3 = new String("Hello");

        System.out.println("1. String Creation:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);

        // 2. Length and Character Access
        System.out.println("\n2. Length and Character Access:");
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // 3. String Comparison
        System.out.println("\n3. String Comparison:");
        System.out.println("str1 equals str3: " + str1.equals(str3));
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

        // 4. String Searching
        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println("\n4. String Searching:");
        System.out.println("Index of 'quick': " + sentence.indexOf("quick"));
        System.out.println("Last index of 'the': " + sentence.lastIndexOf("the"));
        System.out.println("Contains 'fox'? " + sentence.contains("fox"));

        // 5. Substring Operations
        System.out.println("\n5. Substring Operations:");
        System.out.println("Substring (4 to 9): " + sentence.substring(4, 9));

        // 6. String Modification
        System.out.println("\n6. String Modification:");
        System.out.println("Replace 'fox' with 'cat': " + sentence.replace("fox", "cat"));
        System.out.println("To Upper Case: " + sentence.toUpperCase());
        System.out.println("To Lower Case: " + sentence.toLowerCase());

        // 7. Whitespace Handling
        String withSpaces = "   Trim this string   ";
        System.out.println("\n7. Whitespace Handling:");
        System.out.println("Before Trim: '" + withSpaces + "'");
        System.out.println("After Trim: '" + withSpaces.trim() + "'");

        // 8. String Concatenation
        System.out.println("\n8. String Concatenation:");
        System.out.println("Using + operator: " + str1 + " " + str2);
        System.out.println("Using concat(): " + str1.concat(" ").concat(str2));

        // 9. String Splitting
        System.out.println("\n9. String Splitting:");
        String csv = "apple,banana,grape,mango";
        String[] fruits = csv.split(",");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // 10. StringBuilder Demo
        System.out.println("\n10. StringBuilder Demo:");
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(6, 11, "Java");
        sb.delete(0, 1);
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        System.out.println("\n11. String Formatting:");
        String name = "Alice";
        int age = 30;
        double salary = 65432.78;
        System.out.println(String.format("Name: %s | Age: %d | Salary: %.2f", name, age, salary));

        // 12. Validate Email using contains(), startsWith() and endsWith()
        System.out.println("\n12. Email Validation:");
        String email = "user@example.com";
        boolean isValid = email.contains("@") && email.startsWith("user") && email.endsWith(".com");
        System.out.println("Email: " + email);
        System.out.println("Is valid? " + isValid);
    }
}
