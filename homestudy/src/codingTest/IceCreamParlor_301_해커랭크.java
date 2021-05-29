package codingTest;

import java.util.LinkedHashMap;
import java.util.Map;

public class IceCreamParlor_301_해커랭크 {

	public static void whatFlavors(int[] cost, int money) {
		 Map<Integer, Integer> parlor = new LinkedHashMap<>();    
	        for(int i = 0; i < cost.length; i++) {
	            if(cost[i] < money) {
	                if(parlor.containsKey(money - cost[i])) {
	                    System.out.println((parlor.get(money - cost[i])+1) + " " + (i+1));
	                    return;
	                }
	                
	                if(!parlor.containsKey(cost[i])) parlor.put(cost[i], i);
	            }
	        }
	}

	public static void main(String[] args) {

	}

}
