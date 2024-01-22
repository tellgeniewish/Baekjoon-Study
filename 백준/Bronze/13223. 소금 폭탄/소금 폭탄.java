// tell genie wish 13223 CH01.문자열
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String now_time = sc.nextLine();
		String salt_input_time = sc.nextLine();
		
		if(now_time.equals(salt_input_time))
			System.out.println("24:00:00");
		else {
			String[] now = now_time.split(":");
			String[] input = salt_input_time.split(":");
			
			int now_hh = Integer.parseInt(now[0]);
			int input_hh = Integer.parseInt(input[0]);
			int now_mm = Integer.parseInt(now[1]);
			int input_mm = Integer.parseInt(input[1]);
			int now_ss = Integer.parseInt(now[2]);
			int input_ss = Integer.parseInt(input[2]);
			
			int sec;
			if (now_ss <= input_ss)
				sec = input_ss - now_ss;
			else {
				sec = (60 - now_ss) + input_ss;
				now_mm++;
			}
			
			int min;
			if (now_mm <= input_mm)
				min = input_mm - now_mm;
			else {
				min = (60 - now_mm) + input_mm;
				now_hh++;
			}
			
			int hour;
			if (now_hh <= input_hh)
				hour = input_hh - now_hh;
			else {
				hour = (24 - now_hh) + input_hh;
			}
			
			if (0 < hour / 10)
				System.out.print(hour);
			else
				System.out.print("0" + hour);
			
			System.out.print(":");
			
			if (0 < min / 10)
				System.out.print(min);
			else
				System.out.print("0" + min);
				
			System.out.print(":");
			
			if (0 < sec / 10)
				System.out.print(sec);
			else
				System.out.print("0" + sec);
		
		//System.out.println(hour + ":" + min + ":" + sec);
		}
		sc.close();		

	}

}
