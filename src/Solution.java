import java.util.Arrays;

public class Solution {
    /* Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice. */
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    if(i>j) {
                        result[0] = j;
                        result[1] = i;
                    } else {
                        result[0] = i;
                        result[1] = j;
                    }
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

        /*for (int i : nums) {
            System.out.printf("%d", i);
        }*/

        return newLength;
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        //for(int i=0;i<2;i++) {
            System.out.println(Arrays.toString(twoSum(nums, 9)));
        //}

    }
}