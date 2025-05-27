class Solution {
    public int differenceOfSums(int n, int m) {
        
        //Approach 2: Mathematical Derivation
        //Time: O(1) Space: O(1)
        int k=n/m;
        return (n*(n+1))/2 - k*(k+1)*m;
    }
}