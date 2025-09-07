class Solution {
    public String mergeAlternately(String word1, String word2) {
        // Use StringBuilder for efficient string concatenation
        StringBuilder res = new StringBuilder();

        int i = 0;
        // Loop until both words are fully processed
        while (i < word1.length() || i < word2.length()) {

            // If word1 still has characters left, append the i-th char
            if (i < word1.length()) {
                res.append(word1.charAt(i));
            }

            // If word2 still has characters left, append the i-th char
            if (i < word2.length()) {
                res.append(word2.charAt(i));
            }

            i++; // move to next position
        }

        // Convert StringBuilder back to String
      /*Time Complexity

Let m = word1.length() and n = word2.length().

The loop runs until i < max(m, n).

Inside loop, appending characters = O(1) each.

Total operations = O(m + n).

✅ Time Complexity = O(m + n)

🗂 Space Complexity

StringBuilder stores the merged string of length m + n.

No extra data structures (apart from a few variables).

✅ Space Complexity = O(m + n) (for the output string).*/
        return res.toString();
    }
}
