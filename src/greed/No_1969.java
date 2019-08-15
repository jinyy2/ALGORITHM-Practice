package greed;
import java.util.Scanner;
//https://www.acmicpc.net/problem/1931
public class No_1969{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int m = sc.nextInt(); 
		int hamming_distance = 0;
		
		String[] str = new String[n]; 
		for(int i=0;i<n;i++) {
			 str[i] = sc.next();			 
		}
		
		for(int i=0;i<m;i++) {
			int[] acgt = new int[4];
			 for(int j=0;j<n;j++) {	
				
				 switch(str[j].charAt(i)) {
				 case 'A' : acgt[0]++; 
				 	break;
				 case 'C' : acgt[1]++; 
				 	break;
				 case 'G' : acgt[2]++; 
				 	break;
				 case 'T' : acgt[3]++; 
				 	break;
				 } //switch 
			 } //for j

			 int max = 0, num = 0;
			 for(int k=3;k>=0;k--) {
					if(max<=acgt[k]) {
						max = acgt[k];
						num = k;
					} // if
				} //max & num
				hamming_distance += (n - max);
				System.out.print(find_char(num));
		} //for i
		 System.out.print("\n"+hamming_distance);
		 sc.close();
	}
	
	public static char find_char(int num) {
		if(num==0) {
			return 'A';
		} else if(num==1) {
			return 'C';
		} else if(num==2) {
			return 'G';
		} else return 'T';
	}
}
