import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] arr1 = removeDuplicates(nums1);
        int[] arr2 = removeDuplicates(nums2);
        
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int num1 : arr1) {
            for (int num2 : arr2) {
                if (num1 == num2) {
                    set.add(num1);
                }
            }
        }
        
        // Convert set to array
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        
        return result;
    }
    
    public int[] removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            set.add(num);
        }
        
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        
        return result;
    }
}
