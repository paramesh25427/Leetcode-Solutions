class Solution {
    public int totalFruit(int[] fruits) {
        int i=0;
        int max=0;
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int j=0;j<fruits.length;j++){
             hs.put(fruits[j],hs.getOrDefault(fruits[j], 0) + 1);
            //  hs.put(fruits[j], hs.getOrDefault(fruits[j], 0) + 1);
            while(hs.size()>2){
                hs.put(fruits[i],hs.get(fruits[i])-1);
                if(hs.get(fruits[i])==0){
                    hs.remove(fruits[i]);
                }
                i++;
            }
            if(hs.size()<=2){
                max = Math.max(max,j-i+1);
            }
        }
        return max;
    }
}