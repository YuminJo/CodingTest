import java.util.Scanner;

public class Main {
    private void solution() throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        String result = input.toUpperCase();
        
        System.out.println(result);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}