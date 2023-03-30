import java.util.*;

class Solution {
    public String solution(int age) {
        String temp = Integer.toString(age);
        String answer = "";
        
        for(int i = 0; i < temp.length(); i++){
            answer += (char)(temp.charAt(i) -'0' + 'a');
        }
        
        return answer;
    }
}