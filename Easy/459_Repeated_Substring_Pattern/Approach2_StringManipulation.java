class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        //Approach 2: String Manipulation
        //Time: O(n) Space: O(n)
        String doubled=s.concat(s);
        int len=doubled.length();
        return (doubled.substring(1, len-1)).contains(s);
    }
}