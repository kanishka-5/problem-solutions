import java.util.*;

class Solution {
    public int scoreOfString(String s) {
        int score = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            int diff = Math.abs(s.charAt(i) - s.charAt(i + 1));
            score += diff;
        }

        return score;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        Solution sol = new Solution();
        int result = sol.scoreOfString(s);

        System.out.println("Score of the string: " + result);
    
}
}