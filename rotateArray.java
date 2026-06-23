class Solution {
    public void rotate(int[] nums, int k) {
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            li.add(nums[i]);
        }
        Collections.rotate(li,k);
        int c=0;
        for(int i:li){
            nums[c] = i;
            c++;
        }

        
    }
}