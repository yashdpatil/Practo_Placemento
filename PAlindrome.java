/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		String str = "abca";
	    int start = 0;
	    int end = str.length()-1;
	    boolean flag = true;
	    while(start<=end){
	        if(str.charAt(start)!=str.charAt(end)){
	            flag = false;
	        }
	        start++;
	        end--;
	    }
	    if(flag ==true){
	        System.out.print("Palindrome");
	    }else{
	        System.out.print("not Palindrome");
	    }
	}
}
