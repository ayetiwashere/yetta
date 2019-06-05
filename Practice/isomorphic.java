

class Solution {
    public static boolean solution(String s, String t) {
        // Type your solution here
        if(s.length() != t.length())
        {
            return false;
        }
        
        char characters1[] = new char[256];
        char characters2[] = new char[256]; 
        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();
        
        for(int i =0; i < sArray.length;i++)
        {
            char c1 = sArray[i];
            char c2 = tArray[i];
            char character1 = characters1[c1-'a'];
            char character2 = characters2[c2-'a'];
            
            if(character1 == '\0' && character2 == '\0')
            {
                characters1[c1-'a'] = tArray[i];
                characters2[c2-'a'] = sArray[i];
                continue;
            }
            
            if(character1 == tArray[i] && character2 == sArray[i])
            {
                continue;
            }
            
            return false;
        }
        return true;
     }
}
