// /******************************************************************************

//                             Online Java Compiler.
//                 Code, Compile, Run and Debug java program online.
// Write your code in this editor and press "Run" button to execute it.



public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int n = 0;
		for(int i =1;i<5;i++){
		for(int j=1;j<=i;j++){
		 if(j>1){
		    if(i%2 ==1 || i%2 == 0){
		        System.out.print("*");
		        
		    }
		 }
		  
		    System.out.print(++n);
		}
		
		System.out.println();
		}
	    	for(int i =1;i<5;i++){
              for(int j=1;j<=5-i;j++){
        if(j>1){
            if(i%2 ==1 || i%2 == 0){
                System.out.print("*");
            }
        }
        System.out.print(++n);
    }
    System.out.println();
}

	}
}



Hello World
1
2*3
4*5*6
7*8*9*10
11*12*13*14
15*16*17
18*19
20
