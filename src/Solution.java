import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    /* Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice. */
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);

        for(int i=0; i<nums.length; i++) {
            map.put(i, nums[i]);
        }

        for(int i : map.keySet()) {
            int num1 = map.get(i);
            int num2 = target - num1;

            // problem here, can return the same key as num1. see:
            // https://stackoverflow.com/questions/1383797/java-hashmap-how-to-get-key-from-value
            if(map.containsValue(num2)) {
                if(i < num2) {
                    result[0] = map.get(num1);
                    result[1] = map.get(num2);
                } else {
                    result[0] = map.get(num2);
                    result[1] = map.get(num1);
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
        System.out.println(Arrays.toString(twoSum(nums, 9)));
        System.out.println(Arrays.toString(twoSum(nums2, 6)));

    }
}