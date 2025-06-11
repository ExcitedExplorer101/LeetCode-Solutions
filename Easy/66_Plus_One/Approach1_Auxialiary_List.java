class Solution {
    public int[] plusOne(int[] digits) {

        //Approach 1: Auxiliary List
        //Time: O(n) Space: O(n)
        int len=digits.length;
        if(digits[len-1]+1<=9){
            digits[len-1]++;
            return digits;
        }        

        ArrayList<Integer> list=new ArrayList<>();
        int carry=1;
        list.add(0);
        for(int i=len-2; i>=0; i--){
            
            if(digits[i] + carry > 9){
                carry=1;
                list.add(0,0);
            }
            else{
                list.add(0,digits[i]+carry);
                carry=0;
            }
        }

        if(carry==1){
            list.add(0,1);
        }
        int result[]=new int[list.size()];
        int i=0;
        for(int n: list){
            result[i++]=n;
        }
        return result;
    }
}
