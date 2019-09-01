package string;
import java.util.Scanner;

public class No_5586 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int JOI = 0;
		int IOI = 0;
		
		for(int i=0;i<str.length()-2;i++) {
			if(str.charAt(i)=='J') {
				if(str.charAt(i+1) == 'O' && str.charAt(i+2) == 'I') {
					JOI++;
				}
			} else if(str.charAt(i)=='I') {
				if(str.charAt(i+1) == 'O' && str.charAt(i+2) == 'I') {
					IOI++;
				}
			}
		}
		System.out.println(JOI);
		System.out.println(IOI);
		sc.close();
		
	}
}