package algorithm.changhee.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon2841 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Arrays> dq = new LinkedList<>();

        //해결법 -> 앞의수와 뒤의수를 연관지어서 앞의 수 비교 후 뒤의 수 비교 해서 dq의 앞과 뒤를 정해서 넣는다.?
//        int[] arr = new int[];
        int num = Integer.parseInt(st.nextToken());
        st.nextToken();
        int chk = 0;
        for(int i = 0; i < num ; i ++){
            String[] s = br.readLine().split(" ");
            if(dq.isEmpty()){


            }
        }
    }
}

