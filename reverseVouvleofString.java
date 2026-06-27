class Solution {
    public static boolean vowel(char s){
        if(s =='a'|| s == 'e' || s=='i' || s =='o' || s =='u' || s =='A'|| s == 'E' || s=='I' || s =='O' || s =='U'){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        int i = 0;
        int j=s.length()-1;
        char str[] = s.toCharArray();
               
        while(i<j){
          
            
            while(i<j && !vowel(str[i])){
                 i++;
            }
            while(i<j && !vowel(str[j])){
                 j--;
            }
            
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
            
        }
        
        return new String(str);
        
    }
}