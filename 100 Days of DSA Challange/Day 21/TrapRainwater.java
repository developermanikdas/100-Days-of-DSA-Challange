public class TrapRainwater {
    
    // Method 1: Using left and right max arrays (O(n) time, O(n) space)
    public static int trapRainwater(int[] height) {
        if (height == null || height.length <= 2) {
            return 0;
        }
        
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        
        // Fill leftMax array
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        
        // Fill rightMax array
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
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
    
    // Method 2: Two Pointer Approach (O(n) time, O(1) space) - More optimal
    public static int trapRainwaterOptimal(int[] height) {
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
    
    // Helper method to print the array visualization
    public static void printArray(int[] arr) {
        System.out.print("Heights: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    
    public static void main(String[] args) {
        // Test cases
        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] height2 = {4, 2, 0, 3, 2, 5};
        int[] height3 = {3, 0, 2, 0, 4};
        
        System.out.println("=== Trapping Rainwater Problem ===\n");
        
        // Test case 1
        System.out.println("Test Case 1:");
        printArray(height1);
        System.out.println("Water trapped (Method 1): " + trapRainwater(height1));
        System.out.println("Water trapped (Method 2): " + trapRainwaterOptimal(height1));
        System.out.println();
        
        // Test case 2
        System.out.println("Test Case 2:");
        printArray(height2);
        System.out.println("Water trapped (Method 1): " + trapRainwater(height2));
        System.out.println("Water trapped (Method 2): " + trapRainwaterOptimal(height2));
        System.out.println();
        
        // Test case 3
        System.out.println("Test Case 3:");
        printArray(height3);
        System.out.println("Water trapped (Method 1): " + trapRainwater(height3));
        System.out.println("Water trapped (Method 2): " + trapRainwaterOptimal(height3));
        System.out.println();
        
        // Edge cases
        System.out.println("=== Edge Cases ===");
        int[] empty = {};
        int[] single = {5};
        int[] two = {3, 2};
        
        System.out.println("Empty array: " + trapRainwater(empty));
        System.out.println("Single element: " + trapRainwater(single));
        System.out.println("Two elements: " + trapRainwater(two));
    }
}
