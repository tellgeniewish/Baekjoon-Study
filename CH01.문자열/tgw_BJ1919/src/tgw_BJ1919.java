// tell genie wish 1919
import java.util.Scanner;

public class tgw_BJ1919 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		int[] countStr1 = new int[26];
        int[] countStr2 = new int[26];
        
        
        for(int i=0; i<str1.length(); i++){
            countStr1[str1.charAt(i)-'a']++;
        }
       
        for(int i=0; i<str2.length(); i++){
            countStr2[str2.charAt(i)-'a']++;
        }
        
        int count = 0;
        for(int i=0; i<26 ; i++){
            int compare = countStr1[i] - countStr2[i]; 
            if(compare !=0) count += Math.abs(compare);
        }
        
        System.out.println(count);
		
		sc.close();

	}

}
