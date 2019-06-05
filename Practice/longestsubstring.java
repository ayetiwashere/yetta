

class Solution {
    public static long solution(String s) {
        // Type your solution here
        int lengthOfString = s.length();
        int current =1;
        int max = 1;
        int prev;
        int visited[] = new int[256];
        
        for (int j = 0; j < 256; j++)
        {
            visited[j] = -1;
        }
        
        //mark first char as visited by storing the index of the first char
        visited[s.charAt(0)] = 0;
        
        //start from 2nd char 
        for(int i =1; i<s.length();i++)
        {
            prev = visited[s.charAt(i)];
            
            //if current char is not present or not part of current 
            if(prev == -1 || i-current > prev)
            {
                current++;
            }
            else
            {
                //curr char is already present 
                if(current > max)
                {
                    max = current;
                }
                current = i -  prev;
            }
                
             visited[s.charAt(i)] = i;
        }
        
        if(current > max)
        {
            max = current;
        }
        
        return max;
    }
}


