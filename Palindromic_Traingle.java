
public class Main
{
	public static void main(String[] args) {
		
		
		int n=5;
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=n-i;j++){
		        System.out.print(" ");
		    }
		    for(int k =i;k>=1;k--){
		        System.out.print(k);
		    }
		    for(int k =2;k<=i;k++){
		        System.out.print(k);
		    }
		    System.out.println();
		}
	}
}
    1
   212
  32123
 4321234
543212345


	public class Main {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k =1;k<i;k++){
                System.out.print(k);
            }
            for(int k =i;k>=1;k--){
                System.out.print(k);
            }
              
            System.out.println();
        }
    }
}
