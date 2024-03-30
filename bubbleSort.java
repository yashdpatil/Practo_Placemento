/******************************************************************************
         *********   BUbble Sort ******************

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int arr[] = {10,20,30,15,12,11};
		int n = arr.length;
		for(int i = n-1;i>0;i--){
		    for(int j = 0 ;j<i;j++){
		        if(arr[j]>arr[j+1]){
		            int temp = arr[j];
		            arr[j] = arr[j+1];
		            arr[j+1] = temp;
		        }
		    }
		}
		for(int a :arr){
		    System.out.print(a);
		}
	}
}
