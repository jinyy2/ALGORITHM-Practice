package string;
import java.util.Scanner;
//https://www.acmicpc.net/problem/11654
public class No_11654 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char chr = sc.next().charAt(0); //next()로 문자열을 입력받아 첫 번째 문자열을 꺼냄 
		System.out.println((int)chr);
		sc.close();
	}
}
