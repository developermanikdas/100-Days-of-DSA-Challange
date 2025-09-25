import java.util.*;

public class ContainsDuplicate {
    
    /**
     * Given an integer array nums, return true if any value appears at least twice 
     * in the array, and return false if every element is distinct.
     * 
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * 
     * @param nums array of integers
     * @return true if duplicates exist, false otherwise
     */
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        
        return false;
    }
    
    /**
     * Alternative solution using HashSet size comparison
     * 
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public boolean containsDuplicateV2(int[] nums) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        for (int num : nums) {
            uniqueElements.add(num);
        }
        return nums.length != uniqueElements.size();
    }
    
    /**
     * Solution using sorting
     * 
     * Time Complexity: O(n log n)
     * Space Complexity: O(1)
     */
    public boolean containsDuplicateV3(int[] nums) {
        Arrays.sort(nums);
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                return true;
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();
        
        // Test case 1: Array with duplicates
        int[] test1 = {1, 2, 3, 1};
        System.out.println("Test 1: " + Arrays.toString(test1));
        System.out.println("Result: " + solution.containsDuplicate(test1)); // Expected: true
        System.out.println();
        
        // Test case 2: Array without duplicates
        int[] test2 = {1, 2, 3, 4};
        System.out.println("Test 2: " + Arrays.toString(test2));
        System.out.println("Result: " + solution.containsDuplicate(test2)); // Expected: false
        System.out.println();
        
        // Test case 3: Array with multiple duplicates
        int[] test3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Test 3: " + Arrays.toString(test3));
        System.out.println("Result: " + solution.containsDuplicate(test3)); // Expected: true
        System.out.println();
        
        // Test case 4: Empty array
        int[] test4 = {};
        System.out.println("Test 4: " + Arrays.toString(test4));
        System.out.println("Result: " + solution.containsDuplicate(test4)); // Expected: false
        System.out.println();
        
        // Test case 5: Single element
        int[] test5 = {1};
        System.out.println("Test 5: " + Arrays.toString(test5));
        System.out.println("Result: " + solution.containsDuplicate(test5)); // Expected: false
    }
}