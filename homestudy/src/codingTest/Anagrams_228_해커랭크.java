package codingTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams_228_해커랭크 {
	 public static int makeAnagram(String a, String b) {
	        int[] charSet = new int[123];
	        
	        for(int i=0; i<a.length(); i++) 
	            charSet[a.charAt(i)]++;
	       
	        for(int i=0; i<b.length(); i++)
	            charSet[b.charAt(i)]--;
	        
	        int numberNeeded = 0;
	        for(int i=0; i<123; i++)
	            numberNeeded += Math.abs(charSet[i]);
	        
	        return numberNeeded;
	     }
	  
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String first = in.next();
	        String second = in.next();
	        System.out.println(makeAnagram(first, second));	        
	    }
}
