/*
    https://programmers.co.kr/learn/courses/30/lessons/42626
*/
import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        // heap에 넣기
        for(int scov : scoville){
            heap.offer(scov);
            
        }
        
        while(heap.peek() < K) {
            if(heap.peek() < K && heap.size() < 2){
                answer = -1;
                break;
            }
            int m1 = heap.poll();
            int m2 = heap.poll();
            
            heap.offer(m1 + (m2 * 2));
            answer++;
        }
        
        
        //while( !heap.isEmpty() ){
        //    System.out.println(heap.poll() );
        //}
        
        return answer;
    }
}
