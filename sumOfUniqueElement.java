class Solution {
    public int sumOfUnique(int[] nums) {
        Map <Integer,Integer> hs = new HashMap<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
 
        for(int key : hs.keySet()) {
             if(hs.get(key) == 1) {
                 sum += key;
                }
        }
        return sum;
    }
}