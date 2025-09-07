class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // sort the end times in ascending order
        Arrays.sort( intervals,(a,b)->Integer.compare(a[1],b[1]));
        // initialize prev variable to end time of first interval
        int prev=intervals[0][1];
        // initialise the variable cnt to 0 to find number of merging intervals
        int cnt=0;
        //iterate over a loop (1to n)
        for(int i=1;i<intervals.length;i++)
        {

            // check if current interval start time is after previous interval end time,if true they are merging 
            if(prev>intervals[i][0])
            {
                cnt++;
            }
            //else they are not merging.
            else
            {
                prev=intervals[i][1];
            }
        }
        //return final count (ONlogn) time and space is O(1)
        return cnt;
    }
}
