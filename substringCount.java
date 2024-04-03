public class Main {
    public static void main(String[] args) {

        String str = "hhayassh";
        String st = "sh";
        int count = 0;
for(int i = 0;i<=str.length()-st.length();i++){
    if(str.substring(i,i+st.length()).equals(st)){
        count++;
    }
}

        System.out.print(count);

    }
}
