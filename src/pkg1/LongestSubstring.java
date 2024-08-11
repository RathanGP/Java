package pkg1;

public class LongestSubstring {
    public static void main(String[] args) {
        // Example usage
        String input = "abcdabcdbb";
        System.out.println("Input String: " + input);
        System.out.println("Longest Substring without Repeating Characters: " + longestSubstring(input));
    }

    public static int longestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int start = 0;

        // Assuming ASCII characters (256 possible characters)
        int[] charIndex = new int[256];

        for (int i = 0; i < charIndex.length; i++) {
            charIndex[i] = -1;
        }

        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);
            int charCode = (int) currentChar;

            if (charIndex[charCode] != -1) {
                // If the character is already in the substring, update the start index
                start = Math.max(charIndex[charCode] + 1, start);
            }

            // Update the maximum length
            maxLength = Math.max(maxLength, end - start + 1);

            // Update the last index of the current character
            charIndex[charCode] = end;
        }

        return maxLength;
    }
}
