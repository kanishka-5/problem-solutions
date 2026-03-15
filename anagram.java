import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public boolean isAnagram(String s, String t) {
        int sl = s.length();
        int tl = t.length();

        if (sl != tl) {
            return false;
        }

        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        Solution obj = new Solution();
        boolean result = obj.isAnagram(s, t);

        if (result) {
            System.out.println("The strings are Anagrams.");
        } else {
            System.out.println("The strings are not Anagrams.");
        }

        sc.close();
    }
}