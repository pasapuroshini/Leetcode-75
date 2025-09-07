class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        
        for (int i = 0; i < len && n > 0; i++) {
            if (flowerbed[i] == 0) {
                // Check left and right neighbors
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == len - 1) || (flowerbed[i + 1] == 0);
                
                if (emptyLeft && emptyRight) {
                    // Place a flower
                    flowerbed[i] = 1;
                    n--; 
                }
            }
        }
        
        return n == 0;
      /*
      Complexity

Time: O(m) (where m = flowerbed.length) → Single pass.

Space: O(1) (in-place modification).
      */
      
    }
}
