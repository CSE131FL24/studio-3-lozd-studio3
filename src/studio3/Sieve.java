package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many prime numbers to go to");
		int n = scan.nextInt();
		boolean[] array = new boolean[n];
		
		int p = 2;
		
		for(int i=2;i<Math.sqrt(n);i++) {
			if(array[i]==false) {
				for(int j=i*i;j<n;j=j+i) {
					array[j]=true;
				}
			}
		}
		
		
		
		for(int i = 2; i<n;i++) {
			if(array[i]==true) {
				continue;
			}
			System.out.println(i);
		}
	}

}
