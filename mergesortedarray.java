class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int c=n+m-1;
        while(i>=0 && j >=0){
            if(nums1[i]>nums2[j]){
                nums1[c]=nums1[i];
                i--;
                c--;
            }
            else if(nums2[j] >= nums1[i]){
                nums1[c]=nums2[j];
                j--;
                c--;
            }
        }
        while(j>=0){
            nums1[c] = nums2[j];
            c--;
            j--;
        }
        while(i>=0){
            nums1[c]=nums1[i];
            c--;
            i--;
        }
        
    }
}