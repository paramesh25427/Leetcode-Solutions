class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length, targetSum = k * threshold, sum = 0, cnt = 0;

        for(int i = 0; i < k; i++){
            sum += arr[i];
        }

        if(sum >= targetSum){
            cnt++;
        }

        for(int i = k; i < n; i++){
            sum += arr[i];
            sum -= arr[i - k];

            if(sum >= targetSum){
                cnt++;
            }
        }
        return cnt;
    }
}