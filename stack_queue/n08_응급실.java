package ch05.Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class n08_응급실 {
    public int solution(int n, int m, String arr) {
        Queue<Integer> q = new LinkedList<Integer>();
        int p = 0;
        for (char c : arr.toCharArray()) q.offer(c - 48);

        /*
        while (p != m) {
            int temp = q.poll();
            for (int t : q) {
                if(temp<t){
                    q.offer(t);
                    break;
                }
            }

        }*/


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String arr = sc.next();

        n08_응급실 t = new n08_응급실();
        System.out.println(t.solution(n,m,arr));
    }
}
