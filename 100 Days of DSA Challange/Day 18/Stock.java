public class Stock {
    
    // Method to find maximum profit from buying and selling stock once
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        
        int minPrice = prices[0];  // Track minimum price so far
        int maxProfit = 0;        // Track maximum profit so far
        
        for (int i = 1; i < prices.length; i++) {
            // Update minimum price if current price is lower
            minPrice = Math.min(minPrice, prices[i]);
            
            // Calculate profit if we sell at current price
            int currentProfit = prices[i] - minPrice;
            
            // Update maximum profit if current profit is higher
            maxProfit = Math.max(maxProfit, currentProfit);
        }
        
        return maxProfit;
    }
    
    // Alternative approach using dynamic programming (more explicit)
    public static int maxProfitDP(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        
        int n = prices.length;
        int[] buy = new int[n];   // Maximum profit when buying on day i
        int[] sell = new int[n];  // Maximum profit when selling on day i
        
        buy[0] = -prices[0];  // Buy on first day
        sell[0] = 0;          // Can't sell on first day
        
        for (int i = 1; i < n; i++) {
            buy[i] = Math.max(buy[i-1], -prices[i]);  // Either keep previous buy or buy today
            sell[i] = Math.max(sell[i-1], buy[i-1] + prices[i]);  // Either keep previous sell or sell today
        }
        
        return sell[n-1];
    }
    
    // Method to print array for testing
    public static void printArray(int[] arr) {
        System.out.print("Prices: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    
    public static void main(String[] args) {
        // Test cases
        int[] prices1 = {7, 1, 5, 3, 6, 4};  // Expected output: 5 (buy at 1, sell at 6)
        int[] prices2 = {7, 6, 4, 3, 1};     // Expected output: 0 (no profit possible)
        int[] prices3 = {1, 2, 3, 4, 5};     // Expected output: 4 (buy at 1, sell at 5)
        int[] prices4 = {2, 4, 1};           // Expected output: 2 (buy at 2, sell at 4)
        
        System.out.println("=== Best Time to Buy and Sell Stock ===\n");
        
        // Test case 1
        printArray(prices1);
        System.out.println("Maximum Profit (Approach 1): " + maxProfit(prices1));
        System.out.println("Maximum Profit (Approach 2): " + maxProfitDP(prices1));
        System.out.println();
        
        // Test case 2
        printArray(prices2);
        System.out.println("Maximum Profit (Approach 1): " + maxProfit(prices2));
        System.out.println("Maximum Profit (Approach 2): " + maxProfitDP(prices2));
        System.out.println();
        
        // Test case 3
        printArray(prices3);
        System.out.println("Maximum Profit (Approach 1): " + maxProfit(prices3));
        System.out.println("Maximum Profit (Approach 2): " + maxProfitDP(prices3));
        System.out.println();
        
        // Test case 4
        printArray(prices4);
        System.out.println("Maximum Profit (Approach 1): " + maxProfit(prices4));
        System.out.println("Maximum Profit (Approach 2): " + maxProfitDP(prices4));
        System.out.println();
        
        // Edge cases
        int[] emptyPrices = {};
        int[] singlePrice = {5};
        
        System.out.println("Edge case - Empty array: " + maxProfit(emptyPrices));
        System.out.println("Edge case - Single element: " + maxProfit(singlePrice));
    }
}
