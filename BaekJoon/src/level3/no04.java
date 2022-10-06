package level3;

import java.util.Scanner;

public class no04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int total = in.nextInt();
		int n = in.nextInt();
		int sum = 0;
		for(int i = 0; i < n;i++) {
			int price = in.nextInt();
			int cnt = in.nextInt();
			sum += price*cnt;
		}
		in.close();
		
		if(total==sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
