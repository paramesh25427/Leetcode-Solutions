class Solution {
    public static boolean check(char s){
            if((s>='a' && s<='z') ||( s>='A' && s<='Z')){
                return true;
            }
            return false;
    }
    public String reverseOnlyLetters(String s) {
        int i=0;
        int j=s.length()-1;
        char ch[] = new char[s.length()];
        while(i<=j){
        
            if(!check(s.charAt(i))){
                ch[i] = s.charAt(i);
                    i++;
            }
            else if(!check(s.charAt(j))){
                ch[j] = s.charAt(j);
                j--;
            }
            else{
                 ch[i] = s.charAt(j);
                ch[j] = s.charAt(i);
                i++;
                j--;
            }
        }
        
        return new String(ch);
        
    }
}