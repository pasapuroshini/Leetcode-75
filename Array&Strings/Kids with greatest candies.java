class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res= new ArrayList<>();
        int maxi=0;
        for(int a:candies)
        {
            maxi=Math.max(a,maxi);
        }
        for(int c:candies)
        {
            if(c+extraCandies>=maxi)
            {
                res.add(true);
            }
            else
            {
                res.add(false);
            }
 }
        return res;
      /*
      Complexity

Time:

Find max = O(n)

Iterate again = O(n)

Total = O(n)

Space:

Result list = O(n)*/
    }
}
