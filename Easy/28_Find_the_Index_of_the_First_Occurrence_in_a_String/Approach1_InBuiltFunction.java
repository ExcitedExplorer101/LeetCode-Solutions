class Solution {
    public int strStr(String haystack, String needle) {

        //Approach 1: In-Built String Function
        //Time: O(mxn) Space: O(1)
        return haystack.indexOf(needle);
    }
}