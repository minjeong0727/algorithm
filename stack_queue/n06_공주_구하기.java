package ch05.Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class n06_공주_구하기 {
    public int solution(int n, int k) {
        Queue<Integer> q = new LinkedList<Integer>();
        int p = 0;
        //queue에 n까지의 자연수를 추가
        for (int i = 1; i <= n; i++) q.offer(i);
        //queue의 size가 1일 때까지
        while (q.size() != 1) {
            int t=q.poll();
            p++;
            if (p == k) {
                p = 0;
            }else q.offer(t);
        }
        return q.poll();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        n06_공주_구하기 t = new n06_공주_구하기();
        System.out.println(t.solution(n, k));
    }
}
