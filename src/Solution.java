import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    // 1. Two Sum
    /* Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice. */
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for(int i=0; i<nums.length; i++) {
            HashMap<Integer, Integer> map = new HashMap<>(nums.length);

            for(int j=i+1; j<nums.length; j++) {
                map.put(nums[j], j);
            }

            int num1 = nums[i];
            int num2 = target - num1;

            if(map.containsKey(num2)) {
                int key2 = -1;
                key2 = map.get(num2);
                if(i<key2) {
                    result[0] = i;
                    result[1] = key2;
                } else {
                    result[0] = key2;
                    result[1] = i;
                }
            }
        }
        return result;
    }

    public static int removeDuplicates(int[] nums) {

        int newLength = 0;
        int higher = Integer.MIN_VALUE;

        for(int i=0;i<nums.length; i++){
            for(int j=i; j<nums.length; j++) {
                if(nums[j] > higher) {
                    nums[i] = nums[j];
                    higher = nums[j];
                    newLength++;
                    break;
                }
            }
        }
        return newLength;
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int[] nums2 = {3, 3};
        System.out.println(Arrays.toString(twoSum(nums, 22)));
        System.out.println(Arrays.toString(twoSum(nums2, 6)));

    }
}