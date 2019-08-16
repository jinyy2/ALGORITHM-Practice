package greed;
import java.util.Scanner;
import java.util.ArrayList;
public class No_1138 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=n-1;i>=0;i--) {
			list.add(arr[i],i+1);
		}

		for(int k : list) {
		    System.out.print(k+" ");
		}	
		sc.close();
	}
}