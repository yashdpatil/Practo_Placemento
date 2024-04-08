
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int n= 5;
		long res =1;
		System.out.print(res+" ");
		for(int i =1;i<n;i++){
		    res *=(n-i);
		    res/=i;
		    System.out.print(res+" ");
		}
		System.out.println();
	}
}

//Formula : current Elemnet = previndx*(rowno - colidx) / colidx;  
// output : 
1 4 6 4 1 

