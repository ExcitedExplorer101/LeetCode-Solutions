class Solution {
    public int repeatedStringMatch(String a, String b) {

        //Approach 2: Improvised StringBuilder
        //Time: O(n*(n+m)) Space: O(m+n)
        StringBuilder sb=new StringBuilder(a);
        int i;
        for(i=1; sb.length() < b.length(); i++){
            sb.append(a);
        }
        if(sb.indexOf(b)>=0){
            return i;
        }
        if(sb.append(a).indexOf(b)>=0){
            return i+1;
        }                    
        return -1;
    }
}