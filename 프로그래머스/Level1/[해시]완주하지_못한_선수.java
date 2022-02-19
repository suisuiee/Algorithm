import java.util.Arrays;
/*
    1. 참여선수와 완료자를 정렬 sort 한다.
    2. 참여자와 완료자의 i를 비교
    3. 다른 이름이면 +answer
    4. 완주하지 못한 선수가 참가자의 마지막 선수일때 처리
    
    https://programmers.co.kr/learn/courses/30/lessons/42576
*/
class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        String answer = "";
        
        for(int i = 0; i < completion.length; i++){
            if(!participant[i].equals( completion[i]) ){
                answer += participant[i];     
                // 더이상 찾을 필요가 없으니 return
                return answer;
            }
        }
        // 참가자의 마지막 선수만 남았을 때
        answer +=  participant[participant.length -1];
        return answer;
    }
}

