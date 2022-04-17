import java.util.Arrays;
/*
    1. 배열을 자른다 copyOfRange(origin, start, end)
    2. 배열을 정렬한다.
    3. 배열을 뽑는다.
    command[i, j, k]
    
    https://programmers.co.kr/learn/courses/30/lessons/42748
*/
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int i;
        int[] answer = new int[commands.length];
        
        // for문
        for(i = 0 ; i < commands.length; i++ ){
            int[] CopyArr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(CopyArr);
            answer[i] = CopyArr[commands[i][2] - 1];
        }
        
        return answer;
    }
}
