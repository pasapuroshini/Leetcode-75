import java.util.Stack;

class StockSpanner {
    // Stack stores pairs: [price, span]
    private Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;  // Each price counts itself at least once
        
        // Pop all prices <= current price and accumulate their spans
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }
        
        // Push current price with its calculated span
        stack.push(new int[]{price, span});
        
        return span;
      

/*Each call to next(price) may:

Push one element onto the stack.

Pop some elements from the stack.

But notice:

Each price can be pushed once and popped once across the entire execution.

So if we make N calls to next(), there will be at most N pushes and N pops in total.

 This makes the amortized time per call O(1).
 Worst-case for a single call (if many pops happen) is O(N), but across all calls it balances out.

Time Complexity = O(1) amortized per next() call, O(N) total for N calls.

 Space Complexity

We use a stack that stores at most N elements (one for each call if prices are strictly decreasing).

Each element is a pair [price, span], which is constant space.

 Space Complexity = O(N).

 Final Answer

Time Complexity:

Amortized per query → O(1)

Worst-case for all queries → O(N)

Space Complexity: O(N)*/
    }
}
