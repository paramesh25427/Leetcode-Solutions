package merge interval;
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
    Arrays.sort(intervals,(a,b)->{
        if(a[0]==b[0])
            return b[1]-a[1];
        return a[0]-b[0];
            });
        int i=0;
        int j=1;
         int c=1;
        while(j<intervals.length){
            if(intervals[j][1]<=intervals[i][1]){  
                System.out.println(intervals[j][0]);    
                j++;
            }
            else{
                c++;
                i=j;
                j++;
            }
        }
        return c;
    }
}