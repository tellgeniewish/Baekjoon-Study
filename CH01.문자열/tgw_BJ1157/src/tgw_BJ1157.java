// tell genie wish 1157
import java.util.Scanner;

public class tgw_BJ1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		str = str.toUpperCase();
		
		int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) -'A' ;
            count[num]++;
        }

        int max = 0;
        char answer = '?';
        for (int i = 0; i < count.length; i++) {
            if(max < count[i]){
                max = count[i];
                answer = (char)(i+'A');
            } else if (max == count[i]){
                answer = '?';
            }
        }
        System.out.println(answer);
		/*
		int[] same = new int[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
		    char ch1 = str.charAt(i);
		    for (int j = 0; j < str.length(); j++) {
		        char ch2 = str.charAt(j);
		        if (ch1 == ch2)
		            same[i]++;
		    }
		    System.out.print(same[i]);
		}
		
		int maxCount = 0;
		for (int i = 0; i < str.length(); i++) {
		    maxCount = Math.max(maxCount, same[i]);
		}
		System.out.println("\nmax=" + maxCount);
		
		int index = 0;
		char[] store = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
		    if (same[i] == maxCount) {
		        store[index++] = str.charAt(i);
		    }
		}
		for (int i = 0; i < store.length; i++) {
			System.out.print(store[i]);
		}
		System.out.println("\nindex=" + index);
		
		int[] diff_count = new int[index];
		//int sameCount = 0;
		for (int i = 0; i < index; i++) {
		    for (int j = 0; j < index; j++) {
		        if (i != j && store[i] != store[j]) {
		        	diff_count[i]++;
		            break;
		        }
		    }
		    //System.out.print(diff_count[i]);
		}
		
		int i = 0;
		for (; i < diff_count.length; i++) {
			if (diff_count[i] != 0) {
				System.out.println("?");
				break;
			}
		}
		if (i == diff_count.length) {
			for (i = 0; i < same.length; i++) {
				if (same[i] == maxCount) {
					System.out.println(str.charAt(i));
					break;
				}
			}
		}
		*/
		sc.close();

	}

}
