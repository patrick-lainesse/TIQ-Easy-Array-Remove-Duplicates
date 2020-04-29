public class Solution {
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

        int[] nums1 = {1,1,2};
        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};

        System.out.println("\nRemove nums1: " + removeDuplicates(nums1));
        for (int i : nums1) {
            System.out.printf("%d", i);
        }
        System.out.println("\nRemove nums2: " + removeDuplicates(nums2));
        for (int i : nums2) {
            System.out.printf("%d", i);
        }

    }
}