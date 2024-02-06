// tell genie wish 10250 CH04.완전 탐색 - 시뮬레이션
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int Y, X;
		for (int i = 0; i < T; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			if (N % H == 0) {
				Y = H;
				X = N / H;
			}
			else {
				Y = N % H;
				X = N / H + 1;
			}
			System.out.print(Y);
			if (X < 10)
				System.out.println("0" + X);
			else
				System.out.println(X);
			
			//search_room(H, W, N);
		}
		
		sc.close();

	}
	public static void search_room(int H, int W, int N) {
		int room_h = N % H;
		System.out.print(room_h);
		
		int room_w = W % N;
			
		if (H < room_w) {
			if (N % H == 0)
				room_w = N / H;
			else
				room_w = N / H + 1;
		}

		if (room_w < 10)
			System.out.println("0" + room_w);
		else
			System.out.println(room_w);
	}

}
