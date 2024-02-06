// tell genie wish 11068 CH04.완전 탐색 - 시뮬레이션
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int num = sc.nextInt();
			int result = 0;
			for(int j = 2; j <= 64; j++) {
				ArrayList<Character> list  = logic(num, j);
								
				//System.out.println("j=" + j + " list=" + list);
				result = reverse_test(list);
				if (result == 1) {
					break;
				}
			}
			System.out.println(result);
        }

		sc.close();

	}
	public static ArrayList<Character> logic(int N, int B) {
		ArrayList<Character> list = new ArrayList<>();
		if (0 < N) {
			list.addAll(logic(N / B, B));
						
			if (10 < B && 10 <= N % B)
				list.add((char)(N % B - 10 + 'A'));
			else
				list.add((char)(N % B + '0'));
		}
		return list;
	}
	public static int reverse_test(ArrayList<Character> list) {
		for (int i = 0; i < list.size() / 2; i++) {
			if (list.get(i) != list.get(list.size() - i - 1))
				return 0;
        }
		return 1;
	}

}
