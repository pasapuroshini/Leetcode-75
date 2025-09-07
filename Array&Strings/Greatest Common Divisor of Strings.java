class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Step 1: Check if concatenation rule holds
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Step 2: Find GCD of lengths
        int gcdLen = gcd(str1.length(), str2.length());

        // Step 3: Return prefix of that gcd length
        return str1.substring(0, gcdLen);
    }

    // Euclidean algorithm for GCD
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
      /*
      Concatenation check: O(m+n)

GCD calculation: O(log(min(m,n)))

Substring: O(g) (where g = gcd length)

Overall Time = O(m+n)
 Space = O(1) (ignoring output string).
      */
    }
}
