import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] sorted = emergency.clone();
        Arrays.sort(sorted);
        int len = sorted.length;
        
        int[] answer = new int[len];
    
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                if(emergency[i] == sorted[j]){
                    answer[i] = len - j;
                    break;
                }
            }
        }
        
        return answer;
    }
}