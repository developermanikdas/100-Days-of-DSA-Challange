/**
 * FAANG Interview Question: Longest Substring Without Repeating Characters
 * 
 * Problem Statement:
 * Given a string s, find the length of the longest substring without repeating characters.
 * 
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * 
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * 
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * 
 * Constraints:
 * - 0 <= s.length <= 5 * 10^4
 * - s consists of English letters, digits, symbols and spaces.
 * 
 * Follow-up Questions (Common in FAANG interviews):
 * 1. What is the time and space complexity of your solution?
 * 2. Can you optimize it further?
 * 3. How would you handle Unicode characters?
 * 4. What if the string is extremely large and doesn't fit in memory?
 */

import java.util.*;

public class LongestSubstringWithoutRepeating {
    
    /**
     * Approach 1: Sliding Window with HashMap
     * Time Complexity: O(n)
     * Space Complexity: O(min(m,n)) where m is charset size
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            // If character is already seen and is within current window
            if (charIndexMap.containsKey(currentChar) && 
                charIndexMap.get(currentChar) >= left) {
                // Move left pointer to position after the duplicate
                left = charIndexMap.get(currentChar) + 1;
            }
            
            // Update character's latest index
            charIndexMap.put(currentChar, right);
            
            // Update maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
    
    /**
     * Approach 2: Optimized using array (for ASCII characters)
     * Time Complexity: O(n)
     * Space Complexity: O(1) - constant space for 128 ASCII characters
     */
    public int lengthOfLongestSubstringOptimized(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int[] charIndex = new int[128]; // ASCII characters
        Arrays.fill(charIndex, -1);
        
        int maxLength = 0;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            if (charIndex[currentChar] >= left) {
                left = charIndex[currentChar] + 1;
            }
            
            charIndex[currentChar] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
    
    /**
     * Test cases and driver method
     */
    public static void main(String[] args) {
        LongestSubstringWithoutRepeating solution = new LongestSubstringWithoutRepeating();
        
        // Test cases
        String[] testCases = {
            "abcabcbb",  // Expected: 3
            "bbbbb",     // Expected: 1
            "pwwkew",    // Expected: 3
            "",          // Expected: 0
            "dvdf",      // Expected: 3
            "anviaj",    // Expected: 5
            "abcdef",    // Expected: 6
            "a"          // Expected: 1
        };
        
        System.out.println("Testing Sliding Window Approach:");
        System.out.println("=================================");
        
        for (String test : testCases) {
            int result1 = solution.lengthOfLongestSubstring(test);
            int result2 = solution.lengthOfLongestSubstringOptimized(test);
            
            System.out.printf("Input: \"%s\" -> HashMap: %d, Array: %d%n", 
                            test, result1, result2);
        }
    }
    
    /**
     * Additional method to return the actual substring (bonus points in interview)
     */
    public String getLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        int resultStart = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            if (charIndexMap.containsKey(currentChar) && 
                charIndexMap.get(currentChar) >= left) {
                left = charIndexMap.get(currentChar) + 1;
            }
            
            charIndexMap.put(currentChar, right);
            
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                resultStart = left;
            }
        }
        
        return s.substring(resultStart, resultStart + maxLength);
    }
}

/**
 * INTERVIEW DISCUSSION POINTS:
 * 
 * 1. Algorithm Explanation:
 *    - Use sliding window technique with two pointers
 *    - Maintain a hashmap to track character positions
 *    - Expand window by moving right pointer
 *    - Contract window when duplicate found by moving left pointer
 * 
 * 2. Edge Cases to Consider:
 *    - Empty string
 *    - Single character
 *    - All unique characters
 *    - All same characters
 *    - Special characters and spaces
 * 
 * 3. Time Complexity Analysis:
 *    - O(n) where n is length of string
 *    - Each character visited at most twice
 * 
 * 4. Space Complexity Analysis:
 *    - HashMap approach: O(min(m,n)) where m is charset size
 *    - Array approach: O(1) for fixed charset
 * 
 * 5. Alternative Approaches:
 *    - Brute force: O(n³) - check all substrings
 *    - Two-pass sliding window: O(n) but less optimal
 *    - Set-based approach: O(n) but with additional overhead
 * 
 * 6. Follow-up Optimizations:
 *    - Use array instead of HashMap for ASCII (shown above)
 *    - BitSet for specific character ranges
 *    - Rolling hash for very long strings
 */