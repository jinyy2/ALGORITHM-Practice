package greed;
import java.util.Scanner;
//https://www.acmicpc.net/problem/11399
public class No_11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int temp;
		
		int[] arr = new int[num];
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}
		for(int j=0;j<num;j++) {
			for(int k=0;k<num-1-j;k++)
				if(arr[k]>arr[k+1]) {
					temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
			}
		}	
		for(int x=0;x<num;x++) {
			sum += arr[x]*(num-x);
		}
		System.out.println(sum);
	}
}
