import java.io.BufferedReader;
import java.util.*;

public class Main {
    private void solution() throws Exception {
        Scanner sc = new Scanner(System.in);
        String str[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        String input = sc.next();
        for (int i = 0; i < str.length; i++) {
            input = input.replace(str[i], " ");
        }
        System.out.println(input.length());
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}