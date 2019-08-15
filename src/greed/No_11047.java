package greed;
import java.util.Scanner;
//https://www.acmicpc.net/problem/11047
public class No_11047{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int K = sc.nextInt();
		int[] arr = new int[n];
		int cnt = 0;

		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
// 	use below code instead code 13 to 15 if you want to solve it without value of coins 
//		int a = 1;
//		for(int i=0;i<n;i++) {
//			if(i%2==0) {
//				arr[i] = a;
//				a *= 5;
// 			} else {
//				arr[i] = a;
//				a *= 2;
//			}
//		}
		
		for(int j=n-1;j>=0;j--) {
				cnt += K/arr[j];
				K %= arr[j];
		}
		System.out.println(cnt);
		sc.close();
	}
}
