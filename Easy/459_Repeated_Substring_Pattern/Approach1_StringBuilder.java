class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        //Approach 1: StringBuilder
        //Time: O(n^2) Space: O(n)
        int len=s.length();
        for(int i=1; i<=len/2; i++){

            if(len%i!=0){
                continue;
            }

            int repeats=len/i;
            String pattern=s.substring(0,i);    
            StringBuilder sb=new StringBuilder();
            for(int j=1; j<=repeats; j++){
                sb.append(pattern);
            }

            if(sb.toString().equals(s)){
                return true;
            }
        }
        return false;
    }
}