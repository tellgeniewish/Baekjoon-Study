// tell genie wish 1543 CH01.문자열
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        int str1_len = str1.length();
        
		str1 = str1.replace(str2, "");
		System.out.println((str1_len - str1.length()) / str2.length());
		
		
		sc.close();

	}

}
