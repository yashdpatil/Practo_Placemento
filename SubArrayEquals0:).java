/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// Given an arr[] of length of n find the length of largest subArray With sum =0;

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    	 //   int[] arr = {15,-2,2,-8,1,7,10,23}; // 5
    int[] arr = {1,2,3};  //0
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxlen = 0 ,prefOfsum = 0;
        map.put(0,-1);
        for(int i =0;i<arr.length;i++){
            prefOfsum+=arr[i];
            if(map.containsKey(prefOfsum)){
                maxlen = Math.max(maxlen,i-map.get(prefOfsum));
            }else{
                map.put(prefOfsum,i);
                
            }
        }
        System.out.print(maxlen);


	}
}
