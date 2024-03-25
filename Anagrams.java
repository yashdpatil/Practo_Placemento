/// ANagrm-1 Using(Hash-Map-Pointer-use-of-Extra-Space)
import java.util.*;
public class Main
{
    public static HashMap<Character,Integer> MakeHashMap(String str){
    HashMap<Character,Integer> map = new HashMap<>();
		for(int i = 0;i<str.length();i++){
		    Character ch = str.charAt(i);
		    if(map.containsKey(ch)){
		        map.put(ch,map.get(ch)+1);
		    }else{
		        map.put(ch,1);
		    }
		}
		return map;
    }
    public static boolean Without_using_Spaces(String str,String str2){
        HashMap<Character,Integer> map = new HashMap<>();
		for(int i = 0;i<str.length();i++){
		    Character ch = str.charAt(i);
		    if(map.containsKey(ch)){
		        map.put(ch,map.get(ch)+1);
		    }else{
		        map.put(ch,1);
		    }
		}
		for(int i = 0;i<str2.length();i++){
		    Character ch = str2.charAt(i);
		    if(map.containsKey(ch)){
		        map.put(ch,map.get(ch)-1);
		    }
		}
		
		for(Integer i : map.values()){
		    if(i!=0) return false;
		}
		return true;
    }

	public static void main1(String[] args) {
            String str1 = "Yash";
            String str2 = "shaY";
            HashMap<Character,Integer> m1 =  MakeHashMap(str1);
            HashMap<Character,Integer> m2 = MakeHashMap(str2);
            System.out.print(m1.equals(m2));
		
	}
	
	/// ANagrm-2 Using(Hash-Map-Pointer-Without-use-of-Extra-Space)

	public static void main(String[] args){
	    String str1 = "Yash";
	    String str2 = "hsaY";
	    System.out.print(Without_using_Spaces(str1,str2));
	    
	    
	    
	    
	}
}



