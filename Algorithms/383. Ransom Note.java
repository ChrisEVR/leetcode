class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        short[] alphabet = new short[26];

        for(int i = 0; i < magazine.length(); ++i) alphabet[magazine.charAt(i) - 'a']++;

        for(int i = 0; i < ransomNote.length(); ++i) if(--alphabet[ransomNote.charAt(i) - 'a'] < 0) return false;;

        return true;
    }
}