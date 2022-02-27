import java.util.*;
/* 
 * https://programmers.co.kr/learn/courses/30/lessons/42862
 */

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 여분의 체육복을 가저온 사람이 도난당했을때 처리 -> 걔는 체육복이 있음!
        for(int i = 0 ; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(lost[i] == reserve[j]){
                    reserve[j] = -10;
                    lost[i] = -10;
                    answer += 1;
                }
            }
        }
        
        for(int i = 0 ; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(lost[i] != -10){
                    if(lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j]){
                        reserve[j] = -10;
                        lost[i] = -10;
                        answer += 1;
                    }
                }
            }
        }
    
        return answer;
    }
}