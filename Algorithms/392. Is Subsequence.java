class Solution {
    public boolean isSubsequence(String s, String t){
        short charInd = -1;
        for(short i = 0;i < s.length();++i)
            if(charInd < t.indexOf(s.charAt(i), charInd + 1)) charInd = (short)t.indexOf(s.charAt(i), charInd + 1);
            else return false;

        return true;
    }
}