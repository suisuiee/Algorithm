class Solution {
    public long solution(int balls, int share) {
        long answer = 1;
        
        int j = 1;
        for(int i = balls; i > balls - share; i--){
            answer *= i;
            answer /= j;
            j++;
        }
        
        return answer;
    }
}