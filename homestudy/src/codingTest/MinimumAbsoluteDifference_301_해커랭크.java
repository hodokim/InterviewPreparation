package codingTest;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumAbsoluteDifference_301_해커랭크 {
	static int minimumAbsoluteDifference(int[] arr) {

		int answer = Math.abs(arr[0]-arr[1]);
		int tmp = 0;
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length-1; i++) {
				tmp = Math.abs(arr[i]-arr[i+1]);
				if(answer>tmp) answer = tmp;
				if(answer==0) return answer;
		}
								
		return answer;
    }
	
	 public static void main(String[] args) {
	  
	    }
}
