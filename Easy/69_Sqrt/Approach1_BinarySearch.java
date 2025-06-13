class Solution {
    public int mySqrt(int x) {

        //Approach 1: Binary Search
        //Time: O(logn) Space: O(1)
        if(x==0 || x==1){
            return x;
        }

        int start=1, end=x, mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid>x/mid){
                end=mid-1;
            }
            else if(mid==x/mid){
                return mid;
            }
            else{
                start=mid+1;
            }
        }
        return end;
    }
}