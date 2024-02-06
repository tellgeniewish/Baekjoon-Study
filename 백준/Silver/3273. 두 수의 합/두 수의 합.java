// tell genie wish 3273 CH03.배열
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
        Arrays.sort(arr);
		
		int x = sc.nextInt();
		
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] + arr[j] == x)
					count++;
				if (x < arr[i] + arr[j])
					break;
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}

}
