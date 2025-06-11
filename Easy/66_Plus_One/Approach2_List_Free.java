class Solution {
    public int[] plusOne(int[] digits) {

        //Approach 2: List Free
        //Time: O(n) Space: O(n)
        int len=digits.length;
        if(digits[len-1]+1<=9){
            digits[len-1]++;
            return digits;
        }
        
        boolean allNine=true;
        for(int n: digits){
            if(n!=9){
                allNine=false;
                break;
            }
        }
        
        if(allNine){

            int result[]=new int[len+1];
            result[0]=1;
            return result;
        }

        int carry=1;
        digits[len-1]=0;
        for(int i=len-2; i>=0; i--){
            
            int sum=digits[i]+carry;
            digits[i]=(sum>9)?0:digits[i]+carry;
            carry=(sum>9)?1:0;
        }
        return digits;
    }
}