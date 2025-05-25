class Solution {
    public int strStr(String haystack, String needle) {

        //Approach 2: Sliding Window
        //Time: O(mxn) Space: O(1)
        int hLen=haystack.length(), nLen=needle.length();
        for(int i=0; i<=hLen-nLen; i++){
            
            int j=0;
            while(j<nLen && haystack.charAt(i+j)==needle.charAt(j)){
                j++;
            }
            if(j==nLen){
                return i;
            }
        }
        return -1;
    }
}