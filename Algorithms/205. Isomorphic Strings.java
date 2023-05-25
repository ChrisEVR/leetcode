import java.util.Hashtable;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Hashtable<Character, Character> charMap = new Hashtable<Character, Character>();

        if(s.length() != t.length()) return false;

        for(short i = 0; i < s.length(); ++i)
            if(charMap.containsKey(s.charAt(i)) && (charMap.get(s.charAt(i)) != t.charAt(i))) return false;
            else if(!charMap.containsKey(s.charAt(i)) && charMap.containsValue(t.charAt(i))) return false;
            else charMap.put(s.charAt(i), t.charAt(i));

        return true;
    }
}