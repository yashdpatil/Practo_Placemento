//// Logest Subsequence Code
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] nums = {1,3,2,100,4,5};
		System.out.println("Hello World");
		HashSet<Integer> st = new HashSet<>();
		for(int num : nums) st.add(num);
		int maxStreak = 0;
		for(int num : st){
		    if(!st.contains(num-1)){ //num is starting point of a CharSequence
		    int currnum = num;
		    int currStreak =  1; //LEngth of current Consesicative CharSequence
		     while(st.contains(currnum+1)){
		         currStreak++;
		         currnum++;
		     } 
		     maxStreak = Math.max(maxStreak,currStreak);
		    }
		    
		}
		System.out.print(maxStreak);
		
	}
}
