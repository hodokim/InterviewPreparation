package codingTest;

import java.util.HashMap;
import java.util.Map;

public class RasomNote_225_해커랭크 {
	public static void ransomNote(String[] magazine, String[] ransom){
	    if (ransom.length > magazine.length) {
	        System.out.println("No");
	        return;
	    }
	    Map<String, Integer> helper = new HashMap<>();
	    for(String s : magazine){
	        if(!helper.containsKey(s)) {
	            helper.put(s, 1);
	        } else {
	            helper.put(s, helper.get(s)+1);
	        }
	    }
	    for(String s : ransom){
	        if(helper.containsKey(s)){
	            helper.put(s, helper.get(s)-1);
	            if (helper.get(s)-1 < 0){
	                System.out.println("No");
	                return;
	            }
	        }else{
	            System.out.println("No");
	            return;
	        }
	    }
	    System.out.println("Yes");
	}
	 
}
