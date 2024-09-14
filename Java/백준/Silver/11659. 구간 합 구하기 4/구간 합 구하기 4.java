import java.util.Scanner;

public class Main {
    private void solution() throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] arr = new int[N];
        int[] sum = new int[N+1];
        sum[0] = 0;

        for ( int i = 0; i < N; i++ ) {
            arr[i] = sc.nextInt();
            sum[i+1] = sum[i] + arr[i];
        }
        
        for ( int i = 0; i < M; i++ ) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            System.out.println(sum[end] - sum[start-1]);
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}