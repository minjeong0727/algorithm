package stack_queue;

import java.util.*;

public class Boj9012 {
    //()->vps
    //vps인지 아닌지 판단 YES or NO

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(solve(sc.next()));
        }


    }
    public static String solve(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c=='('){
                stack.push(c);
            }

            else if(stack.isEmpty()){
                return "NO";
            }
            else{
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            return "YES";
        }
        else return "NO";
    }
}
