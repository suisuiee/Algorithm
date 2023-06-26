import java.util.*;
/**
* 장군개미 - 5
* 병정개미 - 3
* 일개미 1
*/

class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        answer += hp / 5;
        hp = hp % 5;
        
        answer += hp / 3;
        hp = hp % 3;
        
        answer += hp;
        
        return answer;
        
        
    }
}