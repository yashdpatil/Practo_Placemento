
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		String str = "Yash PAtil 120 from padalase";
		String[] st = str.split(" ");
		int count = 0;
		for(int i = 0; i<str.length();i++){
		    try{
		    count++;
		    int a = Integer.parseInt(st[i]);
		    for(int j = st.length-1;j>=count-1;j--){
		        System.out.print(st[j]+" ");
		    }
		    for(int k = 0;k<count-1;k++){
		        System.out.print(st[k]+" ");
		    }
		    }catch(Exception e){
		        
		    }
		}
	}
}


Hello World
padalase from 120 Yash PAtil 
