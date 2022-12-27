import java.util.Scanner;

public class max_min {

	public static void main(String[] args) {
		int num = 0;
		int max = 0;
		int min = 999;
		int cnt = 0;
		// num = sc.nextInt();

		while (num != -1) {

			System.out.printf("Enter Integer : ");
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();

			if (num == -1)
				break;

			if (max < num)
				max = num;
			if (min > num)
				min = num;
			// num = sc.nextInt();
			cnt++;
		}
		if (cnt != 0) {
			System.out.printf("Smallest Integer is : %d\n", min);
			System.out.printf("Largest Integer is: %d\n", max);
		}
	}

}
