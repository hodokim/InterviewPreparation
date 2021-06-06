package codingTest;

import java.util.ArrayList;

public class 모의고사222_프로그래머스 {
	public static int[] solution(int[] answers) {
        int[] answer = {};
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int answer1 = 0;
        int answer2 = 0;
        int answer3 = 0;
        
        
        for(int i=0; i<answers.length; i++) {
        	if(person1[i%person1.length]==answers[i]) {
        		answer1++;
        	}
        	if(person2[i%person2.length]==answers[i]) {
        		answer2++;
        	}
        	if(person3[i%person2.length]==answers[i]) {
        		answer3++;
        	}       	
        }
        
        int winnersPoint = Math.max(answer1, Math.max(answer2,answer3));
        
        ArrayList<Integer> tmp_winner = new ArrayList<Integer>();
        
        
        if(winnersPoint==answer1) {
        	tmp_winner.add(1);
        }
        if(winnersPoint==answer2) {
        	tmp_winner.add(2);
        }
        if(winnersPoint==answer3) {
        	tmp_winner.add(3);
        }
        
        answer = new int[tmp_winner.size()];
        
        for(int i=0; i<answer.length; i++) {
        	answer[i]=tmp_winner.get(i);
        }
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] ans = {1,3,2,4,2};
		int [] call = solution(ans);
		for(int i=0; i<call.length; i++) {
			System.out.println(call[i]);
		}
		
	
		
	}
}
