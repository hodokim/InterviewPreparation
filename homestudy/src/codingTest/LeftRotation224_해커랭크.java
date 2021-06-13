package codingTest;

import java.util.Scanner;

public class LeftRotation224_해커랭크 {
	 public static int[] arrayLeftRotation(int[] a, int n, int k) {
	        int[] output = new int[n];
	        
	        for(int i=k-1; i>=0; i--)
	            output[n-(k-i)] = a[i];
	        
	        for(int i=0; i<n-k; i++)
	            output[i] = a[k+i];
	        
	        return output;
	      
	    }
	    
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int a[] = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	      
	        int[] output = new int[n];
	        output = arrayLeftRotation(a, n, k);
	        for(int i = 0; i < n; i++)
	            System.out.print(output[i] + " ");
	      
	        System.out.println();
	      
	    }
}
