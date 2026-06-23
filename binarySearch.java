class Solution {
    public int search(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(target>nums[mid]){
                i=mid+1;
            }
            if(target<nums[mid]){
                j = mid-1; 
            }
        }
        return -1;
        
    }
}