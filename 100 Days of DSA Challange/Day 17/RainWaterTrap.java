public class RainWaterTrap {
    
    // Method 1: Using extra space (O(n) space complexity)
    public static int trapWaterWithExtraSpace(int[] height) {
        if (height == null || height.length <= 2) {
            return 0;
        }
        
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        
        // Fill leftMax array - maximum height to the left of each element
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        
        // Fill rightMax array - maximum height to the right of each element
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        
        // Calculate trapped water
        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            if (waterLevel > height[i]) {
                totalWater += waterLevel - height[i];
            }
        }
        
        return totalWater;
    }
    
    // Method 2: Two Pointer Approach (O(1) space complexity)
    public static int trapWaterTwoPointer(int[] height) {
        if (height == null || height.length <= 2) {
            return 0;
        }
        
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int totalWater = 0;
        
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    totalWater += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    totalWater += rightMax - height[right];
                }
                right--;
            }
        }
        
        return totalWater;
    }
    
    // Method 3: Using Stack (O(n) space complexity)
    public static int trapWaterUsingStack(int[] height) {
        if (height == null || height.length <= 2) {
            return 0;
        }
        
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        int totalWater = 0;
        
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int top = stack.pop();
                
                if (stack.isEmpty()) {
                    break;
                }
                
                int distance = i - stack.peek() - 1;
                int boundedHeight = Math.min(height[i], height[stack.peek()]) - height[top];
                totalWater += distance * boundedHeight;
            }
            stack.push(i);
        }
        
        return totalWater;
    }
    
    public static void main(String[] args) {
        // Test cases
        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] height2 = {4, 2, 0, 3, 2, 5};
        int[] height3 = {3, 0, 2, 0, 4};
        
        System.out.println("Test Case 1: [0,1,0,2,1,0,1,3,2,1,2,1]");
        System.out.println("Method 1 (Extra Space): " + trapWaterWithExtraSpace(height1));
        System.out.println("Method 2 (Two Pointer): " + trapWaterTwoPointer(height1));
        System.out.println("Method 3 (Stack): " + trapWaterUsingStack(height1));
        System.out.println();
        
        System.out.println("Test Case 2: [4,2,0,3,2,5]");
        System.out.println("Method 1 (Extra Space): " + trapWaterWithExtraSpace(height2));
        System.out.println("Method 2 (Two Pointer): " + trapWaterTwoPointer(height2));
        System.out.println("Method 3 (Stack): " + trapWaterUsingStack(height2));
        System.out.println();
        
        System.out.println("Test Case 3: [3,0,2,0,4]");
        System.out.println("Method 1 (Extra Space): " + trapWaterWithExtraSpace(height3));
        System.out.println("Method 2 (Two Pointer): " + trapWaterTwoPointer(height3));
        System.out.println("Method 3 (Stack): " + trapWaterUsingStack(height3));
    }
}