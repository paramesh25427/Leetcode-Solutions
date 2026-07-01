class Solution {
    public static void reverse(int i,int j,int arr[]){
        for(int k=j;k>i;k--){
            arr[k] = arr[k-1];
        }
    }
    public void duplicateZeros(int[] arr) {
        int i=0;
        int j=1;

        while(i<arr.length && j<arr.length){
            if(arr[i]==0){
                reverse(j,arr.length-1,arr);
                arr[j]=0;
                i=j+1;
                j = i+1;
            }
            else{
                i++;
                j++;
            }
        }
      
    }
}