import java.util.Arrays;

class Solution1 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1={1,2,0,0,0};
        int n=2;
        int[] nums2={0,1};
        int m=2;
        merge(nums1,n,nums2,m);
    }


}