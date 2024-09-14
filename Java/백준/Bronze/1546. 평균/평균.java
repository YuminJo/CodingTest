import java.util.Scanner;

public class Main {
	private void solution() throws Exception {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner in = new Scanner(System.in);

		int value = in.nextInt();
		int sum = 0;
		int max = 0;
		for (int i = 0; i < value; i++) {
			int num = in.nextInt();
			sum += num;
			if (max < num)
				max = num;
		}

		System.out.print((double)sum / max * 100 / value);
	}

	public static void main(String[] args) throws Exception {
		new Main().solution();
	}
}