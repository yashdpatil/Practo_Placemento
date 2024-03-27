/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		String str = "aaaabbccdde";
		int count = 1;
		    String ans = "" + str.charAt(0);
		for(int i = 1;i<str.length();i++){
		    Character curr = str.charAt(i);
		    Character prev = str.charAt(i-1);
		    
		    if(curr == prev){
		        count++;
		    }else{
		       	if(count>1) ans+=count;
		        count=1;
		      ans+=curr;
		    }
		}
		if(count>1)
		ans+=count;
		System.out.print(ans);
	}
}
output
Hello World
a4b2c2d2e
