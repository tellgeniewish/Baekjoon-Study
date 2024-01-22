// tell genie wish 10431 CH03.배열
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while (0 < n--) {
			int line = sc.nextInt();
			
			int[] arr = new int[20];
			for (int i = 0; i < 20; i++) {
				arr[i] = sc.nextInt();
			}
			
			int count = 0;
			for (int i = 1; i < 20; i++) {
				for (int j = i-1; j >= 0; j--) {
					if (arr[i] < arr[j])
						count++;
				}
			}
			System.out.println(line + " " + count);
		}

	}

}
