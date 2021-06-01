package codingTest;

import java.util.Scanner;

public class 계곡계산224_해커랭크 {

	  public static void main(String[] args) {
//	        Scanner in = new Scanner(System.in);
//	        in.nextInt();
//	        String s = in.next();
//	        
//	        int level = 0;
//	        int valleys = 0;
//	        for(int i = 0; i < s.length(); i++){
//	            if(s.charAt(i) == 'U'){
//	                level++;
//	            }else if(s.charAt(i) == 'D'){
//	                if(level == 0){
//	                    valleys++;
//	                }
//	                level--;
//	            }
//	        }
//	        System.out.println(valleys);
		  Scanner s = new Scanner(System.in);
		  s.nextInt();
		  String input = s.next();
		  
		  int level		= 0;
		  int valleys	= 0;
		  
		  for(int i=0; i<input.length(); i++) {
			  if(input.charAt(i)=='U') {
				  level++;
			  }else if(input.charAt(i)=='D') {
				  if(level==0) {
					  valleys++;
				  }
				  level--;
			  }
		  }
		  System.out.println(valleys);
		  
		  
	    }

}
