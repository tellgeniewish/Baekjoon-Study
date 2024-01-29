// tell genie wish 1236 CH03.배열
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] triNum = new int[45];
		for(int i = 1; i < 45; i++) {
            triNum[i] = i * (i + 1) / 2;
        }

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			
			int result = 0;
			for (int j = 1; j < triNum.length; j++) {
				for (int k = 1; k < triNum.length; k++) {
					for (int m = 1; m < triNum.length; m++) {
						int sum = triNum[j] + triNum[k] + triNum[m];
						if (sum == arr[i]) {
							result = 1;
							//System.out.println("1");
							break;
						}							
					}
				}
			}
			System.out.println(result);
		}		
		
		sc.close();

	}

}
