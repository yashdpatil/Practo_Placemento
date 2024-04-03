import java.util.*;

public class Main {
    public static void main(String[] args) {

        Stack<Character> st = new Stack<>();
        String str = "{[[]]}";
        boolean balanced = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    balanced = false;
                    break;
                }
                char ch1 = st.peek();
                if ((ch == '}' && ch1 == '{') || (ch == ']' && ch1 == '[')) {
                    st.pop();
                } else {
                    balanced = false;
                    break;
                }
            }
        }

        if (balanced && st.isEmpty()) {
            System.out.println("Brackets are balanced.");
        } else {
            System.out.println("Brackets are not balanced.");
        }
    }
}
