
package TestB;

public class TestB_Q1 {
    public class StringReverser {
        public static void main(String[] args) {
            String input = "retlaohS"; // Example input
            String output = reverseString(input);
            System.out.println(output); // Output: Shoalter
        }
    
        public static String reverseString(String str) {
            char[] characters = str.toCharArray();
            int left = 0;
            int right = characters.length - 1;
            while (left < right) {
                // Swap characters
                char temp = characters[left];
                characters[left] = characters[right];
                characters[right] = temp;
                // Move towards the middle
                left++;
                right--;
            }
            return new String(characters);
        }
    }
    
}