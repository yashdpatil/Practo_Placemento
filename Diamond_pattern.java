/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int n=7;
		for(int i =1;i<=n;i++){
		    for(int j =n;j>i;j--){
		        System.out.print(" ");
		    }
		    for(int k = 1;k<=i;k++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
		for(int i =1;i<=n;i++){
		    for(int j =1;j<i;j++){
		        System.out.print(" ");
		    }
		    for(int k = n;k>=i;k--){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}




      * 
     * * 
    * * * 
   * * * * 
  * * * * * 
 * * * * * * 
* * * * * * * 
* * * * * * * 
 * * * * * * 
  * * * * * 
   * * * * 
    * * * 
     * * 
      * 


