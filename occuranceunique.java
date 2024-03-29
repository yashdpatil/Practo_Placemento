/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		String str = "Yash Pattil";
		for(int i=0;i<str.length();i++){
		   int  count = 0;
		    for(int j =0;j<str.length();j++){
		        if(i!=j){
		            if(str.charAt(i)==str.charAt(j)){
		                count++;
		            }
		        }
		    }
		    if(count == 0){
		        System.out.println(str.charAt(i)+" "+count);
		    }
		  //   if(count <1){
		  //      System.out.println(str.charAt(i)+" "+count);
		  //  }
		}
	}
}
