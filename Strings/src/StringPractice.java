public class StringPractice {

    public static void main(String[] args) {
        // Basic string creation
        String str1 = "Hello, World!";
        String str2 = "Java Programming";
        String str3 = "   Trimmed String Example   ";
        String str4 = "hello, world!";
        String str5 = "";

        System.out.println("Initial Strings:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println("str4: " + str4);
        System.out.println("str5 (empty): \"" + str5 + "\"");
        System.out.println();

        // 1. String length
        System.out.println("String Lengths:");
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Length of str5 (empty): " + str5.length());
        System.out.println();

        // 2. String comparison
        System.out.println("String Comparisons:");
        System.out.println("str1 equals str4 : " + str1.equals(str4));
        System.out.println("str1 equals str4 : " + str1.equalsIgnoreCase(str4));
        System.out.println("str1 compareTo str4: " + str1.compareTo(str4));
        System.out.println();

        // 3. Substring extraction
        System.out.println("Substrings:");
        System.out.println("Substring of str1 : " + str1.substring(0, 5));
        System.out.println("Substring of str2 : " + str2.substring(5));
        System.out.println();

        // 4. String concatenation
        System.out.println("String Concatenation:");
        System.out.println("Concatenating str1 and str2: " + str1.concat(" ").concat(str2));
        System.out.println();

        // 5. Changing case
        System.out.println("Changing Case:");
        System.out.println("str1 to uppercase: " + str1.toUpperCase());
        System.out.println("str2 to lowercase: " + str2.toLowerCase());


        // 6. Trimming
        System.out.println("Trimming:");
        System.out.println("Original str3: \"" + str3 + "\"");
        System.out.println("Trimmed str3: \"" + str3.trim() + "\"");
        System.out.println();

        // 7. Character operations
        System.out.println("Character Operations:");
        System.out.println("Character at index 7 of str1: " + str1.charAt(7));
        System.out.println("Index of 'o' in str1: " + str1.indexOf('o'));
        System.out.println("Last index of 'o' in str1: " + str1.lastIndexOf('o'));
        System.out.println();

        // 8. Replacing characters and substrings
        System.out.println("Replacing Characters and Substrings:");
        System.out.println("Replace 'World' with 'Java' in str1: " + str1.replace("World", "Java"));
        System.out.println("Replace all 'a' with 'X' in str2: " + str2.replace('a', 'X'));
        System.out.println();

        // 9. Splitting strings
        System.out.println("Splitting Strings:");
        String[] words = str1.split(" ");
        System.out.println("Words in str1:");
        for (String word : words) {
            System.out.println("- " + word);
        }


        // 10. Checking empty or blank
        System.out.println("Checking Empty or Blank:");
        System.out.println("Is str5 empty? " + str5.isEmpty());
        System.out.println("Is str3 blank? " + str3.isBlank());
        System.out.println();

        // 11. String joining
        System.out.println("String Joining:");
        String joinedString = String.join(", ", "Apple", "Banana", "Cherry");
        System.out.println("Joined String: " + joinedString);
        System.out.println();

        // 12. Formatting strings
        System.out.println("Formatting Strings:");
        String formattedString = String.format("I have %d apples and %.2f dollars.", 5, 12.3456);
        System.out.println("Formatted String: " + formattedString);
        System.out.println();

        // 13. Checking startsWith and endsWith
        System.out.println("Checking Start and End:");
        System.out.println("Does str1 start with 'Hello'? " + str1.startsWith("Hello"));
        System.out.println("Does str2 end with 'ing'? " + str2.endsWith("ing"));
        System.out.println();

        // 14. StringBuilder
        System.out.println("StringBuilder:");
        StringBuilder sb = new StringBuilder("StringBuilder Example");
        sb.append(" - Appended Text");
        sb.insert(0, "Start: ");
        sb.replace(6, 18, "Modified");
        sb.delete(9, 18);
        System.out.println("StringBuilder result: " + sb.toString());
        System.out.println();

    }
}
