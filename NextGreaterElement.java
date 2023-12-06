package DSA;

import java.util.Arrays;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2){
        int j=0;
        int[] out = new int[nums1.length];

        for (int i=0; i< nums1.length; i++){
            while (j< nums2.length){
                if (nums1[i]==nums2[j]){
                    j++;
                    break;
                }else {
                    j++;
                }
            }

            while (j<nums2.length){
                if (nums2[j] > nums1[i]){
                    out[i] = nums2[j];
                    break;
                }else {
                    j++;
                }
            }
            if (j==nums2.length){
                out[i] = -1;
            }
            j=0;

        }
        return out;
    }
    public static void main(String[] args) {
        int[] nums1 = {2,4};
        int[] nums2 = {1,2,3,4};

        int[] out = nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(out));
    }
}
