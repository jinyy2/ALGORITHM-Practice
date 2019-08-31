package string;
import java.util.Scanner;
//https://www.acmicpc.net/problem/2902
public class No_2902 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(str.charAt(0));
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='-') {
				System.out.print(str.charAt(i+1));
			}
		}
		sc.close();
	}
}
