import java.util.Arrays;

public class Solution {
    public static int removeDuplicates(int[] nums) {

        //int[] nums1 = {1,1,2};
        //int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        int newLenght = 1;
        int last = 1;

        for(int i=1;i<nums.length; i++){
            if(nums[i] > nums[last]) {
                nums[last+1] = nums[i];
                last = i;
                newLenght++;
            }
        }

        for (int i : nums) {
            System.out.printf("%d", i);
        }

        return newLenght;
    }

    public static void main(String[] args) {

        int[] nums1 = {1,1,2};
        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};

        System.out.println("\nRemove nums1: " + removeDuplicates(nums1));
        System.out.println("Remove nums2: " + removeDuplicates(nums2));

    }
}