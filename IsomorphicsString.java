import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	    String str1 = "abb";
	    String str2 = "xxy";
	    Map<Character,Character> map = new HashMap<>();
	    for(int i = 0;i<str1.length();i++){
	        Character ch1 = str1.charAt(i);
	        Character ch2 = str2.charAt(i);
	        if(map.containsKey(ch1)){
	           if(map.get(ch1)!=ch2) System.out.print("false"); return;
	            
	        }else if(map.containsValue(ch2)){
System.out.print("false"); return;	            
	        }else{
	            map.put(ch1,ch2);
	        }
	        
	        
	    }
	    System.out.print("true");
	}
}
