class Solution {
    public String reverseVowels(String s) {
        // Convert to char array for in-place swapping
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Move left until a vowel is found
            while (left < right && !isVowel(arr[left])) {
                left++;
            }
            // Move right until a vowel is found
            while (left < right && !isVowel(arr[right])) {
                right--;
            }
            // Swap vowels
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
/*
Time: O(n) → Each character checked at most once.

Space: O(n) (for char array), can be O(1) if we work directly on mutable buffer.
*/
    }

    // Helper function to check if a character is a vowel
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
