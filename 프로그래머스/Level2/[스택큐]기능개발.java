/**
 * https://programmers.co.kr/learn/courses/30/lessons/42586
 */
import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();
        
        for(int i =0; i < speeds.length; i++){
            double remain = (100 - progresses[i]) / (double) speeds[i];
            int day = (int) Math.ceil(remain);
            
            System.out.println(" peek " + queue.peek());
            if ( !queue.isEmpty() && queue.peek() < day){
                answerList.add(queue.size() );
                queue.clear();
            }
            queue.offer( day );
            System.out.println( day); 
        }
        answerList.add( queue.size() );
        
        int[] answer = new int[answerList.size()];
        
        for(int i = 0 ; i < answer.length; i++){
            answer[i] += answerList.get(i);
        }
        
        // System.out.println( queue.element() ); 
        return answer;
    }
}