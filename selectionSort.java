/******************************************************************************

                        SELECTION SORT
*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
        int[] arr = {1,66,55,22,44,36,55,221,5,2};
        for(int i =0;i<arr.length-1;i++){
            int min = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                    
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for(int a : arr){
            System.out.println(a);
        }


	}
}
