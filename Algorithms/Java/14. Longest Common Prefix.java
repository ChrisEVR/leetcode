class Solution {
    public String longestCommonPrefix(String[] strs) {
        final StringBuilder prefix = new StringBuilder(strs[0]);

        for(short i = 1; i < strs.length; ++i)
            while(strs[i].indexOf(prefix.toString()) != 0){
                prefix.deleteCharAt(prefix.length() - 1);
                if(prefix.length() == 0) return "";
            }

        return prefix.toString();
    }
}