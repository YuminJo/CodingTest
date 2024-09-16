import java.io.BufferedReader;
import java.util.*;

public class Main {
    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < n; i++) {
            q.add(Integer.parseInt(br.readLine()));
        }
        
        StringBuilder sb = new StringBuilder();
        
        while (!q.isEmpty()) {
            sb.append(q.poll()).append("\n");
        }
        
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}