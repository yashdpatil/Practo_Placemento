Given a binary string s, return the number of non-empty substrings that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.

Substrings that occur multiple times are counted the number of times they occur.








public class Main {
    public static void main(String[] args) {
        String str = "10101";
        int ans = 0, curr = 1, prev = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == str.charAt(i)) {
                curr++;
            } else {
                ans += Math.min(curr, prev);
                prev = curr;
                curr = 1;
            }
        }
        int pen = ans + Math.min(prev, curr);
        System.out.print(pen);
    }
}
