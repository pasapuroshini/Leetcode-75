import java.util.Arrays;

class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;

        // Sort balloons by their ending x-coordinate
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int arrows = 1;  // At least one arrow needed
        int arrowPos = points[0][1];  // Shoot arrow at the end of first balloon

        for (int i = 1; i < points.length; i++) {
            // If current balloon starts after arrow position, need a new arrow
            if (points[i][0] > arrowPos) {
                arrows++;
                arrowPos = points[i][1];  // Place arrow at the end of this balloon
            }
            // else, current balloon is already burst by arrow at arrowPos
        }

        return arrows;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(sol.findMinArrowShots(points)); // Output: 2
    }
}
