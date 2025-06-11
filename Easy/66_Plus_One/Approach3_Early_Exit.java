class Solution {
    public int[] plusOne(int[] digits) {
        
        //Approach 3: Early Exit
        //Time: O(n) Space: O(n)
        int len=digits.length;
        for(int i=len-1; i>=0; i--){

            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }

        int result[]=new int[len+1];
        result[0]=1;
        return result;
    }
}