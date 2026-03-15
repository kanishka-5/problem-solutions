import java.util.Scanner;

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while (s.length() > i && t.length() > j) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string s: ");
        String s = sc.nextLine();

        System.out.print("Enter string t: ");
        String t = sc.nextLine();

        Solution obj = new Solution();
        boolean result = obj.isSubsequence(s, t);

        if (result) {
            System.out.println("s is a subsequence of t");
        } else {
            System.out.println("s is NOT a subsequence of t");
        }

        sc.close();
    }
}