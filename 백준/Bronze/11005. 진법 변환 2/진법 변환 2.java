// tell genie wish 11005 CH04.완전 탐색 - 시뮬레이션
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int B = sc.nextInt();
		
		last(N, B);
		
		sc.close();

	}
	public static void last(int N,  int B) {
		if (0 < N) {
			last(N / B, B);
			
			if (10 < B && 10 <= N % B)
				System.out.print((char)(N % B - 10 + 'A'));
			else
				System.out.print(N % B);
		}
	}

}
